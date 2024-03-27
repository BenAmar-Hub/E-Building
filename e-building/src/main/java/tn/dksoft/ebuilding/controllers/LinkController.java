package tn.dksoft.ebuilding.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.LinkService;
import tn.dksoft.ebuilding.dtos.LinkDTO;
import tn.dksoft.ebuilding.entities.Link;
@RestController
@RequestMapping("/api/link")
public class LinkController extends GenericController<Link, Long, LinkDTO> {
    public LinkController(LinkService service) {
        super(service);
    }
}
