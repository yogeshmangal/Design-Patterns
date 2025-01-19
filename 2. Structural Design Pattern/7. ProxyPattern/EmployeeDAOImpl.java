public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void create(String client, Employee employee) {
        System.out.println("Created new row in the Employee table");
    }

    @Override
    public void delete(String client, int empId) {
        System.out.println("Deleted row with emp id: " + empId);
    }

    @Override
    public Employee get(String client, int empId) {
        System.out.println("Fetching data from the DB");
        return new Employee();
    }
}
