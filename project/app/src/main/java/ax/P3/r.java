/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.P3.s;
import ax.b0.d;
import ax.l4.a;
import ax.l4.b;

final class r<Z>
implements s<Z>,
a.f {
    private static final d<r<?>> f0 = a.e(20, new a.d<r<?>>(){

        public r<?> b() {
            return new r();
        }
    });
    private s<Z> c0;
    private boolean d0;
    private boolean e0;
    private final b q = b.a();

    r() {
    }

    private void a(s<Z> s8) {
        this.e0 = false;
        this.d0 = true;
        this.c0 = s8;
    }

    static <Z> r<Z> c(s<Z> s8) {
        r<?> r8 = f0.b();
        super.a(s8);
        return r8;
    }

    private void d() {
        this.c0 = null;
        f0.a(this);
    }

    @Override
    public Class<Z> b() {
        return this.c0.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block5: {
                    try {
                        this.q.c();
                        if (!this.d0) break block4;
                        this.d0 = false;
                        if (!this.e0) break block5;
                        this.recycle();
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Already unlocked");
            throw illegalStateException;
            throw throwable2;
        }
    }

    @Override
    public Z get() {
        return this.c0.get();
    }

    @Override
    public int getSize() {
        return this.c0.getSize();
    }

    @Override
    public b l() {
        return this.q;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void recycle() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.q.c();
                        this.e0 = true;
                        if (this.d0) break block4;
                        this.c0.recycle();
                        this.d();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

