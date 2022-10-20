package com.test.rodrigo;

import exercicio2.People;
import exercicio2.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Testes relacionados ao código na
 * pasta exercício2
 */
public class Exercicio2Tests {

    @Test
    public void femaleListTest(){
        List<Person> femaleList = People.femaleList();
        femaleList.forEach(female ->{
            Assert.assertEquals("female", female.getGender());
        });
    }

}
