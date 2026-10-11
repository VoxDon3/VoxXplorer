/*
 * Decompiled with CFR 0.152.
 */
package ax.ob;

import ax.nb.g;
import ax.ob.a;
import ax.qb.d;
import java.io.IOException;
import java.net.UnknownHostException;

public class b
extends a {
    private static final int f;
    private static final String g;
    private static final String h;
    private String d;
    private String e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n8 = 1;
        if (!ax.jb.a.a("jcifs.smb.client.useUnicode", true)) {
            n8 = 2;
        }
        f = n8 | 0x200;
        String string = null;
        g = ax.jb.a.h("jcifs.smb.client.domain", null);
        try {
            String string2;
            string = string2 = ax.nb.g.t().r();
        }
        catch (UnknownHostException unknownHostException) {}
        h = string;
    }

    public b(int n8, String string, String string2) {
        this.f(n8 | ax.ob.b.j());
        this.n(string);
        string = string2;
        if (string2 == null) {
            string = ax.ob.b.k();
        }
        this.o(string);
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

    public void n(String string) {
        this.d = string;
    }

    public void o(String string) {
        this.e = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] p() {
        int n8;
        byte[] byArray;
        int n9;
        Object object;
        Object object2;
        block5: {
            block4: {
                try {
                    object2 = this.l();
                    object = this.m();
                    n9 = this.a();
                    byArray = new byte[]{};
                    if (object2 == null || ((String)object2).length() == 0) break block4;
                    n8 = n9 | 0x1000;
                    byArray = ((String)object2).toUpperCase().getBytes(a.b());
                    n9 = 1;
                    break block5;
                }
                catch (IOException iOException) {
                    throw new IllegalStateException(iOException.getMessage());
                }
            }
            n8 = n9 & 0xFFFFEFFF;
            n9 = 0;
        }
        object2 = new byte[0];
        if (object != null && ((String)object).length() != 0) {
            object2 = ((String)object).toUpperCase().getBytes(a.b());
            n8 |= 0x2000;
            n9 = 1;
        } else {
            n8 &= 0xFFFFDFFF;
        }
        int n10 = n9 != 0 ? byArray.length + 32 + ((Object)object2).length : 16;
        object = new byte[n10];
        System.arraycopy(a.b, 0, object, 0, 8);
        a.h((byte[])object, 8, 1);
        a.h((byte[])object, 12, n8);
        if (n9 == 0) return object;
        a.g((byte[])object, 16, 32, byArray);
        a.g((byte[])object, 24, byArray.length + 32, (byte[])object2);
        return object;
    }

    public String toString() {
        String string = this.l();
        String string2 = this.m();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type1Message[suppliedDomain=");
        String string3 = string;
        if (string == null) {
            string3 = "null";
        }
        stringBuilder.append(string3);
        stringBuilder.append(",suppliedWorkstation=");
        string3 = string2;
        if (string2 == null) {
            string3 = "null";
        }
        stringBuilder.append(string3);
        stringBuilder.append(",flags=0x");
        stringBuilder.append(ax.qb.d.c(this.a(), 8));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

