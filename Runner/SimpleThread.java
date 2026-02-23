public class SimpleThread
{
    public static void main(String[] args)
    {
        SimpleRunner r = new SimpleRunner("Flash");
        SimpleRunner r2 = new SimpleRunner("Superman");
        Thread t1 = new Thread (r);
        t1.start();
        Thread t2 = new Thread (r2);
        t2.start();
    }
}




class SimpleRunner implements Runnable
{
    private String name;


    public SimpleRunner(String n)
    {
        this.name = n;
    }




    int i=0;
    public void run()
    {
        for(i=0; i<=100; i++){
            System.out.println(name + " " + i++ + " secondi avanti");
        }


        try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e){
                e.printStackTrace();
            }


            int winner = 0;


            switch (winner) {
                case 1:
                   
                }
                   
                    break;
           
                default:
                    break;
            }
    }
}



