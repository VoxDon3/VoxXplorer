package androidx.media3.exoplayer;

import android.os.Looper;
import ax.S0.C0968a;
import ax.S0.InterfaceC0975h;

/* loaded from: classes.dex */
public final class K0 {
    private final b a;
    private final a b;
    private final InterfaceC0975h c;
    private final ax.P0.N d;
    private int e;
    private Object f;
    private Looper g;
    private int h;
    private long i = -9223372036854775807L;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public interface a {
        void l(K0 k0);
    }

    public interface b {
        void B(int i, Object obj) throws C0622s;
    }

    public K0(a aVar, b bVar, ax.P0.N n, int i, InterfaceC0975h interfaceC0975h, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.d = n;
        this.g = looper;
        this.c = interfaceC0975h;
        this.h = i;
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

    public ax.P0.N g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public synchronized boolean i() {
        return this.n;
    }

    public synchronized void j(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public K0 k() {
        C0968a.g(!this.k);
        if (this.i == -9223372036854775807L) {
            C0968a.a(this.j);
        }
        this.k = true;
        this.b.l(this);
        return this;
    }

    public K0 l(Object obj) {
        C0968a.g(!this.k);
        this.f = obj;
        return this;
    }

    public K0 m(int i) {
        C0968a.g(!this.k);
        this.e = i;
        return this;
    }
}
