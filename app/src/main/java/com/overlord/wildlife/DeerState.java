package com.overlord.wildlife;

public interface DeerState {
    void shoot();
    int collect();
    boolean canCollect();
    DeerState nextStage();
}
