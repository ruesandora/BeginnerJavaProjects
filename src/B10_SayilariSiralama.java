import java.util.Scanner;

public class B10_SayilariSiralama {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num1, num2, num3;

    System.out.print("İlk sayınızı giriniz: ");
    num1 = scan.nextInt();
    System.out.print("İkinci sayınızı giriniz: ");
    num2 = scan.nextInt();
    System.out.print("Üçüncü sayınızı giriniz: ");
    num3 = scan.nextInt();


    if (num1 >= num2 && num1 >= num3) {
      if (num2 >= num3) {
        System.out.println("\nBüyükten küçüğe doğru: ");
        System.out.println("Numara 1: " + num1);
        System.out.println("Numara 2: " + num2);
        System.out.println("Numara 3: " + num3);
      } else {
        System.out.println("\nBüyükten küçüğe doğru: ");
        System.out.println("Numara 1: " + num1);
        System.out.println("Numara 3: " + num3);
        System.out.println("Numara 2: " + num2);
      }
    } else if (num2 >= num1 && num2 >= num3) {
      if (num1 >= num3) {
        System.out.println("\nBüyükten küçüğe doğru: ");
        System.out.println("Numara 2: " + num2);
        System.out.println("Numara 1: " + num1);
        System.out.println("Numara 3: " + num3);
      } else {
        System.out.println("\nBüyükten küçüğe doğru: ");
        System.out.println("Numara 2: " + num2);
        System.out.println("Numara 3: " + num3);
        System.out.println("Numara 1: " + num1);
      }
    } else {
      if (num1 >= num2) {
        System.out.println("\nBüyükten küçüğe doğru: ");
        System.out.println("Numara 3: " + num3);
        System.out.println("Numara 1: " + num1);
        System.out.println("Numara 2: " + num2);
      } else {
        System.out.println("\nBüyükten küçüğe doğru: ");
        System.out.println("Numara 3: " + num3);
        System.out.println("Numara 2: " + num2);
        System.out.println("Numara 1: " + num1);
      }
    }
  }
}

    
/*    if (num1 > num2 && num2 > num3){ // 1, 2, 3 => 10, 9, 8
      System.out.println("\nBüyükten küçüğe doğru: " + ("\nnumara 1: " + num1 + "\nnumara 2: " + num2 + "\nnumara 3: " + num3));
    } else if (num1 > num3 && num3 > num2) { // 1, 3, 2 => 10, 8, 9
      System.out.println("\nBüyükten küçüğe doğru: " + ("\nnumara 1: " + num1 + "\nnumara 3: " + num3 + "\nnumara 2: " + num2));
    } else if (num2 > num3 && num1 > num3) { // 2, 1, 3 => 9, 10, 8
      System.out.println("\nBüyükten küçüğe doğru: " + ("\nnumara 2: " + num2 + "\nnumara 1: " + num1 + "\nnumara 3: " + num3));
    } else if (num2 > num1 && num3 > num1) { // 2, 3, 1 => 8, 10, 9
      System.out.println("\nBüyükten küçüğe doğru: " + ("\nnumara 2: " + num2 + "\nnumara 3: " + num3 + "\nnumara 1: " + num1));
    } else if (num3 > num2 && num1 > num2) { // 3, 1, 2 => 9, 8, 10
      System.out.println("\nBüyükten küçüğe doğru: " + ("\nnumara 3: " + num3 + "\nnumara 1: " + num1 + "\nnumara 2: " + num2));
    } else { // 3, 2, 1 => 8, 9, 10
      System.out.println("\nBüyükten küçüğe doğru: " + ("\nnumara 3: " + num3 + "\nnumara 2: " + num2 + "\nnumara 1: " + num1)); // 3, 2, 1 => 8, 9, 10
    }*/
