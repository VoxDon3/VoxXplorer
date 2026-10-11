package com.voxdon.xplorer.file;

import android.annotation.SuppressLint;
import android.os.Environment;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.r3.C2945b;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/* renamed from: com.voxdon.xplorer.file.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3601u extends C3604x {
    private static final Logger B = Logger.getLogger("FileManager.LibraryFileHelper");
    static SimpleDateFormat C = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
    private static final Map<EnumC1837z, a> D;
    private HashSet<AbstractC3595n> A;
    private EnumC1837z z;

    /* renamed from: com.voxdon.xplorer.file.u$a */
    static class a implements FilenameFilter {
        EnumC1837z q;

        public a(EnumC1837z enumC1837z) {
            this.q = enumC1837z;
        }

        @Override // java.io.FilenameFilter
        @SuppressLint({"DefaultLocale"})
        public boolean accept(File file, String str) {
            return b(str);
        }

        public boolean b(String str) {
            if (d0.A(str)) {
                return C1808A.y(d0.j(str), this.q);
            }
            return false;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        D = hashMap;
        EnumC1837z enumC1837z = EnumC1837z.IMAGE;
        hashMap.put(enumC1837z, new a(enumC1837z));
        EnumC1837z enumC1837z2 = EnumC1837z.VIDEO;
        hashMap.put(enumC1837z2, new a(enumC1837z2));
        EnumC1837z enumC1837z3 = EnumC1837z.AUDIO;
        hashMap.put(enumC1837z3, new a(enumC1837z3));
        EnumC1837z enumC1837z4 = EnumC1837z.TEXT;
        hashMap.put(enumC1837z4, new a(enumC1837z4));
        EnumC1837z enumC1837z5 = EnumC1837z.PRESENTATION;
        hashMap.put(enumC1837z5, new a(enumC1837z5));
        EnumC1837z enumC1837z6 = EnumC1837z.SPREADSHEET;
        hashMap.put(enumC1837z6, new a(enumC1837z6));
        EnumC1837z enumC1837z7 = EnumC1837z.ARCHIVE;
        hashMap.put(enumC1837z7, new a(enumC1837z7));
        EnumC1837z enumC1837z8 = EnumC1837z.GROUP_DOCUMENT;
        hashMap.put(enumC1837z8, new a(enumC1837z8));
    }

    public static void V1(AbstractC3594m abstractC3594m, AbstractC3595n abstractC3595n) throws C1495j {
        AbstractC3595n z = abstractC3594m.z(abstractC3594m.x());
        List<AbstractC3595n> g = ax.Z2.b.k().g(z);
        if (g != null) {
            ArrayList arrayList = new ArrayList(g);
            if (arrayList.remove(abstractC3595n)) {
                ax.Z2.b.k().m(z, arrayList);
            }
        }
    }

    private void W1(AbstractC3595n abstractC3595n) {
        HashSet<AbstractC3595n> hashSet = this.A;
        if (hashSet != null) {
            Iterator<AbstractC3595n> it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC3595n next = it.next();
                if (next != null && next.E().equals(abstractC3595n.E())) {
                    it.remove();
                }
            }
        }
    }

    private AbstractC3595n Z1(AbstractC3595n abstractC3595n) {
        a aVar = D.get(Y1());
        C3602v c3602v = (C3602v) abstractC3595n;
        String F1 = c3602v.F1();
        ax.c3.K B0 = c3602v.B0();
        if (F1 != null) {
            File file = new File(c3602v.F0(), F1);
            if (file.exists()) {
                return new C3602v(this, file, aVar, B0);
            }
        }
        B.fine("WARN : GetFirstFileInfoFromDirectory ListFiles");
        return f2(c3602v);
    }

    private C3602v a2(String str) {
        List<AbstractC3595n> g = ax.Z2.b.k().g((C3602v) z(x()));
        if (g == null) {
            return null;
        }
        for (AbstractC3595n abstractC3595n : g) {
            if (abstractC3595n.E().equals(str)) {
                return (C3602v) abstractC3595n;
            }
        }
        return null;
    }

    private AbstractC3595n b2(AbstractC3595n abstractC3595n) {
        a aVar = D.get(EnumC1837z.IMAGE);
        C3602v c3602v = (C3602v) abstractC3595n;
        File[] listFiles = c3602v.F0().listFiles(aVar);
        if (listFiles.length > 0) {
            return new C3602v(this, listFiles[0], aVar, c3602v.B0());
        }
        return null;
    }

    public static String c2(ax.Q2.f fVar) {
        File file;
        if (fVar == ax.Q2.f.A0) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
        } else if (fVar == ax.Q2.f.B0) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        } else if (fVar == ax.Q2.f.z0) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        } else if (fVar == ax.Q2.f.C0) {
            file = ax.X2.Q.H0() ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) : new File(ax.X2.K.y(), "Documents");
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            ax.Ha.c.h().d("UNKNOWN LIBRARY LOCATION!!!!!!").g(fVar.I()).h();
            file = externalStorageDirectory;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private void d2(String str) {
        C3602v a2 = a2(str);
        if (a2 != null) {
            a2.d0(-3);
        }
    }

    private synchronized boolean e2(AbstractC3595n abstractC3595n) {
        HashSet<AbstractC3595n> hashSet = this.A;
        boolean z = false;
        if (hashSet == null) {
            return false;
        }
        Iterator<AbstractC3595n> it = hashSet.iterator();
        while (it.hasNext()) {
            if (abstractC3595n.E().equals(it.next().E())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        if (str == null || !C1809B.I(str)) {
            return super.A(str, str2, str3);
        }
        C3602v a2 = a2(str2);
        if (a2 == null) {
            a2 = (C3602v) z(str2);
        }
        AbstractC3595n X1 = X1(a2);
        return X1 != null ? super.A(str, X1.E(), str3) : C2945b.n();
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        C3602v c3602v = (C3602v) abstractC3595n;
        ArrayList arrayList = new ArrayList();
        if (!d0.E(abstractC3595n)) {
            List<AbstractC3595n> C2 = super.C(c3602v, fVar);
            if (C2 != null) {
                a C1 = c3602v.C1();
                for (AbstractC3595n abstractC3595n2 : C2) {
                    if (C1 == null || C1.b(abstractC3595n2.B())) {
                        arrayList.add(new C3602v(this, (C3605y) abstractC3595n2, C1));
                    }
                }
            }
        } else {
            if (ax.Z2.b.k().f(abstractC3595n)) {
                return g2(abstractC3595n, ax.Z2.b.k().g(abstractC3595n), false);
            }
            try {
                C3603w.C(p(), null).l();
                return ax.Z2.b.k().g(abstractC3595n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        super.D(abstractC3595n, g, str, j, l, c3597p, z, interfaceC3185c, iVar);
        d2(abstractC3595n.T());
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        AbstractC3595n z;
        List<AbstractC3595n> g;
        super.E(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
        if (T1(abstractC3595n) && (g = ax.Z2.b.k().g((z = z(x())))) != null && g.contains(abstractC3595n)) {
            ArrayList arrayList = new ArrayList(g);
            arrayList.remove(abstractC3595n);
            boolean e2 = e2(abstractC3595n);
            if (!J.j2(abstractC3595n2)) {
                AbstractC3595n z2 = z(abstractC3595n2.E());
                arrayList.add(z2);
                if (e2 && abstractC3595n.T().equals(abstractC3595n2.T())) {
                    U1(z2);
                }
            }
            ax.Z2.b.k().m(z, arrayList);
        }
        if (abstractC3595n.T().equals(abstractC3595n2.T())) {
            return;
        }
        d2(abstractC3595n.T());
        d2(abstractC3595n2.T());
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        super.F(abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        if (str == null || !C1809B.I(str)) {
            return super.G(str, str2);
        }
        C3602v a2 = a2(str2);
        if (a2 == null) {
            a2 = (C3602v) z(str2);
        }
        AbstractC3595n X1 = X1(a2);
        if (X1 != null) {
            return super.G(str, X1.E());
        }
        return 0;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (ax.Q2.f.m0(u()) || ((ax.X2.Q.r1() && EnumC1837z.PDF == abstractC3595n.G()) || "epub".equals(abstractC3595n.A()))) {
            return abstractC3595n.isDirectory() ? C1809B.T(abstractC3595n) : C1809B.W(abstractC3595n);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.C3604x
    protected void I0(AbstractC3595n abstractC3595n, List<AbstractC3595n> list, boolean z, String str, boolean z2, ax.g3.h hVar) {
        List<AbstractC3595n> h = C1809B.h(list, str, z2, true);
        if (h == null) {
            return;
        }
        if (abstractC3595n instanceof C3602v) {
            a C1 = ((C3602v) abstractC3595n).C1();
            if (C1 != null) {
                Iterator<AbstractC3595n> it = h.iterator();
                while (it.hasNext()) {
                    if (!C1.b(it.next().B())) {
                        it.remove();
                    }
                }
            }
        } else {
            C3184b.f();
        }
        hVar.Y(h, z);
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        boolean M = super.M(abstractC3595n);
        if (M) {
            U1(abstractC3595n);
        }
        return M;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        if (abstractC3595n.isDirectory()) {
            if (b0(abstractC3595n).size() == 0) {
                V1(this, abstractC3595n);
                W1(abstractC3595n);
            }
            if ((abstractC3595n instanceof C3605y) && abstractC3595n.E().equals(((C3605y) abstractC3595n).B0().e())) {
                return;
            }
        } else {
            d2(abstractC3595n.T());
        }
        super.P(abstractC3595n);
    }

    protected boolean T1(AbstractC3595n abstractC3595n) {
        return abstractC3595n.isDirectory();
    }

    public synchronized void U1(AbstractC3595n abstractC3595n) {
        try {
            String T = abstractC3595n.T();
            if (T != null && T.equals(c2(u()))) {
                if (this.A == null) {
                    this.A = new HashSet<>();
                }
                if (!AbstractC3594m.k(this.A, abstractC3595n)) {
                    this.A.add(z(abstractC3595n.E()));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public AbstractC3595n X1(AbstractC3595n abstractC3595n) {
        File file = new File(((C3605y) abstractC3595n).F0(), ".folderimage");
        if (file.exists() && !file.isDirectory()) {
            return new C3602v(this, file, D.get(EnumC1837z.IMAGE), ((C3602v) abstractC3595n).B0());
        }
        AbstractC3595n Z1 = Z1(abstractC3595n);
        if (u() == ax.Q2.f.A0 && Z1 != null) {
            InputStream K0 = K0(Z1.E());
            if (K0 == null) {
                return b2(abstractC3595n);
            }
            try {
                K0.close();
            } catch (IOException unused) {
            }
        }
        return Z1;
    }

    public EnumC1837z Y1() {
        if (this.z == null) {
            this.z = C1808A.h(u());
        }
        return this.z;
    }

    public AbstractC3595n f2(C3602v c3602v) {
        AbstractC3595n abstractC3595n;
        try {
            List<AbstractC3595n> b0 = b0(c3602v);
            long j = 0;
            if (b0 != null) {
                abstractC3595n = null;
                for (AbstractC3595n abstractC3595n2 : b0) {
                    if (!abstractC3595n2.h()) {
                        if (abstractC3595n == null) {
                            j = abstractC3595n2.q();
                            abstractC3595n = abstractC3595n2;
                        } else {
                            long q = abstractC3595n2.q();
                            if (q > j) {
                                abstractC3595n = abstractC3595n2;
                                j = q;
                            }
                        }
                    }
                }
                c3602v.d0(b0.size());
            } else {
                abstractC3595n = null;
            }
            if (abstractC3595n != null) {
                c3602v.I1(abstractC3595n.B());
                c3602v.H1(j);
                return abstractC3595n;
            }
        } catch (C1495j unused) {
        }
        return null;
    }

    public List<AbstractC3595n> g2(AbstractC3595n abstractC3595n, List<AbstractC3595n> list, boolean z) {
        if (list == null) {
            return null;
        }
        if (d0.E(abstractC3595n) && this.A != null) {
            ArrayList arrayList = new ArrayList(list);
            Iterator<AbstractC3595n> it = this.A.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                AbstractC3595n next = it.next();
                if (next.n() && !AbstractC3594m.k(list, next)) {
                    arrayList.add(next);
                    z2 = true;
                }
            }
            if (z2) {
                ax.Z2.b.k().m(abstractC3595n, arrayList);
                list = arrayList;
            }
        }
        if (z) {
            Iterator<AbstractC3595n> it2 = list.iterator();
            while (it2.hasNext()) {
                C3602v c3602v = (C3602v) it2.next();
                if (c3602v.q0()) {
                    f2(c3602v);
                }
            }
        }
        return list;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) {
        return new C3602v(this, new File(str), D.get(Y1()), null);
    }

    @Override // com.voxdon.xplorer.file.C3604x
    public C3605y z0(File file, ax.c3.K k, boolean z) {
        return z ? new C3602v(this, new C3605y(this, file, k, true), D.get(Y1())) : new C3602v(this, file, D.get(Y1()), k);
    }
}
