import java.util.List;

public class Student {
    private String name;
    private int age;
    private Address address;
    public List<MobileNumber> mobileNumbers;

    public Student(String name, int age, Address address,
                   List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name = '" + name + '\'' +
                ", Age = " + age +
                ", Address " + address +
                ", Mobile Numbers = " + mobileNumbers +
                '}';

    }
}
