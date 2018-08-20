package id.cobacrud.demo.springdatajpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import id.cobacrud.demo.springdatajpa.model.AppUser;
import id.cobacrud.demo.springdatajpa.repository.AppUserRepository;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner{
	@Autowired
	private  AppUserRepository appUserRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Creating AppUser object: appUser1");
		AppUser appUser1 = new AppUser();
		appUser1.setUsername("appuser1");
		appUser1.setFirstName("Richard");
		appUser1.setLastName("Stallman");
		appUser1.setJoinDate(new Date());
		System.out.println("appUser1 created.");
		
		System.out.println("Creating AppUser object: appUser2");
		AppUser appUser2 = new AppUser();
		appUser2.setUsername("appuser2");
		appUser2.setFirstName("Linus");
		appUser2.setLastName("Torvalds");
		appUser2.setJoinDate(new Date());
		System.out.println("appUser1 created.");
		
		System.out.println("saving appUser1 . . .");
		this.appUserRepository.save(appUser1);
		System.out.println("appUser1 saved.");
		
		System.out.println("saving appUser2 . . .");
		this.appUserRepository.save(appUser2);
		System.out.println("appUser2 saved.");
		
	}
}
