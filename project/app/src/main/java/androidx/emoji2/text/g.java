/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import androidx.emoji2.text.e;

public final class g
implements Runnable {
    public final Throwable c0;
    public final e.f q;

    public /* synthetic */ g(e.f f8, Throwable throwable) {
        this.q = f8;
        this.c0 = throwable;
    }

    @Override
    public final void run() {
        e.f.a(this.q, this.c0);
    }
}

