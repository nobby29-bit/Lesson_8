package ru.geekbrains;

public class Wall implements Overcome{

    private int heights;

    @Override
    public void overcome(){
            System.out.printf("Jump over the wall \n");


    }
    public Wall(int heights){
        this.heights=heights;
    }

    public int getHeights() {
        return heights;
    }
}
