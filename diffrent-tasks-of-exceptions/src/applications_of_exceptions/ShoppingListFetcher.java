package applications_of_exceptions;

public class ShoppingListFetcher {
    String[] shoppingList={"Milk","Bread","Eggs","Butter","Fruits"};
    int index;
    public ShoppingListFetcher(int index) {
        this.index = index;
    }
    public void fetchItem() {
        try {
            System.out.println("Item at index "+index+":"+shoppingList[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!"+e.getMessage());
        }
        System.out.println("End of shopping list fetch.");
    }
}
