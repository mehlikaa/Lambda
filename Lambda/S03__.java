package HB_20Soru;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class S03__ {
    //String isimlerden olusan bir list olusturun
    //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
//Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
//Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
//Konsoldaki farklı öğeleri ters sırada yazdırın.
//Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lutfullah");
        list.add("Emine");
        list.add("Emine");
        list.add("Yusuf");
        list.add("Seyfullah");
        list.add("Hakan");
        list.add("Mehlika");
        list.add("Hakan");
        
        System.out.println("1- Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.");
        list.stream().sorted().distinct().forEach(t->System.out.println(t+" = "+t.length()+ " karakterli"));   // me 
        //list.stream().distinct().sorted().forEach(t -> System.out.print(t + "="+t.length()+" "));
        System.out.println(" \n2- Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.");
       
        list.stream().distinct().sorted(Comparator.comparing(t->t.toString().length())).forEach(t->System.out.println(t+" "));
        System.out.println(" \n");
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t+" "));
        
        //list.stream().distinct().sorted(Comparator.comparing(t->t.length())).forEach(t -> System.out.println(t));
        System.out.println("\n3- Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.");
        list.stream().distinct().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1))).forEach(t->System.out.println(t+"  "));;    
        //me
        //list.stream().distinct().sorted(Comparator.comparing(t ->t.charAt(t.length()-1))).forEach(t -> System.out.println(t));
        System.out.println("\n4- Konsoldaki farklı öğeleri ters sırada yazdırın.");
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t+" "));
        //list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t+" "));
      
        System.out.println("\n5- Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın." );
      
        list.stream().filter(t->t.length()<7).distinct().sorted(Comparator.reverseOrder()).map(t->t.toUpperCase()).forEach(t-> System.out.println(t+" "));
        //list.stream().filter(t->t.length()<7).distinct().sorted(Comparator.reverseOrder()).map(t ->t.toUpperCase()).forEach(System.out::print);


    }

}