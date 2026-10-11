/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.PortWatcher;

public final class e
implements Runnable {
    public final PortWatcher q;

    public /* synthetic */ e(PortWatcher portWatcher) {
        this.q = portWatcher;
    }

    @Override
    public final void run() {
        this.q.g();
    }
}

