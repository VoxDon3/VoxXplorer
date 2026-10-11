package ax.za;

import java.io.IOException;

/* renamed from: ax.za.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3561b extends AbstractC3560a {
    private final ax.Ca.a d;

    public C3561b(ax.Ca.a aVar) {
        this.d = aVar;
    }

    @Override // ax.pa.g
    public int a(byte[] bArr) throws IOException {
        byte[] m = this.d.m();
        System.arraycopy(m, 0, bArr, 0, m.length);
        return m.length;
    }

    @Override // ax.pa.g
    public int b(byte[] bArr, byte[] bArr2) throws IOException {
        byte[] o = this.d.o(bArr);
        System.arraycopy(o, 0, bArr2, 0, o.length);
        return o.length;
    }
}
