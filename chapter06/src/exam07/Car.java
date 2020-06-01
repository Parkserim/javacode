package exam07;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() { 
		return speed;
	}
	public void setSpeed(int speed) { //setspeed의 값을 가져오는 동시에  값을 설정
		if(speed>=0&&speed<=350) {
			System.out.println("현재 속도 " + speed );
		this.speed = speed;
		}else {System.out.println("오류");}
	}
	public boolean isStop() { 
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override 
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}
	

} 