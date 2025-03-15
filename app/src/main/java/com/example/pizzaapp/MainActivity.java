package com.example.pizzaapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzaapp.classes.Produit;
import com.example.pizzaapp.service.ProduitService;

public class MainActivity extends AppCompatActivity {

    private ImageView pizzaImage;
    private TextView pizzaName, descriptionTitle, descriptionText;
    private TextView ingredientsTitle, ingredientsText;
    private ProduitService pizzaService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pizzaImage = findViewById(R.id.pizzaDetailImage);
        pizzaName = findViewById(R.id.pizzaDetailName);
        descriptionTitle = findViewById(R.id.descriptionTitle);
        descriptionText = findViewById(R.id.descriptionText);
        ingredientsTitle = findViewById(R.id.ingredientsTitle);
        ingredientsText = findViewById(R.id.ingredientsText);

        int pizzaId = getIntent().getIntExtra("PIZZA_ID", -1);

        Log.d("MainActivity", "Received PIZZA_ID: " + pizzaId);


        pizzaService = ProduitService.getInstance();

        if (pizzaId != -1) {
            Produit pizza = pizzaService.findById(pizzaId);
            if (pizza != null) {

                Log.d("MainActivity", "Found Pizza: " + pizza.getNom());

                displayPizzaDetails(pizza);
            } else {
                Log.e("MainActivity", "Pizza not found for ID: " + pizzaId);
            }
        }else {
            Log.e("MainActivity", "No PIZZA_ID received!");
        }
    }




    private void displayPizzaDetails(Produit pizza) {
        pizzaImage.setImageResource(pizza.getPhoto());
        pizzaName.setText(pizza.getNom());
        descriptionTitle.setText("Description :");
        descriptionText.setText(pizza.getDescription());
        ingredientsTitle.setText("Ingredients :");
        ingredientsText.setText(pizza.getDetailsIngred());
    }


}