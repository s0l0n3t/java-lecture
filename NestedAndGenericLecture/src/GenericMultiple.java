public class GenericMultiple <T1,T2,T3>{
    private T1 abc;
    private T2 valueInt;
    private T3 isBool;

    public GenericMultiple(T1 value,T2 value2,T3 value3){
        this.abc = value;
        this.valueInt = value2;
        this.isBool = value3;
    }

    public T1 getAbc() {
        return abc;
    }

    public T2 getValueInt() {
        return valueInt;
    }

    public T3 getIsBool() {
        return isBool;
    }

    public void setAbc(T1 abc) {
        this.abc = abc;
    }

    public void setIsBool(T3 isBool) {
        this.isBool = isBool;
    }

    public void setValueInt(T2 valueInt) {
        this.valueInt = valueInt;
    }

    @Override
    public String toString() {
        return "GenericMultiple{" +
                "abc=" + this.getAbc() +
                ", valueInt=" + this.getValueInt() +
                ", isBool=" + this.getIsBool() +
                '}';
    }
    public <T> void printArray(T[] array){
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
