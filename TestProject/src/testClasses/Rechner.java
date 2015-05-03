package testClasses;

public class Rechner {

	private TestInterface rechenmethode;

	public Rechner(){
		
	}
	
	public Rechner(TestInterface rechenmethode) {
		super();
		this.rechenmethode = rechenmethode;
	}
	
	public int rechnen(int zahl1, int zahl2)
	{
		return rechenmethode.addieren(zahl1, zahl2);
	}

	public TestInterface getRechenmethode() {
		return rechenmethode;
	}

	public void setRechenmethode(TestInterface rechenmethode) {
		this.rechenmethode = rechenmethode;
	}
	
}
