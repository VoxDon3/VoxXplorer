/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelShell;

public final class c
implements Runnable {
    public final ChannelShell q;

    public /* synthetic */ c(ChannelShell channelShell) {
        this.q = channelShell;
    }

    @Override
    public final void run() {
        this.q.t();
    }
}

