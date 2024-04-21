package ConstructorArgTraining;

public class CustomerService implements ICustomerService
{
    ICustomerDAL customerDAL;

    /**constructor-arg bean definasyonu için kullanılacak olan constructor*/
    public CustomerService(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }
    /**property ile definasyon yapmak için kullanılacak olan default constructor*/
    public CustomerService(){}


    @Override
    public ICustomerDAL getCustomerDAL() {
        return customerDAL;
    }

    @Override
    public void setCustomerDAL(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }
    @Override
    public void print()
    {
        customerDAL.add();
        System.out.println("Connection String Bağlantısı : "+customerDAL.getConnectionString());
    }



}
