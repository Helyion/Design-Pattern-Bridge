public abstract class Shape implements IShape{
    private IColor color;
    private String shape;
    public Shape (IColor color, String shape){
        this.color = color;
        this.shape = shape;
    }
    public IColor getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return this.shape + " " + this.getColor().getName();
    }
}
