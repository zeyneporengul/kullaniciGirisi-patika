import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı!");
        } else if(!userName.equals("patika") && password.equals("java123")){
            System.out.println("Kullanıcı adınızı yanlış girdiniz!");
        } else if(userName.equals("patika") && !password.equals("java123")){
            System.out.println("Şifrenizi yanlış girdiniz. Değiştirmek istiyor musunuz?");
            System.out.println("Evet ise 1, hayır ise 2 yazınız.");
            select = input.nextInt();

            switch(select){
                case 2:
                    System.out.println("İşlem bitti");
                    break;
                case 1:
                    input.nextLine();
                    System.out.print("Yeni şifreniz: ");
                    newPassword = input.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz!");
                    } else{
                        password = newPassword;
                        System.out.println("Şifre oluşturuldu!");
                    }
                    break;
            }


        }else{
            System.out.println("Kullanıcı adınızı ve şifrenizi yanlış girdiniz!");
        }
    }
}
