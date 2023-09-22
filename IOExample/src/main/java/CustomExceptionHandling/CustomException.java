package CustomExceptionHandling;

/**
 *
 * @author cws
 */
public class CustomException {
    public static void main(String[] args){
        try{
            throw new MyException("Hello custom exception");
        }catch(MyException e){
            e.printStackTrace();
        }
    }
    
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
