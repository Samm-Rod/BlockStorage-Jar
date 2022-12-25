package blocks;

import sha.SHA256Helper;
import java.util.Date;

public class Blocks {

    private int index;
    private int nonce;
    private long timestamp;
    private String hash;
    private String previousHash;
    private String transaction;

    public Blocks(int index, String transaction, String previousHash){
        this.index = 0;
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        generateHash();
    }

    public void generateHash(){
        String dataToHash = Integer.toString(index)+previousHash+Long.toString(timestamp)+Integer.toString(nonce)+transaction.toString();
        String hashValue = SHA256Helper.generateHash(dataToHash);
        this.hash = hashValue;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getHash() {
        return hash;
    }

   public void incrementNonce(){
        this.nonce++;
   }

    @Override
    public String toString() {
        return "\nBlocks" +
                "\nIndex : " + index +
                "\nHash : " + hash + '\'' +
                "\nPreviousHash : " + previousHash + '\'' +
                "\nTransaction : " + transaction;
    }
}
