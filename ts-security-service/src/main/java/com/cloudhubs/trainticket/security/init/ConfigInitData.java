package com.cloudhubs.trainticket.security.init;

import com.cloudhubs.trainticket.security.entity.Config;
import com.cloudhubs.trainticket.security.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author fdse
 */
@Component
public class ConfigInitData implements CommandLineRunner{

    @Autowired
    ConfigService service;

    @Override
    public void run(String... args) throws Exception {
        Config config = new Config();

        config.setName("DirectTicketAllocationProportion");
        config.setValue("0.5");
        config.setDescription("Allocation Proportion Of The Direct Ticket - From Start To End");
        service.create(config,null);

    }
}
