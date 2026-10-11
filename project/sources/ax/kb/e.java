package ax.kb;

import ax.pb.H0;
import ax.qb.C2896d;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class e extends IOException implements d, H0 {
    private Throwable c0;
    private int q;

    e(int i) {
        super(a(i));
        this.q = i;
    }

    static String a(int i) {
        int length = d.n.length;
        int i2 = 0;
        while (length >= i2) {
            int i3 = (i2 + length) / 2;
            int i4 = d.n[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else {
                if (i >= i4) {
                    return d.o[i3];
                }
                length = i3 - 1;
            }
        }
        return "0x" + C2896d.c(i, 8);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.c0 == null) {
            return super.toString();
        }
        StringWriter stringWriter = new StringWriter();
        this.c0.printStackTrace(new PrintWriter(stringWriter));
        return super.toString() + "\n" + stringWriter;
    }

    public e(String str) {
        super(str);
    }
}
