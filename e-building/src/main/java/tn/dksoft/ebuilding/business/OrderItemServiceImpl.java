package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.OrderItemDTO;
import tn.dksoft.ebuilding.entities.OrderItem;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.OrderItemMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.OrderItemRepository;

@Service(value = "OrderItemService")
@Transactional
public class OrderItemServiceImpl extends GenericServiceImpl<OrderItem, Long, OrderItemDTO>implements OrderItemService {
    @Autowired
    public OrderItemServiceImpl(OrderItemRepository itemRepository, OrderItemMapper itemMapper) {
        super(itemRepository, itemMapper);
    }
}
