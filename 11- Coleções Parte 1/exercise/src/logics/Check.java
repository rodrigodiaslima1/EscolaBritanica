package logics;

public class Check {

    UsersList usersList = new UsersList();

    /**
     * This method makes a comparison of the gender
     * provided by the user at userInputList[1] with the
     * "male" word. Then, according to the gender defined,
     * it uses the add method necessary to add to the
     * maleArray or femaleArray.
     *
     * @param userInputList
     */
    public void checkGender(String[] userInputList){
        if(userInputList[1].equalsIgnoreCase("male")){
            usersList.addToMaleGenderArray(userInputList);

        } else if(userInputList[1].equalsIgnoreCase("female")){
            usersList.addToFemaleGenderArray(userInputList);
        }
    }

}
