package JenkinsProDemo.com.pack;

/**
 * Hello world!
 *
 */
public class App 
{
	public String getFullName(String name) {
		return name.toUpperCase();
	}
	
	public int addNum(int a, int b) {
		return (a+b);
	}
	
    public static void main( String[] args )
    {
        App obj=new App();
    }
}
