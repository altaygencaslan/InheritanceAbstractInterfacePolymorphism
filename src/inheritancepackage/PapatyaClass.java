package inheritancepackage;

public class PapatyaClass extends BitkiClass {
	
	public PapatyaClass() {		
		System.out.println("PapatyaClass Const.");
	}
	
	public String EvVeyaBahceTipi;
	public final String KimsinSen = "Papatyay�m aslan�m ne olacak?"; 
	
	public void Kokla()
	{
		System.out.println("Papatya kokar m� kokmaz m�?");
	}
	
	//Metod Override from CanliClass
	public void Beslen() {
		// TODO Auto-generated method stub
		System.out.println("Canl� Bitki Beslenir");
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
		return "PapatyaBitkiCanl�s�.toString() metodu";
	}
}
