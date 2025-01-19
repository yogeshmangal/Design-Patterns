public class Test {
    public static void main(String[] args) throws Exception {
        EmployeeDAO employeeDAO = new EmployeeDAOProxy();
        employeeDAO.create("ADMIN", new Employee());
        employeeDAO.delete("ADMIN", 1);
        employeeDAO.get("USER", 1);
    }
}
