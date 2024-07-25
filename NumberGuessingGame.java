// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public NumberGuessingGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      int var3 = var2.nextInt(100) + 1;
      int var4 = 0;
      boolean var5 = false;
      System.out.println("Welcome to the Number Guessing Game!");
      System.out.println("Try to guess the secret number between 1 and 100.");

      while(!var5) {
         System.out.print("Enter your guess: ");
         int var6 = var1.nextInt();
         ++var4;
         if (var6 < var3) {
            System.out.println("Too low! Try again.");
         } else if (var6 > var3) {
            System.out.println("Too high! Try again.");
         } else {
            var5 = true;
            System.out.println("Congratulations! You've guessed the secret number " + var3 + " in " + var4 + " attempts.");
         }
      }

      var1.close();
   }
}
