package HB_20Soru;


	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	public class S02 {
//	        2) Bir class oluşturun, 'Q03' olarak adlandırın
//	        3) 5 elemanlı bir tamsayı listesi oluşturun
//	        4) Elemanlari doğal sıraya koyun
//	        5) Konsoldaki son 3 elemanın karelerinin toplamını bulun.
//	        6) Konsoldaki toplamı yazdırın
//	        7) 'Fonksiyonel Programlama' kullanın
	public static void main(String[] args) {
	    List<Integer> list = new ArrayList<Integer>();
	    List <Integer> mylist=new ArrayList(Arrays.asList(1,7,3,4,5));
	    list.add(1);
	    list.add(7);
	    list.add(3);
	    list.add(4);
	    list.add(5);
	    System.out.println(list);
	    mylist.stream().sorted().forEach(t->System.out.print(t+" "));
	    int m=list.stream().
	    	sorted().
	    		filter(t->list.indexOf(t)>1).
	    			map(t->t*t).
	    				reduce(0,(x,y)->x+y);
	    System.out.println(" \n"+m);
	    System.out.println(" \n" +list.stream().
	            sorted().
	            filter(t -> list.indexOf(t) > 1).
	            map(t -> t * t).
	            reduce(0, (x, y) -> x + y));


	}



	}