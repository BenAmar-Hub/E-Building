package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.MaterialService;
import tn.dksoft.ebuilding.dtos.MaterialDTO;
import tn.dksoft.ebuilding.entities.Material;
@RestController
@RequestMapping("/api/material")
public class MaterialController extends GenericController<Material, Long, MaterialDTO> {
    @Autowired
    public MaterialController(MaterialService service) {
        super(service);
    }
}
