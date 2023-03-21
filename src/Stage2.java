import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("The result:");
        for(int i = 0; i < input.length(); i++){
            //System.out.println( input.charAt(i) + " " + "=" + " " + Integer.toBinaryString(input.charAt(i)));
            int Binary = Integer.parseInt(Integer.toBinaryString(input.charAt(i)));
            String padding = String.format("%7s", Binary).replace(' ', '0');
            System.out.println(input.charAt(i) + " " + "=" + " " + padding);
        }

    }
}
