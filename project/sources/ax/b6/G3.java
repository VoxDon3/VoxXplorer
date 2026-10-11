package ax.b6;

/* loaded from: classes3.dex */
final class G3 {
    private final S3 a;
    private final byte[] b;

    public final B3 a() {
        this.a.I();
        return new K3(this.b);
    }

    public final S3 b() {
        return this.a;
    }

    private G3(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = S3.H(bArr);
    }
}
