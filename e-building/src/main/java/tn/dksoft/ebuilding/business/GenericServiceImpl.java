package tn.dksoft.ebuilding.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
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
@Service
@Transactional
public abstract class GenericServiceImpl<T extends AbstractGenericEntity, ID extends Serializable, V> implements GenericService<T,ID,V> {
    private final GenericRepository<T, ID> genericRepository;
    private final GenericMapper<V, T> genericMapper;

    @Override
    public V create(V v) {
        try {
            T t = genericMapper.fromDtoToEntity(v);
            genericRepository.saveAndFlush(t);
            log.info(t.getClass().getSimpleName() + " has be created !");
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
            log.error(" Cannot be deleted !");
            return false;
        }
    }

    @Override
    public List<V> getAll() {
        try {
            return (List<V>) genericMapper.fromEntitiesToDtoList(genericRepository.findAll());
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public V getOneById(String t, ID id) {
        Optional<T> oneById = genericRepository.findOneById(id);
        if (oneById.isPresent()) {
            return genericMapper.fromEntityToDto(oneById.get());
        } else {
            throw new EntityNotFoundException(t, "id", id.toString());
        }
    }

    @Override
    public V update(V v) {
        try {
            T t = genericMapper.fromDtoToEntity(v);
            genericRepository.saveAndFlush(t);
            log.info(t.getClass().getSimpleName() + " has be changed !");
            return genericMapper.fromEntityToDto(t);
        } catch (Exception e) {
            log.error("Cannot be changed !");
            return null;
        }
    }
}
