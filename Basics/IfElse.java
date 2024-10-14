
public class IfElse {
    public static void main(String[] args) {

        int salary = 12000;
        // if (salary > 13000) {
        // System.out.println("Salary Exceeded");
        // } else {
        // System.out.println("Salary Do not exceeded");
        // }
        if (salary > 10000) {
            salary += 200;

        } else if (salary > 2000) {
            salary += 300;

        } else {
            salary += 100;
        }
        System.out.println(salary);
    }

}