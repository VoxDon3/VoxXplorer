package ax.M5;

/* renamed from: ax.M5.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0814i {
    private final String a;
    private final String b;

    public C0814i(String str) {
        this(str, null);
    }

    public C0814i(String str, String str2) {
        C0821p.m(str, "log tag cannot be null");
        C0821p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
