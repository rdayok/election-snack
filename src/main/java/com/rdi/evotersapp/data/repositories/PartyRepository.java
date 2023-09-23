package com.rdi.evotersapp.data.repositories;

import com.rdi.evotersapp.data.models.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, String> {
}
