import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Society_general_code_3 {
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(1);
        Thread r=new Thread(()->{System.out.println("Text");});
        r.start();
        e.shutdown();
        Thread g=new Thread(()->{System.out.println("Hello");});  //output of this
        g.start();
        //in above we are not using threadpool thread it self we crrated but not calling that so even if
        //you e.shutdown() also no problem because we created own threads and running them r and g this will work
        //if you want to work with threadpool call "Execute"
        e.execute(()->{System.out.println("thread pool");});
    }
}
