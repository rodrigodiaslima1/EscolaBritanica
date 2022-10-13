package aula1;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args){

        Stream<String> listStream = List.of("Rodrigo", "Dias").stream();
        Stream<Integer> intListStream = List.of(1, 2, 3).stream();

        Stream<String> setStream = Set.of("Rodrigo", "Dias").stream();
        Stream<Integer> intSetStream = Set.of(1, 2, 3).stream();

        HashMap<String, String> hashMap = new HashMap<>();

        Map<String, String> mapStream = Map.of("Rodrigo", "Dias");
        Stream<String> mapKeyStream = mapStream.keySet().stream();
        Stream<String> mapValuesStream = mapStream.values().stream();

    }

}
