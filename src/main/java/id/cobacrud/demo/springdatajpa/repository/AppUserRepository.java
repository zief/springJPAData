package id.cobacrud.demo.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.cobacrud.demo.springdatajpa.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

}
