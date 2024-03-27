package tn.dksoft.ebuilding.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.io.Serializable;

@Slf4j
@AllArgsConstructor
@SuppressWarnings("unchecked")
public abstract class GenericController<T extends AbstractGenericEntity,ID extends Serializable, V> {
    private final GenericService<T, ID, V> service;
    @GetMapping("")
    public ResponseEntity<V> getAll() {
        return (ResponseEntity<V>) ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<V> getOne(@PathVariable Long id, T t){
        return ResponseEntity.ok(service.getOneById(t.getClass().getSimpleName(),(ID)id));
    }
    @PutMapping("")
    public ResponseEntity<V> update(@RequestBody V updated){

        return ResponseEntity.ok(service.update(updated));
    }
    @PostMapping("")
    public ResponseEntity<V> create(@RequestBody V created){
        return ResponseEntity.ok(service.create(created));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        boolean b = service.deleteOne((ID) id);
        return ResponseEntity.ok(b);
    }
}