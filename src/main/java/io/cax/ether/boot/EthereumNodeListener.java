package io.cax.ether.boot;

import org.ethereum.core.Block;
import org.ethereum.core.TransactionReceipt;
import org.ethereum.facade.Ethereum;
import org.ethereum.listener.EthereumListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by cq on 12/2/16.
 */
public class EthereumNodeListener extends EthereumListenerAdapter {

    Logger logger = LoggerFactory.getLogger("ethereum-listener");

    private Ethereum ethereum;

    public EthereumNodeListener(Ethereum ethereum){
        this.ethereum = ethereum;
    }

    @Override
    public void onBlock(Block block, List<TransactionReceipt> receipts) {

        logger.info("Block # " + block.getNumber() + " processed!!");
    }

    @Override
    public void onSyncDone() {
        System.out.println("Sync done!!");
    }
}