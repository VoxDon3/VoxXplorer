package ax.f1;

import ax.S0.C0968a;
import java.nio.ByteBuffer;

/* renamed from: ax.f1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2020n extends ax.V0.i {
    private long k0;
    private int l0;
    private int m0;

    public C2020n() {
        super(2);
        this.m0 = 32;
    }

    private boolean I(ax.V0.i iVar) {
        ByteBuffer byteBuffer;
        if (!M()) {
            return true;
        }
        if (this.l0 >= this.m0) {
            return false;
        }
        ByteBuffer byteBuffer2 = iVar.e0;
        return byteBuffer2 == null || (byteBuffer = this.e0) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean H(ax.V0.i iVar) {
        C0968a.a(!iVar.E());
        C0968a.a(!iVar.r());
        C0968a.a(!iVar.s());
        if (!I(iVar)) {
            return false;
        }
        int i = this.l0;
        this.l0 = i + 1;
        if (i == 0) {
            this.g0 = iVar.g0;
            if (iVar.u()) {
                A(1);
            }
        }
        ByteBuffer byteBuffer = iVar.e0;
        if (byteBuffer != null) {
            C(byteBuffer.remaining());
            this.e0.put(byteBuffer);
        }
        this.k0 = iVar.g0;
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

    public void N(int i) {
        C0968a.a(i > 0);
        this.m0 = i;
    }

    @Override // ax.V0.i, ax.V0.a
    public void p() {
        super.p();
        this.l0 = 0;
    }
}
