package ProblemSolving.D.ImmutableList;

import ProblemSolving.D.ImmutableList.Data.Person;

import java.util.List;

public class ProblemMutableList {

    public static void main(String[] args) {
        Person testData = new Person("AUDY");
        testData.addHobby("CODING");
        testData.addHobby("MAKAN");

        // Bisa Di injek
        //doSometing(testData.getHobbies());

        for (var datanya: testData.getHobbies()){
            System.out.println(datanya);
        }

    }

    public static void doSometing(List<String> injek){
        injek.add("test");
    }

}
