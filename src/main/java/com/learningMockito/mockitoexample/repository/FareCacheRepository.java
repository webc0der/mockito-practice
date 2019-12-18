package com.learningMockito.mockitoexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningMockito.mockitoexample.modal.AlternateFareCache;

@Repository
public interface FareCacheRepository extends JpaRepository<AlternateFareCache, Long> {

}
