
public class SumOfArrayElement {
    public static void main(String[] args) {
        
        float num[] = {53.1f,92.62f,72.82f,95.72f,61.72f};

        for ( float Element:num){
            System.out.println(Element);
        }

        float sum = 0;

        for (int i = 0; i < num.length ; i++) {
            sum += num[1];
            
        }
        System.out.println("the sum of the element of the array is :");
        System.out.println(sum);
    }
}