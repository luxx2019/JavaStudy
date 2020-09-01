/**
 * 静态函数中，不可以使用this，super等关键字
 */
package exception;

public class Demo2 {
    public static void main(String[] args) {
        try{
            System.out.println(Demo2.division(101, 10));
        }catch (ArithmeticException ae) {
            ae.printStackTrace();
        }catch(MyException me) {
            me.printStackTrace();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("finally语句已执行完毕");
        }
    }

    public static int division(int a, int b) throws MyException, ArithmeticException {
        if (b == 0)
            throw new ArithmeticException();
        if (a > 100 || b > 100)
            throw new MyException("数值太大了");
        return a/b;
    }
}

class MyException extends Exception {
    public MyException (String ExceptionMessage) {
        super(ExceptionMessage);
    }
}