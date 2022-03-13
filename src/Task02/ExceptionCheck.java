package Task02;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;

public class ExceptionCheck {
    public static void main(String[] args) {

        try{
            System.out.println("Statement 1");
            //System.out.println(5/0);
            System.out.println("statement 2");
            System.out.println("statement 3");
        }
        catch(ArithmeticException e){
            //catch(FileNotFoundException e)
            System.out.println(10/2);
            //System.out.println(10/0);
        }
        System.out.println("statement 4");
    }
}
