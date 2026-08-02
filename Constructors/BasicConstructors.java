public class BasicConstructors {

    public BasicConstructors(){
        System.out.println("I am Default Constructor");
    }

    public BasicConstructors(String name){
        System.out.println("I am One Argument Constructor");
        System.out.println("Name: " + name);
    }

    public BasicConstructors(String word, int length){
        System.out.println("I am Two Argument Contsructor");
        System.out.println("Word: " + word);
        System.out.println("Word Length: " + length);
    }
}
