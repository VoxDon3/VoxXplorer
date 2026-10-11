package ax.Dd;

/* loaded from: classes3.dex */
public final class n extends c {
    private final byte[] b;

    public n(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    public void a(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, i, 32);
    }

    public byte[] b() {
        return ax.Nd.a.d(this.b);
    }
}
