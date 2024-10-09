public class Main {
    public static void main(String[] args) {
        Reader furkanObject = new Reader("Furkan",25,'M');
        furkanObject.setBook(new Book("Beyaz Diş",125,1,true,"Jack London"));
        System.out.println(furkanObject.getBook().author.getName());
        furkanObject.getBook().nextPage(12);
        System.out.println(furkanObject.getBook().getCurrentPage());
        System.out.println(furkanObject.getBook().getPage());
    }
}