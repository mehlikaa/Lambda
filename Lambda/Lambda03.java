package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList("mehmet", "emre", "nilgunx", "yıldız", "kader", "emine", "islam", "islam", "emre","wAbuziddin"));
		
		System.out.println("--buyukHarfTekrarsizSira");
		buyukHarfTekrarsizSira(list);
		System.out.println("\n--printKarakterSayisiTekrarsizTersSirali");
		printKarakterSayisiTekrarsizTersSirali(list);
		System.out.println("\n--karakterSayisiSiraliEl");
		karakterSayisiSiraliEl(list);
		System.out.println("\n--sonHarfTersSirali");
		sonHarfTersSirali(list);
		
		System.out.println("\nharfSayisi7Kontrol");
		harfSayisi7Kontrol(list);
		
		System.out.println("\nwIleBaslama");
		wIleBaslama(list);
		System.out.println("\nxIleBitme ");
		xIleBitme(list);
		System.out.println("\nkarakterSayisiEnBuyuk");
		karakterSayisiEnBuyuk(list);
		
		

	}

	public static void printEl(String t) {
		System.out.println(t + " ");
	}

	// List elemanlarini alafabetik buyuk harf ve tekrarsiz yazdiriniz
	public static void buyukHarfTekrarsizSira(List<String> list) {
		list.stream().
		// map(t->t.toUpperCase()).
				map(String::toUpperCase).sorted(). // natural sira ile al order et
				distinct(). // akistan tekrarsiz al   trick onemli
				forEach(t -> System.out.print(t + " ")); // EMINE EMRE ISLAM KADER MEHMET NILGUN YILDIZ

	}
	//list elelmanlarinin character sayisini ters sirali olarak tekrarsiz yazdiriniz
	public static void printKarakterSayisiTekrarsizTersSirali(List<String> list) {
		list.
		stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::printEl);
	}
	
	public static void karakterSayisiSiraliEl(List<String> list) {
		list.stream().sorted(Comparator.comparing(t->t.toString().length())).forEach(t->System.out.print(t+ " "));
		
	}

//list elelmanlarinin son harfine gore ters sirali yazdiriniz
	public static void sonHarfTersSirali(List<String> list) {
		list.
		stream().
		sorted(Comparator.comparing(t->t.toString().
				charAt(t.toString().length()-1)).reversed()).
					forEach(t->System.out.print(t+" " ));
	} //yıldız mehmet kader nilgun islam islam emre emine emre 
	
	//Cift sayili elemanlarin karelerini hesaplayan, tekrarli olanlari sadece bir kere buyukten kucuge dogru
	//yazdiran bir program yaziniz.
	public static void ciftKareTekrarsizSira(List<String> list) {
		list.stream().map(t->t.length()*t.length()).filter(Lambda01::ciftBul).distinct().sorted(Comparator.reverseOrder()).forEach(Lambda01::printEl);
	}
	//List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz
	public static void harfSayisi7Kontrol(List<String> list) {
		
		System.out.println(list.
				stream().
				allMatch(t->t.length()<=7)? "Butun List elemanlari 7 elamandan kucuk":"Agam list 7 harften buyuk var. ");	  //7'ye seit kucuk eslestirme
				}
	
	//List elelmanlarinin "W" ile baslamasını kontrol ediniz
	public static void wIleBaslama(List<String> list) {
		System.out.println(list.stream().noneMatch(t-> t.startsWith("w")) ? "w ile baslayan isim kimse ayaga kalksin":"w ile baslayan isim mi olur");

	
	}
	public static void xIleBitme(List<String> list) {
		System.out.println(list.stream().anyMatch(t-> t.endsWith("x")) ?( "x ile biten isim kimse ayaga kalksin"):("x ile biten isim mi olur"));	
	}
	//Karakter sayisi en buyuk elemani yazdiriniz
	public static void karakterSayisiEnBuyuk(List<String> list) {
		System.out.println(list.
				stream().
				sorted(Comparator.comparing(t->t.toString().length()).reversed()).
				findFirst());
	}
	
}
