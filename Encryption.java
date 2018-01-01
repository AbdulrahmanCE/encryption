
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Encryption {
    Scanner input = new Scanner(System.in);
    String encryption = "";



    public String encryptionFile() {

        System.out.print("Enter the file path to encryption it: ");
        String path = input.nextLine();
        Scanner inputfile = null;
        try {
            inputfile = new Scanner(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            System.out.println("not open "+ e.getMessage());

        }


        //System.out.print("Enter the String value to Encryption it: ");
        String in = "";
        while (inputfile.hasNext()) {
            in += inputfile.nextLine();
        }
        System.out.print("Enter the password in integar:");
        String passStr = input.nextLine();
        int pass = Integer.parseInt(passStr);


        char out[] = in.toCharArray();
        int counter = pass;
        for (int i = 0; i < out.length; i++) {
            out[i] += counter;
            this.encryption += out[i];
            counter += 2684;
        }

        return this.encryption;
    }

    public String encryption() {
        System.out.print("Enter the String value to Encryption it: ");
        String in = input.nextLine();
        System.out.print("Enter the password in integar:");
        String pass = input.nextLine();
        int pass1 = Integer.parseInt(pass);
        char out[] = in.toCharArray();

        int ran = (int)(Math.random()*10000);
        int counter = pass1*ran;
        for (int i = 0; i < out.length; i++) {
            out[i] += counter;
            this.encryption += out[i];
            counter += 2684;
        }
        String ranStr = ran+"";

        char ranChar [] = ranStr.toCharArray();
        ranStr = "" ;
        int counter1 = 123456;
        for(int i =0 ; i < ranChar.length;i++){
            ranChar[i]+= counter1;
            ranStr+=ranChar[i];
        }

        this.encryption = ranStr+this.encryption;

        return this.encryption;
    }

}
