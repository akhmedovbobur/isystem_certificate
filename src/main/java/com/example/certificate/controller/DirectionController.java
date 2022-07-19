package com.example.certificate.controller;

import com.example.certificate.model.Direction;
import com.example.certificate.service.DirectionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/directions")
public class DirectionController {
    private DirectionService directionService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Direction direction){
        boolean result = directionService.create(direction);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<Direction> result = directionService.getAll();
        return ResponseEntity.ok(result);
    }
}
