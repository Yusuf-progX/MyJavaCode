import java.util.Scanner;

public class StudentPassOrNot {
    public static void main(String[] args) {
        
        System.out.println("enter the marks of your subjects :");
    
        Scanner mrk = new Scanner(System.in);

        System.out.println("enter the marks of physics:");
        byte p = mrk.nextByte();

        System.out.println("enter the marks of chemistry");
        byte c = mrk.nextByte();

        System.out.println("enter the marks of maths ");
        byte m = mrk.nextByte();
        
        float avg = (p+c+m)/3.0f;

        if ( avg >= 40 && p >= 33 && c >= 33 && m >= 33 ) {
            System.out.println("congratulation you are promoted to next class");
        }
        else {
            System.out.println("sorry beter luck next time");
        }

        mrk.close();


    }
    
}
