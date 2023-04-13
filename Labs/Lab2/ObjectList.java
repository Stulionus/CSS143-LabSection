package Labs.Lab2;

public class ObjectList {

    private int numElements = 0;
    private Object[] myShapes = new Object[100];


    public void add(Object nx) {
        myShapes[numElements++] = nx;
    }

    @Override
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += myShapes[i] + " ";
        }
        return retVal;
    }
//main goes here from the lab

    public static void main(String[] args) {
        ObjectList a = new ObjectList();
        a.add(95); a.add(100); a.add(58);
        System.out.println(a.toString() );
    }

    public void addCircle(Object newCircle){
        this.add(newCircle);
    }

    public void addSquare(Object newSquare){
        this.add(newSquare);
    }



}
