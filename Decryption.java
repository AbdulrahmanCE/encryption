import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Decryption {
    String decryption= "";
    Scanner input = new Scanner(System.in);
    Encryption en = new Encryption();


    public void decryptionFile (){
        System.out.print("Enter the path of the file to dectyption it: ");
        String path = input.nextLine();
        Scanner putput =null;
        PrintWriter pw = null ;
        try {
            putput = new Scanner(path);
            pw  = new PrintWriter(path);

        }catch (FileNotFoundException e){
            System.out.println("Not open "+ e.getMessage());
        }
        System.out.print("Enter the String value to decryption it: ");
        String encryption = input.nextLine();
        System.out.print("Enter the password to decryption: ");
        String inPass = input.nextLine();
        char outArr[] = encryption.toCharArray();
        int inPass2 = Integer.parseInt(inPass);

        int coutner = inPass2 + (encryption.length())*2684;

        for (int i = outArr.length - 1; i >= 0; i--) {
            coutner -= 2684;
            outArr[i] -= coutner;
        }
        for (int i = 0; i < outArr.length; i++) {
            this.decryption += outArr[i];
        }
        pw.println(this.decryption);
        pw.close();

    }




    public String decryption (){
        System.out.print("Enter the String value to decryption it: ");
        String encryption = input.nextLine();
        System.out.print("Enter the password to decryption: ");
        String inPass = input.nextLine();
        char outArr[] = encryption.toCharArray();
        String  ranStr = "";
        int ran =0;
        for(int i =0 ; i < 4;i++) {
            try {

                ranStr += encryption.charAt(i)+"";

            }catch (NumberFormatException e ){
                break;
            }

        }
        char ranChar[] = ranStr.toCharArray();
        int counter1 = 123456;
        ranStr="";
        for (int i =0 ; i < ranChar.length;i++){
            ranChar[i]-=counter1;
            ranStr+=ranChar[i];
        }

        ran = Integer.parseInt(ranStr);


        int inPass2 = Integer.parseInt(inPass);
        int counter =  inPass2*ran + (encryption.length()-4)*2684;

        for (int i = outArr.length - 1; i >= 4; i--) {
            counter -= 2684;
            outArr[i] -= counter;
        }
        for (int i = 4; i < outArr.length; i++) {
            this.decryption += outArr[i];
        }

        return this.decryption;
    }






}
