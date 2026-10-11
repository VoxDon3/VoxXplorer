package ax.X2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import ax.Z2.u;
import ax.c3.d0;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class K {
    private static final Logger a = ax.Q2.g.a(K.class);
    static String[] b = {"IPSM", "external_sd1", "external_sd2", "extsd", "external_sd", "fakeUuid"};
    static String[] c = {"/storage/sdcard1", "/storage/extSdCard", "/storage/external_SD", "/storage/ext_sd", "/storage/external_sd", "/storage/extsd", "/storage/ext_sdcard1"};

    @SuppressLint({"SdCardPath"})
    static String[] d = {"/storage/sdcard1", "/storage/extSdCard", "/storage/external_SD", "/storage/ext_sd", "/storage/removable/sdcard1", "/storage/external_sd", "/storage/extsd", "/mnt/ext_card", "/mnt/sdcard2", "/mnt/external1", "/mnt/sdcard-ext", "/mnt/extSdCard", "/mnt/sdextcard", "/mnt/external_sd", "/mnt/extsd"};

    @SuppressLint({"SdCardPath"})
    static String[] e = {"/mnt/sdcard/external_sd", "/mnt/sdcard/ext_sd", "/mnt/sdcard/_ExternalSD"};
    static String[] f = {"samsung", "htc", "lge"};
    static HashMap<String, u.a> g = new HashMap<>();
    static HashSet<String> h = new HashSet<>(Arrays.asList(b));

    static String A() {
        File[] listFiles = new File("/storage").listFiles();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file != null) {
                    String name = file.getName();
                    if (!"emulated".equalsIgnoreCase(name) && !"self".equalsIgnoreCase(name) && !"enc_emulated".equalsIgnoreCase(name) && !"Private".equalsIgnoreCase(name) && !"remote".equalsIgnoreCase(name)) {
                        str = str + name + ",";
                    }
                }
            }
        }
        return str;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0063: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:100), block:B:34:0x0063 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static ax.Z2.u.a B(ax.X2.N r7) {
        /*
            java.lang.String r0 = r7.l()
            r1 = 0
            java.util.Scanner r2 = new java.util.Scanner     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r4 = "/proc/mounts"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            if (r3 == 0) goto L67
            java.lang.String r3 = r2.nextLine()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r4 = r3.trim()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r5 = "/dev/block/vold/public"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            if (r5 == 0) goto L11
            boolean r3 = r3.contains(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            if (r3 == 0) goto L11
            java.lang.String r3 = "\\s+"
            java.lang.String[] r3 = r4.split(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r4 = 16
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.util.logging.Logger r4 = ax.X2.K.a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r5.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r6 = "StorageVolume Id (/proc/mounts) : "
            r5.append(r6)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r5.append(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r4.fine(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            ax.Z2.u$a r3 = t(r7, r0, r3, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            if (r3 == 0) goto L11
            r2.close()
            return r3
        L62:
            r7 = move-exception
            r1 = r2
            goto L78
        L65:
            r7 = move-exception
            goto L6f
        L67:
            r2.close()
            return r1
        L6b:
            r7 = move-exception
            goto L78
        L6d:
            r7 = move-exception
            r2 = r1
        L6f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L77
            r2.close()
        L77:
            return r1
        L78:
            if (r1 == 0) goto L7d
            r1.close()
        L7d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.K.B(ax.X2.N):ax.Z2.u$a");
    }

    private static u.a C(StorageManager storageManager, N n) {
        O i;
        try {
            i = w.i(storageManager, n);
        } catch (Exception unused) {
        }
        if (n.n() != null) {
            return t(n, n.l(), n.n(), i);
        }
        if (i != null) {
            return u(n.l(), i);
        }
        return null;
    }

    private static u.a D(StorageManager storageManager, N n) {
        u.a aVar = g.get(P(n.l(), n.n()));
        if (aVar != null) {
            return aVar;
        }
        u.a C = C(storageManager, n);
        if (C != null) {
            return C;
        }
        u.a B = B(n);
        return B != null ? B : u.a.UNKNOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0181, code lost:
    
        if ("/storage/emulated/0".equals(r4.f) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018a, code lost:
    
        if (D(r2, r7) == ax.Z2.u.a.USB) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<ax.Z2.u> E() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.K.E():java.util.List");
    }

    public static String F(String str, String str2) {
        String l;
        try {
            for (N n : C1155a.b((StorageManager) ax.Q2.b.h().g().getSystemService("storage"))) {
                if (!n.p() && (l = n.l()) != null && !"Private".equalsIgnoreCase(l)) {
                    String n2 = n.n();
                    if (C3180B.j(l, str) && C3180B.j(n2, str2)) {
                        String i = n.i();
                        return i == null ? "unknown" : i;
                    }
                }
            }
            return (Build.VERSION.SDK_INT == 23 && r().contains(str)) ? "mounted" : "unknown";
        } catch (Exception e2) {
            ax.Ha.c.h().f().d("GET VOLUME STATE EXCEPTION").l(e2).h();
            return "unknown";
        }
    }

    private static boolean G(List<ax.Z2.u> list, String str, String str2) {
        for (ax.Z2.u uVar : list) {
            if (C3180B.j(str, uVar.b) && C3180B.j(str2, uVar.g)) {
                return true;
            }
        }
        return false;
    }

    private static boolean H(String str) {
        if (str == null) {
            return true;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '-') {
                i++;
            }
        }
        if (i <= 3) {
            return false;
        }
        a.severe("Broken volume detected : " + str);
        return true;
    }

    private static boolean I(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean J(String str) {
        return str.startsWith("/storage/emulated/");
    }

    public static boolean K(String str) {
        return str != null && str.length() == 9 && str.charAt(4) == '-';
    }

    public static boolean L(String str) {
        return h.contains(str);
    }

    static boolean M(File file, File file2) {
        if (file != null && file2 != null) {
            if (Q.P1()) {
                try {
                    StructStat stat = Os.stat(file.getAbsolutePath());
                    StructStat stat2 = Os.stat(file2.getAbsolutePath());
                    long j = stat.st_ino;
                    if (j != 0) {
                        return j == stat2.st_ino;
                    }
                    if (stat.st_mtime != stat2.st_mtime) {
                        return false;
                    }
                    long j2 = stat.st_dev;
                    if (j2 != 0 && j2 != stat2.st_dev) {
                        return false;
                    }
                } catch (Exception unused) {
                }
            }
            if (file.lastModified() != file2.lastModified()) {
                return false;
            }
            if (new File(file, "Android").lastModified() != new File(file2, "Android").lastModified()) {
                return false;
            }
            if ("/storage/sdcard0".equals(file.getAbsolutePath()) && ("/storage/emulated/0".equals(file2.getAbsolutePath()) || "/storage/emulated/legacy".equals(file2.getAbsolutePath()))) {
                return true;
            }
            if (new File(file, ".android_secure").lastModified() != new File(file2, ".android_secure").lastModified()) {
                return false;
            }
            String[] list = file.list();
            String[] list2 = file2.list();
            if (list != null && list2 != null && list.length == list2.length) {
                ax.Ha.c.h().f().c("SAME FOLDER CHECK 1?").g(file.getAbsolutePath() + "," + file2.getAbsolutePath()).h();
                return true;
            }
            ax.Ha.c.h().f().c("SAME FOLDER CHECK 2?").g(file.getAbsolutePath() + "," + file2.getAbsolutePath()).h();
        }
        return false;
    }

    public static boolean N(String str) {
        if (str == null) {
            return false;
        }
        if (str.matches("[0-9A-Z]{16}")) {
            return true;
        }
        return (str.length() == 36 && str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-') || str.matches("[0-9A-Z]{40}");
    }

    private static boolean O(Context context, String str) {
        StorageManager storageManager;
        N a2;
        return (context == null || (a2 = C1155a.a((storageManager = (StorageManager) context.getSystemService("storage")), new File(str))) == null || a2.l() == null || !ax.Z2.u.c(D(storageManager, a2))) ? false : true;
    }

    private static String P(String str, String str2) {
        return str + ":" + str2;
    }

    public static void Q(String str, String str2, u.a aVar) {
        g.put(P(str, str2), aVar);
    }

    private static void R(N n, String str, String str2, String str3, O o, boolean z, boolean z2) {
        if (!ax.t3.k.v() || str == null || str.startsWith("/media/fuse/crostini")) {
            return;
        }
        int e2 = o != null ? o.e() : 0;
        if (z2) {
            ax.Ha.c.h().f().c("Unknown Volume Id format chrome 1:").g("volumeId:" + S(str) + ",desc:" + str2 + ",path:" + str3 + ",flags:" + e2).h();
            return;
        }
        if (z) {
            ax.Ha.c.h().f().c("Unknown Volume Id format chrome 2:").g("volumeId:" + S(str) + ",desc:" + str2 + ",path:" + str3 + ",flags:" + e2).h();
            return;
        }
        if (str3 == null || !str3.endsWith("-999")) {
            if (str2 == null || !str2.startsWith("caf-999")) {
                if (str3 == null || !str3.equals("/storage/emulated/0")) {
                    ax.Ha.c.h().f().c("Unknown Volume Id format 3:").g("volumeId:" + S(str) + ",desc:" + str2 + ",path:" + str3 + ",flags:" + e2).h();
                    return;
                }
                File y = y();
                String absolutePath = y != null ? y.getAbsolutePath() : "null";
                ax.Ha.c.h().f().b("!!!Unknown Primary!!!").j().g("volumeId:" + S(str) + ",desc:" + str2 + ",path:" + str3 + ",flags:" + e2 + ",primary:" + absolutePath).h();
            }
        }
    }

    static String S(String str) {
        String[] split = str.split("[,_.-]");
        if (!str.equals(split[0])) {
            return split[0];
        }
        int W = C3180B.W(str, ':', 2);
        if (W != -1) {
            return str.substring(0, W);
        }
        if (str.length() <= 0 || !I(str.charAt(0))) {
            return str;
        }
        String[] split2 = str.split("[,_:]");
        return !str.equals(split2[0]) ? split2[0] : str;
    }

    public static boolean a(Context context) {
        List<O> n = w.n((StorageManager) context.getSystemService("storage"));
        if (n == null) {
            return false;
        }
        for (O o : n) {
            if (o.j() && o.i() && o.g() != null && o.g().startsWith("/mnt/expand")) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(19)
    private static final String b(List<String> list) {
        List<File> x = x();
        String str = null;
        if (x != null && x.size() != 0) {
            File y = y();
            for (int i = 0; i < x.size(); i++) {
                String absolutePath = x.get(i).getAbsolutePath();
                if (y == null || !absolutePath.startsWith(y.getAbsolutePath())) {
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            if (absolutePath.startsWith(it.next())) {
                                break;
                            }
                        }
                    }
                    int indexOf = absolutePath.indexOf("/Android");
                    if (indexOf != -1) {
                        String substring = absolutePath.substring(0, indexOf);
                        File file = new File(substring);
                        if (J(substring) && M(y, file)) {
                            if (!"/storage/sdcard0".equals(y.getAbsolutePath())) {
                                ax.Ha.c.h().f().c("EMULATED STORAGE IS ACTULLAY PRIMARY STORAGE").g("index:" + x.size() + ",path:" + substring + ",external:" + y.getAbsolutePath()).h();
                            }
                        } else if (file.exists() && file.isDirectory() && (str == null || "/storage/sdcard1".equals(substring))) {
                            str = substring;
                        }
                    } else {
                        ax.Ha.c.h().f().d("ERROR STORAGE PATH").g(absolutePath).h();
                    }
                }
            }
        }
        return str;
    }

    public static final ax.Z2.m c() {
        int i = Build.VERSION.SDK_INT;
        return i >= 24 ? j() : i >= 23 ? h() : new ax.Z2.m(g(), null);
    }

    private static final String d() {
        File y = y();
        String absolutePath = y != null ? y.getAbsolutePath() : null;
        int i = 0;
        for (String str : d) {
            if (absolutePath == null || !absolutePath.equals(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory() && file.canRead()) {
                    return str;
                }
            }
        }
        String e2 = e();
        if (e2 != null) {
            File file2 = new File(e2);
            if (file2.exists() && file2.isDirectory()) {
                return e2;
            }
        }
        while (true) {
            String[] strArr = e;
            if (i >= strArr.length) {
                return null;
            }
            String str2 = strArr[i];
            String str3 = f[i];
            File file3 = new File(str2);
            if (file3.exists() && file3.isDirectory() && str3.equals(Build.MANUFACTURER)) {
                return str2;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012f, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0135, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0131, code lost:
    
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String e() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.K.e():java.lang.String");
    }

    private static final String f(List<String> list) {
        String o = o();
        if (o == null) {
            o = b(list);
        }
        String str = System.getenv("SECONDARY_STORAGE");
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.pathSeparator);
            String str2 = null;
            if (split.length > 1) {
                for (String str3 : split) {
                    if (!str3.toLowerCase().contains("usb")) {
                        if (str3.equals(o)) {
                            return str3;
                        }
                        str2 = str3;
                    }
                }
            }
            if (split.length > 0) {
                if (str2 == null) {
                    str2 = split[0];
                }
                File y = y();
                File file = new File(str2);
                if (J(str2)) {
                    try {
                        if (!M(y, file)) {
                            if (!file.exists() && o != null) {
                                return o;
                            }
                        }
                    } catch (Exception unused) {
                    }
                } else if (!file.exists() && o != null) {
                    return o;
                }
                return str2;
            }
        }
        return o != null ? o : d();
    }

    private static final String g() {
        return f(null);
    }

    private static final ax.Z2.m h() {
        ArrayList arrayList;
        String b2 = b(null);
        if (b2 == null) {
            arrayList = null;
        } else {
            if (!O(ax.Q2.b.h().g(), b2)) {
                return new ax.Z2.m(b2, null);
            }
            arrayList = new ArrayList();
            arrayList.add(b2);
        }
        ax.Z2.m i = i();
        if (i != null) {
            return i;
        }
        String f2 = f(arrayList);
        if (f2 != null && !O(ax.Q2.b.h().g(), f2)) {
            try {
                if (new File(f2).exists()) {
                    return new ax.Z2.m(f2, null);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final ax.Z2.m i() {
        try {
            Context g2 = ax.Q2.b.h().g();
            StorageManager storageManager = (StorageManager) g2.getSystemService("storage");
            for (N n : C1155a.b(storageManager)) {
                if (!n.p()) {
                    String l = n.l();
                    if (!TextUtils.isEmpty(l) && !"Private".equalsIgnoreCase(l) && !ax.Z2.u.a(D(storageManager, n))) {
                        n.n();
                        String a2 = n.a(g2);
                        String z = z(l);
                        if (y() == null || !z.equals(y().getAbsolutePath())) {
                            File file = new File(z);
                            if (K(l)) {
                                if (!file.exists()) {
                                    String o = o();
                                    if (o != null) {
                                        return new ax.Z2.m(o, null);
                                    }
                                    String A = A();
                                    if (!TextUtils.isEmpty(A)) {
                                        ax.Ha.c.h().f().c("UUID is OK but File Not Found. More Info V23").g(A + ",desc:" + a2).h();
                                    }
                                }
                                return new ax.Z2.m(z, n);
                            }
                            String i = n.i();
                            if ("mounted".equals(i) && file.exists() && file.isDirectory()) {
                                if (!N(l)) {
                                    ax.Ha.c.h().f().c("INVALID UUID HAS FILE?? V23").g("uuid=" + l + ",desc=" + a2 + ",read=" + file.canRead() + ",state=" + i).h();
                                }
                                if (file.canRead()) {
                                    return new ax.Z2.m(z, n);
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            ax.Ha.c.h().f().d("6.0 HIDDEN API EXCEPTION").l(e2).h();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed A[SYNTHETIC] */
    @android.annotation.TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final ax.Z2.m j() {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.K.j():ax.Z2.m");
    }

    public static ax.Z2.r k(String str) {
        int i = Build.VERSION.SDK_INT;
        return i >= 24 ? n(str) : i >= 23 ? m(str) : l(str);
    }

    @TargetApi(21)
    private static final ax.Z2.r l(String str) {
        return p(str);
    }

    @TargetApi(23)
    private static final ax.Z2.r m(String str) {
        return p(str);
    }

    @TargetApi(24)
    private static final ax.Z2.r n(String str) {
        return p(str);
    }

    private static final String o() {
        File y = y();
        String absolutePath = y != null ? y.getAbsolutePath() : null;
        try {
            for (String str : c) {
                if (!str.equals(absolutePath)) {
                    File file = new File(str);
                    if (file.exists() && file.isDirectory() && file.canRead()) {
                        return str;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @TargetApi(21)
    private static final ax.Z2.r p(String str) {
        String str2;
        if (str == null) {
            return ax.Z2.r.NO_DEVICE;
        }
        try {
            str2 = Environment.getExternalStorageState(new File(str));
        } catch (NullPointerException unused) {
            str2 = "chrome os 9 null pointer error";
        }
        if ("mounted".equals(str2) || "mounted_ro".equals(str2)) {
            return ax.Z2.r.AVAILABLE;
        }
        if ("unknown".equals(str2)) {
            File file = new File(str);
            return (file.exists() && file.isDirectory() && file.canRead()) ? ax.Z2.r.AVAILABLE : ax.Z2.r.NOT_AVAILABLE;
        }
        File file2 = new File(str);
        if (!file2.exists() || !file2.isDirectory() || !file2.canRead()) {
            return ax.Z2.r.NOT_AVAILABLE;
        }
        String[] list = file2.list();
        return (list == null ? -1 : list.length) > 0 ? ax.Z2.r.AVAILABLE : ax.Z2.r.NOT_AVAILABLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
    
        if (r1 == null) goto L32;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q() {
        /*
            java.lang.String r0 = "/dev/block/vold/8"
            boolean r1 = ax.X2.Q.R1()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.Scanner r1 = new java.util.Scanner     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            java.lang.String r4 = "/proc/mounts"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
        L16:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            if (r3 == 0) goto L5f
            java.lang.String r3 = r1.nextLine()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            java.lang.String r4 = r3.trim()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            boolean r5 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            if (r5 == 0) goto L16
            java.lang.String r5 = "[,_:]"
            java.lang.String[] r4 = r4.split(r5)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            r5 = 0
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            if (r4 == 0) goto L16
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            r5 = 2
            if (r4 >= r5) goto L4a
            goto L16
        L4a:
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            java.lang.String r4 = "/mnt/media_rw"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5d
            if (r4 == 0) goto L56
            goto L16
        L56:
            r1.close()
            return r3
        L5a:
            r0 = move-exception
            r2 = r1
            goto L6e
        L5d:
            r0 = move-exception
            goto L67
        L5f:
            r1.close()
            goto L6d
        L63:
            r0 = move-exception
            goto L6e
        L65:
            r0 = move-exception
            r1 = r2
        L67:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L6d
            goto L5f
        L6d:
            return r2
        L6e:
            if (r2 == 0) goto L73
            r2.close()
        L73:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.K.q():java.lang.String");
    }

    private static Set<String> r() {
        ax.B.b bVar = new ax.B.b();
        Scanner scanner = null;
        try {
            try {
                Scanner scanner2 = new Scanner(new File("/proc/mounts"));
                while (scanner2.hasNext()) {
                    try {
                        String nextLine = scanner2.nextLine();
                        String lowerCase = nextLine.trim().toLowerCase(Locale.US);
                        if (lowerCase.startsWith("/dev/block/vold/public:8") && "public:8".equals(S(lowerCase.split("\\s+")[0].substring(16)))) {
                            String[] split = nextLine.split("\\s+");
                            if (split.length >= 2) {
                                String str = split[1];
                                String h2 = d0.h(str);
                                if (K(h2)) {
                                    bVar.add(h2);
                                } else if (N(h2)) {
                                    bVar.add(h2);
                                } else if (str.startsWith("/mnt/media_rw/") && new File(z(h2)).exists()) {
                                    bVar.add(h2);
                                }
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        scanner = scanner2;
                        e.printStackTrace();
                        if (scanner != null) {
                            scanner.close();
                        }
                        return bVar;
                    } catch (Throwable th) {
                        th = th;
                        scanner = scanner2;
                        if (scanner != null) {
                            scanner.close();
                        }
                        throw th;
                    }
                }
                scanner2.close();
                return bVar;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static List<ax.Z2.u> s() {
        String l;
        String c2;
        ArrayList arrayList = new ArrayList();
        try {
            Context g2 = ax.Q2.b.h().g();
            StorageManager storageManager = (StorageManager) g2.getSystemService("storage");
            for (N n : C1155a.b(storageManager)) {
                if (!n.p() && (l = n.l()) != null && !"Private".equalsIgnoreCase(l)) {
                    u.a D = D(storageManager, n);
                    if (ax.Z2.u.c(D)) {
                        String i = n.i();
                        if ("mounted".equals(i)) {
                            String k = n.k();
                            String a2 = n.a(g2);
                            String str = (!H(a2) || (c2 = n.c(storageManager)) == null) ? a2 : c2;
                            String n2 = n.n();
                            a.fine("USB VOLUME DETECTED : " + l + "," + k + "," + str);
                            arrayList.add(new ax.Z2.u(D, l, n2, str, i, k, true));
                        }
                    }
                }
            }
            if (arrayList.size() == 0 && Build.VERSION.SDK_INT == 23) {
                Iterator<String> it = r().iterator();
                while (it.hasNext()) {
                    arrayList.add(new ax.Z2.u(u.a.USB, it.next(), "public:8,49", g2.getString(R.string.location_usbstorage), "mounted", null, true));
                }
            }
            return arrayList;
        } catch (Exception e2) {
            ax.Ha.c.h().f().d("6.0 HIDDEN API EXCEPTION").l(e2).h();
            return arrayList;
        }
    }

    static u.a t(N n, String str, String str2, O o) {
        String k;
        if (str2 == null) {
            return null;
        }
        String lowerCase = S(str2).toLowerCase();
        if (o != null && o.j()) {
            if ("public:8".equals(lowerCase)) {
                u.a aVar = u.a.USB;
                Q(str, str2, aVar);
                return aVar;
            }
            if (o.k() && J.q() && (k = n.k()) != null && k.equals("/storage/0000000000000000000000000000CAFEF00D2019")) {
                u.a aVar2 = u.a.CHROMEOS;
                Q(str, str2, aVar2);
                return aVar2;
            }
            u.a aVar3 = u.a.SDCARD;
            Q(str, str2, aVar3);
            return aVar3;
        }
        if ("public:8".equals(lowerCase) || "8".equals(lowerCase)) {
            u.a aVar4 = u.a.USB;
            Q(str, str2, aVar4);
            return aVar4;
        }
        if ("public:179".equals(lowerCase) || "179".equals(lowerCase)) {
            u.a aVar5 = u.a.SDCARD;
            Q(str, str2, aVar5);
            return aVar5;
        }
        if ("public:253".equals(lowerCase) || "253".equals(lowerCase)) {
            u.a aVar6 = u.a.SDCARD;
            Q(str, str2, aVar6);
            return aVar6;
        }
        if ("public:200".equals(lowerCase) || "200".equals(lowerCase)) {
            try {
                String a2 = n.a(ax.Q2.b.h().g());
                if (a2 != null && !a2.startsWith("U+")) {
                    ax.Ha.c.h().f().b("Unknown Volume Id 200:").g("volumeId:" + S(str2) + ",desc:" + a2).h();
                }
            } catch (Exception unused) {
            }
            return u.a.IGNORE;
        }
        if ("public:11".equals(lowerCase) || "11".equals(lowerCase)) {
            u.a aVar7 = u.a.ODD;
            Q(str, str2, aVar7);
            return aVar7;
        }
        if (!J.q()) {
            if (o != null && o.l()) {
                u.a aVar8 = u.a.USB;
                Q(str, str2, aVar8);
                return aVar8;
            }
            if (J.B() && ("emulated;95".equals(lowerCase) || "emulated;96".equals(lowerCase))) {
                return u.a.IGNORE;
            }
            try {
                R(n, str2, n.a(ax.Q2.b.h().g()), n.k(), o, false, false);
            } catch (Exception unused2) {
            }
            return null;
        }
        String a3 = n.a(ax.Q2.b.h().g());
        String k2 = n.k();
        if (lowerCase.startsWith("/media/removable/")) {
            if (lowerCase.startsWith("/media/removable/cdrom") || lowerCase.startsWith("/media/removable/usb_dsd")) {
                u.a aVar9 = u.a.ODD;
                Q(str, str2, aVar9);
                return aVar9;
            }
            if (lowerCase.contains("usb")) {
                u.a aVar10 = u.a.USB;
                Q(str, str2, aVar10);
                return aVar10;
            }
            if (o != null && o.l()) {
                u.a aVar11 = u.a.USB;
                Q(str, str2, aVar11);
                return aVar11;
            }
            try {
                R(n, str2, a3, k2, o, true, true);
            } catch (Exception unused3) {
            }
            u.a aVar12 = u.a.UNKNOWN_STORAGE;
            Q(str, str2, aVar12);
            return aVar12;
        }
        if ("/home/chronos/user/MyFiles".equals(str2)) {
            u.a aVar13 = u.a.CHROMEOS;
            Q(str, str2, aVar13);
            return aVar13;
        }
        if ("/storage/MyFiles".equals(k2)) {
            u.a aVar14 = u.a.CHROMEOS;
            Q(str, str2, aVar14);
            return aVar14;
        }
        if (o != null && o.l()) {
            u.a aVar15 = u.a.USB;
            Q(str, str2, aVar15);
            return aVar15;
        }
        if (k2 != null && (k2.equals("/storage/0000000000000000000000000000CAFEF00D2019") || (k2.startsWith("/storage/") && o != null && o.e() == 48))) {
            u.a aVar16 = u.a.CHROMEOS;
            Q(str, str2, aVar16);
            return aVar16;
        }
        if (k2 != null && k2.startsWith("/storage/")) {
            File file = new File(d0.Q(k2, "Downloads"));
            if (file.exists()) {
                File file2 = new File("/storage/emulated/0/Download");
                if (file2.exists() && file.lastModified() == file2.lastModified()) {
                    u.a aVar17 = u.a.CHROMEOS;
                    Q(str, str2, aVar17);
                    return aVar17;
                }
            }
        }
        try {
            R(n, str2, a3, k2, o, true, false);
        } catch (Exception unused4) {
        }
        u.a aVar18 = u.a.UNKNOWN_STORAGE;
        Q(str, str2, aVar18);
        return aVar18;
    }

    private static u.a u(String str, O o) {
        if (o != null && o.j()) {
            u.a aVar = u.a.SDCARD;
            Q(str, HttpUrl.FRAGMENT_ENCODE_SET, aVar);
            return aVar;
        }
        if (o == null || !o.l()) {
            return null;
        }
        u.a aVar2 = u.a.USB;
        Q(str, HttpUrl.FRAGMENT_ENCODE_SET, aVar2);
        return aVar2;
    }

    private static final String v(Context context, String str) {
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        File[] listFiles = new File("/storage").listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file : listFiles) {
            N a2 = C1155a.a(storageManager, file);
            if (a2 != null && a2.l() != null && a2.l().equals(str)) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    private static final String w(String str) {
        if (str != null && !str.startsWith("/media/removable")) {
            return null;
        }
        return "/storage/removable_" + d0.h(str);
    }

    @TargetApi(19)
    public static List<File> x() {
        File y;
        ArrayList arrayList = new ArrayList();
        File[] fileArr = null;
        try {
            fileArr = ax.Q2.b.h().g().getExternalFilesDirs(null);
        } catch (NullPointerException | SecurityException unused) {
        }
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file != null && ((y = y()) == null || !file.getAbsolutePath().startsWith(y.getAbsolutePath()))) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static File y() {
        try {
            return Environment.getExternalStorageDirectory();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e2) {
            ax.Ha.c.h().f().b("PRIMARY STORAGE FAILED").l(e2).h();
            return null;
        }
    }

    public static String z(String str) {
        return "/storage/" + str;
    }
}
