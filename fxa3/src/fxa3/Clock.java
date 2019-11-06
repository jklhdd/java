/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxa3;

/**
 *
 * @author Long
 */
public class Clock {
    protected Integer minute;
    protected Integer second;

    public Clock() {
    }

    public Clock(Integer minute, Integer second) {
        this.minute = minute;
        this.second = second;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
    
    
}
