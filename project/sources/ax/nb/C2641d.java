package ax.nb;

/* renamed from: ax.nb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2641d extends AbstractC2643f {
    C2641d() {
        this.r = new C2639b();
    }

    @Override // ax.nb.AbstractC2643f
    int a(byte[] bArr, int i) {
        return h(bArr, i);
    }

    @Override // ax.nb.AbstractC2643f
    int g(byte[] bArr, int i) {
        if (this.e != 0 || this.d != 0) {
            return 0;
        }
        byte b = bArr[i];
        boolean z = (b & 128) == 128;
        int i2 = (b & 96) >> 5;
        int d = AbstractC2643f.d(bArr, i + 2);
        if (d != 0) {
            this.b[this.a] = new C2644g(this.r, d, z, i2);
            return 6;
        }
        this.b[this.a] = null;
        return 6;
    }

    @Override // ax.nb.AbstractC2643f
    int j(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.nb.AbstractC2643f
    public String toString() {
        return new String("NameQueryResponse[" + super.toString() + ",addrEntry=" + this.b + "]");
    }
}
