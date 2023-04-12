package Labs.Lab2;

public class IntList { //or IntList, caps at 100 elements with no bullet- proofing or bounds checks, etc.
        private int numElements = 0;
        private int[] data = new int[100];
        public void add(int newInt) {
            data[numElements++] = newInt;
        }

        @Override
        public String toString() {
            String retVal = "";
            for(int i = 0; i < numElements; i++) {
                retVal += data[i] + " ";
            }
            return retVal;
        }
//main goes here from the lab

    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(95); a.add(100); a.add(58);
        System.out.println(a.toString() );
        System.out.println(a.sum() );
        System.out.println(a.indexOf(100)); //uncomment these to work on next
        //System.out.println(a.indexOf(20));
        //System.out.println(a.save() );
    }

    public int sum(){
            int sum = 0;
        for (int i = 0; i < numElements; i++) {
            sum += data[i];
        }
            return sum;
    }

    public int indexOf(int target){
        for (int i = 0; i < numElements; i++) {
            if (target == data[i]){
                return i;
            }
        }
        return -1;
    }

    }

