package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.StockDTO;
import tn.dksoft.ebuilding.entities.Stock;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.StockMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.StockRepository;
@Service("StockService")
@Transactional
public class StockServiceImpl extends GenericServiceImpl<Stock, Long, StockDTO> implements StockService {
    @Autowired
    public StockServiceImpl(StockRepository stockRepository, StockMapper stockMapper) {
        super(stockRepository, stockMapper);
    }
}
