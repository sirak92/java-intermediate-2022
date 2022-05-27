package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Main {

    public static void main(String[] args) {

        List<Student> students = setStudents();
        List<TempStudent> tempStudents = setTempStudents();


        Optional<Student> s = students.stream()
                .filter(student -> student
                        .getName()
                        .equals("Gagik"))
                .findFirst();
        // System.out.println(s);

        List<Student> withNum3333 = students.stream()
                .filter(student -> student
                        .getMobileNumbers()
                        .stream()
                        .anyMatch(mobileNumber -> mobileNumber.getNumber().equals("3333")))
                .toList();

        //   withNum3333.forEach(System.out::println);

        List<Student> withNum1233 = students.stream()
                .filter(student -> student
                        .getMobileNumbers()
                        .stream()
                        .anyMatch(mobileNumber -> mobileNumber.getNumber().equals("1233"))).toList();
        List<Student> withNum1233And1234 = withNum1233.stream()
                .filter(student -> student.getMobileNumbers()
                        .stream().anyMatch(mobileNumber -> mobileNumber.getNumber().equals("1234"))).toList();
        //    withNum1233And1234.forEach(System.out::println);

        Optional<Student> withId1235 = students
                .stream()
                .filter(student -> student.getAddress().getZipcode().equals("1235"))
                .findFirst();
        //  System.out.println(withId1235);


        List<String> listStudent = students
                .stream()
                .map(Student::getName).toList();
        // listStudent.forEach(System.out::println);

        List<String> sortedList = listStudent.stream()
                .sorted().toList();
        // sortedList.forEach(System.out::println);




    }

    private static List<Student> setStudents() {
        List<MobileNumber> mobileNumbersAsh = new ArrayList<>();
        mobileNumbersAsh.add(0, new MobileNumber("3333"));
        mobileNumbersAsh.add(1, new MobileNumber("1236598"));
        List<MobileNumber> mobileNumbersGag = new ArrayList<>();
        mobileNumbersGag.add(0, new MobileNumber("1233"));
        mobileNumbersGag.add(1, new MobileNumber("1234"));
        List<MobileNumber> mobileNumbersArm = new ArrayList<>();
        mobileNumbersArm.add(0, new MobileNumber("3333"));
        List<MobileNumber> mobileNumbersNar = new ArrayList<>();
        mobileNumbersNar.add(0, new MobileNumber("1233"));
        List<MobileNumber> mobileNumbersAn = new ArrayList<>();
        mobileNumbersAn.add(0, new MobileNumber("1233"));
        mobileNumbersAn.add(1, new MobileNumber("1234"));
        List<MobileNumber> mobileNumbersGar = new ArrayList<>();
        mobileNumbersGar.add(0, new MobileNumber("45697852"));


        return List.of(
                new Student("Ashot", 20, new Address("1254"), mobileNumbersAsh),
                new Student("Gagik", 19, new Address("12365"), mobileNumbersGag),
                new Student("Armen", 23, new Address("5648"), mobileNumbersArm),
                new Student("Narine", 21, new Address("1254"), mobileNumbersNar),
                new Student("Ani", 18, new Address("1235"), mobileNumbersAn),
                new Student("Garik", 22, new Address("1254"), mobileNumbersGar)

        );

    }

    private static List<TempStudent> setTempStudents() {
        List<MobileNumber> mobileNumbersDav = new ArrayList<>();
        mobileNumbersDav.add(0, new MobileNumber("1111"));
        List<MobileNumber> mobileNumbersGug = new ArrayList<>();
        mobileNumbersGug.add(0, new MobileNumber("2222"));
        mobileNumbersGug.add(1, new MobileNumber("5555"));


        return List.of(
                new TempStudent("Davo", 32, new Address("1111"), mobileNumbersDav),
                new TempStudent("Gugo", 35, new Address("5225"), mobileNumbersGug)
        );


    }
}
