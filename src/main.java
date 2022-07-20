import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int bDay,kalan;
        boolean isError=false;
        Scanner input =new Scanner(System.in);

        System.out.print("Doğum Tarihini Giriniz :");
        bDay = input.nextInt();

        if (bDay > 1000 && bDay < 2022){
            kalan = bDay%12;
            switch (kalan) {
                case 0:
                    System.out.println("Maymun");
                    break;
                case 1:
                    System.out.println("Horoz");
                    break;
                case 2:
                    System.out.println("Köpek");
                    break;
                case 3:
                    System.out.println("Domuz");
                    break;
                case 4:
                    System.out.println("Fare");
                    break;
                case 5:
                    System.out.println("Öküz");
                    break;
                case 6:
                    System.out.println("Kaplan");
                    break;
                case 7:
                    System.out.println("Tavşan");
                    break;
                case 8:
                    System.out.println("Ejderha");
                    break;
                case 9:
                    System.out.println("Yılan");
                    break;
                case 10:
                    System.out.println("At");
                    break;
                case 11:
                    System.out.println("Koyun");
                    break;
                default:
                    isError=true;

            }

        }else {
            isError=true;
        }

        if (isError){
            System.out.println("Hatalı bir seçim Yaptınız...(Doğum Tarihi 1000-2022 Arasında Olmalı)");
        }
    }
}
