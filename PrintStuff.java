public class PrintStuff {
    public int userId = 20;

    interface Printer {
        void print();
    }

    public void printApp() {
        int userId = 30;
        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("Anonymous Printer is printing this");
                System.out.println("ID: " + userId);

                InnerClass innerClass = new InnerClass();
                innerClass.printerAnotherThing();


            }

            class InnerClass {
                public void printerAnotherThing() {
                    System.out.println("Anonymous class' inner class is printing this.");
                }
            }
        };

        printer.print();
    }
}
