package ru.geekbrains;

public class Cat implements Actions {

    @Override
    public boolean run(int distance, int track){
        boolean run = true;
        if (distance>=track){
        System.out.print("Cat run "+track);
        } else {
            System.out.print("Cat not run "+track);
            run = false;
        }
        return run;
    }
    @Override
    public boolean jump(int distance, int heights){
        boolean jump = true;
        if (distance>=heights){
        System.out.print("Cat jump "+heights);
        } else {
            System.out.print("Cat not jump "+heights);
            jump=false;
        }
        return jump;
    }

}
