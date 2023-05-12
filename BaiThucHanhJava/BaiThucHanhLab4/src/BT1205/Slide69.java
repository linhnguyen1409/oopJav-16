package BT1205;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {
    public static void main(String[] args) {
        int number ;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        System.out.println("cac phan tu trong treeSetInterger: ");
        System.out.println(treeSetInteger);
        System.out.println("nhap phan tu can them : ");
        number = sc.nextInt();
        if (!treeSetInteger.contains(number))
        {
            treeSetInteger.add(number);
            System.out.println("them thanh cong! ");
            System.out.println("cac phan tu trong treeSetInteger sau khi them : ");
            System.out.println(treeSetInteger);
        }
        else
        {
            System.out.println("phan tu " + number + " da ton tai !");
        }
    }
}
