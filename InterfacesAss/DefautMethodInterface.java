public interface DefautMethodInterface {
    void show();

    default void display() {

        System.out.println("Default Method in Interface");
    }
    
}