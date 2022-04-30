import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Black Swan", 453, "Nassim Taleb", "01.01.2022"));
        books.add(new Book("Originals", 321, "Adam Grand","01.01.2022"));
        books.add(new Book("Martin Eden", 412, "Jack London", "01.01.2022"));
        books.add(new Book("Mastery", 335, "Robert Greene", "2012"));
        books.add(new Book("Zero to One", 115, "Peter Thiel", "01.01.2022"));

        TreeMap<String,String> mappedList = new TreeMap<>();


        books.stream().filter(page -> page.getPageNumber() > 400).forEach(
                i -> mappedList.put(i.getBookName(), i.getAuthor())
        );

        System.out.println(mappedList);


    }
}
