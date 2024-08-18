// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter your birth Month ");
        int birthMonth = 14; //Place Holder
        if (1 <= birthMonth && birthMonth <= 12) //Condition 
            System.out.println("Your birth Month is " + birthMonth);
        else
            System.out.println("The month you have entered is invalid.");

    }
}