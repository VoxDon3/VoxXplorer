/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.BCrypt;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Cipher;
import com.jcraft.jsch.HASH;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.KDF;
import com.jcraft.jsch.KeyPairDSA;
import com.jcraft.jsch.KeyPairECDSA;
import com.jcraft.jsch.KeyPairEd25519;
import com.jcraft.jsch.KeyPairEd448;
import com.jcraft.jsch.KeyPairRSA;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public abstract class KeyPair {
    private static final byte[] m = Util.v("openssh-key-v1\u0000");
    private static final byte[] n = Util.v("\n");
    static byte[][] o = new byte[][]{Util.v("Proc-Type: 4,ENCRYPTED"), Util.v("DEK-Info: DES-EDE3-CBC,")};
    private static byte[] p = Util.v(" ");
    int a = 0;
    protected String b = "no comment";
    JSch.InstanceLogger c;
    protected Cipher d;
    private KDF e;
    private HASH f;
    private HASH g;
    private byte[] h;
    protected boolean i = false;
    protected byte[] j = null;
    private byte[] k = null;
    private byte[] l = null;

    KeyPair(JSch.InstanceLogger instanceLogger) {
        this.c = instanceLogger;
    }

    private static byte[] A(Buffer buffer, int n8) {
        byte[] byArray = buffer.b;
        int n9 = buffer.c;
        byte[] byArray2 = null;
        for (int i8 = n8; i8 > 0; --i8) {
            byte[] byArray3;
            block8: {
                int n10 = n9;
                while (true) {
                    byArray3 = byArray2;
                    n8 = n10;
                    if (byArray.length <= n10) break block8;
                    n8 = n10 + 1;
                    if ((n10 = byArray[n10]) == 13 || n10 == 10) break;
                    n10 = n8;
                }
                n10 = n8 - n9 - 1;
                if (byArray2 == null) {
                    byArray3 = new byte[n10];
                    System.arraycopy(byArray, n9, byArray3, 0, n10);
                } else {
                    byArray3 = byArray2;
                    if (n10 > 0) {
                        byArray3 = new byte[byArray2.length + n10];
                        System.arraycopy(byArray2, 0, byArray3, 0, byArray2.length);
                        System.arraycopy(byArray, n9, byArray3, byArray2.length, n10);
                        Util.g(byArray2);
                    }
                }
            }
            n9 = n8;
            if (n8 < byArray.length) {
                n9 = n8;
                if (byArray[n8] == 10) {
                    n9 = n8 + 1;
                }
            }
            byArray2 = byArray3;
        }
        if (byArray2 != null) {
            buffer.c = n9;
        }
        return byArray2;
    }

    private static KeyPair B(JSch.InstanceLogger object, byte[] object2, String object3) throws JSchException {
        Buffer buffer = new Buffer((byte[])object2);
        buffer.E(((byte[])object2).length);
        object2 = Util.c(buffer.p());
        if (object3 != null && !((String)object3).equals("")) {
            if (!((String)object3).equals(object2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("pubkeyblob type [");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("] does not match expected type [");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append("]");
                throw new JSchException(((StringBuilder)object).toString());
            }
        } else {
            object3 = object2;
        }
        if (((String)object3).equals("ssh-rsa")) {
            object3 = new byte[buffer.i()];
            buffer.e((byte[])object3);
            object2 = new byte[buffer.i()];
            buffer.e((byte[])object2);
            return new KeyPairRSA((JSch.InstanceLogger)object, (byte[])object2, (byte[])object3, null);
        }
        if (((String)object3).equals("ssh-dss")) {
            byte[] byArray = new byte[buffer.i()];
            buffer.e(byArray);
            byte[] byArray2 = new byte[buffer.i()];
            buffer.e(byArray2);
            object3 = new byte[buffer.i()];
            buffer.e((byte[])object3);
            object2 = new byte[buffer.i()];
            buffer.e((byte[])object2);
            return new KeyPairDSA((JSch.InstanceLogger)object, byArray, byArray2, (byte[])object3, (byte[])object2, null);
        }
        if (!(((String)object3).equals("ecdsa-sha2-nistp256") || ((String)object3).equals("ecdsa-sha2-nistp384") || ((String)object3).equals("ecdsa-sha2-nistp521"))) {
            if (!((String)object3).equals("ssh-ed25519") && !((String)object3).equals("ssh-ed448")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("key type ");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" is not supported");
                throw new JSchException(((StringBuilder)object).toString());
            }
            object2 = new byte[buffer.i()];
            buffer.e((byte[])object2);
            if (((String)object3).equals("ssh-ed25519")) {
                return new KeyPairEd25519((JSch.InstanceLogger)object, (byte[])object2, null);
            }
            return new KeyPairEd448((JSch.InstanceLogger)object, (byte[])object2, null);
        }
        object3 = buffer.p();
        int n8 = buffer.i();
        buffer.c();
        n8 = (n8 - 1) / 2;
        object2 = new byte[n8];
        byte[] byArray = new byte[n8];
        buffer.e((byte[])object2);
        buffer.e(byArray);
        return new KeyPairECDSA((JSch.InstanceLogger)object, (byte[])object3, (byte[])object2, byArray, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static byte a(byte by) {
        if (48 <= by && by <= 57) {
            by = (byte)(by - 48);
            return by;
        }
        by = (byte)(by - 87);
        return by;
    }

    private byte[] e(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        try {
            byArray2 = this.j(byArray2, byArray3);
            this.d.k(1, byArray2, byArray3);
            Util.g(byArray2);
            byArray2 = new byte[byArray.length];
            this.d.a(byArray, 0, byArray.length, byArray2, 0);
            return byArray2;
        }
        catch (Exception exception) {
            if (this.c.a().isEnabled(3)) {
                this.c.a().b(3, "failed to decrypt key", exception);
            }
            return null;
        }
    }

    private Cipher h() {
        block2: {
            try {
                this.d = Class.forName(JSch.f("3des-cbc")).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
            }
            catch (Exception exception) {
                if (!this.c.a().isEnabled(3)) break block2;
                this.c.a().b(3, "failed to create cipher", exception);
            }
        }
        return this.d;
    }

    private HASH i() {
        block2: {
            try {
                HASH hASH;
                this.g = hASH = Class.forName(JSch.f("md5")).asSubclass(HASH.class).getDeclaredConstructor(null).newInstance(null);
                hASH.e();
            }
            catch (Exception exception) {
                if (!this.c.a().isEnabled(3)) break block2;
                this.c.a().b(3, "failed to create hash", exception);
            }
        }
        return this.g;
    }

    private static boolean s(byte[] byArray, int n8, int n9) {
        int n10 = n8 + 24;
        return n10 < n9 && "OPENSSH PRIVATE KEY-----".equals(Util.c(Arrays.copyOfRange(byArray, n8, n10)));
    }

    static KeyPair t(JSch.InstanceLogger object, String object2, String string) throws JSchException {
        IOException iOException3;
        block8: {
            byte[] byArray;
            block9: {
                block7: {
                    StringBuilder stringBuilder;
                    try {
                        byArray = Util.l((String)object2);
                        if (string != null) break block7;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object2);
                    }
                    catch (IOException iOException2) {
                        throw new JSchException(((Object)iOException2).toString(), iOException2);
                    }
                    stringBuilder.append(".pub");
                    object2 = stringBuilder.toString();
                    break block9;
                }
                object2 = string;
            }
            try {
                object2 = Util.l((String)object2);
            }
            catch (IOException iOException3) {
                if (string != null) break block8;
                object2 = null;
            }
            try {
                object = KeyPair.u((JSch.InstanceLogger)object, byArray, (byte[])object2);
                return object;
            }
            finally {
                Util.g(byArray);
            }
        }
        throw new JSchException(((Object)iOException3).toString(), iOException3);
    }

    /*
     * Exception decompiling
     */
    static KeyPair u(JSch.InstanceLogger var0, byte[] var1_8, byte[] var2_11) throws JSchException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3, 2 : 257->264)] java.lang.NoClassDefFoundError
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static KeyPair v(JSch jSch, byte[] byArray, byte[] byArray2) throws JSchException {
        return KeyPair.u(jSch.a, byArray, byArray2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static KeyPair w(JSch.InstanceLogger object, byte[] object2) throws JSchException {
        Exception exception2;
        block15: {
            Throwable var0_6;
            Object object3;
            Object object4;
            Object object5;
            block16: {
                if (object2 == null) {
                    throw new JSchException("invalid privatekey");
                }
                Buffer buffer = new Buffer((byte[])object2);
                object2 = m;
                object5 = new byte[((byte[])object2).length];
                buffer.e((byte[])object5);
                if (!Util.b((byte[])object2, (byte[])object5)) {
                    throw new JSchException("Invalid openssh v1 format.");
                }
                object4 = Util.c(buffer.p());
                object5 = Util.c(buffer.p());
                object3 = buffer.p();
                if (buffer.i() != 1) {
                    throw new JSchException("We don't support having more than 1 key in the file (yet).");
                }
                byte[] byArray = buffer.p();
                object2 = KeyPair.B((JSch.InstanceLogger)object, byArray, null);
                ((KeyPair)object2).i = true ^ "none".equals(object4);
                ((KeyPair)object2).l = byArray;
                ((KeyPair)object2).a = 4;
                ((KeyPair)object2).b = "";
                object = buffer.p();
                ((KeyPair)object2).j = (byte[])object;
                try {
                    if (!((KeyPair)object2).i) {
                        if (((KeyPair)object2).y((byte[])object)) {
                            Util.g(((KeyPair)object2).j);
                            return object2;
                        }
                        object = new JSchException("invalid privatekey");
                        throw object;
                    }
                    boolean bl = Session.f(JSch.f((String)object4));
                    if (!bl) {
                        object5 = new StringBuilder;
                        ((StringBuilder)object5)();
                        ((StringBuilder)object5).append("cipher ");
                        ((StringBuilder)object5).append((String)object4);
                        ((StringBuilder)object5).append(" is not available");
                        object = new JSchException(((StringBuilder)object5).toString());
                        throw object;
                    }
                }
                catch (Exception exception2) {
                    break block15;
                }
                try {
                    ((KeyPair)object2).d = object = Class.forName(JSch.f((String)object4)).asSubclass(Cipher.class).getDeclaredConstructor(null).newInstance(null);
                    ((KeyPair)object2).k = new byte[object.l()];
                }
                catch (NoClassDefFoundError noClassDefFoundError) {
                    break block16;
                }
                catch (Exception exception3) {
                    // empty catch block
                    break block16;
                }
                try {
                    object = new Buffer((byte[])object3);
                    object4 = ((Buffer)object).p();
                    int n8 = ((Buffer)object).i();
                    object = Class.forName(JSch.f((String)object5)).asSubclass(BCrypt.class).getDeclaredConstructor(null).newInstance(null);
                    object.a((byte[])object4, n8);
                    ((KeyPair)object2).e = object;
                    return object2;
                }
                catch (NoClassDefFoundError noClassDefFoundError) {
                }
                catch (Exception exception4) {
                    // empty catch block
                }
                object3 = new StringBuilder;
                ((StringBuilder)object3)();
                ((StringBuilder)object3).append("kdf ");
                ((StringBuilder)object3).append((String)object5);
                ((StringBuilder)object3).append(" is not available");
                object4 = new JSchException(((StringBuilder)object3).toString(), (Throwable)object);
                throw object4;
            }
            object3 = new JSchException;
            object5 = new StringBuilder;
            ((StringBuilder)object5)();
            ((StringBuilder)object5).append("cipher ");
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append(" is not available");
            ((JSchException)object3)(((StringBuilder)object5).toString(), (Throwable)var0_6);
            throw object3;
        }
        Util.g(((KeyPair)object2).j);
        throw exception2;
    }

    /*
     * Exception decompiling
     */
    static KeyPair x(JSch.InstanceLogger var0, byte[] var1_17) throws JSchException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 17[TRYBLOCK] [43, 42 : 411->416)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static boolean z(Buffer buffer, Map<String, String> map) {
        String string;
        String string2;
        int n8;
        block11: {
            String string3;
            int n9;
            int n10;
            byte[] byArray;
            block10: {
                block9: {
                    byArray = buffer.b;
                    n8 = n10 = buffer.c;
                    while (true) {
                        n9 = byArray.length;
                        string3 = null;
                        if (n8 >= n9) break block9;
                        n9 = byArray[n8];
                        if (n9 == 13 || n9 == 10) break;
                        if (n9 == 58) {
                            string2 = Util.d(byArray, n10, n8 - n10);
                            n10 = n8 + 1;
                            if (n10 < byArray.length && byArray[n10] == 32) {
                                n10 = n8 + 2;
                            }
                            break block10;
                        }
                        ++n8;
                    }
                    if (++n8 < byArray.length) {
                        n8 = byArray[n8];
                    }
                }
                string2 = null;
            }
            if (string2 == null) {
                return false;
            }
            n9 = n10;
            while (true) {
                n8 = n10;
                string = string3;
                if (n9 >= byArray.length) break block11;
                n8 = byArray[n9];
                if (n8 == 13 || n8 == 10) break;
                ++n9;
            }
            string3 = Util.d(byArray, n10, n9 - n10);
            n8 = n10 = n9 + 1;
            string = string3;
            if (n10 < byArray.length) {
                n8 = n10;
                string = string3;
                if (byArray[n10] == 10) {
                    n8 = n9 + 2;
                    string = string3;
                }
            }
        }
        if (string != null) {
            map.put(string2, string);
            buffer.c = n8;
        }
        return string != null;
    }

    int C(byte[] byArray, byte by, int n8, byte[] byArray2) {
        byArray[n8] = by;
        n8 = this.E(byArray, n8 + 1, byArray2.length);
        System.arraycopy(byArray2, 0, byArray, n8, byArray2.length);
        return n8 + byArray2.length;
    }

    int D(byte[] byArray, int n8, byte[] byArray2) {
        byArray[n8] = 2;
        n8 = this.E(byArray, n8 + 1, byArray2.length);
        System.arraycopy(byArray2, 0, byArray, n8, byArray2.length);
        return n8 + byArray2.length;
    }

    int E(byte[] byArray, int n8, int n9) {
        int n10 = this.c(n9) - 1;
        if (n10 == 0) {
            byArray[n8] = (byte)n9;
            return n8 + 1;
        }
        int n11 = n8 + 1;
        byArray[n8] = (byte)(n10 | 0x80);
        for (n8 = n10; n8 > 0; --n8) {
            byArray[n11 + n8 - 1] = (byte)(n9 & 0xFF);
            n9 >>>= 8;
        }
        return n11 + n10;
    }

    int F(byte[] byArray, int n8, byte[] byArray2) {
        byArray[n8] = 4;
        n8 = this.E(byArray, n8 + 1, byArray2.length);
        System.arraycopy(byArray2, 0, byArray, n8, byArray2.length);
        return n8 + byArray2.length;
    }

    int G(byte[] byArray, int n8, int n9) {
        byArray[n8] = 48;
        return this.E(byArray, n8 + 1, n9);
    }

    void b(KeyPair keyPair) {
        this.l = keyPair.l;
        this.a = keyPair.a;
        this.b = keyPair.b;
        this.d = keyPair.d;
    }

    int c(int n8) {
        int n9 = 1;
        int n10 = n8;
        if (n8 <= 127) {
            return 1;
        }
        while (n10 > 0) {
            n10 >>>= 8;
            ++n9;
        }
        return n9;
    }

    public boolean d(byte[] byArray) {
        Throwable throwable2;
        byte[] byArray2;
        block8: {
            byte[] byArray3;
            block7: {
                boolean bl = this.i;
                if (!bl) {
                    return true;
                }
                if (byArray == null) {
                    return bl ^ true;
                }
                int n8 = byArray.length;
                byArray2 = new byte[n8];
                System.arraycopy(byArray, 0, byArray2, 0, n8);
                byArray = null;
                try {
                    byArray3 = this.e(this.j, byArray2, this.k);
                    byArray = byArray3;
                }
                catch (Throwable throwable2) {}
                if (!this.y(byArray3)) break block7;
                byArray = byArray3;
                this.i = false;
                byArray = byArray3;
                Util.g(this.j);
                break block8;
            }
            Util.g(byArray2);
            Util.g(byArray3);
            return this.i ^ true;
        }
        Util.g(byArray2);
        Util.g(byArray);
        throw throwable2;
    }

    public void f() {
        Util.g(this.h);
    }

    public void finalize() {
        this.f();
    }

    public abstract byte[] g() throws JSchException;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    byte[] j(byte[] var1_1, byte[] var2_4) {
        synchronized (this) {
            block18: {
                try {
                    if (this.d == null) {
                        this.d = this.h();
                    }
                    if (this.g == null) {
                        this.g = this.i();
                    }
                    var6_5 = this.d.d();
                    var11_6 = new byte[var6_5];
                    var5_7 = this.g.d();
                    var4_8 = var6_5 / var5_7;
                    var3_9 = var6_5 % var5_7 == 0 ? 0 : var5_7;
                    var7_10 = var4_8 * var5_7 + var3_9;
                }
                catch (Throwable var1_2) {
                    break block18;
                }
                var12_11 = new byte[var7_10];
                var3_9 = this.a;
                var9_12 /* !! */  = null;
                var10_13 = null;
                if (var3_9 != 0) ** GOTO lbl44
                var3_9 = 0;
                var9_12 /* !! */  = var10_13;
lbl24:
                // 2 sources

                while (var3_9 + var5_7 <= var7_10) {
                    if (var9_12 /* !! */  == null) ** GOTO lbl31
                    this.g.b(var9_12 /* !! */ , 0, var9_12 /* !! */ .length);
                    ** GOTO lbl31
                }
                ** GOTO lbl42
                {
                    block17: {
                        block16: {
                            block20: {
                                block19: {
                                    catch (Exception var1_3) {
                                        break block16;
                                    }
lbl31:
                                    // 2 sources

                                    this.g.b(var1_1, 0, var1_1.length);
                                    var9_12 /* !! */  = (byte[])this.g;
                                    var8_14 = var2_4.length;
                                    var4_8 = 8;
                                    if (var8_14 <= 8) {
                                        var4_8 = var2_4.length;
                                    }
                                    var9_12 /* !! */ .b(var2_4, 0, var4_8);
                                    var9_12 /* !! */  = this.g.c();
                                    System.arraycopy(var9_12 /* !! */ , 0, var12_11, var3_9, var9_12 /* !! */ .length);
                                    var3_9 += var9_12 /* !! */ .length;
                                    ** GOTO lbl24
lbl42:
                                    // 1 sources

                                    System.arraycopy(var12_11, 0, var11_6, 0, var6_5);
                                    break block17;
lbl44:
                                    // 1 sources

                                    if (var3_9 != 4) break block19;
                                    var1_1 = this.e.c(var1_1, this.d.d() + this.d.l());
                                    System.arraycopy(var1_1, 0, var11_6, 0, var6_5);
                                    System.arraycopy(var1_1, var6_5, var2_4, 0, var2_4.length);
                                    Util.g(var1_1);
                                    break block17;
                                }
                                if (var3_9 != 1) break block20;
                                var3_9 = 0;
                                var2_4 = var9_12 /* !! */ ;
                                while (var3_9 + var5_7 <= var7_10) {
                                    if (var2_4 != null) {
                                        this.g.b(var2_4, 0, var2_4.length);
                                    }
                                    this.g.b(var1_1, 0, var1_1.length);
                                    var2_4 = this.g.c();
                                    System.arraycopy(var2_4, 0, var12_11, var3_9, var2_4.length);
                                    var3_9 += var2_4.length;
                                }
                                System.arraycopy(var12_11, 0, var11_6, 0, var6_5);
                                break block17;
                            }
                            if (var3_9 != 2) ** GOTO lbl79
                            var9_12 /* !! */  = new byte[4];
                            this.f.b(var9_12 /* !! */ , 0, 4);
                            this.f.b(var1_1, 0, var1_1.length);
                            var2_4 = this.f.c();
                            System.arraycopy(var2_4, 0, var11_6, 0, var2_4.length);
                            Util.g(var2_4);
                            var9_12 /* !! */ [3] = 1;
                            {
                                this.f.b(var9_12 /* !! */ , 0, 4);
                                this.f.b(var1_1, 0, var1_1.length);
                                var1_1 = this.f.c();
                                System.arraycopy(var1_1, 0, var11_6, var1_1.length, var6_5 - var1_1.length);
                                Util.g(var1_1);
                                break block17;
lbl79:
                                // 1 sources

                                if (var3_9 == 5) {
                                    var1_1 = this.e.c(var1_1, this.d.d() + this.d.l() + 32);
                                    System.arraycopy(var1_1, 0, var11_6, 0, var6_5);
                                    System.arraycopy(var1_1, var6_5, var2_4, 0, var2_4.length);
                                    Util.g(var1_1);
                                }
                                break block17;
                            }
                        }
                        if (this.c.a().isEnabled(3)) {
                            this.c.a().b(3, "failed to generate key from passphrase", var1_3);
                        }
                    }
                    return var11_6;
                }
            }
            throw var1_2;
        }
    }

    public abstract int k();

    abstract byte[] l();

    public String m() {
        return Util.c(this.l());
    }

    abstract byte[] n();

    public byte[] o() {
        return this.l;
    }

    public abstract byte[] p(byte[] var1);

    public abstract byte[] q(byte[] var1, String var2);

    public boolean r() {
        return this.i;
    }

    abstract boolean y(byte[] var1);

    static class ASN1 {
        byte[] a;
        int b;
        int c;

        ASN1(byte[] byArray) throws ASN1Exception {
            this(byArray, 0, byArray.length);
        }

        ASN1(byte[] byArray, int n8, int n9) throws ASN1Exception {
            this.a = byArray;
            this.b = n8;
            this.c = n9;
            if (n8 + n9 <= byArray.length) {
                return;
            }
            throw new ASN1Exception();
        }

        private int c(int[] nArray) {
            int n8 = nArray[0];
            byte[] byArray = this.a;
            int n9 = n8 + 1;
            n8 = byArray[n8];
            int n10 = n8 & 0xFF;
            int n11 = n9;
            if ((n8 & 0x80) != 0) {
                int n12 = n8 & 0x7F;
                n8 = 0;
                while (true) {
                    n10 = n8;
                    n11 = ++n9;
                    if (n12 <= 0) break;
                    n8 = (this.a[n9] & 0xFF) + (n8 << 8);
                    --n12;
                }
            }
            nArray[0] = n11;
            return n10;
        }

        byte[] a() {
            int n8 = this.b;
            Object[] objectArray = new int[]{n8 + 1};
            int n9 = this.c((int[])objectArray);
            n8 = objectArray[0];
            objectArray = new byte[n9];
            System.arraycopy(this.a, n8, objectArray, 0, n9);
            return objectArray;
        }

        ASN1[] b() throws ASN1Exception {
            Object object = this.a;
            int n8 = this.b;
            int n9 = object[n8];
            Object[] objectArray = new int[]{n8 + 1};
            n8 = this.c((int[])objectArray);
            if (n9 == 5) {
                return new ASN1[0];
            }
            n9 = objectArray[0];
            object = new ArrayList();
            while (n8 > 0) {
                int n10;
                objectArray[0] = n10 = n9 + 1;
                int n11 = this.c((int[])objectArray);
                int n12 = objectArray[0];
                n10 = n12 - n10;
                object.add(new ASN1(this.a, n9, n10 + 1 + n11));
                n9 = n12 + n11;
                n8 = n8 - 1 - n10 - n11;
            }
            objectArray = new ASN1[object.size()];
            object.toArray(objectArray);
            return objectArray;
        }

        int d() {
            return this.a[this.b] & 0xFF;
        }

        boolean e() {
            return this.d() == 3;
        }

        boolean f(int n8) {
            if ((n8 & 0xFFFFFF00) == 0 && (n8 & 0x40) == 0) {
                return this.d() == ((n8 | 0xA0) & 0xFF);
            }
            throw new IllegalArgumentException();
        }

        boolean g() {
            return this.d() == 2;
        }

        boolean h() {
            return this.d() == 5;
        }

        boolean i() {
            return this.d() == 6;
        }

        boolean j() {
            return this.d() == 4;
        }

        boolean k() {
            return this.d() == 48;
        }
    }

    static class ASN1Exception
    extends Exception {
        ASN1Exception() {
        }
    }
}

