package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.LinkDTO;
import tn.dksoft.ebuilding.entities.Link;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.LinkMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.LinkRepository;
@Service(value = "linkService")
@Transactional
public class LinkServiceImpl extends GenericServiceImpl<Link, Long, LinkDTO> implements LinkService {
    @Autowired
    public LinkServiceImpl(LinkRepository linkRepository, LinkMapper linkMapper) {
        super(linkRepository, linkMapper);
    }
}
