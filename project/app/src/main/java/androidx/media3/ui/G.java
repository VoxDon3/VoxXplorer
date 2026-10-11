/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

public interface G {
    public void a(a var1);

    public void b(long[] var1, boolean[] var2, int var3);

    public long getPreferredUpdateDelay();

    public void setBufferedPosition(long var1);

    public void setDuration(long var1);

    public void setEnabled(boolean var1);

    public void setPosition(long var1);

    public static interface a {
        public void G(G var1, long var2);

        public void K(G var1, long var2);

        public void M(G var1, long var2, boolean var4);
    }
}

