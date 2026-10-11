/*
 * Decompiled with CFR 0.152.
 */
package ax.b8;

public final class c
implements Runnable {
    public final boolean c0;
    public final com.google.firebase.installations.c q;

    public /* synthetic */ c(com.google.firebase.installations.c c8, boolean bl) {
        this.q = c8;
        this.c0 = bl;
    }

    @Override
    public final void run() {
        com.google.firebase.installations.c.c(this.q, this.c0);
    }
}

