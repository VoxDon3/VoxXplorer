package ax.b5;

import ax.b5.e;
import java.io.IOException;

/* loaded from: classes.dex */
public class d extends e.c {
    public static final String f0;
    public static final d g0;
    private final char[] c0;
    private final int d0;
    private final String e0;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        f0 = str;
        g0 = new d("  ", str);
    }

    public d(String str, String str2) {
        this.d0 = str.length();
        this.c0 = new char[str.length() * 16];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            str.getChars(0, str.length(), this.c0, i);
            i += str.length();
        }
        this.e0 = str2;
    }

    @Override // ax.b5.e.c, ax.b5.e.b
    public boolean a() {
        return false;
    }

    @Override // ax.b5.e.c, ax.b5.e.b
    public void b(ax.T4.g gVar, int i) throws IOException {
        gVar.H(this.e0);
        if (i <= 0) {
            return;
        }
        int i2 = i * this.d0;
        while (true) {
            char[] cArr = this.c0;
            if (i2 <= cArr.length) {
                gVar.L(cArr, 0, i2);
                return;
            } else {
                gVar.L(cArr, 0, cArr.length);
                i2 -= this.c0.length;
            }
        }
    }
}
