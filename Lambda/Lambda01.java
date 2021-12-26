package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
1) Lambda "Functional Programming"
   "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
ve hatasiz code yazma acilarindan cok faydalidir.
4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak 
map'lerde kullanılmaz.
  
   ==>  Lambda kullanmak hatasız code kullanmaktır. functional programming
   temizlik robotu,ne yapacagini soyluyorsunuz. calistirip birakiyorsunuz, nasil yapacaginimkendisi bliyor.
*/
public class Lambda01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
		printElStructured(list); // metod call
		System.out.println("\n  ***  ");
		printElFunctional(list);
		System.out.println("\n  ***  ");
		printElFunctional1(list);
		System.out.println("\n  ***  ");
		printCiftElStructured(list);
		System.out.println("\n  ***  ");
		printCiftElFunctional1(list);
		System.out.println("\n  ***  ");
		printCiftAltmisKucuk(list);
		System.out.println("\n  ***  ");
		TekYirmiBuyukPrint(list);
		System.out.println("\n  ***  ");
		printCiftKare(list);
		System.out.println("\n  ***  ");
		printTekKuplerininBirFazla(list);
		System.out.println("\n  ***  ");
		kareKokCiftFunctional(list);
		System.out.println("\n  ***  ");
		maxElFunctional(list);

	}

	// structured Programming ile list elemanlerinin tamamini aralarina bosluk
	// birakarak yazdiriniz
	public static void printElStructured(List<Integer> list) {

		for (Integer w : list) {
			System.out.print(w + " ");
		}
	}
	// Functional Programming ile list elemanlerinin tamamini aralarina bosluk
	// birakarak yazdiriniz
	
	public static void printElFunctional(List<Integer>list) {
		//list yatay yapi, stream selale dikey yapi. Islem yapacaginiz formata dondurur.Stream metodu ile calis 
		// ey list objesi stream ol selale gibi,datalari yukaridan asagiya akis sekline getirir.
		// foreach datanin parametresine gore her bir elemanini isler.
		//java convention olarak burada da t kullanilir.
		// t-> : Lambda operatoru
		//LAmbda expresision yapisi  tavsiye edilmez. daha cok Method Reference kullanilir
		
		list.stream().forEach(t->System.out.print(t+" "));    //lambda expression ifadesi
	}
	//Method Reference -->kendi create ettigimiz yada javadan aldigimiz method ile 
	// ClassName::MethodName
	
	public static void printEl(int t) {	//refere edilecek method create edildi
		System.out.print(t+" ");
		
	}
	public static void printElFunctional1(List<Integer> list) {
		list.stream().forEach(Lambda01::printEl);					//git metodu calistir
	}	//stream>>dikey yap-forEach>>herbir elemana uygula					//tekrarli metodunuz var dyelim 
	
	
	//structured Programming ile list elemanlerinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printCiftElStructured(List<Integer> list) {
		for(Integer w:list) {
			if(w%2==0) {
				System.out.print(w+" ");
			}
		}
	}
	public static void printCiftElFunctional1(List<Integer> list) {
		list.stream().filter(t->t%2==0).forEach(Lambda01::printEl);
		System.out.println("\n  ***  ");
		list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);   //ciftBul metodu ile
		//filter() : filtreleme bir akis icerisinde verilen elemanlari bir 
	}
	
	public static boolean ciftBul(int i) {	//refere edilecek tohum metod create edildi.
		return i%2==0;
	}
	
	//Functional Programming ile list elemanlarinin  cift olanalrinin 60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printCiftAltmisKucuk(List<Integer>list) {
		list.stream().filter(t->t%2==0  &  t<60).forEach(Lambda01::printEl);
	}
	 //Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
    // olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz
	
	public static void TekYirmiBuyukPrint(List<Integer>list) {
		list.stream().filter(t->t%2==1  ||  t>20).forEach(Lambda01::printEl);
	}
	//Functional Programming ile list elemanlarinin  cift olanlarinin
	// karelerini ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printCiftKare(List<Integer> list) {
		list.stream().filter(Lambda01::ciftBul).map(t->t*t).forEach(Lambda01::printEl);
	}//map akistaki elemanlarin uygulamanin sonuclarini degistirir.
	public static void printCiftKare1(List<Integer> list) {
		//list.stream().filter(Lambda01::ciftBul).map(Math::pow)
		//list.stream().filter(Lambda01::ciftBul).map(String::toLowerCase
	}
	public static void printTekKuplerininBirFazla(List<Integer> list) {
		list.stream().filter(t->t%2==1).map(t->(t*t*t)+1).forEach(Lambda01::printEl);
		
		//list.stream().filter(t->t%2==1).forEach(Lambda01::KupYap); neden calismadi
	}
	public static int KupYap(int t) {	//refere edilecek tohum metod create edildi.
		return ((t*t*t)+1);
	}
	
	public static void kareKokCiftFunctional(List<Integer> list) {
		list.stream().
						filter(Lambda01::ciftBul).
						map(Math::sqrt).
						forEach(t->System.out.println(t+"   "));
		}
	//listin en buyuk siralamasini yazdiriniz.
	
	public static void maxElFunctional(List<Integer> list) {
		
		Optional<Integer> maxEl = list.stream().reduce(Math::max);
			// cok elemani huni mantigi sonucta 1 eleman alacaksiniz
		System.out.println(maxEl);
}
}
