public abstract class Shape implements IShape{
    private IColor color;
    public Shape (IColor color){
        this.color = color;
    }
    public IColor getColor(){
        return this.color;
    }
}
