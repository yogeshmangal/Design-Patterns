public class EmployeeDAOProxy implements EmployeeDAO {

    private EmployeeDAO employeeDAO;

    public EmployeeDAOProxy() {
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDAO.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDAO.delete(client, empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER"))
            return employeeDAO.get(client, empId);
        throw new Exception("Access Denied");
    }
}
