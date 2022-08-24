package gzmtu.xt.dzsw.entity;

public class User {
    private String account;
    private String pwd;
    private boolean result = false;

    public void setAccount(String account) {
        this.account = account;
    }
    public String getAccount() {
        return account;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getPwd() {
        return pwd;
    }

    public boolean login(){
        if (account.equals("admin")&&pwd.equals("123456")){
            result = true;
        }
        return result;
    }
}
