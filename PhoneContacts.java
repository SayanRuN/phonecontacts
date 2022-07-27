package lesson_4_3.task_1;

import java.util.*;

public class PhoneContacts {

    private final Map<String, List<Contact>> groups;

    public PhoneContacts() {
        this.groups = new HashMap<>();
    }

    public void addGroup(String name) {
        groups.put(name, new ArrayList<>());
    }

    public void addContactToGroups(Contact contact, String[] groups) {
        for (String group : groups) {
            if (this.groups.containsKey(group)) {
                this.groups.get(group).add(contact);
            }
        }
    }

    public void printGroups() {
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            System.out.println("- " + entry.getKey());
            for (Contact contact : entry.getValue()) {
                System.out.println(
                        "\tИмя: " + contact.getName() + ", Телефон: " + contact.getPhone()
                );
            }
        }
    }

    public void printSortedContacts() {
        List<Contact> allContacts = new ArrayList<>();
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            for (Contact contact : entry.getValue()) {
                if (!allContacts.contains(contact)) {
                    allContacts.add(contact);
                }
            }
        }
        allContacts.sort(Comparator.naturalOrder());
        for (Contact contact : allContacts) {
            System.out.println(
                    "Имя: " + contact.getName() + ", Телефон: " + contact.getPhone()
            );
        }
    }
}
