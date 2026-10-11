/*
 * Decompiled with CFR 0.152.
 */
package ax.ob;

import ax.nb.g;
import ax.ob.a;
import ax.qb.d;
import java.io.IOException;
import java.net.UnknownHostException;

public class c
extends a {
    private static final int h;
    private static final String i;
    private static final byte[] j;
    private byte[] d;
    private String e;
    private byte[] f;
    private byte[] g;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object var5_7;
        int n8;
        byte[] byArray;
        Object object;
        int n9;
        block9: {
            byte[] byArray2;
            n9 = ax.jb.a.a("jcifs.smb.client.useUnicode", true) ? 1 : 2;
            h = n9 | 0x200;
            object = ax.jb.a.h("jcifs.smb.client.domain", null);
            i = object;
            byArray = byArray2 = new byte[0];
            if (object != null) {
                try {
                    byArray = ((String)object).getBytes("UTF-16LE");
                }
                catch (IOException iOException) {
                    byArray = byArray2;
                }
            }
            n8 = byArray.length;
            object = new byte[0];
            String string = ax.nb.g.t().r();
            Object object2 = object;
            if (string == null) break block9;
            try {
                byte[] byArray3 = string.getBytes("UTF-16LE");
            }
            catch (IOException | UnknownHostException iOException) {
                Object object3 = object;
            }
        }
        int n10 = ((void)var5_7).length;
        n9 = n8 > 0 ? n8 + 4 : 0;
        int n11 = n10 > 0 ? n10 + 4 : 0;
        object = new byte[n9 + n11 + 4];
        if (n8 > 0) {
            a.i((byte[])object, 0, 2);
            a.i((byte[])object, 2, n8);
            System.arraycopy(byArray, 0, object, 4, n8);
            n9 = n8 + 4;
        } else {
            n9 = 0;
        }
        if (n10 > 0) {
            a.i((byte[])object, n9, 1);
            a.i((byte[])object, n9 + 2, n10);
            System.arraycopy(var5_7, 0, object, n9 + 4, n10);
        }
        j = (byte[])object;
    }

    public c(byte[] byArray) throws IOException {
        this.n(byArray);
    }

    private void n(byte[] byArray) throws IOException {
        int n8;
        for (n8 = 0; n8 < 8; ++n8) {
            if (byArray[n8] == a.b[n8]) {
                continue;
            }
            throw new IOException("Not an NTLMSSP message.");
        }
        if (a.d(byArray, 8) == 2) {
            int n9;
            Object object;
            n8 = a.d(byArray, 20);
            this.f(n8);
            byte[] byArray2 = a.c(byArray, 12);
            if (byArray2.length != 0) {
                object = (n8 & 1) != 0 ? "UTF-16LE" : a.b();
                object = new String(byArray2, (String)object);
            } else {
                object = null;
            }
            this.q((String)object);
            for (n8 = 24; n8 < 32; ++n8) {
                if (byArray[n8] == 0) continue;
                object = new byte[8];
                System.arraycopy(byArray, 24, object, 0, 8);
                this.o((byte[])object);
                break;
            }
            if ((n9 = a.d(byArray, 16)) != 32 && byArray.length != 32) {
                for (n8 = 32; n8 < 40; ++n8) {
                    if (byArray[n8] == 0) continue;
                    object = new byte[8];
                    System.arraycopy(byArray, 32, object, 0, 8);
                    this.p((byte[])object);
                    break;
                }
                if (n9 != 40 && byArray.length != 40 && (byArray = a.c(byArray, 40)).length != 0) {
                    this.r(byArray);
                }
            }
            return;
        }
        throw new IOException("Not a Type 2 message.");
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

    public void o(byte[] byArray) {
        this.d = byArray;
    }

    public void p(byte[] byArray) {
        this.f = byArray;
    }

    public void q(String string) {
        this.e = string;
    }

    public void r(byte[] byArray) {
        this.g = byArray;
    }

    public String toString() {
        String string = this.l();
        Object object = this.j();
        byte[] byArray = this.k();
        byte[] byArray2 = this.m();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type2Message[target=");
        stringBuilder.append(string);
        stringBuilder.append(",challenge=");
        string = "null";
        if (object == null) {
            object = "null";
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("<");
            stringBuilder2.append(((byte[])object).length);
            stringBuilder2.append(" bytes>");
            object = stringBuilder2.toString();
        }
        stringBuilder.append((String)object);
        stringBuilder.append(",context=");
        if (byArray == null) {
            object = "null";
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("<");
            ((StringBuilder)object).append(byArray.length);
            ((StringBuilder)object).append(" bytes>");
            object = ((StringBuilder)object).toString();
        }
        stringBuilder.append((String)object);
        stringBuilder.append(",targetInformation=");
        if (byArray2 == null) {
            object = string;
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("<");
            ((StringBuilder)object).append(byArray2.length);
            ((StringBuilder)object).append(" bytes>");
            object = ((StringBuilder)object).toString();
        }
        stringBuilder.append((String)object);
        stringBuilder.append(",flags=0x");
        stringBuilder.append(ax.qb.d.c(this.a(), 8));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

