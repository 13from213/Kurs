package com.example.SAHTERNUY.repo;

import com.example.SAHTERNUY.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}