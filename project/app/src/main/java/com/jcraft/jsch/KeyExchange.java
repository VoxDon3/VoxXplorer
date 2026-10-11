/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Cipher;
import com.jcraft.jsch.HASH;
import com.jcraft.jsch.JSchAlgoNegoFailException;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SignatureDSA;
import com.jcraft.jsch.SignatureECDSA;
import com.jcraft.jsch.SignatureEdDSA;
import com.jcraft.jsch.SignatureRSA;
import com.jcraft.jsch.Util;
import java.util.Locale;

public abstract class KeyExchange {
    static final String[] l = new String[]{"KEX algorithms", "host key algorithms", "ciphers c2s", "ciphers s2c", "MACs c2s", "MACs s2c", "compression c2s", "compression s2c", "languages c2s", "languages s2c"};
    static String m = "diffie-hellman-group1-sha1";
    static String n = "ssh-rsa,ssh-dss";
    static String o = "blowfish-cbc";
    static String p = "blowfish-cbc";
    static String q = "hmac-md5";
    static String r = "hmac-md5";
    static String s = "";
    static String t = "";
    protected Session a = null;
    protected HASH b = null;
    protected byte[] c = null;
    protected byte[] d = null;
    protected byte[] e = null;
    protected final int f;
    protected final int g;
    protected final int h;
    protected final int i;
    private int j = 0;
    private String k = "";

    public KeyExchange() {
        this.f = 0;
        this.g = 1;
        this.h = 2;
        this.i = 3;
    }

    protected static String[] l(Session object, byte[] object2, byte[] object3) throws Exception {
        String[] stringArray;
        block18: {
            boolean bl;
            boolean bl2;
            Object object4;
            Object object5;
            block17: {
                int n8;
                stringArray = new String[10];
                object2 = new Buffer((byte[])object2);
                ((Buffer)object2).C(17);
                object3 = new Buffer((byte[])object3);
                ((Buffer)object3).C(17);
                if (((Session)object).A().isEnabled(1)) {
                    for (n8 = 0; n8 < 10; ++n8) {
                        object5 = ((Session)object).A();
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("server proposal: ");
                        ((StringBuilder)object4).append(l[n8]);
                        ((StringBuilder)object4).append(": ");
                        ((StringBuilder)object4).append(Util.c(((Buffer)object2).p()));
                        object5.a(1, ((StringBuilder)object4).toString());
                    }
                    for (n8 = 0; n8 < 10; ++n8) {
                        object5 = ((Session)object).A();
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("client proposal: ");
                        ((StringBuilder)object4).append(l[n8]);
                        ((StringBuilder)object4).append(": ");
                        ((StringBuilder)object4).append(Util.c(((Buffer)object3).p()));
                        object5.a(1, ((StringBuilder)object4).toString());
                    }
                    ((Buffer)object2).C(17);
                    ((Buffer)object3).C(17);
                }
                for (int i8 = 0; i8 < 10; ++i8) {
                    int n9;
                    byte[] byArray;
                    block16: {
                        object4 = ((Buffer)object2).p();
                        byArray = ((Buffer)object3).p();
                        n8 = 0;
                        int n10 = 0;
                        while (true) {
                            n9 = n8;
                            if (n8 >= byArray.length) break block16;
                            while (n8 < byArray.length && byArray[n8] != 44) {
                                ++n8;
                            }
                            if (n10 == n8) break;
                            object5 = Util.d(byArray, n10, n8 - n10);
                            n10 = 0;
                            n9 = 0;
                            while (n10 < ((Object)object4).length) {
                                while (n10 < ((Object)object4).length && object4[n10] != 44) {
                                    ++n10;
                                }
                                if (n9 != n10) {
                                    if (((String)object5).equals(Util.d((byte[])object4, n9, n10 - n9))) {
                                        stringArray[i8] = object5;
                                        n9 = n8;
                                        break block16;
                                    }
                                    n10 = n9 = n10 + 1;
                                    continue;
                                }
                                throw new JSchAlgoNegoFailException(i8, Util.c(byArray), Util.c((byte[])object4));
                            }
                            n8 = n10 = n8 + 1;
                        }
                        throw new JSchAlgoNegoFailException(i8, Util.c(byArray), Util.c((byte[])object4));
                    }
                    if (n9 == 0) {
                        stringArray[i8] = "";
                        continue;
                    }
                    if (stringArray[i8] != null) {
                        continue;
                    }
                    throw new JSchAlgoNegoFailException(i8, Util.c(byArray), Util.c((byte[])object4));
                }
                bl2 = Class.forName(((Session)object).w(stringArray[3])).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null).m();
                if (!bl2) break block17;
                stringArray[5] = null;
            }
            try {
                bl = Class.forName(((Session)object).w(stringArray[2])).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null).m();
                if (bl) {
                    stringArray[4] = null;
                }
                if (!((Session)object).A().isEnabled(1)) break block18;
                object2 = ((Session)object).A();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("kex: algorithm: ");
            }
            catch (Exception | NoClassDefFoundError throwable) {
                throw new JSchException(throwable.toString(), throwable);
            }
            ((StringBuilder)object3).append(stringArray[0]);
            object2.a(1, ((StringBuilder)object3).toString());
            object2 = ((Session)object).A();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("kex: host key algorithm: ");
            ((StringBuilder)object3).append(stringArray[1]);
            object2.a(1, ((StringBuilder)object3).toString());
            object4 = ((Session)object).A();
            object5 = new StringBuilder();
            ((StringBuilder)object5).append("kex: server->client cipher: ");
            ((StringBuilder)object5).append(stringArray[3]);
            ((StringBuilder)object5).append(" MAC: ");
            object3 = "<implicit>";
            object2 = bl2 ? "<implicit>" : stringArray[5];
            ((StringBuilder)object5).append((String)object2);
            ((StringBuilder)object5).append(" compression: ");
            ((StringBuilder)object5).append(stringArray[7]);
            object4.a(1, ((StringBuilder)object5).toString());
            object5 = ((Session)object).A();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("kex: client->server cipher: ");
            ((StringBuilder)object2).append(stringArray[2]);
            ((StringBuilder)object2).append(" MAC: ");
            object = bl ? object3 : stringArray[4];
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" compression: ");
            ((StringBuilder)object2).append(stringArray[6]);
            object5.a(1, ((StringBuilder)object2).toString());
        }
        return stringArray;
    }

    void a() {
        Util.g(this.c);
        this.c = null;
    }

    void b(Session session, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) throws Exception {
        this.a = session;
        this.m(session, byArray, byArray2, byArray3, byArray4);
    }

    protected byte[] c(byte[] byArray) {
        int n8 = (byArray[0] & 0x80) >>> 7;
        int n9 = byArray.length + n8;
        byte[] byArray2 = new byte[n9 + 4];
        byte[] byArray3 = new byte[n8 ^ 1];
        byArray2[0] = (byte)(n9 >>> 24);
        byArray2[1] = (byte)(n9 >>> 16);
        byArray2[2] = (byte)(n9 >>> 8);
        byArray2[3] = (byte)n9;
        System.arraycopy(byArray, 0, byArray2, n8 + 4, n9 - n8);
        Util.g(byArray);
        return byArray2;
    }

    public String d() {
        Object object;
        block2: {
            String string = null;
            try {
                object = this.a.w("FingerprintHash").toLowerCase(Locale.ROOT);
                object = Class.forName(this.a.w((String)object)).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
            }
            catch (Exception exception) {
                object = string;
                if (!this.a.A().isEnabled(3)) break block2;
                object = this.a.A();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getFingerPrint: ");
                stringBuilder.append(exception.getMessage());
                object.b(3, stringBuilder.toString(), exception);
                object = string;
            }
        }
        return Util.m((HASH)object, this.g(), true, false);
    }

    byte[] e() {
        return this.d;
    }

    HASH f() {
        return this.b;
    }

    byte[] g() {
        return this.e;
    }

    byte[] h() {
        return this.c;
    }

    public String i() {
        return this.k;
    }

    public String j() {
        int n8 = this.j;
        if (n8 == 1) {
            return "DSA";
        }
        if (n8 == 0) {
            return "RSA";
        }
        if (n8 == 3) {
            return "EDDSA";
        }
        return "ECDSA";
    }

    public abstract int k();

    public abstract void m(Session var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5) throws Exception;

    public abstract boolean n(Buffer var1) throws Exception;

    protected byte[] o(byte[] byArray) {
        int n8;
        int n9 = byArray.length;
        if (n9 < 2) {
            return byArray;
        }
        int n10 = byArray[0];
        int n11 = 0;
        for (n8 = 0; n8 < 8; ++n8) {
            n11 |= (n10 & 0xFF) >>> n8 & 1;
        }
        n10 = n11 ^ 1;
        n8 = 0;
        for (n11 = 1; n11 < n9; ++n11) {
            byte by = byArray[n11];
            int n12 = n10 & ((by & 0x80) >>> 7 ^ 1);
            int n13 = n8 + n12;
            n8 = n12;
            for (n10 = 0; n10 < 7; ++n10) {
                n8 &= (by & 0x7F) >>> n10 & 1 ^ 1;
            }
            n10 = n8;
            n8 = n13;
        }
        n11 = n9 - n8;
        byte[] byArray2 = new byte[n11];
        System.arraycopy(byArray, 0, new byte[n8], 0, n8);
        System.arraycopy(byArray, n8, byArray2, 0, n11);
        Util.g(byArray);
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean p(String object, byte[] object2, int object3, byte[] object4) throws Exception {
        if (((String)object).equals("ssh-rsa")) {
            this.j = 0;
            this.k = object;
            byte by = object2[object3];
            byte by2 = object2[object3 + 1];
            byte by3 = object2[object3 + 2];
            Object object5 = object3 + 4;
            object3 = by2 << 16 & 0xFF0000 | by << 24 & 0xFF000000 | by3 << 8 & 0xFF00 | object2[object3 + 3] & 0xFF;
            byte[] byArray = new byte[object3];
            System.arraycopy(object2, object5, byArray, 0, object3);
            object3 = object5 + object3;
            object5 = object2[object3];
            object5 = object2[object3 + 1] << 16 & 0xFF0000 | 0xFF000000 & object5 << 24 | 0xFF00 & object2[object3 + 2] << 8 | object2[object3 + 3] & 0xFF;
            byte[] byArray2 = new byte[object5];
            System.arraycopy(object2, object3 + 4, byArray2, 0, object5);
            object = Util.c(new Buffer((byte[])object4).p());
            try {
                object2 = Class.forName(this.a.w((String)object)).asSubclass(SignatureRSA.class).getDeclaredConstructor(null).newInstance(null);
                object2.e();
            }
            catch (Exception exception) {
                throw new JSchException(((Object)exception).toString(), exception);
            }
            object2.b(byArray, byArray2);
            object2.f(this.d);
            boolean bl = object2.d((byte[])object4);
            if (this.a.A().isEnabled(1)) {
                object2 = this.a.A();
                object4 = new StringBuilder();
                ((StringBuilder)object4).append("ssh_rsa_verify: ");
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append(" signature ");
                ((StringBuilder)object4).append(bl);
                object2.a(1, ((StringBuilder)object4).toString());
            }
            return bl;
        }
        if (((String)object).equals("ssh-dss")) {
            this.j = 1;
            this.k = object;
            int n8 = object2[object3];
            Object object6 = object2[object3 + 1];
            Object object7 = object2[object3 + 2];
            Object object8 = object3 + 4;
            object3 = object6 << 16 & 0xFF0000 | n8 << 24 & 0xFF000000 | object7 << 8 & 0xFF00 | object2[object3 + 3] & 0xFF;
            byte[] byArray = new byte[object3];
            System.arraycopy(object2, object8, byArray, 0, object3);
            n8 = (int)object2[object8 += object3];
            object7 = object2[object8 + 1];
            object6 = object2[object8 + 2];
            object3 = object8 + 4;
            object8 = object7 << 16 & 0xFF0000 | n8 << 24 & 0xFF000000 | object6 << 8 & 0xFF00 | object2[object8 + 3] & 0xFF;
            byte[] byArray3 = new byte[object8];
            System.arraycopy(object2, object3, byArray3, 0, object8);
            n8 = object3 + object8;
            object8 = object2[n8];
            object6 = object2[n8 + 1];
            object7 = object2[n8 + 2];
            object3 = n8 + 4;
            object8 = object6 << 16 & 0xFF0000 | object8 << 24 & 0xFF000000 | object7 << 8 & 0xFF00 | object2[n8 + 3] & 0xFF;
            object = new byte[object8];
            System.arraycopy(object2, object3, object, 0, object8);
            object3 += object8;
            object8 = object2[object3];
            object8 = object2[object3 + 1] << 16 & 0xFF0000 | 0xFF000000 & object8 << 24 | 0xFF00 & object2[object3 + 2] << 8 | object2[object3 + 3] & 0xFF;
            byte[] byArray4 = new byte[object8];
            System.arraycopy(object2, object3 + 4, byArray4, 0, object8);
            try {
                object2 = Class.forName(this.a.w("signature.dss")).asSubclass(SignatureDSA.class).getDeclaredConstructor(null).newInstance(null);
                object2.e();
            }
            catch (Exception exception) {
                throw new JSchException(((Object)exception).toString(), exception);
            }
            object2.h(byArray4, byArray, byArray3, (byte[])object);
            object2.f(this.d);
            boolean bl = object2.d((byte[])object4);
            if (this.a.A().isEnabled(1)) {
                object = this.a.A();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("ssh_dss_verify: signature ");
                ((StringBuilder)object2).append(bl);
                object.a(1, ((StringBuilder)object2).toString());
            }
            return bl;
        }
        if (!(((String)object).equals("ecdsa-sha2-nistp256") || ((String)object).equals("ecdsa-sha2-nistp384") || ((String)object).equals("ecdsa-sha2-nistp521"))) {
            Throwable var1_6;
            if (!((String)object).equals("ssh-ed25519") && !((String)object).equals("ssh-ed448")) {
                if (this.a.A().isEnabled(3)) {
                    object2 = this.a.A();
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append("unknown alg: ");
                    ((StringBuilder)object4).append((String)object);
                    object2.a(3, ((StringBuilder)object4).toString());
                }
                return false;
            }
            this.j = 3;
            this.k = object;
            int n9 = object2[object3];
            n9 = object2[object3 + 1] << 16 & 0xFF0000 | 0xFF000000 & n9 << 24 | 0xFF00 & object2[object3 + 2] << 8 | object2[object3 + 3] & 0xFF;
            byte[] byArray = new byte[n9];
            System.arraycopy(object2, object3 + 4, byArray, 0, n9);
            try {
                object2 = Class.forName(this.a.w((String)object)).asSubclass(SignatureEdDSA.class).getDeclaredConstructor(null).newInstance(null);
                object2.e();
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
            }
            catch (Exception exception) {
                // empty catch block
            }
            object2.i(byArray);
            object2.f(this.d);
            boolean bl = object2.d((byte[])object4);
            if (this.a.A().isEnabled(1)) {
                object4 = this.a.A();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("ssh_eddsa_verify: ");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" signature ");
                ((StringBuilder)object2).append(bl);
                object4.a(1, ((StringBuilder)object2).toString());
            }
            return bl;
            throw new JSchException(var1_6.toString(), (Throwable)var1_6);
        }
        this.j = 2;
        this.k = object;
        Object object9 = object2[object3];
        int n10 = object2[object3 + 1];
        Object object10 = object2[object3 + 2];
        Object object11 = object3 + 4;
        object3 = n10 << 16 & 0xFF0000 | object9 << 24 & 0xFF000000 | object10 << 8 & 0xFF00 | object2[object3 + 3] & 0xFF;
        System.arraycopy(object2, object11, new byte[object3], 0, object3);
        n10 = object11 + object3;
        object10 = object2[n10];
        object3 = object2[n10 + 1];
        object11 = object2[n10 + 2];
        object9 = object2[n10 + 3];
        object3 = ((0xFF00 & object11 << 8 | (0xFF0000 & object3 << 16 | 0xFF000000 & object10 << 24) | object9 & 0xFF) - 1) / 2;
        byte[] byArray = new byte[object3];
        System.arraycopy(object2, n10 += 5, byArray, 0, object3);
        byte[] byArray5 = new byte[object3];
        System.arraycopy(object2, n10 + object3, byArray5, 0, object3);
        try {
            object2 = Class.forName(this.a.w((String)object)).asSubclass(SignatureECDSA.class).getDeclaredConstructor(null).newInstance(null);
            object2.e();
        }
        catch (Exception exception) {
            throw new JSchException(((Object)exception).toString(), exception);
        }
        object2.b(byArray, byArray5);
        object2.f(this.d);
        boolean bl = object2.d((byte[])object4);
        if (this.a.A().isEnabled(1)) {
            object2 = this.a.A();
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("ssh_ecdsa_verify: ");
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(" signature ");
            ((StringBuilder)object4).append(bl);
            object2.a(1, ((StringBuilder)object4).toString());
        }
        return bl;
    }
}

