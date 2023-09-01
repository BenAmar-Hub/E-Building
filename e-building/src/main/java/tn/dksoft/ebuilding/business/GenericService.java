package tn.dksoft.ebuilding.business;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GenericService<T ,ID , V> {
        V create (V v);
        boolean deleteOne(ID id);
        List<V> getAll();
        V getOneById(T t,ID id);
        V update (V v);

}
