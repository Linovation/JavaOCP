
public class Main {
    public static void main(String[] args) {
        try (ImageScanner ir = new ImageScanner();
             ImagePrinter iw = new ImagePrinter())   {
            ir.scanImage();
            iw.printImage();
        }  catch (Exception e)  {
            System.out.print(e.getMessage()); }
       }
}
