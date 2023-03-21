import java.util.Scanner;
public class Bai8 {
    public static void main(String[]agrs)throws Exception{
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        float TBC ;
        System.out.println("Nhap so phan tu cua day: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++)  {
            System.out.println("Nhap phan tu thu "+i+ ":");
            int phantu = sc.nextInt();
            tong += phantu ;
        }
        TBC = ((float)tong) / n ; 
        System.out.println("Trung binh cong cua day so la : "+ TBC);
    }
    
}
