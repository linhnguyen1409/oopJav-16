import java.util.Scanner;

public class Bai12 {
    public static void main(String[]agrs){
        Scanner sc =new Scanner(System.in);
        System.out.print(" Nhap hang : ");
        int hang = sc.nextInt();
        System.out.print(" Nhap cot : ");
        int cot = sc.nextInt();
        int mt[][] = new int [hang][cot];
        System.out.println(" Nhap phan tu ma tran : ");
        for ( int i = 0 ; i < hang ; i++){
            for (int j = 0 ; j < cot ; j++){
                System.out.printf("A[%d][%d] = " ,i,j);
                mt[i][j] = sc.nextInt();
            }
        }
        int max = mt[0][0];
        for (int i = 0 ; i < hang ; i++)
        {
            for (int j = 0; j < cot ; j++){
                if (mt[i][j] > max){
                    max = mt[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat la : " + max);
    }
    
}
