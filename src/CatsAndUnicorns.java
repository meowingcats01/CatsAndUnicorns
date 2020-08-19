import java.util.Scanner;
public class CatsAndUnicorns {
    public static Scanner userInput = new Scanner(System.in);
    public static String catOrUnicorn;
    public static int whatItemSelected;
    public static boolean errorOccurred = false;
    static Cat myCat = new Cat();
    static Unicorn myUnicorn = new Unicorn();

    public static void getCatOrUnicorn() {
        System.out.println("Please enter either the word \"cat\" or the word \"unicorn\". ");
        /*
        Using \" or \' allows me to insert a double or single quotation
        mark, respectively, into a string. This is called "escaping" text.
         */
        catOrUnicorn = userInput.next();
    }

    public static void getWhatItemSelected() {
        if (catOrUnicorn.equalsIgnoreCase("cat")) {
            System.out.println("Please enter the number 1 (happy cat), 2 (annoyed cat), 3 (hungry cat), or 4 (mad cat).");
            try {
                whatItemSelected = userInput.nextInt();
            } catch (Exception e) {
                errorOccurred = true;
            }
            if (whatItemSelected == 1) {
                myCat.happyNoise();
            }
            else if (whatItemSelected == 2) {
                myCat.annoyedNoise();
            }
            else if (whatItemSelected == 3) {
                myCat.hungryNoise();
            }
            else if (whatItemSelected == 4) {
                myCat.madNoise();
            } else {
                errorOccurred = true;
            }
        } else if (catOrUnicorn.equalsIgnoreCase("unicorn")) {
            System.out.println("Please enter the number 1 (talking unicorn), 2 (unicorn attack), 3 (unicorn defense), or 4 (healing unicorn).");
            try {
                whatItemSelected = userInput.nextInt();
            } catch (Exception e) {
                errorOccurred = true;
            }
            if (whatItemSelected == 1) {
                myUnicorn.talk();
            }
            else if (whatItemSelected == 2) {
                myUnicorn.useAttackMagic();
            }
            else if (whatItemSelected == 3) {
                myUnicorn.useDefenseMagic();
            }
            else if (whatItemSelected == 4) {
                myUnicorn.useHealingMagic();
            } else {
                errorOccurred = true;
            }
        } else {
            errorOccurred = true;
        }

    }

    public static void main(String[] args) {
        getCatOrUnicorn();
        getWhatItemSelected();
        if (errorOccurred != false) {
            System.out.println("Sorry, but an error occurred.");
            System.out.println("Did you enter \"cat\" or \"unicorn\" without the quotation marks?");
            System.out.println("Did you enter the number 1, the number 2, the number 3, or the number 4?");
        }
    }
}