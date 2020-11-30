class C implements Runnable {
    @Override
    synchronized public void run() {
        try{
            for(int i=0;i<5;i++)
            {
                Thread.sleep(1000);
                System.out.println("G1");
            }
        }
        catch(Exception e3)
        {
            System.out.println("Third thread is interupted");
        }
    }
}
