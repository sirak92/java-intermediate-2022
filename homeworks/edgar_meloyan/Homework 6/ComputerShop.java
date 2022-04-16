public class ComputerShop {
    public static void main(String[] args) {
    Asus asus = new Asus("Asus", "ROG Zephyrus M16", 32, "Intel Core i7 11800H", "NVIDIA GeForce RTX 3060");
    asus.showTheComputer();
    Acer acer = new Acer("Acer", "Predator Triton 500 SE", 32, "Inter Core i9-11900H", "NVIDIA GeForce RTX 3060/70/80");
    acer.showTheComputer();
    Lenovo lenovo = new Lenovo("Lenovo", "Legion 7 (6 GEN)", 32, "AMD Ryzen 9 5900HX", "NVIDIA GeForce RTX 3080");
    lenovo.showTheComputer();
    }
}