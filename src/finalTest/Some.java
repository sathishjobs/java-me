package finalTest;

public class Some {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public Some(String name){
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " Created, instance is "+ instanceNumber);
    }

    public int getInstanceNumber(){
        return instanceNumber;
    }

}
