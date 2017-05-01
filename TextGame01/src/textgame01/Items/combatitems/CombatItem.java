package textgame01.Items.combatitems;

import textgame01.entities.Entity;

public abstract class CombatItem {
    private int damage;
    private int durability;
    private String name;
    private boolean pierceArmour;
    private double armourPiercing;
    
    public abstract void doDamage(Entity e1, Entity e2);
    public abstract void getStats();
}
