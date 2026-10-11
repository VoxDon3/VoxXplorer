/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Z;
import ax.pb.a0;
import ax.qb.a;
import ax.qb.b;
import ax.qb.c;
import ax.qb.e;
import ax.qb.f;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.Arrays;
import java.util.Random;

public final class r
implements Principal,
Serializable {
    private static final int j0 = ax.jb.a.d("jcifs.smb.lmCompatibility", 3);
    private static final Random k0 = new Random();
    private static e l0 = e.a();
    private static final byte[] m0 = new byte[]{75, 71, 83, 33, 64, 35, 36, 37};
    static String n0;
    static String o0;
    static String p0;
    public static final r q0;
    static final r r0;
    static final r s0;
    static final r t0;
    String c0;
    String d0;
    byte[] e0;
    byte[] f0;
    boolean g0 = false;
    byte[] h0 = null;
    byte[] i0 = null;
    String q;

    static {
        q0 = new r("", "", "");
        r0 = new r("", "", "");
        s0 = new r("?", "GUEST", "");
        t0 = new r(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public r(String string) {
        this.d0 = null;
        this.c0 = null;
        this.q = null;
        if (string != null) {
            int n8;
            try {
                String string2;
                string = string2 = r.r(string);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {}
            int n9 = string.length();
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                int n11;
                char c8 = string.charAt(n8);
                if (c8 == ';') {
                    this.q = string.substring(0, n8);
                    n11 = n8 + 1;
                } else {
                    n11 = n10;
                    if (c8 == ':') {
                        this.d0 = string.substring(n8 + 1);
                        break;
                    }
                }
                n10 = n11;
            }
            this.c0 = string.substring(n10, n8);
        }
        r.o();
        if (this.q == null) {
            this.q = n0;
        }
        if (this.c0 == null) {
            this.c0 = o0;
        }
        if (this.d0 == null) {
            this.d0 = p0;
        }
    }

    public r(String string, String string2, String string3) {
        String string4 = string;
        String string5 = string2;
        if (string2 != null) {
            int n8 = string2.indexOf(92);
            string4 = string;
            string5 = string2;
            if (n8 > 0) {
                string4 = string2.substring(0, n8);
                string5 = string2.substring(n8 + 1);
            }
        }
        this.q = string4;
        this.c0 = string5;
        this.d0 = string3;
        r.o();
        if (string4 == null) {
            this.q = n0;
        }
        if (string5 == null) {
            this.c0 = o0;
        }
        if (string3 == null) {
            this.d0 = p0;
        }
    }

    private static void a(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        byte[] byArray4 = new byte[7];
        byte[] byArray5 = new byte[8];
        for (int i8 = 0; i8 < byArray.length / 7; ++i8) {
            System.arraycopy(byArray, i8 * 7, byArray4, 0, 7);
            new a(byArray4).e(byArray2, byArray5);
            System.arraycopy(byArray5, 0, byArray3, i8 * 8, 8);
        }
    }

    static byte[] b(byte[] object, byte[] byArray, byte[] byArray2, int n8, int n9) {
        object = new c((byte[])object);
        object.update(byArray);
        object.update(byArray2, n8, n9);
        byArray = object.digest();
        object = new byte[byArray.length + byArray2.length];
        System.arraycopy(byArray, 0, object, 0, byArray.length);
        System.arraycopy(byArray2, 0, object, byArray.length, byArray2.length);
        return object;
    }

    public static byte[] e(String object, String string, String object2, byte[] byArray, byte[] byArray2) {
        try {
            byte[] byArray3 = new byte[24];
            f f8 = new f();
            f8.update(((String)object2).getBytes("UTF-16LE"));
            object2 = new c(f8.digest());
            ((MessageDigest)object2).update(string.toUpperCase().getBytes("UTF-16LE"));
            ((MessageDigest)object2).update(((String)object).toUpperCase().getBytes("UTF-16LE"));
            object = new c(((MessageDigest)object2).digest());
            ((MessageDigest)object).update(byArray);
            ((MessageDigest)object).update(byArray2);
            ((MessageDigest)object).digest(byArray3, 0, 16);
            System.arraycopy(byArray2, 0, byArray3, 16, 8);
            return byArray3;
        }
        catch (Exception exception) {
            if (e.c0 > 0) {
                exception.printStackTrace(l0);
            }
            return null;
        }
    }

    public static byte[] f(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        byte[] byArray4 = new byte[8];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byArray2);
            messageDigest.update(byArray3, 0, 8);
            System.arraycopy(messageDigest.digest(), 0, byArray4, 0, 8);
        }
        catch (GeneralSecurityException generalSecurityException) {
            if (e.c0 > 0) {
                generalSecurityException.printStackTrace(l0);
            }
            throw new RuntimeException("MD5", generalSecurityException);
        }
        byArray2 = new byte[21];
        System.arraycopy(byArray, 0, byArray2, 0, 16);
        byArray = new byte[24];
        r.a(byArray2, byArray4, byArray);
        return byArray;
    }

    public static byte[] g(String object, byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3;
        block5: {
            byArray3 = new byte[21];
            byArray2 = new byte[24];
            try {
                object = ((String)object).getBytes("UTF-16LE");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                if (e.c0 > 0) {
                    unsupportedEncodingException.printStackTrace(l0);
                }
                object = null;
            }
            f f8 = new f();
            f8.update((byte[])object);
            try {
                f8.digest(byArray3, 0, 16);
            }
            catch (Exception exception) {
                if (e.c0 <= 0) break block5;
                exception.printStackTrace(l0);
            }
        }
        r.a(byArray3, byArray, byArray2);
        return byArray2;
    }

    public static byte[] h(byte[] byArray, byte[] byArray2, byte[] byArray3, long l8, byte[] byArray4) {
        int n8 = byArray4 != null ? byArray4.length : 0;
        int n9 = n8 + 32;
        byte[] byArray5 = new byte[n9];
        b.n(257, byArray5, 0);
        b.n(0, byArray5, 4);
        b.p(l8, byArray5, 8);
        System.arraycopy(byArray3, 0, byArray5, 16, 8);
        b.n(0, byArray5, 24);
        if (byArray4 != null) {
            System.arraycopy(byArray4, 0, byArray5, 28, n8);
        }
        b.n(0, byArray5, n8 + 28);
        return r.b(byArray, byArray2, byArray5, 0, n9);
    }

    public static byte[] j(String object, byte[] byArray) {
        int n8 = 14;
        byte[] byArray2 = new byte[14];
        byte[] byArray3 = new byte[21];
        byte[] byArray4 = new byte[24];
        try {
            object = ((String)object).toUpperCase().getBytes(Z.K);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("Try setting jcifs.encoding=US-ASCII", unsupportedEncodingException);
        }
        int n9 = ((Object)object).length;
        if (n9 > 14) {
            n9 = n8;
        }
        System.arraycopy(object, 0, byArray2, 0, n9);
        r.a(byArray2, m0, byArray3);
        r.a(byArray3, byArray, byArray4);
        return byArray4;
    }

    static void o() {
        if (n0 != null) {
            return;
        }
        n0 = ax.jb.a.h("jcifs.smb.client.domain", "?");
        o0 = ax.jb.a.h("jcifs.smb.client.username", "GUEST");
        p0 = ax.jb.a.h("jcifs.smb.client.password", "");
    }

    public static byte[] p(String object) {
        if (object != null) {
            try {
                f f8 = new f();
                f8.update(((String)object).getBytes("UTF-16LE"));
                object = f8.digest();
                return object;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw new RuntimeException(unsupportedEncodingException.getMessage());
            }
        }
        throw new RuntimeException("Password parameter is required");
    }

    public static byte[] q(String object, String string, String object2) {
        try {
            f f8 = new f();
            f8.update(((String)object2).getBytes("UTF-16LE"));
            object2 = new c(f8.digest());
            ((MessageDigest)object2).update(string.toUpperCase().getBytes("UTF-16LE"));
            ((MessageDigest)object2).update(((String)object).getBytes("UTF-16LE"));
            object = ((MessageDigest)object2).digest();
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException.getMessage());
        }
    }

    static String r(String string) throws NumberFormatException, UnsupportedEncodingException {
        if (string == null) {
            return null;
        }
        int n8 = string.length();
        char[] cArray = new char[n8];
        int n9 = 0;
        boolean bl = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (bl) {
                if (!bl) continue;
                cArray[n9] = new String(new byte[]{(byte)(Integer.parseInt(string.substring(i8, i8 + 2), 16) & 0xFF)}, 0, 1, "ASCII").charAt(0);
                ++i8;
                ++n9;
                bl = false;
                continue;
            }
            char c8 = string.charAt(i8);
            if (c8 == '%') {
                bl = true;
                continue;
            }
            cArray[n9] = c8;
            ++n9;
        }
        return new String(cArray, 0, n9);
    }

    public byte[] c(byte[] byArray) {
        if (this.g0) {
            return this.e0;
        }
        int n8 = j0;
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3 && n8 != 4 && n8 != 5) {
                    return r.j(this.d0, byArray);
                }
                if (this.h0 == null) {
                    byte[] byArray2 = new byte[8];
                    this.h0 = byArray2;
                    k0.nextBytes(byArray2);
                }
                return r.e(this.q, this.c0, this.d0, byArray, this.h0);
            }
            return r.g(this.d0, byArray);
        }
        return r.j(this.d0, byArray);
    }

    public String d() {
        return this.q;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof r) {
            object = (r)object;
            if (((r)object).q.toUpperCase().equals(this.q.toUpperCase()) && ((r)object).c0.toUpperCase().equals(this.c0.toUpperCase())) {
                boolean bl = this.g0;
                if (bl && ((r)object).g0) {
                    return Arrays.equals(this.e0, ((r)object).e0) && Arrays.equals(this.f0, ((r)object).f0);
                }
                if (!bl && this.d0.equals(((r)object).d0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getName() {
        if (this.q.length() > 0 && !this.q.equals("?")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.q);
            stringBuilder.append("\\");
            stringBuilder.append(this.c0);
            return stringBuilder.toString();
        }
        return this.c0;
    }

    @Override
    public int hashCode() {
        return this.getName().toUpperCase().hashCode();
    }

    public String i() {
        return this.d0;
    }

    public byte[] k(byte[] byArray) throws a0 {
        int n8 = j0;
        if (n8 != 0 && n8 != 1 && n8 != 2) {
            if (n8 != 3 && n8 != 4 && n8 != 5) {
                return null;
            }
            throw new a0("NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)");
        }
        byte[] byArray2 = new byte[40];
        this.m(byArray, byArray2, 0);
        System.arraycopy(this.l(byArray), 0, byArray2, 16, 24);
        return byArray2;
    }

    public byte[] l(byte[] byArray) {
        if (this.g0) {
            return this.f0;
        }
        int n8 = j0;
        if (n8 != 0 && n8 != 1 && n8 != 2) {
            if (n8 != 3 && n8 != 4 && n8 != 5) {
                return r.g(this.d0, byArray);
            }
            return new byte[0];
        }
        return r.g(this.d0, byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void m(byte[] object, byte[] byArray, int n8) throws a0 {
        Object object2;
        block5: {
            Object object3;
            if (this.g0) {
                return;
            }
            try {
                object2 = new f();
                ((MessageDigest)object2).update(this.d0.getBytes("UTF-16LE"));
                int n9 = j0;
                if (n9 == 0 || n9 == 1 || n9 == 2) break block5;
                if (n9 != 3 && n9 != 4 && n9 != 5) {
                    ((MessageDigest)object2).update(((MessageDigest)object2).digest());
                    ((MessageDigest)object2).digest(byArray, n8, 16);
                    return;
                }
            }
            catch (Exception exception) {
                throw new a0("", (Throwable)exception);
            }
            if (this.h0 == null) {
                object3 = new byte[8];
                this.h0 = (byte[])object3;
                k0.nextBytes((byte[])object3);
            }
            object3 = new c(((MessageDigest)object2).digest());
            ((MessageDigest)object3).update(this.c0.toUpperCase().getBytes("UTF-16LE"));
            ((MessageDigest)object3).update(this.q.toUpperCase().getBytes("UTF-16LE"));
            object2 = ((MessageDigest)object3).digest();
            object3 = new c((byte[])object2);
            ((MessageDigest)object3).update((byte[])object);
            ((MessageDigest)object3).update(this.h0);
            object = new c;
            ((c)object)((byte[])object2);
            ((MessageDigest)object).update(((MessageDigest)object3).digest());
            ((MessageDigest)object).digest(byArray, n8, 16);
            return;
        }
        ((MessageDigest)object2).update(((MessageDigest)object2).digest());
        ((MessageDigest)object2).digest(byArray, n8, 16);
    }

    public String n() {
        return this.c0;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

