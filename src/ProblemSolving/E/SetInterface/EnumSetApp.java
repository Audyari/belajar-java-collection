package ProblemSolving.E.SetInterface;

import java.util.EnumSet;

public class EnumSetApp {

    public static void main(String[] args) {

        //EnumSet<Gender> testData = EnumSet.allOf(Gender.class);
        EnumSet<Gender> testData = EnumSet.of(Gender.MALE,Gender.FEMALE);

        for(var datanya: testData){
            System.out.println(datanya);
        }

    }

    public static enum Gender{
        MALE,
        FEMALE
    }
}
