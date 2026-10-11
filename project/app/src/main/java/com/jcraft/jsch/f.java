/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Session;

public final class f
implements Runnable {
    public final Session q;

    public /* synthetic */ f(Session session) {
        this.q = session;
    }

    @Override
    public final void run() {
        this.q.Q();
    }
}

