package ax.Dd;

/* loaded from: classes3.dex */
public final class i extends c {
    private final byte[] b;

    public i(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 57);
    }

    public void a(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, i, 57);
    }

    public byte[] b() {
        return ax.Nd.a.d(this.b);
    }
}
