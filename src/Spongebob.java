
public class Spongebob {
public static void main(String[] args) {
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	SeaCreature Patrick = new SeaCreature("Patrick");
	SeaCreature Squidward = new SeaCreature("Squidward");
	
	System.out.println(Patrick.getName());
	System.out.println(Spongebob.getName());
	Patrick.eat(); 
	Spongebob.laugh();
	Patrick.laugh();
	Squidward.clarinet();
	Squidward.laugh();
	Patrick.instrument();
}
}
