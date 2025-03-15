package com.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaapp.adapter.PizzaAdapter;
import com.example.pizzaapp.classes.Produit;
import com.example.pizzaapp.service.ProduitService;
import java.util.List;
import android.util.Log;

public class ListPizzaActivity extends AppCompatActivity {

    private ListView listView;
    private ProduitService produitService;
    private List<Produit> produits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listpizza);

        listView = findViewById(R.id.liste);
        produitService = ProduitService.getInstance();


        produitService.create(new Produit("Margherita", 3, R.drawable.pizza1, "20", "Tomate, Fromage, Basilic", "Simple et délicieux", "Cuire 15 min", 1));
        produitService.create(new Produit("Pepperoni", 4, R.drawable.pizza2, "25", "Tomate, Fromage, Pepperoni", "Savoureuse", "Cuire 20 min", 2));
        produitService.create(new Produit("Quatre Fromages", 4, R.drawable.pizza3, "30", "Mozzarella, Gorgonzola, Parmesan, Chèvre", "Fromage Lovers", "Cuire 25 min", 3));

        produitService.create(new Produit(
                "BARBECUED CHICKEN PIZZA",
                3,
                R.drawable.pizza4,
                "35",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n"
                        + "- 1/4 teaspoon pepper\n"
                        + "- 1 cup barbecue sauce, divided\n"
                        + "- 1 tube (13.8 ounces) refrigerated pizza crust\n"
                        + "- 2 teaspoons olive oil\n"
                        + "- 2 cups shredded Gouda cheese\n"
                        + "- 1 small red onion, halved and thinly sliced\n"
                        + "- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans...",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\n"
                        + "STEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\n"
                        + "STEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro.",
                4
        ));

        produitService.create(new Produit(
                "BRUSCHETTA PIZZA",
                6,
                R.drawable.pizza5,
                "60",
                "- 1/2 pound reduced-fat bulk pork sausage\n"
                        + "- 1 prebaked 12-inch pizza crust\n"
                        + "- 1 package (6 ounces) sliced turkey pepperoni\n"
                        + "- 2 cups shredded part-skim mozzarella cheese\n"
                        + "- 1-1/2 cups chopped plum tomatoes\n"
                        + "- 1/2 cup fresh basil leaves, thinly sliced\n"
                        + "- 1 tablespoon olive oil\n"
                        + "- 2 garlic cloves, minced\n"
                        + "- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n"
                        + "- 1/2 teaspoon balsamic vinegar\n"
                        + "- 1/4 teaspoon salt\n"
                        + "- 1/8 teaspoon pepper\n"
                        + "- Additional fresh basil leaves, optional",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes...",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\n"
                        + "STEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\n"
                        + "STEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro.",
                4
        ));


        produitService.create(new Produit(
                "SPINACH PIZZA",
                5,
                R.drawable.pizza6,
                "30",
                "- 1/2 pound reduced-fat bulk pork sausage\n"
                        + "- 1 prebaked 12-inch pizza crust\n"
                        + "- 1 package (6 ounces) sliced turkey pepperoni\n"
                        + "- 2 cups shredded part-skim mozzarella cheese\n"
                        + "- 1-1/2 cups chopped plum tomatoes\n"
                        + "- 1/2 cup fresh basil leaves, thinly sliced\n"
                        + "- 1 tablespoon olive oil\n"
                        + "- 2 garlic cloves, minced\n"
                        + "- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n"
                        + "- 1/2 teaspoon balsamic vinegar\n"
                        + "- 1/4 teaspoon salt\n"
                        + "- 1/8 teaspoon pepper\n"
                        + "- Additional fresh basil leaves, optional",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes...",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\n"
                        + "STEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\n"
                        + "STEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro.",
                6
        ));

        produitService.create(new Produit(
                "DEEP-DISH SAUSAGE PIZZA",
                7,
                R.drawable.pizza7,
                "15",
                "- 1/2 pound reduced-fat bulk pork sausage\n"
                        + "- 1 prebaked 12-inch pizza crust\n"
                        + "- 1 package (6 ounces) sliced turkey pepperoni\n"
                        + "- 2 cups shredded part-skim mozzarella cheese\n"
                        + "- 1-1/2 cups chopped plum tomatoes\n"
                        + "- 1/2 cup fresh basil leaves, thinly sliced\n"
                        + "- 1 tablespoon olive oil\n"
                        + "- 2 garlic cloves, minced\n"
                        + "- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n"
                        + "- 1/2 teaspoon balsamic vinegar\n"
                        + "- 1/4 teaspoon salt\n"
                        + "- 1/8 teaspoon pepper\n"
                        + "- Additional fresh basil leaves, optional",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes...",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\n"
                        + "STEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\n"
                        + "STEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro.",
                7
        ));

        produitService.create(new Produit(
                "HOMEMADE PIZZA",
                8,
                R.drawable.pizza8,
                "25",
                "- 1/2 pound reduced-fat bulk pork sausage\n"
                        + "- 1 prebaked 12-inch pizza crust\n"
                        + "- 1 package (6 ounces) sliced turkey pepperoni\n"
                        + "- 2 cups shredded part-skim mozzarella cheese\n"
                        + "- 1-1/2 cups chopped plum tomatoes\n"
                        + "- 1/2 cup fresh basil leaves, thinly sliced\n"
                        + "- 1 tablespoon olive oil\n"
                        + "- 2 garlic cloves, minced\n"
                        + "- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n"
                        + "- 1/2 teaspoon balsamic vinegar\n"
                        + "- 1/4 teaspoon salt\n"
                        + "- 1/8 teaspoon pepper\n"
                        + "- Additional fresh basil leaves, optional",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes...",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\n"
                        + "STEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\n"
                        + "STEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro.",
                8
        ));

        produitService.create(new Produit(
                "PESTO CHICKEN PIZZA",
                9,
                R.drawable.pizza9,
                "20",
                "- 1/2 pound reduced-fat bulk pork sausage\n"
                        + "- 1 prebaked 12-inch pizza crust\n"
                        + "- 1 package (6 ounces) sliced turkey pepperoni\n"
                        + "- 2 cups shredded part-skim mozzarella cheese\n"
                        + "- 1-1/2 cups chopped plum tomatoes\n"
                        + "- 1/2 cup fresh basil leaves, thinly sliced\n"
                        + "- 1 tablespoon olive oil\n"
                        + "- 2 garlic cloves, minced\n"
                        + "- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n"
                        + "- 1/2 teaspoon balsamic vinegar\n"
                        + "- 1/4 teaspoon salt\n"
                        + "- 1/8 teaspoon pepper\n"
                        + "- Additional fresh basil leaves, optional",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes...",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\n"
                        + "STEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\n"
                        + "STEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro.",
                9
        ));

        produitService.create(new Produit(
                "LOADED MEXICAN PIZZA",
                7,
                R.drawable.pizza10,
                "40",
                "- 1/2 pound reduced-fat bulk pork sausage\n"
                        + "- 1 prebaked 12-inch pizza crust\n"
                        + "- 1 package (6 ounces) sliced turkey pepperoni\n"
                        + "- 2 cups shredded part-skim mozzarella cheese\n"
                        + "- 1-1/2 cups chopped plum tomatoes\n"
                        + "- 1/2 cup fresh basil leaves, thinly sliced\n"
                        + "- 1 tablespoon olive oil\n"
                        + "- 2 garlic cloves, minced\n"
                        + "- 1/2 teaspoon minced fresh thyme or 1/8 teaspoon dried thyme\n"
                        + "- 1/2 teaspoon balsamic vinegar\n"
                        + "- 1/4 teaspoon salt\n"
                        + "- 1/8 teaspoon pepper\n"
                        + "- Additional fresh basil leaves, optional",
                "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor and plenty of fresh tomatoes...",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill, covered, until a thermometer reads 165°, 5-7 minutes per side, basting frequently with 1/2 cup barbecue sauce during the last 4 minutes. Cool slightly. Cut into cubes.\n\n"
                        + "STEP 2:\n\n  Divide dough in half. On a well-greased large sheet of heavy-duty foil, press each portion of dough into a 10x8-in. rectangle; brush lightly with oil. Invert dough onto grill rack; peel off foil. Grill, covered, over medium heat until bottom is lightly browned, 1-2 minutes.\n\n"
                        + "STEP 3:\n\n  Remove from grill. Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill, covered, until bottom is lightly browned and cheese is melted, 2-3 minutes. Sprinkle with cilantro.",
                10
        ));

        produits = produitService.findAll();
        PizzaAdapter adapter = new PizzaAdapter(this, produits);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Produit selectedPizza = (Produit) parent.getItemAtPosition(position);
                Log.d("ListPizzaActivity", "Clicked on: " + selectedPizza.getNom() + " (ID: " + selectedPizza.getId() + ")");

                Intent intent = new Intent(ListPizzaActivity.this, MainActivity.class);
                intent.putExtra("PIZZA_ID", selectedPizza.getId());
                startActivity(intent);
            }
        });

    }
}
