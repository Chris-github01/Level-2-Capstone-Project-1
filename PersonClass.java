public class PersonClass
{
    // Attributes
    String name;
    String teleNum;
    String email;
    String compAddress;

    // Constructor
    public PersonClass(String name, String teleNum, String email, String compAddress)
    {
        this.name = name;
        this.teleNum = teleNum;
        this.email = email;
        this.compAddress = compAddress;
    }

    // Getters
    public String getName() {return name;}
    public String getTeleNum() {return teleNum;}
    public String getEmail() {return email;}
    public String getCompAddress() {return compAddress;}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setTeleNum(String teleNum) {this.teleNum = teleNum;}
    public void setEmail(String email) {this.email = email;}
    public void setCompAddress(String compAddress) {this.compAddress = compAddress;}

    // String toString Method
    public String toString()
    {
        String output = "Name: " + name;
        output += "\nTelephone Number: " + teleNum;
        output += "\nEmail Address: " + email;
        output += "\nCompany Address: " + compAddress;

        return(output);
    }

    // User method 'phone_num'
    public void phone_num(String new_teleNum)
    {
        this.teleNum = new_teleNum;
    }

    // User method 'email_address'
    public void email_address(String new_email)
    {
        this.email = new_email;
    }
}