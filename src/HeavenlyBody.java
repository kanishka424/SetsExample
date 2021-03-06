import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
private final String name;
private final double orbitalPeriod;
private final Set<HeavenlyBody> satellites;

public HeavenlyBody(String name,double orbitalPeriod){
    this.name=name;
    this.orbitalPeriod=orbitalPeriod;
    this.satellites=new HashSet<>();
}

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
    return this.satellites.add(moon);//returns true or false

    }

    public Set<HeavenlyBody> getSatellites(){
    return new HashSet<> (this.satellites);//we avoid returning the original instead return a copy due to risk of editing
    }


    @Override
    public boolean equals(Object obj){
        System.out.println("obj class"+obj.getClass());
        System.out.println("this class"+this.getClass());

        if(this==obj){
        return true;
    }
    if(obj==null||obj.getClass()!=this.getClass()){
        return false;
    }

    String objName=((HeavenlyBody)obj).getName();
    return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+57;
    }
}
