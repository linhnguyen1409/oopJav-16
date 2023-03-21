import java.util.Scanner;

public class Bai2 {
    public static void main (String[] agrs) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bat ki : ");
        int n = sc.nextInt();
        if (n % 2 == 0)
        {
            System.out.println("n la so chan");
        }
        else 
        {
            System.out.println(" n la so le ");
        } 
    }
}
