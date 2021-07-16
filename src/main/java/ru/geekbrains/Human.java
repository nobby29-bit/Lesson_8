package ru.geekbrains;

public class Human implements Actions{

    @Override
    public boolean run(int distance, int track) {
        boolean run = true;
        if (distance>=track){
        System.out.print("Human run "+track);
        } else {
            System.out.print("Human not run "+track);
            run = false;
        }
        return run;
    }
    @Override
    public boolean jump(int distance, int heights){
        boolean jump = true;
        if (distance>=heights){
        System.out.print("Human jump "+heights);

        } else {
            System.out.print("Human not jump "+heights);
            jump=false;
        }
        return jump;
    }
}
