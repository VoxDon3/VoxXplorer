/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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
import ax.Nc.e;
import ax.Q2.d;
import ax.Q2.f;
import ax.X2.L;
import ax.X2.Q;
import ax.c3.K;
import ax.c3.W;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.u;
import ax.c3.v;
import ax.c3.x;
import ax.c3.y;
import ax.t3.j;
import ax.u3.b;
import ax.u3.c;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.i;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.zip.CRC32;

public class B {
    private static final Logger a = Logger.getLogger("FileManager.FileUtils");
    private static HashMap<String, Boolean> b = new HashMap();
    private static HashMap<String, Boolean> c = new HashMap();
    private static HashMap<String, Boolean> d = new HashMap();
    private static Locale e;
    private static NumberFormat f;
    private static DecimalFormat g;
    private static char h;

    public static String A(ax.U2.f f8) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(ax.Q2.f.V0.K());
        if (f8.A()) {
            builder.authority("apk");
            builder.path(f8.f().getAbsolutePath());
        } else {
            builder.authority("app");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/");
            stringBuilder.append(f8.r());
            builder.path(stringBuilder.toString());
        }
        builder.fragment(String.valueOf(f8.n()));
        return builder.build().toString();
    }

    public static boolean B(List<n> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (!((n)object.next()).isDirectory()) continue;
            return true;
        }
        return false;
    }

    public static boolean C(Context object, n object2) {
        Object object3 = object.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        String string = ((n)object2).A();
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        intent.setDataAndType(u.r((Context)object, ((n)object2).N()), object2.s());
        object = object3.queryIntentActivities(intent, 65600);
        if (object != null && object.size() > 0) {
            object = object.iterator();
            while (object.hasNext()) {
                object2 = ((ResolveInfo)object.next()).filter;
                if (object2 == null || (object3 = object2.pathsIterator()) == null) continue;
                while (object3.hasNext()) {
                    object2 = ((PatternMatcher)object3.next()).getPath();
                    if (object2 == null || !((String)object2).contains(string)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean D(List<n> object) {
        if (object != null && !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if ((n)object.next() instanceof k) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean E(String string) {
        return "content".equals(string);
    }

    public static boolean F(n n8, n n9) {
        ax.u3.b.c(B.P(n8));
        return n8.n() && n8.p() == n9.p() && n8.q() / 1000L >= n9.q() / 1000L;
    }

    public static boolean G(File file, n n8) {
        return file.exists() && file.length() == n8.p() && file.lastModified() / 1000L >= n8.q() / 1000L;
    }

    public static boolean H(n n8) {
        return n8 instanceof k;
    }

    public static boolean I(String string) {
        return string.startsWith("dir_");
    }

    public static boolean J(n n8) {
        return n8 instanceof i;
    }

    public static boolean K(String string) {
        return "file".equals(string);
    }

    public static boolean L(String string) {
        return "http".equals(string) || "https".equals(string);
        {
        }
    }

    public static boolean M(n object) {
        if (B.P((n)object)) {
            if (((n)object).P() == ax.Q2.f.q0) {
                return true;
            }
            if ((object = ((n)object).W()) != null && d0.H("/Download", (String)object)) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(n n8, n n9) {
        return n8.P() == n9.P() && n8.L() == n9.L();
    }

    public static boolean O(n n8, n comparable) {
        boolean bl = true;
        if (n8 != null && comparable != null) {
            return B.N(n8, (n)comparable) || B.P(n8) && B.P(comparable);
            {
            }
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("file info == null:");
        if (n8 != null) {
            bl = false;
        }
        ((StringBuilder)comparable).append(bl);
        ax.Q2.d.c("same path", new Exception(((StringBuilder)comparable).toString()));
        return false;
    }

    public static boolean P(n n8) {
        return n8 instanceof com.voxdon.xplorer.file.y;
    }

    public static boolean Q(Uri uri) {
        if (uri == null) {
            return false;
        }
        return uri.getHost() != null && uri.getHost().contains("media");
    }

    public static boolean R(File file) throws IOException {
        File file2;
        if (Q.P0()) {
            try {
                boolean bl = j.Files.isSymbolicLink((j.Path)j.FileRetargetClass.toPath((File)file));
                return bl;
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
        }
        if (file.getParent() == null) {
            file2 = file;
        } else {
            File file3 = file.getParentFile();
            file2 = file;
            if (file3 != null) {
                file2 = new File(file3.getCanonicalFile(), file.getName());
            }
        }
        return file2.getCanonicalFile().equals(file2.getAbsoluteFile()) ^ true;
    }

    public static String S(K k8, n n8) {
        String string = ax.U2.d.g(d0.v(k8, n8.E(), Boolean.TRUE));
        k8 = new Uri.Builder();
        k8.scheme(ax.Q2.f.V0.K());
        k8.authority("app");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");
        stringBuilder.append(string);
        k8.path(stringBuilder.toString());
        k8.fragment(String.valueOf(n8.q()));
        return k8.build().toString();
    }

    public static String T(n n8) {
        if (!ax.Q2.f.m0(n8.P())) {
            if (n8.P() != null) {
                ax.Ha.c.h().f().d("NO MEDIA FILE INFO?").j().g(n8.P().I()).h();
            } else {
                ax.Ha.c.h().f().d("NO MEDIA FILE INFO?").j().g("null").h();
            }
        }
        return B.Z(n8.E(), n8.P().t(), n8.L(), n8.q(), null);
    }

    public static String U(K k8, String string) {
        return B.V(k8, string, null).toString();
    }

    public static Uri V(K k8, String string, String string2) {
        Object object;
        if (!d0.B(string) && k8.d() != ax.Q2.f.W0) {
            object = ax.Ha.c.h().b("MAKE LOCATION URI INVALID PATH").f().j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location:");
            stringBuilder.append(k8.d().I());
            stringBuilder.append(",path:");
            stringBuilder.append(string);
            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
        }
        object = new Uri.Builder();
        object.scheme(k8.d().I());
        object.authority(String.valueOf(k8.b()));
        if (string != null) {
            object.path(string);
        }
        if (string2 != null) {
            object.query(string2);
        }
        return object.build();
    }

    public static String W(n n8) {
        ax.u3.b.c(B.P(n8));
        return B.Z(n8.E(), "local", 0, n8.q(), null);
    }

    public static String X(n n8) {
        com.voxdon.xplorer.file.K k8 = (com.voxdon.xplorer.file.K)n8;
        return B.Z(k8.z1(), k8.P().K(), k8.L(), n8.q(), null);
    }

    public static String Y(n n8) {
        return B.Z(n8.E(), n8.P().K(), n8.L(), n8.q(), null);
    }

    public static String Z(String string, String string2, int n8, long l8, String string3) {
        Uri.Builder builder = new Uri.Builder();
        builder.path(string);
        builder.scheme(string2);
        builder.authority(String.valueOf(n8));
        if (string3 != null) {
            builder.encodedQuery(string3);
        }
        builder.fragment(String.valueOf(l8));
        return builder.build().toString();
    }

    public static boolean a(List<n> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if ((n)object.next() instanceof com.voxdon.xplorer.file.y) continue;
            return false;
        }
        return true;
    }

    public static String a0(n n8, String string) {
        return B.Z(n8.E(), n8.P().K(), n8.L(), n8.q(), string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long b(o object, n object2, c c8) throws IOException, ax.b3.j, ax.b3.a {
        Throwable throwable2;
        CRC32 cRC32 = new CRC32();
        byte[] byArray = new byte[8192];
        object = new BufferedInputStream(((o)object).J((n)object2, 0L), 8192);
        while (true) {
            try {
                while (true) {
                    int n8;
                    block11: {
                        block12: {
                            block10: {
                                if (c8.isCancelled()) break block10;
                                n8 = ((InputStream)object).read(byArray);
                                if (n8 >= 0) break block11;
                                break block12;
                            }
                            object2 = new ax.b3.a();
                            throw object2;
                        }
                        ((BufferedInputStream)object).close();
                        return cRC32.getValue();
                    }
                    if (n8 == 0) break;
                    cRC32.update(byArray, 0, n8);
                }
                try {}
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    ax.b3.a a8 = new ax.b3.a();
                    throw a8;
                }
            }
            catch (Throwable throwable2) {
                break;
            }
            Thread.sleep(5L);
        }
        try {
            ((BufferedInputStream)object).close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    public static boolean b0(String object) {
        block4: {
            if (object == null) {
                return false;
            }
            if (((File)(object = new File((String)object))).canWrite()) {
                return false;
            }
            object = new File((File)object, ".filemanager_system_test");
            try {
                ((File)object).createNewFile();
            }
            catch (Exception exception) {
                if (exception.getMessage() == null || !exception.getMessage().contains("Read-only file system")) break block4;
                return true;
            }
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long c(File object) throws IOException {
        Throwable throwable222;
        Object object2 = new CRC32();
        byte[] byArray = new byte[8192];
        object = new BufferedInputStream(new FileInputStream((File)object), 8192);
        while (true) {
            int n8;
            block9: {
                block8: {
                    try {
                        n8 = ((InputStream)object).read(byArray);
                        if (n8 >= 0) break block8;
                    }
                    catch (Throwable throwable222) {
                        break;
                    }
                    ((InputStream)object).close();
                    return ((CRC32)object2).getValue();
                }
                if (n8 != 0) break block9;
                Thread.sleep(5L);
                continue;
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    object2 = new IOException("CRC calculation interrupted", interruptedException);
                    throw object2;
                }
            }
            ((CRC32)object2).update(byArray, 0, n8);
        }
        try {
            ((InputStream)object).close();
            throw throwable222;
        }
        catch (Throwable throwable3) {
            throwable222.addSuppressed(throwable3);
        }
        throw throwable222;
    }

    private static String c0(String string) {
        String string2 = string;
        if (Q.Z1()) {
            string2 = string;
            if (string.startsWith("\u200f\u202a")) {
                string2 = string;
                if (string.endsWith("\u202c\u200f")) {
                    string2 = string.substring(1, string.length() - 1);
                }
            }
        }
        return string2;
    }

    public static boolean d(n n8) {
        return B.H(n8);
    }

    public static void d0(ParcelFileDescriptor parcelFileDescriptor, long l8) throws ErrnoException {
        Os.lseek((FileDescriptor)parcelFileDescriptor.getFileDescriptor(), (long)l8, (int)0);
    }

    public static boolean e(n n8) {
        return B.H(n8);
    }

    public static boolean e0(String string) {
        boolean bl = false;
        if (string == null) {
            return false;
        }
        if (b.containsKey(string)) {
            return b.get(string);
        }
        File file = new File(string);
        File file2 = new File(file, ".filemanger_write_test");
        try {
            file2.createNewFile();
            if (file2.exists()) {
                boolean bl2;
                bl = bl2 = file2.delete();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (file.canRead() && file.canWrite()) {
            b.put(string, bl);
        }
        return bl;
    }

    public static void f() {
        b.clear();
    }

    public static long g(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        return Os.lseek((FileDescriptor)parcelFileDescriptor.getFileDescriptor(), (long)0L, (int)1);
    }

    @SuppressLint(value={"DefaultLocale"})
    public static List<n> h(List<n> object, String object2, boolean bl, boolean bl2) {
        Object object3;
        if (object == null) {
            return null;
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        String string = object2 != null ? ((String)object2).toLowerCase() : null;
        boolean bl4 = object2 != null ? ((String)object2).contains("*") : false;
        if (object2 != null && (bl4 || ((String)object2).contains("?"))) {
            if (!bl4) {
                if (!string.startsWith("*") && !string.startsWith("?")) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("*");
                    ((StringBuilder)object2).append(string);
                    object2 = ((StringBuilder)object2).toString();
                } else {
                    object2 = string;
                }
                object3 = object2;
                if (!((String)object2).endsWith("*")) {
                    object3 = object2;
                    if (!((String)object2).endsWith("?")) {
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append((String)object2);
                        ((StringBuilder)object3).append("*");
                        object3 = ((StringBuilder)object3).toString();
                    }
                }
            } else {
                object3 = string;
            }
            object2 = new e((String)object3, ax.Lc.c.e0);
        } else {
            object2 = null;
        }
        object3 = new ArrayList();
        Iterator<n> iterator = object.iterator();
        while (iterator.hasNext()) {
            n n8 = iterator.next();
            object = bl3 ? null : n8.B().toLowerCase();
            if (!bl3 && !((String)object).contains(string) && (object2 == null || !((e)object2).accept(null, (String)object))) continue;
            if (!n8.h()) {
                object3.add(n8);
                continue;
            }
            if (!bl) continue;
            if (!bl2) {
                object3.add(n8);
                continue;
            }
            if (J.j2(n8) || ".android_secure".equals(n8.B())) continue;
            object3.add(n8);
        }
        return object3;
    }

    public static String i(Context object, long l8) {
        if (l8 < 0L) {
            return "-";
        }
        if (j.d(object) == 1) {
            return y.b(l8, false);
        }
        try {
            object = B.c0(Formatter.formatFileSize((Context)object, (long)l8));
            return object;
        }
        catch (RuntimeException runtimeException) {
            ax.Ha.b b8 = ax.Ha.c.h().d("FORMAT FILE SIZE RUNTIME").f().l(runtimeException);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("country:");
            stringBuilder.append(Locale.getDefault().getCountry());
            stringBuilder.append(":");
            stringBuilder.append(Locale.getDefault().getLanguage());
            b8.g(stringBuilder.toString()).h();
            return y.b(l8, Q.b2());
        }
    }

    /*
     * Exception decompiling
     */
    public static String j(Context var0, long var1_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3, 1, 2 : 26->41)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String k(Context object, long l8) {
        if (j.d(object) == 1) {
            return y.e(l8, false);
        }
        try {
            object = B.c0(Formatter.formatShortFileSize((Context)object, (long)l8));
            return object;
        }
        catch (RuntimeException runtimeException) {
            return y.e(l8, Q.b2());
        }
    }

    public static String l(Context context, long l8, a object) {
        object = object == ax.c3.B$a.d0 ? B.k(context, l8) : (object == ax.c3.B$a.c0 ? B.j(context, l8) : B.i(context, l8));
        return context.getString(2131952076, new Object[]{object});
    }

    public static String m(Context context, long l8, long l9, a a8) {
        if (a8 == ax.c3.B$a.d0) {
            return String.format("%s / %s", B.k(context, l9), B.k(context, l8));
        }
        if (a8 == ax.c3.B$a.c0) {
            return String.format("%s / %s", B.j(context, l9), B.j(context, l8));
        }
        return String.format("%s / %s", B.i(context, l9), B.i(context, l8));
    }

    public static n n(o o8, n n8) throws ax.b3.j {
        if (o8.Z()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n8.E());
            stringBuilder.append(".bak.0");
            return o8.z(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8.E());
        stringBuilder.append(".bak");
        return o8.z(stringBuilder.toString());
    }

    public static String o(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("extension/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    public static long p(File var0, FilenameFilter var1_3) {
        var8_5 = var0.isDirectory();
        var6_6 = 0L;
        if (!var8_5) {
            try {
                var4_7 = var0.length();
                return var4_7;
            }
            catch (Exception var0_1) {
                ax.Ha.c.h().f().b("GET DIR SIZE 2").l(var0_1).h();
                return 0L;
            }
            catch (IllegalArgumentException var1_4) {
                if (Q.P1()) {
                    var9_10 = new L();
                    ax.X2.v.l(var0.getAbsolutePath(), var9_10);
                    ax.Ha.c.h().f().b("GET DIR SIZE OK").l(var1_4).h();
                    var4_8 = var9_10.a;
                    return var4_8;
                }
lbl19:
                // 3 sources

                while (true) {
                    ax.Ha.c.h().f().b("GET DIR SIZE 1").l(var1_4).h();
                    return 0L;
                }
            }
        }
        var9_11 = new Stack<Object>();
        var9_11.push(var0);
        block10: while (var9_11.size() > 0) {
            var0 = ((File)var9_11.pop()).listFiles(var1_3);
            if (var0 == null) continue;
            var10_14 = new L();
            var3_13 = var0.length;
            var2_12 = 0;
            var4_9 = var6_6;
            block11: while (true) {
                block19: {
                    var6_6 = var4_9;
                    if (var2_12 >= var3_13) continue block10;
                    var11_15 = var0[var2_12];
                    var6_6 = var4_9;
                    if (!var11_15.getName().startsWith(".")) {
                        if (var11_15.isDirectory()) {
                            var9_11.push(var11_15);
                            var6_6 = var4_9;
                        } else {
                            try {
                                var6_6 = var11_15.length();
lbl45:
                                // 2 sources

                                while (true) {
                                    var6_6 = var4_9 + var6_6;
                                    break;
                                }
                            }
                            catch (IllegalArgumentException var12_17) {
                                var6_6 = var4_9;
                                if (!Q.P1()) break block19;
                                ax.X2.v.l(var11_15.getAbsolutePath(), var10_14);
                                var6_6 = var10_14.a;
                                ** continue;
                            }
                        }
                    }
                }
lbl57:
                // 2 sources

                while (true) {
                    ++var2_12;
                    var4_9 = var6_6;
                    continue block11;
                    break;
                }
                break;
            }
        }
        return var6_6;
        {
            catch (Exception var0_2) {
                ** continue;
            }
        }
        {
            catch (Exception var11_16) {
                var6_6 = var4_9;
                ** continue;
            }
        }
    }

    public static int q(n n8) {
        return B.r(n8.W());
    }

    public static int r(String string) {
        int n8 = -1;
        if (string == null) {
            return -1;
        }
        for (int i8 = 0; i8 < string.length(); ++i8) {
            int n9 = n8;
            if (string.charAt(i8) == '/') {
                n9 = n8 + 1;
            }
            n8 = n9;
        }
        return n8;
    }

    public static String s(ParcelFileDescriptor parcelFileDescriptor) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/proc/");
        stringBuilder.append(Process.myPid());
        stringBuilder.append("/fd/");
        stringBuilder.append(parcelFileDescriptor.getFd());
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean t(K object) {
        boolean bl;
        String string;
        block7: {
            com.voxdon.xplorer.file.x x8;
            block9: {
                block8: {
                    string = ((K)object).e();
                    boolean bl2 = false;
                    if (string == null) {
                        return false;
                    }
                    if (d.containsKey(string)) {
                        return d.get(string);
                    }
                    x8 = (com.voxdon.xplorer.file.x)x.g(string).u();
                    if (!x8.z(string).d()) {
                        return false;
                    }
                    bl = Q.n0();
                    boolean bl3 = true;
                    if (bl && ax.Q2.f.k0(((K)object).d())) {
                        d.put(string, Boolean.TRUE);
                        return true;
                    }
                    String string2 = d0.Q(string, ".temp_write_test");
                    try {
                        x8.N((com.voxdon.xplorer.file.y)x8.z(string2));
                        com.voxdon.xplorer.file.y y8 = (com.voxdon.xplorer.file.y)x8.z(string2);
                        bl = bl2;
                        if (!y8.n()) break block7;
                        object = y8;
                        if (!x8.d(y8, 12345000L)) break block8;
                        y8 = (com.voxdon.xplorer.file.y)x8.z(string2);
                        object = y8;
                        if (y8.q() != 12345000L) break block8;
                        object = y8;
                        bl = bl3;
                        break block9;
                    }
                    catch (Exception exception) {
                        bl = bl2;
                        break block7;
                    }
                }
                bl = false;
            }
            x8.P((n)object);
        }
        if (bl) {
            d.put(string, bl);
        }
        return bl;
    }

    public static File u(File file) {
        int n8 = 0;
        while (true) {
            Comparable<StringBuilder> comparable = new StringBuilder();
            ((StringBuilder)comparable).append(file.getAbsolutePath());
            ((StringBuilder)comparable).append(".");
            ((StringBuilder)comparable).append(n8);
            ((StringBuilder)comparable).append(".tmp");
            comparable = new File(((StringBuilder)comparable).toString());
            if (!((File)comparable).exists()) {
                return comparable;
            }
            ++n8;
        }
    }

    public static int v(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return 1;
        }
        Stack<File> stack = new Stack<File>();
        stack.push(file);
        int n8 = 0;
        block0: while (((AbstractCollection)stack).size() > 0) {
            File[] fileArray = ((File)stack.pop()).listFiles(filenameFilter);
            if (fileArray == null) continue;
            int n9 = fileArray.length;
            int n10 = 0;
            int n11 = n8;
            while (true) {
                n8 = n11;
                if (n10 >= n9) continue block0;
                file = fileArray[n10];
                n8 = n11;
                if (!file.getName().startsWith(".")) {
                    if (file.isDirectory()) {
                        stack.push(file);
                        n8 = n11;
                    } else {
                        n8 = n11 + 1;
                    }
                }
                ++n10;
                n11 = n8;
            }
        }
        return n8;
    }

    public static W w(Context context, Uri uri) {
        return B.x(context, uri, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static W x(Context var0, Uri var1_7, String var2_8) {
        block34: {
            block31: {
                block30: {
                    block33: {
                        block28: {
                            block32: {
                                block29: {
                                    if (!B.Q(var1_7)) {
                                        var10_10 /* !! */  = new String[]{"_display_name", "_size"};
                                        var3_11 = false;
                                    } else {
                                        var10_10 /* !! */  = new String[]{"_display_name", "_size", "_data"};
                                        var3_11 = true;
                                    }
                                    var16_12 = var0.getContentResolver();
                                    var11_13 /* !! */  = null;
                                    var15_14 = null;
                                    var4_15 = -1L;
                                    var12_16 = var16_12.query(var1_7, var10_10 /* !! */ , null, null, null);
                                    if (var12_16 == null) break block28;
                                    try {
                                        if (!var12_16.moveToFirst()) break block28;
                                        var14_17 = var12_16.getString(0);
                                        if (!TextUtils.isEmpty((CharSequence)var14_17) && !var14_17.contains(".")) {
                                            var10_10 /* !! */  = var2_8 == null ? v.d(var16_12.getType(var1_7)) : var2_8;
                                        }
                                        break block29;
                                    }
                                    catch (Throwable var0_1) {
                                        break block30;
                                    }
                                    catch (RuntimeException var0_3) {
                                        var0 = var14_17;
lbl26:
                                        // 3 sources

                                        while (true) {
                                            var10_10 /* !! */  = var2_8;
                                            var2_8 = var0;
                                            var0 = var10_10 /* !! */ ;
                                            break block31;
                                            break;
                                        }
                                    }
                                    catch (Throwable var0_5) {
                                        var12_16 = null;
                                        break block30;
                                    }
                                    catch (RuntimeException var0_6) {
                                        var12_16 = null;
                                        var0 = null;
                                        ** GOTO lbl26
                                    }
                                    catch (RuntimeException var0_4) {
                                        var0 = null;
                                        ** continue;
                                    }
                                    var11_13 /* !! */  = var14_17;
                                    var2_8 = var10_10 /* !! */ ;
                                    if (var10_10 /* !! */  != null) {
                                        var0 = var14_17;
                                        var13_18 /* !! */  = var10_10 /* !! */ ;
                                        var8_19 = var4_15;
                                        try {
                                            var0 = var14_17;
                                            var13_18 /* !! */  = var10_10 /* !! */ ;
                                            var8_19 = var4_15;
                                            var2_8 = new StringBuilder();
                                            var0 = var14_17;
                                            var13_18 /* !! */  = var10_10 /* !! */ ;
                                            var8_19 = var4_15;
                                            var2_8.append(var14_17);
                                            var0 = var14_17;
                                            var13_18 /* !! */  = var10_10 /* !! */ ;
                                            var8_19 = var4_15;
                                            var2_8.append(".");
                                            var0 = var14_17;
                                            var13_18 /* !! */  = var10_10 /* !! */ ;
                                            var8_19 = var4_15;
                                            var2_8.append((String)var10_10 /* !! */ );
                                            var0 = var14_17;
                                            var13_18 /* !! */  = var10_10 /* !! */ ;
                                            var8_19 = var4_15;
                                            var11_13 /* !! */  = var2_8.toString();
                                            var2_8 = var10_10 /* !! */ ;
                                            break block32;
                                        }
                                        catch (RuntimeException var2_9) {
                                            var2_8 = var0;
                                            var0 = var13_18 /* !! */ ;
                                            var4_15 = var8_19;
                                            break block31;
                                        }
                                    }
                                    break block32;
                                }
                                var11_13 /* !! */  = var14_17;
                            }
                            var10_10 /* !! */  = var11_13 /* !! */ ;
                            if (var11_13 /* !! */  != null) {
                                var0 = var11_13 /* !! */ ;
                                var13_18 /* !! */  = var2_8;
                                var8_19 = var4_15;
                                var10_10 /* !! */  = var11_13 /* !! */ ;
                                if (var11_13 /* !! */ .contains("/")) {
                                    var0 = var11_13 /* !! */ ;
                                    var13_18 /* !! */  = var2_8;
                                    var8_19 = var4_15;
                                    var10_10 /* !! */  = d0.i((String)var11_13 /* !! */ );
                                }
                            }
                            var0 = var10_10 /* !! */ ;
                            var13_18 /* !! */  = var2_8;
                            var8_19 = var4_15;
                            var6_20 = var4_15;
                            if (!var12_16.isNull(1)) {
                                var0 = var10_10 /* !! */ ;
                                var13_18 /* !! */  = var2_8;
                                var8_19 = var4_15;
                                var6_20 = var12_16.getLong(1);
                            }
                            var11_13 /* !! */  = var15_14;
                            if (var3_11) {
                                var0 = var10_10 /* !! */ ;
                                var13_18 /* !! */  = var2_8;
                                var8_19 = var6_20;
                                var11_13 /* !! */  = var15_14;
                                if (!var12_16.isNull(2)) {
                                    var0 = var10_10 /* !! */ ;
                                    var13_18 /* !! */  = var2_8;
                                    var8_19 = var6_20;
                                    var11_13 /* !! */  = var12_16.getString(2);
                                }
                            }
                            var13_18 /* !! */  = var11_13 /* !! */ ;
                            var11_13 /* !! */  = var10_10 /* !! */ ;
                            var10_10 /* !! */  = var2_8;
                            var4_15 = var6_20;
                            break block33;
                        }
                        var13_18 /* !! */  = null;
                        var10_10 /* !! */  = var2_8;
                    }
                    var14_17 = var13_18 /* !! */ ;
                    var0 = var10_10 /* !! */ ;
                    var6_20 = var4_15;
                    var2_8 = var11_13 /* !! */ ;
                    if (var12_16 != null) {
                        var12_16.close();
                        var14_17 = var13_18 /* !! */ ;
                        var0 = var10_10 /* !! */ ;
                        var6_20 = var4_15;
                        var2_8 = var11_13 /* !! */ ;
                    }
                    break block34;
                }
                if (var12_16 != null) {
                    var12_16.close();
                }
                throw var0_2;
            }
            if (var12_16 != null) {
                var12_16.close();
            }
            var14_17 = null;
            var6_20 = var4_15;
        }
        var10_10 /* !! */  = var2_8;
        if (TextUtils.isEmpty((CharSequence)var2_8)) {
            var10_10 /* !! */  = var11_13 /* !! */  = d0.h(var1_7.getPath());
            if (TextUtils.isEmpty((CharSequence)d0.f((String)var11_13 /* !! */ ))) {
                var2_8 = var0;
                if (var0 == null) {
                    var2_8 = v.d(var16_12.getType(var1_7));
                }
                var10_10 /* !! */  = var11_13 /* !! */ ;
                if (var2_8 != null) {
                    var0 = new StringBuilder();
                    var0.append((String)var11_13 /* !! */ );
                    var0.append(".");
                    var0.append((String)var2_8);
                    var10_10 /* !! */  = var0.toString();
                }
            }
        }
        return new W((String)var10_10 /* !! */ , var6_20, var14_17);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String y(AssetFileDescriptor object) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            parcelFileDescriptor = object.getParcelFileDescriptor();
            if (parcelFileDescriptor == null) return null;
        }
        catch (IOException iOException) {
            return null;
        }
        File file = new File(B.s(parcelFileDescriptor));
        if (!file.exists()) return null;
        if (!B.R(file)) return null;
        return file.getCanonicalPath();
    }

    public static n z(o o8, n n8) throws ax.b3.j {
        Comparable<StringBuilder> comparable;
        int n9 = 0;
        do {
            int n10;
            if (o8.Z()) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append(n8.E());
                ((StringBuilder)comparable).append(".tmp.");
                n10 = n9 + 1;
                ((StringBuilder)comparable).append(n9);
                comparable = o8.z(((StringBuilder)comparable).toString());
                n9 = n10;
                continue;
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append(n8.E());
            ((StringBuilder)comparable).append(".");
            n10 = n9 + 1;
            ((StringBuilder)comparable).append(n9);
            ((StringBuilder)comparable).append(".tmp");
            comparable = o8.z(((StringBuilder)comparable).toString());
            n9 = n10;
        } while (comparable.n());
        return comparable;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = ax.c3.B$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

