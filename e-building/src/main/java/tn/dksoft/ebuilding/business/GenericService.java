package tn.dksoft.ebuilding.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T extends AbstractGenericEntity,ID extends Serializable, V> {
        V create (V v);
        boolean deleteOne(ID id);
        List<V> getAll();
        V getOneById(String t,ID id);
        V update (V v);

}
