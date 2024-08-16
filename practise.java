import java.text.NumberFormat;
import java.util.Scanner;



public class practise {

  public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);

     System.out.print("principal: ");
     int principal = scanner.nextInt();


  
     System.out.print("annual rate: ");
     float annualRate = scanner.nextFloat();
     float r = annualRate / 100/ 12; 


     System.out.print("period: ");  
     float period = scanner.nextFloat();
     float n = period * 12;


     double k = Math.pow(1+r, n);
     double mortgage = (principal * r * k ) / (k - 1);


     String result = NumberFormat.getCurrencyInstance().format(mortgage);
     System.out.println("mortgage: " + result);
    




      
     // the ternary operator
     // the condition ? "if it's true": "false"


     // ex

     int money = 50;
     String classDegree = money > 40 ? "first" : "Economy";
     System.out.println(classDegree);








  
    // if the num is divisible by 5 --> return fizz 
    // divisible by 3 --> buzz 
    // divisible by 3&5 --> fizzbuzz
    // not divisible by 3||5 --> num
  
    Scanner scanner = new Scanner(System.in);
    System.out.print("Number: ");
    int num = scanner.nextInt();



     if (num % 5 == 0 && num % 3 == 0) {
        System.out.println("fizzbuzz");

     } else {

      if (num % 3 == 0) {
        System.out.println("buzz");

      } else if (num % 5 == 0) { 
        System.out.println("fizz");
       } else {
        
        System.out.println(num);
       }
   
     }
   }
}