/**
 * 
 */
package main;

/**
 * @author Robert
 */
public class GenericTest<T> {

    private final Class<T> type;

    public GenericTest(Class<T> type) {
	this.type = type;
    }

    public Class<T> getMyType() {
	return this.type;
    }
}
