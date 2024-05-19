package Car_Chapter15.java;

public class Car_Chapter15 {
	// フィールド
	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
	}
	public void run() {
		System.out.println("時速" + (this.speed + 20) + "kmです");
	}
}
