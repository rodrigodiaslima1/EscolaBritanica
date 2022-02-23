package Tests;

import model1.Employee;
import model1.Hired;
import model1.IEmployee;

public class Test1 {

    public static void main(String[] args) {

        Employee hired1 = new Hired();
        Hired hired2 = new Hired();

        Hired downCastingObject = (Hired) hired1;

        downCastingObject.myMethod();

    }

}
