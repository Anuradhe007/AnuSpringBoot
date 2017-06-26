package codes.anu;

import javafx.application.Application;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("codes.anu")
public class AnuradhaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AnuradhaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.bannerMode(Banner.Mode.OFF).sources(AnuradhaApplication.class);
	}
}
