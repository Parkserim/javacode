package exam01;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone() {
		super("samsung","red");
		System.out.println("DmbCellPhone 생성");
	}

	@Override
	public String toString() {
		return "DmbCellPhone [channel=" + channel + "]";
	}

	/*
	 * public DmbCellPhone(int channnel) { this.channel = channel;
	 * System.out.println("DmbCellPhone channel 생성"); }
	 */
	/*
	 * DmdCellPhone(String model, String color, int channel){ this.model = model;
	 * this.color=color; this.channel=channel; }
	 */

}
