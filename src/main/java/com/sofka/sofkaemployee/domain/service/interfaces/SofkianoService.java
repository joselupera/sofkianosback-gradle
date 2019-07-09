package com.sofka.sofkaemployee.domain.service.interfaces;

import com.sofka.sofkaemployee.domain.model.Sofkiano;

import java.util.List;

public interface SofkianoService {
    List<Sofkiano> getAll();
    Sofkiano getOne(String id);
    Sofkiano create(Sofkiano sofkiano);
    boolean delete(String id);
    Sofkiano update(String id, Sofkiano sofkiano);
    Iterable<Sofkiano> findByName(String name);
    Iterable<Sofkiano> findByLastName(String lastName);
    Iterable<Sofkiano> findByIdProject(String idProject);
    Iterable<Sofkiano> getSofkianosWithSpecificFields(List<String> fields);
}
