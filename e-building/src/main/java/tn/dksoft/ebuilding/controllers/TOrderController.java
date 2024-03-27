package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.dtos.AdressDto;
import tn.dksoft.ebuilding.dtos.TorderDTO;
import tn.dksoft.ebuilding.entities.TAddress;
import tn.dksoft.ebuilding.entities.Torder;
@RestController
@RequestMapping("/api/order")
public class TOrderController extends GenericController<Torder, Long, TorderDTO>{
    @Autowired
    public TOrderController(GenericService<Torder, Long, TorderDTO> service) {
        super(service);
    }
}
