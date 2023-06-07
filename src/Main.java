import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text!");
        String string = scanner.nextLine();
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(string.length() - 1));
    }


    }

/*

        String zmina = new String("Text for changes");
        System.out.println(zmina.toLowerCase());
        System.out.println(zmina.toUpperCase());
        System.out.println(zmina.substring(0, 1));
        System.out.println(zmina.charAt(zmina.length() - 1));


    }
}
*/