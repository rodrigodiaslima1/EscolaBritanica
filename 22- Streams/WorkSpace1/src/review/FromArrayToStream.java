package review;

import aula2.Person;

import java.util.Arrays;

public class FromArrayToStream {

    public static void main(String[] args){

        String[] names = new String[3];
        var namesStream = Arrays.stream(names);

        String[] objectArray = (String[]) namesStream.toArray();
    }

}
