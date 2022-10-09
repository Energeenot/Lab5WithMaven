import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Arrays;

@JsonAutoDetect
public class Person {
    private String name = "Доцент";
    private String address = "Moscow, RedSquare, 02";
    private String birthday = "1952-02-29";
    private boolean crime = true;
    private int prisonTerm = 15;
    private String[] friends = {""};

    public Person(String name, String adress, String birthday, boolean crime, int prisonTerm) {
        this.name = name;
        this.birthday = birthday;
        this.address = adress;
        this.crime = crime;
        this.prisonTerm = prisonTerm;
    }

    public String[] getFriends() {
        return friends;
    }

    public Person(String name, String adress, String birthday, boolean crime, int prisonTerm, String[] friends) {
        this.name = name;
        this.birthday = birthday;
        this.address = adress;
        this.crime = crime;
        this.prisonTerm = prisonTerm;
        this.friends = friends;
    }
//    public String PersonToString(){
//        return  "Name = " + name + ", address = " + address +", birthday = " + birthday +", crime = " + crime +", prisonTerm = " + prisonTerm + ", friends = " + Arrays.toString(friends);
//    }

    public Person(){}

    public String getBirthday() {
        return birthday;
    }

    public boolean isCrime() {
        return crime;
    }

    public int getPrisonTerm() {
        return prisonTerm;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
