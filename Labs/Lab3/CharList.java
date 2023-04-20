package Labs.Lab3;

public class CharList {
    private char[] list = new char[100];
    private int lenth;


    public CharList() {
        lenth = 0;
    }


    public CharList(String startStr) {
        for (int i = 0; i < startStr.length(); i++) {
            list[i] = startStr.charAt(i);
        }
        lenth = startStr.length();
    }

    public CharList(CharList other) {
        if (other.list == null) {
            lenth = 0;
        } else {
            for (int i = 0; i < other.size(); i++) {
                list[i] = other.list[i];
            }
        }
        lenth = other.size();
    }

    public int size() {
        return lenth;
    }

    public void add(char next) {
        list[lenth + 1] = next;
        lenth++;
    }

    public char get(int index) {
        return list[index];
    }

    @Override
    public String toString() {
        String retString = "";
        for (int i = 0; i < list.length; i++) {
            retString.concat(String.valueOf(list[i]));
        }
        return retString;
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CharList)){return false;}

        CharList that = (CharList) other;

        if (this.size() != that.size()){
            return false;
        }else{
            for (int i = 0; i < list.length; i++) {
                if (this.list[i] != that.get(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
