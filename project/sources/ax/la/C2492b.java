package ax.la;

import java.util.Locale;

/* renamed from: ax.la.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2492b extends Exception {
    private final String c0;
    private final int q;

    public C2492b(int i, String str) {
        super(String.format(Locale.US, "%d - %s", Integer.valueOf(i), str));
        this.q = i;
        this.c0 = str;
    }

    public int a() {
        return this.q;
    }
}
