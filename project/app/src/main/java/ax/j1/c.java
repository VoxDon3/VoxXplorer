/*
 * Decompiled with CFR 0.152.
 */
package ax.j1;

import ax.P0.v;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.j;
import ax.U0.k;
import ax.j1.b;
import java.io.IOException;
import java.util.Arrays;

public abstract class c
extends b {
    private byte[] j;
    private volatile boolean k;

    public c(g g8, k k8, int n8, v v8, int n9, Object object, byte[] byArray) {
        super(g8, k8, n8, v8, n9, object, -9223372036854775807L, -9223372036854775807L);
        if (byArray == null) {
            byArray = d0.f;
        }
        this.j = byArray;
    }

    private void i(int n8) {
        byte[] byArray = this.j;
        if (byArray.length < n8 + 16384) {
            this.j = Arrays.copyOf(byArray, byArray.length + 16384);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() throws IOException {
        Throwable throwable2;
        block4: {
            int n8;
            try {
                this.i.f(this.b);
                int n9 = 0;
                n8 = 0;
                while (n9 != -1 && !this.k) {
                    int n10;
                    this.i(n8);
                    n9 = n10 = this.i.c(this.j, n8, 16384);
                    if (n10 == -1) continue;
                    n8 += n10;
                    n9 = n10;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            if (!this.k) {
                this.g(this.j, n8);
            }
            ax.U0.j.a(this.i);
            return;
        }
        ax.U0.j.a(this.i);
        throw throwable2;
    }

    @Override
    public final void c() {
        this.k = true;
    }

    protected abstract void g(byte[] var1, int var2) throws IOException;

    public byte[] h() {
        return this.j;
    }
}

