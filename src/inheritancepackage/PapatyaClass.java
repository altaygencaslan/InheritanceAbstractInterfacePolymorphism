package inheritancepackage;

public class PapatyaClass extends BitkiClass {
	
	public PapatyaClass() {		
		System.out.println("PapatyaClass Const.");
	}
	
	public String EvVeyaBahceTipi;
	public final String KimsinSen = "Papatyayým aslaným ne olacak?"; 
	
	public void Kokla()
	{
		System.out.println("Papatya kokar mý kokmaz mý?");
	}
	
	//Metod Override from CanliClass
	public void Beslen() {
		// TODO Auto-generated method stub
		System.out.println("Canlý Bitki Beslenir");
	}
	
	//Metod Override	
	@Override
	public void Fotosentez() {
		// TODO Auto-generated method stub
	
		super.Fotosentez();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PapatyaBitkiCanlýsý.toString() metodu";
	}
}
