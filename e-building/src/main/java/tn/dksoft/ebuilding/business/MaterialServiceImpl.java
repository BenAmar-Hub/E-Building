package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.MaterialDTO;
import tn.dksoft.ebuilding.entities.Material;
import tn.dksoft.ebuilding.mappers.MaterialMapper;
import tn.dksoft.ebuilding.repositories.MaterialRepository;

@Service(value = "materialService")
@Transactional
public class MaterialServiceImpl extends GenericServiceImpl<Material, Long, MaterialDTO> implements MaterialService {
    @Autowired
    public MaterialServiceImpl(MaterialRepository materialRepository, MaterialMapper materialMapper) {
        super(materialRepository, materialMapper);
    }
}