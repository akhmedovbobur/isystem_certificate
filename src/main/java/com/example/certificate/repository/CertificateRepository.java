package com.example.certificate.repository;

import com.example.certificate.model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate,Integer> {


    Optional<Certificate> findByTokenAndDeletedAtIsNull(String token);
}
