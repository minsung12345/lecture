package webkms.Binding;

public class BindingMain {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		Parent poly = new Child();
		System.out.println("poly.x:" +poly.x);
	}
}
