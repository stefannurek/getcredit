package adam.sawicki.getcredit.models;

public class RequestForm {

    private int monthCash;
    private int minusCash;
    private int creditTime;
    private int creditCash;

    public RequestForm(int monthCash, int minusCash, int CreditTime, int creditCash) {
        this.monthCash = monthCash;
        this.minusCash = minusCash;
        this.creditTime = creditTime;
        this.creditCash = creditCash;
    }

    public RequestForm() {
    }

    public int getMonthCash() {
        return monthCash;
    }

    public int getMinusCash() {
        return minusCash;
    }

    public int getCreditTime() {
        return creditTime;
    }

    public int getCreditCash() {
        return creditCash;
    }


    public void setMonthCash(int monthCash) {
        this.monthCash = monthCash;
    }

    public void setMinusCash(int minusCash) {
        this.minusCash = minusCash;
    }

    public void setCreditTime(int creditTime) {
        this.creditTime = creditTime;
    }

    public void setCreditCash(int creditCash) {
        this.creditCash = creditCash;
    }
}
