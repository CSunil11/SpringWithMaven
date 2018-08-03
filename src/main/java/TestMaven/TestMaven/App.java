package TestMaven.TestMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        String confFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        
        Page pageContext = (Page) context.getBean("page");
        Person personContext = (Person) context.getBean("person");
        
        pageContext.testMePage();
        
        personContext.setPhone("+91");
        personContext.prints();
        
    }
}
