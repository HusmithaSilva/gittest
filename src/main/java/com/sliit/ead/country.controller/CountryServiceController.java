import com.sliit.ead.countryservice.model.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryServiceController {

    private static List<Country> countryList;

    static {
        countryList = new ArrayList<>();

        countryList.add(new Country("LK", "Sri Lanka", 21, "Colombo"));
        countryList.add(new Country("FI", "Finland", 5.5, "Helsinki"));
        countryList.add(new Country("SE", "Sweden", 9.9, "Stockholm"));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Country> getAllCountries() {
        return countryList;
    }
    
    @RequestMapping("/{countryId}")
    public Country getCountry(@PathVariable("countryId") String countryId) {
        Country c = null;
        for (Country country : countryList) {
            if (country.getCountryId().equals(countryId)) {
                c = country;
                break;
            }
        }
        return c;
    }
}