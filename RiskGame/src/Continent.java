import java.util.ArrayList;
import java.util.List;

/**
 * @author Hemanshu
 * @date 2019-02-19
 */
public class Continent {
	String continentName;
	int controlValue;
	List<String> Countries= new ArrayList<>();
	List<String> Continents= new ArrayList<>();
	
	public Continent(String name , int point) {
		this.continentName = name;
		this.controlValue = point;
	}

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getControlValue() {
        return controlValue;
    }

    public void setControlValue(int controlValue) {
        this.controlValue = controlValue;
    }

    public List<String> getCountries() {
        return Countries;
    }

    public void setCountries(List<String> countries) {
        Countries = countries;
    }

    public List<String> getContinents() {
        return Continents;
    }

    public void setContinents(List<String> continents) {
        Continents = continents;
    }

    public void InsertCountry(String countryName) {
		this.Countries.add(countryName);
	}

	public void RemoveCountry(String countryName){
		this.Countries.remove(new String("countryName"));
	}

}
