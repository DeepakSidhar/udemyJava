public class Bedrooms2 {
    private String name;
    private Walls2 wall1;
    private Walls2 wall2;
    private Walls2 wall3;
    private Walls2 wall4;
    private Ceilings ceiling;
    private Beds bed;
    private Lamps lamp;

    public Bedrooms2(String name, Walls2 wall1, Walls2 wall2, Walls2 wall3, Walls2 wall4, Ceilings ceiling, Beds bed, Lamps lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamps getLamp() {
        return this.lamp;
    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
}

