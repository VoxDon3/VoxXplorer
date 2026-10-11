package ax.Q2;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import ax.X2.C1155a;
import ax.X2.K;
import ax.X2.N;
import ax.X2.Q;
import ax.Z2.r;
import ax.Z2.u;
import ax.u3.C3184b;
import ax.u3.C3197o;
import com.voxdon.xplorer.R;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class e {
    private static C0177e b;
    private static C0177e c;
    private static File f;
    private static long g;
    private static boolean h;
    private static Boolean i;
    private static String j;
    private static File k;
    private static File l;
    private static final Logger a = g.a(e.class);
    private static boolean d = true;
    private static final List<C0177e> e = DesugarCollections.synchronizedList(new ArrayList());

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return e.O(file.getAbsolutePath());
        }
    }

    class b implements FileFilter {
        b() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return e.O(file.getAbsolutePath()) && file.isDirectory();
        }
    }

    class c implements FileFilter {
        c() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory();
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u.a.values().length];
            a = iArr;
            try {
                iArr[u.a.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u.a.SDCARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u.a.SDCARD_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u.a.ODD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u.a.CHROMEOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u.a.UNKNOWN_STORAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u.a.USB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u.a.IGNORE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: ax.Q2.e$e, reason: collision with other inner class name */
    public static class C0177e {
        public f a;
        public File b;
        public boolean c;
        public String d;
        public r e;
        public boolean f;
        public String g;
        public String h;
        public String i;
        public boolean j;

        public void a(C0177e c0177e) {
            this.b = c0177e.b;
            this.c = c0177e.c;
            this.d = c0177e.d;
            this.e = c0177e.e;
            this.f = c0177e.f;
            this.j = c0177e.j;
            this.h = c0177e.h;
        }
    }

    public static int A() {
        File y = K.y();
        if (y == null) {
            return 97;
        }
        long totalSpace = y.getTotalSpace();
        if (totalSpace == 0) {
            return 97;
        }
        if (totalSpace <= 8589934592L) {
            return 95;
        }
        if (totalSpace <= 17179869184L) {
            return 96;
        }
        return totalSpace <= 34359738368L ? 97 : 98;
    }

    private static File B() {
        return new File("/storage");
    }

    public static final File C(Context context) {
        return n(context);
    }

    public static final List<C0177e> D() {
        ArrayList arrayList;
        if (c()) {
            if (e.size() != 0) {
                a.fine("USB VOLUME STATUS CHANGED!!!!");
            }
            R();
        }
        List<C0177e> list = e;
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        return arrayList;
    }

    public static String E(Context context, String str) {
        N a2;
        String l2 = (context == null || (a2 = C1155a.a((StorageManager) context.getSystemService("storage"), new File(str))) == null) ? null : a2.l();
        if (l2 != null) {
            return l2;
        }
        String[] split = str.split("/");
        return split.length > 2 ? split[2] : l2;
    }

    private static List<u> F() {
        if (Build.VERSION.SDK_INT >= 24) {
            return K.E();
        }
        return null;
    }

    private static String G(String str, String str2) {
        return K.F(str, str2);
    }

    public static List<C0177e> H() {
        ArrayList arrayList = new ArrayList();
        if (!Q.S1()) {
            a.severe("THIS DEVICE DOES NOT SUPPORT VOLUME LIST");
            return arrayList;
        }
        List<u> F = F();
        if (F == null) {
            C3184b.f();
            return arrayList;
        }
        Iterator<u> it = F.iterator();
        while (it.hasNext()) {
            C0177e V = V(it.next(), true);
            if (V.a != null) {
                arrayList.add(V);
            }
        }
        return arrayList;
    }

    public static boolean I() {
        if (Q.z0()) {
            return C3197o.c();
        }
        return false;
    }

    private static boolean J(String str) {
        if (K.J(str)) {
            return false;
        }
        if ("/storage/sdcard0".equals(str)) {
            File file = new File("/storage/emulated/0");
            File file2 = new File(str);
            File file3 = new File(file, "Android");
            File file4 = new File(file2, "Android");
            if (file.exists() && file.lastModified() == file2.lastModified() && file3.lastModified() == file4.lastModified()) {
                ax.Ha.c.h().c("Secondary storage is internal sdcard0").h();
                return false;
            }
        }
        return true;
    }

    public static final boolean K() {
        if (b == null) {
            P();
        }
        return b.e == r.AVAILABLE;
    }

    public static boolean L(long j2, long j3) {
        return j3 > 3221225472L ? j2 > j3 / 5 : j3 < 1073741824 ? j2 > 209715200 : j2 > 524288000;
    }

    public static boolean M(long j2) {
        return j2 > 52428800;
    }

    public static final boolean N() {
        return h;
    }

    public static boolean O(String str) {
        return str.toLowerCase().contains("usb");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        if (ax.X2.J.s(r13) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if (I() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        if (ax.X2.Q.C1() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012a, code lost:
    
        if (ax.c3.C1809B.e0(r7) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void P() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Q2.e.P():void");
    }

    public static void Q() {
        P();
    }

    @TargetApi(23)
    private static void R() {
        if (!Q.R1()) {
            e.clear();
            a.severe("THIS DEVICE DOES NOT SUPPORT USB VOLUME");
            return;
        }
        e.clear();
        List<u> g2 = g();
        if (g2 == null) {
            a.fine("UsbVolumeState: no USB");
            return;
        }
        Iterator<u> it = g2.iterator();
        while (it.hasNext()) {
            C0177e V = V(it.next(), true);
            if (V.a != null) {
                e.add(V);
                Logger logger = a;
                logger.fine("UsbVolumeRoot:" + V.b);
                logger.fine("UsbVolumeStatus:" + V.e);
                logger.fine("UsbVolumeRemovable:" + V.c);
                logger.fine("UsbVolumeState:" + V.d);
            }
        }
    }

    public static void S(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j = str;
        i = Boolean.TRUE;
    }

    public static void T() {
        d = true;
    }

    public static boolean U() {
        if (i == null) {
            i = Boolean.valueOf(h());
        }
        return i.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.Q2.e.C0177e V(ax.Z2.u r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Q2.e.V(ax.Z2.u, boolean):ax.Q2.e$e");
    }

    private static boolean a() {
        String externalStorageState;
        if (b == null) {
            return true;
        }
        File file = b.b;
        if (file != null) {
            try {
                externalStorageState = Environment.getExternalStorageState(file);
            } catch (NullPointerException e2) {
                ax.Ha.c.h().f().b("CHROMEOS 9 NULL POINTER").l(e2).g("root exist:" + b.b.exists()).h();
                return false;
            }
        } else {
            externalStorageState = "unknown";
        }
        return !b.d.equals(externalStorageState);
    }

    private static boolean b() {
        String externalStorageState;
        String str;
        ax.Z2.m e2;
        if (c == null) {
            return true;
        }
        try {
            File file = c.b;
            if (file != null) {
                externalStorageState = Environment.getExternalStorageState(file);
            } else {
                File file2 = f;
                externalStorageState = file2 != null ? Environment.getExternalStorageState(file2) : "unknown";
            }
            if (!c.d.equals(externalStorageState)) {
                return true;
            }
            File file3 = c.b;
            if (file3 != null) {
                str = file3.getAbsolutePath();
            } else if (g == B().lastModified() || (e2 = e()) == null || (str = e2.a) == null) {
                str = null;
            }
            return c.e != f(str);
        } catch (NullPointerException e3) {
            ax.Ha.c.h().f().b("getExternalStorageState null pointer").l(e3).h();
            return false;
        }
    }

    private static boolean c() {
        if (!Q.R1()) {
            return false;
        }
        if (d) {
            d = false;
            return true;
        }
        List<C0177e> list = e;
        synchronized (list) {
            try {
                for (C0177e c0177e : list) {
                    String str = c0177e.g;
                    if (str != null) {
                        if (!c0177e.d.equals(G(str, c0177e.i))) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d() {
        C0177e c0177e = c;
        if (c0177e != null && "unknown".equals(c0177e.d)) {
            c.d = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C0177e c0177e2 = b;
        if (c0177e2 != null && "unknown".equals(c0177e2.d)) {
            b.d = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List<C0177e> list = e;
        synchronized (list) {
            try {
                for (C0177e c0177e3 : list) {
                    if (c0177e3 != null && "unknown".equals(c0177e3.d)) {
                        c0177e3.d = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final ax.Z2.m e() {
        return K.c();
    }

    private static r f(String str) {
        return K.k(str);
    }

    private static List<u> g() {
        return K.s();
    }

    private static boolean h() {
        File[] listFiles;
        File[] listFiles2;
        File[] listFiles3;
        File[] listFiles4;
        if (Q.S1()) {
            return false;
        }
        if (j != null && new File(j).exists()) {
            return true;
        }
        if (Q.R1()) {
            return false;
        }
        a aVar = new a();
        File file = new File("/storage");
        if (file.exists() && (listFiles4 = file.listFiles(aVar)) != null && listFiles4.length > 0) {
            return true;
        }
        if (Q.y()) {
            File file2 = new File("/mnt");
            if (file2.exists() && (listFiles3 = file2.listFiles(aVar)) != null && listFiles3.length > 0) {
                return true;
            }
        }
        String q = K.q();
        if (q != null) {
            File file3 = new File(q);
            if (file3.exists()) {
                j = file3.getAbsolutePath();
                return true;
            }
        }
        File file4 = new File("/Removable");
        if (file4.exists() && (listFiles2 = file4.listFiles(aVar)) != null && listFiles2.length > 0) {
            return true;
        }
        File file5 = new File("/storage/removable");
        return file5.exists() && (listFiles = file5.listFiles(aVar)) != null && listFiles.length > 0;
    }

    public static File i() {
        File j2;
        if (j != null) {
            File file = new File(j);
            if (file.canWrite() && file.canRead()) {
                return file;
            }
        }
        File j3 = j(new File("/storage"));
        if (j3 != null) {
            j = j3.getAbsolutePath();
            return j3;
        }
        if (Q.y() && (j2 = j(new File("/mnt"))) != null) {
            j = j2.getAbsolutePath();
            return j2;
        }
        String q = K.q();
        if (q != null) {
            File file2 = new File(q);
            if (file2.exists()) {
                j = file2.getAbsolutePath();
                return file2;
            }
        }
        File j4 = j(new File("/Removable"));
        if (j4 != null) {
            j = j4.getAbsolutePath();
            return j4;
        }
        File j5 = j(new File("/storage/removable"));
        if (j5 == null) {
            return null;
        }
        j = j5.getAbsolutePath();
        return j5;
    }

    private static File j(File file) {
        if (!file.exists()) {
            return null;
        }
        b bVar = new b();
        c cVar = new c();
        File[] listFiles = file.listFiles(bVar);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.canRead() && file2.canWrite()) {
                    return file2;
                }
                File[] listFiles2 = file2.listFiles(cVar);
                if (listFiles2 != null) {
                    for (File file3 : listFiles2) {
                        if (file3.canWrite() && file3.canRead()) {
                            return file3;
                        }
                        File[] listFiles3 = file3.listFiles(cVar);
                        if (listFiles3 != null) {
                            for (File file4 : listFiles3) {
                                if (file4.canRead() && file4.canWrite()) {
                                    return file4;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final File k(Context context) {
        File n = n(context);
        return n != null ? n : context.getCacheDir();
    }

    public static int l(Context context) {
        return ax.t3.j.l(context);
    }

    public static int m(Context context) {
        return ax.t3.j.l(context);
    }

    private static File n(Context context) {
        try {
            if (l == null) {
                l = context.getExternalCacheDir();
            }
            return l;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static File o(Context context) {
        File y = K.y();
        if (y == null) {
            return k(context);
        }
        File file = new File(y, "/Android/media/com.voxdon.xplorer/.localcache");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, ".nomedia");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    private static File p(Context context) {
        try {
            File file = k;
            if (file == null) {
                k = context.getExternalFilesDir(null);
            } else if (!file.exists()) {
                k = context.getExternalFilesDir(null);
            }
            return k;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static final File q(Context context) {
        File p = p(context);
        return p != null ? p : context.getFilesDir();
    }

    private static f r(u uVar, boolean z) {
        switch (d.a[uVar.a.ordinal()]) {
            case 1:
                return f.o0;
            case 2:
                return f.p0;
            case 3:
                return f.d1;
            case 4:
                return f.e1;
            case 5:
                return z ? f.w0 : f.f1;
            case 6:
                return f.g1;
            case 7:
                return z ? f.v0 : f.c1;
            default:
                return null;
        }
    }

    public static final String s(Context context) {
        if (b == null) {
            P();
        }
        C0177e c0177e = b;
        String str = c0177e.d;
        return c0177e.c ? "shared".equals(str) ? context.getString(R.string.sdcard_used_as_mass_storage) : context.getString(R.string.no_sdcard) : "shared".equals(str) ? context.getString(R.string.usb_storage_used_as_mass_storage) : context.getString(R.string.usb_storage_no_mount);
    }

    public static File t(Context context) {
        File y;
        if (!Q.L() || (y = K.y()) == null) {
            return null;
        }
        File file = new File(y, ".localcache");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public static final C0177e u() {
        if (a()) {
            if (b != null) {
                a.fine("PRIMARY STORAGE STATUS CHANGED!!!!");
            }
            P();
        }
        return b;
    }

    public static final String v() {
        if (b == null) {
            P();
        }
        File file = b.b;
        if (file != null) {
            return file.getAbsolutePath();
        }
        File y = K.y();
        if (y == null) {
            ax.Ha.c.h().f().d("GET MAIN STORAGE PATH FAILED").g("null").h();
            return "/";
        }
        ax.Ha.c.h().f().d("GET MAIN STORAGE PATH FAILED").g(y.getAbsolutePath()).h();
        return "/";
    }

    public static final File w(Context context) {
        File file = new File(context.getFilesDir(), "storage_index");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static final C0177e x() {
        if (b()) {
            if (c != null) {
                a.fine("SECONDARY STORAGE STATUS CHANGED!!!!");
            }
            P();
        }
        return c;
    }

    public static final String y() {
        if (c == null) {
            P();
        }
        File file = c.b;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static final r z() {
        if (c == null) {
            P();
        }
        return c.e;
    }
}
