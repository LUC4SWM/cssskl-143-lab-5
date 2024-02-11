/*
 * Employee.java - Abstract
 * This is the superclass of all workers in this company.
 * All employees must have a name and social security number.
 */

// Notice the abstract keyword? That prevents us from making objects of this type!
public abstract class Employee {
    private String name;
    private int social;

    public Employee() {
    }

    public Employee(String name, int social) {
        this.name = name;
        this.social = social;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public abstract double calculateWeeklyPay();
    /* 8.1 Question Responses
    What methods are polymorphic in the Employee hierarchy?
    - calculateWeeklyPay.
    How could we build a method like getRandShape above but for use with Employees?
    - We could change the switch cases so that they create objects of the employee subclasses (like PermanentHire).
    If we built a getRandomEmployee method that returns various Employee subclass objects, write a few lines of code that would demonstrate late binding.
        public Employee getRandomEmployee{
        Employee retVal = null;
        ...
        ... case 0: retVal = new SalariedWorker(....);
        ... case 1: retVal = new HourlyWorker(...);
        ... case 2: retVal = Accountant(...);
        }

     */
}

