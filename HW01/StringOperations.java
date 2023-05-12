
public class StringOperations {
	public static void main(String[] args) {
		String myName = "Cashby";
		System.out.println(myName);
		
		String newName = myName.replace('C','A');
		newName = newName.replace('y','Z');
		System.out.println(newName);
		
		String myURL = "www.twitch.tv";
		System.out.println(myURL);
		
		String subURL = myURL.substring(4,10) + 1331;
		System.out.println(subURL);
	}
}
