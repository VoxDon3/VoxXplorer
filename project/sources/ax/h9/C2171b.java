package ax.h9;

import java.util.Arrays;

/* renamed from: ax.h9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2171b extends ax.Z8.a<C2171b> {
    private static final byte[] f = {0, 0};
    private static final byte[] g = {0, 0, 0, 0};

    public C2171b() {
        super(ax.Z8.b.b);
    }

    public ax.Z8.a<C2171b> W(int i) {
        byte[] bArr = new byte[i];
        Arrays.fill(bArr, (byte) 0);
        o(bArr);
        return this;
    }

    public ax.Z8.a<C2171b> X() {
        o(f);
        return this;
    }

    public ax.Z8.a<C2171b> Y() {
        o(g);
        return this;
    }

    public ax.Z8.a<C2171b> Z(String str) {
        return q(str, ax.Y8.b.d);
    }

    public ax.Z8.a<C2171b> a0(String str) {
        return str == null ? s(0) : s(str.length() * 2);
    }

    public C2171b(byte[] bArr) {
        super(bArr, ax.Z8.b.b);
    }
}
