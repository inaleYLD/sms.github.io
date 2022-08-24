package gzmtu.xt.dzsw.entity;

public class Student {
    private String sid;
    private String sname;
    private int male;
    private String major;
    private String remarks;

    public String getSid(){
        return sid;
    }
    public void setSid(String sid){
        this.sid=sid;
    }
    public String getSname(){
        return sname;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public int getMale(){
        return male;
    }
    public String getSex(){
        switch (male){
            case 0:
                return "男";
            case 1:
                return "女";
        }
        return "";
    }

    public void setMale(int male) {
        this.male=male;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public String getRemarks(){
        return remarks;
    }
    public void setRemarks(String remarks){
        this.remarks=remarks;
    }

    @Override
    public String toString() {
        return "sid=" + sid + " sname=" + sname + " male=" + male + " major=" + major + " remarks=" + remarks;
    }
}
