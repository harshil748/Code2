class JoinEx extends Thread {
    public static void main(String[] args) {
        JoinEx t1 = new JoinEx();
        JoinEx t2 = new JoinEx();
        JoinEx t3 = new JoinEx();
        t1.start();
        try {
            t1.join(); // join(milliseconds)
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
