package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.OrderItemService;
import tn.dksoft.ebuilding.dtos.OrderItemDTO;
import tn.dksoft.ebuilding.entities.OrderItem;
@RestController
@RequestMapping("/api/orderitem")
public class OrderItemController extends GenericController<OrderItem, Long, OrderItemDTO> {
    @Autowired
    public OrderItemController(OrderItemService service) {
        super(service);
    }
}
