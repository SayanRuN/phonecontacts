package lesson_4_3.task_1;

public class Task {

    public static void run() {
        PhoneContacts contacts = new PhoneContacts();
        contacts.addGroup("Семья");
        contacts.addGroup("Друзья");
        contacts.addGroup("Коллеги");
        contacts.addContactToGroups(
                new Contact("Джон", "+7 (911) 111-11-11"),
                new String[]{"Друзья", "Коллеги"}
        );
        contacts.addContactToGroups(
                new Contact("Кристина", "+7 (987) 226-12-12"),
                new String[]{"Семья"}
        );
        contacts.addContactToGroups(
                new Contact("Дархан", "+7 (708) 322-19-15"),
                new String[]{"Друзья"}
        );
        System.out.println("Группы:");
        contacts.printGroups();
        System.out.println("Отсортированные контакты:");
        contacts.printSortedContacts();
    }
}
