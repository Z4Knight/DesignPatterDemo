package exercise_factory;

public class ChiscagoStylePizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else {

			return null;
		}
		
	}
}
