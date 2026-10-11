/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.HostKeyRepository;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Logger;
import com.jcraft.jsch.MAC;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;
import com.jcraft.jsch.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;

class KnownHosts
implements HostKeyRepository {
    private static final byte[] e = new byte[]{32};
    private static final byte[] f = Util.v("\n");
    private JSch a;
    private String b = null;
    private Vector<HostKey> c = null;
    MAC d;

    KnownHosts(JSch jSch) {
        this.a = jSch;
        this.m();
        this.c = new Vector();
    }

    private void g(String object) throws JSchException {
        object = new HostKey((String)object, -1, null);
        this.c.addElement((HostKey)object);
    }

    @Override
    public String a() {
        return this.b;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(HostKey hostKey, UserInfo userInfo) {
        int n8 = hostKey.c;
        String string = hostKey.c();
        Vector<HostKey> vector = this.c;
        synchronized (vector) {
            Throwable throwable2;
            block6: {
                try {
                    for (n8 = 0; n8 < this.c.size(); ++n8) {
                        this.c.elementAt(n8).h(string);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    // MONITOREXIT @DISABLED, blocks:[1, 3] lbl13 : MonitorExitStatement: MONITOREXIT : var4_6
                    this.c.addElement(hostKey);
                    this.r(userInfo);
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int c(String string, byte[] object) {
        Vector<HostKey> vector;
        HostKey hostKey;
        if (string == null) {
            return 1;
        }
        try {
            hostKey = new HostKey(string, 0, (byte[])object);
            vector = this.c;
        }
        catch (Exception exception) {
            Logger logger = this.a.j();
            object = new StringBuilder();
            ((StringBuilder)object).append("exception while trying to read key while checking host '");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("'");
            logger.b(0, ((StringBuilder)object).toString(), exception);
            return 1;
        }
        synchronized (vector) {
            Throwable throwable2;
            block12: {
                int n8 = 0;
                int n9 = 1;
                while (true) {
                    int n10;
                    block11: {
                        try {
                            if (n8 >= this.c.size()) break;
                            HostKey hostKey2 = this.c.elementAt(n8);
                            n10 = n9;
                            if (!hostKey2.h(string)) break block11;
                            n10 = n9;
                            if (hostKey2.c != hostKey.c) break block11;
                            if (Util.a(hostKey2.d, (byte[])object)) {
                                return 0;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block12;
                        }
                        n10 = 2;
                    }
                    ++n8;
                    n9 = n10;
                }
                {
                    // MONITOREXIT @DISABLED, blocks:[2, 4] lbl39 : MonitorExitStatement: MONITOREXIT : var6_6
                    if (n9 == 1 && string.startsWith("[") && string.indexOf("]:") > 1) {
                        return this.c(string.substring(1, string.indexOf("]:")), (byte[])object);
                    }
                    return n9;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(String string, String string2, byte[] byArray) {
        Vector<HostKey> vector = this.c;
        synchronized (vector) {
            int n8 = 0;
            boolean bl = false;
            while (n8 < this.c.size()) {
                boolean bl2;
                int n9;
                block14: {
                    HostKey hostKey;
                    block13: {
                        hostKey = this.c.elementAt(n8);
                        if (string == null) break block13;
                        n9 = n8;
                        bl2 = bl;
                        if (!hostKey.h(string)) break block14;
                        if (string2 == null) break block13;
                        n9 = n8;
                        bl2 = bl;
                        if (!hostKey.f().equals(string2)) break block14;
                        if (byArray == null) break block13;
                        n9 = n8;
                        bl2 = bl;
                        if (!Util.a(byArray, hostKey.d)) break block14;
                    }
                    String string3 = hostKey.c();
                    if (!(string == null || string3.equals(string) || hostKey instanceof HashedHostKey && ((HashedHostKey)hostKey).k())) {
                        hostKey.b = this.j(string3, string);
                    } else {
                        this.c.removeElement(hostKey);
                    }
                    bl2 = true;
                    n9 = --n8;
                }
                n8 = n9 + 1;
                bl = bl2;
            }
            // MONITOREXIT @DISABLED, blocks:[0, 4] lbl31 : MonitorExitStatement: MONITOREXIT : var8_6
            if (!bl) return;
        }
        try {
            this.p();
            return;
        }
        catch (Exception exception) {
            return;
        }
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public HostKey[] e(String hostKeyArray, String string) {
        Vector<HostKey> vector = this.c;
        synchronized (vector) {
            Throwable throwable2;
            block8: {
                HostKey[] hostKeyArray2;
                block7: {
                    try {
                        HostKey[] hostKeyArray3;
                        int n8;
                        hostKeyArray2 = new ArrayList();
                        for (n8 = 0; n8 < this.c.size(); ++n8) {
                            hostKeyArray3 = this.c.elementAt(n8);
                            if (hostKeyArray3.c == -1 || hostKeyArray != null && (!hostKeyArray3.h((String)hostKeyArray) || string != null && !hostKeyArray3.f().equals(string))) continue;
                            hostKeyArray2.add(hostKeyArray3);
                        }
                        int n9 = hostKeyArray2.size();
                        hostKeyArray3 = new HostKey[n9];
                        for (n8 = 0; n8 < hostKeyArray2.size(); ++n8) {
                            hostKeyArray3[n8] = (HostKey)hostKeyArray2.get(n8);
                        }
                        hostKeyArray2 = hostKeyArray3;
                        if (hostKeyArray == null) break block7;
                        hostKeyArray2 = hostKeyArray3;
                        if (!hostKeyArray.startsWith("[")) break block7;
                        hostKeyArray2 = hostKeyArray3;
                        if (hostKeyArray.indexOf("]:") <= 1) break block7;
                        hostKeyArray = this.e(hostKeyArray.substring(1, hostKeyArray.indexOf("]:")), string);
                        hostKeyArray2 = hostKeyArray3;
                        if (hostKeyArray.length <= 0) break block7;
                        hostKeyArray2 = new HostKey[hostKeyArray.length + n9];
                        System.arraycopy(hostKeyArray3, 0, hostKeyArray2, 0, n9);
                        System.arraycopy(hostKeyArray, 0, hostKeyArray2, n9, hostKeyArray.length);
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                return hostKeyArray2;
            }
            throw throwable2;
        }
    }

    MAC h(String string) throws IllegalArgumentException {
        try {
            MAC mAC = Class.forName(string).asSubclass(MAC.class).getDeclaredConstructor(null).newInstance(null);
            return mAC;
        }
        catch (Exception exception) {
            Logger logger = this.a.j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unable to instantiate HMAC-class ");
            stringBuilder.append(string);
            logger.b(3, stringBuilder.toString(), exception);
            stringBuilder = new StringBuilder();
            stringBuilder.append("instantiation of ");
            stringBuilder.append(string);
            stringBuilder.append(" lead to an error");
            throw new IllegalArgumentException(stringBuilder.toString(), exception);
        }
    }

    HostKey i(String object, byte[] byArray) throws JSchException {
        object = new HashedHostKey(this, (String)object, byArray);
        ((HashedHostKey)object).j();
        return object;
    }

    String j(String string, String charSequence) {
        int n8;
        int n9 = ((String)charSequence).length();
        int n10 = string.length();
        int n11 = 0;
        while (n11 < n10 && (n8 = string.indexOf(44, n11)) != -1) {
            if (!((String)charSequence).equals(string.substring(n11, n8))) {
                n11 = n8 + 1;
                continue;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string.substring(0, n11));
            ((StringBuilder)charSequence).append(string.substring(n8 + 1));
            return ((StringBuilder)charSequence).toString();
        }
        String string2 = string;
        if (string.endsWith((String)charSequence)) {
            string2 = string;
            if (n10 - n11 == n9) {
                n11 = n9 == n10 ? 0 : n10 - n9 - 1;
                string2 = string.substring(0, n11);
            }
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void k(OutputStream outputStream) {
        Vector<HostKey> vector = this.c;
        // MONITORENTER : vector
        try {
            for (int i8 = 0; i8 < this.c.size(); ++i8) {
                this.l(outputStream, this.c.elementAt(i8));
            }
            // MONITOREXIT : vector
            return;
        }
        catch (Throwable throwable) {}
        try {
            throw throwable;
        }
        catch (Exception exception) {
            this.a.j().b(3, "unable to dump known hosts", exception);
            return;
        }
    }

    void l(OutputStream outputStream, HostKey hostKey) throws IOException {
        Object object = hostKey.e();
        String string = hostKey.c();
        String string2 = hostKey.f();
        String string3 = hostKey.b();
        if (string2.equals("UNKNOWN")) {
            outputStream.write(Util.v(string));
            outputStream.write(f);
            return;
        }
        if (((String)object).length() != 0) {
            outputStream.write(Util.v((String)object));
            outputStream.write(e);
        }
        outputStream.write(Util.v(string));
        object = e;
        outputStream.write((byte[])object);
        outputStream.write(Util.v(string2));
        outputStream.write((byte[])object);
        outputStream.write(Util.v(hostKey.d()));
        if (string3 != null) {
            outputStream.write((byte[])object);
            outputStream.write(Util.v(string3));
        }
        outputStream.write(f);
    }

    MAC m() throws IllegalArgumentException {
        if (this.d == null) {
            this.d = this.h(JSch.f("hmac-sha1"));
        }
        return this.d;
    }

    /*
     * Exception decompiling
     */
    void n(InputStream var1_1) throws JSchException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 154->174)] java.lang.Throwable
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void o(String string) throws JSchException {
        try {
            this.b = string;
            FileInputStream fileInputStream = new FileInputStream(Util.h(string));
            this.n(fileInputStream);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
    }

    void p() throws IOException {
        String string = this.b;
        if (string != null) {
            this.q(string);
        }
    }

    /*
     * Exception decompiling
     */
    void q(String var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 46->55)] java.lang.Throwable
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

    void r(UserInfo object) {
        String string = this.a();
        if (string != null) {
            boolean bl;
            Comparable<File> comparable;
            Object object2 = new File(Util.h(string));
            if (!((File)object2).exists()) {
                boolean bl2 = false;
                comparable = object2;
                bl = bl2;
                if (object != null) {
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append(string);
                    ((StringBuilder)comparable).append(" does not exist.\nAre you sure you want to create it?");
                    boolean bl3 = object.g(((StringBuilder)comparable).toString());
                    comparable = ((File)object2).getParentFile();
                    bl = bl3;
                    if (bl3) {
                        bl = bl3;
                        if (comparable != null) {
                            bl = bl3;
                            if (!((File)comparable).exists()) {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("The parent directory ");
                                ((StringBuilder)object2).append(comparable);
                                ((StringBuilder)object2).append(" does not exist.\nAre you sure you want to create it?");
                                bl = bl3 = object.g(((StringBuilder)object2).toString());
                                if (bl3) {
                                    if (!((File)comparable).mkdirs()) {
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append(comparable);
                                        ((StringBuilder)object2).append(" has not been created.");
                                        object.d(((StringBuilder)object2).toString());
                                        bl = false;
                                    } else {
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append(comparable);
                                        ((StringBuilder)object2).append(" has been succesfully created.\nPlease check its access permission.");
                                        object.d(((StringBuilder)object2).toString());
                                        bl = bl3;
                                    }
                                }
                            }
                        }
                    }
                    if (comparable == null) {
                        bl = bl2;
                    }
                }
            } else {
                bl = true;
                comparable = object2;
            }
            if (bl) {
                try {
                    this.q(string);
                    return;
                }
                catch (Exception exception) {
                    object2 = this.a.j();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("unable to sync known host file ");
                    ((StringBuilder)object).append(((File)comparable).getPath());
                    object2.b(3, ((StringBuilder)object).toString(), exception);
                }
            }
        }
    }

    class HashedHostKey
    extends HostKey {
        private boolean g;
        byte[] h;
        byte[] i;
        final KnownHosts j;

        HashedHostKey(KnownHosts knownHosts, String string, int n8, byte[] byArray) throws JSchException {
            this(knownHosts, "", string, n8, byArray, null);
        }

        HashedHostKey(KnownHosts knownHosts, String string, String string2, int n8, byte[] byArray, String string3) throws JSchException {
            this.j = knownHosts;
            super(string, string2, n8, byArray, string3);
            this.g = false;
            this.h = null;
            this.i = null;
            if (this.b.startsWith("|1|") && this.b.substring(3).indexOf("|") > 0) {
                string2 = this.b.substring(3);
                string = string2.substring(0, string2.indexOf("|"));
                string2 = string2.substring(string2.indexOf("|") + 1);
                this.h = Util.k(Util.v(string), 0, string.length());
                this.i = Util.k(Util.v(string2), 0, string2.length());
                n8 = knownHosts.d.d();
                if (this.h.length == n8 && this.i.length == n8) {
                    this.g = true;
                    return;
                }
                this.h = null;
                this.i = null;
            }
        }

        HashedHostKey(KnownHosts knownHosts, String string, byte[] byArray) throws JSchException {
            this(knownHosts, string, 0, byArray);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        boolean h(String string) {
            if (!this.g) {
                return super.h(string);
            }
            try {
                MAC mAC = this.j.d;
                synchronized (mAC) {
                }
            }
            catch (Exception exception) {
                Logger logger = this.j.a.j();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("an error occurred while trying to check hash for host ");
                stringBuilder.append(string);
                logger.b(3, stringBuilder.toString(), exception);
                return false;
            }
            {
                this.j.d.a(this.h);
                byte[] byArray = Util.v(string);
                this.j.d.b(byArray, 0, byArray.length);
                byArray = new byte[this.j.d.d()];
                this.j.d.c(byArray, 0);
                return Util.a(this.i, byArray);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void j() {
            byte[] byArray;
            Object object;
            if (this.g) {
                return;
            }
            if (this.h == null) {
                object = Session.x0;
                synchronized (object) {
                    byArray = new byte[this.j.d.d()];
                    this.h = byArray;
                    object.a(byArray, 0, byArray.length);
                }
            }
            try {
                object = this.j.d;
                synchronized (object) {
                }
            }
            catch (Exception exception) {
                Logger logger = this.j.a.j();
                object = new StringBuilder();
                ((StringBuilder)object).append("an error occurred while trying to calculate the hash for host ");
                ((StringBuilder)object).append(this.b);
                logger.b(3, ((StringBuilder)object).toString(), exception);
                this.h = null;
                this.i = null;
                return;
            }
            {
                this.j.d.a(this.h);
                byArray = Util.v(this.b);
                this.j.d.b(byArray, 0, byArray.length);
                byArray = new byte[this.j.d.d()];
                this.i = byArray;
                this.j.d.c(byArray, 0);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("|1|");
            byArray = this.h;
            ((StringBuilder)object).append(Util.c(Util.x(byArray, 0, byArray.length, true)));
            ((StringBuilder)object).append("|");
            byArray = this.i;
            ((StringBuilder)object).append(Util.c(Util.x(byArray, 0, byArray.length, true)));
            this.b = ((StringBuilder)object).toString();
            this.g = true;
        }

        boolean k() {
            return this.g;
        }
    }
}

