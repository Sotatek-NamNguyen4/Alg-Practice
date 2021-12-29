import java.util.Scanner;
import java.util.Stack;

public class Program {

    public static void main(String[] args) {

//        ReverseString.reverseStr("HELLO");
//
//        ConcatArrays.concatArr();
//
//        RandomString.getRndStr();
//
//        Circle.drawCircle();
//
//        NumberOfSundays.countSundays();

        StringBuilder ant = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            AntSequence.printSeq(ant);
        }

//        PasswordValidation.validate("Abbccccccc6@");
    }

}
