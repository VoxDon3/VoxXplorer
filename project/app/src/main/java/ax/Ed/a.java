/*
 * Decompiled with CFR 0.152.
 */
package ax.Ed;

import ax.Dd.f;
import ax.Dd.g;
import ax.vd.d;
import ax.vd.r;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class a
implements r {
    private final b a = new b();
    private boolean b;
    private f c;
    private g d;

    @Override
    public boolean a(byte[] byArray) {
        g g8;
        if (!this.b && (g8 = this.d) != null) {
            return this.a.b(g8, byArray);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for verification");
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        ((OutputStream)this.a).write(byArray, n8, n9);
    }

    @Override
    public byte[] c() {
        f f8;
        if (this.b && (f8 = this.c) != null) {
            return this.a.a(f8);
        }
        throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
    }

    public void d() {
        this.a.reset();
    }

    @Override
    public void e(boolean bl, d d8) {
        this.b = bl;
        if (bl) {
            this.c = (f)d8;
            this.d = null;
        } else {
            this.c = null;
            this.d = (g)d8;
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
        byte[] a(f f8) {
            synchronized (this) {
                byte[] byArray = new byte[64];
                f8.c(0, null, this.buf, 0, this.count, byArray, 0);
                this.reset();
                return byArray;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean b(g g8, byte[] byArray) {
            synchronized (this) {
                Throwable throwable2;
                block4: {
                    try {
                        if (64 != byArray.length) {
                            this.reset();
                            return false;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    boolean bl = ax.Jd.a.V(byArray, 0, g8.b(), 0, this.buf, 0, this.count);
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

