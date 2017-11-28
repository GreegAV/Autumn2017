package Training.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class People {
    private String surname;
    private long telephoneNumber;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    static ArrayList<People> peopleList = new ArrayList<>();

    public void readPeople(Scanner myFile) {
        surname = myFile.next();
        telephoneNumber = myFile.nextLong();
    }

    public static void downloadList() throws FileNotFoundException {
        Scanner myFile = new Scanner(new File("Base.txt"));
        while (myFile.hasNext()) {
            People people = new People();
            people.readPeople(myFile);
            peopleList.add(people);
        }
    }
}