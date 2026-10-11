package ax.i7;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: ax.i7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2279c extends AbstractC2278b {
    private final byte[] c;
    private final int d;
    private final int e;

    public C2279c(String str, byte[] bArr, int i, int i2) {
        super(str);
        this.c = (byte[]) ax.m7.v.d(bArr);
        ax.m7.v.c(i >= 0 && i2 >= 0 && i + i2 <= bArr.length, "offset %s, length %s, array length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length));
        this.d = i;
        this.e = i2;
    }

    @Override // ax.i7.i
    public boolean c() {
        return true;
    }

    @Override // ax.i7.AbstractC2278b
    public InputStream e() {
        return new ByteArrayInputStream(this.c, this.d, this.e);
    }

    @Override // ax.i7.i
    public long getLength() {
        return this.e;
    }

    @Override // ax.i7.AbstractC2278b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2279c g(String str) {
        return (C2279c) super.g(str);
    }
}
