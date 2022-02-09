
import logics.UserInput;
import logics.Check;
import logics.UsersList;
import java.util.Scanner;

/**
 * @author rodrigodiaslima1
 */
public class App {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        Check check = new Check();
        UsersList usersList = new UsersList();
        Scanner userOptions = new Scanner(System.in);

        boolean flag = true;

        while(flag){
            String[] currentInput = userInput.userInputList();
            check.checkGender(currentInput);

            System.out.println();
            System.out.print("Would you like to add another user? A:");
            String userAnswer = userOptions.next();

            if(userAnswer.equalsIgnoreCase("yes")){
                continue;
            }else if(userAnswer.equalsIgnoreCase("no")){
                flag = false;
                break;
            } else{
                System.out.println("-- I can't understand you --");
                break;
            }

        }

        usersList.verifyMaleArray();
        usersList.verifyFemaleArray();
    }
}
