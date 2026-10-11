package ax.o9;

/* renamed from: ax.o9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2734a extends AbstractC2736c {
    private final byte[] e0;
    private int f0;
    private int g0;

    public C2734a(byte[] bArr, int i, int i2, long j) {
        this.e0 = bArr;
        this.q = j;
        this.f0 = i;
        this.g0 = i2;
    }

    @Override // ax.o9.AbstractC2736c
    public int a() {
        return this.g0;
    }

    @Override // ax.o9.AbstractC2736c
    protected int b(byte[] bArr) {
        int length = bArr.length;
        int i = this.g0;
        if (length > i) {
            length = i;
        }
        System.arraycopy(this.e0, this.f0, bArr, 0, length);
        this.f0 += length;
        this.g0 -= length;
        return length;
    }

    @Override // ax.o9.AbstractC2736c
    public boolean e() {
        return this.g0 > 0;
    }

    @Override // ax.o9.AbstractC2736c
    public void f(int i) {
    }
}
