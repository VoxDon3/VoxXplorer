package ax.Vd;

/* loaded from: classes3.dex */
public abstract class l {
    protected short[] a;
    protected byte[] b;
    protected float c;
    protected boolean d;
    protected String e;

    public l(short[] sArr, byte[] bArr, float f, boolean z, String str) {
        this.a = (short[]) sArr.clone();
        this.b = (byte[]) bArr.clone();
        this.c = f;
        this.d = z;
        this.e = str;
    }

    public String a() {
        return this.e;
    }

    public short b(byte b) {
        return this.a[b & 255];
    }

    public byte c(int i) {
        return this.b[i];
    }

    public float d() {
        return this.c;
    }
}
