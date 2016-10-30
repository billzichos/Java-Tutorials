/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author Bill
 */
public class iPhone implements iPhoneInterface {
    int powerState = 0;
    int ringerState = 0;
    
    public void turnPowerOn(int newValue) {
        powerState = newValue;
    }
    
    public void turnPowerOff(int newValue) {
        powerState = newValue;
    }
    
    public void turnRingerOn(int newValue) {
        ringerState = newValue;
    }
    
    public void turnRingerOff(int newValue) {
        ringerState = newValue;
    }
}
