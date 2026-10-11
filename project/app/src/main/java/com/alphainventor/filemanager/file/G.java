/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.content.Context;
import ax.K9.a;
import ax.L9.c;
import ax.M9.d;
import ax.P9.j;
import ax.P9.l;
import ax.P9.m;
import ax.P9.n;
import ax.P9.o;
import ax.P9.q;
import ax.S9.b;
import ax.T9.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class G
implements n {
    private final e a;
    private final a b;
    private final ax.L9.d c;
    private final ax.Q9.b d;
    private m e;

    public G(Context context, e e8, a a8, ax.L9.d d8, ax.Q9.b b8) {
        this.a = e8;
        this.b = a8;
        this.c = d8;
        this.d = b8;
        this.e = new ax.P9.e();
    }

    private InputStream g(InputStream inputStream) {
        return inputStream;
    }

    private <Body> void h(o o8, Body Body, l l8) throws IOException {
        throw j.b(o8, Body, this.a, l8);
    }

    private <Result> Result i(InputStream object, Class<Result> clazz) {
        if (clazz == null) {
            return null;
        }
        object = G.l((InputStream)object);
        return this.f().b((String)object, clazz);
    }

    private Boolean j(List<b> object, String string) {
        object = object.iterator();
        while (object.hasNext()) {
            if (((b)object.next()).a() != string) continue;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /*
     * Exception decompiling
     */
    private <Result, Body, DeserializeType> Result k(o var1_1, Class<Result> var2_21, Body var3_23, ax.L9.e<Result> var4_25, q<Result, DeserializeType> var5_26) throws d {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [5, 4 : 52->111)] java.lang.Exception
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

    public static String l(InputStream inputStream) {
        return new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
    }

    public <Result, Body> Result a(o o8, Class<Result> clazz, Body Body) throws d {
        return this.c(o8, clazz, Body, (q<Result, DeserializeType>)null);
    }

    public <Result, Body> void b(o o8, c<Result> c8, Class<Result> clazz, Body Body) {
        ax.L9.e e8 = c8 instanceof ax.L9.e ? (ax.L9.e)c8 : null;
        this.c.b(new Runnable(){
            final Class c0;
            final Object d0;
            final ax.L9.e e0;
            final c f0;
            final G g0;
            final o q;
            {
                this.g0 = g8;
                this.q = o8;
                this.c0 = clazz;
                this.d0 = object;
                this.e0 = e8;
                this.f0 = c8;
            }

            @Override
            public void run() {
                try {
                    this.g0.c.a(this.g0.k(this.q, this.c0, this.d0, this.e0, null), this.f0);
                    return;
                }
                catch (d d8) {
                    this.g0.c.c(d8, this.f0);
                    return;
                }
            }
        });
    }

    public <Result, Body, DeserializeType> Result c(o o8, Class<Result> clazz, Body Body, q<Result, DeserializeType> q8) throws d {
        return this.k(o8, clazz, Body, null, q8);
    }

    public e f() {
        return this.a;
    }
}

