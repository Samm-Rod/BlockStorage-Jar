package miner;

import blockchain.BlockChain;
import blocks.Blocks;
import constants.Constants;

public class Miner {
    private double reward;

    public double mine(Blocks block, BlockChain blockChain){

        while(notGoldenHash(block)){
            block.generateHash();
            block.incrementNonce();
        }
        System.out.println(block+" has just mined...");
        System.out.println("Hash is: "+block.getHash());
        //appending the block to the blockchain
        blockChain.addBlock(block);
        //calculating the reward
        reward += Constants.MINER_REWARD;

        return 0;
    }
    public boolean notGoldenHash(Blocks block) {

        String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0');

        return !block.getHash().substring (0, Constants.DIFFICULTY).equals (leadingZeros);
    }
    public double getReward() {
        return this.reward;
    }
}
