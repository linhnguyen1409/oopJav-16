package BT2804;
import java.util.ArrayList;
import java.util.Scanner;


public class Max {
    public static void main(String[]agrs)
        {
            ArrayList<Integer> arrListInteger = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int number;
            System.out.println("Nhap so phan tu cua ArrList : ");
            int n = sc.nextInt();
            //nhap va them phan tu cho ArrayList
            for ( int i = 0 ; i < n ; i++)
            {
                System.out.print("Nhap phan tu thu " + i +" : ");
                number = sc.nextInt();
                arrListInteger.add(number);
            } 
            int max = arrListInteger.get(0);
            for ( int i = 1; i < arrListInteger.size() ; i++)
            {
                if (arrListInteger.get(i).compareTo(max) > 0)
                {
                    max = arrListInteger.get(i);
                }
            }
            int min = arrListInteger.get(0);
            for ( int i = 1; i < arrListInteger.size() ; i++)
            {
                if (arrListInteger.get(i).compareTo(min) < 0)
                {
                    min = arrListInteger.get(i);
                }
            }
            System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
            System.out.println("Phan tu nho nhat trong arrListInteger = " + min);
        }
    }