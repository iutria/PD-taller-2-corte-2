package com.iutria.ecommerce.controllers;


import com.iutria.ecommerce.models.Product;
import com.iutria.ecommerce.patterns.ConcreteMysqlFactory;
import com.iutria.ecommerce.patterns.DBFactory;
import com.iutria.ecommerce.patterns.Settings;
import com.iutria.ecommerce.repository.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class EcommerseController {

    private DAO db;

    public EcommerseController(){
        DBFactory factory = Settings.configure("mysql");
        db = factory.createConn();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(db.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable String id) {
        return ResponseEntity.ok(db.get(Integer.parseInt(id)));
    }

    @PostMapping("/save")
    public ResponseEntity<Product> post(@RequestBody Product product) {
        return ResponseEntity.ok(db.add(product));
    }

    @PutMapping("/edith/{id}")
    public ResponseEntity<String> put(@PathVariable String id, @RequestBody Product product) {
        boolean response = db.update(product, Integer.parseInt(id));
        if(response) {
            return ResponseEntity.ok("Editado correctamente");
        }else {
            return ResponseEntity.status(500).body("Error al editar");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        boolean response = db.delete(Integer.parseInt(id));
        if(response) {
            return ResponseEntity.ok("Eliminado correctamente");
        }else {
            return ResponseEntity.status(500).body("Error al eliminar");
        }
    }


}
