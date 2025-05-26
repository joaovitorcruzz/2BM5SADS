package com.example._BM5SADS.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public ResponseEntity<List<JobModel>> findAll(){
        List<JobModel> response = jobService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<JobModel> criar(@RequestBody JobModel jobModel){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/id")
                .buildAndExpand(jobModel.getId())
                .toUri();
        JobModel response = jobService.criar(jobModel);

        return ResponseEntity.created(uri).body(response);
    }
}
