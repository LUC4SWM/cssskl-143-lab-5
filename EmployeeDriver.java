import java.util.ArrayList;

/*
 * Driver for Lab 5
 *
 * A simple driver to exercise the Employee hierarchy
 */
public class EmployeeDriver {
    public static void main(String[] args) {
        Accountant emp1 = new Accountant("Rick", 123456789);
        // this next employee makes a bit more than Rick
        Accountant emp2 = new Accountant("Tim", 55555555, 10000);
        // and lets make an hourly worker
        HourlyWorker emp3 = new HourlyWorker("Jim", 11111111);
        // then a salaried worker
        SalariedWorker emp4 = new SalariedWorker("Jane", 222222222, 5000);
        HourlyWorker emp5 = new HourlyWorker("Joe", 11111111, 20);

        // TODO Build some PermanentHire and Consultant objects here
        // and add them to the ArrayList below
        PermanentHire emp6 = new PermanentHire("CARY",192837465,4000);
        Consultant emp7 = new Consultant("YVES", 123456432, 40);



        // Build a set of workers, all of which are employees
        ArrayList<Employee> myEmployees = new ArrayList<Employee>();

        myEmployees.add(emp1);
        myEmployees.add(emp2);
        myEmployees.add(emp3);
        myEmployees.add(emp4);
        myEmployees.add(emp5);
        // TODO Add a sixth and seventh employee to this list that you create
        myEmployees.add(emp6);
        myEmployees.add(emp7);
        // This code doesn't need to change, even if you add ten new employee classes and
        // add 102 new employees - this is an example of the generic code that can be written
        // when inheritance hierarchies are in use.

        /* 4.7/5.5 RESPONSES: ColorWithAlpha s = new ColorWithAlpha(255,0,255,10);
        myEmployees.add(s);
        If i try adding this ColorWithAlpha to the ArrayList of employees and running it, I get an error message saying "incompatible types" because the ArrayList is only set up to take Employee objects or objects from Employee's subclasses. Same issue rises when I try adding a color exception to the ArrayList. If I want it to store both color exceptions and employees, I would need to change how the ArrayList is declared so it's type is set to a class that both classes extend, so probably the Object class.
        */

        for (int i = 0; i < myEmployees.size(); i++) {
            Employee current = myEmployees.get(i);
            System.out.println(current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
        }
    }
}
