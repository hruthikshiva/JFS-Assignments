import java.util.ArrayList;
import java.util.List;
class Manager extends Assignment2Q2 {
	//method overriding
    Manager(int id, int salary) {
        super(id, salary);
    }
    public int getSalary(int salary ) {
    	//method overriding
        int incentive = 10000;
        salary += incentive;
        salaryEarned += salary;
        employeeSalaries.add(salaryEarned);
        return (salary);
    }
}
class Labour extends Assignment2Q2 {
    Labour(int id, int salary) {
        super(id, salary);
    }
    public int getSalary(int salary) {
        int overtime = 1000 ;
        int salaryForHours = (salary/365)/9;
        salary += (salaryForHours*1.5)*overtime;
        return salary;
    }
}
public  class Assignment2Q2 {
    int salary=10000;
    int salaryEarned = 0 ;
    int id;
    static int total;
    static List<Integer> employeeSalaries;
    Assignment2Q2(int id ,int salary){
        this.id = id ;
        this.salary = salary;
        salaryEarned = 0;
    }
    public int getSalary(int salary){
        return salary;
    }
    public  int recivedSalary() {
        salary = getSalary(salary);
        salaryEarned += salary;
        return salaryEarned;
    }
    public static int totalEmployeesSalary(List<Integer> employeeSalaries){
        for(int i =0;i<employeeSalaries.size();i++){
             total += employeeSalaries.get(i);
        }
        return total;
    }
    public static void main(String[] args) {
        employeeSalaries = new ArrayList<>();
        Assignment2Q2 EMP1 = new Assignment2Q2(1,20000);
        Assignment2Q2 EMP2 = new Assignment2Q2(2,60000);
        Manager EMP3 = new Manager(2,60000);
        Labour EMP4 = new Labour(2,10000);
        employeeSalaries.add(EMP1.recivedSalary());
        employeeSalaries.add(EMP2.recivedSalary());
        employeeSalaries.add(EMP3.recivedSalary());
        employeeSalaries.add(EMP4.recivedSalary());
        System.out.println(totalEmployeesSalary(employeeSalaries));
    }

}
