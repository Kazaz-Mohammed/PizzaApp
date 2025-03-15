package com.example.pizzaapp.service;

import com.example.pizzaapp.dao.IDao;
import com.example.pizzaapp.classes.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitService {
    private static ProduitService instance;
    private List<Produit> produits = new ArrayList<>();

    private ProduitService() { }

    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    public void create(Produit produit) {
        produits.add(produit);
    }

    public Produit findById(int id) {
        for (Produit p : produits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Produit> findAll() {
        return produits;
    }
}
