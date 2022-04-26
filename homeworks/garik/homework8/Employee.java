package zoo;

public class Employee {
    private String departament;
    private int salary;
    private int quanity;

    public Employee(String departament, int salary, int quanity) {
        this.departament = departament;
        this.salary = salary;
        this.quanity = quanity;
    }

    public String getDepartament() {

        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getQuanity() {
        return quanity;
    }
    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
    public void salaryIncrease(int salary){
        if(salary>40000){
            salary=salary+25000;
            System.out.println("Employess salary =  "+ salary);
        }
    }
}
