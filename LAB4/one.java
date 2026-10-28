// Develop a Java program to create an abstract class EnergySource with members Source ID, Source Name, and Energy Generated (in kWh). Include an abstract method calculateEfficiency(). Derive the classes SolarEnergy and WindEnergy from EnergySource and implement the method based on the following criteria: For SolarEnergy, efficiency is calculated as $(\text{Energy Generated} / 5000) \times 100$. For WindEnergy, efficiency is calculated as $(\text{Energy Generated} / 8000) \times 100$. Display source details and efficiency percentage. Demonstrate dynamic method dispatch using an EnergySource reference.

abstract class EnergySource {
    protected int sourceId;
    protected String sourceName;
    protected double energyGenerated;

    public EnergySource(int sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    
    public abstract double calculateEfficiency();

    
    public void displayDetails() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
    }
}

class SolarEnergy extends EnergySource {
    private static final double SOLAR_CAPACITY = 5000;

    public SolarEnergy(int sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    @Override
    public double calculateEfficiency() {
        return (energyGenerated / SOLAR_CAPACITY) * 100;
    }
}

class WindEnergy extends EnergySource {
    private static final double WIND_CAPACITY = 8000;

    public WindEnergy(int sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    @Override
    public double calculateEfficiency() {
        return (energyGenerated / WIND_CAPACITY) * 100;
    }
}

public class one {
    public static void main(String[] args) {
        
        SolarEnergy solar = new SolarEnergy(1, "Solar Panel Farm", 4500);
        WindEnergy wind = new WindEnergy(2, "Wind Turbine Array", 7200);

        
        EnergySource source1 = solar;
        EnergySource source2 = wind;

        System.out.println("--- Solar Energy Details ---");
        source1.displayDetails();
        System.out.println("Efficiency: " + source1.calculateEfficiency() + "%");
        System.out.println();

        System.out.println("--- Wind Energy Details ---");
        source2.displayDetails();
        System.out.println("Efficiency: " + source2.calculateEfficiency() + "%");
    }
}