package com.voxdon.xplorer.file;

import android.net.Uri;
import ax.W2.j;
import ax.b3.C1486a;
import ax.b3.C1491f;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1833v;
import ax.c3.C1835x;
import ax.c3.d0;
import ax.r3.C2945b;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.C3587f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes.dex */
public class J extends C3604x {
    public static Uri A;
    private static final Object z = new Object();
    private static HashSet<ax.c3.K> B = new HashSet<>();
    private static final Object C = new Object();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.p0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.o0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b extends AbstractC3199q<Void, Void, Void> {
        long h;
        ax.c3.K i;
        String j;

        /* synthetic */ b(long j, ax.c3.K k, String str, a aVar) {
            this(j, k, str);
        }

        private void w(C3596o c3596o, String str, AbstractC3595n abstractC3595n) throws C1495j {
            Stack stack = new Stack();
            stack.push(abstractC3595n);
            while (stack.size() > 0) {
                AbstractC3595n abstractC3595n2 = (AbstractC3595n) stack.pop();
                if (abstractC3595n2.n()) {
                    for (AbstractC3595n abstractC3595n3 : c3596o.f0(abstractC3595n2)) {
                        if (J.k2(abstractC3595n3.B())) {
                            if (!abstractC3595n3.E().equals(str) && abstractC3595n3.q() < this.h) {
                                c3596o.m(abstractC3595n3);
                            }
                        } else if (abstractC3595n3.isDirectory()) {
                            stack.push(abstractC3595n3);
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            try {
                C3596o e = C1835x.e(this.i);
                w(e, J.b2(this.i), e.z(this.j));
            } catch (C1495j e2) {
                e2.printStackTrace();
            }
            synchronized (J.C) {
                J.B.remove(this.i);
            }
            return null;
        }

        private b(long j, ax.c3.K k, String str) {
            super(AbstractC3199q.e.LOW);
            this.h = j;
            this.i = k;
            this.j = str;
        }
    }

    public static class c {
        String a;
        String b;
        String c;

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        boolean a() {
            String str;
            return (this.c == null || this.a == null || (str = this.b) == null || !d0.B(str) || !d0.B(this.c)) ? false : true;
        }
    }

    public static void V1(ax.c3.K k) {
        if (k.b() != 0) {
            W1(ax.T2.h.q(k.b()));
            return;
        }
        W1(ax.c3.K.e);
        if (ax.Z2.j.F().t0()) {
            W1(ax.c3.K.f);
        }
    }

    private static void W1(ax.c3.K k) {
        long currentTimeMillis;
        C3596o e;
        AbstractC3595n z2;
        try {
            currentTimeMillis = System.currentTimeMillis();
            e = C1835x.e(k);
            z2 = e.z(b2(k));
        } catch (C1495j e2) {
            e2.printStackTrace();
        }
        if (z2.n()) {
            for (AbstractC3595n abstractC3595n : e.f0(z2)) {
                String B2 = abstractC3595n.B();
                if (!"dirs".equals(B2) && !"files".equals(B2)) {
                    if (!".nomedia".equals(B2)) {
                        e.m(abstractC3595n);
                    }
                }
                if (abstractC3595n.isDirectory()) {
                    Iterator<AbstractC3595n> it = e.f0(abstractC3595n).iterator();
                    while (it.hasNext()) {
                        e.m(it.next());
                    }
                } else {
                    e.m(abstractC3595n);
                }
            }
            ax.T2.h.S(k).v0();
            ax.T2.h.a0().v0();
            if (k.d() == ax.Q2.f.p0 && !e.B(z2)) {
                synchronized (C) {
                    try {
                        if (!B.contains(k)) {
                            new b(currentTimeMillis, k, k.e(), null).i(new Void[0]);
                            B.add(k);
                        }
                    } finally {
                    }
                }
                return;
            }
            if (k.d() == ax.Q2.f.o0 && ax.X2.Q.B()) {
                synchronized (C) {
                    try {
                        if (!B.contains(k)) {
                            new b(currentTimeMillis, k, d0.P(k.e(), "/Android/obb"), null).i(new Void[0]);
                            B.add(k);
                        }
                    } finally {
                    }
                }
                return;
            }
            return;
            e2.printStackTrace();
        }
    }

    public static void X1(ax.c3.K k, boolean z2) throws C1495j {
        String b2 = b2(k);
        C3596o e = C1835x.e(k);
        C3605y c3605y = (C3605y) e.z(b2);
        if (c3605y.n()) {
            if (z2) {
                ax.Ha.c.h().f().c("CREATE RECYCLE BIN REPORT DIR EXIST").g(b2).h();
            }
        } else {
            if (!e.k(c3605y, false)) {
                throw new C1495j("Could not create Recycle Bin folder!");
            }
            if (z2) {
                ax.Ha.c.h().f().c("CREATE RECYCLE BIN FOLDER").g(b2 + ",writable:" + ax.Z2.j.F().j0(k) + ",useDocumentFile:" + c3605y.i0() + ",loc:" + c3605y.P().I() + ",location:" + k.toString() + ",baseloc:" + c3605y.B0().toString()).h();
            }
        }
        AbstractC3595n z3 = e.z(d0.Q(b2, ".nomedia"));
        if (!z3.n()) {
            e.N(z3);
        }
        AbstractC3595n z4 = e.z(d0.Q(b2, "dirs"));
        if (!z4.n()) {
            e.k(z4, false);
        }
        AbstractC3595n z5 = e.z(d0.Q(b2, "files"));
        if (z5.n()) {
            return;
        }
        e.k(z5, false);
    }

    private static ax.c3.K Y1(C3605y c3605y) throws C1495j {
        ax.c3.K B0 = c3605y.B0();
        int i = a.a[B0.d().ordinal()];
        if (i == 1 || i == 2) {
            return B0;
        }
        ax.Ha.c.h().f().b("Invalid Recycle Bin Base location").j().g("loc:" + c3605y.R().toString() + ",base:" + B0.toString()).h();
        throw new C1495j("Invalid base location");
    }

    public static long Z1(C3596o c3596o, AbstractC3595n abstractC3595n, Map<String, C3587f.a> map) {
        return abstractC3595n.isDirectory() ? (map == null || !map.containsKey(abstractC3595n.Q())) ? a2(c3596o, abstractC3595n) : map.get(abstractC3595n.Q()).c : abstractC3595n.p();
    }

    private static long a2(C3596o c3596o, AbstractC3595n abstractC3595n) {
        Stack stack = new Stack();
        stack.push(abstractC3595n);
        long j = 0;
        while (!stack.isEmpty()) {
            AbstractC3595n abstractC3595n2 = (AbstractC3595n) stack.pop();
            if (abstractC3595n2.isDirectory()) {
                try {
                    Iterator<AbstractC3595n> it = c3596o.f0(abstractC3595n2).iterator();
                    while (it.hasNext()) {
                        stack.push(it.next());
                    }
                } catch (C1495j e) {
                    e.printStackTrace();
                }
            } else {
                j += abstractC3595n2.p();
            }
        }
        return j;
    }

    public static String b2(ax.c3.K k) {
        if (!d0.B(k.e())) {
            ax.Ha.c.h().f().b("Not normalized root path in recycle bin :" + k.e()).h();
        }
        return d0.Q(k.e(), ".$recycle_bin$");
    }

    private static boolean e2(AbstractC3595n abstractC3595n) {
        if (abstractC3595n.isDirectory()) {
            return false;
        }
        String[] split = abstractC3595n.B().split("_");
        if (split.length < 4 || split[0].length() != 1) {
            return false;
        }
        try {
            Long.valueOf(split[1]);
            Long.valueOf(split[2]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean f2(AbstractC3595n abstractC3595n) {
        if (!ax.X2.Q.q() || !C1809B.P(abstractC3595n)) {
            return false;
        }
        C3605y c3605y = (C3605y) abstractC3595n;
        if (ax.Q2.f.k0(c3605y.P())) {
            return C3605y.Y0(c3605y.C0());
        }
        return false;
    }

    public static boolean g2(AbstractC3595n abstractC3595n) {
        return (abstractC3595n instanceof K) && ((K) abstractC3595n).C1();
    }

    public static boolean h2(AbstractC3595n abstractC3595n) {
        return ax.X2.Q.B() && C3604x.i1(abstractC3595n);
    }

    public static boolean i2(AbstractC3595n abstractC3595n) {
        if (ax.X2.Q.B() && C3604x.i1(abstractC3595n)) {
            return true;
        }
        return ax.X2.Q.L() && C3604x.h1(abstractC3595n);
    }

    public static boolean j2(AbstractC3595n abstractC3595n) {
        if (!C1809B.P(abstractC3595n)) {
            return false;
        }
        if (l2(abstractC3595n.W())) {
            return true;
        }
        return k2(abstractC3595n.B());
    }

    public static boolean k2(String str) {
        return str.startsWith(".$recycle_bin$");
    }

    public static boolean l2(String str) {
        return str != null && d0.H("/.$recycle_bin$", str);
    }

    private boolean m2(AbstractC3595n abstractC3595n) {
        return j2(abstractC3595n) || abstractC3595n.E().contains(".$recycle_bin$");
    }

    private void n2(List<AbstractC3595n> list, ax.c3.K k) {
        List<AbstractC3595n> list2;
        K k2;
        AbstractC3595n L0 = L0(b2(k), k);
        if (L0.n()) {
            try {
                list2 = super.C(L0, AbstractC3594m.f.NONE);
            } catch (C1495j unused) {
                list2 = null;
            }
            if (list2 == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (AbstractC3595n abstractC3595n : list2) {
                if (!abstractC3595n.isDirectory() && e2(abstractC3595n)) {
                    synchronized (z) {
                        try {
                            k2 = new K(this, (C3605y) abstractC3595n, k, true);
                        } catch (C1495j e) {
                            if (e.getMessage() != null && e.getMessage().startsWith("Invalid RecycleBin Index")) {
                                if (abstractC3595n.q() < currentTimeMillis - 3600000) {
                                    ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 2-1").g("location:" + k.toString() + ",size:" + abstractC3595n.p() + ",exists:" + abstractC3595n.n() + "," + (currentTimeMillis - abstractC3595n.q())).h();
                                    try {
                                        P(abstractC3595n);
                                    } catch (C1495j unused2) {
                                    }
                                } else {
                                    ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 2-2").g("location:" + k.toString() + ",size:" + abstractC3595n.p() + ",exists:" + abstractC3595n.n() + "," + (currentTimeMillis - abstractC3595n.q())).h();
                                }
                            }
                        }
                        if (k2.B1() != null) {
                            AbstractC3595n L02 = L0(k2.B1(), k2.B0());
                            if (!m2(L02)) {
                                ax.Ha.c.h().f().b("INVALID RECYCLED FILE").g("location:" + k.toString() + "," + L02.E()).h();
                            } else if (L02.n()) {
                                list.add(k2);
                            } else if (k2.q() < currentTimeMillis - 3600000) {
                                ax.Ha.c.h().f().c("RECYCLED FILE DELETED").g("location:" + k.toString()).h();
                                P(abstractC3595n);
                            } else {
                                ax.Ha.c.h().f().c("RECYCLED FILE SKIPPED").g("location:" + k.toString()).h();
                            }
                        } else if (abstractC3595n.q() < currentTimeMillis - 3600000) {
                            ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 1-1").g("location:" + k.toString() + ",size:" + abstractC3595n.p() + ",exists:" + abstractC3595n.n() + "," + (currentTimeMillis - abstractC3595n.q())).h();
                            try {
                                P(abstractC3595n);
                            } catch (C1495j unused3) {
                            }
                        } else {
                            ax.Ha.c.h().f().c("RECYCLED FILE PATH == null 1-2").g("location:" + k.toString() + ",size:" + abstractC3595n.p() + ",exists:" + abstractC3595n.n() + "," + (currentTimeMillis - abstractC3595n.q())).h();
                        }
                    }
                }
            }
        }
    }

    public static c o2(AbstractC3595n abstractC3595n, ax.c3.K k) throws C1495j {
        BufferedReader bufferedReader;
        C3596o e = C1835x.e(k);
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(e.J(abstractC3595n, 0L)));
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            String readLine2 = bufferedReader.readLine();
            String readLine3 = bufferedReader.readLine();
            if (readLine == null && readLine3 != null) {
                bufferedReader.close();
                bufferedReader = new BufferedReader(new InputStreamReader(e.J(abstractC3595n, 0L)));
                readLine = bufferedReader.readLine();
                readLine2 = bufferedReader.readLine();
                readLine3 = bufferedReader.readLine();
            }
            bufferedReader2 = bufferedReader;
            if (readLine3 == null || readLine == null) {
                long currentTimeMillis = System.currentTimeMillis() - abstractC3595n.q();
                boolean z2 = currentTimeMillis < 5000 && currentTimeMillis >= 0;
                if (k != null) {
                    ax.Ha.c.h().f().d("LOAD RECYCLE INDEX").j().g("exists:" + abstractC3595n.n() + "just mod :" + z2 + ",1:" + readLine + ",2:" + readLine2 + ",3:" + readLine3 + ",base:" + k.toString()).h();
                } else {
                    ax.Ha.c.h().f().d("LOAD RECYCLE INDEX").j().g("exists:" + abstractC3595n.n() + "just mod :" + z2 + ",1:" + readLine + ",2:" + readLine2 + ",3:" + readLine3).h();
                }
            }
            c cVar = new c(readLine, readLine2, readLine3);
            try {
                bufferedReader2.close();
            } catch (IOException unused) {
            }
            return cVar;
        } catch (IOException e3) {
            e = e3;
            bufferedReader2 = bufferedReader;
            throw new C1495j(e);
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private static void p2(C3596o c3596o, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3596o c3596o2;
        InterfaceC3185c interfaceC3185c2;
        ax.g3.i iVar2;
        C3184b.c(abstractC3595n.isDirectory());
        if (!abstractC3595n2.n()) {
            if (c3596o.B(abstractC3595n) || abstractC3595n.T().equals(abstractC3595n2.T())) {
                c3596o.E(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
                return;
            } else {
                if (!c3596o.k(abstractC3595n2, true)) {
                    throw new C1495j("Create folder failed in move directory");
                }
                abstractC3595n2 = c3596o.z(abstractC3595n2.E());
            }
        }
        if (!abstractC3595n2.isDirectory()) {
            throw new ax.b3.u();
        }
        for (AbstractC3595n abstractC3595n3 : c3596o.f0(abstractC3595n)) {
            AbstractC3595n z2 = c3596o.z(d0.Q(abstractC3595n2.E(), abstractC3595n3.B()));
            if (abstractC3595n3.isDirectory()) {
                p2(c3596o, abstractC3595n3, z2, interfaceC3185c, iVar);
                c3596o2 = c3596o;
                interfaceC3185c2 = interfaceC3185c;
                iVar2 = iVar;
            } else {
                c3596o2 = c3596o;
                interfaceC3185c2 = interfaceC3185c;
                iVar2 = iVar;
                c3596o2.h0(abstractC3595n3, c3596o, z2, true, interfaceC3185c2, iVar2);
            }
            c3596o = c3596o2;
            interfaceC3185c = interfaceC3185c2;
            iVar = iVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0148 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #3 {, blocks: (B:20:0x005f, B:24:0x0088, B:28:0x00c0, B:31:0x00c4, B:32:0x00c7, B:42:0x00da, B:44:0x00e0, B:45:0x00f2, B:48:0x011a, B:50:0x0122, B:53:0x012a, B:56:0x0132, B:58:0x0148, B:60:0x014e, B:61:0x0151, B:63:0x0157, B:64:0x015e, B:65:0x015f, B:66:0x0213, B:78:0x0215, B:79:0x024a), top: B:19:0x005f, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157 A[Catch: all -> 0x00d4, TryCatch #3 {, blocks: (B:20:0x005f, B:24:0x0088, B:28:0x00c0, B:31:0x00c4, B:32:0x00c7, B:42:0x00da, B:44:0x00e0, B:45:0x00f2, B:48:0x011a, B:50:0x0122, B:53:0x012a, B:56:0x0132, B:58:0x0148, B:60:0x014e, B:61:0x0151, B:63:0x0157, B:64:0x015e, B:65:0x015f, B:66:0x0213, B:78:0x0215, B:79:0x024a), top: B:19:0x005f, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f A[Catch: all -> 0x00d4, TryCatch #3 {, blocks: (B:20:0x005f, B:24:0x0088, B:28:0x00c0, B:31:0x00c4, B:32:0x00c7, B:42:0x00da, B:44:0x00e0, B:45:0x00f2, B:48:0x011a, B:50:0x0122, B:53:0x012a, B:56:0x0132, B:58:0x0148, B:60:0x014e, B:61:0x0151, B:63:0x0157, B:64:0x015e, B:65:0x015f, B:66:0x0213, B:78:0x0215, B:79:0x024a), top: B:19:0x005f, inners: #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q2(com.voxdon.xplorer.file.C3596o r18, com.voxdon.xplorer.file.AbstractC3595n r19, long r20) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.J.q2(com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n, long):java.lang.String");
    }

    static void r2(C3596o c3596o, String str, String str2, String str3) {
        try {
            List<AbstractC3595n> f0 = c3596o.f0(c3596o.z(str));
            if (f0 == null) {
                return;
            }
            Iterator<AbstractC3595n> it = f0.iterator();
            while (it.hasNext()) {
                C3605y c3605y = (C3605y) it.next();
                if (!c3605y.isDirectory() && e2(c3605y)) {
                    try {
                        synchronized (z) {
                            try {
                                c o2 = o2(c3605y, c3605y.B0());
                                String str4 = o2.c;
                                if (str4 != null) {
                                    if (!d0.B(str4)) {
                                        ax.Ha.c.h().f().b("!! INVALID RECYCLED FILE PATH !!").g("path : " + o2.c).h();
                                    } else if (d0.I(str2, o2.c)) {
                                        String P = d0.P(str3, d0.n(str2, o2.c));
                                        c3596o.P(c3605y);
                                        t2(c3596o, c3605y, o2.b, P);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (C1495j e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (C1495j e2) {
            ax.Ha.c.h().d("CANT GET RECYCLE BIN INDEX DIR").g(e2.getMessage()).h();
            e2.printStackTrace();
        }
    }

    public static void s2(C3596o c3596o, K k, j.f fVar, InterfaceC3185c interfaceC3185c) throws C1495j, C1486a {
        C3596o c3596o2;
        AbstractC3595n z2 = c3596o.z(k.B1());
        AbstractC3595n z3 = c3596o.z(k.A1());
        AbstractC3595n z4 = c3596o.z(k.z1());
        if (!z2.n()) {
            c3596o.P(z4);
            throw new C1495j("Recycled file does not exist");
        }
        if (z3.n()) {
            if (fVar == j.f.RENAME) {
                z3 = c3596o.X(z3, false);
            } else if (fVar != j.f.OVERWRITE) {
                throw new C1491f(z3.isDirectory() != z2.isDirectory());
            }
        }
        AbstractC3595n abstractC3595n = z3;
        AbstractC3595n z5 = c3596o.z(abstractC3595n.T());
        if (!z5.n() && !c3596o.k(z5, true)) {
            throw new C1495j("Create parent failed");
        }
        boolean isDirectory = k.isDirectory();
        if (isDirectory) {
            p2(c3596o, z2, abstractC3595n, interfaceC3185c, null);
            c3596o2 = c3596o;
        } else {
            c3596o2 = c3596o;
            c3596o2.h0(z2, c3596o, abstractC3595n, true, interfaceC3185c, null);
        }
        synchronized (z) {
            c3596o2.P(z4);
        }
        if (!isDirectory || c3596o2.B(k)) {
            return;
        }
        r2(c3596o2, b2(Y1(k)), k.B1(), k.A1());
    }

    private static void t2(C3596o c3596o, AbstractC3595n abstractC3595n, String str, String str2) throws C1495j {
        try {
            ((C3604x) c3596o.u()).D(abstractC3595n, ax.c3.F.e(("1\n" + str + "\n" + str2).getBytes(Charset.forName("UTF-8"))), "text/plain", r13.length, null, null, true, null, null);
        } catch (C1486a unused) {
        }
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        AbstractC3595n z2 = z(str2);
        if (!e2(z2)) {
            return super.A(str, str2, str3);
        }
        try {
            K c2 = c2(z2);
            String B1 = c2.B1();
            String f = d0.f(c2.A1());
            String f2 = C1833v.f(f);
            if (f2 == null) {
                f2 = "application/octet-stream";
            }
            return d1(B1, f, f2);
        } catch (C1495j unused) {
            return C2945b.n();
        }
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!d0.E(abstractC3595n)) {
            return super.C(abstractC3595n, fVar);
        }
        ArrayList arrayList = new ArrayList();
        if (t() != 0) {
            n2(arrayList, ax.T2.h.q(t()));
            return arrayList;
        }
        n2(arrayList, ax.c3.K.e);
        if (ax.Z2.j.F().t0()) {
            try {
                n2(arrayList, ax.c3.K.f);
                return arrayList;
            } catch (IllegalArgumentException e) {
                ax.Q2.d.c("recyclebin sdcard root", e);
            }
        }
        return arrayList;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        AbstractC3595n z2 = z(str2);
        if (!e2(z2)) {
            return super.G(str, str2);
        }
        try {
            K c2 = c2(z2);
            String B1 = c2.B1();
            String f = C1833v.f(d0.f(c2.A1()));
            if (f == null) {
                f = "application/octet-stream";
            }
            return c1(str, B1, f);
        } catch (C1495j unused) {
            return -1;
        }
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return null;
        }
        return g2(abstractC3595n) ? C1809B.X(abstractC3595n) : C1809B.W(abstractC3595n);
    }

    public K c2(AbstractC3595n abstractC3595n) throws C1495j {
        K k;
        if (!e2(abstractC3595n)) {
            throw new C1495j("invalid recycle bin index path");
        }
        synchronized (z) {
            k = new K(this, (C3605y) abstractC3595n, null, true);
        }
        return k;
    }

    public K d2(String str) throws C1495j {
        return c2(z(str));
    }
}
