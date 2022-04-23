package yogita.springframework.msscbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsscBeerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBeerServiceApplication.class, args);
		//the moment you say (run), it will create a spring container and in this container
		// it will try to crete objects wherever @Component is there
		// this means Spring Framework is injecting this object in your application
		// this is dependency injection


		//SPring boot follows singleton pattern which means it will give the object prehand
		//  and we get only one object
	}

}
