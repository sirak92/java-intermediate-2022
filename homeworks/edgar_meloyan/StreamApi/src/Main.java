import java.util.List;
import java.util.stream.Collectors;

/**
 * By looking at below example class, answer the following questions using Stream API
 * Task 1. Get student with exact match name “gagik”
 * Task 2. Get student with matching address “1235"
 * Task 3. Get all student having mobile numbers 3333.
 * Task 4. Get all student having mobile number 1233 and 1234
 * Task 5. Create a List<Student> from the List<TempStudent>
 * Task 6. Convert List<Student> to List<String> of student name
 * Task 7. Convert List<students> to String
 * Task 8. Change the case of List<String>
 * Task 9. Sort List<String>
 * Task 10. Conditionally apply Filter condition, say if flag is enabled then.
 */

public class Main {
    public static void main(String[] args) {

        List<MobileNumber> phoneNumberOfGagik = List.of(new MobileNumber("1233"), new MobileNumber("3333"), new MobileNumber("1234"));
        List<MobileNumber> phoneNumberOfSamvel = List.of(new MobileNumber("3333"));
        List<MobileNumber> phoneNumberOfDavid = List.of(new MobileNumber("1233"), new MobileNumber("1234"));
        List<MobileNumber> phoneNumberOfLilit = List.of(new MobileNumber("3256"), new MobileNumber("7845"));
        List<MobileNumber> phoneNumberOfAni = List.of(new MobileNumber("2233"));

        List<Student> students = List.of(
                new Student("Gagik", 18, new Address("1547"), phoneNumberOfGagik),
                new Student("Samvel", 19, new Address("1235"), phoneNumberOfSamvel),
                new Student("David", 23, new Address("3568"), phoneNumberOfDavid),
                new Student("Lilit", 22, new Address("1256"), phoneNumberOfLilit),
                new Student("Ani", 20, new Address("1235"), phoneNumberOfAni)
        );

        List<Student> firstTask = students.stream()
                .filter(checkName -> checkName.getName()
                        .equals("Gagik"))
                .toList();

        System.out.println(firstTask);

        List<Student> secondTask = students.stream().
                filter(checkAddress -> checkAddress.getAddress()
                        .getZipCode()
                        .equals("1235")).toList();

        System.out.println(secondTask);


    }
}
