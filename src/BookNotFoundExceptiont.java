public class BookNotFoundExceptiont extends Exception{
    public  BookNotFoundExceptiont(String uzenet) {
        super(uzenet);

    }
    BookNotFoundExceptiont(){
        super("A könyv nem található");
    }
}
