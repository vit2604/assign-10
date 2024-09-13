
package assi10;

import java.util.Date;


public abstract class Person implements IPerson{
        private String id;
        private String fullName;
        private Date dateOfbirth;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }
    
    public abstract void displayInfo();
}
