package hw5;

/**
 * web_21M
 * 02 10 : 45
 */
public class Salary {
    public static void main(String[] args) {
        System.out.println(findSalary(10));
        System.out.println(findSalary(16));
    }

    public static double findSalaryOne(int year) {
        double basicSalary = 500;
        if (year <= 3) {
            return basicSalary;
        } else if (year > 3) {
            //10%
            return basicSalary * 1.1;
        } else if (year > 5) {
            // 50%
            return basicSalary * 1.5;
        } else if (year > 10) {
            //100%
            return basicSalary * 2;
        } else {
            //150%
            return basicSalary * 2.5;
        }
    }

    public static double findSalary(int year) { //16
        double basicSalary = 500;
        double salaryCooficient = 1;
        if (year >= 15) {
            salaryCooficient = 2.5;
        } else if (year >= 10) {
            salaryCooficient = 2;
        } else if (year >= 5) {
            salaryCooficient = 1.5;
        } else if (year >= 3) {
            salaryCooficient = 2.1;
        }

        /* else {
            salaryCooficient = 1;
        }*/
        double finalSalary = basicSalary * salaryCooficient;

        return finalSalary;
    }

}
