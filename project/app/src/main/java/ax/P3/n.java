/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.os.Looper;
import ax.P3.s;
import ax.k4.h;

class n<Z>
implements s<Z> {
    private a c0;
    private ax.M3.h d0;
    private int e0;
    private boolean f0;
    private final s<Z> g0;
    private final boolean q;

    n(s<Z> s8, boolean bl) {
        this.g0 = h.d(s8);
        this.q = bl;
    }

    void a() {
        if (!this.f0) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                ++this.e0;
                return;
            }
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        throw new IllegalStateException("Cannot acquire a recycled resource");
    }

    @Override
    public Class<Z> b() {
        return this.g0.b();
    }

    boolean c() {
        return this.q;
    }

    void d() {
        if (this.e0 > 0) {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                int n8;
                this.e0 = n8 = this.e0 - 1;
                if (n8 == 0) {
                    this.c0.b(this.d0, this);
                }
                return;
            }
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
    }

    void e(ax.M3.h h8, a a8) {
        this.d0 = h8;
        this.c0 = a8;
    }

    @Override
    public Z get() {
        return this.g0.get();
    }

    @Override
    public int getSize() {
        return this.g0.getSize();
    }

    @Override
    public void recycle() {
        if (this.e0 <= 0) {
            if (!this.f0) {
                this.f0 = true;
                this.g0.recycle();
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EngineResource{isCacheable=");
        stringBuilder.append(this.q);
        stringBuilder.append(", listener=");
        stringBuilder.append(this.c0);
        stringBuilder.append(", key=");
        stringBuilder.append(this.d0);
        stringBuilder.append(", acquired=");
        stringBuilder.append(this.e0);
        stringBuilder.append(", isRecycled=");
        stringBuilder.append(this.f0);
        stringBuilder.append(", resource=");
        stringBuilder.append(this.g0);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    static interface a {
        public void b(ax.M3.h var1, n<?> var2);
    }
}

