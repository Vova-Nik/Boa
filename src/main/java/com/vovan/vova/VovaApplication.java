package com.vovan.vova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

@SpringBootApplication
@EnableJpaRepositories

public class VovaApplication {



	public static void main(String[] args) {
		SpringApplication.run(VovaApplication.class, args);

				// Запуск формы лучше производить в специальном треде
				// event-dispatching thread - EDT

					}
		}
