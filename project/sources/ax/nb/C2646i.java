package ax.nb;

/* renamed from: ax.nb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2646i extends AbstractC2643f {
    C2646i(C2639b c2639b) {
        this.q = c2639b;
        this.s = 33;
        this.n = false;
        this.p = false;
    }

    @Override // ax.nb.AbstractC2643f
    int a(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.nb.AbstractC2643f
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.nb.AbstractC2643f
    int j(byte[] bArr, int i) {
        C2639b c2639b = this.q;
        int i2 = c2639b.c;
        c2639b.c = 0;
        int m = m(bArr, i);
        this.q.c = i2;
        return m;
    }

    @Override // ax.nb.AbstractC2643f
    public String toString() {
        return new String("NodeStatusRequest[" + super.toString() + "]");
    }
}
