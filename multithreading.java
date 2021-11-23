     class two implements Runnable
    {
        @Override
        public void run() {

            for (int j = 0; j < 5; j++) {
                System.out.println("Second" + j);
            }

        }
    }

    class one {
        public static void main(String arg[]) {
            int a;
            a = 10;

            two t=new two();
            Thread th = new Thread(t);

            th.start();


            for (int i = 0; i < 5; i++) {
                System.out.println("First "+ i);
            }


        }
    }

