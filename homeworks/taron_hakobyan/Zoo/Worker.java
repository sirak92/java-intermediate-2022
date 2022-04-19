package com.company;

public final class Worker {
    private String id;
    private String name;
    private String surname;
    private int age;
    private int year;
    private String phone;
    private double salary;

    private Worker(WorkerBuilder workerBuilder) {
        this.id = workerBuilder.id;
        this.age = workerBuilder.age;
        this.name = workerBuilder.name;
        this.surname = workerBuilder.surname;
        this.phone = workerBuilder.phone;
        this.salary = workerBuilder.salary;
        this.year = workerBuilder.year;
    }

    public static class WorkerBuilder {
        private String id;
        private String name;
        private String surname;
        private int age;
        private int year;
        private double salary;
        private String phone;

        public WorkerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public WorkerBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public WorkerBuilder age(int age) {
            this.age = age;
            return this;
        }

        public WorkerBuilder year(int year) {
            this.year = year;
            return this;
        }

        public WorkerBuilder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public WorkerBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public WorkerBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Worker createWorker() {
            return new Worker(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }
}



