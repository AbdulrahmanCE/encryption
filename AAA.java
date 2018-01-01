import java.util.Scanner;

public class AAA {

    public static void main(String[] args) {
        Decryption D = new Decryption();
        Encryption E = new Encryption();

        Scanner input = new Scanner(System.in);
        System.out.print("Encryption or Decraption (E | D): ");
        String eORd = input.nextLine();

        if (eORd.equals("E")) {
            System.out.print("From the file or from the Keybord(F | K): ");
            String fORk = input.nextLine();
            if (fORk.equals("K")) {

                System.out.println("The encryption is: "+E.encryption());

            } else if (fORk.equals("F")) {

                System.out.println("The encryption is: "+E.encryptionFile());

            }

        } else if (eORd.equals("D")) {

            System.out.print("To the file or to the screen(F | S): ");

            String fORk = input.nextLine();

            if (fORk.equals("S")) {

                System.out.println("The decryption is: "+D.decryption());

            }else if (fORk.equals("F")){

                D.decryptionFile();
                System.out.println("Done");


            }
        }
        System.out.print("Enter 'R' to re-run the programm: " );
        String R = input.nextLine();
        if (R.equals("R"))
            main(args);
        else
            System.out.println("Good bye");


    }
}

