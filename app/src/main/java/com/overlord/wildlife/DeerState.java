package com.overlord.wildlife;

public interface DeerState {
    boolean hunt();
    int collect();
    boolean canCollect();
}
