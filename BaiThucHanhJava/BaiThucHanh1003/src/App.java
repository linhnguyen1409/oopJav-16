import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mang ;
        Scanner sc = new Scanner(System.in);
        // nhap mamg
        do{
            System.out.println("Nhap so phan tu mang :");
            mang =sc.nextInt();
        }while(mang <=0);
        int arrB[] = new int[mang];
        System.out.println("Nhap phan tu mang :");
        for (int i = 0; i < arrB.length; i++)
        {
            System.out.printf("B[%d] =" , i);
            arrB[i]= sc.nextInt();
        }
        // sap xep mang
        for (int i = 0 ; i < arrB.length - 1 ; i++)
        {
            int c;
            for(int j = i+1 ; j < arrB.length ; j++ )
            {
                if( arrB[i] > arrB[j])
                {
                    c = arrB[i];
                    arrB[i]=arrB[j];
                    arrB[j] = c;
                }
            }
        }
        // in mang
        System.out.print("Mang sap xep tang dan : ");
        for(int i = 0 ; i < arrB.length ; i++)
        {
            System.out.printf( "% d\t", arrB[i]);
        }
    }
}
