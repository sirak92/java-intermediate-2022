public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(1,1,1);
        System.out.println(t.perimetre());
        System.out.println(t.square());
        Tetragon tetragon = new Tetragon(2,3);
        System.out.println(tetragon.perimetre());
        System.out.println(tetragon.square());
    }
}
