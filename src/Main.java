import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sign = 0,tempNumber=0,sayac=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Oluşturulacak elmasın boyutunu tek haneli olarak giriniz: ");
        number = inp.nextInt();

        sign = ((number - 1) / 2) + 1;

        for (int i = 1; i <= number; i++) {

            if (i<=sign) {
                for (int k = 1; k <= sign - i; k++) {
                    System.out.print(" ");
                }
                for (int l = 1; l <= (2 * i) - 1; l++) {
                    System.out.print("*");
                    tempNumber = (2*i)-1;
                }
            }else{
                sayac+=1;
                for(int l=1;l<=i-sign;l++){
                    System.out.print(" ");
                }
                for(int n=1; n<=(tempNumber-2*sayac);n++){
                    System.out.print("*");
                }
            }
            System.out.println();

         }

    }
}
