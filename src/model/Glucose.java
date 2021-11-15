/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author angel
 */
public class Glucose {
    private int breakfast;
    private int lunch;
    private int snack1;
    private int snack2;
    private int dinner;
    private int midnight;

    public int getBreakfast() {
        return breakfast;
    }

    public int getLunch() {
        return lunch;
    }

    public int getSnack1() {
        return snack1;
    }

    public int getSnack2() {
        return snack2;
    }

    public int getDinner() {
        return dinner;
    }

    public int getMidnight() {
        return midnight;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public void setSnack1(int snack1) {
        this.snack1 = snack1;
    }

    public void setSnack2(int snack2) {
        this.snack2 = snack2;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    public void setMidnight(int midnight) {
        this.midnight = midnight;
    }
}
