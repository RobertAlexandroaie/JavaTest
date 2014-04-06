package main;

/**
 * 
 */

/**
 * @author Robert
 */
public class A {

    protected void callProtected() {
	System.out.println("protected call");
    }

    void callPackage() {
	System.out.println("call package");
    }

    public void overriden() {
	System.out.println("a");
    }

    public void exc() throws IllegalArgumentException {
	try {
	    throw new IllegalArgumentException();
	} catch (IllegalArgumentException e) {
	    e.printStackTrace();
	}
	System.out.println("after try-catch");
    }

}
