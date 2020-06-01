package exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone(null, null);
		DmbCellPhone dcp = new DmbCellPhone();
		
		System.out.println(cp.toString());
		System.out.println(dcp.toString());
		System.out.println(cp);
		System.out.println(dcp);
		dcp.powerOn();
	}

}
