package Interfaces;
abstract class SmartDevice {
	 abstract void turnOn();
	 abstract void turnOff();
	}

	abstract class Adjustable extends SmartDevice {
	 abstract void setLevel(int level);
	}

	abstract class TimerControl extends Adjustable {
	 abstract void setTimer(int time);
	}

	class Light extends Adjustable {

	 void turnOn() {
	     System.out.println("Light is ON");
	 }

	 void turnOff() {
	     System.out.println("Light is OFF");
	 }

	 void setLevel(int level) {
	     System.out.println("Light brightness set to level " + level);
	 }
	}

	class Fan extends Adjustable {

	 void turnOn() {
	     System.out.println("Fan is ON");
	 }

	 void turnOff() {
	     System.out.println("Fan is OFF");
	 }

	 void setLevel(int level) {
	     System.out.println("Fan speed set to level " + level);
	 }
	}

	class AC extends TimerControl {

	 void turnOn() {
	     System.out.println("AC is ON");
	 }

	 void turnOff() {
	     System.out.println("AC is OFF");
	 }

	 void setLevel(int level) {
	     System.out.println("AC temperature set to level " + level);
	 }

	 void setTimer(int time) {
	     System.out.println("AC timer set to " + time + " minutes");
	 }
	}

	public class SmartDeviceSystem {
	 public static void main(String[] args) {

	     Light light = new Light();
	     Fan fan = new Fan();
	     AC ac = new AC();

	     light.turnOn();
	     light.setLevel(5);
	     light.turnOff();

	     System.out.println();

	     fan.turnOn();
	     fan.setLevel(3);
	     fan.turnOff();
	     System.out.println();

	     ac.turnOn();
	     ac.setLevel(24);
	     ac.setTimer(60);
	     ac.turnOff();
	 }
	}