public class Main{
    public static void main(string[] args){
     System.out.println("Hello world"); 
    
    String [] books = ("Java Programming", "Database Design", "with Development");
    System.out.println("Available Books: ");
    for (String book : books) {
        System.out.println("- " + book);
    }
    }
}