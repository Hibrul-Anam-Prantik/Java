///n number of prime numbers , which are >100

import java.util.Scanner;
public class L5_T2_1_1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for(int p = 100;;p++){
      boolean check = true;
      for (int i = 2 ; i < p ; i++) {
        if (p%i ==0) {
          check = false;
          break;
        }
      }
      if (check){
        System.out.println(p);
        count++;
      } 
      if( count==n) {
        
        break;
      }
    }
  }
}