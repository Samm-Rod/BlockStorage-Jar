import blockchain.BlockChain;
import blocks.Blocks;
import constants.Constants;
import miner.Miner;

public class Main {
    public static void main(String[] args) {

        BlockChain blockChain = new BlockChain();

        Miner miner = new Miner();


        Blocks block0 = new Blocks(0,"transaction1", Constants.GENESIS_PREV_HASH);
        miner.mine(block0, blockChain);

        System.out.println("\n"+ "BLOCKCHAIN:\n"+blockChain);
        System.out.println("Miner's reward: " + miner.getReward());
    }
}
