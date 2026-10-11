package ax.P3;

import android.os.Looper;

/* loaded from: classes.dex */
class n<Z> implements s<Z> {
    private a c0;
    private ax.M3.h d0;
    private int e0;
    private boolean f0;
    private final s<Z> g0;
    private final boolean q;

    interface a {
        void b(ax.M3.h hVar, n<?> nVar);
    }

    n(s<Z> sVar, boolean z) {
        this.g0 = (s) ax.k4.h.d(sVar);
        this.q = z;
    }

    void a() {
        if (this.f0) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.e0++;
    }

    @Override // ax.P3.s
    public Class<Z> b() {
        return this.g0.b();
    }

    boolean c() {
        return this.q;
    }

    void d() {
        if (this.e0 <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = this.e0 - 1;
        this.e0 = i;
        if (i == 0) {
            this.c0.b(this.d0, this);
        }
    }

    void e(ax.M3.h hVar, a aVar) {
        this.d0 = hVar;
        this.c0 = aVar;
    }

    @Override // ax.P3.s
    public Z get() {
        return this.g0.get();
    }

    @Override // ax.P3.s
    public int getSize() {
        return this.g0.getSize();
    }

    @Override // ax.P3.s
    public void recycle() {
        if (this.e0 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f0) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f0 = true;
        this.g0.recycle();
    }

    public String toString() {
        return "EngineResource{isCacheable=" + this.q + ", listener=" + this.c0 + ", key=" + this.d0 + ", acquired=" + this.e0 + ", isRecycled=" + this.f0 + ", resource=" + this.g0 + '}';
    }
}
