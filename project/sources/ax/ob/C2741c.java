package ax.ob;

import ax.jb.C2345a;
import ax.nb.C2644g;
import ax.qb.C2896d;
import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: ax.ob.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2741c extends AbstractC2739a {
    private static final int h;
    private static final String i;
    private static final byte[] j;
    private byte[] d;
    private String e;
    private byte[] f;
    private byte[] g;

    static {
        int i2;
        h = (C2345a.a("jcifs.smb.client.useUnicode", true) ? 1 : 2) | 512;
        String h2 = C2345a.h("jcifs.smb.client.domain", null);
        i = h2;
        byte[] bArr = new byte[0];
        if (h2 != null) {
            try {
                bArr = h2.getBytes("UTF-16LE");
            } catch (IOException unused) {
            }
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[0];
        try {
            String r = C2644g.t().r();
            if (r != null) {
                bArr2 = r.getBytes("UTF-16LE");
            }
        } catch (UnknownHostException | IOException unused2) {
        }
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[(length > 0 ? length + 4 : 0) + (length2 > 0 ? length2 + 4 : 0) + 4];
        if (length > 0) {
            AbstractC2739a.i(bArr3, 0, 2);
            AbstractC2739a.i(bArr3, 2, length);
            System.arraycopy(bArr, 0, bArr3, 4, length);
            i2 = length + 4;
        } else {
            i2 = 0;
        }
        if (length2 > 0) {
            AbstractC2739a.i(bArr3, i2, 1);
            AbstractC2739a.i(bArr3, i2 + 2, length2);
            System.arraycopy(bArr2, 0, bArr3, i2 + 4, length2);
        }
        j = bArr3;
    }

    public C2741c(byte[] bArr) throws IOException {
        n(bArr);
    }

    private void n(byte[] bArr) throws IOException {
        for (int i2 = 0; i2 < 8; i2++) {
            if (bArr[i2] != AbstractC2739a.b[i2]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (AbstractC2739a.d(bArr, 8) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int d = AbstractC2739a.d(bArr, 20);
        f(d);
        byte[] c = AbstractC2739a.c(bArr, 12);
        q(c.length != 0 ? new String(c, (d & 1) != 0 ? "UTF-16LE" : AbstractC2739a.b()) : null);
        int i3 = 24;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            if (bArr[i3] != 0) {
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 24, bArr2, 0, 8);
                o(bArr2);
                break;
            }
            i3++;
        }
        int d2 = AbstractC2739a.d(bArr, 16);
        if (d2 == 32 || bArr.length == 32) {
            return;
        }
        int i4 = 32;
        while (true) {
            if (i4 >= 40) {
                break;
            }
            if (bArr[i4] != 0) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                p(bArr3);
                break;
            }
            i4++;
        }
        if (d2 == 40 || bArr.length == 40) {
            return;
        }
        byte[] c2 = AbstractC2739a.c(bArr, 40);
        if (c2.length != 0) {
            r(c2);
        }
    }

    public byte[] j() {
        return this.d;
    }

    public byte[] k() {
        return this.f;
    }

    public String l() {
        return this.e;
    }

    public byte[] m() {
        return this.g;
    }

    public void o(byte[] bArr) {
        this.d = bArr;
    }

    public void p(byte[] bArr) {
        this.f = bArr;
    }

    public void q(String str) {
        this.e = str;
    }

    public void r(byte[] bArr) {
        this.g = bArr;
    }

    public String toString() {
        String str;
        String str2;
        String l = l();
        byte[] j2 = j();
        byte[] k = k();
        byte[] m = m();
        StringBuilder sb = new StringBuilder();
        sb.append("Type2Message[target=");
        sb.append(l);
        sb.append(",challenge=");
        String str3 = "null";
        if (j2 == null) {
            str = "null";
        } else {
            str = "<" + j2.length + " bytes>";
        }
        sb.append(str);
        sb.append(",context=");
        if (k == null) {
            str2 = "null";
        } else {
            str2 = "<" + k.length + " bytes>";
        }
        sb.append(str2);
        sb.append(",targetInformation=");
        if (m != null) {
            str3 = "<" + m.length + " bytes>";
        }
        sb.append(str3);
        sb.append(",flags=0x");
        sb.append(C2896d.c(a(), 8));
        sb.append("]");
        return sb.toString();
    }
}
