/**
 * Created by e165757 on 2016/12/02.
 */
public class Report5 {
    public static void main(String args[]) throws NullPointerException {
           try{ String str = null;
            str.length();
        }catch (NullPointerException e){
               System.out.println("”NullPointerException”が発生");
               e.printStackTrace();
           }

    }
}
