package creational_design_pattern.singleton;

import java.io.Serializable;
import java.util.Objects;

public class Singleton  implements Serializable {

    /**
     * Restrict the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
     * Make Singleton reflection proof
     * Make Singleton thread safe
     * Double check locking method: ( mack static method synchronized or  Double check locking method or  use volatile keyword)
     * Make Singleton safe from Serialization
     * */

    private static volatile Singleton singleton =  null;

    /** private Constructor */
    private Singleton(){
        System.out.println("Constructor called");

        /** Prevent form the reflection api. */
        if (Objects.nonNull(singleton)){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /** synchronized Make Singleton thread safe */
    public static synchronized Singleton getInstance() {
        if (Objects.isNull(singleton)) {
            System.out.println("New Object");
//            return singleton = new Singleton();

            // Double check locking pattern And make singlet instance variable volatile
            synchronized (Singleton.class) {   //Check for the second time.
                //if there is no instance available... create new one
                if (singleton == null) return singleton = new Singleton();
            }

        }
        System.out.println("Existing Object");
        return singleton;
    }


        /** Make singleton from serialize and deserialize operation. */
        protected Singleton readResolve () {
            return getInstance();
        }

}
