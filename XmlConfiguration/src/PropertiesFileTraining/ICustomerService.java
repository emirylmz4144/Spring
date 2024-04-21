package PropertiesFileTraining;

public interface ICustomerService
{
    ICustomerDAL getCustomerDAL();
    void setCustomerDAL(ICustomerDAL customerDAL);
    void print();

}
