package ro.ctrln.java.inner;

public class OuterClass {
    private static final int SIZE = 6;
    private String[] messageList = {"messsage 1", "message 2", "message 3", "message 4", "message 5"};

    private class InnerClass {
        private int nextIndex = 0;

        public boolean hasNext() {
            return (this.nextIndex <= SIZE - 1);
        }

        public String next() {
//            String returnedMessage = messageList[this.nextIndex];
//            this.nextIndex++;
//            return returnedMessage;
            return messageList[this.nextIndex++];     // Aceste doua constructii sunt identice
        }
    }


    public void showMessage() {
        InnerClass innerClass = this. new InnerClass();
        while (innerClass.hasNext()) {
            System.out.println("Mesajul este: " + innerClass.next());
        }
    }

    public static void main(String[] args) {
        try {
            OuterClass outerClass = new OuterClass();
            outerClass.showMessage();
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Arayul este mai mare");
        }
    }
}
