package Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	
	public static void main(String[] args) {
		/*通过Resourc 获取配置文件*/
		Resource resource = new FileSystemResource("language.xml");
		/*实例化Bean工厂*/
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		/*实例化bean*/
		People people = (People) beanFactory.getBean("People");
		
		String string = people.say();
		System.out.println(string);
	}
}
