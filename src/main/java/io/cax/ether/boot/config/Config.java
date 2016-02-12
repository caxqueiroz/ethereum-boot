package io.cax.ether.boot.config;

import io.cax.ether.boot.EthereumNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

/**
 * Created by cq on 12/2/16.
 */
@Configuration
public class Config {

    @Bean
    EthereumNode ethereum() throws Exception {
        EthereumNode ethereumNode = new EthereumNode();
        Executors.newSingleThreadExecutor().submit(ethereumNode::start);
        return ethereumNode;
    }
}