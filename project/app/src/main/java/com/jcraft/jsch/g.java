/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Channel;

public final class g
implements Runnable {
    public final Channel q;

    public /* synthetic */ g(Channel channel) {
        this.q = channel;
    }

    @Override
    public final void run() {
        this.q.t();
    }
}

