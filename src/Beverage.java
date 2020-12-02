public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

// this method is incomplete it is abstract
// this means that any class which inherits from this class must implement this cost method
    public abstract double cost();
}
