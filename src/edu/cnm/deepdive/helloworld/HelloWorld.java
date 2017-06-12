/**
 * 
 */
package edu.cnm.deepdive.helloworld;

public class HelloWorld {

	private static void emitMessage(String message) {
		System.out.println(message);
	}

	/**
	 * Prints "Hello World!" to standard output.
	 * 
	 * @param args
	 *            Command-line parameters (ignored).
	 */
	public static void main(String[] args) {
		String target;
		String message;
		if (args.length >0) {
			target = args[0];
		} else {
			target = "World";
			
		}
		message = String.format("Hello %s!",  target);
		// TODO Auto-generated method
		emitMessage(message);

	}
}
/**
 * @author natedaag Simple class that displays the "Hello World!" message.
 */
