package object2;

public class ShopService {
	private static ShopService singLeton = new ShopService();
	private ShopService() {}
	public static ShopService getInstance() {
		return singLeton;
	}
}
