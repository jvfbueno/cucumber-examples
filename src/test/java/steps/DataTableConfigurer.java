package steps;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import customTypes.Flight;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class DataTableConfigurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }


    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(Flight.class, new TableEntryTransformer<Flight>() {
            @Override
            public Flight transform(Map<String, String> row) {
                String category = row.get("category");
                String date = row.get("date");
                String time = row.get("time");
                Integer passengers = Integer.parseInt(row.get("passengers"));
                return new Flight(category, date, time, passengers);
            }
        }));



    }
}
