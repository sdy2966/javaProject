package inheritances;

public class cellPhoneEx2 {
	public static void main(String[] args) {
		Cellphone cp = new Cellphone();
//		cp = (Cellphone) new DmbPhone();//int = (int//�ڽ� Ŭ���� �ν��Ͻ��� �ڵ����� ���� ������� �ʾƵ� �θ� �ν��Ͻ��� ��õȴ�???����ȯ�ȴ�? �ݴ�δ� ���
//		cp = (Cellphone) new SmartPhone();
		cp = new DmbPhone();
		cp.color = "";

		if(cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp;
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();

		} else {
			System.out.println("Casting�� �� ����");//�θ��ڽ�ĳ����
		}
		//������.
		//�θ�=�ڽĵ�
		//�θ�, �޼ҵ� = �ڽ�. �޼ҵ�;
		//ȣ�� �ڵ尡 ������ � �ν��Ͻ��� �����Ŀ� ���� ����Ǵ� ����� �޸� �ϰڴ�.
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}

}
