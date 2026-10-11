package ax.o9;

import ax.Z8.a;
import java.io.IOException;

/* renamed from: ax.o9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2735b extends AbstractC2736c {
    private ax.Z8.a<?> e0;

    public C2735b(ax.Z8.a<?> aVar) {
        this.e0 = aVar;
    }

    @Override // ax.o9.AbstractC2736c
    public int a() {
        return this.e0.c();
    }

    @Override // ax.o9.AbstractC2736c
    protected int b(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.e0.c() < bArr.length) {
            length = this.e0.c();
        }
        try {
            this.e0.F(bArr, 0, length);
            return length;
        } catch (a.b e) {
            throw new IOException(e);
        }
    }

    @Override // ax.o9.AbstractC2736c
    public boolean e() {
        return this.e0.c() > 0;
    }

    @Override // ax.o9.AbstractC2736c
    public void f(int i) {
    }
}
