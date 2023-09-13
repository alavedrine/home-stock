package net.lavedrine.homestock.controller;

import net.lavedrine.homestock.domain.Home;
import net.lavedrine.homestock.dto.home.HomeInDto;
import net.lavedrine.homestock.dto.home.HomeOutDto;
import net.lavedrine.homestock.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api/homes")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private final HomeService service;

    public HomeController(HomeService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public void create(@RequestBody @Valid HomeInDto home) {
        logger.debug("Received request to create new home {}", home);
        service.create(home.name());
    }

    @GetMapping
    public List<HomeOutDto> getHomes() {
        return service.getHomes().stream().map(Home::toDto).toList();
    }

    @GetMapping("/{id}")
    public HomeOutDto getHome(@PathVariable String id) {
        logger.debug("Received request to get home with id '{}'", id);
        return Home.toDto(service.getHome(id));
    }
}
