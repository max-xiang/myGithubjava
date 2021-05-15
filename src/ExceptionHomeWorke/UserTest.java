package ExceptionHomeWorke;

public class UserTest {
    public static void main(String[] args) {
        java.util.Scanner s =new java.util.Scanner( System.in );

        System.out.println("欢迎使用智慧星系统，下面来完成注册吧");
        LoginTest lt =new LoginTest();


        System.out.println("usename:");
        String usename=s.next();

        System.out.println("passwd:");
        String passwd =s.next();

        try {
            lt.register( usename,passwd );
            String str =lt.getUserPasswd();
            System.out.println(str);
        } catch (LoginException e) {
            System.out.println( e.getMessage());
            /*e.printStackTrace();*/
        }




    }
}
