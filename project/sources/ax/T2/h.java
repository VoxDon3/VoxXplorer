package ax.T2;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import ax.T2.l;
import ax.X2.Q;
import ax.b3.C1486a;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1829q;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.k0;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class h {
    private static final Logger p = ax.Q2.g.a(h.class);
    private static HashMap<K, h> q = new HashMap<>();
    final K a;
    boolean b;
    f c;
    i d;
    boolean f;
    private CountDownLatch j;
    private Set<String> k;
    private boolean l;
    private ArrayList<g> g = new ArrayList<>();
    final Object h = new Object();
    final Object i = new Object();
    final AtomicInteger m = new AtomicInteger(0);
    private boolean n = false;
    Comparator<C0194h> o = new a();
    boolean e = false;

    class a implements Comparator<C0194h> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0194h c0194h, C0194h c0194h2) {
            return Long.valueOf(c0194h2.b).compareTo(Long.valueOf(c0194h.b));
        }
    }

    class b implements l.a {
        b() {
        }

        @Override // ax.T2.l.a
        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                h.this.v(HttpUrl.FRAGMENT_ENCODE_SET, true);
            } else {
                h.this.v(d0.h(str), true);
            }
        }
    }

    class c implements Comparator<AbstractC3595n> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            return abstractC3595n.E().compareTo(abstractC3595n2.E());
        }
    }

    class d implements Comparator<AbstractC3595n> {
        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            return abstractC3595n2.E().compareTo(abstractC3595n.E());
        }
    }

    public static class e {
        public String a;
        public AbstractC3595n b;
        public boolean c = false;
        public long d = 0;
        public long e = 0;
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public long i = 0;
        public long j = 0;
        public boolean k = false;
        public long l = 0;
        public long m = 0;
    }

    public static class f {
        C3605y a;
        k0 c;
        j m;
        j n;
        long b = 0;
        HashMap<String, Long> d = new HashMap<>();
        HashMap<EnumC1837z, Long> e = new HashMap<>();
        ArrayList<C0194h> f = new ArrayList<>();
        ArrayList<C0194h> g = new ArrayList<>();
        ArrayList<C0194h> h = new ArrayList<>();
        ArrayList<C0194h> i = new ArrayList<>();
        List<ax.U2.f> j = new ArrayList();
        List<ax.U2.f> k = new ArrayList();
        List<ax.U2.f> l = new ArrayList();
        long o = 0;
        long p = 0;
        long q = 0;
        long r = 0;
        long s = 0;
        long t = 0;
        long u = 0;
        long v = 0;
        boolean w = false;
        long x = 0;
    }

    public interface g {
        void a();

        void b();

        void c(String str, boolean z);

        void d(int i);
    }

    /* renamed from: ax.T2.h$h, reason: collision with other inner class name */
    public static class C0194h {
        String a;
        long b;
        boolean c;

        C0194h(String str, long j, boolean z) {
            this.a = str;
            this.b = j;
            this.c = z;
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }

    static class i {
        ArrayList<C0194h> a = new ArrayList<>();
        long b = 0;

        i() {
        }
    }

    h(K k) {
        this.a = k;
        this.l = ax.Q2.f.x0(k.d());
    }

    static File A(Context context, K k) {
        String str;
        File q2 = ax.Q2.e.q(context);
        if (k.b() == 0) {
            str = "analysis_" + k.d().I();
        } else {
            str = "analysis_" + k.d().I() + ":" + k.b();
        }
        return new File(q2.getAbsolutePath(), str);
    }

    public static K B(K k) {
        return K.a(ax.Q2.f.i1, r(k));
    }

    public static boolean C0(int i2) {
        return i2 == 0;
    }

    private void D0(C3596o c3596o, f fVar, e eVar) throws C1495j {
        List<AbstractC3595n> list;
        String e0 = e0(eVar.a, true);
        E0(fVar, e0, eVar.d);
        long j = eVar.d;
        if (j > 52428800) {
            fVar.f.add(new C0194h(e0, j, true));
            fVar.p += eVar.d;
        }
        if (ax.U2.d.Q(e0)) {
            fVar.h.add(new C0194h(e0, 0L, true));
        }
        long j2 = eVar.e;
        if (j2 > 0) {
            e(fVar.e, EnumC1837z.IMAGE, j2);
        }
        long j3 = eVar.f;
        if (j3 > 0) {
            e(fVar.e, EnumC1837z.AUDIO, j3);
        }
        long j4 = eVar.g;
        if (j4 > 0) {
            e(fVar.e, EnumC1837z.VIDEO, j4);
        }
        long j5 = eVar.h;
        if (j5 > 0) {
            e(fVar.e, EnumC1837z.GROUP_DOCUMENT, j5);
        }
        long j6 = eVar.i;
        if (j6 > 0) {
            e(fVar.e, EnumC1837z.ARCHIVE, j6);
        }
        long j7 = eVar.j;
        if (j7 > 0) {
            e(fVar.e, EnumC1837z.OTHERS, j7);
        }
        if (eVar.k) {
            if (eVar.b == null) {
                eVar.b = c3596o.z(eVar.a);
            }
            if (!eVar.b.isDirectory()) {
                ".android_secure".equals(eVar.b.B());
                return;
            }
            try {
                list = z0(c3596o, eVar.b);
            } catch (C1490e unused) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC3595n abstractC3595n : list) {
                    if (!abstractC3595n.isDirectory()) {
                        arrayList.add(abstractC3595n);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    AbstractC3595n abstractC3595n2 = (AbstractC3595n) obj;
                    long p2 = abstractC3595n2.p();
                    if (p2 > 10485760) {
                        fVar.g.add(new C0194h(e0(abstractC3595n2.E(), false), p2, false));
                        fVar.o += p2;
                    }
                }
            }
        }
    }

    private void E0(f fVar, String str, long j) {
        while (true) {
            Long l = fVar.d.get(str);
            if (l != null) {
                fVar.d.put(str, Long.valueOf(l.longValue() + j));
            } else {
                fVar.d.put(str, Long.valueOf(j));
            }
            if ("/".equals(str)) {
                return;
            } else {
                str = d0.r(str);
            }
        }
    }

    private void K0(C3596o c3596o, f fVar, String str, String[] strArr) throws C1495j {
        String[] split = strArr[2].split("/");
        e eVar = new e();
        eVar.d = Long.valueOf(split[0]).longValue();
        eVar.e = Long.valueOf(split[1]).longValue();
        eVar.f = Long.valueOf(split[2]).longValue();
        eVar.g = Long.valueOf(split[3]).longValue();
        eVar.h = Long.valueOf(split[4]).longValue();
        eVar.i = Long.valueOf(split[5]).longValue();
        eVar.j = Long.valueOf(split[6]).longValue();
        eVar.k = Boolean.valueOf(split[7]).booleanValue();
        eVar.l = Long.valueOf(split[8]).longValue();
        eVar.m = Long.valueOf(split[9]).longValue();
        eVar.c = false;
        eVar.b = null;
        eVar.a = str;
        D0(c3596o, fVar, eVar);
    }

    private void M0(List<C0194h> list) {
        Collections.sort(list, this.o);
    }

    private void Q0(C3596o c3596o, f fVar, AbstractC3595n abstractC3595n, List<AbstractC3595n> list, Writer writer, boolean z) throws IOException {
        String d0 = d0(abstractC3595n);
        e eVar = new e();
        eVar.b = abstractC3595n;
        eVar.a = abstractC3595n.E();
        if (z) {
            eVar.m = 1L;
        } else {
            eVar.m = abstractC3595n.q();
        }
        for (AbstractC3595n abstractC3595n2 : list) {
            try {
                long p2 = abstractC3595n2.p();
                EnumC1837z g2 = C1808A.g(d0.f(abstractC3595n2.B()));
                EnumC1837z i2 = C1808A.i(g2);
                eVar.d += p2;
                if (EnumC1837z.GROUP_DOCUMENT == i2) {
                    eVar.h += p2;
                } else if (EnumC1837z.IMAGE == g2) {
                    eVar.e += p2;
                } else if (EnumC1837z.AUDIO == g2) {
                    eVar.f += p2;
                } else if (EnumC1837z.VIDEO == g2) {
                    eVar.g += p2;
                } else if (EnumC1837z.ARCHIVE == g2) {
                    eVar.i += p2;
                } else {
                    eVar.j += p2;
                }
                e(fVar.e, g2, p2);
                if (p2 > 10485760) {
                    eVar.k = true;
                    eVar.l += p2;
                    fVar.g.add(new C0194h(e0(abstractC3595n2.E(), false), p2, false));
                    fVar.o += p2;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Uri.encode(abstractC3595n.E()));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(eVar.m));
        stringBuffer.append("\u0000");
        stringBuffer.append(eVar.d);
        stringBuffer.append("/");
        stringBuffer.append(eVar.e);
        stringBuffer.append("/");
        stringBuffer.append(eVar.f);
        stringBuffer.append("/");
        stringBuffer.append(eVar.g);
        stringBuffer.append("/");
        stringBuffer.append(eVar.h);
        stringBuffer.append("/");
        stringBuffer.append(eVar.i);
        stringBuffer.append("/");
        stringBuffer.append(eVar.j);
        stringBuffer.append("/");
        stringBuffer.append(eVar.k);
        stringBuffer.append("/");
        stringBuffer.append(eVar.l);
        stringBuffer.append("/");
        stringBuffer.append(eVar.m);
        eVar.c = true;
        if (ax.U2.d.Q(d0)) {
            fVar.h.add(new C0194h(d0, 0L, true));
        }
        long j = eVar.d;
        if (j > 52428800) {
            fVar.f.add(new C0194h(d0, j, true));
            fVar.p += eVar.d;
        }
        E0(fVar, d0, eVar.d);
        stringBuffer.append("\n");
        if (writer != null) {
            writer.write(stringBuffer.toString());
        }
        v(d0, false);
    }

    public static h S(K k) {
        h hVar = q.get(k);
        if (hVar != null) {
            return hVar;
        }
        C3184b.c(ax.Q2.f.U(k.d()));
        h hVar2 = new h(k);
        q.put(k, hVar2);
        return hVar2;
    }

    public static h T(AbstractC3595n abstractC3595n) {
        K R = abstractC3595n.R();
        if (ax.Q2.f.U(R.d())) {
            return S(R);
        }
        if (ax.Q2.f.S(R.d())) {
            return S(q(abstractC3595n.L()));
        }
        C3184b.g("NOT REACHABLE : invalid fileinfo");
        return null;
    }

    public static h a0() {
        K a2 = K.a(ax.Q2.f.o1, 0);
        h hVar = q.get(a2);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(a2);
        q.put(a2, hVar2);
        return hVar2;
    }

    public static K b0(K k) {
        return K.a(ax.Q2.f.o1, r(k));
    }

    private void d(HashMap<EnumC1837z, Long> hashMap, String str, long j) {
        EnumC1837z g2 = C1808A.g(str);
        if (g2 == null) {
            g2 = EnumC1837z.OTHERS;
        }
        Long l = hashMap.get(g2);
        if (l != null) {
            hashMap.put(g2, Long.valueOf(l.longValue() + j));
        } else {
            hashMap.put(g2, Long.valueOf(j));
        }
    }

    private String d0(AbstractC3595n abstractC3595n) {
        return d0.v(this.a, abstractC3595n.E(), Boolean.valueOf(abstractC3595n.isDirectory()));
    }

    private void e(HashMap<EnumC1837z, Long> hashMap, EnumC1837z enumC1837z, long j) {
        if (enumC1837z == null) {
            enumC1837z = EnumC1837z.OTHERS;
        }
        Long l = hashMap.get(enumC1837z);
        if (l != null) {
            hashMap.put(enumC1837z, Long.valueOf(l.longValue() + j));
        } else {
            hashMap.put(enumC1837z, Long.valueOf(j));
        }
    }

    private String e0(String str, boolean z) {
        return d0.v(this.a, str, Boolean.valueOf(z));
    }

    private void g(Context context, f fVar, K k) {
        UUID uuidForPath;
        UUID uuid;
        long j;
        long j2;
        long j3;
        StorageStats queryStatsForPackage;
        long appBytes;
        long cacheBytes;
        long dataBytes;
        if (k.e() == null) {
            return;
        }
        List<ax.U2.f> B = ax.U2.d.F(context).B();
        try {
            uuidForPath = ((StorageManager) context.getSystemService("storage")).getUuidForPath(new File(k.e()));
            Iterator<ax.U2.f> it = B.iterator();
            while (it.hasNext()) {
                if (it.next().F()) {
                    it.remove();
                }
            }
            uuid = StorageManager.UUID_DEFAULT;
            long j4 = 0;
            if (uuid.equals(uuidForPath)) {
                ax.U2.d.F(context).i(B, true);
                j = 0;
                j2 = 0;
                j3 = 0;
                for (ax.U2.f fVar2 : B) {
                    if (fVar2.z()) {
                        j4 += fVar2.u();
                        j += fVar2.v();
                        j2 += fVar2.w();
                        j3 += fVar2.e();
                    } else {
                        j4 += fVar2.b();
                    }
                }
            } else {
                StorageStatsManager a2 = ax.T2.c.a(context.getSystemService("storagestats"));
                UserHandle myUserHandle = Process.myUserHandle();
                Iterator<ax.U2.f> it2 = B.iterator();
                long j5 = 0;
                long j6 = 0;
                long j7 = 0;
                while (it2.hasNext()) {
                    try {
                        queryStatsForPackage = a2.queryStatsForPackage(uuidForPath, it2.next().r(), myUserHandle);
                        appBytes = queryStatsForPackage.getAppBytes();
                        j6 += appBytes;
                        cacheBytes = queryStatsForPackage.getCacheBytes();
                        j5 += cacheBytes;
                        dataBytes = queryStatsForPackage.getDataBytes();
                        j7 += dataBytes;
                    } catch (PackageManager.NameNotFoundException | IOException | SecurityException e2) {
                        e2.printStackTrace();
                    }
                }
                j = j5;
                j2 = j7;
                j3 = 0;
                j4 = j6;
            }
            Comparator<ax.U2.f> d2 = ax.U2.f.d("SizeDown");
            if (d2 != null) {
                try {
                    Collections.sort(B, d2);
                    fVar.j = B;
                } catch (IllegalArgumentException unused) {
                }
            }
            fVar.s = j4;
            fVar.t = j;
            fVar.u = j2;
            fVar.v = j3;
            if (Q.V0()) {
                ArrayList arrayList = new ArrayList(B);
                Comparator<ax.U2.f> d3 = ax.U2.f.d("ExternalCacheSizeDown");
                if (d3 != null) {
                    Collections.sort(arrayList, d3);
                    fVar.l = arrayList;
                }
            }
        } catch (IOException | IllegalArgumentException unused2) {
        }
    }

    private long g0() {
        return Long.MAX_VALUE;
    }

    private void h(i iVar, K k) throws C1495j {
        K b0 = b0(k);
        C3596o e2 = C1835x.e(b0);
        long j = 0;
        int i2 = 0;
        for (AbstractC3595n abstractC3595n : C1829q.g(e2.f0(e2.z(b0.e())), C1829q.c("DateDownNoSeparate"))) {
            long p2 = abstractC3595n.p();
            j += p2;
            int i3 = i2 + 1;
            if (i2 < 5) {
                iVar.a.add(new C0194h(d0.Q(d0.s(abstractC3595n), abstractC3595n.B()), p2, abstractC3595n.isDirectory()));
            }
            i2 = i3;
        }
        iVar.b = j;
    }

    private void j(C3596o c3596o, f fVar, InterfaceC3185c interfaceC3185c) throws C1486a {
        File A = A(c3596o.t(), this.a);
        try {
            p0(c3596o, fVar, A, interfaceC3185c);
        } catch (C1486a e2) {
            A.delete();
            throw e2;
        } catch (C1495j e3) {
            e = e3;
            e.printStackTrace();
            p.severe("Retry Incremental Scan.");
            try {
                A.delete();
                p0(c3596o, fVar, A, interfaceC3185c);
            } catch (C1486a e4) {
                A.delete();
                throw e4;
            } catch (C1495j e5) {
                e = e5;
                p.severe("Incremental Analysis Failed.");
                e.printStackTrace();
            } catch (IOException e6) {
                e = e6;
                p.severe("Incremental Analysis Failed.");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e7) {
                p.severe("Incremental Scan Failed.");
                e7.printStackTrace();
                ax.Ha.c.h().d("ANALYSIS OOB").l(e7).g(this.a.toString()).h();
            }
        } catch (IOException e8) {
            e = e8;
            e.printStackTrace();
            p.severe("Retry Incremental Scan.");
            A.delete();
            p0(c3596o, fVar, A, interfaceC3185c);
        } catch (NumberFormatException e9) {
            e9.printStackTrace();
            ax.Ha.c.h().d("ANALYSIS3").l(e9).g("location:" + this.a.toString()).h();
            p.severe("Retry Incremental Scan.");
            A.delete();
            p0(c3596o, fVar, A, interfaceC3185c);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            ax.Ha.c.h().d("ANALYSIS4").l(e10).g("location:" + this.a.toString()).h();
            p.severe("Retry Incremental Scan.");
            A.delete();
            p0(c3596o, fVar, A, interfaceC3185c);
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
            if (TextUtils.isEmpty(e11.getMessage())) {
                ax.Ha.c.h().d("ANALYSIS2:").l(e11).g("location:" + this.a.toString()).h();
            } else {
                ax.Ha.c.h().d("ANALYSIS2-2").g(e11.getMessage()).h();
            }
            p.severe("Retry Incremental Scan.");
            A.delete();
            p0(c3596o, fVar, A, interfaceC3185c);
        } catch (IndexOutOfBoundsException e12) {
            e12.printStackTrace();
            ax.Ha.c.h().d("ANALYSIS1:").l(e12).g("location:" + this.a.toString()).h();
            p.severe("Retry Incremental Scan.");
            A.delete();
            p0(c3596o, fVar, A, interfaceC3185c);
        } catch (StackOverflowError e13) {
            e13.printStackTrace();
            ax.Ha.c.h().d("ANALYSIS STACK!!!").l(e13).g("location:" + this.a.toString()).h();
            p.severe("Retry Incremental Scan.");
            A.delete();
            p0(c3596o, fVar, A, interfaceC3185c);
        }
    }

    private void k(Context context, f fVar) {
        long s;
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
        List<ax.U2.f> B = ax.U2.d.F(context).B();
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(2, -5);
            Map<String, UsageStats> F0 = F0(usageStatsManager, calendar.getTimeInMillis(), System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            long j = 0;
            for (ax.U2.f fVar2 : B) {
                if (!fVar2.F()) {
                    UsageStats usageStats = F0.get(fVar2.r());
                    if (usageStats == null) {
                        arrayList.add(fVar2);
                        s = fVar2.s();
                    } else if (usageStats.getLastTimeUsed() < System.currentTimeMillis() - 5184000000L) {
                        arrayList.add(fVar2);
                        s = fVar2.s();
                    }
                    j += s;
                }
            }
            Comparator<ax.U2.f> d2 = ax.U2.f.d("SizeDown");
            if (d2 != null) {
                try {
                    Collections.sort(arrayList, d2);
                    fVar.k = arrayList;
                    fVar.x = j;
                    fVar.w = true;
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
    }

    private void l(f fVar, boolean z, C3596o c3596o, InterfaceC3185c interfaceC3185c) throws C1495j, C1486a {
        fVar.a = (C3605y) c3596o.z(c3596o.V());
        fVar.b = g0();
        fVar.c = c3596o.W();
        long currentTimeMillis = System.currentTimeMillis();
        w(R.string.analyzing_storage);
        j(c3596o, fVar, interfaceC3185c);
        if (!this.l && z) {
            w(R.string.analyzing_duplicate_files);
            l lVar = new l(c3596o.t(), X(), new b());
            lVar.e();
            ax.T2.i.a(c3596o, fVar, lVar, interfaceC3185c);
            ax.T2.i.b(c3596o, fVar, lVar, interfaceC3185c);
            lVar.g();
        }
        p.fine("AnalyzeStorage time :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: all -> 0x002e, TryCatch #2 {, blocks: (B:4:0x0005, B:5:0x0012, B:7:0x001b, B:11:0x0029, B:13:0x0036, B:16:0x003b, B:18:0x0041, B:21:0x004e, B:32:0x0054, B:24:0x005b, B:27:0x0070, B:38:0x008d, B:40:0x0099, B:41:0x00a8, B:43:0x00ae, B:45:0x00eb, B:49:0x0084, B:54:0x00b9, B:56:0x00d7, B:60:0x00f0, B:62:0x0105, B:64:0x010b, B:66:0x0113, B:69:0x0129, B:74:0x0139), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: all -> 0x002e, TryCatch #2 {, blocks: (B:4:0x0005, B:5:0x0012, B:7:0x001b, B:11:0x0029, B:13:0x0036, B:16:0x003b, B:18:0x0041, B:21:0x004e, B:32:0x0054, B:24:0x005b, B:27:0x0070, B:38:0x008d, B:40:0x0099, B:41:0x00a8, B:43:0x00ae, B:45:0x00eb, B:49:0x0084, B:54:0x00b9, B:56:0x00d7, B:60:0x00f0, B:62:0x0105, B:64:0x010b, B:66:0x0113, B:69:0x0129, B:74:0x0139), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void m(ax.T2.h.f r19, com.voxdon.xplorer.file.C3596o r20, com.voxdon.xplorer.file.AbstractC3595n r21) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T2.h.m(ax.T2.h$f, com.voxdon.xplorer.file.o, com.voxdon.xplorer.file.n):void");
    }

    public static boolean n0(K k) {
        if (ax.Q2.f.U(k.d())) {
            return S(k).k0();
        }
        return false;
    }

    private void p(C3596o c3596o, AbstractC3595n abstractC3595n, ax.Z2.i iVar) throws IOException {
        while (true) {
            String c2 = iVar.c();
            if (c2 == null || !Uri.decode(c2.split("\u0000")[0]).startsWith(abstractC3595n.E())) {
                return;
            } else {
                iVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x010f A[Catch: all -> 0x00f7, IOException -> 0x0112, TRY_LEAVE, TryCatch #5 {, blocks: (B:33:0x010a, B:25:0x010f, B:26:0x0112, B:64:0x00f3), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[Catch: all -> 0x00f7, SYNTHETIC, TRY_ENTER, TryCatch #5 {, blocks: (B:33:0x010a, B:25:0x010f, B:26:0x0112, B:64:0x00f3), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void p0(com.voxdon.xplorer.file.C3596o r11, ax.T2.h.f r12, java.io.File r13, ax.u3.InterfaceC3185c r14) throws java.io.IOException, ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T2.h.p0(com.voxdon.xplorer.file.o, ax.T2.h$f, java.io.File, ax.u3.c):void");
    }

    public static K q(int i2) {
        if (i2 == 1) {
            return K.e;
        }
        if (i2 == 2) {
            return K.f;
        }
        if (i2 < 100) {
            ax.Ha.c.h().d("INVALID LOCATION KEY").j().g(Integer.valueOf(i2)).h();
            return K.e;
        }
        K a2 = K.a(ax.Q2.f.v0, i2 - 100);
        if (!ax.Z2.j.F().B0(a2)) {
            ax.Ha.c.h().f().d("INVALID USB LOCATION KEY").j().g(Integer.valueOf(i2)).h();
        }
        return a2;
    }

    private void q0(C3596o c3596o, f fVar, AbstractC3595n abstractC3595n, BufferedWriter bufferedWriter, ax.Z2.i iVar, InterfaceC3185c interfaceC3185c) throws IOException, C1495j, C1486a {
        List<AbstractC3595n> list;
        String[] split;
        String decode;
        int compareTo;
        String c2;
        h hVar = this;
        C3596o c3596o2 = c3596o;
        ax.Z2.i iVar2 = iVar;
        if (((C3605y) abstractC3595n).w0()) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            try {
                list = hVar.z0(c3596o2, abstractC3595n);
            } catch (C1490e unused) {
                list = null;
            }
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC3595n abstractC3595n2 : list) {
                if (abstractC3595n2.isDirectory()) {
                    arrayList.add(abstractC3595n2);
                } else {
                    arrayList2.add(abstractC3595n2);
                }
            }
            Collections.sort(arrayList, hVar.new c());
            hVar.Q0(c3596o2, fVar, abstractC3595n, arrayList2, bufferedWriter, false);
            if (arrayList.size() == 0) {
                hVar.p(c3596o2, abstractC3595n, iVar2);
                return;
            }
            String c3 = iVar2.c();
            int i2 = 0;
            while (i2 < arrayList.size()) {
                AbstractC3595n abstractC3595n3 = (AbstractC3595n) arrayList.get(i2);
                String E = abstractC3595n3.E();
                if (c3 == null) {
                    compareTo = -1;
                    split = null;
                    decode = null;
                } else {
                    split = c3.split("\u0000");
                    decode = Uri.decode(split[0]);
                    compareTo = E.compareTo(decode);
                }
                if (compareTo == 0) {
                    if (Long.valueOf(split[1]).longValue() == abstractC3595n3.q()) {
                        bufferedWriter.write(c3 + "\n");
                        hVar.K0(c3596o2, fVar, decode, split);
                        iVar2.a();
                        hVar.t0(c3596o2, fVar, decode, bufferedWriter, iVar2, interfaceC3185c);
                        c2 = iVar.c();
                        i2++;
                        c3596o2 = c3596o;
                        iVar2 = iVar;
                    } else {
                        iVar.a();
                        c3596o2 = c3596o;
                        q0(c3596o2, fVar, abstractC3595n3, bufferedWriter, iVar, interfaceC3185c);
                        iVar2 = iVar;
                        c2 = iVar2.c();
                        i2++;
                    }
                    c3 = c2;
                    hVar = this;
                } else if (compareTo < 0) {
                    hVar = this;
                    c3596o2 = c3596o;
                    hVar.s0(c3596o2, fVar, abstractC3595n3, bufferedWriter, interfaceC3185c);
                    i2++;
                } else {
                    hVar = this;
                    c3596o2 = c3596o;
                    iVar2.a();
                    c3 = iVar2.c();
                }
            }
            hVar.p(c3596o2, abstractC3595n, iVar2);
        }
    }

    public static int r(K k) {
        if (K.e.equals(k)) {
            return 1;
        }
        if (K.f.equals(k)) {
            return 2;
        }
        if (k == null || ax.Q2.f.v0 != k.d()) {
            return 0;
        }
        return k.b() + 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r0(com.voxdon.xplorer.file.C3596o r10, ax.T2.h.f r11, java.util.Stack<com.voxdon.xplorer.file.AbstractC3595n> r12, java.io.Writer r13) throws java.io.IOException, ax.b3.C1495j {
        /*
            r9 = this;
            java.lang.Object r0 = r12.pop()
            r4 = r0
            com.voxdon.xplorer.file.n r4 = (com.voxdon.xplorer.file.AbstractC3595n) r4
            boolean r0 = com.voxdon.xplorer.file.J.j2(r4)
            if (r0 == 0) goto L10
        Ld:
            r1 = r9
            goto L8a
        L10:
            boolean r0 = r9.x0(r4)
            if (r0 == 0) goto L17
            goto Ld
        L17:
            boolean r0 = r4.n()
            if (r0 == 0) goto L33
            java.util.List r0 = r9.z0(r10, r4)     // Catch: java.lang.OutOfMemoryError -> L22 ax.b3.C1490e -> L33
            goto L34
        L22:
            ax.Ha.b r0 = ax.Ha.c.h()
            ax.Ha.b r0 = r0.f()
            java.lang.String r1 = "Analysis: listFiles OUT OF MEMORY"
            ax.Ha.b r0 = r0.d(r1)
            r0.h()
        L33:
            r0 = 0
        L34:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r0 != 0) goto L49
            r7 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r1.Q0(r2, r3, r4, r5, r6, r7)
            return
        L49:
            r2 = r10
            r3 = r11
            r6 = r13
            java.util.Iterator r10 = r0.iterator()
        L50:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L6a
            java.lang.Object r11 = r10.next()
            com.voxdon.xplorer.file.n r11 = (com.voxdon.xplorer.file.AbstractC3595n) r11
            boolean r13 = r11.isDirectory()
            if (r13 == 0) goto L66
            r8.add(r11)
            goto L50
        L66:
            r5.add(r11)
            goto L50
        L6a:
            r7 = 0
            r1 = r9
            r1.Q0(r2, r3, r4, r5, r6, r7)
            ax.T2.h$d r10 = new ax.T2.h$d
            r10.<init>()
            java.util.Collections.sort(r8, r10)
            int r10 = r8.size()
            r11 = 0
        L7c:
            if (r11 >= r10) goto L8a
            java.lang.Object r13 = r8.get(r11)
            int r11 = r11 + 1
            com.voxdon.xplorer.file.n r13 = (com.voxdon.xplorer.file.AbstractC3595n) r13
            r12.push(r13)
            goto L7c
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T2.h.r0(com.voxdon.xplorer.file.o, ax.T2.h$f, java.util.Stack, java.io.Writer):void");
    }

    private void s0(C3596o c3596o, f fVar, AbstractC3595n abstractC3595n, Writer writer, InterfaceC3185c interfaceC3185c) throws IOException, C1495j, C1486a {
        Stack<AbstractC3595n> stack = new Stack<>();
        stack.push(abstractC3595n);
        while (!stack.isEmpty()) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            r0(c3596o, fVar, stack, writer);
        }
    }

    private void t0(C3596o c3596o, f fVar, String str, BufferedWriter bufferedWriter, ax.Z2.i iVar, InterfaceC3185c interfaceC3185c) throws IOException, C1495j, C1486a {
        Stack<String> stack = new Stack<>();
        stack.push(str);
        while (!stack.isEmpty()) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            C3596o c3596o2 = c3596o;
            f fVar2 = fVar;
            BufferedWriter bufferedWriter2 = bufferedWriter;
            ax.Z2.i iVar2 = iVar;
            InterfaceC3185c interfaceC3185c2 = interfaceC3185c;
            u0(c3596o2, fVar2, stack, bufferedWriter2, iVar2, interfaceC3185c2);
            c3596o = c3596o2;
            fVar = fVar2;
            bufferedWriter = bufferedWriter2;
            iVar = iVar2;
            interfaceC3185c = interfaceC3185c2;
        }
    }

    private void u() {
        synchronized (this.h) {
            try {
                ArrayList<g> arrayList = this.g;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    g gVar = arrayList.get(i2);
                    i2++;
                    gVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void u0(C3596o c3596o, f fVar, Stack<String> stack, BufferedWriter bufferedWriter, ax.Z2.i iVar, InterfaceC3185c interfaceC3185c) throws IOException, C1495j, C1486a {
        String pop = stack.pop();
        String str = null;
        AbstractC3595n abstractC3595n = null;
        while (true) {
            String c2 = iVar.c();
            if (c2 == null) {
                return;
            }
            String[] split = c2.split("\u0000");
            String decode = Uri.decode(split[0]);
            if (!d0.B(decode)) {
                ax.Ha.c.h().d("ANALYSIS ISCD:").g(decode + ":" + c2.length() + ":" + c2).h();
                iVar.a();
            } else {
                if (!d0.r(decode).equals(pop) && pop != null) {
                    return;
                }
                if (str == null || abstractC3595n == null || !str.equals(decode)) {
                    abstractC3595n = c3596o.z(decode);
                    if (abstractC3595n.q() == 0 && Q.L() && (abstractC3595n instanceof C3605y)) {
                        ((C3605y) abstractC3595n).q1();
                    }
                    str = decode;
                }
                AbstractC3595n abstractC3595n2 = abstractC3595n;
                if (x0(abstractC3595n2)) {
                    iVar.a();
                } else {
                    if (abstractC3595n2.q() == Long.parseLong(split[1])) {
                        bufferedWriter.write(c2 + "\n");
                        K0(c3596o, fVar, decode, split);
                        iVar.a();
                        stack.push(pop);
                        stack.push(decode);
                        return;
                    }
                    iVar.a();
                    q0(c3596o, fVar, abstractC3595n2, bufferedWriter, iVar, interfaceC3185c);
                }
                abstractC3595n = abstractC3595n2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, boolean z) {
        synchronized (this.h) {
            try {
                ArrayList<g> arrayList = this.g;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    g gVar = arrayList.get(i2);
                    i2++;
                    gVar.c(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void w(int i2) {
        synchronized (this.h) {
            try {
                ArrayList<g> arrayList = this.g;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    g gVar = arrayList.get(i3);
                    i3++;
                    gVar.d(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean x0(AbstractC3595n abstractC3595n) {
        Set<String> set = this.k;
        if (set == null) {
            return false;
        }
        return set.contains(abstractC3595n.E());
    }

    private List<AbstractC3595n> z0(C3596o c3596o, AbstractC3595n abstractC3595n) throws C1495j {
        return c3596o.f0(abstractC3595n);
    }

    public void A0(g gVar) throws C1495j {
        if (this.j == null) {
            C3184b.f();
            return;
        }
        if (gVar != null) {
            try {
                try {
                    c(gVar);
                } catch (InterruptedException unused) {
                    C3184b.f();
                    if (gVar != null) {
                        I0(gVar);
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (gVar != null) {
                    I0(gVar);
                }
                throw th;
            }
        }
        this.j.await();
        if (gVar != null) {
            I0(gVar);
        }
    }

    public boolean B0() {
        return this.n;
    }

    public List<ax.U2.f> C() {
        if (this.c == null) {
            return null;
        }
        return new ArrayList(this.c.j);
    }

    public long D() {
        f fVar = this.c;
        return fVar.s + fVar.u + fVar.t;
    }

    public long E(AbstractC3595n abstractC3595n) {
        Long l;
        f fVar = this.c;
        if (fVar == null || (l = fVar.d.get(d0(abstractC3595n))) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public long F(AbstractC3595n abstractC3595n) {
        C3184b.c(abstractC3595n != null);
        C3184b.c(abstractC3595n.n());
        return ((C3605y) abstractC3595n).F0().getTotalSpace();
    }

    public Map<String, UsageStats> F0(UsageStatsManager usageStatsManager, long j, long j2) {
        List<UsageStats> queryUsageStats = usageStatsManager.queryUsageStats(2, j, j2);
        if (queryUsageStats.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap();
        int size = queryUsageStats.size();
        for (int i2 = 0; i2 < size; i2++) {
            UsageStats usageStats = queryUsageStats.get(i2);
            UsageStats usageStats2 = (UsageStats) arrayMap.get(usageStats.getPackageName());
            if (usageStats2 == null) {
                arrayMap.put(usageStats.getPackageName(), usageStats);
            } else {
                usageStats2.add(usageStats);
            }
        }
        return arrayMap;
    }

    public List<C0194h> G() {
        j jVar;
        f fVar = this.c;
        if (fVar == null || (jVar = fVar.m) == null) {
            return null;
        }
        return jVar.b(this.a, 5);
    }

    public void G0() {
        synchronized (this.m) {
            try {
                if (this.m.decrementAndGet() == 0) {
                    p.fine("analysis instance all released : clear");
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<C0194h> H() {
        j jVar;
        f fVar = this.c;
        if (fVar == null || (jVar = fVar.m) == null) {
            return null;
        }
        return jVar.c(this.a);
    }

    public void H0(Context context) {
        A(context, this.a).delete();
    }

    public j I() {
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        return fVar.m;
    }

    public void I0(g gVar) {
        synchronized (this.h) {
            this.g.remove(gVar);
        }
    }

    public long J() {
        j jVar;
        f fVar = this.c;
        if (fVar == null || (jVar = fVar.m) == null) {
            return 0L;
        }
        return jVar.b;
    }

    public void J0() {
        synchronized (this.m) {
            this.m.getAndIncrement();
        }
    }

    public List<C0194h> K() {
        j jVar;
        f fVar = this.c;
        if (fVar == null || (jVar = fVar.n) == null) {
            return null;
        }
        return jVar.b(this.a, 5);
    }

    public j L() {
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        return fVar.n;
    }

    public void L0() {
        if (this.c == null) {
            return;
        }
        this.n = true;
    }

    public long M() {
        j jVar;
        f fVar = this.c;
        if (fVar == null || (jVar = fVar.n) == null) {
            return 0L;
        }
        return jVar.b;
    }

    public List<C0194h> N() {
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        return fVar.h;
    }

    public void N0(long j) {
        f fVar = this.c;
        if (fVar == null) {
            return;
        }
        fVar.q -= j;
    }

    public long O() {
        f fVar = this.c;
        if (fVar == null) {
            return 0L;
        }
        return fVar.q;
    }

    public void O0(long j) {
        f fVar = this.c;
        if (fVar == null) {
            return;
        }
        fVar.o -= j;
    }

    public List<ax.U2.f> P() {
        f fVar = this.c;
        if (fVar == null || fVar.l == null) {
            return null;
        }
        return new ArrayList(this.c.l);
    }

    public void P0(List<ax.U2.f> list) {
        List<ax.U2.f> h0;
        f fVar = this.c;
        if (fVar == null || fVar.k == null || (h0 = h0()) == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<ax.U2.f> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().r());
        }
        long j = this.c.s;
        ListIterator<ax.U2.f> listIterator = h0.listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            ax.U2.f next = listIterator.next();
            if (!hashSet.contains(next.r())) {
                listIterator.remove();
                j -= next.s();
                z = true;
            }
        }
        if (z) {
            f fVar2 = this.c;
            fVar2.k = h0;
            fVar2.x = j;
            fVar2.w = true;
        }
        this.n = false;
    }

    public long Q(EnumC1837z enumC1837z) {
        return R(this.c, enumC1837z);
    }

    public long R(f fVar, EnumC1837z enumC1837z) {
        long j = 0;
        if (fVar == null) {
            return 0L;
        }
        if (!C1808A.H(enumC1837z)) {
            Long l = fVar.e.get(enumC1837z);
            if (l == null) {
                return 0L;
            }
            return l.longValue();
        }
        List<EnumC1837z> j2 = C1808A.j(enumC1837z);
        if (j2 == null) {
            return 0L;
        }
        Iterator<EnumC1837z> it = j2.iterator();
        while (it.hasNext()) {
            Long l2 = fVar.e.get(it.next());
            if (l2 != null) {
                j += l2.longValue();
            }
        }
        Long l3 = fVar.e.get(enumC1837z);
        return l3 != null ? j + l3.longValue() : j;
    }

    public List<C0194h> U() {
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        return fVar.f;
    }

    public List<C0194h> V() {
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        return fVar.g;
    }

    public long W() {
        f fVar = this.c;
        if (fVar == null) {
            return 0L;
        }
        return fVar.o;
    }

    public K X() {
        return this.a;
    }

    public long Y(AbstractC3595n abstractC3595n) {
        return abstractC3595n.isDirectory() ? E(abstractC3595n) : abstractC3595n.p();
    }

    public List<C0194h> Z() {
        i iVar = this.d;
        if (iVar == null) {
            return null;
        }
        return iVar.a;
    }

    public void b(AbstractC3595n abstractC3595n) {
        m(this.c, C1835x.e(this.a), abstractC3595n);
    }

    public void c(g gVar) {
        synchronized (this.h) {
            this.g.add(gVar);
        }
    }

    public long c0() {
        i iVar = this.d;
        if (iVar == null) {
            return 0L;
        }
        return iVar.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (ax.X2.Q.J1() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r5.a != ax.c3.K.e) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (ax.Z2.j.F().o0() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        if (ax.u3.C3197o.d(r0.t()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        g(r0.t(), r5.c, r5.a);
        k(r0.t(), r5.c);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r6, ax.T2.h.g r7, ax.u3.InterfaceC3185c r8) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.T2.h.f(boolean, ax.T2.h$g, ax.u3.c):void");
    }

    public k0 f0() {
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        return fVar.c;
    }

    public List<ax.U2.f> h0() {
        f fVar = this.c;
        if (fVar == null || fVar.k == null) {
            return null;
        }
        return new ArrayList(this.c.k);
    }

    public boolean i() {
        try {
            J0();
            i iVar = new i();
            this.d = iVar;
            h(iVar, null);
            this.b = false;
            this.e = true;
            this.f = false;
            return true;
        } catch (C1495j unused) {
            return false;
        } finally {
            G0();
        }
    }

    public long i0() {
        return this.c.x;
    }

    public long j0() {
        f fVar = this.c;
        if (fVar == null) {
            return 0L;
        }
        return fVar.v;
    }

    public boolean k0() {
        return this.e;
    }

    public boolean l0() {
        ArrayList<C0194h> arrayList;
        f fVar = this.c;
        return fVar != null && (arrayList = fVar.h) != null && arrayList.size() >= 1 && !(fVar.h.size() == 1 && "/Android/data/com.voxdon.xplorer/cache".equals(fVar.h.get(0).a())) && fVar.q > 0;
    }

    public boolean m0() {
        return this.b && this.e;
    }

    public void n() {
        this.e = false;
        this.b = false;
    }

    public void o() {
        f fVar = this.c;
        if (fVar == null) {
            return;
        }
        fVar.h.clear();
        fVar.q = 0L;
        fVar.l.clear();
        fVar.v = 0L;
    }

    public boolean o0() {
        List<ax.U2.f> list;
        f fVar = this.c;
        return (fVar == null || (list = fVar.k) == null || list.size() <= 0) ? false : true;
    }

    public void s(AbstractC3595n abstractC3595n, long j) {
        f fVar = this.c;
        String d0 = d0(abstractC3595n);
        while (true) {
            Long l = fVar.d.get(d0);
            if (l != null) {
                fVar.d.put(d0, Long.valueOf(l.longValue() - j));
            }
            if ("/".equals(d0)) {
                return;
            } else {
                d0 = d0.r(d0);
            }
        }
    }

    public void t() {
        synchronized (this.h) {
            try {
                ArrayList<g> arrayList = this.g;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    g gVar = arrayList.get(i2);
                    i2++;
                    gVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v0() {
        this.f = true;
    }

    public boolean w0() {
        boolean z;
        synchronized (this.i) {
            try {
                CountDownLatch countDownLatch = this.j;
                z = countDownLatch != null && countDownLatch.getCount() > 0;
            } finally {
            }
        }
        return z;
    }

    public void x() {
        f fVar = this.c;
        if (fVar == null) {
            return;
        }
        fVar.m = null;
    }

    public boolean y() {
        f fVar = this.c;
        if (fVar == null) {
            return false;
        }
        return fVar.w;
    }

    public boolean y0() {
        return this.f;
    }

    public String z(String str) {
        return d0.P(this.a.e(), str);
    }
}
