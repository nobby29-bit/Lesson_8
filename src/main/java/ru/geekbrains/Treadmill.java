package ru.geekbrains;

public class Treadmill implements Overcome {
    private int track;

    @Override
    public void overcome(){

            System.out.printf("Running on a treadmill %d\n");


    }
    public Treadmill(int track){
        this.track = track;
    }


    public int getTrack() {
        return track;
    }
}
