package com.softwarearchitecture.groupproject.repository;
import com.softwarearchitecture.groupproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int Id);

}
