package limitservice.limitservice.controller;

import limitservice.limitservice.configuration.Configuration;
import limitservice.limitservice.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitcontroller {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limit")
    public Limit retrivalLimit(Limit limit) {
        return new Limit(configuration.getMinimum(),
                configuration.getMaximum());
    }
}
