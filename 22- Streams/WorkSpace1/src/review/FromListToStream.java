package review;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FromListToStream {

    public static void main(String[] args){

        System.out.println("===> From list to stream: ");
        List<String> names = new ArrayList<>();
        //names.stream();
        Stream namesStream = names.stream();

        System.out.println("\n===> From stream to list: ");
        // choose one of them:
        //var a = namesStream.toList();
        //var b = namesStream.collect(Collectors.toList());

    }

}
