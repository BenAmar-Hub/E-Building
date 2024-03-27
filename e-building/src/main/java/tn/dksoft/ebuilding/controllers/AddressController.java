package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.AddressService;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.dtos.AdressDto;
import tn.dksoft.ebuilding.entities.TAddress;
@RestController
@RequestMapping("/api/address")
public class AddressController extends GenericController<TAddress,Long, AdressDto> {
    @Autowired
    public AddressController(AddressService service) {
        super(service);
    }
}
