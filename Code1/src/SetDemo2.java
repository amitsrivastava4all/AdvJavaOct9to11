import java.util.HashSet;

class Book{
	int id;
	String name;
	String author;
	Book(int id , String name, String author){
		this.id = id;
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Id "+id+" Name "+name+" Author "+author;
	}
	@Override
	public boolean equals(Object object) {
		if(this==object) {
			return true;
		}
		if(object instanceof Book) {
			Book book = (Book) object;
			if(this.id == book.id && 
					this.name.equalsIgnoreCase(book.name) 
					&& this.author.equalsIgnoreCase(book.author)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return author.length()*20-2;
	}
}
public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> books = new HashSet<>();
		Book b =new Book(1001,"Let Us C","Yashwant");
		System.out.println(b.hashCode());
		books.add(b);
		Book c = new Book(1001,"Let Us C","Yashwant");
		System.out.println(c.hashCode());
		books.add(c);
		books.add(new Book(1001,"Let Us C","Yashwant"));
		System.out.println(books);

	}

}
