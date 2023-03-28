import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj wysokosc choinki: ");
     int n = scanner.nextInt();

    System.out.println();
    
        for (int i = 1; i <= n; i++) { // wyświetl poziom i-ty
           
          for (int j = 1; j <= n - i; j++) {
          
            System.out.print(" "); // wypełnienie spacjami na lewo
            
          }
          
          for (int k = 1; k <= i * 2 - 1; k++) {
          
            System.out.print("*"); // wyświetlenie gwiazdek
            
          }
          
          System.out.println();
        }
    }
}