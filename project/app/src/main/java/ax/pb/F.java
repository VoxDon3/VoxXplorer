/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.k0;
import ax.pb.s;
import ax.qb.d;
import java.util.Date;

class F
extends s {
    int C0;
    k0.a D0;

    F(k0.a a8) {
        this.D0 = a8;
    }

    /*
     * Exception decompiling
     */
    @Override
    int g(byte[] var1_1, int var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 196->200)] java.io.UnsupportedEncodingException
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

    @Override
    int l(byte[] byArray, int n8) {
        int n9;
        this.C0 = n9 = s.i(byArray, n8);
        int n10 = n8 + 2;
        if (n9 > 10) {
            return n10 - n8;
        }
        k0.a a8 = this.D0;
        n10 = byArray[n10];
        a8.f = n10 & 0xFF;
        a8.g = n10 & 1;
        boolean bl = false;
        boolean bl2 = (n10 & 2) == 2;
        a8.h = bl2;
        bl2 = (n10 & 4) == 4;
        a8.i = bl2;
        bl2 = bl;
        if ((n10 & 8) == 8) {
            bl2 = true;
        }
        a8.j = bl2;
        a8.a = s.i(byArray, n8 + 3);
        this.D0.k = s.i(byArray, n8 + 5);
        this.D0.b = s.j(byArray, n8 + 7);
        this.D0.l = s.j(byArray, n8 + 11);
        this.D0.c = s.j(byArray, n8 + 15);
        this.D0.d = s.j(byArray, n8 + 19);
        this.D0.m = s.q(byArray, n8 + 23);
        this.D0.n = s.i(byArray, n8 + 31);
        this.D0.o = byArray[n8 + 33] & 0xFF;
        return n8 + 34 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComNegotiateResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",wordCount=");
        stringBuilder.append(this.o0);
        stringBuilder.append(",dialectIndex=");
        stringBuilder.append(this.C0);
        stringBuilder.append(",securityMode=0x");
        stringBuilder.append(d.c(this.D0.f, 1));
        stringBuilder.append(",security=");
        String string = this.D0.g == 0 ? "share" : "user";
        stringBuilder.append(string);
        stringBuilder.append(",encryptedPasswords=");
        stringBuilder.append(this.D0.h);
        stringBuilder.append(",maxMpxCount=");
        stringBuilder.append(this.D0.a);
        stringBuilder.append(",maxNumberVcs=");
        stringBuilder.append(this.D0.k);
        stringBuilder.append(",maxBufferSize=");
        stringBuilder.append(this.D0.b);
        stringBuilder.append(",maxRawSize=");
        stringBuilder.append(this.D0.l);
        stringBuilder.append(",sessionKey=0x");
        stringBuilder.append(d.c(this.D0.c, 8));
        stringBuilder.append(",capabilities=0x");
        stringBuilder.append(d.c(this.D0.d, 8));
        stringBuilder.append(",serverTime=");
        stringBuilder.append(new Date(this.D0.m));
        stringBuilder.append(",serverTimeZone=");
        stringBuilder.append(this.D0.n);
        stringBuilder.append(",encryptionKeyLength=");
        stringBuilder.append(this.D0.o);
        stringBuilder.append(",byteCount=");
        stringBuilder.append(this.p0);
        stringBuilder.append(",oemDomainName=");
        stringBuilder.append(this.D0.e);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int z(byte[] byArray, int n8) {
        return 0;
    }
}

