/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelSubsystem;

public final class d
implements Runnable {
    public final ChannelSubsystem q;

    public /* synthetic */ d(ChannelSubsystem channelSubsystem) {
        this.q = channelSubsystem;
    }

    @Override
    public final void run() {
        this.q.t();
    }
}

