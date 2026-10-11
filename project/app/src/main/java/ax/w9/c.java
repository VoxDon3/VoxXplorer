/*
 * Decompiled with CFR 0.152.
 */
package ax.w9;

import ax.B8.b;
import ax.Z8.a;
import ax.w9.e;
import ax.w9.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class c
extends f {
    private BigInteger c;
    private ax.E8.e d;
    private byte[] e;
    private byte[] f;

    public c() {
        super(1, "NegTokenTarg");
    }

    /*
     * Exception decompiling
     */
    private c f(a<?> var1_1) throws e {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 48->55)] java.io.IOException
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

    private void h(ax.C8.b<?> b8) throws e {
        if (b8 instanceof ax.F8.b) {
            this.f = ((ax.F8.b)b8).i();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected the responseToken (OCTET_STRING) contents, not: ");
        stringBuilder.append(b8);
        throw new e(stringBuilder.toString());
    }

    private void i(ax.C8.b<?> object) throws e {
        if (object instanceof ax.E8.b) {
            this.c = ((ax.E8.b)object).k();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected the negResult (ENUMERATED) contents, not: ");
        ((StringBuilder)object).append(this.d);
        throw new e(((StringBuilder)object).toString());
    }

    private void j(ax.C8.b<?> b8) throws e {
        if (b8 instanceof ax.F8.b) {
            this.e = ((ax.F8.b)b8).i();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected the responseToken (OCTET_STRING) contents, not: ");
        stringBuilder.append(b8);
        throw new e(stringBuilder.toString());
    }

    private void k(ax.C8.b<?> b8) throws e {
        if (b8 instanceof ax.E8.e) {
            this.d = (ax.E8.e)b8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: ");
        stringBuilder.append(b8);
        throw new e(stringBuilder.toString());
    }

    @Override
    protected void b(ax.D8.c c8) throws e {
        int n8 = c8.r();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        this.h(c8.p());
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown Object Tag ");
                    stringBuilder.append(c8.r());
                    stringBuilder.append(" encountered.");
                    throw new e(stringBuilder.toString());
                }
                this.j(c8.p());
                return;
            }
            this.k(c8.p());
            return;
        }
        this.i(c8.p());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(a<?> a8) throws e {
        Object object;
        ax.C8.b b8;
        ax.C8.c c8;
        ArrayList<ax.C8.b> arrayList = new ArrayList<ax.C8.b>();
        try {
            if (this.c != null) {
                c8 = ax.C8.c.d(0).c();
                b8 = new ax.E8.b(this.c);
                object = new ax.D8.c(c8, b8);
                arrayList.add((ax.C8.b)object);
            }
        }
        catch (IOException iOException) {
            throw new e("Could not write NegTokenTarg to buffer", iOException);
        }
        if (this.d != null) {
            object = new ax.D8.c(ax.C8.c.d(1).c(), this.d);
            arrayList.add((ax.C8.b)object);
        }
        if ((object = (Object)this.e) != null && ((Object)object).length > 0) {
            object = ax.C8.c.d(2).c();
            c8 = new ax.C8.c(this.e);
            b8 = new ax.D8.c((ax.C8.c)object, (ax.C8.b)((Object)c8));
            arrayList.add(b8);
        }
        if ((object = (Object)this.f) != null && ((Object)object).length > 0) {
            c8 = ax.C8.c.d(3).c();
            b8 = new ax.F8.b(this.f);
            object = new ax.D8.c(c8, b8);
            arrayList.add((ax.C8.b)object);
        }
        object = new ax.D8.a(arrayList);
        this.d(a8, (ax.C8.b<?>)object);
    }

    @Override
    protected void d(a<?> a8, ax.C8.b<?> object) throws IOException {
        ax.D8.c c8 = new ax.D8.c(ax.C8.c.d(1).c(), (ax.C8.b)object, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        object = new ax.y8.b(new b(), byteArrayOutputStream);
        ((ax.y8.b)object).c(c8);
        a8.o(byteArrayOutputStream.toByteArray());
        return;
        finally {
            ((OutputStream)object).close();
        }
    }

    public byte[] e() {
        return this.e;
    }

    public c g(byte[] byArray) throws e {
        return this.f(new a.c(byArray, ax.Z8.b.b));
    }

    public void l(byte[] byArray) {
        this.f = byArray;
    }

    public void m(byte[] byArray) {
        this.e = byArray;
    }
}

