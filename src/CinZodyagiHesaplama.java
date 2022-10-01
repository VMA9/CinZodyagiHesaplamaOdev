import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        String animal = "";
        int year, zodyag;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();

        zodyag = year % 12;

        switch (zodyag) {
            case 0:
                animal = "Maymun";
                break;
            case 1:
                animal = "Horoz";
                break;
            case 2:
                animal = "Köpek";
                break;
            case 3:
                animal = "Domuz";
                break;
            case 4:
                animal = "Fare";
                break;
            case 5:
                animal = "Öküz";
                break;
            case 6:
                animal = "Kaplan";
                break;
            case 7:
                animal = "Tavşan";
                break;
            case 8:
                animal = "Ejderha";
                break;
            case 9:
                animal = "Yılan";
                break;
            case 10:
                animal = "At";
                break;
            case 11:
                animal = "Koyun";
            default:
                isError = true;
        }
        if(isError){
            System.out.print("Hatalı Giriş Yaptınız. ");
        }else{
            System.out.println("Çin Zodyağı Burcunuz : " + animal);
        }


    }
}