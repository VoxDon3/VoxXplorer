package ax.c3;

import ax.b3.C1495j;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: ax.c3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1816d extends AbstractC1818f {
    private byte[] a;

    public C1816d(byte[] bArr) {
        this.a = bArr;
    }

    @Override // ax.c3.G
    public boolean a() {
        return true;
    }

    @Override // ax.c3.G
    public InputStream c(long j) throws C1495j {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
        byteArrayInputStream.skip(j);
        return byteArrayInputStream;
    }

    @Override // ax.c3.G
    public long d() {
        return this.a.length;
    }

    @Override // ax.c3.AbstractC1818f
    public void e() {
    }
}
