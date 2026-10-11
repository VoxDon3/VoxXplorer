/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelDirectTCPIP;

public final class a
implements Runnable {
    public final ChannelDirectTCPIP q;

    public /* synthetic */ a(ChannelDirectTCPIP channelDirectTCPIP) {
        this.q = channelDirectTCPIP;
    }

    @Override
    public final void run() {
        this.q.t();
    }
}

