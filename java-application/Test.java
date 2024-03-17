import java.util.Properties;

class Test{

    public static void printSystemProperties(){
        System.out.println("Printing system properties using Java programmes");
        Properties props = System.getProperties();
        System.out.println(props);
    }

    public static void main(String[] args){
        System.out.println("Java program started");
        printSystemProperties(); 
    }
}
