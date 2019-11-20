package com.webank.wecross.proof;

public class LeafProof {
    protected String leaf;
    protected String proof;

    public boolean verifyLeaf(String leaf) {
        return this.leaf.equals(leaf);
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public String getProof() {
        return proof;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }
}