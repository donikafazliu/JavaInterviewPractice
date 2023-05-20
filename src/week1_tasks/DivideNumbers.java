package week1_tasks;

public class DivideNumbers {
    public static void main(String[] args) {

        System.out.println(divide(10,5));

    }
    public static int divide(int a, int b){
        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        return count;
    }
}
