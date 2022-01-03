package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S04__ {
    //    3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren bir Dize listesi oluşturun
//        4) "J" ile baslayin olan öğeleri almayın
//        5) Farklı öğeleri seçin
//        6)Karakter sayısına göre doğal sıraya koyun
//        7) Tüm öğeleri büyük harfe dönüştürün
//        8) Konsoldaki öğeleri yazdırın
//        9)Fonksiyonel Programlama'yı kullanın
//        */

public static void main(String[] args) {
	List <String> list=new ArrayList(Arrays.asList("Ali","Ali", "John", "Ali", "Alexander","Alexander", "Taylor","Taylor", "Ali", "Jackson"));
	System.out.println(" 4- \"J\" ile baslayin olan öğeleri almayın ; Peki nasil ??? ");
	// -----
	
		list.stream().filter(t->t.startsWith("J")).forEach(t-> System.out.print(t+" "));
	
	System.out.println("\n\t5) Farklı öğeleri seçin \n\t6)Karakter sayısına göre doğal sıraya koyun"
			+ "\n\t7) Tüm öğeleri büyük harfe dönüştürün");
	System.out.println("\t8) Konsoldaki öğeleri yazdırın \n\t9)Fonksiyonel Programlama'yı kullanın");
	
	list.stream().sorted().distinct().map(t->t.toUpperCase()).forEach(t->System.out.print(t+" "));
	
	
}
public static String buyukYaz(String t) {
	return t.toUpperCase();
}
}