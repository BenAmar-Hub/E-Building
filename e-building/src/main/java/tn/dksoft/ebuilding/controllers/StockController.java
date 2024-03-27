package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.StockService;
import tn.dksoft.ebuilding.dtos.StockDTO;
import tn.dksoft.ebuilding.entities.Stock;
@RestController
@RequestMapping("/api/stock")
public class StockController extends GenericController<Stock, Long, StockDTO> {
    @Autowired
    public StockController(StockService service) {
        super(service);
    }
}
