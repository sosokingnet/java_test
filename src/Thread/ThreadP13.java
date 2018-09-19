package Thread;
// common

/**
 * Created by Administrator on 2018/9/1.
 */
class LoginServlet{
    private static String usernameRef;
    private static String passwordRef;
    public static void doPost(String username,String password){
        try{
            usernameRef = username;
            if (username.equals("a")){
                Thread.sleep(50);
            }
            passwordRef = password;
            System.out.println("username=" + username + "; Password=" + password);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ALogin implements Runnable{
    public void run(){
        LoginServlet.doPost("a","a.pass");
    }
}

class BLogin implements Runnable{
    public void run(){
        LoginServlet.doPost("b","b.pass");
    }
}

public class ThreadP13 {
     public static void main(String [] args){
         Thread a = new Thread(new ALogin());
        a.start();
         Thread b  = new Thread(new BLogin());
         b.start();
     }
}
