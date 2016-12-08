/**
 * Created by e165757 on 2016/12/02.
 */
public class Report5 {
    public static void main(String args[]) throws NullPointerException {
        try{ String str = "3．14";
            double value;
            str.length();
            value=Double.parseDouble(str);
        }catch (NullPointerException e){
               System.out.println("”NullPointerException”が発生");
               e.printStackTrace();
           }

    }
}
