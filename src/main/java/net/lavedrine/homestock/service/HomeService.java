package net.lavedrine.homestock.service;

import net.lavedrine.homestock.domain.Home;
import net.lavedrine.homestock.repository.HomeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class HomeService {
    private final HomeRepository repository;

    public HomeService(HomeRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void create(String name) {
        repository.create(name, Instant.now());
    }

    @Transactional(readOnly = true)
    public List<Home> getHomes() {
        return repository.getHomes();
    }

}
