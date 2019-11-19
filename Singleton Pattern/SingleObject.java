public class SingleObject {
	private static SingleObject instance = new SingleObject();
	// make the none-parameter constructor private (apply this for other constructors, if any)
	private SingleObject() {}
	public static SingleObject getInstanse() {
		return instance;
	}
	public void doSomeThing() {
		System.out.println("Doing something");
	}
}
