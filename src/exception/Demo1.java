/**
 * 可以先捕捉ArithmeticException，然后捕捉Exception
 * 当发生ArithmeticException时，会首先被处理ArithmeticException的语句捕捉，然后直接跳到finally语句，不会再被处理Exception的语句捕捉
 * 不可以先catch Exception，然后再catch ArithmeticException，因为ArithmeticException has already been caught
 */
package exception;

public class Demo1 {
    public static void main(String[] args) {
        try{
            System.out.println(Demo1.division(9, 0));
        }catch (ArithmeticException ae) {
            ae.printStackTrace();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("finally语句已执行完毕");
        }


    }

    public static int division(int a, int b) {
        return a/b;
    }
}
