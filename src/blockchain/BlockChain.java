package blockchain;

import blocks.Blocks;
import java.util.ArrayList;
import java.util.List;

public class BlockChain {
    private List<Blocks> blockChain;
    public BlockChain(){
        this.blockChain = new ArrayList<>();
    }


    public void addBlock(Blocks block){
        this.blockChain.add(block);
    }

    public List<Blocks>getBlockChain(){
        return this.blockChain;
    }

    public int size(){
        return this.blockChain.size();
    }

    @Override
    public String toString() {
        String blockChain = "";
        for(Blocks block : this.blockChain){
            blockChain += block.toString()+"\n";
        }
        return blockChain;
    }
}
