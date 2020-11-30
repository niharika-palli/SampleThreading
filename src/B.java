class B implements Runnable {
    @Override
    synchronized public void run() {
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println("Hello");
            }
        }
        catch(Exception e2){
            System.out.println("Second thread is interrupted");
        }
    }
}
