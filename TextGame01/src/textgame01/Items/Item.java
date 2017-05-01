package textgame01.Items;

public abstract class Item {
    private int durability;
    private int maxCount;
    private int count;
    private String name;
    
    public abstract int getDurability();
    public abstract int getCount();
    public abstract int getMaxCount();
    public abstract String getName();
    public abstract void setDurability();
    public abstract void increaseCount();
    public abstract void decreaseCount();
}
