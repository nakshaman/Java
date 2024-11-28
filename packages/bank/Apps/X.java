package bank.Apps;

class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class X{
    public static void main(String args[]){
        Account a1=new Account();
        a1.name="Apna college";
        a1.email="apnacollage@gmail.com";
        a1.setPassword("naksh@07");
        String password=a1.getPassword();
        System.out.println(password);
    }
}