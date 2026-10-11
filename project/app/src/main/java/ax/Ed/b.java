/*
 * Decompiled with CFR 0.152.
 */
package ax.Ed;

import ax.Dd.h;
import ax.Dd.i;
import ax.Nd.a;
import ax.vd.d;
import ax.vd.r;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class b
implements r {
    private final b a = new b();
    private final byte[] b;
    private boolean c;
    private h d;
    private i e;

    public b(byte[] byArray) {
        this.b = ax.Nd.a.d(byArray);
    }

    @Override
    public boolean a(byte[] byArray) {
        i i8;
        if (!this.c && (i8 = this.e) != null) {
            return this.a.b(i8, this.b, byArray);
        }
        throw new IllegalStateException("Ed448Signer not initialised for verification");
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        ((OutputStream)this.a).write(byArray, n8, n9);
    }

    @Override
    public byte[] c() {
        h h8;
        if (this.c && (h8 = this.d) != null) {
            return this.a.a(h8, this.b);
        }
        throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
    }

    public void d() {
        this.a.reset();
    }

    @Override
    public void e(boolean bl, d d8) {
        this.c = bl;
        if (bl) {
            this.d = (h)d8;
            this.e = null;
        } else {
            this.d = null;
            this.e = (i)d8;
        }
        this.d();
    }

    private static class b
    extends ByteArrayOutputStream {
        private b() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        byte[] a(h h8, byte[] byArray) {
            synchronized (this) {
                byte[] byArray2 = new byte[114];
                h8.c(0, byArray, this.buf, 0, this.count, byArray2, 0);
                this.reset();
                return byArray2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean b(i i8, byte[] byArray, byte[] byArray2) {
            synchronized (this) {
                Throwable throwable2;
                block4: {
                    try {
                        if (114 != byArray2.length) {
                            this.reset();
                            return false;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    boolean bl = ax.Jd.b.Q(byArray2, 0, i8.b(), 0, byArray, this.buf, 0, this.count);
                    this.reset();
                    return bl;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void reset() {
            synchronized (this) {
                ax.Nd.a.h(this.buf, 0, this.count, (byte)0);
                this.count = 0;
                return;
            }
        }
    }
}

