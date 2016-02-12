package io.cax.ether.boot;

import org.ethereum.core.Block;
import org.ethereum.core.TransactionReceipt;
import org.ethereum.facade.Ethereum;
import org.ethereum.listener.EthereumListenerAdapter;
import org.ethereum.net.rlpx.Node;

import java.util.List;

/**
 * Created by cq on 12/2/16.
 */
public class EthereumNodeListener extends EthereumListenerAdapter {


    private Ethereum ethereum;


    public EthereumNodeListener(Ethereum ethereum){
        this.ethereum = ethereum;
    }

    @Override
    public void onNodeDiscovered(Node node) {
        System.out.println("HOST >>>>> " + node.getHost());
    }

    @Override
    public void onBlock(Block block, List<TransactionReceipt> receipts) {
        System.out.println("Block #" + block.getNumber());
    }


    @Override
    public void onSyncDone() {
        System.out.println("Sync done!!");
    }
}
