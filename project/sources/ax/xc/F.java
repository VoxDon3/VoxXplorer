package ax.xc;

/* loaded from: classes3.dex */
public final class F {
    public static final byte[] a(String str) {
        ax.Gb.l.f(str, "<this>");
        byte[] bytes = str.getBytes(ax.Ob.d.b);
        ax.Gb.l.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        ax.Gb.l.f(bArr, "<this>");
        return new String(bArr, ax.Ob.d.b);
    }
}
