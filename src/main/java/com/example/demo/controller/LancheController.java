    package com.example.demo.controller;

    import com.example.demo.lanche.DadosLanche;
    import com.example.demo.lanche.Lanche;
    import com.example.demo.lanche.LancheRepository;
    import com.example.demo.service.LancheService;
    import jakarta.transaction.Transactional;
    import jakarta.validation.Valid;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/lanche")
    public class LancheController {
        @Autowired
        private LancheRepository lancheRepository;
        @Autowired
        private LancheService service;
        @PostMapping
        @Transactional
        public ResponseEntity<List<Lanche>> cadastrarLanche(@Valid @RequestBody List<DadosLanche> lanches) {
            List<Lanche> novosLanches = service.cadastrarLanches(lanches); 
            return ResponseEntity.status(HttpStatus.CREATED).body(novosLanches);
        }

        @GetMapping
        public ResponseEntity<Iterable<Lanche>> listarLanches() {
            Iterable<Lanche> lanches = service.listarTodos();
            return ResponseEntity.ok(lanches);
        }
    }
