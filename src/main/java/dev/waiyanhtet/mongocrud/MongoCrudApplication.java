package dev.waiyanhtet.mongocrud;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.HashMap;
import java.util.Map;

@EnableAsync
@SpringBootApplication
public class MongoCrudApplication implements CommandLineRunner {
	Map<String, String> map = new HashMap<String, String>();
	@PostConstruct
	public void start() {

		map.put("key0", "value0");
		map.forEach((key, value) -> System.out.println(key+ " : "+ value));
	}

	public static void main(String[] args) {
		SpringApplication.run(MongoCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		map.put("key1", "value1");
		System.out.println("=============================");
		map.forEach((key, value) -> System.out.println(key+ " : "+ value));
		map.getOrDefault("key12", "default value");
	}

	@Bean
	public CommandLineRunner startUp() {
		return args -> {
			map.put("key2", "value2");
			System.out.println("=============================");
			map.forEach((key, value) -> System.out.println(key+ " : "+ value));
		};
	}
}
