package com.sofka.sofkaemployee.domain.service.impl;

import com.sofka.sofkaemployee.domain.model.Sofkiano;
import com.sofka.sofkaemployee.domain.service.interfaces.SofkianoService;
import com.sofka.sofkaemployee.infraestructure.repository.SofkianoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SofkianoServiceImpl implements SofkianoService {
    private SofkianoRepository sofkianoRepository;

    @Autowired
    public SofkianoServiceImpl(SofkianoRepository sofkianoRepository) {
        this.sofkianoRepository = sofkianoRepository;
    }

    @Override
    public List<Sofkiano> getAll() {
        return sofkianoRepository.findAll(new Sort(Sort.Direction.ASC, "name"));
    }

    @Override
    public Sofkiano getOne(String id) {
        return sofkianoRepository.findByid(id);
    }

    @Override
    public Sofkiano create(Sofkiano sofkiano) {
        return sofkianoRepository.save(sofkiano);
    }

    @Override
    public boolean delete(String id) {
        if (sofkianoRepository.existsById(id)) {
            sofkianoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Sofkiano update(String id, Sofkiano sofkiano) {
        if (sofkianoRepository.existsById(id)) {
            sofkiano.setId(id);
        }
        sofkianoRepository.save(sofkiano);
        return sofkiano;
    }

    @Override
    public Iterable<Sofkiano> findByName(String name) {
        return sofkianoRepository.findByNameIgnoreCase(name);
    }

    @Override
    public Iterable<Sofkiano> findByLastName(String lastName) {
        return sofkianoRepository.findByLastNameIgnoreCase(lastName);
    }

    @Override
    public Iterable<Sofkiano> findByIdProject(String idProject) {
        return sofkianoRepository.findByIdProjectIgnoreCase(idProject);
    }

    @Override
    public Iterable<Sofkiano> getSofkianosWithSpecificFields(List<String> fields) {
        return sofkianoRepository.findAll(new Sort(Sort.Direction.ASC, "name"));
    }
}
