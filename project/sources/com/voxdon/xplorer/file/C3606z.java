package com.voxdon.xplorer.file;

import android.content.Context;
import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import ax.c3.d0;
import ax.u3.C3200r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.RealWebSocket;

/* renamed from: com.voxdon.xplorer.file.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3606z {
    private static final Logger d = Logger.getLogger("FileManager.LocalFileRootAccess");
    private static final SimpleDateFormat e;
    private static final SimpleDateFormat f;
    private static final SimpleDateFormat g;
    private static final SimpleDateFormat h;
    private static final SimpleDateFormat i;
    private static C3606z j;
    private static C3606z k;
    private static final HashSet<String> l;
    private boolean a;
    private Boolean b;
    private Pattern c = Pattern.compile("\u001b\\[[;\\d]*m");

    /* renamed from: com.voxdon.xplorer.file.z$a */
    static class a {
        int a;
        int b;
        int c;
        int d;

        a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = i4;
        }

        static int c(int i) {
            return i & 61440;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return this.d == 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            return this.d == 4096;
        }
    }

    /* renamed from: com.voxdon.xplorer.file.z$b */
    private static class b {
        String a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        long f;
        long g;

        b(String str, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = j;
            this.g = j2;
        }
    }

    /* renamed from: com.voxdon.xplorer.file.z$c */
    class c extends FileOutputStream implements AutoCloseable {
        private String c0;
        private a d0;
        private boolean e0;
        private String q;

        c(String str, String str2, a aVar) throws IOException {
            super(str2);
            this.e0 = false;
            this.c0 = str;
            this.q = str2;
            this.d0 = aVar;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            if (this.e0) {
                return;
            }
            this.e0 = true;
            if (!C3606z.this.P(this.q, this.c0, true)) {
                throw new IOException("Move temp file to the path failed");
            }
            a aVar = this.d0;
            if (aVar == null) {
                C3606z.this.W(this.c0, false);
                return;
            }
            C3606z.this.d(this.c0, aVar.c);
            C3606z c3606z = C3606z.this;
            String str = this.c0;
            a aVar2 = this.d0;
            c3606z.e(str, aVar2.a, aVar2.b);
        }
    }

    static {
        Locale locale = Locale.US;
        e = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
        f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", locale);
        g = new SimpleDateFormat("yyyyMMdd.HHmmss", locale);
        h = new SimpleDateFormat("yyyyMMddHHmm.ssSSS", locale);
        i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
        l = new HashSet<>(Arrays.asList("ext_data_rw", "ext_obb_rw", "media_rw", "external_storage"));
    }

    C3606z(boolean z) {
        this.a = z;
    }

    private static String B(int i2) {
        return String.format("%o", Integer.valueOf(i2));
    }

    private FileOutputStream E(AbstractC3595n abstractC3595n) {
        String E = abstractC3595n.E();
        try {
            return new c(E, I(abstractC3595n.x()).getAbsolutePath(), m(E) ? t(E) : null);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private FileOutputStream F(String str, boolean z) {
        int p = p(str);
        if (p < 0) {
            return null;
        }
        boolean N = N(p, 2);
        if (!N && !d(str, p | 2)) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str, z);
            if (!N) {
                d(str, p);
            }
            return fileOutputStream;
        } catch (IOException unused) {
            if (!N) {
                d(str, p);
            }
            return null;
        } catch (Throwable th) {
            if (!N) {
                d(str, p);
            }
            throw th;
        }
    }

    private static File I(Context context) {
        File file;
        File cacheDir = context.getCacheDir();
        do {
            file = new File(cacheDir, String.valueOf(new Random().nextLong()));
        } while (file.exists());
        return file;
    }

    public static long J(String str) {
        try {
            return e.parse(str).getTime();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    private static boolean L(String str) {
        return "sh".equals(d0.k(str));
    }

    private boolean M(Context context) {
        if (this.b == null) {
            if (ax.X2.Q.Q0()) {
                this.b = Boolean.valueOf(l("ls -lan --full-time /", 10000L) != null);
            } else {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue();
    }

    private static boolean N(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    private static C3597p Q(ArrayList<String> arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str = arrayList.get(i2);
            if (!str.startsWith("total")) {
                String[] split = str.split("\\s+");
                if (split.length < 4) {
                    continue;
                } else {
                    try {
                        return new C3597p(split[2], split[3], split[0]);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:11:0x002d, B:14:0x0052, B:16:0x005c, B:23:0x00a6, B:25:0x00ae, B:27:0x0111, B:31:0x0121, B:33:0x0129, B:34:0x013e, B:36:0x0146, B:38:0x014c, B:41:0x0174, B:44:0x0157, B:46:0x0161, B:48:0x016b, B:51:0x0138, B:52:0x0134, B:54:0x0118, B:55:0x00d4, B:56:0x00f6, B:59:0x006f, B:60:0x0080, B:62:0x0086, B:63:0x0093, B:64:0x017d, B:66:0x0189), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:11:0x002d, B:14:0x0052, B:16:0x005c, B:23:0x00a6, B:25:0x00ae, B:27:0x0111, B:31:0x0121, B:33:0x0129, B:34:0x013e, B:36:0x0146, B:38:0x014c, B:41:0x0174, B:44:0x0157, B:46:0x0161, B:48:0x016b, B:51:0x0138, B:52:0x0134, B:54:0x0118, B:55:0x00d4, B:56:0x00f6, B:59:0x006f, B:60:0x0080, B:62:0x0086, B:63:0x0093, B:64:0x017d, B:66:0x0189), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:11:0x002d, B:14:0x0052, B:16:0x005c, B:23:0x00a6, B:25:0x00ae, B:27:0x0111, B:31:0x0121, B:33:0x0129, B:34:0x013e, B:36:0x0146, B:38:0x014c, B:41:0x0174, B:44:0x0157, B:46:0x0161, B:48:0x016b, B:51:0x0138, B:52:0x0134, B:54:0x0118, B:55:0x00d4, B:56:0x00f6, B:59:0x006f, B:60:0x0080, B:62:0x0086, B:63:0x0093, B:64:0x017d, B:66:0x0189), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:11:0x002d, B:14:0x0052, B:16:0x005c, B:23:0x00a6, B:25:0x00ae, B:27:0x0111, B:31:0x0121, B:33:0x0129, B:34:0x013e, B:36:0x0146, B:38:0x014c, B:41:0x0174, B:44:0x0157, B:46:0x0161, B:48:0x016b, B:51:0x0138, B:52:0x0134, B:54:0x0118, B:55:0x00d4, B:56:0x00f6, B:59:0x006f, B:60:0x0080, B:62:0x0086, B:63:0x0093, B:64:0x017d, B:66:0x0189), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:11:0x002d, B:14:0x0052, B:16:0x005c, B:23:0x00a6, B:25:0x00ae, B:27:0x0111, B:31:0x0121, B:33:0x0129, B:34:0x013e, B:36:0x0146, B:38:0x014c, B:41:0x0174, B:44:0x0157, B:46:0x0161, B:48:0x016b, B:51:0x0138, B:52:0x0134, B:54:0x0118, B:55:0x00d4, B:56:0x00f6, B:59:0x006f, B:60:0x0080, B:62:0x0086, B:63:0x0093, B:64:0x017d, B:66:0x0189), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:11:0x002d, B:14:0x0052, B:16:0x005c, B:23:0x00a6, B:25:0x00ae, B:27:0x0111, B:31:0x0121, B:33:0x0129, B:34:0x013e, B:36:0x0146, B:38:0x014c, B:41:0x0174, B:44:0x0157, B:46:0x0161, B:48:0x016b, B:51:0x0138, B:52:0x0134, B:54:0x0118, B:55:0x00d4, B:56:0x00f6, B:59:0x006f, B:60:0x0080, B:62:0x0086, B:63:0x0093, B:64:0x017d, B:66:0x0189), top: B:8:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.voxdon.xplorer.file.C3606z.b R(java.lang.String r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3606z.R(java.lang.String, java.lang.String, boolean, boolean):com.voxdon.xplorer.file.z$b");
    }

    private static int S(String str) {
        if (str.length() != 10) {
            return -1;
        }
        int i2 = str.charAt(1) == 'r' ? 256 : 0;
        if (str.charAt(2) == 'w') {
            i2 |= 128;
        }
        if (str.charAt(3) == 'x') {
            i2 |= 64;
        } else if (str.charAt(3) == 's') {
            i2 |= 2112;
        } else if (str.charAt(3) == 'S') {
            i2 |= 2048;
        }
        if (str.charAt(4) == 'r') {
            i2 |= 32;
        }
        if (str.charAt(5) == 'w') {
            i2 |= 16;
        }
        if (str.charAt(6) == 'x') {
            i2 |= 8;
        } else if (str.charAt(6) == 's') {
            i2 |= 1032;
        } else if (str.charAt(6) == 'S') {
            i2 |= 1024;
        }
        if (str.charAt(7) == 'r') {
            i2 |= 4;
        }
        if (str.charAt(8) == 'w') {
            i2 |= 2;
        }
        return str.charAt(9) == 'x' ? i2 | 1 : i2;
    }

    private static int T(String str) {
        if (str.length() != 10) {
            return 0;
        }
        if (str.charAt(0) == 'd') {
            return Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (str.charAt(0) == 'l') {
            return 40960;
        }
        return str.charAt(0) == 'p' ? 4096 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(String str, boolean z) {
        String str2;
        C3597p o = o(d0.r(str));
        if (o == null || (str2 = o.b) == null) {
            return;
        }
        if (l.contains(str2)) {
            String str3 = o.a;
            if (str3 != null) {
                f(str, str3, o.b);
                d(str, (z && o.a.startsWith("u0_a")) ? 1528 : z ? 504 : 432);
                return;
            }
            return;
        }
        if (!o.b.startsWith("u0_a")) {
            f(str, "root", "root");
            d(str, (z || L(str)) ? 504 : 432);
            return;
        }
        String str4 = o.a;
        if (str4 != null) {
            f(str, str4, o.b);
            d(str, (z && o.b.endsWith("_cache")) ? 1528 : z ? 504 : 432);
        }
    }

    public static C3606z X() {
        if (k == null) {
            k = new C3606z(false);
        }
        return k;
    }

    public static C3606z Y() {
        if (j == null) {
            j = new C3606z(true);
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("chmod ");
        sb.append(B(i2));
        sb.append(" ");
        sb.append(k(str));
        return l(sb.toString(), 2000L) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("chown ");
        sb.append(i2);
        sb.append(":");
        sb.append(i3);
        sb.append(" ");
        sb.append(k(str));
        return l(sb.toString(), 2000L) != null;
    }

    private boolean f(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("chown ");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(" ");
        sb.append(k(str));
        return l(sb.toString(), 2000L) != null;
    }

    private static String k(String str) {
        return "'" + str.replaceAll("'", "'\"'\"'") + "'";
    }

    private static long v(String str) {
        try {
            return f.parse(str).getTime();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    private FileInputStream x(String str, long j2, a aVar) {
        int p = aVar != null ? aVar.c : p(str);
        if (p < 0) {
            return null;
        }
        boolean N = N(p, 4);
        int i2 = p | 4;
        if (!N && !d(str, i2)) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            if (j2 > 0) {
                fileInputStream.skip(j2);
            }
            if (!N) {
                d(str, p);
            }
            return fileInputStream;
        } catch (IOException unused) {
            if (!N) {
                d(str, p);
            }
            return null;
        } catch (Throwable th) {
            if (!N) {
                d(str, p);
            }
            throw th;
        }
    }

    public FileInputStream A(AbstractC3595n abstractC3595n, long j2) {
        File file;
        String E = abstractC3595n.E();
        File cacheDir = abstractC3595n.x().getCacheDir();
        do {
            file = new File(cacheDir, String.valueOf(new Random().nextLong()));
        } while (file.exists());
        String absolutePath = file.getAbsolutePath();
        if (l("ln -f " + k(E) + " " + k(absolutePath), 2000L) == null) {
            return null;
        }
        FileInputStream x = x(absolutePath, j2, null);
        l("rm " + k(absolutePath), 2000L);
        return x;
    }

    public int C(String str, boolean z) {
        ArrayList<String> l2;
        if (ax.X2.Q.a1()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ls -1A ");
            sb.append(k(str + "/"));
            l2 = l(sb.toString(), 10000L);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ls -lan ");
            sb2.append(k(str + "/"));
            l2 = l(sb2.toString(), 10000L);
        }
        if (l2 == null) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < l2.size(); i3++) {
            String str2 = l2.get(i3);
            if (!d0.C(str2) && (((!str2.endsWith(" .") && !str2.endsWith(" ..")) || R(str, str2, true, false) != null) && ((z || !str2.startsWith(".")) && (ax.X2.Q.a1() || !str2.startsWith("total"))))) {
                i2++;
            }
        }
        return i2;
    }

    public FileOutputStream D(AbstractC3595n abstractC3595n, boolean z) {
        FileOutputStream H = H(abstractC3595n, z);
        return H == null ? G(abstractC3595n, z) : H;
    }

    public FileOutputStream G(AbstractC3595n abstractC3595n, boolean z) {
        String T;
        int p;
        if (z || (p = p((T = abstractC3595n.T()))) < 0) {
            return null;
        }
        boolean N = N(p, 3);
        if (!N && !d(T, p | 3)) {
            return null;
        }
        FileOutputStream E = E(abstractC3595n);
        if (!N) {
            d(T, p);
        }
        return E;
    }

    public FileOutputStream H(AbstractC3595n abstractC3595n, boolean z) {
        String E = abstractC3595n.E();
        boolean m = m(E);
        if (!m && !h(E)) {
            return null;
        }
        String absolutePath = I(abstractC3595n.x()).getAbsolutePath();
        if (l("ln -f " + k(E) + " " + k(absolutePath), 2000L) == null) {
            if (!m) {
                l("rm " + k(E), 2000L);
            }
            return null;
        }
        FileOutputStream F = F(absolutePath, z);
        l("rm " + k(absolutePath), 2000L);
        return F;
    }

    public boolean K(String str) {
        if (ax.X2.Q.Q1()) {
            ArrayList<String> l2 = l("test -d " + k(str) + " && echo YES || echo NO", 10000L);
            if (l2 == null || l2.size() <= 0) {
                return false;
            }
            return "YES".equals(l2.get(0));
        }
        ArrayList<String> l3 = l("ls -land " + k(str), 10000L);
        if (l3 == null) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= l3.size()) {
                break;
            }
            String str2 = l3.get(i2);
            if (!str2.startsWith("total")) {
                if (str2.length() <= 0 || str2.charAt(0) != 'd') {
                    break;
                }
                return true;
            }
            i2++;
        }
        return false;
    }

    public ArrayList<C3605y> O(C3604x c3604x, ax.c3.K k2, String str) {
        String str2;
        boolean z;
        b R;
        C3606z c3606z = this;
        String str3 = str;
        ArrayList<C3605y> arrayList = new ArrayList<>();
        String str4 = "/";
        if (!"/".equals(str3)) {
            str4 = str3 + "/";
        }
        int i2 = 0;
        boolean z2 = true;
        if (c3606z.M(c3604x.p())) {
            str2 = "ls -lan --full-time " + k(str4);
            z = true;
        } else {
            str2 = "ls -lan " + k(str4);
            z = false;
        }
        ArrayList<String> l2 = c3606z.l(str2, 10000L);
        if (l2 == null) {
            return null;
        }
        while (i2 < l2.size()) {
            String str5 = l2.get(i2);
            if (!str5.startsWith("total") && (R = c3606z.R(str3, c3606z.c.matcher(str5).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET), z2, z)) != null) {
                arrayList.add(new C3605y(c3604x, new File(str3, R.a), k2, R.b, R.c, R.d, R.e, R.f, R.g));
            }
            i2++;
            c3606z = this;
            str3 = str;
            z2 = true;
        }
        return arrayList;
    }

    public boolean P(String str, String str2, boolean z) {
        String str3 = z ? "mv -f" : "mv";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(" ");
            sb.append(k(str));
            sb.append(" ");
            sb.append(k(str2));
            return l(sb.toString(), 2000L) != null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void U(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 23) {
            l("touch -t " + h.format(new Date(j2)) + " " + k(str), 10000L);
            return;
        }
        l("touch -t " + g.format(new Date(j2)) + " " + k(str), 10000L);
    }

    public void V(String str, C3597p c3597p) {
        String str2;
        int S;
        String str3 = c3597p.c;
        if (str3 != null && (S = S(str3)) >= 0) {
            d(str, S);
        }
        String str4 = c3597p.a;
        if (str4 == null || (str2 = c3597p.b) == null) {
            return;
        }
        f(str, str4, str2);
    }

    public boolean g(String str, String str2, long j2) {
        try {
            long j3 = (j2 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            long j4 = 2000;
            if (j3 > 0) {
                j4 = 2000 * j3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("cp ");
            sb.append(k(str));
            sb.append(" ");
            sb.append(k(str2));
            return l(sb.toString(), j4) != null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean h(String str) {
        try {
            if (l("touch " + k(str), 2000L) == null) {
                return false;
            }
            W(str, false);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean i(String str) {
        try {
            if (l("mkdir " + k(str), 2000L) == null) {
                return false;
            }
            W(str, true);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean j(String str) {
        String str2 = K(str) ? "rmdir" : "rm";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(k(str));
            return l(sb.toString(), 2000L) != null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    ArrayList<String> l(String str, long j2) {
        return this.a ? C3200r.d(str, j2) : C3200r.h(str, j2);
    }

    public boolean m(String str) {
        if (!ax.X2.Q.Q1()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ls -land ");
            sb.append(k(str));
            return l(sb.toString(), 10000L) != null;
        }
        ArrayList<String> l2 = l("test -e " + k(str) + " && echo YES || echo NO", 10000L);
        if (l2 == null || l2.size() <= 0) {
            return false;
        }
        return "YES".equals(l2.get(0));
    }

    public long n(String str) {
        b R;
        if (ax.X2.Q.I1()) {
            ArrayList<String> l2 = l("stat -c\"%y|%Y\" " + k(str), 10000L);
            if (l2 != null && l2.size() > 0) {
                String[] split = l2.get(0).split("\\|");
                try {
                    try {
                        return i.parse(split[0]).getTime();
                    } catch (NumberFormatException unused) {
                    }
                } catch (ParseException unused2) {
                    if (split.length > 1) {
                        return Long.valueOf(split[1]).longValue() * 1000;
                    }
                }
            }
            return 0L;
        }
        ArrayList<String> l3 = l("ls -land " + k(str), 10000L);
        if (l3 == null) {
            return 0L;
        }
        for (int i2 = 0; i2 < l3.size(); i2++) {
            String str2 = l3.get(i2);
            if (!str2.startsWith("total") && (R = R(str, str2, false, false)) != null) {
                return R.g;
            }
        }
        return 0L;
    }

    public C3597p o(String str) {
        ArrayList<String> l2 = l("ls -lad " + k(str), 10000L);
        if (l2 == null) {
            return null;
        }
        return Q(l2);
    }

    public int p(String str) {
        if (ax.X2.Q.P1()) {
            try {
                return Os.stat(str).st_mode & 511;
            } catch (Exception unused) {
            }
        }
        return ax.X2.Q.I1() ? r(str) : q(str);
    }

    public int q(String str) {
        ArrayList<String> l2 = l("ls -land " + k(str), 10000L);
        if (l2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < l2.size(); i2++) {
            String str2 = l2.get(i2);
            if (!str2.startsWith("total")) {
                return S(str2.split("\\s+")[0]);
            }
        }
        return -1;
    }

    public int r(String str) {
        ArrayList<String> l2 = l("stat -c%a " + k(str), 10000L);
        if (l2 != null && l2.size() > 0) {
            try {
                return Integer.valueOf(l2.get(0), 8).intValue() & 511;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public long s(String str) {
        b R;
        if (ax.X2.Q.I1()) {
            ArrayList<String> l2 = l("stat -c%s " + k(str), 10000L);
            if (l2 != null && l2.size() > 0) {
                try {
                    return Long.valueOf(l2.get(0)).longValue();
                } catch (NumberFormatException unused) {
                }
            }
            return 0L;
        }
        ArrayList<String> l3 = l("ls -land " + k(str), 10000L);
        if (l3 == null) {
            return 0L;
        }
        for (int i2 = 0; i2 < l3.size(); i2++) {
            String str2 = l3.get(i2);
            if (!str2.startsWith("total") && (R = R(str, str2, false, false)) != null) {
                return R.f;
            }
        }
        return 0L;
    }

    public a t(String str) {
        if (ax.X2.Q.P1()) {
            try {
                StructStat stat = Os.stat(str);
                int i2 = stat.st_mode;
                return new a(stat.st_uid, stat.st_gid, a.c(i2), i2 & 511);
            } catch (Exception unused) {
            }
        }
        return u(str);
    }

    public a u(String str) {
        ArrayList<String> l2 = l("ls -land " + k(str), 10000L);
        if (l2 == null) {
            return null;
        }
        for (int i2 = 0; i2 < l2.size(); i2++) {
            String str2 = l2.get(i2);
            if (!str2.startsWith("total")) {
                String[] split = str2.split("\\s+");
                if (split.length < 4) {
                    continue;
                } else {
                    try {
                        String str3 = split[0];
                        return new a(Integer.parseInt(split[2]), Integer.parseInt(split[3]), T(str3), S(str3));
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public FileInputStream w(AbstractC3595n abstractC3595n, long j2) {
        a t = t(abstractC3595n.E());
        if (t == null || t.e() || t.d()) {
            return null;
        }
        FileInputStream A = A(abstractC3595n, j2);
        if (A == null) {
            A = y(abstractC3595n, j2, t);
        }
        return A == null ? z(abstractC3595n, j2) : A;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.FileInputStream y(com.voxdon.xplorer.file.AbstractC3595n r9, long r10, com.voxdon.xplorer.file.C3606z.a r12) {
        /*
            r8 = this;
            java.lang.String r0 = r9.T()
            java.lang.String r1 = ax.c3.d0.r(r0)
            int r2 = r8.p(r0)
            r3 = 0
            if (r2 >= 0) goto L10
            return r3
        L10:
            java.lang.String r4 = "/"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L1a
            r4 = 0
            goto L1e
        L1a:
            int r4 = r8.p(r1)
        L1e:
            r5 = 1
            boolean r6 = N(r2, r5)     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L37
            r7 = r2 | 1
            boolean r7 = r8.d(r0, r7)     // Catch: java.lang.Throwable -> L33
            if (r7 != 0) goto L37
            if (r6 != 0) goto L32
            r8.d(r0, r2)
        L32:
            return r3
        L33:
            r9 = move-exception
            r5 = r6
        L35:
            r10 = 1
            goto L6b
        L37:
            if (r4 <= 0) goto L56
            boolean r5 = N(r4, r5)     // Catch: java.lang.Throwable -> L33
            if (r5 != 0) goto L56
            r7 = r4 | 1
            boolean r7 = r8.d(r1, r7)     // Catch: java.lang.Throwable -> L52
            if (r7 != 0) goto L56
            if (r6 != 0) goto L4c
            r8.d(r0, r2)
        L4c:
            if (r5 != 0) goto L51
            r8.d(r1, r4)
        L51:
            return r3
        L52:
            r9 = move-exception
            r10 = r5
            r5 = r6
            goto L6b
        L56:
            java.lang.String r9 = r9.E()     // Catch: java.lang.Throwable -> L52
            java.io.FileInputStream r9 = r8.x(r9, r10, r12)     // Catch: java.lang.Throwable -> L52
            if (r6 != 0) goto L63
            r8.d(r0, r2)
        L63:
            if (r5 != 0) goto L68
            r8.d(r1, r4)
        L68:
            return r9
        L69:
            r9 = move-exception
            goto L35
        L6b:
            if (r5 != 0) goto L70
            r8.d(r0, r2)
        L70:
            if (r10 != 0) goto L75
            r8.d(r1, r4)
        L75:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3606z.y(com.voxdon.xplorer.file.n, long, com.voxdon.xplorer.file.z$a):java.io.FileInputStream");
    }

    public FileInputStream z(AbstractC3595n abstractC3595n, long j2) {
        FileInputStream fileInputStream;
        File Z = abstractC3595n.Z();
        String absolutePath = Z.getAbsolutePath();
        if (g(abstractC3595n.E(), absolutePath, abstractC3595n.p())) {
            try {
                d(absolutePath, 511);
                fileInputStream = new FileInputStream(absolutePath);
                if (j2 != 0) {
                    try {
                        fileInputStream.skip(j2);
                    } catch (IOException unused) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    }
                }
                ax.Z2.t.b().c(Z);
                ax.Z2.t.b().a();
                return fileInputStream;
            } catch (IOException unused3) {
                fileInputStream = null;
            }
        }
        return null;
    }
}
