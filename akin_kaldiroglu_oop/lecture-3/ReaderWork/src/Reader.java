public class Reader {
    private String name;
    private int age;
    private char sex;
    private Book book;

    public Reader(String name,int age,char sex){
        this.name = name;
        this.age = age;
        if(sex == 'M' || sex == 'F'){
            this.sex = sex;
        }

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Book getBook() {
        return book;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
