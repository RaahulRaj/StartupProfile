package com.RestDemo.StartupProfile.repository;

import com.RestDemo.StartupProfile.model.StartupProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartupProfileRepository extends JpaRepository<StartupProfile,String> {
}
