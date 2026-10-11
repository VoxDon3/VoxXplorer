package ax.nb;

/* renamed from: ax.nb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2640c extends AbstractC2643f {
    C2640c(C2639b c2639b) {
        this.q = c2639b;
        this.s = 32;
    }

    @Override // ax.nb.AbstractC2643f
    int a(byte[] bArr, int i) {
        return f(bArr, i);
    }

    @Override // ax.nb.AbstractC2643f
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.nb.AbstractC2643f
    int j(byte[] bArr, int i) {
        return m(bArr, i);
    }

    @Override // ax.nb.AbstractC2643f
    public String toString() {
        return new String("NameQueryRequest[" + super.toString() + "]");
    }
}
