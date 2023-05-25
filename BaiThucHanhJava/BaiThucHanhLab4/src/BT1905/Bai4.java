package BT1905;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Bai4 {


private static String i;

public static void main(String[] args) {
    String tenqua ;
    int n ;
    Scanner sc = new Scanner(System.in);
    HashSet<String> Fruit = new HashSet<>();
    System.out.println("so phan tu cua fruit : ");
    n = sc.nextInt();
    System.out.println("nhap ten cac loai qua : ");
    for(int i = 0 ; i < n ; i++);
    {
        System.out.println("nhap ten loai qua thu " + i + ":");
        tenqua = sc.nextLine();
        Fruit.add(tenqua);
    }
    System.out.println("so phan tu cua fruit : " + Fruit.size());
    System.out.println("cac phan tu cua fruit : " + Fruit );
    System.out.println("nhap ten qua can tim : ");
    String timqua = sc.nextLine();
    if (Fruit.contains(timqua) )
    {
     System.out.println("tim thay qua " + timqua + "trong Fruit");   
    }
    else
    {
        System.out.println("khong tim thay " + timqua);
    }
    System.out.println("nhap ten loai qua can xoa : ");
    String xoaqua =sc.nextLine();
    if (Fruit.contains(xoaqua))
    {
        Fruit.remove(timqua);
        System.out.println("hoan thanh xoa qua ");
        System.out.println("cac phan tu con lai trong fruit la :"+ Fruit);
    }
    else
    {
        System.out.println("xoa that bai!!!");
    }
    //tao list moi 
    List<String> dsqua = new ArrayList<>();
    
}
}
