package ax.c3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.PatternMatcher;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.text.TextUtils;
import android.text.format.Formatter;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: ax.c3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1809B {
    private static final Logger a = Logger.getLogger("FileManager.FileUtils");
    private static HashMap<String, Boolean> b = new HashMap<>();
    private static HashMap<String, Boolean> c = new HashMap<>();
    private static HashMap<String, Boolean> d = new HashMap<>();
    private static Locale e;
    private static NumberFormat f;
    private static DecimalFormat g;
    private static char h;

    /* renamed from: ax.c3.B$a */
    public enum a {
        NORMAL,
        MEDIUM,
        SHORT
    }

    public static String A(ax.U2.f fVar) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(ax.Q2.f.V0.K());
        if (fVar.A()) {
            builder.authority("apk");
            builder.path(fVar.f().getAbsolutePath());
        } else {
            builder.authority("app");
            builder.path("/" + fVar.r());
        }
        builder.fragment(String.valueOf(fVar.n()));
        return builder.build().toString();
    }

    public static boolean B(List<AbstractC3595n> list) {
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isDirectory()) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(Context context, AbstractC3595n abstractC3595n) {
        Iterator<PatternMatcher> pathsIterator;
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        String A = abstractC3595n.A();
        if (TextUtils.isEmpty(A)) {
            return false;
        }
        intent.setDataAndType(C1832u.r(context, abstractC3595n.N()), abstractC3595n.s());
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65600);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = it.next().filter;
                if (intentFilter != null && (pathsIterator = intentFilter.pathsIterator()) != null) {
                    while (pathsIterator.hasNext()) {
                        String path = pathsIterator.next().getPath();
                        if (path != null && path.contains(A)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean D(List<AbstractC3595n> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof AbstractC1823k)) {
                return false;
            }
        }
        return true;
    }

    public static boolean E(String str) {
        return "content".equals(str);
    }

    public static boolean F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        C3184b.c(P(abstractC3595n));
        return abstractC3595n.n() && abstractC3595n.p() == abstractC3595n2.p() && abstractC3595n.q() / 1000 >= abstractC3595n2.q() / 1000;
    }

    public static boolean G(File file, AbstractC3595n abstractC3595n) {
        return file.exists() && file.length() == abstractC3595n.p() && file.lastModified() / 1000 >= abstractC3595n.q() / 1000;
    }

    public static boolean H(AbstractC3595n abstractC3595n) {
        return abstractC3595n instanceof AbstractC1823k;
    }

    public static boolean I(String str) {
        return str.startsWith("dir_");
    }

    public static boolean J(AbstractC3595n abstractC3595n) {
        return abstractC3595n instanceof C3590i;
    }

    public static boolean K(String str) {
        return "file".equals(str);
    }

    public static boolean L(String str) {
        return "http".equals(str) || "https".equals(str);
    }

    public static boolean M(AbstractC3595n abstractC3595n) {
        if (P(abstractC3595n)) {
            if (abstractC3595n.P() == ax.Q2.f.q0) {
                return true;
            }
            String W = abstractC3595n.W();
            if (W != null && d0.H("/Download", W)) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return abstractC3595n.P() == abstractC3595n2.P() && abstractC3595n.L() == abstractC3595n2.L();
    }

    public static boolean O(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        if (abstractC3595n != null && abstractC3595n2 != null) {
            return N(abstractC3595n, abstractC3595n2) || (P(abstractC3595n) && P(abstractC3595n2));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("file info == null:");
        sb.append(abstractC3595n == null);
        ax.Q2.d.c("same path", new Exception(sb.toString()));
        return false;
    }

    public static boolean P(AbstractC3595n abstractC3595n) {
        return abstractC3595n instanceof C3605y;
    }

    public static boolean Q(Uri uri) {
        return (uri == null || uri.getHost() == null || !uri.getHost().contains("media")) ? false : true;
    }

    public static boolean R(File file) throws IOException {
        File parentFile;
        if (ax.X2.Q.P0()) {
            try {
                return Files.isSymbolicLink(FileRetargetClass.toPath(file));
            } catch (RuntimeException unused) {
            }
        }
        if (file.getParent() != null && (parentFile = file.getParentFile()) != null) {
            file = new File(parentFile.getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static String S(K k, AbstractC3595n abstractC3595n) {
        String g2 = ax.U2.d.g(d0.v(k, abstractC3595n.E(), Boolean.TRUE));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(ax.Q2.f.V0.K());
        builder.authority("app");
        builder.path("/" + g2);
        builder.fragment(String.valueOf(abstractC3595n.q()));
        return builder.build().toString();
    }

    public static String T(AbstractC3595n abstractC3595n) {
        if (!ax.Q2.f.m0(abstractC3595n.P())) {
            if (abstractC3595n.P() != null) {
                ax.Ha.c.h().f().d("NO MEDIA FILE INFO?").j().g(abstractC3595n.P().I()).h();
            } else {
                ax.Ha.c.h().f().d("NO MEDIA FILE INFO?").j().g("null").h();
            }
        }
        return Z(abstractC3595n.E(), abstractC3595n.P().t(), abstractC3595n.L(), abstractC3595n.q(), null);
    }

    public static String U(K k, String str) {
        return V(k, str, null).toString();
    }

    public static Uri V(K k, String str, String str2) {
        if (!d0.B(str) && k.d() != ax.Q2.f.W0) {
            ax.Ha.c.h().b("MAKE LOCATION URI INVALID PATH").f().j().g("location:" + k.d().I() + ",path:" + str).h();
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(k.d().I());
        builder.authority(String.valueOf(k.b()));
        if (str != null) {
            builder.path(str);
        }
        if (str2 != null) {
            builder.query(str2);
        }
        return builder.build();
    }

    public static String W(AbstractC3595n abstractC3595n) {
        C3184b.c(P(abstractC3595n));
        return Z(abstractC3595n.E(), "local", 0, abstractC3595n.q(), null);
    }

    public static String X(AbstractC3595n abstractC3595n) {
        com.voxdon.xplorer.file.K k = (com.voxdon.xplorer.file.K) abstractC3595n;
        return Z(k.z1(), k.P().K(), k.L(), abstractC3595n.q(), null);
    }

    public static String Y(AbstractC3595n abstractC3595n) {
        return Z(abstractC3595n.E(), abstractC3595n.P().K(), abstractC3595n.L(), abstractC3595n.q(), null);
    }

    public static String Z(String str, String str2, int i, long j, String str3) {
        Uri.Builder builder = new Uri.Builder();
        builder.path(str);
        builder.scheme(str2);
        builder.authority(String.valueOf(i));
        if (str3 != null) {
            builder.encodedQuery(str3);
        }
        builder.fragment(String.valueOf(j));
        return builder.build().toString();
    }

    public static boolean a(List<AbstractC3595n> list) {
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof C3605y)) {
                return false;
            }
        }
        return true;
    }

    public static String a0(AbstractC3595n abstractC3595n, String str) {
        return Z(abstractC3595n.E(), abstractC3595n.P().K(), abstractC3595n.L(), abstractC3595n.q(), str);
    }

    public static long b(C3596o c3596o, AbstractC3595n abstractC3595n, InterfaceC3185c interfaceC3185c) throws IOException, C1495j, C1486a {
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c3596o.J(abstractC3595n, 0L), 8192);
        while (!interfaceC3185c.isCancelled()) {
            try {
                int read = bufferedInputStream.read(bArr);
                if (read < 0) {
                    bufferedInputStream.close();
                    return crc32.getValue();
                }
                if (read == 0) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new C1486a();
                    }
                } else {
                    crc32.update(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new C1486a();
    }

    public static boolean b0(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.canWrite()) {
            return false;
        }
        try {
            new File(file, ".filemanager_system_test").createNewFile();
        } catch (Exception e2) {
            if (e2.getMessage() != null && e2.getMessage().contains("Read-only file system")) {
                return true;
            }
        }
        return false;
    }

    public static long c(File file) throws IOException {
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr);
                if (read < 0) {
                    bufferedInputStream.close();
                    return crc32.getValue();
                }
                if (read == 0) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        throw new IOException("CRC calculation interrupted", e2);
                    }
                } else {
                    crc32.update(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static String c0(String str) {
        return (ax.X2.Q.Z1() && str.startsWith("\u200f\u202a") && str.endsWith("\u202c\u200f")) ? str.substring(1, str.length() - 1) : str;
    }

    public static boolean d(AbstractC3595n abstractC3595n) {
        return H(abstractC3595n);
    }

    public static void d0(ParcelFileDescriptor parcelFileDescriptor, long j) throws ErrnoException {
        Os.lseek(parcelFileDescriptor.getFileDescriptor(), j, 0);
    }

    public static boolean e(AbstractC3595n abstractC3595n) {
        return H(abstractC3595n);
    }

    public static boolean e0(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        if (b.containsKey(str)) {
            return b.get(str).booleanValue();
        }
        File file = new File(str);
        File file2 = new File(file, ".filemanger_write_test");
        try {
            file2.createNewFile();
            if (file2.exists()) {
                z = file2.delete();
            }
        } catch (Exception unused) {
        }
        if (file.canRead() && file.canWrite()) {
            b.put(str, Boolean.valueOf(z));
        }
        return z;
    }

    public static void f() {
        b.clear();
    }

    public static long g(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        return Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, 1);
    }

    @SuppressLint({"DefaultLocale"})
    public static List<AbstractC3595n> h(List<AbstractC3595n> list, String str, boolean z, boolean z2) {
        ax.Nc.e eVar;
        String str2;
        if (list == null) {
            return null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        String lowerCase = str != null ? str.toLowerCase() : null;
        boolean contains = str != null ? str.contains("*") : false;
        if (str == null || !(contains || str.contains("?"))) {
            eVar = null;
        } else {
            if (contains) {
                str2 = lowerCase;
            } else {
                str2 = (lowerCase.startsWith("*") || lowerCase.startsWith("?")) ? lowerCase : "*" + lowerCase;
                if (!str2.endsWith("*") && !str2.endsWith("?")) {
                    str2 = str2 + "*";
                }
            }
            eVar = new ax.Nc.e(str2, ax.Lc.c.INSENSITIVE);
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC3595n abstractC3595n : list) {
            String lowerCase2 = isEmpty ? null : abstractC3595n.B().toLowerCase();
            if (isEmpty || lowerCase2.contains(lowerCase) || (eVar != null && eVar.accept(null, lowerCase2))) {
                if (!abstractC3595n.h()) {
                    arrayList.add(abstractC3595n);
                } else if (z) {
                    if (!z2) {
                        arrayList.add(abstractC3595n);
                    } else if (!com.voxdon.xplorer.file.J.j2(abstractC3595n) && !".android_secure".equals(abstractC3595n.B())) {
                        arrayList.add(abstractC3595n);
                    }
                }
            }
        }
        return arrayList;
    }

    public static String i(Context context, long j) {
        if (j < 0) {
            return "-";
        }
        if (ax.t3.j.d(context) == 1) {
            return C1836y.b(j, false);
        }
        try {
            return c0(Formatter.formatFileSize(context, j));
        } catch (RuntimeException e2) {
            ax.Ha.c.h().d("FORMAT FILE SIZE RUNTIME").f().l(e2).g("country:" + Locale.getDefault().getCountry() + ":" + Locale.getDefault().getLanguage()).h();
            return C1836y.b(j, ax.X2.Q.b2());
        }
    }

    public static synchronized String j(Context context, long j) {
        synchronized (C1809B.class) {
            if (ax.t3.j.d(context) == 1) {
                return C1836y.c(j, false);
            }
            try {
                String c0 = c0(Formatter.formatFileSize(context, j));
                Locale locale = e;
                if (locale == null || !locale.equals(Locale.getDefault())) {
                    e = Locale.getDefault();
                    f = NumberFormat.getInstance();
                    DecimalFormat decimalFormat = new DecimalFormat("#.#");
                    g = decimalFormat;
                    h = decimalFormat.getDecimalFormatSymbols().getDecimalSeparator();
                }
                Matcher matcher = (h == ',' ? Pattern.compile("^\\d*[,]\\d{2,}") : Pattern.compile("^\\d*[\\.]\\d{2,}")).matcher(c0);
                if (!matcher.find()) {
                    return k(context, j);
                }
                try {
                    int start = matcher.start();
                    int end = matcher.end();
                    String substring = c0.substring(start, end);
                    String substring2 = c0.substring(end);
                    float floatValue = f.parse(substring).floatValue();
                    if (floatValue < 1.0f) {
                        return c0;
                    }
                    return String.format("%s%s", g.format(floatValue), substring2);
                } catch (Exception unused) {
                    return k(context, j);
                }
            } catch (NoSuchMethodError | RuntimeException unused2) {
                return C1836y.c(j, ax.X2.Q.b2());
            }
        }
    }

    public static String k(Context context, long j) {
        if (ax.t3.j.d(context) == 1) {
            return C1836y.e(j, false);
        }
        try {
            return c0(Formatter.formatShortFileSize(context, j));
        } catch (RuntimeException unused) {
            return C1836y.e(j, ax.X2.Q.b2());
        }
    }

    public static String l(Context context, long j, a aVar) {
        return context.getString(R.string.free_size, aVar == a.SHORT ? k(context, j) : aVar == a.MEDIUM ? j(context, j) : i(context, j));
    }

    public static String m(Context context, long j, long j2, a aVar) {
        return aVar == a.SHORT ? String.format("%s / %s", k(context, j2), k(context, j)) : aVar == a.MEDIUM ? String.format("%s / %s", j(context, j2), j(context, j)) : String.format("%s / %s", i(context, j2), i(context, j));
    }

    public static AbstractC3595n n(C3596o c3596o, AbstractC3595n abstractC3595n) throws C1495j {
        if (c3596o.Z()) {
            return c3596o.z(abstractC3595n.E() + ".bak.0");
        }
        return c3596o.z(abstractC3595n.E() + ".bak");
    }

    public static String o(String str) {
        return "extension/" + str;
    }

    public static long p(File file, FilenameFilter filenameFilter) {
        long j;
        long j2 = 0;
        if (!file.isDirectory()) {
            try {
                return file.length();
            } catch (IllegalArgumentException e2) {
                if (ax.X2.Q.P1()) {
                    try {
                        ax.X2.L l = new ax.X2.L();
                        ax.X2.v.l(file.getAbsolutePath(), l);
                        ax.Ha.c.h().f().b("GET DIR SIZE OK").l(e2).h();
                        return l.a;
                    } catch (Exception unused) {
                        ax.Ha.c.h().f().b("GET DIR SIZE 1").l(e2).h();
                        return 0L;
                    }
                }
                ax.Ha.c.h().f().b("GET DIR SIZE 1").l(e2).h();
                return 0L;
            } catch (Exception e3) {
                ax.Ha.c.h().f().b("GET DIR SIZE 2").l(e3).h();
                return 0L;
            }
        }
        Stack stack = new Stack();
        stack.push(file);
        while (stack.size() > 0) {
            File[] listFiles = ((File) stack.pop()).listFiles(filenameFilter);
            if (listFiles != null) {
                ax.X2.L l2 = new ax.X2.L();
                for (File file2 : listFiles) {
                    if (!file2.getName().startsWith(".")) {
                        if (file2.isDirectory()) {
                            stack.push(file2);
                        } else {
                            try {
                                j = file2.length();
                            } catch (IllegalArgumentException unused2) {
                                if (ax.X2.Q.P1()) {
                                    try {
                                        ax.X2.v.l(file2.getAbsolutePath(), l2);
                                        j = l2.a;
                                    } catch (Exception unused3) {
                                    }
                                }
                            }
                            j2 += j;
                        }
                    }
                }
            }
        }
        return j2;
    }

    public static int q(AbstractC3595n abstractC3595n) {
        return r(abstractC3595n.W());
    }

    public static int r(String str) {
        int i = -1;
        if (str == null) {
            return -1;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }

    public static String s(ParcelFileDescriptor parcelFileDescriptor) {
        return "/proc/" + Process.myPid() + "/fd/" + parcelFileDescriptor.getFd();
    }

    public static boolean t(K k) {
        String e2 = k.e();
        boolean z = false;
        if (e2 == null) {
            return false;
        }
        if (d.containsKey(e2)) {
            return d.get(e2).booleanValue();
        }
        C3604x c3604x = (C3604x) C1835x.g(e2).u();
        if (!c3604x.z(e2).d()) {
            return false;
        }
        boolean z2 = true;
        if (ax.X2.Q.n0() && ax.Q2.f.k0(k.d())) {
            d.put(e2, Boolean.TRUE);
            return true;
        }
        String Q = d0.Q(e2, ".temp_write_test");
        try {
            c3604x.N((C3605y) c3604x.z(Q));
            C3605y c3605y = (C3605y) c3604x.z(Q);
            if (c3605y.n()) {
                if (c3604x.d(c3605y, 12345000L)) {
                    c3605y = (C3605y) c3604x.z(Q);
                    if (c3605y.q() == 12345000) {
                        c3604x.P(c3605y);
                        z = z2;
                    }
                }
                z2 = false;
                c3604x.P(c3605y);
                z = z2;
            }
        } catch (Exception unused) {
        }
        if (z) {
            d.put(e2, Boolean.valueOf(z));
        }
        return z;
    }

    public static File u(File file) {
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            sb.append(".");
            int i2 = i + 1;
            sb.append(i);
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            if (!file2.exists()) {
                return file2;
            }
            i = i2;
        }
    }

    public static int v(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return 1;
        }
        Stack stack = new Stack();
        stack.push(file);
        int i = 0;
        while (stack.size() > 0) {
            File[] listFiles = ((File) stack.pop()).listFiles(filenameFilter);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!file2.getName().startsWith(".")) {
                        if (file2.isDirectory()) {
                            stack.push(file2);
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    public static W w(Context context, Uri uri) {
        return x(context, uri, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.c3.W x(android.content.Context r14, android.net.Uri r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1809B.x(android.content.Context, android.net.Uri, java.lang.String):ax.c3.W");
    }

    public static String y(AssetFileDescriptor assetFileDescriptor) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
            if (parcelFileDescriptor != null) {
                File file = new File(s(parcelFileDescriptor));
                if (file.exists() && R(file)) {
                    return file.getCanonicalPath();
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    public static AbstractC3595n z(C3596o c3596o, AbstractC3595n abstractC3595n) throws C1495j {
        int i;
        AbstractC3595n z;
        int i2 = 0;
        while (true) {
            if (c3596o.Z()) {
                StringBuilder sb = new StringBuilder();
                sb.append(abstractC3595n.E());
                sb.append(".tmp.");
                i = i2 + 1;
                sb.append(i2);
                z = c3596o.z(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(abstractC3595n.E());
                sb2.append(".");
                i = i2 + 1;
                sb2.append(i2);
                sb2.append(".tmp");
                z = c3596o.z(sb2.toString());
            }
            if (!z.n()) {
                return z;
            }
            i2 = i;
        }
    }
}
