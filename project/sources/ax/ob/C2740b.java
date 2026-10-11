package ax.ob;

import ax.jb.C2345a;
import ax.nb.C2644g;
import ax.qb.C2896d;
import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: ax.ob.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2740b extends AbstractC2739a {
    private static final int f;
    private static final String g;
    private static final String h;
    private String d;
    private String e;

    static {
        f = (C2345a.a("jcifs.smb.client.useUnicode", true) ? 1 : 2) | 512;
        String str = null;
        g = C2345a.h("jcifs.smb.client.domain", null);
        try {
            str = C2644g.t().r();
        } catch (UnknownHostException unused) {
        }
        h = str;
    }

    public C2740b(int i, String str, String str2) {
        f(i | j());
        n(str);
        o(str2 == null ? k() : str2);
    }

    public static int j() {
        return f;
    }

    public static String k() {
        return h;
    }

    public String l() {
        return this.d;
    }

    public String m() {
        return this.e;
    }

    public void n(String str) {
        this.d = str;
    }

    public void o(String str) {
        this.e = str;
    }

    public byte[] p() {
        int i;
        boolean z;
        int i2;
        try {
            String l = l();
            String m = m();
            int a = a();
            byte[] bArr = new byte[0];
            if (l == null || l.length() == 0) {
                i = a & (-4097);
                z = false;
            } else {
                i = a | 4096;
                bArr = l.toUpperCase().getBytes(AbstractC2739a.b());
                z = true;
            }
            byte[] bArr2 = new byte[0];
            if (m == null || m.length() == 0) {
                i2 = i & (-8193);
            } else {
                bArr2 = m.toUpperCase().getBytes(AbstractC2739a.b());
                i2 = i | 8192;
                z = true;
            }
            byte[] bArr3 = new byte[z ? bArr.length + 32 + bArr2.length : 16];
            System.arraycopy(AbstractC2739a.b, 0, bArr3, 0, 8);
            AbstractC2739a.h(bArr3, 8, 1);
            AbstractC2739a.h(bArr3, 12, i2);
            if (z) {
                AbstractC2739a.g(bArr3, 16, 32, bArr);
                AbstractC2739a.g(bArr3, 24, bArr.length + 32, bArr2);
            }
            return bArr3;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public String toString() {
        String l = l();
        String m = m();
        StringBuilder sb = new StringBuilder();
        sb.append("Type1Message[suppliedDomain=");
        if (l == null) {
            l = "null";
        }
        sb.append(l);
        sb.append(",suppliedWorkstation=");
        if (m == null) {
            m = "null";
        }
        sb.append(m);
        sb.append(",flags=0x");
        sb.append(C2896d.c(a(), 8));
        sb.append("]");
        return sb.toString();
    }
}
