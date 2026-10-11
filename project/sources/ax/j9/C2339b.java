package ax.j9;

import java.util.Arrays;

/* renamed from: ax.j9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2339b {
    private final String a;
    private final char[] b;
    private final String c;

    public C2339b(String str, char[] cArr, String str2) {
        this.a = str;
        this.b = Arrays.copyOf(cArr, cArr.length);
        this.c = str2;
    }

    public String a() {
        return this.c;
    }

    public char[] b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.a.isEmpty() && this.b.length == 0;
    }

    public boolean e() {
        return this.a.equals("Guest") && this.b.length == 0;
    }

    public String toString() {
        return "AuthenticationContext[" + this.a + '@' + this.c + ']';
    }
}
