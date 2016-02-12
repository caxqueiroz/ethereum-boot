package io.cax.ether.boot;

import org.ethereum.facade.Ethereum;
import org.ethereum.facade.EthereumFactory;

/**
 * Created by cq on 12/2/16.
 */
public class EthereumNode {


    private Ethereum ethereum;

    public void start(){

        ethereum = EthereumFactory.createEthereum();
        ethereum.addListener(new EthereumNodeListener(ethereum));
    }



}
