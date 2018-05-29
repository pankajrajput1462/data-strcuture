package predicateexample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

    public static    Predicate<Employee> isAdultMale() {
        return employee -> employee.getAge() > 21 && employee.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale() {
        return employee -> employee.getAge() > 21 && employee.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMore(Integer age) {
        return employee -> employee.getAge() > age;
    }

    public static List<Employee> filterEmployee(List<Employee> employees, Predicate<Employee> employeePredicate)
    {
        return employees.stream().filter(employeePredicate).collect(Collectors.toList());
    }

}
