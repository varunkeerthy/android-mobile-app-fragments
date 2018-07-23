package tutorial.demo.btes.com.andoridappfragments;

public class Menu {
    private String name;
    private String description;

    public static final Menu[] menus = {
        new Menu("Breakfast", "2 Whole eggs \n Bread \n Coffee"),
        new Menu("Lunch", "3 Whole eggs \n Brocolli"),
        new Menu("Dinner", "Brown rice \n potato \n Brocolli")
    };

    private Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

}
