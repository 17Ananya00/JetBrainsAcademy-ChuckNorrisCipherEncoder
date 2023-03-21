import java.util.Scanner;

public class Stage3 {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.printf("The result:\n%s\n\n", convertToCNUCode(convertToBinaryString(input)));

    }


    private static String convertToCNUCode(String binaryString) {

        StringBuilder sb = new StringBuilder();

        int sameCharsInARow = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            sameCharsInARow++;

            if (i + 1 < binaryString.length() && binaryString.charAt(i + 1) != binaryString.charAt(i)
                    || i + 1 == binaryString.length()) {
                String oneZero = binaryString.charAt(i) == '1' ? "0 " : "00 ";
                sb.append(oneZero);

                sb.append("0".repeat(Math.max(0, sameCharsInARow)));

                sb.append(' ');
                sameCharsInARow = 0;
            }
        }

        return sb.toString().trim();
    }



    private static String convertToBinaryString(String input) {
        StringBuilder sb = new StringBuilder();

        char[] chars = input.toCharArray();
        for (char ch : chars) {
            sb.append(
                    String.format("%7s", Integer.toBinaryString(ch)).replaceAll(" ", "0")
            );
        }

        return sb.toString();
    }

}
