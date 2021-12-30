package Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lambda06 {

	public static void main(String[] args) throws IOException {
		System.out.println("\n Haluk.txt : ");
		//Files.lines(Paths.get("src/Lambda/haluk.txt")).forEach(System.out::print);
		//Files.lines(Paths.get("src/Lambda/haluk.txt")).map(String::toUpperCase).forEach(System.out::print);

		System.out.println("\n Haluk.txt : ");
		Files.
        lines(Paths.get("src/Lambda/haluk.txt")).//file erisip  file satirlari akis alindi
        map(String::toUpperCase).//akısdaki satirlarin byk hrf ile update edildi
        forEach(System.out::println);
	}

}
