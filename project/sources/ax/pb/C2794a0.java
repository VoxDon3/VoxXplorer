package ax.pb;

import ax.qb.C2896d;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import okhttp3.HttpUrl;

/* renamed from: ax.pb.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2794a0 extends IOException implements InterfaceC2815o, InterfaceC2803f, H0 {
    private Throwable c0;
    private int q;

    C2794a0() {
    }

    static String a(int i) {
        if (i == 0) {
            return "NT_STATUS_SUCCESS";
        }
        int i2 = 1;
        if ((i & (-1073741824)) == -1073741824) {
            int length = InterfaceC2815o.s.length - 1;
            while (length >= i2) {
                int i3 = (i2 + length) / 2;
                int i4 = InterfaceC2815o.s[i3];
                if (i > i4) {
                    i2 = i3 + 1;
                } else {
                    if (i >= i4) {
                        return InterfaceC2815o.t[i3];
                    }
                    length = i3 - 1;
                }
            }
        } else {
            int length2 = InterfaceC2803f.p.length - 1;
            int i5 = 0;
            while (length2 >= i5) {
                int i6 = (i5 + length2) / 2;
                int i7 = InterfaceC2803f.p[i6][0];
                if (i > i7) {
                    i5 = i6 + 1;
                } else {
                    if (i >= i7) {
                        return InterfaceC2803f.r[i6];
                    }
                    length2 = i6 - 1;
                }
            }
        }
        return "0x" + C2896d.c(i, 8);
    }

    static String b(int i) {
        int length = H0.Y.length - 1;
        int i2 = 0;
        while (length >= i2) {
            int i3 = (i2 + length) / 2;
            int i4 = H0.Y[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else {
                if (i >= i4) {
                    return H0.Z[i3];
                }
                length = i3 - 1;
            }
        }
        return i + HttpUrl.FRAGMENT_ENCODE_SET;
    }

    static int e(int i) {
        if (((-1073741824) & i) != 0) {
            return i;
        }
        int length = InterfaceC2803f.p.length - 1;
        int i2 = 0;
        while (length >= i2) {
            int i3 = (i2 + length) / 2;
            int[] iArr = InterfaceC2803f.p[i3];
            int i4 = iArr[0];
            if (i > i4) {
                i2 = i3 + 1;
            } else {
                if (i >= i4) {
                    return iArr[1];
                }
                length = i3 - 1;
            }
        }
        return -1073741823;
    }

    public int c() {
        return this.q;
    }

    public Throwable d() {
        return this.c0;
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

    C2794a0(int i, Throwable th) {
        super(a(i));
        this.q = e(i);
        this.c0 = th;
    }

    C2794a0(String str) {
        super(str);
        this.q = -1073741823;
    }

    C2794a0(String str, Throwable th) {
        super(str);
        this.c0 = th;
        this.q = -1073741823;
    }

    public C2794a0(int i, boolean z) {
        super(z ? b(i) : a(i));
        this.q = z ? i : e(i);
    }
}
