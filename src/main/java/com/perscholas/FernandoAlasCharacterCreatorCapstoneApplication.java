package com.perscholas;

import com.perscholas.ancestry.Ancestry;
import com.perscholas.ancestry.AncestryServiceImpl;
import com.perscholas.player.Player;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FernandoAlasCharacterCreatorCapstoneApplication {


	public static void main(String[] args) {
		SpringApplication.run(FernandoAlasCharacterCreatorCapstoneApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner1() {
		CommandLineRunner commandLineRunner = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {


			}

		};
		return  commandLineRunner;
	}

}


