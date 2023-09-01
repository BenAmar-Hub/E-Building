package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.AdressDto;
import tn.dksoft.ebuilding.entities.TAddress;
import tn.dksoft.ebuilding.mappers.AddressMapper;
import tn.dksoft.ebuilding.repositories.AddressRepository;

@Service(value = "addresseService")
@Transactional
public class AddressServiceImpl extends GenericServiceImpl<TAddress, Long, AdressDto> implements AddressService {
@Autowired
    public AddressServiceImpl(AddressRepository addressRepository, AddressMapper addressMapper){
    super(addressRepository,addressMapper);
}
}
