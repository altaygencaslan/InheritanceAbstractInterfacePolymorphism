package inheritancepackage;

public final class LaleClass extends BitkiClass {

	public LaleClass() {		
		System.out.println("LaleClass Const.");
	}
	
	public String LaleTuru;
	
	public void Uza()
	{
		System.out.println("Lalenin boyu uzar");
	}
	
	//CanliClass'ta bu metod final olarak i�aretlendi�inden
	//Kal�t�m verdi�i hi�bir yerde override edilemez
	/*
	public void Buyu()
	{
		System.out.println("Canl� B�y�r");
	}
	*/
}
