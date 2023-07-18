public class Main {
    public static void main(String[] args) {
        int nota = 70;

        if (nota >= 80) {
            System.out.println("graduação A");
        } else if (nota >= 70) {
            System.out.println("graduação B");
        } else if (nota >= 60) {
            System.out.println("graduação C");
        } else if (nota >= 0) {
            System.out.println("graduação D");
        } else {
            System.out.println("nota inválida!");
        }
    }
}
