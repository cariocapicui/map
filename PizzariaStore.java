package factoryMethod;

import factoryMethod.PizzaStoreFM.ChicagoStyleVeggiePizza;
import factoryMethod.PizzaStoreFM.Pizza;


public class PizzariaStore {
	interface FabricaDePizza {

		Pizza criarPizza(String style, String tipo);
			
	}
	
	
	class PizzaNewYork implements FabricaDePizza {
		Pizza pizza = null;
		public Pizza criarPizza(String style, String tipo) {
			if (tipo.equals("cheese") {
				pizza = new NewYorkStyleCheesePizza();
			}
	        return new PizzaNewYork();
	    }
		
	class PizzaChicago implements FabricaDePizza {
		Pizza pizza = null;
		public Pizza criarPizza(String style, String tipo) {
			if (tipo.equals("veggie") {
				pizza = new ChicagoStyleVeggiePizza();
			}
			return new PizzaChicago();
		}
	}
	
	
	}
	
	
}
Escolhi esse padrão FactoryMethod pq ele cria uma fabrica de pizza onde voce tem duas famílias.
