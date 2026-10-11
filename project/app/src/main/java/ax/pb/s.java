/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Z;
import ax.pb.a0;
import ax.pb.r;
import ax.pb.t;
import ax.qb.d;
import ax.qb.e;
import ax.rb.a;
import ax.rb.b;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.TimeZone;

abstract class s
extends b
implements a,
Z {
    static e A0 = e.a();
    static final byte[] B0 = new byte[]{-1, 83, 77, 66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    byte d0;
    byte e0 = (byte)24;
    int f0;
    int g0;
    int h0 = 0;
    int i0;
    int j0;
    int k0;
    int l0 = Z.H;
    int m0;
    int n0;
    int o0;
    int p0;
    boolean q0;
    boolean r0;
    boolean s0;
    long t0 = 1L;
    int u0;
    boolean v0;
    r w0 = null;
    String x0;
    t y0 = null;
    s z0;

    s() {
    }

    static void C(long l8, byte[] byArray, int n8) {
        long l9 = l8;
        if (l8 != 0L) {
            l9 = (l8 + 11644473600000L) * 10000L;
        }
        s.y(l9, byArray, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static void D(long l8, byte[] byArray, int n8) {
        if (l8 != 0L && l8 != -1L) {
            long l9;
            TimeZone timeZone = Z.I;
            // MONITORENTER : timeZone
            Date date = new Date();
            if (timeZone.inDaylightTime(date)) {
                date = new Date(l8);
                l9 = timeZone.inDaylightTime(date) ? l8 : l8 - 3600000L;
            } else {
                date = new Date(l8);
                l9 = l8;
                if (timeZone.inDaylightTime(date)) {
                    l9 = l8 + 3600000L;
                }
                // MONITOREXIT : timeZone
            }
            s.x((int)(l9 / 1000L), byArray, n8);
            return;
        }
        s.x(-1L, byArray, n8);
    }

    static int i(byte[] byArray, int n8) {
        return (byArray[n8] & 0xFF) + ((byArray[n8 + 1] & 0xFF) << 8);
    }

    static int j(byte[] byArray, int n8) {
        return (byArray[n8] & 0xFF) + ((byArray[n8 + 1] & 0xFF) << 8) + ((byArray[n8 + 2] & 0xFF) << 16) + ((byArray[n8 + 3] & 0xFF) << 24);
    }

    static long k(byte[] byArray, int n8) {
        return ((long)s.j(byArray, n8) & 0xFFFFFFFFL) + ((long)s.j(byArray, n8 + 4) << 32);
    }

    static long q(byte[] byArray, int n8) {
        int n9 = s.j(byArray, n8);
        return ((long)s.j(byArray, n8 + 4) << 32 | (long)n9 & 0xFFFFFFFFL) / 10000L - 11644473600000L;
    }

    static long r(byte[] byArray, int n8) {
        return (long)s.j(byArray, n8) * 1000L;
    }

    static void w(long l8, byte[] byArray, int n8) {
        byArray[n8] = (byte)l8;
        byArray[n8 + 1] = (byte)(l8 >> 8);
    }

    static void x(long l8, byte[] byArray, int n8) {
        byArray[n8] = (byte)l8;
        byArray[n8 + 1] = (byte)(l8 >> 8);
        byArray[n8 + 2] = (byte)(l8 >> 16);
        byArray[n8 + 3] = (byte)(l8 >> 24);
    }

    static void y(long l8, byte[] byArray, int n8) {
        byArray[n8] = (byte)l8;
        byArray[n8 + 1] = (byte)(l8 >> 8);
        byArray[n8 + 2] = (byte)(l8 >> 16);
        byArray[n8 + 3] = (byte)(l8 >> 24);
        byArray[n8 + 4] = (byte)(l8 >> 32);
        byArray[n8 + 5] = (byte)(l8 >> 40);
        byArray[n8 + 6] = (byte)(l8 >> 48);
        byArray[n8 + 7] = (byte)(l8 >> 56);
    }

    int A(String string, byte[] byArray, int n8) {
        return this.B(string, byArray, n8, this.q0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    int B(String object, byte[] byArray, int n8, boolean bl) {
        RuntimeException var1_4;
        int n9;
        int n10;
        if (bl) {
            n10 = this.f0;
            if ((n8 - n10) % 2 != 0) {
                n10 = n8 + 1;
                byArray[n8] = 0;
            } else {
                n10 = n8;
            }
            n9 = n10;
            try {
                System.arraycopy(((String)object).getBytes("UTF-16LE"), 0, byArray, n10, ((String)object).length() * 2);
                n9 = n10;
                int n11 = ((String)object).length();
                byArray[n10 += n11 * 2] = 0;
                n9 = n10 + 2;
                byArray[n10 + 1] = 0;
                return n9 - n8;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                n10 = n9;
            }
        } else {
            try {
                object = ((String)object).getBytes(Z.K);
                System.arraycopy(object, 0, byArray, n8, ((Object)object).length);
                int n12 = ((Object)object).length;
                n9 = (n12 += n8) + 1;
                byArray[n12] = 0;
                return n9 - n8;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                n10 = n8;
            }
        }
        n9 = n10;
        if (e.c0 <= 1) return n9 - n8;
        var1_4.printStackTrace(A0);
        n9 = n10;
        return n9 - n8;
    }

    int d(byte[] object, int n8) {
        Appendable appendable;
        int n9;
        this.f0 = n8;
        int n10 = this.h((byte[])object, n8) + n8;
        int n11 = n10 + 1;
        this.o0 = n9 = object[n10];
        n10 = n11;
        if (n9 != 0) {
            n10 = this.l((byte[])object, n11);
            if (n10 != this.o0 * 2 && e.c0 >= 5) {
                appendable = A0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("wordCount * 2=");
                stringBuilder.append(this.o0 * 2);
                stringBuilder.append(" but readParameterWordsWireFormat returned ");
                stringBuilder.append(n10);
                ((PrintStream)appendable).println(stringBuilder.toString());
            }
            n10 = n11 + this.o0 * 2;
        }
        this.p0 = n9 = s.i((byte[])object, n10);
        n10 = n11 = n10 + 2;
        if (n9 != 0) {
            n10 = this.g((byte[])object, n11);
            if (n10 != this.p0 && e.c0 >= 5) {
                object = A0;
                appendable = new StringBuilder();
                ((StringBuilder)appendable).append("byteCount=");
                ((StringBuilder)appendable).append(this.p0);
                ((StringBuilder)appendable).append(" but readBytesWireFormat returned ");
                ((StringBuilder)appendable).append(n10);
                ((PrintStream)object).println(((StringBuilder)appendable).toString());
            }
            n10 = n11 + this.p0;
        }
        this.g0 = n8 = n10 - n8;
        return n8;
    }

    int e(byte[] byArray, int n8) {
        block0: {
            int n9;
            this.f0 = n8;
            int n10 = this.v(byArray, n8) + n8;
            int n11 = n10 + 1;
            this.o0 = n9 = this.z(byArray, n11);
            byArray[n10] = (byte)(n9 / 2 & 0xFF);
            n11 += n9;
            this.o0 = n9 / 2;
            this.p0 = n9 = this.u(byArray, n11 + 2);
            byArray[n11] = (byte)(n9 & 0xFF);
            byArray[n11 + 1] = (byte)(n9 >> 8 & 0xFF);
            this.g0 = n8 = n11 + 2 + n9 - n8;
            t t8 = this.y0;
            if (t8 == null) break block0;
            t8.b(byArray, this.f0, n8, this, this.z0);
        }
        return this.g0;
    }

    public boolean equals(Object object) {
        return object instanceof s && ((s)object).n0 == this.n0;
    }

    boolean f() {
        return (this.e0 & 0x80) == 128;
    }

    abstract int g(byte[] var1, int var2);

    int h(byte[] byArray, int n8) {
        this.d0 = byArray[n8 + 4];
        this.i0 = s.j(byArray, n8 + 5);
        this.e0 = byArray[n8 + 9];
        this.j0 = s.i(byArray, n8 + 10);
        this.k0 = s.i(byArray, n8 + 24);
        this.l0 = s.i(byArray, n8 + 26);
        this.m0 = s.i(byArray, n8 + 28);
        this.n0 = s.i(byArray, n8 + 30);
        return 32;
    }

    public int hashCode() {
        return this.n0;
    }

    abstract int l(byte[] var1, int var2);

    String m(byte[] byArray, int n8) {
        return this.o(byArray, n8, 256, this.q0);
    }

    /*
     * Exception decompiling
     */
    String n(byte[] var1_1, int var2_3, int var3_4, int var4_5, boolean var5_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 87->98)] java.io.UnsupportedEncodingException
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    String o(byte[] object, int n8, int n9, boolean bl) {
        UnsupportedEncodingException unsupportedEncodingException2;
        block13: {
            int n10;
            int n11 = 128;
            int n12 = 0;
            int n13 = 0;
            if (bl) {
                int n14;
                block12: {
                    n14 = n13;
                    n12 = n8;
                    try {
                        if ((n8 - this.f0) % 2 == 0) break block12;
                        n12 = n8 + 1;
                        n14 = n13;
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException2) {
                        break block13;
                    }
                }
                do {
                    if (object[n8 = n12 + n14] == 0) {
                        if (object[n8 + 1] == 0) return new String((byte[])object, n12, n14, "UTF-16LE");
                    }
                    n14 = n8 = n14 + 2;
                } while (n8 <= n9);
                if (e.c0 > 0) {
                    PrintStream printStream = System.err;
                    if (n9 < 128) {
                        n11 = n9 + 8;
                    }
                    d.a(printStream, object, n12, n11);
                }
                object = new RuntimeException;
                object("zero termination not found");
                throw object;
            }
            do {
                if (object[n8 + n12] == 0) return new String((byte[])object, n8, n12, Z.K);
                n12 = n10 = n12 + 1;
            } while (n10 <= n9);
            {
                if (e.c0 > 0) {
                    PrintStream printStream = System.err;
                    if (n9 < 128) {
                        n11 = n9 + 8;
                    }
                    d.a(printStream, object, n8, n11);
                }
                object = new RuntimeException;
                object("zero termination not found");
                throw object;
            }
        }
        if (e.c0 <= 1) return null;
        unsupportedEncodingException2.printStackTrace(A0);
        return null;
    }

    int p(byte[] object, int n8, int n9) {
        int n10 = 0;
        while (object[n8 + n10] != 0) {
            if (n10 <= n9) {
                ++n10;
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("zero termination not found: ");
            ((StringBuilder)object).append(this);
            throw new RuntimeException(((StringBuilder)object).toString());
        }
        return n10;
    }

    void s() {
        this.e0 = (byte)24;
        this.j0 = 0;
        this.i0 = 0;
        this.r0 = false;
        this.y0 = null;
    }

    int t(String string, int n8) {
        int n9 = string.length() + 1;
        if (this.q0) {
            int n10 = string.length() * 2;
            n9 = n10 + 2;
            if (n8 % 2 != 0) {
                return n10 + 3;
            }
        }
        return n9;
    }

    public String toString() {
        String string;
        int n8 = this.d0;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 4) {
                    if (n8 != 16) {
                        if (n8 != 50) {
                            if (n8 != 52) {
                                if (n8 != 6) {
                                    if (n8 != 7) {
                                        if (n8 != 8) {
                                            if (n8 != 37) {
                                                if (n8 != 38) {
                                                    if (n8 != 42) {
                                                        if (n8 != 43) {
                                                            block0 : switch (n8) {
                                                                default: {
                                                                    switch (n8) {
                                                                        default: {
                                                                            switch (n8) {
                                                                                default: {
                                                                                    string = "UNKNOWN";
                                                                                    break block0;
                                                                                }
                                                                                case 117: {
                                                                                    string = "SMB_COM_TREE_CONNECT_ANDX";
                                                                                    break block0;
                                                                                }
                                                                                case 116: {
                                                                                    string = "SMB_COM_LOGOFF_ANDX";
                                                                                    break block0;
                                                                                }
                                                                                case 115: {
                                                                                    string = "SMB_COM_SESSION_SETUP_ANDX";
                                                                                    break block0;
                                                                                }
                                                                                case 114: {
                                                                                    string = "SMB_COM_NEGOTIATE";
                                                                                    break block0;
                                                                                }
                                                                                case 113: 
                                                                            }
                                                                            string = "SMB_COM_TREE_DISCONNECT";
                                                                            break block0;
                                                                        }
                                                                        case 47: {
                                                                            string = "SMB_COM_WRITE_ANDX";
                                                                            break block0;
                                                                        }
                                                                        case 46: {
                                                                            string = "SMB_COM_READ_ANDX";
                                                                            break block0;
                                                                        }
                                                                        case 45: 
                                                                    }
                                                                    string = "SMB_COM_OPEN_ANDX";
                                                                    break;
                                                                }
                                                                case -94: {
                                                                    string = "SMB_COM_NT_CREATE_ANDX";
                                                                    break;
                                                                }
                                                                case -95: {
                                                                    string = "SMB_COM_NT_TRANSACT_SECONDARY";
                                                                    break;
                                                                }
                                                                case -96: {
                                                                    string = "SMB_COM_NT_TRANSACT";
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            string = "SMB_COM_ECHO";
                                                        }
                                                    } else {
                                                        string = "SMB_COM_MOVE";
                                                    }
                                                } else {
                                                    string = "SMB_COM_TRANSACTION_SECONDARY";
                                                }
                                            } else {
                                                string = "SMB_COM_TRANSACTION";
                                            }
                                        } else {
                                            string = "SMB_COM_QUERY_INFORMATION";
                                        }
                                    } else {
                                        string = "SMB_COM_RENAME";
                                    }
                                } else {
                                    string = "SMB_COM_DELETE";
                                }
                            } else {
                                string = "SMB_COM_FIND_CLOSE2";
                            }
                        } else {
                            string = "SMB_COM_TRANSACTION2";
                        }
                    } else {
                        string = "SMB_COM_CHECK_DIRECTORY";
                    }
                } else {
                    string = "SMB_COM_CLOSE";
                }
            } else {
                string = "SMB_COM_DELETE_DIRECTORY";
            }
        } else {
            string = "SMB_COM_CREATE_DIRECTORY";
        }
        n8 = this.i0;
        String string2 = n8 == 0 ? "0" : a0.a(n8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("command=");
        stringBuilder.append(string);
        stringBuilder.append(",received=");
        stringBuilder.append(this.r0);
        stringBuilder.append(",errorCode=");
        stringBuilder.append(string2);
        stringBuilder.append(",flags=0x");
        stringBuilder.append(d.c(this.e0 & 0xFF, 4));
        stringBuilder.append(",flags2=0x");
        stringBuilder.append(d.c(this.j0, 4));
        stringBuilder.append(",signSeq=");
        stringBuilder.append(this.u0);
        stringBuilder.append(",tid=");
        stringBuilder.append(this.k0);
        stringBuilder.append(",pid=");
        stringBuilder.append(this.l0);
        stringBuilder.append(",uid=");
        stringBuilder.append(this.m0);
        stringBuilder.append(",mid=");
        stringBuilder.append(this.n0);
        stringBuilder.append(",wordCount=");
        stringBuilder.append(this.o0);
        stringBuilder.append(",byteCount=");
        stringBuilder.append(this.p0);
        return new String(stringBuilder.toString());
    }

    abstract int u(byte[] var1, int var2);

    int v(byte[] byArray, int n8) {
        byte[] byArray2 = B0;
        System.arraycopy(byArray2, 0, byArray, n8, byArray2.length);
        byArray[n8 + 4] = this.d0;
        byArray[n8 + 9] = this.e0;
        s.w(this.j0, byArray, n8 + 10);
        s.w(this.k0, byArray, n8 + 24);
        s.w(this.l0, byArray, n8 + 26);
        s.w(this.m0, byArray, n8 + 28);
        s.w(this.n0, byArray, n8 + 30);
        return 32;
    }

    abstract int z(byte[] var1, int var2);
}

