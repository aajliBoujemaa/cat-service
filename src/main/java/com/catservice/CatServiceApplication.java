package com.catservice;

import com.catservice.dao.ProduitRepository;
import com.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {

    @Autowired
    private ProduitRepository produitRepository;
    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        produitRepository.save(new Produit(null,"Stylo",10,100));
        produitRepository.save(new Produit(null,"Gomme",20,200));
        produitRepository.save(new Produit(null,"Regle",30,300));
        produitRepository.save(new Produit(null,"Pance",40,400));
        produitRepository.findAll().forEach(produit -> {
            System.out.println(produit.getId());
            System.out.println(produit.getDesignation());
            System.out.println(produit.getPrice());
            System.out.println(produit.getPrice());
        });
    }
}
