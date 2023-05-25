package BT1905;
import java.util.ArrayList;
import java.util.HashSet;
<<<<<<< HEAD
=======
import java.util.Iterator;
import java.util.List;
>>>>>>> 10c68b0b9aa26213cff9da010b810529cc14c999
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
<<<<<<< HEAD
    System.out.println("nhap ten cac loai qua : ");
=======
>>>>>>> 10c68b0b9aa26213cff9da010b810529cc14c999
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
<<<<<<< HEAD
    
=======
    dsqua.add("ca chua");
    dsqua.add("man");
    dsqua.add("dua hau");
    dsqua.add("bi");
    Fruit.addAll(dsqua);
    System.out.println("cac phan tu co trong Fruit sau khi them :");
    Iterator<String> iterator =  Fruit.iterator();
    while (iterator.hasNext())
    {
        System.out.print(iterator.next() + "\t");
    }
    Fruit.removeAll(dsqua);
    System.out.println("\ncac phan tu co trong Fruit sau khi xoa : " + Fruit);
>>>>>>> 10c68b0b9aa26213cff9da010b810529cc14c999
}
}
