/*
 * Decompiled with CFR 0.152.
 */
package ax.U2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import ax.U2.d;
import ax.X2.Q;
import ax.c3.B;
import ax.c3.t;
import java.io.File;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;

public class f {
    private PackageManager a;
    private PackageInfo b;
    private File c;
    private boolean d;
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

    public f(PackageManager packageManager, PackageInfo packageInfo) {
        this.a = packageManager;
        this.b = packageInfo;
        boolean bl = false;
        this.d = false;
        if (packageInfo.applicationInfo != null) {
            bl = true;
        }
        ax.u3.b.d(bl);
    }

    public static boolean D(String string) {
        return "SizeDown".equals(string) || "SizeUp".equals(string);
        {
        }
    }

    public static Comparator<f> d(String string) {
        if (string.equals("NameUp")) {
            return new e();
        }
        if (string.equals("NameDown")) {
            return new d();
        }
        if (string.equals("SizeUp")) {
            return new g();
        }
        if (string.equals("SizeDown")) {
            return new f();
        }
        if (string.equals("DateUp")) {
            return new b();
        }
        if (string.equals("DateDown")) {
            return new a();
        }
        if (string.equals("ExternalCacheSizeDown")) {
            return new c();
        }
        return null;
    }

    public boolean A() {
        return this.d;
    }

    public boolean B() {
        return this.C();
    }

    public boolean C() {
        int n8 = this.b.applicationInfo.flags;
        return (n8 & 0x80) != 0 || (n8 & 1) == 0;
        {
        }
    }

    public boolean E() {
        if (!Q.H1()) {
            return false;
        }
        String[] stringArray = this.b.applicationInfo.splitSourceDirs;
        return stringArray != null && stringArray.length > 0;
    }

    public boolean F() {
        PackageInfo packageInfo = this.b;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            if (packageInfo.packageName == null) {
                ax.Ha.c.h().f().b("ApplicaitonInfo null packageName null").h();
            }
            return true;
        }
        return (applicationInfo.flags & 1) == 1;
    }

    public boolean G() {
        return System.currentTimeMillis() - this.f > 600000L;
    }

    public void H(long l8, long l9, long l10, long l11) {
        this.f = System.currentTimeMillis();
        this.i = l8;
        this.h = l9;
        this.g = l10;
        this.j = l11;
    }

    public boolean a(HashMap<String, d.f> object) {
        if (this.m == null) {
            if (object != null && (object = ((HashMap)object).get(this.r())) != null && ((d.f)object).a() == this.n()) {
                this.m = ((d.f)object).b();
            }
            if (this.m == null) {
                this.m = this.b.applicationInfo.loadLabel(this.a).toString();
                return true;
            }
        }
        return false;
    }

    public long b() {
        block6: {
            long l8;
            block7: {
                if (!this.E()) break block6;
                long l9 = this.f().length();
                String[] stringArray = this.b.applicationInfo.splitSourceDirs;
                l8 = l9;
                if (stringArray == null) break block7;
                int n8 = stringArray.length;
                int n9 = 0;
                while (true) {
                    l8 = l9;
                    if (n9 >= n8) break;
                    String string = stringArray[n9];
                    File file = new File(string);
                    l9 += file.length();
                    ++n9;
                    continue;
                    break;
                }
            }
            return l8;
        }
        try {
            long l10 = this.f().length();
            return l10;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return 0L;
        }
    }

    public String c() {
        return this.b.applicationInfo.sourceDir;
    }

    public long e() {
        Long l8 = this.j;
        if (l8 == null) {
            return 0L;
        }
        return l8;
    }

    public File f() {
        if (this.c == null) {
            String string = this.c();
            this.c = string == null ? new File("/nosource") : new File(string);
        }
        return this.c;
    }

    public long g() {
        if (this.l == null) {
            this.l = this.b.firstInstallTime;
        }
        return this.l;
    }

    public String h(Context context, int n8) {
        return t.f(context, this.n(), n8);
    }

    public String i(Context context) {
        return B.i(context, this.s());
    }

    public String j(Context context) {
        return t.b(context, this.g());
    }

    public String k(Context context) {
        return t.b(context, this.n());
    }

    public Drawable l() {
        return this.b.applicationInfo.loadIcon(this.a);
    }

    public String m() {
        String string = this.n;
        if (string != null) {
            return string;
        }
        try {
            this.n = string = this.a.getInstallerPackageName(this.r());
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public long n() {
        if (this.k == null) {
            this.k = this.b.lastUpdateTime;
        }
        return this.k;
    }

    public String o() {
        ApplicationInfo applicationInfo = this.b.applicationInfo;
        if (applicationInfo == null) {
            return null;
        }
        return applicationInfo.manageSpaceActivityName;
    }

    public int p() {
        if (this.b.applicationInfo == null) {
            return 0;
        }
        if (!Q.j1()) {
            return 0;
        }
        return ax.U2.e.a(this.b.applicationInfo);
    }

    public String q() {
        if (this.m == null) {
            this.a(null);
        }
        return this.m;
    }

    public String r() {
        return this.b.packageName;
    }

    public long s() {
        Long l8 = this.g;
        if (l8 != null && this.i != null) {
            return l8 + this.i;
        }
        if (this.e == null) {
            this.e = this.b();
        }
        return this.e;
    }

    public String[] t() {
        return this.b.applicationInfo.splitSourceDirs;
    }

    public long u() {
        return this.i;
    }

    public long v() {
        return this.h;
    }

    public long w() {
        return this.g;
    }

    public String x() {
        return this.b.versionName;
    }

    public long y() {
        return ax.U2.d.L(this.b);
    }

    public boolean z() {
        return this.f != 0L && this.i != null;
    }

    public static class a
    implements Comparator<f> {
        public int a(f f8, f f9) {
            return ax.u3.B.c(f9.n(), f8.n());
        }
    }

    public static class b
    implements Comparator<f> {
        public int a(f f8, f f9) {
            return ax.u3.B.c(f8.n(), f9.n());
        }
    }

    public static class c
    implements Comparator<f> {
        public int a(f f8, f f9) {
            return ax.u3.B.c(f9.e(), f8.e());
        }
    }

    public static class d
    implements Comparator<f> {
        Collator q;

        public d() {
            Collator collator;
            this.q = collator = Collator.getInstance();
            collator.setDecomposition(1);
            this.q.setStrength(3);
        }

        public int a(f f8, f f9) {
            return this.q.compare(f9.q(), f8.q());
        }
    }

    public static class e
    implements Comparator<f> {
        Collator q;

        public e() {
            Collator collator;
            this.q = collator = Collator.getInstance();
            collator.setDecomposition(1);
            this.q.setStrength(3);
        }

        public int a(f f8, f f9) {
            return this.q.compare(f8.q(), f9.q());
        }
    }

    public static class f
    implements Comparator<f> {
        public int a(f f8, f f9) {
            return ax.u3.B.c(f9.s(), f8.s());
        }
    }

    public static class g
    implements Comparator<f> {
        public int a(f f8, f f9) {
            return ax.u3.B.c(f8.s(), f9.s());
        }
    }
}

