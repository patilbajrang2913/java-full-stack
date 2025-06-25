package planetaryweight;

public class PlanetaryWeightCalculator 
{

    public static void main(String[] args) 
{
        double earthWeight = 70.0; 

        PlanetWeightCalculator calculator = new PlanetWeightCalculator(earthWeight);

        
        Thread mercury = new Thread(() -> calculator.calculateWeight("Mercury", 0.38));
        Thread venus = new Thread(() -> calculator.calculateWeight("Venus", 0.91));
        Thread mars = new Thread(() -> calculator.calculateWeight("Mars", 0.38));
        Thread jupiter = new Thread(() -> calculator.calculateWeight("Jupiter", 2.34));
        Thread saturn = new Thread(() -> calculator.calculateWeight("Saturn", 1.06));
        Thread uranus = new Thread(() -> calculator.calculateWeight("Uranus", 0.92));
        Thread neptune = new Thread(() -> calculator.calculateWeight("Neptune", 1.19));

        mercury.start();
        venus.start();
        mars.start();
        jupiter.start();
        saturn.start();
        uranus.start();
        neptune.start();
    }
}

class PlanetWeightCalculator 
{
    private final double earthWeight;

    public PlanetWeightCalculator(double earthWeight)
    {
        this.earthWeight = earthWeight;
    }

    public synchronized void calculateWeight(String planetName, double gravityFactor) 
    {
        double weightOnPlanet = earthWeight * gravityFactor;
        System.out.println(
              Thread.currentThread().getName() + 
            " | Weight on " + planetName + ": " + 
            String.format("%.2f kg", weightOnPlanet)
        );
    }
}