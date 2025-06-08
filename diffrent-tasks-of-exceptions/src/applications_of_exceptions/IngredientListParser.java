package applications_of_exceptions;

public class IngredientListParser {
    String [] ingredients={"Tomato", "Onion", "Garlic", "Salt", "Oil"};
    int index;
    public IngredientListParser(int index) {
        this.index=index;
    }
    public void ingredientlist(){
        try{
            System.out.println("Ingredient at "+index+" is "+ingredients[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Tried to access an invalid index. "+e.toString());
        }
        System.out.println("End of ingredient Parsing");
    }
}
