/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Qb.A0;
import ax.Qb.a;
import ax.Qb.c;
import ax.Qb.c0;
import ax.Qb.z;
import ax.wb.i;
import java.util.concurrent.locks.LockSupport;

final class e<T>
extends a<T> {
    private final Thread e0;
    private final c0 f0;

    public e(i i8, Thread thread, c0 c02) {
        super(i8, true, true);
        this.e0 = thread;
        this.f0 = c02;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final T O0() {
        block12: {
            block14: {
                block13: {
                    block11: {
                        c.a();
                        try {
                            var4_1 = this.f0;
                            var3_3 = null;
                            if (var4_1 == null) break block11;
                            c0.f1((c0)var4_1, false, 1, null);
                        }
                        catch (Throwable var3_4) {
                            break block12;
                        }
                    }
                    try lbl-1000:
                    // 2 sources

                    {
                        while (!Thread.interrupted()) {
                            var4_1 = this.f0;
                            var1_5 = var4_1 != null ? var4_1.i1() : 0x7FFFFFFFFFFFFFFFL;
                            break block13;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var4_2) {
                        ** GOTO lbl-1000
                    }
                }
                if (this.a0()) ** GOTO lbl-1000
                c.a();
                LockSupport.parkNanos(this, var1_5);
                ** GOTO lbl-1000
lbl-1000:
                // 1 sources

                {
                    var4_1 = this.f0;
                    if (var4_1 == null) break block14;
                    c0.a1((c0)var4_1, false, 1, null);
                }
            }
            c.a();
            var4_1 = A0.h(this.W());
            if (var4_1 instanceof z) {
                var3_3 = (z)var4_1;
            }
            if (var3_3 == null) {
                return (T)var4_1;
            }
            throw var3_3.a;
lbl-1000:
            // 1 sources

            {
                var3_3 = new InterruptedException();
                this.z((Throwable)var3_3);
                throw var3_3;
            }
lbl-1000:
            // 1 sources

            {
                var3_3 = this.f0;
                if (var3_3 != null) {
                    c0.a1((c0)var3_3, false, 1, null);
                }
                throw var4_2;
            }
        }
        c.a();
        throw var3_4;
    }

    @Override
    protected boolean b0() {
        return true;
    }

    @Override
    protected void w(Object object) {
        if (!l.a(Thread.currentThread(), this.e0)) {
            object = this.e0;
            c.a();
            LockSupport.unpark((Thread)object);
        }
    }
}

