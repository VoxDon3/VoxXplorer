/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.exoplayer.s;
import ax.P0.N;
import ax.S0.h;

public final class K0 {
    private final b a;
    private final a b;
    private final h c;
    private final N d;
    private int e;
    private Object f;
    private Looper g;
    private int h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public K0(a a8, b b8, N n8, int n9, h h8, Looper looper) {
        this.b = a8;
        this.a = b8;
        this.d = n8;
        this.g = looper;
        this.c = h8;
        this.h = n9;
        this.i = -9223372036854775807L;
        this.j = true;
    }

    public boolean a() {
        return this.j;
    }

    public Looper b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public Object d() {
        return this.f;
    }

    public long e() {
        return this.i;
    }

    public b f() {
        return this.a;
    }

    public N g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean i() {
        synchronized (this) {
            return this.n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void j(boolean bl) {
        synchronized (this) {
            this.l = bl | this.l;
            this.m = true;
            this.notifyAll();
            return;
        }
    }

    public K0 k() {
        ax.S0.a.g(this.k ^ true);
        if (this.i == -9223372036854775807L) {
            ax.S0.a.a(this.j);
        }
        this.k = true;
        this.b.l(this);
        return this;
    }

    public K0 l(Object object) {
        ax.S0.a.g(this.k ^ true);
        this.f = object;
        return this;
    }

    public K0 m(int n8) {
        ax.S0.a.g(this.k ^ true);
        this.e = n8;
        return this;
    }

    public static interface a {
        public void l(K0 var1);
    }

    public static interface b {
        public void B(int var1, Object var2) throws s;
    }
}

