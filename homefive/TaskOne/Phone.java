package homefive.TaskOne;

import java.util.*;


public class Phone {

    public HashMap<Integer, Person> hashMap;

    public Phone() {
        this.hashMap = new HashMap<>();
    }

    public static void main(String[] args) {
        Phone phoneBook = new Phone();
        Person person1 = phoneBook.addOrUpdateWithNaturalKey(1);
        Person person2 = phoneBook.addOrUpdateWithNaturalKey(2);
        person1.setFullName("Valerii Valeriievich");
        person1.setAddress("Street Basseinaya");
        person1.addPhone("+79123123123");
        person1 = phoneBook.getByNaturalKey(1);
        System.out.println("Person1 address: " + person1.getAddress());
        System.out.println("Person1 fullname: " + person1.getFullName());
        System.out.println("Person1 phones: " + person1.getPhones());
        System.out.println("Person2 address: " + person2.getAddress());
        System.out.println("Person2 fullname: " + person2.getFullName());
    }

    public Person getByNaturalKey(Integer key) {
        if (this.hashMap.containsKey(key)) {
            return this.hashMap.get(key);
        }
        System.out.printf("Person with key %d undefined%n", key);
        return null;
    }

    public Person addOrUpdateWithNaturalKey(Integer key) {
        Person person = new Person();
        this.hashMap.put(key, person);
        return person;
    }
}