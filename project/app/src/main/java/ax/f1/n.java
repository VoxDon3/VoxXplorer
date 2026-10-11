/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import ax.S0.a;
import ax.V0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class n
extends i {
    private long k0;
    private int l0;
    private int m0 = 32;

    public n() {
        super(2);
    }

    private boolean I(i object) {
        ByteBuffer byteBuffer;
        if (!this.M()) {
            return true;
        }
        if (this.l0 >= this.m0) {
            return false;
        }
        object = ((i)object).e0;
        return object == null || (byteBuffer = this.e0) == null || byteBuffer.position() + ((Buffer)object).remaining() <= 0x2EE000;
    }

    public boolean H(i i8) {
        ByteBuffer byteBuffer;
        a.a(i8.E() ^ true);
        a.a(i8.r() ^ true);
        a.a(i8.s() ^ true);
        if (!this.I(i8)) {
            return false;
        }
        int n8 = this.l0;
        this.l0 = n8 + 1;
        if (n8 == 0) {
            this.g0 = i8.g0;
            if (i8.u()) {
                this.A(1);
            }
        }
        if ((byteBuffer = i8.e0) != null) {
            this.C(byteBuffer.remaining());
            this.e0.put(byteBuffer);
        }
        this.k0 = i8.g0;
        return true;
    }

    public long J() {
        return this.g0;
    }

    public long K() {
        return this.k0;
    }

    public int L() {
        return this.l0;
    }

    public boolean M() {
        return this.l0 > 0;
    }

    public void N(int n8) {
        boolean bl = n8 > 0;
        a.a(bl);
        this.m0 = n8;
    }

    @Override
    public void p() {
        super.p();
        this.l0 = 0;
    }
}

