package inheritances;

public class CellPhoneEx {
	public static void main(String[] args) {
		Cellphone cp = new Cellphone();
		cp.model = "Galaxy";
		cp.color = "White";
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		
//		cp.equals();   //���� �������� ���� ������ �⺻������ ������Ʈ��� Ŭ����(���� ����Ŭ����)���� ��ӹ޴´�. 
//		cp.getClass();
//		cp.toString();
		
		System.out.println("===============================");
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.powerOn();
		dp.bell();
		dp.turnOnDmb();
		dp.changeChannnel(20);
		dp.turnOffDmb();
		dp.powerOff();
		
		System.out.println("===============================");
		SmartPhone sp = new SmartPhone();
		sp.model = "LGPhone";
		sp.color = "Yellow";
		sp.commonMethod();
		System.out.println("===============================");
		System.out.println(cp.toString());
		System.out.println(dp.toString());
		System.out.println(sp.toString());
		
		
	}

}
