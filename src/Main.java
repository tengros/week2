import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double totalSum, sum1, sum2, totalLetters;
        char choice;
        do {
            System.out.println("Vad vill du göra?");
            System.out.println("1. Addera två tal");
            System.out.println("2. Räkna bokstäver i en sträng");
            System.out.println("3. Spegelvänd en sträng");
            System.out.println("4. Summera alla tal i en sträng");
            System.out.println("Skriv 'e' för att avsluta");
            choice = sc.nextLine().charAt(0);


            switch (choice) {
                case '1': {
                    System.out.println("Här adderar vi tal");
                    System.out.print("Skriv in första talet: ");
                    sum1 = sc.nextDouble();
                    System.out.print("Skriv in andra talet: ");
                    sum2 = sc.nextDouble();
                    totalSum = totalSumma(sum1, sum2);
                    System.out.println("Det blir: " + totalSum);
                    sc.nextLine();
                    break;
                }
                case '2': {
                    System.out.print("Ange ordet du vill leta i: ");
                    String sentence = sc.nextLine();
                    System.out.print("Ange bokstaven du vill leta efter: ");
                    String word = sc.nextLine();

                    int count = stringCounter(word, sentence);

                    System.out.println("Bokstaven '" + word + "' förekommer " + count + " gånger i ordet: " + sentence);
                    break;
                }
                case '3': {
                    System.out.print("Skriv in texten du vill spegelvända: ");
                    String input = sc.nextLine();
                    reverseString(input);
                    break;
                }

                case '4': {

                }
            }

        } while (choice != 'e');
    }

    static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input).reverse();
        String reversedString = reversed.toString();
        System.out.println(reversedString);
        return reversedString;
    }

    static double totalSumma(double summa1, double summa2) {
        double sum = summa1 + summa2;
        return sum;

    }

    public static int stringCounter(String wordLook, String sentenceLook) {

        wordLook = wordLook.toLowerCase();
        sentenceLook = sentenceLook.toLowerCase();

        Pattern pattern = Pattern.compile(wordLook);
        Matcher matcher = pattern.matcher(sentenceLook);

        int count = 0;
        while (matcher.find())
            count++;

        return count;
    }


}
