import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        int x=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int a = sc.nextInt();
        System.out.print("Enter the power number:   ");
        int b = sc.nextInt();
        for (int i=1;i<=b;i++){
           x*=a;
        }
        System.out.println(x);
    }
}
