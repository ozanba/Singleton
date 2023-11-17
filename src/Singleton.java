public class Singleton {
    private static  Singleton instance = null;
    private Singleton(){
        System.out.println("Instance created! ");
    }
    public static Singleton CreateInstance() {
        if(instance==null) {
            instance = new Singleton();

        }
        else{
            System.out.println("Not working!!!");
        }
        return instance;

    }

}
