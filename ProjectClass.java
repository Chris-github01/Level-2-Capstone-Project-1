public class ProjectClass
{
    // Attributes
    private String projNum;
    private String projName;
    private String projType;
    private String projAddress;
    private String erfNum;
    private float projValue;
    private float paidToDate;
    private String deadline;

    // Constructor
    public ProjectClass(String projNum, String projName, String projType, String projAddress,
                        String erfNum, float projValue, float paidToDate, String deadline)
    {
        this.projNum = projNum;
        this.projName = projName;
        this.projType = projType;
        this.projAddress = projAddress;
        this.erfNum = erfNum;
        this.projValue = projValue;
        this.paidToDate = paidToDate;
        this.deadline = deadline;
    }

    // Getters
    public String getProjNum() {return projNum;}
    public String getProjName() {return projName;}
    public String getProjType() {return projType;}
    public String getProjAddress() {return projAddress;}
    public String getErfNum() {return erfNum;}
    public float getProjValue() {return projValue;}
    public float getPaidToDate() {return paidToDate;}
    public String getDeadline() {return deadline;}

    // Setters
    public void setProjNum(String projNum) {this.projNum = projNum;}
    public void setProjName(String projName) {this.projName = projName;}
    public void setProjType(String projType) {this.projType = projType;}
    public void setProjAddress(String projAddress) {this.projAddress = projAddress;}
    public void setErfNum(String erfNum) {this.erfNum = erfNum;}
    public void setProjValue(float projValue) {this.projValue = projValue;}
    public void setPaidToDate(float paidToDate) {this.paidToDate = paidToDate;}
    public void setDeadline(String deadline) {this.deadline = deadline;}

    // String toString Method
    public String toString()
    {
        String output = "Project number: " + projNum;
        output += "\nProject name: " + projName;
        output += "\nProject type: " + projType;
        output += "\nProject address : " + projAddress;
        output += "\nERF number : " + erfNum;
        output += "\nProject value : " + projValue;
        output += "\nAmount paid to date : " + paidToDate;
        output += "\nProject deadline : " + deadline;

        return(output);
    }

    // User method 'proj_deadline'
    public void proj_deadline(String new_deadline)
    {
        this.deadline = new_deadline;
    }

    // User method 'proj_deadline'
    public void proj_new_amount_paid(float new_paidToDate)
    {
        this.paidToDate = new_paidToDate;
    }
}
