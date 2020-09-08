import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.etoak.classroom.Classroom;
import com.etoak.config.Config;

public class Test {
	public static void main(String[] args){
		ApplicationContext ioc = new AnnotationConfigApplicationContext(Config.class);
		Classroom classroom = ioc.getBean(Classroom.class);
		classroom.teach();
	}
}
