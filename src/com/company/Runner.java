package com.company;

public class Runner extends Thread {

    private Runner nextRunner;

    public Runner(String name, Runner nextRunner) {
        super(name);
        this.nextRunner = nextRunner;
    }

    public Runner(String name) {
        super(name);
    }

    public void run() {
        try {
            if (nextRunner != null) {
                System.out.println(this.getName()+" берет палочку");
                sleep(1000);
                System.out.println(this.getName() + " бежит к " + nextRunner.getName());
                sleep(2000);
                nextRunner.start();
                nextRunner.join();
            }else{
                System.out.println(this.getName()+" бежит к финишу");

            sleep(2000);
            }

            if (nextRunner != null){
                System.out.println(nextRunner.getName()+" берет палочку");
                sleep(1000);
                System.out.println(nextRunner.getName()+" бежит к "+this.getName());
                sleep(2000);
            }
            if (this.getName().equals("Runner 1")){
                System.out.println(this.getName()+" берет палочку и бежит к финишу");
            }

        }catch(Exception e){}
    }
}
