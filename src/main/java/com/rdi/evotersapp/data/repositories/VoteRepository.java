package com.rdi.evotersapp.data.repositories;

import com.rdi.evotersapp.data.models.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
