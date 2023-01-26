
public class Employee {
    // constructor same name as class not return type
    // it creates/initialise objects in ram
    //you can use contructor block to initialiaze some default values

    int id;
    java.lang.String dept;

    public Employee(int idd, java.lang.String string) {
        id = idd;
        dept = string;
    }

    public static void main(String[] args) {
        Employee bro = new Employee(34,"boomer");
        System.out.println(bro.dept);
    }
}