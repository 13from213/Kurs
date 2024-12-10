package com.example.SAHTERNUY.repo;

import com.example.SAHTERNUY.models.Unit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepo extends CrudRepository<Unit, Long> {
}
