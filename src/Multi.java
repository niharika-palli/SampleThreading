class Multi {
   /* public void run(){
        System.out.println("thread is running");
    }*/

    public static void main(String[] args) {
        // Multi t1 = new Multi();
        // t1.start();

        A a = new A();
        B b = new B();
        C c = new C();
        Thread t = new Thread(a);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(c);
        t.start();
        t1.start();
        t2.start();
    }

    }



