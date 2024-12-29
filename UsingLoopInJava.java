import java.util.Scanner;


public class UsingLoopInJava {
    public static void main(String[] args) {
        System.out.println("ENTER N");

        Scanner Input = new Scanner(System.in);

        int n = Input.nextInt();
        int i = 0;

        while (i <= n){
            System.out.println(i);
            i++;
        }

        int j = 0;
        do { 
            System.out.println(2*j);
            j++;
        } while (j  <= n);


        for (i=0; i < n; i++) {
            System.out.println(2*i+1);
        }
    }
}
