import logic.Slicer;
import logic.StoreData;
import logic.UserInput;
import java.util.List;

/*
* Ler do console nomes separados por vírgula
* guardar em uma variavel
* fazer ordenação
* imprimir no console
*
* */
public class App {

    public static void main(String[] args) {

        String userInput = UserInput.getARowOfPeople();
        String[] userSplittedData = Slicer.splitData(userInput);
        List<String> dataInsideArrayList = StoreData.convertToArrayList(userSplittedData);

        StoreData.showData(dataInsideArrayList);

    }

}
