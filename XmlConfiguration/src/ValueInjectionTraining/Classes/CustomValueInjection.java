package ValueInjectionTraining.Classes;

import java.util.Date;

public class CustomValueInjection {
    public Date dob;

    public CustomValueInjection(Date dob) {
        this.dob = dob;
    }
    public CustomValueInjection(){}

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
