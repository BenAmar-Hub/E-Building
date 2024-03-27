package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.TorderDTO;
import tn.dksoft.ebuilding.entities.Torder;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.TOrderMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.TOrderRepository;

@Service(value = "TOrderService")
@Transactional
public class TOrderServiceImpl extends GenericServiceImpl<Torder, Long, TorderDTO> implements TOrderService {
    @Autowired
    public TOrderServiceImpl(TOrderRepository orderRepository, TOrderMapper orderMapper) {
        super(orderRepository, orderMapper);
    }
}
