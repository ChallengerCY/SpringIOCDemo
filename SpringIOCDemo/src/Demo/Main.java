package Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	
	public static void main(String[] args) {
		/*ͨ��Resourc ��ȡ�����ļ�*/
		Resource resource = new FileSystemResource("language.xml");
		/*ʵ����Bean����*/
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		/*ʵ����bean*/
		People people = (People) beanFactory.getBean("People");
		
		String string = people.say();
		System.out.println(string);
	}
}
