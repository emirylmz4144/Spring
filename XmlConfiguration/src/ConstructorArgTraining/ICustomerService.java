package ConstructorArgTraining;

public interface ICustomerService
{
    ICustomerDAL getCustomerDAL();
    void setCustomerDAL(ICustomerDAL customerDAL);
    void print();

}
