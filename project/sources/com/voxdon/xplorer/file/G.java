package com.voxdon.xplorer.file;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* loaded from: classes.dex */
public class G implements ax.P9.n {
    private final ax.T9.e a;
    private final ax.K9.a b;
    private final ax.L9.d c;
    private final ax.Q9.b d;
    private ax.P9.m e = new ax.P9.e();

    class a implements Runnable {
        final /* synthetic */ Class c0;
        final /* synthetic */ Object d0;
        final /* synthetic */ ax.L9.e e0;
        final /* synthetic */ ax.L9.c f0;
        final /* synthetic */ ax.P9.o q;

        a(ax.P9.o oVar, Class cls, Object obj, ax.L9.e eVar, ax.L9.c cVar) {
            this.q = oVar;
            this.c0 = cls;
            this.d0 = obj;
            this.e0 = eVar;
            this.f0 = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                G.this.c.a(G.this.k(this.q, this.c0, this.d0, this.e0, null), this.f0);
            } catch (ax.M9.d e) {
                G.this.c.c(e, this.f0);
            }
        }
    }

    public G(Context context, ax.T9.e eVar, ax.K9.a aVar, ax.L9.d dVar, ax.Q9.b bVar) {
        this.a = eVar;
        this.b = aVar;
        this.c = dVar;
        this.d = bVar;
    }

    private InputStream g(InputStream inputStream) {
        return inputStream;
    }

    private <Body> void h(ax.P9.o oVar, Body body, ax.P9.l lVar) throws IOException {
        throw ax.P9.j.b(oVar, body, this.a, lVar);
    }

    private <Result> Result i(InputStream inputStream, Class<Result> cls) {
        if (cls == null) {
            return null;
        }
        return (Result) f().b(l(inputStream), cls);
    }

    private Boolean j(List<ax.S9.b> list, String str) {
        Iterator<ax.S9.b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a() == str) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0335 A[Catch: Exception -> 0x0023, j -> 0x021d, TryCatch #18 {j -> 0x021d, blocks: (B:59:0x0219, B:82:0x0286, B:84:0x028b, B:88:0x0299, B:90:0x029e, B:94:0x02ac, B:96:0x02b1, B:106:0x02e6, B:107:0x02e9, B:113:0x0302, B:119:0x0335, B:122:0x033c, B:123:0x0342, B:130:0x0315, B:132:0x031a), top: B:9:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x033a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r18v11, types: [Result] */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r2v8, types: [Result, com.microsoft.graph.extensions.DriveItem, com.microsoft.graph.generated.BaseBaseItem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <Result, Body, DeserializeType> Result k(ax.P9.o r24, java.lang.Class<Result> r25, Body r26, ax.L9.e<Result> r27, ax.P9.q<Result, DeserializeType> r28) throws ax.M9.d {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.G.k(ax.P9.o, java.lang.Class, java.lang.Object, ax.L9.e, ax.P9.q):java.lang.Object");
    }

    public static String l(InputStream inputStream) {
        return new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
    }

    @Override // ax.P9.n
    public <Result, Body> Result a(ax.P9.o oVar, Class<Result> cls, Body body) throws ax.M9.d {
        return (Result) c(oVar, cls, body, null);
    }

    @Override // ax.P9.n
    public <Result, Body> void b(ax.P9.o oVar, ax.L9.c<Result> cVar, Class<Result> cls, Body body) {
        this.c.b(new a(oVar, cls, body, cVar instanceof ax.L9.e ? (ax.L9.e) cVar : null, cVar));
    }

    @Override // ax.P9.n
    public <Result, Body, DeserializeType> Result c(ax.P9.o oVar, Class<Result> cls, Body body, ax.P9.q<Result, DeserializeType> qVar) throws ax.M9.d {
        return (Result) k(oVar, cls, body, null, qVar);
    }

    public ax.T9.e f() {
        return this.a;
    }
}
