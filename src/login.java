import java.util.Scanner;

public class login {

    public static boolean login(String password, Scanner INPUT){


        for (int i = 0; i < 5; i++) {
            System.out.print("Password: ");
            if(INPUT.nextLine().equals(password)){
                System.out.println("Correct!\n");
                return true;
            }
            else{
                System.out.println("Password Invalid");
            }

        }
        return false;
    }

    public static boolean login(String[] username, String[] password, Scanner INPUT){
        String userInput="";
        for (int i = 0; i < 5; i++) {
            System.out.print("Username: ");
            userInput=INPUT.nextLine();
            for (int j = 0; j < username.length; j++) {
                if(userInput.equalsIgnoreCase(username[i])){
                    System.out.println("Correct!\n");
                    if(login(password[j],INPUT)){
                        return true;
                    }
                }
                else{
                    System.out.println("Invalid Username");
                }
            }
            if(INPUT.nextLine().equals(password)){
                System.out.println("Correct!\n");
                return true;
            }
            else{
                System.out.println("Password Invalid");
            }

        }
        return false;    }
}
