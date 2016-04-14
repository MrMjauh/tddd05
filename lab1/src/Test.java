
public class Test {

	public static void main(String[] args) {
		DataCarrier dc = new DataCarrier(1,1,1,1,1, "Test one");
		System.out.println(dc.getValue());
		dc.setState(0, 0, 0, 0, 1);
		dc.setValue("Test two");
		System.out.println(dc.getValue());
	}
}
