/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Mayssa
 */
public class Ticker {
     Timer timer;

    public Ticker(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }
}
