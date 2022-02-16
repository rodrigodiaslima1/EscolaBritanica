package logic;


/**
 * Here in this class, the rowOfStrings we provide
 * is going to be splited according to the given rule
 * defined in the .split() method (commas, in this case),
 * inside the splitData(). The method will return an
 * array of Strings which is going to be used in the
 * StoreData unique method.
 */
public class Slicer {

    public static String[] splitData(String rowOfStrings){
        String[] splittedData = rowOfStrings.split(", ");
        return splittedData;
    }

}
