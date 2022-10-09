import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args){

        Person c = new Person("Mark", "Street Qwerty 2", "18062003", false, 0);
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("Person.json"), c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Person person1 = mapper.readValue(new File("Person.json"), Person.class);
            System.out.println(person1.getName() + " " + person1.getAddress() + " " + person1.getBirthday() + " "  + person1.isCrime() +  " " + person1.getPrisonTerm());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {Person[] actors = mapper.readValue(new File("actors.json"), Person[].class);
            for (int i = 0; i < actors.length; i++){
                System.out.println(actors[i].getName() + " " + actors[i].getAddress() + " " + actors[i].getBirthday() + " "  + actors[i].isCrime() +  " " + actors[i].getPrisonTerm() + " " + Arrays.toString(actors[i].getFriends()));
            }
//            System.out.println(Arrays.toString(actors));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            ArrayList<Person> actorss = mapper.readValue(new File("actors.json"), mapper.getTypeFactory().constructCollectionType(List.class, Person.class));
            for (int i = 0; i < actorss.size(); i++){
                System.out.println(actorss.get(i).getName() + " " + actorss.get(i).getAddress() + " " + actorss.get(i).getBirthday() + " "  + actorss.get(i).isCrime() +  " " + actorss.get(i).getPrisonTerm() + " " + Arrays.toString(actorss.get(i).getFriends()));
            }
//            System.out.println(actorss);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
