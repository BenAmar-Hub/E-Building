package tn.dksoft.ebuilding.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tn.dksoft.ebuilding.exceptions.EntityNotFoundException;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;

import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Slf4j
public abstract class GenericServiceImpl<T, ID extends Serializable, V> implements GenericService<T, ID, V> {
    private GenericRepository<T, ID> genericRepository;
    private GenericMapper<V, T> genericMapper;

    @Override
    public V create(V v) {
        try {
            T t = genericMapper.fromDtoToEntity(v);
            genericRepository.saveAndFlush(t);
            return genericMapper.fromEntityToDto(t);
        } catch (Exception e) {
            log.error("Cannot be created !");
            return null;
        }
    }

    @Override
    public boolean deleteOne(ID id) {
        try {
            Optional<T> oneById = genericRepository.findOneById(id);
            if (oneById.isPresent()) {
                int delete = genericRepository.delete(id);
                return delete > 0;
            } else {
                return false;
            }

        } catch (Exception e) {
            log.error("Cannot be created !");
            return false;
        }
    }

    @Override
    public List<V> getAll() {
        try {
            return genericMapper.fromEntitiesToDtoList(genericRepository.findAll());
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public V getOneById(T t, ID id) {
        Optional<T> oneById = genericRepository.findOneById(id);
        if (oneById.isPresent()) {
            return genericMapper.fromEntityToDto(oneById.get());
        } else {
            throw new EntityNotFoundException(t.getClass(),"id",id.toString());
        }
    }

    @Override
    public V update(V v) {

            return genericMapper.fromEntityToDto(genericRepository.saveAndFlush(genericMapper.fromDtoToEntity(v)));
    }
}
