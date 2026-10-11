package ax.V0;

import androidx.media3.decoder.a;
import ax.S0.C0968a;
import ax.V0.h;
import ax.V0.i;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class j<I extends i, O extends androidx.media3.decoder.a, E extends h> implements g<I, O, E> {
    private final Thread a;
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;
    private final Object b = new Object();
    private long n = -9223372036854775807L;
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.w();
        }
    }

    protected j(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = j();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = k();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    private boolean i() {
        return !this.c.isEmpty() && this.h > 0;
    }

    private boolean n() throws InterruptedException {
        E l;
        synchronized (this.b) {
            while (!this.l && !i()) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            I removeFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            boolean z = this.k;
            this.k = false;
            if (removeFirst.s()) {
                o.n(4);
            } else {
                o.c0 = removeFirst.g0;
                if (removeFirst.t()) {
                    o.n(134217728);
                }
                if (!q(removeFirst.g0)) {
                    o.e0 = true;
                }
                try {
                    l = m(removeFirst, o, z);
                } catch (OutOfMemoryError e) {
                    l = l(e);
                } catch (RuntimeException e2) {
                    l = l(e2);
                }
                if (l != null) {
                    synchronized (this.b) {
                        this.j = l;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        o.B();
                    } else if (o.e0) {
                        this.m++;
                        o.B();
                    } else {
                        o.d0 = this.m;
                        this.m = 0;
                        this.d.addLast(o);
                    }
                    t(removeFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void r() {
        if (i()) {
            this.b.notify();
        }
    }

    private void s() throws h {
        E e = this.j;
        if (e != null) {
            throw e;
        }
    }

    private void t(I i) {
        i.p();
        I[] iArr = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }

    private void v(O o) {
        o.p();
        O[] oArr = this.f;
        int i = this.h;
        this.h = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (n());
    }

    @Override // ax.V0.g
    public final void b(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    C0968a.g(z);
                    this.n = j;
                }
                z = true;
                C0968a.g(z);
                this.n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.V0.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void g(I i) throws h {
        synchronized (this.b) {
            s();
            C0968a.a(i == this.i);
            this.c.addLast(i);
            r();
            this.i = null;
        }
    }

    @Override // ax.V0.g
    public void d() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ax.V0.g
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                I i = this.i;
                if (i != null) {
                    t(i);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    t(this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    this.d.removeFirst().B();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract I j();

    protected abstract O k();

    protected abstract E l(Throwable th);

    protected abstract E m(I i, O o, boolean z);

    @Override // ax.V0.g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final I f() throws h {
        I i;
        synchronized (this.b) {
            s();
            C0968a.g(this.i == null);
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    @Override // ax.V0.g
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final O a() throws h {
        synchronized (this.b) {
            try {
                s();
                if (this.d.isEmpty()) {
                    return null;
                }
                return this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final boolean q(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.n;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    protected void u(O o) {
        synchronized (this.b) {
            v(o);
            r();
        }
    }

    protected final void x(int i) {
        C0968a.g(this.g == this.e.length);
        for (I i2 : this.e) {
            i2.C(i);
        }
    }
}
