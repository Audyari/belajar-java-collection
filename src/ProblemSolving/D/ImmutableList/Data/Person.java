package ProblemSolving.D.ImmutableList.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;

    private List<String> hobbies;


    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby){

        hobbies.add(hobby);
    }

    public List<String> getHobbies() {

        // Problem nya dapat di injek ubah jadi :
        // return hobbies;
        return Collections.unmodifiableList(hobbies);
    }

     public String getName() {
        return name;
    }


}
