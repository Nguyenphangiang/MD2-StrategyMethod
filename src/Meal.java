public abstract class Meal {
    public final void doMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }
    public abstract void prepareIngredients();
    public abstract void cook();
    public void eat(){
        System.out.println("Mmm,delicious");
    }
    public abstract void cleanUp();
}
