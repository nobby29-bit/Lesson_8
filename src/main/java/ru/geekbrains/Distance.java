package ru.geekbrains;

public enum Distance {

    MAX_DISTANCE_RUN_CAT(500),
    MAX_DISTANCE_JUMP_CAT(800),
    MAX_DISTANCE_RUN_HUMAN(1500),
    MAX_DISTANCE_JUMP_HUMAN(800),
    MAX_DISTANCE_RUN_ROBOT(3500),
    MAX_DISTANCE_JUMP_ROBOT(200),
    MAX_DISTANCE_RUN(4500),
    MAX_DISTANCE_JUMP(1000);

    public int distance;

    Distance(int distance){
        this.distance=distance;

    }

}
