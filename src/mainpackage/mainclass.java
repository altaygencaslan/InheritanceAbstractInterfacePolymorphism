package mainpackage;

import inheritancepackage.*;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kal�t�m'da t�m alt s�n�flar �st s�n�flar�n parametrelerine ve metodlar�na 
		//e�er izin verilmi�se (private de�illerse) ula�abilirler.
		/*
		System.out.println("CanliClass:");
		CanliClass canliclass = new CanliClass();
		canliclass.Beslen();
		System.out.println("-----------");
		
		System.out.println("BitkiClass:");
		BitkiClass bitkiclass = new BitkiClass();
		bitkiclass.Beslen();
		bitkiclass.Fotosentez();
		System.out.println("-----------");
		
		System.out.println("PapatyaClass:");
		PapatyaClass papatyaclass = new PapatyaClass();
		papatyaclass.Beslen();
		papatyaclass.Fotosentez();
		papatyaclass.Kokla();
		System.out.println(papatyaclass.toString());
		//papatyaclass.KimsinSen = "Lale"; //Final ile i�aretlendi�inden de�i�tirilemez
		System.out.println(papatyaclass.KimsinSen);
		System.out.println("-----------");		
		
		System.out.println("LaleClass:");
		LaleClass laleclass = new LaleClass();
		laleclass.Beslen();
		laleclass.Fotosentez();
		laleclass.Uza();
		System.out.println("-----------");
		*/
		
		//Upcasting / Downcasting
		/*
		KirmiziG�lClass kirmizigul = new KirmiziG�lClass();
		kirmizigul.KimsinSen();
		
		CanliClass canli1 = kirmizigul;
		canli1.KimsinSen();
		
		KirmiziG�lClass kirmizigul2 = (KirmiziG�lClass)canli1;
		kirmizigul2.KimsinSen();
		
		CanliClass canli2 = (CanliClass) new SariG�lClass();
		canli2.KimsinSen();
		*/
	}

}
