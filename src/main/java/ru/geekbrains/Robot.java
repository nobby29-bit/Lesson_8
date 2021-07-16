package ru.geekbrains;

public class Robot implements Actions{

    @Override
    public boolean run(int distance, int track){
        boolean run = true;
        if (distance>=track){
        System.out.print("Robot run "+track);
        } else {
            run = false;
            System.out.print("Robot not run "+track);
        }
        return run;
    }
    @Override
    public boolean jump(int distance, int heights) {
        boolean jump = true;
        if (distance>=heights){
        System.out.print("Robot jump "+heights);
        } else {
            System.out.print("Robot not jump "+heights);
            jump=false;
        }
        return jump;
    }


}
