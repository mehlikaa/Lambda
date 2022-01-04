package Practice;
import java.util.stream.IntStream;
public class S08 {
   
	// 7 ile bolunebilen ilk 10 tamsayinin toplamini ekrana yazdiriniz.
	
	public static void main(String[] args) {
	int x=10;
		System.out.println(IntStream.range(1,x+1).sum());			//x dahil deil
		System.out.println(" ");
		System.out.println(IntStream.rangeClosed(1, x).sum());		//x dahil
		
		IntStream.
			iterate(7,t->t+7).
				limit(10).
				forEach(t->System.out.print(t+" "));
		
		System.out.println(" \n"+IntStream.iterate(7,t->t+7).limit(10).sum());
		
	}
}