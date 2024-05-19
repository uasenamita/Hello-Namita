package Star;

public class dupli {   
	public static void main(String[] args) {
    String originalString = "My name is Namita";
    String modifiedString = originalString
                            .replace("m", "")  // Remove 'm'
                            .replace("a", "")  // Remove 'a'
                            .replace("N", "t"); // Replace 'N' with 't'

    System.out.println(modifiedString); // Output: "My ne is t"
}


}
