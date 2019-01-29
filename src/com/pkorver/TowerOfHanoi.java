package com.pkorver;

public class TowerOfHanoi {

    public void solveHanoi(int numDiscs, int startStick, int extraStick, int goalStick) {
        if(numDiscs == 1){
            System.out.println("Move disc from " + startStick + " to " + goalStick + ".");
        }
        else {
            solveHanoi(numDiscs - 1, startStick, goalStick, extraStick);
            System.out.println("Move disc from " + startStick + " to " + goalStick + ".");
            solveHanoi(numDiscs - 1, extraStick, startStick, goalStick);
        }
    }

    public static void main(String[] args) {
	// write your code here
        TowerOfHanoi tower = new TowerOfHanoi();
        tower.solveHanoi(3, 1 , 3, 2);
    }


}


