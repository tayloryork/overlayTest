package co.tyec.overlayTest.e2App;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String javaVariable = "Child Java Variable";
	public static String javaVariableOnlyInParent = new JavaClassThatOnlyExistsInE2App().javaVariable;
}
