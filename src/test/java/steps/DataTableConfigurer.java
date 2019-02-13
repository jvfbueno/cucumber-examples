package steps;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import customTypes.Flight;
import customTypes.Item;
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
        typeRegistry.defineDataTableType(new DataTableType(Item.class, new TableEntryTransformer<Item>() {

            @Override
            public Item transform(Map<String, String> row) {
                String name = row.get("name");
                Double price = Double.parseDouble(row.get("price"));
                return new Item(name, price);
            }
        }


        ));



    }
}
