package az.trainticket.TrainTicket.entity;

public class User {
    private  String fName;
    private  String lName;
    private  String pWord;
    private  String addR;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    public String getAddR() {
        return addR;
    }

    public void setAddR(String addR) {
        this.addR = addR;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public long getPhNo() {
        return phNo;
    }

    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }

    private  String mailId;
    private  long phNo;

}
