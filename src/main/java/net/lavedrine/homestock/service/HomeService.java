package net.lavedrine.homestock.service;

import net.lavedrine.homestock.domain.Home;
import net.lavedrine.homestock.repository.HomeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class HomeService {
    private static final Logger logger = LoggerFactory.getLogger(HomeService.class);
    private final HomeRepository repository;

    public HomeService(HomeRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void create(String name) {
        logger.debug("Creating new home '{}'", name);
        String homeId = name.toLowerCase().replace(" ", "-");
        repository.create(homeId, name, Instant.now());
    }

    @Transactional(readOnly = true)
    public List<Home> getHomes() {
        logger.debug("Getting all homes");
        return repository.getHomes();
    }


    public Home getHome(String id) {
        logger.debug("Getting home with id '{}'", id);
        return repository.getHome(id);
    }
}
