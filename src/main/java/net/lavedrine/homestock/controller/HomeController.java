package net.lavedrine.homestock.controller;

import net.lavedrine.homestock.domain.Home;
import net.lavedrine.homestock.dto.home.HomeInDto;
import net.lavedrine.homestock.dto.home.HomeOutDto;
import net.lavedrine.homestock.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/homes")
public class HomeController {
    private final HomeService service;

    public HomeController(HomeService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public void create(@RequestBody HomeInDto dto) {
        service.create(dto.name());
    }

    @GetMapping
    public List<HomeOutDto> getHomes() {
        return service.getHomes().stream().map(Home::toDto).toList();
    }
}
