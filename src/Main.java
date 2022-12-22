import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        while (!queue.isEmpty()) {
            Person client = queue.poll();
            client.useTicket();
            System.out.println(client.getName() + " "
                    + client.getSurname() + " прокатился на аттракционе");
            if (client.getTickets() != 0) {
                queue.offer(client);
            }
        }
    }


    public static List<Person> generateClients() {
        Person denis = new Person("Денис", "Андреев", 1);
        Person george = new Person("Георгий", "Николаев", 3);
        Person timothy = new Person("Тимофей", "Давыдов", 2);
        Person koctza = new Person("Константин", "Герасимов", 5);
        Person artur = new Person("Артур", "Романов", 5);
        LinkedList<Person> people = new LinkedList<Person>(Arrays.asList(denis,
                george, timothy, koctza, artur));
        return people;
    }
}
