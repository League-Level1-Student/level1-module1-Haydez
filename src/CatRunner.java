
public class CatRunner {
public static void main(String[] args) {
	Cat Jerry = new Cat("Jerry");
	Jerry.meow();
	Jerry.printName();
	for(int i=0;i<9;i++) {
	Jerry.kill();
	}
}
}
