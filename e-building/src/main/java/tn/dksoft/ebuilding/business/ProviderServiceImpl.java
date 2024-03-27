package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.ProviderDTO;
import tn.dksoft.ebuilding.entities.Provider;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.ProviderMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.ProviderRepository;

@Service
@Transactional
public class ProviderServiceImpl extends GenericServiceImpl<Provider, Long, ProviderDTO> implements ProviderService {

    @Autowired
    public ProviderServiceImpl(ProviderRepository providerRepository, ProviderMapper providerMapper) {
        super(providerRepository, providerMapper);
    }
}
