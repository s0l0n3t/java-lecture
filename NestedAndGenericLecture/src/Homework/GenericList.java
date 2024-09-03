package Homework;

import java.lang.reflect.Array;

public class GenericList <T>{
    private T[] array;
    private int maxSize = 10;
    private int size = 0;
    private Class<T[]> type;

    public GenericList(Class<T[]> type, int length){
        array = type.cast(Array.newInstance(type.getComponentType(),length));
        this.type = type;
        this.maxSize = length;
    }
    public GenericList(Class<T[]> type){
        array = type.cast(Array.newInstance(type.getComponentType(),maxSize));
        this.type = type;
    }
    public void add(T value){
        if(this.array.length < maxSize){
            this.array[this.size()] = value;
            this.size++;
        }
        else{
           T[] arrayNew = this.type.cast(Array.newInstance(type.getComponentType(),getCapacity()*2));
           System.arraycopy(array, 0, arrayNew, 0, this.getCapacity());
           this.array = arrayNew;
           this.array[this.size()] = value;
           this.size++;
        }
    }
    public void add(T value,int index){
        if(this.array.length < maxSize){
            this.array[this.size()] = this.array[index];
            this.array[index] = value;
            this.size++;
        }
        else{
            T[] arrayNew = this.type.cast(Array.newInstance(type.getComponentType(),getCapacity()*2));
            System.arraycopy(array, 0, arrayNew, 0, this.getCapacity());
            this.array = arrayNew;
            this.array[this.size()] = this.array[index];
            this.array[index] = value;
            this.size++;
        }
    }

    public int size(){
        return this.size;
    }
    public T get(int index){
        if(index <= this.size()){
            return this.array[index];
        }
        else {
            return null;
        }

    }

    public T remove(int index){//This method is T data typed because homework wanted like this.
        if(index <= this.size()){
            for (int i = index;i< this.size();i++){
                this.array[i] = this.array[i+1];
            }
            this.size--;
            return array[index];
        }
        else{
            return null;
        }
    }

    public T set(int index,T value){
        if(index <= this.size()){
            this.array[index] = value;
            return this.array[index];
        }
        else{
            return null;
        }
    }
    @Override
    public String toString() {
        StringBuilder arraySb = new StringBuilder("[");
        for(int i = 0;i<this.size;i++){
            arraySb.append(array[i]);
            if(i != this.size-1){
                arraySb.append(",");
            }
        }
        arraySb.append("]");
        return arraySb.toString();
    }

    public int indexOf(T value){ //Output gives number of index in array.
        for(int i = 0; i<this.size();i++){
            if(this.array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T value){
        int lastIndex = 0;
        for(int i = 0; i<this.size();i++){
            if(this.array[i] == value){
                lastIndex = i;
            }
        }
        if(lastIndex > 0){
            return lastIndex;
        }
        return -1;
    }
    public boolean isEmpty(){
        return this.size() == 0;
    }
    public int getCapacity(){
        return this.array.length;
    }
    public T[] toArray(){
        return (T[]) this.array;
    }
    public void clear(){
        T[] arrayNew = this.type.cast(Array.newInstance(type.getComponentType(),getCapacity()));
        this.size = 0;
        this.array = arrayNew;
    }
}
