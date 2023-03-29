import java.util.Scanner;

class Main {
  public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj wielkosc kwadratu: ");
     int n = scanner.nextInt();

    System.out.println();

    for(int i = 1; i <= n; i++){
      for(int j =1; j <= n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

    for(int i = 1; i <= n; i++){
      for(int j =1; j <= n; j++){
        if (i>1 && i<n && j>1 && j<n){
          System.out.print(" ");
        }
        else System.out.print("*");
        }
       System.out.println();
      }
    
       System.out.println();
    }
  }
