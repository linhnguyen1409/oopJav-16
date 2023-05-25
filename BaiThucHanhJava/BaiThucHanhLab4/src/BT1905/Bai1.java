package BT1905;
<<<<<<< HEAD

public class Bai1 {
    
}
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai1 {
     public static void main(String[] args) {
          ArrayList<Integer> numbers = new ArrayList<>();
          Scanner sc= new Scanner(System.in);
          System.out.print("Nhập vào các số nguyên (nhập 0 để kết thúc): ");
          int input = sc.nextInt();
          while (input != 0) {
               numbers.add(input);
               input = sc.nextInt();
          }
          int max = Collections.max(numbers);
          System.out.println("Số nguyên lớn nhất: " + max);
          System.out.print("Nhập vào một số nguyên để xoá: ");
          int deleteNumber = sc.nextInt();
          numbers.removeIf(number -> number == deleteNumber);
          Collections.sort(numbers);
          System.out.println("Dãy số sau khi sắp xếp:");
          for (int number : numbers) {
               System.out.print(number + " ");
          }
     }
}

>>>>>>> 10c68b0b9aa26213cff9da010b810529cc14c999
