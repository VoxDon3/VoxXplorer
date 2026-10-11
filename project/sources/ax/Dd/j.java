package ax.Dd;

import ax.vd.InterfaceC3311h;

/* loaded from: classes3.dex */
public final class j implements InterfaceC3311h {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;

    public j(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, null, bArr2, i);
    }

    public byte[] a() {
        return ax.Nd.a.d(this.b);
    }

    public byte[] b() {
        return ax.Nd.a.d(this.c);
    }

    public byte[] c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.a = ax.Nd.a.d(bArr);
        if (bArr2 == null) {
            this.b = new byte[0];
        } else {
            this.b = ax.Nd.a.d(bArr2);
        }
        if (bArr3 == null) {
            this.c = new byte[0];
        } else {
            this.c = ax.Nd.a.d(bArr3);
        }
        if (i != 8 && i != 16 && i != 24 && i != 32) {
            throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        this.d = i;
    }
}
