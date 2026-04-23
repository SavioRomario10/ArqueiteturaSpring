package io.github.SavioRomario10.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication//define que esta classe é a base do Spring
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ArquiteturaspringApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);

		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("producao");

		builder.run(args);

	}
}