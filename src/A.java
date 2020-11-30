class A implements Runnable {

    @Override
    synchronized public void run() {
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println("Good Mrng");
            }
        }
        catch (Exception e){
            System.out.println("first thread is interrupted 1000");
        }
    }
}
