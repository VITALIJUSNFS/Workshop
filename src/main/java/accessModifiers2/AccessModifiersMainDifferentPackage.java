package accessModifiers2;
import accessModifiers.accessModifiersMain;

class accessModifiersMainDifferentPackage extends accessModifiersMain {
    public static void main(String[] args) {

    //  accessModifiersMain.sayHelloViaDefault(); //- negaliu pasiekti package-private metodo kitame package
        accessModifiersMain.sayHelloViaPublic();
    //    accessModifiersMain.sayHelloViaPrivate(); //- negaliu pasiekti package-private metodo kitame package
        accessModifiersMain.sayHelloViaProtected(); // - Protected veikia kai extendinam
    }
}
