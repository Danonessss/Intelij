public class Main {

    public static void main(String[] args) {
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("Elena", 1983);
        Reader studentReader = new cReader("Read", 1985);
        Supplier supplier = new cSupplier ("Supp", 1982);


        librarianAdmin.orderBooks(supplier);
        librarianAdmin.findBooks();
        studentReader.pickUpBooks(6);
        studentReader.pickUpBooks(4);
        librarianAdmin.delayNotice(studentReader);
        studentReader.dropOffBooks(5);
        supplier.bringBooks();
    }
}