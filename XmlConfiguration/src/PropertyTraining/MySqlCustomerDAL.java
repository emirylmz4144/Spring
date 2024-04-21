package PropertyTraining;

public class MySqlCustomerDAL implements ICustomerDAL {
    String connectionString;
    @Override
    public void add() {
        System.out.println("Mysql Database'e bağlandı");
    }

    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public void setConnectionString(String connectionString) {
        this.connectionString=connectionString;
    }
}
