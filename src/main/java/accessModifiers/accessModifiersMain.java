package accessModifiers;

public class accessModifiersMain {

    public static void main(String[] args) {
        sayHelloViaDefault();
        sayHelloViaPublic();
        sayHelloViaPrivate();
        sayHelloViaProtected();

    }

    /**
     * There are 4 clases modifiers. PUBLIC , PRIVATE , PROTECTED, DEFAULT.
     */

    /**
     * DEFAULT
     * KAI NEPRIDEDAME JOKIO ACCESS MODIFIER JAVA AUTOMATISKAI PADARYS KINTAMAJI AR METODA DEFAULT ACCESS
     * DEFAULT == PACKAGE-PRIVATE
     */
    static void sayHelloViaDefault() {
        System.out.println("Greetings with Default access");
    }

    /**
     * Jeigi pridedate PUBLIC raktazodi (keyword) -prie klases, metodo, lauko -> visas pasaulis gali matyti
     * Visos kitos klases, klases esancios kituose package gali pasiekti ir naudoti ta resursa
     * Tai yra "maziausiai saugus" access modifiers
     */
    public static void sayHelloViaPublic() {
        System.out.println("Greetings with Public access");
    }

    /**
     * PRIVATE
     * Bet koks metodas, field, constructor - su PRIVATE keywordu yra pasiekiamas tik is tos pacios klases!
     */
    private static void sayHelloViaPrivate() {
        System.out.println("Greetings with Private access");
    }
    /** PROTECTED
     * " Tarpinis saugumo kontraliavimo variantas tarp Public ir Private"
     * Jei laukas / metodas yra PROTECTED - galime pasiekti is to pacio pakacage ir papildomai visuose vaikinese klasese
     * kurios extendina tevine klase
    */
    protected static void sayHelloViaProtected(){
        System.out.println("Greetings with Protected access");
    }
}
