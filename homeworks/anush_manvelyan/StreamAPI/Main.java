package tech42;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<MobileNumber> mobileNumbersGagik = List.of(new MobileNumber("1"), new MobileNumber("2"));
        List<MobileNumber> mobileNumbersAftandil = List.of(new MobileNumber("1"), new MobileNumber("2"));
        List<MobileNumber> mobileNumbersMamikon = List.of(new MobileNumber("1234"), new MobileNumber("3435"), new MobileNumber("1233"));
        List<MobileNumber> mobileNumbersSrapion = List.of(new MobileNumber("3333"), new MobileNumber("123"));
        List<MobileNumber> mobileNumbersAzgush = List.of(new MobileNumber("1233"), new MobileNumber("1234"));
        List<MobileNumber> mobileNumbersVaghinak = List.of(new MobileNumber("0123"), new MobileNumber("3333"));


        List<Student> students = List.of(new Student("Gagik", 5, new Address("1111"),
                        mobileNumbersGagik),
                new Student("Aftandil", 2, new Address("1235"),
                        mobileNumbersAftandil),
                new Student("Mamikon", 7, new Address("0000"),
                        mobileNumbersMamikon),
                new Student("Srapion", 103, new Address("3333"),
                        mobileNumbersSrapion),
                new Student("Azgush", 13, new Address("11"),
                        mobileNumbersAzgush),
                new Student("Vaghinak", 111, new Address("3333"),
                        mobileNumbersVaghinak)
        );

        System.out.println("\n");

//        Get student with exact match name “gagik”
        List<Student> aboutGagik = students.stream()
                .filter(name -> name.getName().equals("Gagik"))
                .collect(Collectors.toList());

        System.out.println(aboutGagik.toString());
        System.out.println();

//        Get student with matching address “1235"
        List<Student> address1235 = students.stream()
                .filter(address -> address.getAddress().getZipcode().equals("1235"))
                .collect(Collectors.toList());

        System.out.println(address1235.toString());
        System.out.println();

//        Get all student having mobile numbers 3333.
        List<Student> numbers3333 = students.stream()
                .filter(student -> student.getMobileNumbers().stream()
                        .anyMatch(all3 -> Objects.equals(all3.getNumber(), "3333")))
                .collect(Collectors.toList());

        System.out.println(numbers3333);
        System.out.println();

//        Get all student having mobile number 1233 and 1234
        List<Student> number1233And1234 = students.stream()
                .filter(student -> student.getMobileNumbers().stream()
                        .allMatch(allData -> Objects.equals(allData.getNumber(), "1233")
                                && Objects.equals(allData.getNumber(), "1234")))
                .collect(Collectors.toList());

        System.out.println();

//        Create a List<Student> from the List<TempStudent>
        List<MobileNumber> mobileNumbersVzgo = List.of(new MobileNumber("5656"), new MobileNumber("1414"));
        List<MobileNumber> mobileNumbersPaylak = List.of(new MobileNumber("8989"), new MobileNumber("0303"));

        List<TempStudent> tempStudents = List.of(new TempStudent("Vardtiter", 9, new Address("1212"), mobileNumbersVzgo),
                new TempStudent("Paylak", 4, new Address("4114"), mobileNumbersPaylak));

        List<Student> newList = tempStudents.stream()
                .map(tempStudent -> new Student(tempStudent.name, tempStudent.age, tempStudent.address, tempStudent.mobileNumbers))
                .collect(Collectors.toList());

        System.out.println(newList);
        System.out.println();

//        Convert List<Student> to List<String> of student name
        List<String> studentsName = students.stream()
                .map(studentName -> studentName.getName())
                .collect(Collectors.toList());

        System.out.println(studentsName);
        System.out.println();

//        Convert List<students> to String
        String listToString = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining("\n"));
        System.out.println(listToString);
        System.out.println();

//        Change the case of List<String>
        List<String> listOfString = List.of(listToString);

        listOfString.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        listOfString.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println();

//        Sort List<String>
        List<String> sortList = Arrays.asList("Gagik", "Aftandil", "Vaghinak", "Azgush");
        sortList.stream()
                .sorted().forEach(System.out::println);

        System.out.println();

//        Conditionally apply Filter condition, say if flag is enabled then.
        Stream<String> forCondition = sortList
                .stream()
                .filter(name -> name.contains("f"));

        forCondition.forEach(
                name -> System.out.println(name)
        );

        System.out.println();

        students.stream()
                .filter(student -> student.getAge() > 100)
                .findAny()
                .ifPresent(System.out::println);
    }
}


