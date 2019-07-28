public class ImagePrinter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Printer closed.");
    }

    public void printImage () {
        System.out.println("Print");
    }
}
