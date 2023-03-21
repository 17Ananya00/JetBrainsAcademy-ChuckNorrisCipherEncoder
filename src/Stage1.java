import java.util.Scanner;

public class Stage1 {

    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i) + " ");
        }

    }
}
