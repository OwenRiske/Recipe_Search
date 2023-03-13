import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner INPUT=new Scanner(System.in);
        String password="10";
        String userInput="";
        while (true){
            System.out.print("Would you like to:\n1. Recipe List 2. Recipe Search 3. Catorgorized Recipes 4. Admin Login 5. Quit\n>");
            userInput=INPUT.nextLine();

            if(userInput.equalsIgnoreCase("1")||userInput.equalsIgnoreCase("1.")||userInput.equalsIgnoreCase("Recipe List")||userInput.equalsIgnoreCase("List")){

            }
            else if(userInput.equalsIgnoreCase("2")||userInput.equalsIgnoreCase("2.")||userInput.equalsIgnoreCase("Recipe Search")||userInput.equalsIgnoreCase("Search")){

            }
            else if(userInput.equalsIgnoreCase("3")||userInput.equalsIgnoreCase("3.")||userInput.equalsIgnoreCase("Catorgized Recipes")||userInput.equalsIgnoreCase("Catorgized")){

            }
            else if(userInput.equalsIgnoreCase("4")||userInput.equalsIgnoreCase("4.")||userInput.equalsIgnoreCase("Admin Login")||userInput.equalsIgnoreCase("Admin")||userInput.equalsIgnoreCase("Login")&&login.login(password,INPUT)){


            }
            else if (userInput.equalsIgnoreCase("5")||userInput.equalsIgnoreCase("5.")||userInput.equalsIgnoreCase("Quit")) {
                break;
            }
            else {
                System.out.println("The input "+userInput+" is unknown");
            }

        }
    }
}