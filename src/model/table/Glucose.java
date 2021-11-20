/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author angel
 */
public class Glucose {
    private LocalDate data;
    private int breakfast;
    private int lunch;
    private int snack1;
    private int snack2;
    private int dinner;
    private int midnight;
    private String email;

    public LocalDate getData() {
        return data;
    }

    public String getEmail() {
        return email;
    }

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
        this.breakfast = breakfast < 30 && breakfast > 499 ? 40 : breakfast;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch < 30 && lunch > 499? 40 : lunch;
    }

    public void setSnack1(int snack1) {
        this.snack1 = snack1 < 30 && snack1 > 499 ? 40 : snack1;
    }

    public void setSnack2(int snack2) {
        this.snack2 = snack2< 30 && snack2 > 499 ? 40 : snack2;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner < 30 && dinner > 499 ? 40 : dinner;
    }

    public void setMidnight(int midnight) {
        this.midnight = midnight < 30 && midnight > 499 ? 40 : midnight;
    }
    
    public void setEmail(String email) {
        this.email = email.trim().isEmpty() ? "qpwoopweopqwpoqpopo@odf.com" : email.toLowerCase();
    }    
    
    public void setData(LocalDate data) {
        this.data = data == null ? LocalDate.now() : LocalDate.now();
    }    
}
