public class TemplateMethod {
    public static void main(String[] args) {
        Meal meal = new HambergerMeal();
        meal.doMeal();
        Meal meal1 = new TacoMeal();
        meal1.doMeal();
    }
}
