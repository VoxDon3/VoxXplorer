package ax.U2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import ax.U2.d;
import ax.X2.Q;
import ax.c3.C1809B;
import ax.c3.C1831t;
import ax.u3.C3180B;
import ax.u3.C3184b;
import java.io.File;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class f {
    private PackageManager a;
    private PackageInfo b;
    private File c;
    private boolean d = false;
    private Long e;
    private long f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private Long k;
    private Long l;
    private String m;
    private String n;

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return C3180B.c(fVar2.n(), fVar.n());
        }
    }

    public static class b implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return C3180B.c(fVar.n(), fVar2.n());
        }
    }

    public static class c implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return C3180B.c(fVar2.e(), fVar.e());
        }
    }

    public static class d implements Comparator<f> {
        Collator q;

        public d() {
            Collator collator = Collator.getInstance();
            this.q = collator;
            collator.setDecomposition(1);
            this.q.setStrength(3);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return this.q.compare(fVar2.q(), fVar.q());
        }
    }

    public static class e implements Comparator<f> {
        Collator q;

        public e() {
            Collator collator = Collator.getInstance();
            this.q = collator;
            collator.setDecomposition(1);
            this.q.setStrength(3);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return this.q.compare(fVar.q(), fVar2.q());
        }
    }

    /* renamed from: ax.U2.f$f, reason: collision with other inner class name */
    public static class C0203f implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return C3180B.c(fVar2.s(), fVar.s());
        }
    }

    public static class g implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return C3180B.c(fVar.s(), fVar2.s());
        }
    }

    public f(PackageManager packageManager, PackageInfo packageInfo) {
        this.a = packageManager;
        this.b = packageInfo;
        C3184b.d(packageInfo.applicationInfo != null);
    }

    public static boolean D(String str) {
        return "SizeDown".equals(str) || "SizeUp".equals(str);
    }

    public static Comparator<f> d(String str) {
        if (str.equals("NameUp")) {
            return new e();
        }
        if (str.equals("NameDown")) {
            return new d();
        }
        if (str.equals("SizeUp")) {
            return new g();
        }
        if (str.equals("SizeDown")) {
            return new C0203f();
        }
        if (str.equals("DateUp")) {
            return new b();
        }
        if (str.equals("DateDown")) {
            return new a();
        }
        if (str.equals("ExternalCacheSizeDown")) {
            return new c();
        }
        return null;
    }

    public boolean A() {
        return this.d;
    }

    public boolean B() {
        return C();
    }

    public boolean C() {
        int i = this.b.applicationInfo.flags;
        return (i & 128) != 0 || (i & 1) == 0;
    }

    public boolean E() {
        String[] strArr;
        return Q.H1() && (strArr = this.b.applicationInfo.splitSourceDirs) != null && strArr.length > 0;
    }

    public boolean F() {
        PackageInfo packageInfo = this.b;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null) {
            return (applicationInfo.flags & 1) == 1;
        }
        if (packageInfo.packageName == null) {
            ax.Ha.c.h().f().b("ApplicaitonInfo null packageName null").h();
        }
        return true;
    }

    public boolean G() {
        return System.currentTimeMillis() - this.f > 600000;
    }

    public void H(long j, long j2, long j3, long j4) {
        this.f = System.currentTimeMillis();
        this.i = Long.valueOf(j);
        this.h = Long.valueOf(j2);
        this.g = Long.valueOf(j3);
        this.j = Long.valueOf(j4);
    }

    public boolean a(HashMap<String, d.f> hashMap) {
        d.f fVar;
        if (this.m != null) {
            return false;
        }
        if (hashMap != null && (fVar = hashMap.get(r())) != null && fVar.a() == n()) {
            this.m = fVar.b();
        }
        if (this.m != null) {
            return false;
        }
        this.m = this.b.applicationInfo.loadLabel(this.a).toString();
        return true;
    }

    public long b() {
        try {
            if (!E()) {
                return f().length();
            }
            long length = f().length();
            String[] strArr = this.b.applicationInfo.splitSourceDirs;
            if (strArr != null) {
                for (String str : strArr) {
                    length += new File(str).length();
                }
            }
            return length;
        } catch (IllegalArgumentException unused) {
            return 0L;
        }
    }

    public String c() {
        return this.b.applicationInfo.sourceDir;
    }

    public long e() {
        Long l = this.j;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public File f() {
        if (this.c == null) {
            String c2 = c();
            if (c2 == null) {
                this.c = new File("/nosource");
            } else {
                this.c = new File(c2);
            }
        }
        return this.c;
    }

    public long g() {
        if (this.l == null) {
            this.l = Long.valueOf(this.b.firstInstallTime);
        }
        return this.l.longValue();
    }

    public String h(Context context, int i) {
        return C1831t.f(context, n(), i);
    }

    public String i(Context context) {
        return C1809B.i(context, s());
    }

    public String j(Context context) {
        return C1831t.b(context, g());
    }

    public String k(Context context) {
        return C1831t.b(context, n());
    }

    public Drawable l() {
        return this.b.applicationInfo.loadIcon(this.a);
    }

    public String m() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        try {
            String installerPackageName = this.a.getInstallerPackageName(r());
            this.n = installerPackageName;
            return installerPackageName;
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public long n() {
        if (this.k == null) {
            this.k = Long.valueOf(this.b.lastUpdateTime);
        }
        return this.k.longValue();
    }

    public String o() {
        ApplicationInfo applicationInfo = this.b.applicationInfo;
        if (applicationInfo == null) {
            return null;
        }
        return applicationInfo.manageSpaceActivityName;
    }

    public int p() {
        int i;
        if (this.b.applicationInfo == null || !Q.j1()) {
            return 0;
        }
        i = this.b.applicationInfo.minSdkVersion;
        return i;
    }

    public String q() {
        if (this.m == null) {
            a(null);
        }
        return this.m;
    }

    public String r() {
        return this.b.packageName;
    }

    public long s() {
        Long l = this.g;
        if (l != null && this.i != null) {
            return l.longValue() + this.i.longValue();
        }
        if (this.e == null) {
            this.e = Long.valueOf(b());
        }
        return this.e.longValue();
    }

    public String[] t() {
        return this.b.applicationInfo.splitSourceDirs;
    }

    public long u() {
        return this.i.longValue();
    }

    public long v() {
        return this.h.longValue();
    }

    public long w() {
        return this.g.longValue();
    }

    public String x() {
        return this.b.versionName;
    }

    public long y() {
        return ax.U2.d.L(this.b);
    }

    public boolean z() {
        return (this.f == 0 || this.i == null) ? false : true;
    }
}
