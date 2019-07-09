package com.sofka.sofkaemployee.infraestructure.controller;

import com.sofka.sofkaemployee.domain.model.Sofkiano;
import com.sofka.sofkaemployee.domain.service.impl.SofkianoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class SofkianoController {
    @Autowired
    SofkianoServiceImpl sofkianoService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/sofkianos")
    ResponseEntity<Iterable<Sofkiano>> getSofkiano() {
        return new ResponseEntity<>(sofkianoService.getAll(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/sofkianos/sort", params = {"name"})
    ResponseEntity<Iterable<Sofkiano>> sortingSofkiano() {
        return new ResponseEntity<>(sofkianoService.getAll(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/sofkianos/{id}")
    ResponseEntity<Sofkiano> getSofkianoById(@PathVariable("id") String id){
        return new ResponseEntity<>(sofkianoService.getOne(id), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value="/sofkianos")
    ResponseEntity<Sofkiano> addSofkiano(@RequestBody Sofkiano sofkiano) {
        return new ResponseEntity<>(sofkianoService.create(sofkiano), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping(value="/sofkianos/{id}")
    ResponseEntity<?> deleteSofkiano(@PathVariable String id){
        return new ResponseEntity<>(sofkianoService.delete(id), HttpStatus.NO_CONTENT);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value="/sofkianos/{id}")
    ResponseEntity<Sofkiano> updateSofkiano(@PathVariable String id, @RequestBody Sofkiano sofkiano) {
        return new ResponseEntity<>(sofkianoService.update(id, sofkiano), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/sofkianos", params = {"name"})
    public ResponseEntity<Iterable<Sofkiano>> filterSofkianoByName(@RequestParam String name) {
        return new ResponseEntity<>(sofkianoService.findByName(name), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/sofkianos", params = {"lastName"})
    public ResponseEntity<Iterable<Sofkiano>> filterSofkianoByLastName(@RequestParam String lastName) {
        return new ResponseEntity<>(sofkianoService.findByLastName(lastName), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/sofkianos", params = {"idProject"})
    public ResponseEntity<Iterable<Sofkiano>> filterSofkianoByIdProject(@RequestParam String idProject) {
        return new ResponseEntity<>(sofkianoService.findByIdProject(idProject), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/sofkianos", params = {"fields"})
    public String getFoos(@RequestParam List<String> fields) {
        return "IDs are " + fields;
    }
}
