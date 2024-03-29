package com.example.certificate.controller;

import com.example.certificate.model.Certificate;
import com.example.certificate.service.CertificateService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificate")
@AllArgsConstructor
public class CertificateController {

    private CertificateService certificateService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Certificate certificate){
        boolean result = certificateService.create(certificate);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = ("/{token}"), produces = MediaType.IMAGE_PNG_VALUE)
    public  byte[] get(@PathVariable("token") String token){
        if (token!=null){
            byte[] result =certificateService.get(token);
            return result;
        }
        return null;
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<Certificate> result =certificateService.getAll();
        return ResponseEntity.ok(result);
    }

}
