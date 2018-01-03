import java.util.Scanner;

public class Bintang2 {
      public static void main(String[] args) {
      Scanner data = new Scanner(System.in);
      System.out.print("Masukkan banyak baris : ");

        int nilai = data.nextInt();
        int j,i;
       
        for (i=1;i<=nilai ;i++ )
             if (i%2 == 1){
                for (j=1;j<=i ;j++ ){
           System.out.print("*");
           }
        }
          System.out.println();
    }        
}
