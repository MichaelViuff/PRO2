public class Car
{
    private int id;

    public Car(int id)
    {
        this.id = id;
    }

    public void setLight(String currentLight)
    {
        if("GREEN".equals(currentLight))
        {
            System.out.println("Car " + id + " drives");
        }
        else if("YELLOW_AND_RED".equals(currentLight))
        {                
            System.out.println("Car " + id + " turns engine on");
        }
        else if("RED".equals(currentLight))
        {
            System.out.println("Car " + id + " stops");
        }
        else if("YELLOW".equals(currentLight))
        {
            Sysem.out.println("Car " + id + " slows down");
        }
        else
        {
            System.out.println("Traffic signal broken...");
        }
    }
}


