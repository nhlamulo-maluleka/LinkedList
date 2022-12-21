public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add(13);
        l.stack(87);
        l.add(54);
        l.stack(24);
        l.add(80);
        l.stack(16);
        l.add(78);

        l.printlist();
        System.out.println();
        l.shift(3);
        System.out.println();
        l.printlist();
        System.out.println();
        l.reverse();
        System.out.println();
        l.printlist();
        System.out.println();
        l.reverse();
        System.out.println();
        l.printlist();
        l.pop();
        System.out.println();
        l.printlist();
    }
}
