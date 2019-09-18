
public class OldLady {

	public static void main(String[] args) {
		v1();
		System.out.println();
		v2();
		System.out.println();
		v3();
		System.out.println();
		v4();
		System.out.println();
		v5();
		System.out.println();
		v6();

	}
	
	public static void idk(){
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
		idk();
	}
	
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
		spider();
	}
	
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
		bird();
	}

	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
		cat();
	}
	
	public static void a_lady() {
		System.out.print("There was an old lady who swallowed ");
	}
	
	public static void v1() {
		a_lady();
		System.out.println("who swallowed a fly.");
		idk();
	}
	
	public static void v2() {
		a_lady();
		System.out.println("swallowed a spider,");
		System.out.println("That wiggled and iggled and jiggled inside her.");
		spider();
	}
	
	public static void v3() {
		a_lady();
		System.out.println("a bird,");
		System.out.println("How absurd to swallow a bird.");
		bird();
	}
	
	public static void v4() {
		a_lady();
		System.out.println("a cat,");
		System.out.println("Imagine that to swallow a cat.");
		cat();
	}
	
	public static void v5() {
		a_lady();
		System.out.println("a dog,");
		System.out.println("What a hog to swallow a dog.");
		dog();
	}
	
	public static void v6() {
		a_lady();
		System.out.println("a horse,");
		System.out.println("She died of course.");
	}
	
	
}
