package PropertyTraining;

public class PostgreSqlCustomerDal implements ICustomerDAL
{
    String connectionString;
    @Override
    public void add() {
        System.out.println("PostgreSql Database'e bağlandı");
    }

    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
}
