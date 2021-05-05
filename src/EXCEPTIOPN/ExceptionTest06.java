package EXCEPTIOPN;

public class ExceptionTest06 {
    public static void main(String[] args) {

        Arrytest at =new Arrytest();
        try {
            at.push( 6 );
            at.push( 6 );
            at.push( 6 );
            at.push( 6 );
            at.push( 6 );
            at.push( 6 );
            at.push( 6 );

        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
