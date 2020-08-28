public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours);
        super.setSalary(hours * 456);
    }

    @Override
    public int getSalary(){
        return super.getSalary();
    }
}
