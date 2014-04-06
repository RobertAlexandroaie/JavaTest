/**
 * 
 */
package main;

/**
 * @author Robert
 */
public class C extends A {

    public void publicCall() {
	this.callPackage();
    }

    @Override
    public void overriden() {
	System.out.println("c");
    }
}
