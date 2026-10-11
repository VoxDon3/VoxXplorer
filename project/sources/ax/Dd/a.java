package ax.Dd;

import ax.vd.InterfaceC3307d;

/* loaded from: classes3.dex */
public class a implements InterfaceC3307d {
    private byte[] a;
    private byte[] b;
    private k c;
    private int d;

    public a(k kVar, int i, byte[] bArr) {
        this(kVar, i, bArr, null);
    }

    public byte[] a() {
        return ax.Nd.a.d(this.a);
    }

    public k b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public byte[] d() {
        return ax.Nd.a.d(this.b);
    }

    public a(k kVar, int i, byte[] bArr, byte[] bArr2) {
        this.c = kVar;
        this.b = ax.Nd.a.d(bArr);
        this.d = i;
        this.a = ax.Nd.a.d(bArr2);
    }
}
