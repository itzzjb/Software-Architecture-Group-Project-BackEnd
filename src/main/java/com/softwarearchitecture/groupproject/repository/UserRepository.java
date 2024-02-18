package com.softwarearchitecture.groupproject.repository;
import com.softwarearchitecture.groupproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
<<<<<<< HEAD
=======
    User findById(int Id);
>>>>>>> fc84f1f2ad3f40b878b8c94dadf63e7817bda1f1

}
