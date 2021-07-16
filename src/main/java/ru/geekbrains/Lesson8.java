package ru.geekbrains;

import java.util.Random;

public class Lesson8 {
    public static Random rand = new Random();

    public static void main(String[] args){

        Actions [] participants ={
          new Cat(),
          new Human(),
          new Robot()
        };

        Overcome[] overcomes = new Overcome[4];

        Distance treadmill = Distance.MAX_DISTANCE_RUN;
        Distance wall = Distance.MAX_DISTANCE_JUMP;
        for (int i=0; i<4; i++){
            overcomes[i] = new Treadmill(rand.nextInt(treadmill.distance));
            for (int j=1; j<4; j++){
                if (j!=2){
                overcomes[j] = new Wall(rand.nextInt(wall.distance));
                }
            }
        }

        for (Actions actions: participants){
            int track = 0;
            int heights = 0;
            if (actions instanceof Cat){
                Distance treadmillParticipants = Distance.MAX_DISTANCE_RUN_CAT;
                Distance wallParticipants = Distance.MAX_DISTANCE_JUMP_CAT;
                track = treadmillParticipants.distance;
                heights = wallParticipants.distance;
            } else  if (actions instanceof Human){
                Distance treadmillParticipants = Distance.MAX_DISTANCE_RUN_HUMAN;
                Distance wallParticipants = Distance.MAX_DISTANCE_JUMP_HUMAN;
                track = treadmillParticipants.distance;
                heights = wallParticipants.distance;
            } else {
                Distance treadmillParticipants = Distance.MAX_DISTANCE_RUN_ROBOT;
                Distance wallParticipants = Distance.MAX_DISTANCE_JUMP_ROBOT;
                track = treadmillParticipants.distance;
                heights = wallParticipants.distance;
            }

            for (int i=0;i<overcomes.length;i++) {

               if(overcomes[i] instanceof Wall)
                   if (actions.jump(heights,((Wall) overcomes[i]).getHeights())){}
               else {System.out.printf("\n");
                       break;};
                System.out.printf("\n");
                if(overcomes[i] instanceof Treadmill)
                    if(actions.run(track, ((Treadmill) overcomes[i]).getTrack())){}
                else{
                        System.out.printf("\n");
                        break;};
                System.out.printf("\n");
            }
        }
    }
}
