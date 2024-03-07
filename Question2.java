import java.util.Scanner;

interface Taxable{
    double salesTax=0.07;
    double incomeTax=0.105;
    void calcTax();
}
class Employee implements Taxable{
    private Integer empId;
    private String empName;
    private double salary;
    
    
    public Employee() {
    }

    public Employee(Integer empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calcTax(){
        double taxToBePaid;
        taxToBePaid=salary*incomeTax;
        System.out.println("Income Tax to be paid is="+taxToBePaid);
    }
}
class Product implements Taxable{
    private Integer pid;
    private Integer price;
    private double quantity;
    

    public Product() {
    }

    public Product(Integer pid, Integer price, double quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void calcTax(){
        double salesTaxToBePaid;
        salesTaxToBePaid=quantity*price*salesTax;
        System.out.println("Sales Tax to be paid is="+salesTaxToBePaid);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of the employee:");
        System.out.println("Enter the employee id:");
        int empId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the employee name:");
        String empName=sc.nextLine();
        System.out.println("Enter the employee salary:");
        double salary=sc.nextDouble();
        Employee emp=new Employee(empId,empName,salary);
        emp.calcTax();//Dispays the income tax to be paid by the employee

        System.out.println("Enter the details of the product:");
        System.out.println("Enter the product id:");
        int pid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product price:");
        int price=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product quantity:");
        double quantity=sc.nextInt();
        sc.nextLine();
        Product pro=new Product(pid,price,quantity);
        pro.calcTax();//Dispays the sales tax of the product






        
    }
    
}
