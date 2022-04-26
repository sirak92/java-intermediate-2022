package zoo;

public class Cages {
    private int number;
    private boolean lattice;
    private boolean needsRenovation;
    private int repairPrice;

    public Cages(int number, boolean lattice, boolean needsRenovation,int repairPrice) {
        this.number = number;
        this.lattice = lattice;
        this.needsRenovation = needsRenovation;
        this.repairPrice=repairPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isLattice() {
        return lattice;
    }

    public void setLattice(boolean lattice) {
        this.lattice = lattice;
    }

    public boolean isNeedsRenovation() {
        return needsRenovation;
    }

    public void setNeedsRenovation(boolean needsRenovation) {
        this.needsRenovation = needsRenovation;
    }

    public int getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(int repairPrice) {
        this.repairPrice = repairPrice;
    }
}