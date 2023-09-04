public class Tarelka {
    private boolean waste;
    private static int Gid;
    public int id;

    public Tarelka(boolean isWaste){
        waste = isWaste;
        Gid++;
        id = Gid;
    }

    public boolean isWaste(){
        return waste;
    }

    public void setWaste(boolean waste){
        this.waste = waste;
    }

    @Override
    public String toString() {
        return "{"+(waste ? "Грязная":"Чистая")+" тарелка № "+id+"}";
    }
}
