/*
 * Decompiled with CFR 0.152.
 */
package ax.ob;

import ax.nb.g;
import ax.ob.a;
import ax.ob.c;
import ax.pb.r;
import ax.qb.f;
import java.io.IOException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;

public class d
extends a {
    private static final int k;
    private static final String l;
    private static final String m;
    private static final String n;
    private static final String o;
    private static final int p;
    private static final SecureRandom q;
    private byte[] d;
    private byte[] e;
    private String f;
    private String g;
    private String h;
    private byte[] i = null;
    private byte[] j = null;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        q = new SecureRandom();
        int n8 = 1;
        if (!ax.jb.a.a("jcifs.smb.client.useUnicode", true)) {
            n8 = 2;
        }
        k = n8 | 0x200;
        String string = null;
        l = ax.jb.a.h("jcifs.smb.client.domain", null);
        m = ax.jb.a.h("jcifs.smb.client.username", null);
        n = ax.jb.a.h("jcifs.smb.client.password", null);
        try {
            String string2;
            string = string2 = ax.nb.g.t().r();
        }
        catch (UnknownHostException unknownHostException) {}
        o = string;
        p = ax.jb.a.d("jcifs.smb.lmCompatibility", 3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public d(c object, String object2, String object3, String object4, String object5, int n8) {
        this.f(n8 | ax.ob.d.j((c)object));
        if (object5 == null) {
            object5 = ax.ob.d.k();
        }
        this.B((String)object5);
        this.w((String)object3);
        this.A((String)object4);
        n8 = p;
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3 && n8 != 4 && n8 != 5) {
                    this.x(ax.ob.d.n((c)object, (String)object2));
                    this.y(ax.ob.d.s((c)object, (String)object2));
                    return;
                }
                byte[] byArray = r.q((String)object3, (String)object4, (String)object2);
                byte[] byArray2 = new byte[8];
                object5 = q;
                ((SecureRandom)object5).nextBytes(byArray2);
                this.x(ax.ob.d.o((c)object, (String)object3, (String)object4, (String)object2, byArray2));
                object2 = new byte[8];
                ((SecureRandom)object5).nextBytes((byte[])object2);
                this.y(ax.ob.d.q((c)object, byArray, (byte[])object2));
                if ((this.a() & 0x10) != 16) return;
                object = new ax.qb.c(byArray);
                ((MessageDigest)object).update(this.e, 0, 16);
                object = ((MessageDigest)object).digest();
                if ((this.a() & 0x40000000) != 0) {
                    object2 = new byte[16];
                    this.i = (byte[])object2;
                    ((SecureRandom)object5).nextBytes((byte[])object2);
                    object2 = new byte[16];
                    new ax.qb.g((byte[])object).b(this.i, 0, 16, (byte[])object2, 0);
                    this.z((byte[])object2);
                    return;
                }
                this.i = (byte[])object;
                this.z((byte[])object);
                return;
            }
            object = ax.ob.d.s((c)object, (String)object2);
            this.x((byte[])object);
            this.y((byte[])object);
            return;
        }
        if ((this.a() & 0x80000) == 0) {
            this.x(ax.ob.d.n((c)object, (String)object2));
            this.y(ax.ob.d.s((c)object, (String)object2));
            return;
        }
        object4 = new byte[24];
        object3 = q;
        ((SecureRandom)object3).nextBytes((byte[])object4);
        Arrays.fill((byte[])object4, 8, 24, (byte)0);
        object2 = r.p((String)object2);
        object5 = r.f((byte[])object2, ((c)object).j(), (byte[])object4);
        this.x((byte[])object4);
        this.y((byte[])object5);
        if ((this.a() & 0x10) != 16) return;
        object5 = new byte[16];
        System.arraycopy(((c)object).j(), 0, object5, 0, 8);
        System.arraycopy(object4, 0, object5, 8, 8);
        object = new f();
        ((MessageDigest)object).update((byte[])object2);
        object = new ax.qb.c(((MessageDigest)object).digest());
        ((MessageDigest)object).update((byte[])object5);
        object = ((MessageDigest)object).digest();
        if ((this.a() & 0x40000000) != 0) {
            object2 = new byte[16];
            this.i = (byte[])object2;
            ((SecureRandom)object3).nextBytes((byte[])object2);
            object2 = new byte[16];
            new ax.qb.g((byte[])object).b(this.i, 0, 16, (byte[])object2, 0);
            this.z((byte[])object2);
            return;
        }
        this.i = (byte[])object;
        this.z((byte[])object);
    }

    public static int j(c c8) {
        if (c8 == null) {
            return k;
        }
        int n8 = c8.a();
        int n9 = 1;
        if ((n8 & 1) == 0) {
            n9 = 2;
        }
        return n9 | 0x200;
    }

    public static String k() {
        return o;
    }

    public static byte[] n(c c8, String string) {
        if (c8 != null && string != null) {
            return r.j(string, c8.j());
        }
        return null;
    }

    public static byte[] o(c c8, String string, String string2, String string3, byte[] byArray) {
        if (c8 != null && string != null && string2 != null && string3 != null && byArray != null) {
            return r.e(string, string2, string3, c8.j(), byArray);
        }
        return null;
    }

    public static byte[] q(c c8, byte[] byArray, byte[] byArray2) {
        if (c8 != null && byArray != null && byArray2 != null) {
            long l8 = System.currentTimeMillis();
            return r.h(byArray, c8.j(), byArray2, (l8 + 11644473600000L) * 10000L, c8.m());
        }
        return null;
    }

    public static byte[] s(c c8, String string) {
        if (c8 != null && string != null) {
            return r.g(string, c8.j());
        }
        return null;
    }

    public void A(String string) {
        this.g = string;
    }

    public void B(String string) {
        this.h = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] C() {
        Object object;
        Object object2;
        byte[] byArray;
        int n8;
        int n9;
        block7: {
            block5: {
                block6: {
                    try {
                        n9 = this.a();
                        n8 = (n9 & 1) != 0 ? 1 : 0;
                        byArray = null;
                        object2 = n8 != 0 ? null : a.b();
                        object = this.l();
                        if (object == null || ((String)object).length() == 0) break block5;
                        if (n8 == 0) break block6;
                        object = ((String)object).getBytes("UTF-16LE");
                        break block7;
                    }
                    catch (IOException iOException) {
                        throw new IllegalStateException(iOException.getMessage());
                    }
                }
                object = ((String)object).getBytes((String)object2);
                break block7;
            }
            object = null;
        }
        int n10 = object != null ? ((String)object).length : 0;
        Object object3 = this.u();
        object3 = object3 != null && ((String)object3).length() != 0 ? (n8 != 0 ? (Object)((String)object3).getBytes("UTF-16LE") : (Object)((String)object3).toUpperCase().getBytes((String)object2)) : null;
        int n11 = object3 != null ? ((String)object3).length : 0;
        Object object4 = this.v();
        Object object5 = byArray;
        if (object4 != null) {
            object5 = byArray;
            if (((String)object4).length() != 0) {
                object2 = n8 != 0 ? (Object)((String)object4).getBytes("UTF-16LE") : (Object)((String)object4).toUpperCase().getBytes((String)object2);
                object5 = object2;
            }
        }
        n8 = object5 != null ? (object5).length : 0;
        byArray = this.m();
        int n12 = byArray != null ? byArray.length : 0;
        byte[] byArray2 = this.r();
        int n13 = byArray2 != null ? byArray2.length : 0;
        object4 = this.t();
        int n14 = object4 != null ? ((Object)object4).length : 0;
        object2 = new byte[n10 + 64 + n11 + n8 + n12 + n13 + n14];
        System.arraycopy(a.b, 0, object2, 0, 8);
        a.h((byte[])object2, 8, 3);
        a.g((byte[])object2, 12, 64, byArray);
        a.g((byte[])object2, 20, n12 += 64, byArray2);
        a.g((byte[])object2, 28, n12 += n13, (byte[])object);
        n10 = n12 + n10;
        a.g((byte[])object2, 36, n10, (byte[])object3);
        a.g((byte[])object2, 44, n10 += n11, object5);
        a.g((byte[])object2, 52, n10 + n8, (byte[])object4);
        a.h((byte[])object2, 60, n9);
        return object2;
    }

    public String l() {
        return this.f;
    }

    public byte[] m() {
        return this.d;
    }

    public byte[] p() {
        return this.i;
    }

    public byte[] r() {
        return this.e;
    }

    public byte[] t() {
        return this.j;
    }

    public String toString() {
        CharSequence charSequence = this.u();
        String string = this.l();
        String string2 = this.v();
        Object object = this.m();
        byte[] byArray = this.r();
        byte[] byArray2 = this.t();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type3Message[domain=");
        stringBuilder.append(string);
        stringBuilder.append(",user=");
        stringBuilder.append((String)charSequence);
        stringBuilder.append(",workstation=");
        stringBuilder.append(string2);
        stringBuilder.append(",lmResponse=");
        string2 = "null";
        if (object == null) {
            object = "null";
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("<");
            ((StringBuilder)charSequence).append(((byte[])object).length);
            ((StringBuilder)charSequence).append(" bytes>");
            object = ((StringBuilder)charSequence).toString();
        }
        stringBuilder.append((String)object);
        stringBuilder.append(",ntResponse=");
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
        stringBuilder.append(",sessionKey=");
        if (byArray2 == null) {
            object = string2;
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

    public String u() {
        return this.g;
    }

    public String v() {
        return this.h;
    }

    public void w(String string) {
        this.f = string;
    }

    public void x(byte[] byArray) {
        this.d = byArray;
    }

    public void y(byte[] byArray) {
        this.e = byArray;
    }

    public void z(byte[] byArray) {
        this.j = byArray;
    }
}

