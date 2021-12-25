package org.doogle.rules;

import io.quarkus.logging.Log;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

public class Hello implements RuleUnitData {
    DataStore<String> strings = DataSource.createStore();

    public DataStore<String> getStrings() {
        Log.info("Returning String : "+ strings);
        return strings;
    }
}