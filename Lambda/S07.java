
package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class S07 {
    //String isimlerden olusan bir list olusturnuz
    // OK ==> List'deki isimlerden "a" ve "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
    			// List'deki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdirin
	public static void main(String[] args) {
	
		List <String> list=new ArrayList(Arrays.asList("Ali","Veli","Zeynep","Aladdin","Abuziddin","Nil","Nilufer"));
		
		System.out.println("a ve n karakterlerinin bulunmasi");
		Integer toplam = list.stream().map(t->t.toLowerCase()).filter(t->t.contains("a")&t.contains("n")).map(t->t.length()).reduce(0,(t,u)->(t+u));
		list.stream().map(t->t.toLowerCase()).filter(t->t.contains("a")&t.contains("n")).forEach(t->System.out.print(t+" "));
		System.out.println(" ");
		list.stream().map(t->t.toLowerCase()).filter(t->t.contains("a")&t.contains("n")).map(t->t.length()).forEach(t->System.out.print(t+" "));
		System.out.println("\nKarakter sayilari toplami : "+toplam);
		
		System.out.println("\ni ve n karakterlerinin bulunmasi");
		list.stream().map(t->t.toLowerCase()).filter(t->t.contains("i")&t.contains("n")).forEach(t->System.out.print(t+" "));
		System.out.println(" ");
		list.stream().map(t->t.toLowerCase()).filter(t->t.contains("i")&t.contains("n")).map(t->t.length()).forEach(t->System.out.print(t+" "));
		Integer toplam2 = list.stream().map(t->t.toLowerCase()).filter(t->t.contains("i")&t.contains("n")).map(t->t.length()).reduce(0,(t,u)->(t+u));
		System.out.println("\nKarakter sayilari toplami : "+toplam2);
	
	
}
}