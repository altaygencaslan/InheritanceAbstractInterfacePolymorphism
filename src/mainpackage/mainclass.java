package mainpackage;

import inheritancepackage.*;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Kalýtým'da tüm alt sýnýflar üst sýnýflarýn parametrelerine ve metodlarýna 
		//eðer izin verilmiþse (private deðillerse) ulaþabilirler.
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
		//papatyaclass.KimsinSen = "Lale"; //Final ile iþaretlendiðinden deðiþtirilemez
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
		KirmiziGülClass kirmizigul = new KirmiziGülClass();
		kirmizigul.KimsinSen();
		
		CanliClass canli1 = kirmizigul;
		canli1.KimsinSen();
		
		KirmiziGülClass kirmizigul2 = (KirmiziGülClass)canli1;
		kirmizigul2.KimsinSen();
		
		CanliClass canli2 = (CanliClass) new SariGülClass();
		canli2.KimsinSen();
		*/
	}

}
