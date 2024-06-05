
public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee(1, "Иванов Иван Иванович", 50000);
        employees[1] = new Employee(1, "Петров Сергей Семёнович", 100000);
        employees[2] = new Employee(3, "Савельев Пётр Андреевич", 70000);
        employees[3] = new Employee(2, "Кузьмин Артём Николаевич", 55000);
        employees[4] = new Employee(3, "Зюзин Николай Петрович", 68000);
        employees[5] = new Employee(4, "Подопригора Фёдор Анатольевич", 90000);
        employees[6] = new Employee(2, "Смирнов Александр Андреевич", 65000);
        employees[7] = new Employee(4, "Самойлов Филип Анатольевич", 87000);
        employees[8] = new Employee(5, "Хуань Ли Цзы", 100000);
        employees[9] = new Employee(5, "Хвостов Сидор Александрович", 88000);

        employees[2].setSalary(150000);
        employees[3].setDepartment(5);

        printEmployees();
        System.out.println("=============");
        countSalarySumm();
        System.out.println("countSalarySumm() = " + countSalarySumm());
        System.out.println("==============");
        countMinSalary();
        System.out.println("countMinSalary() = " + countMinSalary());
        System.out.println("===============");
        countMaxSalary();
        System.out.println("countMaxSalary() = " + countMaxSalary());
        System.out.println("===============");
        countMediumSalary();
        System.out.println("countMediumSalary() = " + countMediumSalary());
        System.out.println("===============");
        FIO();


    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println("employee = " + employee);
        }
    }

    public static int countSalarySumm() {
        int sum = 0;
        for (Employee employee : employees) {

            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee countMinSalary() {
        Employee min= employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee countMaxSalary() {
        Employee max = employees[0];
        for (Employee employee:employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static int countMediumSalary() {
        return countSalarySumm() / employees.length;
    }

    public static void FIO() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("employees[i].getFullName() = " + employees[i].getFullName());

        }
    }

}
