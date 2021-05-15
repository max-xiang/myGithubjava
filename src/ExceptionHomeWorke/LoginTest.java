package ExceptionHomeWorke;

public class LoginTest {
    String usename;
    String passwd;

    public void register(String usename,String passwd) throws LoginException {

        if (usename.length()>=4 && usename.length()<=6){
            this.usename=usename;
            /*LoginException e=new LoginException("用户名要在6到8个字符");
            throw e;*/
        }else
            throw  new LoginException("注册失败，用户名要在6到8个字符！！！");
        this.passwd=passwd;

    }

    public String  getUserPasswd() {
        return "您的用户名是："+usename+" 密码是："+passwd+" 请妥善保存!";
    }


}
