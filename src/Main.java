import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateClients());
    }


    public static List<Person> generateClients() {
        Person petya = new Person("Petya","Fedorov",1);
        Person victor = new Person("Victor" ,"Sorokin",3);
        Person lyuba = new Person("Lyuba","Lebedeva",2);
        Person sofia = new Person("Sofia","Romanova",5);
        Person artur = new Person("Artur","Romanov",5);
        ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(petya,
                victor,lyuba,sofia,artur));
        return people;
    }
}
