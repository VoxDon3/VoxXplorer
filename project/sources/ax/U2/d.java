package ax.U2;

import android.annotation.SuppressLint;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.storage.StorageManager;
import ax.X2.Q;
import ax.Z2.j;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1809B;
import ax.c3.C1835x;
import ax.c3.F;
import ax.c3.K;
import ax.c3.d0;
import ax.r8.C3009r;
import ax.u3.AbstractC3199q;
import ax.u3.C3194l;
import ax.u3.C3197o;
import ax.u3.z;
import com.voxdon.xplorer.data.ApkPlusInfo;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.receiver.PackageCommitReceiver;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

@SuppressLint({"DefaultLocale"})
/* loaded from: classes.dex */
public class d {
    private static final Logger j = ax.Q2.g.a(d.class);
    private static d k;
    Context b;
    HashMap<String, f> e;
    final String a = "\u0000";
    List<Intent> c = new ArrayList();
    final Object f = new Object();
    HashMap<String, Boolean> g = new HashMap<>();
    HashMap<String, e> h = new HashMap<>();
    private final Object i = new Object();
    ax.Z2.b d = ax.Z2.b.k();

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return d.S(d0.j(str));
        }
    }

    class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return "apk".equals(d0.j(str));
        }
    }

    class c implements Comparator<File> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Integer.compare(d.o(file.getName()), d.o(file.getName()));
        }
    }

    /* renamed from: ax.U2.d$d, reason: collision with other inner class name */
    public static class C0202d extends AbstractC3199q<Void, Void, Void> {
        Context h;

        public C0202d(Context context) {
            super(AbstractC3199q.e.LOW);
            this.h = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            d.j.fine("start caching app name");
            d.F(this.h).D("APPS_ALL");
            return null;
        }
    }

    public static class e {
        public String a;
        public long b;

        public e(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public static class f {
        String a;
        long b;

        f(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public long a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    public static class g {
        public String a;
        public String b;
    }

    private d(Context context) {
        this.b = context.getApplicationContext();
    }

    private synchronized List<ax.U2.f> A() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        try {
            PackageManager packageManager = this.b.getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                try {
                    if (packageInfo.applicationInfo != null) {
                        arrayList.add(new ax.U2.f(packageManager, packageInfo));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return arrayList;
    }

    public static Bitmap E(ax.U2.f fVar) {
        Drawable l = fVar.l();
        if (l instanceof BitmapDrawable) {
            return ((BitmapDrawable) l).getBitmap();
        }
        if (l != null) {
            return z.e(l);
        }
        return null;
    }

    public static d F(Context context) {
        if (k == null) {
            k = new d(context);
        }
        return k;
    }

    private File H() {
        return new File(ax.Q2.e.q(this.b), "appcache_" + Locale.getDefault().toString());
    }

    public static String K(ax.U2.f fVar) {
        return C1809B.A(fVar);
    }

    public static long L(PackageInfo packageInfo) {
        long longVersionCode;
        if (!Q.q0()) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    public static ApkPlusInfo M(AbstractC1823k abstractC1823k) {
        byte[] g2;
        try {
            g2 = F.g(abstractC1823k, "manifest.json");
        } catch (C1495j | C3009r | NullPointerException unused) {
        }
        if (g2 == null) {
            return null;
        }
        Map map = (Map) new Gson().k(new String(g2), Map.class);
        ApkPlusInfo apkPlusInfo = new ApkPlusInfo();
        Object obj = map.get("name");
        if (obj instanceof String) {
            apkPlusInfo.app_name = (String) obj;
        }
        Object obj2 = map.get("version_name");
        if (obj2 instanceof String) {
            apkPlusInfo.version_name = (String) obj2;
        }
        Object obj3 = map.get("package_name");
        if (obj3 instanceof String) {
            apkPlusInfo.package_name = (String) obj3;
        }
        Object obj4 = map.get("version_code");
        if (obj4 instanceof String) {
            try {
                apkPlusInfo.version_code = Long.parseLong((String) obj4);
            } catch (NumberFormatException unused2) {
            }
        }
        Object obj5 = map.get("min_sdk_version");
        if (obj5 instanceof String) {
            try {
                apkPlusInfo.min_sdk_version = Integer.parseInt((String) obj5);
            } catch (NumberFormatException unused3) {
            }
        }
        if (apkPlusInfo.app_name != null) {
            if (apkPlusInfo.version_name != null) {
                return apkPlusInfo;
            }
        }
        return null;
    }

    private static boolean N(String str) {
        return "apkm".equals(str) || "apk+".equals(str) || "xapk".equals(str);
    }

    public static boolean O(Context context, AbstractC1823k abstractC1823k) throws C1495j {
        File file = new File(ax.Z2.a.m(context, "apks-tmp"), String.valueOf(abstractC1823k.E().hashCode()));
        ax.Z2.a.f(file, true);
        F.l(abstractC1823k, file, null);
        File file2 = new File(file, "Android/obb");
        if (file2.exists()) {
            try {
                e(file2.getAbsolutePath(), d0.Q(K.e.e(), "Android/obb"));
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        File file3 = new File(file, "splits");
        if (file3.exists() && file3.isDirectory()) {
            file = file3;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length == 1 && listFiles[0].isDirectory()) {
            file = listFiles[0];
        }
        File[] listFiles2 = file.listFiles(new b());
        if (listFiles2 == null) {
            return false;
        }
        List asList = Arrays.asList(listFiles2);
        Collections.sort(asList, new c());
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        sessionParams.setSize(0L);
        int i = -1;
        try {
            i = packageInstaller.createSession(sessionParams);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                d0(packageInstaller, i, (File) it.next());
            }
            c0(context, packageInstaller, i);
            return true;
        } catch (IOException e3) {
            e3.printStackTrace();
            if (i > 0) {
                packageInstaller.abandonSession(i);
            }
            return false;
        } catch (IllegalStateException e4) {
            e4.printStackTrace();
            ax.Ha.c.h().f().b("APP INSTALL SESSION ERROR").l(e4).h();
            if (i > 0) {
                packageInstaller.abandonSession(i);
            }
            return false;
        } catch (NullPointerException unused) {
            if (i > 0) {
                packageInstaller.abandonSession(i);
            }
            return false;
        }
    }

    public static boolean P(String str) {
        return "apk+".equals(str);
    }

    public static boolean Q(String str) {
        return str.endsWith("/cache") && str.startsWith("/Android/data/") && str.split("/").length == 5;
    }

    public static boolean S(String str) {
        return "apk".equals(str) || "apk+".equals(str);
    }

    public static boolean T() {
        if (!Q.z0()) {
            return false;
        }
        j F = j.F();
        return F.t0() && F.T() != null && F.j0(K.f);
    }

    public static boolean U(String str) {
        return "apks".equals(str) || "apkm".equals(str) || "apk+".equals(str) || "xapk".equals(str);
    }

    public static boolean V(String str) {
        return "xapk".equals(str);
    }

    private void X(List<ax.U2.f> list, Intent intent) {
        String action = intent.getAction();
        String replace = intent.getDataString().replace("package:", HttpUrl.FRAGMENT_ENCODE_SET);
        if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REPLACED".equals(action)) {
            a0(list, replace);
            c(list, replace);
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            a0(list, replace);
        }
    }

    private HashMap<String, f> Y() {
        File H = H();
        if (H.exists()) {
            H.delete();
        }
        File w = w();
        if (!w.exists()) {
            return null;
        }
        w.delete();
        return null;
    }

    private void a0(List<ax.U2.f> list, String str) {
        ax.U2.f j2 = j(list, str);
        if (j2 != null) {
            list.remove(j2);
        }
    }

    private void c(List<ax.U2.f> list, String str) {
        PackageManager packageManager = this.b.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo.applicationInfo != null) {
                list.add(new ax.U2.f(packageManager, packageInfo));
            }
        } catch (Exception unused) {
            j.severe("Adding changed packaged to cache was failed");
        }
    }

    private static void c0(Context context, PackageInstaller packageInstaller, int i) throws IOException {
        PackageInstaller.Session session;
        try {
            session = packageInstaller.openSession(i);
        } catch (Throwable th) {
            th = th;
            session = null;
        }
        try {
            session.commit(C3194l.b(context, 0, new Intent(context, (Class<?>) PackageCommitReceiver.class), 0).getIntentSender());
            session.close();
            session.close();
        } catch (Throwable th2) {
            th = th2;
            if (session != null) {
                session.close();
            }
            throw th;
        }
    }

    private void d(List<ax.U2.f> list) {
        this.e = new HashMap<>();
        for (ax.U2.f fVar : list) {
            this.e.put(fVar.r(), new f(fVar.q(), fVar.n()));
        }
    }

    private static void d0(PackageInstaller packageInstaller, int i, File file) throws IOException {
        Throwable th;
        FileInputStream fileInputStream;
        PackageInstaller.Session session;
        OutputStream outputStream = null;
        try {
            session = packageInstaller.openSession(i);
            try {
                OutputStream openWrite = session.openWrite(file.getName(), 0L, file.length());
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        F.b(fileInputStream, openWrite);
                        session.fsync(openWrite);
                        if (openWrite != null) {
                            openWrite.close();
                        }
                        fileInputStream.close();
                        session.close();
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = openWrite;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (session == null) {
                            throw th;
                        }
                        session.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            session = null;
        }
    }

    public static void e(String str, String str2) throws IOException {
        try {
            C3596o g2 = C1835x.g(str);
            AbstractC3595n z = g2.z(str);
            AbstractC3595n z2 = g2.z(str2);
            if (z.isDirectory()) {
                if (!z2.n()) {
                    g2.k(z2, false);
                }
                for (AbstractC3595n abstractC3595n : g2.f0(z)) {
                    e(abstractC3595n.E(), d0.Q(z2.E(), abstractC3595n.B()));
                }
            } else {
                if (z2.n()) {
                    g2.P(z2);
                }
                g2.F(z, z2, null, null);
            }
            g2.P(z);
        } catch (C1486a | C1495j e2) {
            e2.printStackTrace();
        }
    }

    public static g f0(AbstractC1823k abstractC1823k, File file) throws C1495j {
        ax.B.b bVar = new ax.B.b();
        bVar.add("splits/base-master.apk");
        bVar.add("base.apk");
        bVar.add(ApkPlusInfo.ICON_FILENAME);
        ax.B.b<String> l = F.l(abstractC1823k, file, bVar);
        g gVar = new g();
        if (l != null) {
            Iterator<String> it = l.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (ApkPlusInfo.ICON_FILENAME.equals(next)) {
                    gVar.b = next;
                } else {
                    gVar.a = next;
                }
            }
        }
        return gVar;
    }

    public static String g(String str) {
        return str.substring(14, str.lastIndexOf(47));
    }

    public static List<ax.U2.f> h(List<ax.U2.f> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ax.U2.f fVar : list) {
            if (!fVar.F()) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    private ax.U2.f j(List<ax.U2.f> list, String str) {
        for (ax.U2.f fVar : list) {
            if (fVar.r().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    private static ax.U2.a k(Context context, C3605y c3605y) {
        PackageManager packageManager = context.getPackageManager();
        String K0 = c3605y.K0();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(K0, 0);
        if (packageArchiveInfo == null) {
            return null;
        }
        ax.U2.a aVar = new ax.U2.a();
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        applicationInfo.sourceDir = K0;
        applicationInfo.publicSourceDir = K0;
        String str = packageArchiveInfo.versionName;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        aVar.b = str;
        aVar.a = applicationInfo.loadLabel(packageManager).toString();
        aVar.c = packageArchiveInfo.packageName;
        aVar.d = L(packageArchiveInfo);
        return aVar;
    }

    private static ax.U2.a l(ApkPlusInfo apkPlusInfo) {
        ax.U2.a aVar = new ax.U2.a();
        String str = apkPlusInfo.version_name;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        aVar.b = str;
        aVar.a = apkPlusInfo.app_name;
        aVar.c = apkPlusInfo.package_name;
        aVar.d = apkPlusInfo.version_code;
        return aVar;
    }

    public static e m(AbstractC1823k abstractC1823k) {
        ApkPlusInfo n = n(abstractC1823k);
        if (n == null) {
            return null;
        }
        return new e(n.package_name, n.version_code);
    }

    public static ApkPlusInfo n(AbstractC1823k abstractC1823k) {
        try {
            byte[] g2 = F.g(abstractC1823k, ApkPlusInfo.INFO_FILENAME);
            if (g2 == null) {
                return null;
            }
            return (ApkPlusInfo) new Gson().k(new String(g2), ApkPlusInfo.class);
        } catch (C1495j | C3009r | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(String str) {
        if (str == null) {
            return 100;
        }
        if (str.contains("base.apk")) {
            return 0;
        }
        if (str.contains("split") || str.contains("config")) {
            return 10;
        }
        return str.contains("base") ? 1 : 2;
    }

    private static InputStream p(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        applicationInfo.sourceDir = str;
        applicationInfo.publicSourceDir = str;
        Drawable loadIcon = applicationInfo.loadIcon(packageManager);
        if (loadIcon == null) {
            return null;
        }
        return new ByteArrayInputStream(z.d(loadIcon instanceof BitmapDrawable ? ((BitmapDrawable) loadIcon).getBitmap() : z.e(loadIcon)));
    }

    public static ax.U2.a q(Context context, C3605y c3605y) {
        return U(c3605y.A()) ? s(context, c3605y) : k(context, c3605y);
    }

    public static InputStream r(Context context, String str) {
        return U(d0.k(str)) ? t(context, str) : p(context, str);
    }

    private static ax.U2.a s(Context context, C3605y c3605y) {
        ApkPlusInfo M;
        File file = new File(ax.Z2.a.m(context, "apks-tmp"), String.valueOf(c3605y.E().hashCode()));
        ax.Z2.a.f(file, true);
        try {
            if (P(c3605y.A())) {
                ApkPlusInfo n = n(c3605y);
                if (n != null) {
                    return l(n);
                }
            } else if (V(c3605y.A()) && (M = M(c3605y)) != null) {
                return l(M);
            }
            g f0 = f0(c3605y, file);
            if (f0.a == null) {
                return null;
            }
            try {
                return k(context, C3605y.I0(d0.Q(file.getAbsolutePath(), f0.a)));
            } catch (C1495j unused) {
                return null;
            }
        } catch (C1495j e2) {
            e2.printStackTrace();
            return null;
        } finally {
            ax.Z2.a.f(file, true);
        }
    }

    private static InputStream t(Context context, String str) {
        byte[] g2;
        File file = new File(ax.Z2.a.m(context, "apks-tmp"), String.valueOf(str.hashCode()));
        try {
            C3605y I0 = C3605y.I0(str);
            if (N(d0.k(str)) && (g2 = F.g(I0, ApkPlusInfo.ICON_FILENAME)) != null) {
                return new ByteArrayInputStream(g2);
            }
            ax.Z2.a.f(file, true);
            g f0 = f0(I0, file);
            if (f0.b != null) {
                File file2 = new File(d0.Q(file.getAbsolutePath(), f0.b));
                if (file2.exists()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        F.b(fileInputStream, byteArrayOutputStream);
                        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (f0.a != null) {
                String Q = d0.Q(file.getAbsolutePath(), f0.a);
                if (new File(Q).exists()) {
                    return p(context, Q);
                }
            }
            return null;
        } catch (C1495j e3) {
            e3.printStackTrace();
            return null;
        } finally {
            ax.Z2.a.f(file, true);
        }
    }

    public static K u(Context context) {
        return (ax.t3.j.H(context) && T()) ? K.f : K.e;
    }

    private File w() {
        return new File(ax.Q2.e.w(this.b), "appcache_" + Locale.getDefault().toString());
    }

    public synchronized List<ax.U2.f> B() {
        try {
            List<ax.U2.f> i = this.d.i("APPS_BASE");
            if (i == null || i.size() == 0) {
                this.c.clear();
                List<ax.U2.f> A = A();
                this.d.n("APPS_BASE", A);
                return new ArrayList(A);
            }
            if (this.c.size() > 0) {
                Iterator<Intent> it = this.c.iterator();
                while (it.hasNext()) {
                    X(i, it.next());
                }
                this.c.clear();
            }
            return new ArrayList(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public long C(StorageStats storageStats) {
        long externalCacheBytes;
        externalCacheBytes = storageStats.getExternalCacheBytes();
        return externalCacheBytes;
    }

    public List<ax.U2.f> D(String str) {
        List<ax.U2.f> i = this.d.i(str);
        if (i != null && i.size() != 0) {
            return new ArrayList(i);
        }
        List<ax.U2.f> B = B();
        if ("APPS_DOWNLOADED".equals(str)) {
            B = h(B);
        }
        this.d.n(str, new ArrayList(B));
        if (this.e == null) {
            synchronized (this.f) {
                this.e = Y();
            }
        }
        boolean z = false;
        for (ax.U2.f fVar : B) {
            synchronized (this.f) {
                if (fVar.a(this.e)) {
                    z = true;
                }
            }
        }
        if ("APPS_ALL".equals(str) && z) {
            synchronized (this.f) {
                d(B);
                g0(this.e);
            }
        }
        this.g.put(str, Boolean.TRUE);
        return B;
    }

    public int G(boolean z) {
        List<ax.U2.f> B = B();
        return z ? B.size() : h(B).size();
    }

    public long I(boolean z) {
        List<ax.U2.f> B = B();
        if (!z) {
            B = h(B);
        }
        if (C3197o.d(this.b)) {
            F(this.b).i(B, false);
        }
        Iterator<ax.U2.f> it = B.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            try {
                j2 += it.next().s();
            } catch (NullPointerException e2) {
                ax.Ha.c.h().d("AHFLNULL!!:").l(e2).h();
            }
        }
        return j2;
    }

    public InputStream J(Uri uri) {
        Bitmap E;
        String path = uri.getPath();
        if ("apk".equals(uri.getAuthority())) {
            return r(this.b, path);
        }
        ax.U2.f x = x(path.substring(1));
        if (x == null || (E = E(x)) == null) {
            return null;
        }
        return new ByteArrayInputStream(z.d(E));
    }

    public boolean R(String str) {
        Boolean bool = this.g.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean W() {
        return false;
    }

    public void Z() {
        File w = w();
        if (w.exists()) {
            w.delete();
        }
    }

    public synchronized void b0(Intent intent) {
        this.c.add((Intent) intent.clone());
        List<ax.U2.f> i = this.d.i("APPS_BASE");
        this.d.b();
        if (i != null) {
            this.d.n("APPS_BASE", i);
        }
    }

    public List<ax.U2.f> e0(List<ax.U2.f> list, String str) {
        Comparator<ax.U2.f> d = ax.U2.f.d(str);
        if (d != null) {
            try {
                if (!ax.U2.f.D(str)) {
                    Collections.sort(list, d);
                    return list;
                }
                synchronized (this.i) {
                    Collections.sort(list, d);
                }
                return list;
            } catch (IllegalArgumentException e2) {
                ax.Ha.c.h().f().b("APPINFO SORT ERROR").l(e2).h();
            }
        }
        return list;
    }

    public void f() {
        File v = v();
        if (v.exists()) {
            return;
        }
        v.mkdirs();
    }

    public void i(List<ax.U2.f> list, boolean z) {
        StorageStatsManager a2;
        UUID uuid;
        StorageStats queryStatsForPackage;
        long appBytes;
        long cacheBytes;
        long dataBytes;
        if (!Q.J1() || list == null || (a2 = ax.T2.c.a(this.b.getSystemService("storagestats"))) == null) {
            return;
        }
        synchronized (this.i) {
            try {
                for (ax.U2.f fVar : list) {
                    if (fVar.C()) {
                        if (!z) {
                            try {
                                if (fVar.G()) {
                                }
                            } catch (PackageManager.NameNotFoundException | IOException | SecurityException unused) {
                            }
                        }
                        uuid = StorageManager.UUID_DEFAULT;
                        queryStatsForPackage = a2.queryStatsForPackage(uuid, fVar.r(), Process.myUserHandle());
                        long C = (!Q.V0() || queryStatsForPackage == null) ? 0L : C(queryStatsForPackage);
                        if (queryStatsForPackage != null) {
                            appBytes = queryStatsForPackage.getAppBytes();
                            cacheBytes = queryStatsForPackage.getCacheBytes();
                            dataBytes = queryStatsForPackage.getDataBytes();
                            fVar.H(appBytes, cacheBytes, dataBytes, C);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public File v() {
        return new File((u(this.b) == K.f ? j.F().T() : j.F().O()) + "/backups/apps");
    }

    public ax.U2.f x(String str) {
        List<ax.U2.f> i = this.d.i("APPS_BASE");
        if (i == null || i.size() == 0) {
            PackageManager packageManager = this.b.getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                if (packageInfo == null || packageInfo.applicationInfo == null) {
                    return null;
                }
                return new ax.U2.f(packageManager, packageInfo);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        synchronized (this) {
            try {
                for (ax.U2.f fVar : i) {
                    if (str.equals(fVar.r())) {
                        return fVar;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public Map<String, e> y() {
        File[] listFiles;
        e eVar;
        HashMap hashMap = new HashMap();
        File v = v();
        if (v.exists() && v.isDirectory() && (listFiles = v.listFiles(new a())) != null) {
            PackageManager packageManager = this.b.getPackageManager();
            for (File file : listFiles) {
                String j2 = d0.j(file.getName());
                String absolutePath = file.getAbsolutePath();
                String str = file.getAbsolutePath() + "-" + file.lastModified();
                e eVar2 = this.h.get(str);
                if (eVar2 == null) {
                    if (P(j2)) {
                        eVar2 = m(C3604x.O0(file));
                        if (eVar2 != null) {
                            this.h.put(str, eVar2);
                        }
                    } else {
                        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(absolutePath, 0);
                        if (packageArchiveInfo != null) {
                            eVar2 = new e(packageArchiveInfo.packageName, L(packageArchiveInfo));
                            this.h.put(str, eVar2);
                        }
                    }
                }
                if (eVar2 != null && ((eVar = (e) hashMap.get(eVar2.a)) == null || eVar.b < eVar2.b)) {
                    hashMap.put(eVar2.a, eVar2);
                }
            }
        }
        return hashMap;
    }

    public File z(ax.U2.f fVar) {
        String b2 = d0.b(fVar.q() + " " + fVar.x());
        String f2 = fVar.E() ? "apk+" : d0.f(fVar.f().getName());
        return new File(v(), b2 + "." + f2);
    }

    private void g0(HashMap<String, f> hashMap) {
    }
}
