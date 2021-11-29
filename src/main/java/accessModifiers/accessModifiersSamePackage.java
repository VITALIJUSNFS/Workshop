package accessModifiers;

public class accessModifiersSamePackage {
    public static void main(String[] args) {
        accessModifiersMain.sayHelloViaDefault();
        accessModifiersMain.sayHelloViaPublic();
       // accessModifiersMain.sayHelloViaPrivate();- negaliu pasiekti kitos klases Private modifier metodo
        accessModifiersMain.sayHelloViaProtected();

    }
}
