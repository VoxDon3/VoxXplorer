/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelExec;

public final class b
implements Runnable {
    public final ChannelExec q;

    public /* synthetic */ b(ChannelExec channelExec) {
        this.q = channelExec;
    }

    @Override
    public final void run() {
        this.q.t();
    }
}

