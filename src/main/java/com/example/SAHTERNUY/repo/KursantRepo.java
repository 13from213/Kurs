package com.example.SAHTERNUY.repo;

import com.example.SAHTERNUY.models.Kursant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KursantRepo extends CrudRepository<Kursant, Integer> {
}
