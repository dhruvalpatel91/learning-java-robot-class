package com.test.run;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class JavaRunTest {
	public static final int TIME = 5000;
	public static final int MAX_Y = 500;
	public static final int MAX_X = 500;

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		Random random = new Random();while(true)
		{
			robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
			Thread.sleep(TIME);
		}
	}
	}


