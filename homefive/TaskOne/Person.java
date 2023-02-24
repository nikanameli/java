package homefive.TaskOne;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String fullName;
    String address;

    ArrayList<String> phones;

    public Person() {
        this.phones = new ArrayList<>();
        this.fullName = "Undefined";
        this.address = "Undefined";
    }

    public List<String> getPhones() {
        return phones;
    }

    public String getAddress() {
        return address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void addPhone(String phone) {
        this.phones.add(phone);
    }
} 

    

