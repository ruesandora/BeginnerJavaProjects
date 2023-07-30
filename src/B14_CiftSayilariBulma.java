import java.util.Scanner;

public class B14_CiftSayilariBulma {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen bir tamsayi giriniz: ");
    int number = scan.nextInt();

    for (int i = 1; i <= number; i++) {
      if (i % 2 == 0){
        System.out.println(i + ": Sayısı çift");
      }
    }



  }
}
