package exercise.program.list;

import java.util.List;
import java.util.ArrayList;

public class CarsList <T>{

    private static Integer carNumber = 1;
    List<T> list;

    public CarsList(){
        list = new ArrayList<T>();
    }


    public void addCar(T carType){
        list.add(carType);
    }

    public T returnCar(int index){
        return list.get(index);
    }

    public void allCars(){

        list.forEach(car ->{
            System.out.println(car);
        });

    }

}
