package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import testClasses.Rechner;
import testClasses.TestInterface;

public class TestRechner {

	@Mock
	TestInterface rechenmethode;
	
	@InjectMocks
	private Rechner rechner;
	
	@Before
	public void setUp() throws Exception {
		rechner = new Rechner();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		Mockito.when(rechner.rechnen(1, 2)).thenReturn(1 + 2);
		
		int result = rechner.rechnen(1, 2);
						
		assertEquals(3, result);
		
		//Verhaltensorientiertes Testen
		Mockito.verify(rechner).rechnen(1, 2);
	}

}
