/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder;

public abstract class a
extends ax.V0.a {
    public long c0;
    public int d0;
    public boolean e0;

    public abstract void B();

    @Override
    public void p() {
        super.p();
        this.c0 = 0L;
        this.d0 = 0;
        this.e0 = false;
    }

    public static interface a<S extends a> {
        public void a(S var1);
    }
}

