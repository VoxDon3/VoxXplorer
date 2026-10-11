/*
 * Decompiled with CFR 0.152.
 */
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
import ax.Ha.c;
import ax.Q2.b;
import ax.Q2.g;
import ax.X2.J;
import ax.X2.N;
import ax.X2.O;
import ax.X2.Q;
import ax.X2.a;
import ax.X2.w;
import ax.X2.y;
import ax.Z2.m;
import ax.Z2.r;
import ax.Z2.u;
import ax.c3.d0;
import ax.t3.k;
import ax.u3.B;
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

public class K {
    private static final Logger a = ax.Q2.g.a(K.class);
    static String[] b = new String[]{"IPSM", "external_sd1", "external_sd2", "extsd", "external_sd", "fakeUuid"};
    static String[] c = new String[]{"/storage/sdcard1", "/storage/extSdCard", "/storage/external_SD", "/storage/ext_sd", "/storage/external_sd", "/storage/extsd", "/storage/ext_sdcard1"};
    @SuppressLint(value={"SdCardPath"})
    static String[] d = new String[]{"/storage/sdcard1", "/storage/extSdCard", "/storage/external_SD", "/storage/ext_sd", "/storage/removable/sdcard1", "/storage/external_sd", "/storage/extsd", "/mnt/ext_card", "/mnt/sdcard2", "/mnt/external1", "/mnt/sdcard-ext", "/mnt/extSdCard", "/mnt/sdextcard", "/mnt/external_sd", "/mnt/extsd"};
    @SuppressLint(value={"SdCardPath"})
    static String[] e = new String[]{"/mnt/sdcard/external_sd", "/mnt/sdcard/ext_sd", "/mnt/sdcard/_ExternalSD"};
    static String[] f = new String[]{"samsung", "htc", "lge"};
    static HashMap<String, u.a> g = new HashMap();
    static HashSet<String> h = new HashSet<String>(Arrays.asList(b));

    static String A() {
        File[] fileArray = new File("/storage").listFiles();
        String string = "";
        CharSequence charSequence = string;
        if (fileArray != null) {
            int n8 = fileArray.length;
            int n9 = 0;
            while (true) {
                charSequence = string;
                if (n9 >= n8) break;
                Object object = fileArray[n9];
                charSequence = string;
                if (object != null) {
                    if ("emulated".equalsIgnoreCase((String)(object = ((File)object).getName()))) {
                        charSequence = string;
                    } else if ("self".equalsIgnoreCase((String)object)) {
                        charSequence = string;
                    } else if ("enc_emulated".equalsIgnoreCase((String)object)) {
                        charSequence = string;
                    } else if ("Private".equalsIgnoreCase((String)object)) {
                        charSequence = string;
                    } else if ("remote".equalsIgnoreCase((String)object)) {
                        charSequence = string;
                    } else {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string);
                        ((StringBuilder)charSequence).append((String)object);
                        ((StringBuilder)charSequence).append(",");
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                }
                ++n9;
                string = charSequence;
            }
        }
        return charSequence;
    }

    /*
     * Exception decompiling
     */
    private static u.a B(N var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [28 : 204->208)] java.lang.Throwable
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

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static u.a C(StorageManager object, N n8) {
        O o8;
        N var1_4;
        try {
            o8 = w.i(object, (N)var1_4);
            if (var1_4.n() != null) {
                return K.t((N)var1_4, var1_4.l(), var1_4.n(), o8);
            }
            if (o8 == null) return null;
        }
        catch (Exception exception) {
            return null;
        }
        return K.u(var1_4.l(), o8);
    }

    private static u.a D(StorageManager object, N n8) {
        u.a a8 = g.get(K.P(n8.l(), n8.n()));
        if (a8 != null) {
            return a8;
        }
        if ((object = K.C(object, n8)) != null) {
            return object;
        }
        object = K.B(n8);
        if (object != null) {
            return object;
        }
        return u.a.j0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List<u> E() {
        block12: {
            var5 /* !! */  = ax.Q2.b.h().g();
            var10_1 = new ArrayList<u>();
            var11_2 = (StorageManager)var5 /* !! */ .getSystemService("storage");
            if (var11_2 == null) break block12;
            var4_3 /* !! */  = ax.X2.a.b(var11_2).iterator();
            var2_4 = null;
            var3_5 = null;
            var0_6 = false;
            block0: while (var4_3 /* !! */ .hasNext()) {
                block15: {
                    block13: {
                        block14: {
                            var6_8 = var4_3 /* !! */ .next();
                            var14_14 = var6_8.n();
                            var13_13 = var6_8.k();
                            var12_12 = var6_8.l();
                            var8_10 /* !! */  = var6_8.a(var5 /* !! */ );
                            if (!K.H((String)var8_10 /* !! */ ) || (var7_9 = var6_8.c(var11_2)) == null) {
                                var7_9 = var8_10 /* !! */ ;
                            }
                            var15_15 = var6_8.i();
                            var1_7 = var6_8.r();
                            if (!var6_8.p()) break block13;
                            if (!var0_6) {
                                var2_4 = new u(u.a.q, var12_12, var14_14, (String)var7_9, var15_15, (String)var13_13, var1_7);
                                var10_1.add((u)var2_4);
                                var0_6 = true;
                                var3_5 = var6_8;
                                continue;
                            }
                            if (!J.j() || !"/storage/emulated/0".equals(var13_13)) break block14;
                            var8_10 /* !! */  = K.y();
                            if (var8_10 /* !! */  != null && var13_13.equals(var8_10 /* !! */ .getAbsolutePath())) {
                                if ("/storage/emulated/0".equals(var2_4.f)) {
                                    var9_11 = var2_4;
                                    var8_10 /* !! */  = var3_5;
                                } else {
                                    var8_10 /* !! */  = K.D(var11_2, (N)var3_5);
                                    if (var8_10 /* !! */  == u.a.d0) {
                                        var2_4.a = var8_10 /* !! */ ;
                                        var2_4 = new u(u.a.q, var12_12, var14_14, (String)var7_9, var15_15, (String)var13_13, var1_7);
                                        var10_1.add((u)var2_4);
                                    } else {
                                        var10_1.remove(var2_4);
                                        var3_5 = new u(u.a.q, var12_12, var14_14, (String)var7_9, var15_15, (String)var13_13, var1_7);
                                        var10_1.add((u)var3_5);
                                        var13_13 = ax.Ha.c.h().f().b("!!!Unexpected Primary!!!").j();
                                        var9_11 = new StringBuilder();
                                        var9_11.append("uuid:");
                                        var9_11.append(var2_4.b);
                                        var9_11.append(",path:");
                                        var9_11.append(var2_4.f);
                                        var9_11.append(",type:");
                                        var9_11.append(var8_10 /* !! */ );
                                        var9_11.append(",desc:");
                                        var9_11.append(var2_4.c);
                                        var9_11.append(",new uuid:");
                                        var9_11.append(var12_12);
                                        var9_11.append(",new desc:");
                                        var9_11.append((String)var7_9);
                                        var13_13.g(var9_11.toString()).h();
                                        var2_4 = var3_5;
                                    }
                                    var8_10 /* !! */  = var6_8;
                                    var9_11 = var2_4;
                                }
lbl76:
                                // 7 sources

                                while (true) {
                                    var2_4 = var9_11;
                                    var3_5 = var8_10 /* !! */ ;
                                    continue block0;
                                    break;
                                }
                            }
                            var6_8 = var8_10 /* !! */  == null ? "null" : var8_10 /* !! */ .getAbsolutePath();
                            var7_9 = ax.Ha.c.h().f().b("!!!Primary is not internal!!!").j();
                            var8_10 /* !! */  = new StringBuilder();
                            var8_10 /* !! */ .append("uuid:");
                            var8_10 /* !! */ .append(var2_4.b);
                            var8_10 /* !! */ .append(",path:");
                            var8_10 /* !! */ .append(var2_4.f);
                            var8_10 /* !! */ .append(",desc:");
                            var8_10 /* !! */ .append(var2_4.c);
                            var8_10 /* !! */ .append(",primarypath:");
                            var8_10 /* !! */ .append((String)var6_8);
                            var7_9.g(var8_10 /* !! */ .toString()).h();
                            var9_11 = var2_4;
                            var8_10 /* !! */  = var3_5;
                            ** GOTO lbl76
                        }
                        if ("/storage/emulated/0".equals(var13_13) && "/storage/emulated/0".equals(var2_4.f) || K.D(var11_2, (N)var6_8) == u.a.d0) break block13;
                        var9_11 = var2_4;
                        var8_10 /* !! */  = var3_5;
                        ** GOTO lbl76
                    }
                    var9_11 = var2_4;
                    var8_10 /* !! */  = var3_5;
                    if (var12_12 == null) ** GOTO lbl76
                    if (!"Private".equalsIgnoreCase(var12_12)) break block15;
                    var9_11 = var2_4;
                    var8_10 /* !! */  = var3_5;
                    ** GOTO lbl76
                }
                var10_1.add(new u(K.D(var11_2, (N)var6_8), var12_12, var14_14, (String)var7_9, var15_15, (String)var13_13, var1_7));
                var9_11 = var2_4;
                var8_10 /* !! */  = var3_5;
                ** continue;
            }
            if (Q.p() && (var2_4 = w.n(var11_2)) != null) {
                var7_9 = var2_4.iterator();
                while (var7_9.hasNext()) {
                    var8_10 /* !! */  = var7_9.next();
                    if (!var8_10 /* !! */ .l() || var8_10 /* !! */ .c() != 2 || (var6_8 = var8_10 /* !! */ .f()) == null || !K.K((String)var6_8) && !K.N((String)var6_8) || K.G(var10_1, (String)var6_8, (String)(var5 /* !! */  = var8_10 /* !! */ .h()))) continue;
                    var4_3 /* !! */  = K.u((String)var6_8, (O)var8_10 /* !! */ );
                    var3_5 = var8_10 /* !! */ .f;
                    if (!K.H((String)var3_5) || (var2_4 = var8_10 /* !! */ .h) == null) {
                        var2_4 = var3_5;
                    }
                    var10_1.add(new u((u.a)var4_3 /* !! */ , (String)var6_8, (String)var5 /* !! */ , (String)var2_4, "mounted", var8_10 /* !! */ .g(), true));
                }
            }
        }
        return var10_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String F(String string, String string2) {
        Iterator<N> iterator;
        block5: {
            try {
                iterator = ax.X2.a.b((StorageManager)ax.Q2.b.h().g().getSystemService("storage")).iterator();
                break block5;
            }
            catch (Exception exception) {}
            ax.Ha.c.h().f().d("GET VOLUME STATE EXCEPTION").l(exception).h();
            return "unknown";
        }
        while (iterator.hasNext()) {
            String string3;
            N n8 = iterator.next();
            if (n8.p() || (string3 = n8.l()) == null || "Private".equalsIgnoreCase(string3)) continue;
            String string4 = n8.n();
            if (!B.j(string3, string) || !B.j(string4, string2)) continue;
            string = n8.i();
            if (string == null) {
                return "unknown";
            }
            return string;
        }
        if (Build.VERSION.SDK_INT == 23 && K.r().contains(string)) {
            return "mounted";
        }
        return "unknown";
    }

    private static boolean G(List<u> object, String string, String string2) {
        Iterator<u> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!B.j(string, ((u)object).b) || !B.j(string2, ((u)object).g)) continue;
            return true;
        }
        return false;
    }

    private static boolean H(String string) {
        if (string == null) {
            return true;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < string.length(); ++i8) {
            int n9 = n8;
            if (string.charAt(i8) == '-') {
                n9 = n8 + 1;
            }
            n8 = n9;
        }
        if (n8 > 3) {
            Logger logger = a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Broken volume detected : ");
            stringBuilder.append(string);
            logger.severe(stringBuilder.toString());
            return true;
        }
        return false;
    }

    private static boolean I(char c8) {
        return c8 >= '0' && c8 <= '9';
    }

    public static boolean J(String string) {
        return string.startsWith("/storage/emulated/");
    }

    public static boolean K(String string) {
        if (string != null && string.length() == 9) {
            return string.charAt(4) == '-';
        }
        return false;
    }

    public static boolean L(String string) {
        return h.contains(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean M(File file, File file2) {
        Object object;
        Object object2;
        block13: {
            if (file == null) return false;
            if (file2 == null) {
                return false;
            }
            if (Q.P1()) {
                long l8;
                try {
                    object2 = Os.stat((String)file.getAbsolutePath());
                    object = Os.stat((String)file2.getAbsolutePath());
                    l8 = ((StructStat)object2).st_ino;
                    if (l8 != 0L) {
                        if (l8 != ((StructStat)object).st_ino) return false;
                        return true;
                    }
                }
                catch (Exception exception) {
                    break block13;
                }
                if (((StructStat)object2).st_mtime != ((StructStat)object).st_mtime) {
                    return false;
                }
                long l9 = ((StructStat)object2).st_dev;
                if (l9 != 0L && l9 != (l8 = ((StructStat)object).st_dev)) {
                    return false;
                }
            }
        }
        if (file.lastModified() != file2.lastModified()) {
            return false;
        }
        object2 = new File(file, "Android");
        object = new File(file2, "Android");
        if (((File)object2).lastModified() != ((File)object).lastModified()) {
            return false;
        }
        if ("/storage/sdcard0".equals(file.getAbsolutePath())) {
            if ("/storage/emulated/0".equals(file2.getAbsolutePath())) return true;
            if ("/storage/emulated/legacy".equals(file2.getAbsolutePath())) {
                return true;
            }
        }
        object2 = new File(file, ".android_secure");
        object = new File(file2, ".android_secure");
        if (((File)object2).lastModified() != ((File)object).lastModified()) {
            return false;
        }
        object = file.list();
        object2 = file2.list();
        if (object != null && object2 != null && ((Object)object).length == ((Object)object2).length) {
            object = ax.Ha.c.h().f().c("SAME FOLDER CHECK 1?");
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(file.getAbsolutePath());
            ((StringBuilder)object2).append(",");
            ((StringBuilder)object2).append(file2.getAbsolutePath());
            ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
            return true;
        }
        object = ax.Ha.c.h().f().c("SAME FOLDER CHECK 2?");
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(file.getAbsolutePath());
        ((StringBuilder)object2).append(",");
        ((StringBuilder)object2).append(file2.getAbsolutePath());
        ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
        return false;
    }

    public static boolean N(String string) {
        if (string == null) {
            return false;
        }
        if (string.matches("[0-9A-Z]{16}")) {
            return true;
        }
        if (string.length() == 36 && string.charAt(8) == '-' && string.charAt(13) == '-' && string.charAt(18) == '-' && string.charAt(23) == '-') {
            return true;
        }
        return string.matches("[0-9A-Z]{40}");
    }

    private static boolean O(Context context, String object) {
        if (context == null) {
            return false;
        }
        object = ax.X2.a.a((StorageManager)(context = (StorageManager)context.getSystemService("storage")), new File((String)object));
        if (object == null) {
            return false;
        }
        return ((N)object).l() != null && u.c(K.D((StorageManager)context, (N)object));
    }

    private static String P(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(":");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static void Q(String string, String string2, u.a a8) {
        g.put(K.P(string, string2), a8);
    }

    private static void R(N object, String string, String string2, String string3, O object2, boolean bl, boolean bl2) {
        int n8;
        block7: {
            block6: {
                if (!k.v() || string == null || string.startsWith("/media/fuse/crostini")) break block6;
                n8 = object2 != null ? ((O)object2).e() : 0;
                if (bl2) {
                    object2 = ax.Ha.c.h().f().c("Unknown Volume Id format chrome 1:");
                    object = new StringBuilder();
                    ((StringBuilder)object).append("volumeId:");
                    ((StringBuilder)object).append(K.S(string));
                    ((StringBuilder)object).append(",desc:");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(",path:");
                    ((StringBuilder)object).append(string3);
                    ((StringBuilder)object).append(",flags:");
                    ((StringBuilder)object).append(n8);
                    ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                    return;
                }
                if (bl) {
                    object2 = ax.Ha.c.h().f().c("Unknown Volume Id format chrome 2:");
                    object = new StringBuilder();
                    ((StringBuilder)object).append("volumeId:");
                    ((StringBuilder)object).append(K.S(string));
                    ((StringBuilder)object).append(",desc:");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(",path:");
                    ((StringBuilder)object).append(string3);
                    ((StringBuilder)object).append(",flags:");
                    ((StringBuilder)object).append(n8);
                    ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                    return;
                }
                if ((string3 == null || !string3.endsWith("-999")) && (string2 == null || !string2.startsWith("caf-999"))) break block7;
            }
            return;
        }
        if (string3 != null && string3.equals("/storage/emulated/0")) {
            object = K.y();
            object = object != null ? ((File)object).getAbsolutePath() : "null";
            object2 = ax.Ha.c.h().f().b("!!!Unknown Primary!!!").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("volumeId:");
            stringBuilder.append(K.S(string));
            stringBuilder.append(",desc:");
            stringBuilder.append(string2);
            stringBuilder.append(",path:");
            stringBuilder.append(string3);
            stringBuilder.append(",flags:");
            stringBuilder.append(n8);
            stringBuilder.append(",primary:");
            stringBuilder.append((String)object);
            ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
            return;
        }
        object2 = ax.Ha.c.h().f().c("Unknown Volume Id format 3:");
        object = new StringBuilder();
        ((StringBuilder)object).append("volumeId:");
        ((StringBuilder)object).append(K.S(string));
        ((StringBuilder)object).append(",desc:");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(",path:");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(",flags:");
        ((StringBuilder)object).append(n8);
        ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
    }

    static String S(String string) {
        Object object = string.split("[,_.-]");
        if (!string.equals(object[0])) {
            return object[0];
        }
        int n8 = B.W(string, ':', 2);
        if (n8 != -1) {
            return string.substring(0, n8);
        }
        object = string;
        if (string.length() > 0) {
            object = string;
            if (K.I(string.charAt(0))) {
                String[] stringArray = string.split("[,_:]");
                object = string;
                if (!string.equals(stringArray[0])) {
                    object = stringArray[0];
                }
            }
        }
        return object;
    }

    public static boolean a(Context object) {
        if ((object = w.n((StorageManager)object.getSystemService("storage"))) != null) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (O)iterator.next();
                if (!((O)object).j() || !((O)object).i() || ((O)object).g() == null || !((O)object).g().startsWith("/mnt/expand")) continue;
                return true;
            }
        }
        return false;
    }

    @TargetApi(value=19)
    private static final String b(List<String> list) {
        Object object;
        block7: {
            Object object2;
            String string;
            List<File> list2;
            block8: {
                list2 = K.x();
                string = null;
                object2 = null;
                object = string;
                if (list2 == null) break block7;
                if (list2.size() != 0) break block8;
                object = string;
                break block7;
            }
            File file = K.y();
            int n8 = 0;
            while (true) {
                block6: {
                    block10: {
                        block12: {
                            Comparable<File> comparable;
                            block11: {
                                int n9;
                                block9: {
                                    object = object2;
                                    if (n8 >= list2.size()) break;
                                    string = list2.get(n8).getAbsolutePath();
                                    if (file == null || !string.startsWith(file.getAbsolutePath())) break block9;
                                    object = object2;
                                    break block6;
                                }
                                if (list != null) {
                                    object = list.iterator();
                                    while (object.hasNext()) {
                                        if (!string.startsWith((String)object.next())) continue;
                                        object = object2;
                                        break block6;
                                    }
                                }
                                if ((n9 = string.indexOf("/Android")) == -1) break block10;
                                string = string.substring(0, n9);
                                comparable = new File(string);
                                if (!K.J(string) || !K.M(file, (File)comparable)) break block11;
                                object = object2;
                                if (!"/storage/sdcard0".equals(file.getAbsolutePath())) {
                                    object = ax.Ha.c.h().f().c("EMULATED STORAGE IS ACTULLAY PRIMARY STORAGE");
                                    comparable = new StringBuilder();
                                    ((StringBuilder)comparable).append("index:");
                                    ((StringBuilder)comparable).append(list2.size());
                                    ((StringBuilder)comparable).append(",path:");
                                    ((StringBuilder)comparable).append(string);
                                    ((StringBuilder)comparable).append(",external:");
                                    ((StringBuilder)comparable).append(file.getAbsolutePath());
                                    ((ax.Ha.b)object).g(((StringBuilder)comparable).toString()).h();
                                    object = object2;
                                }
                                break block6;
                            }
                            object = object2;
                            if (!((File)comparable).exists()) break block6;
                            object = object2;
                            if (!((File)comparable).isDirectory()) break block6;
                            if (object2 == null) break block12;
                            object = object2;
                            if (!"/storage/sdcard1".equals(string)) break block6;
                        }
                        object = string;
                        break block6;
                    }
                    ax.Ha.c.h().f().d("ERROR STORAGE PATH").g(string).h();
                    object = object2;
                }
                ++n8;
                object2 = object;
            }
        }
        return object;
    }

    public static final m c() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 24) {
            return K.j();
        }
        if (n8 >= 23) {
            return K.h();
        }
        return new m(K.g(), null);
    }

    private static final String d() {
        String string;
        int n8;
        Object object = K.y();
        object = object != null ? ((File)object).getAbsolutePath() : null;
        Object object2 = d;
        int n9 = ((String[])object2).length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            File file;
            string = object2[n8];
            if (object != null && ((String)object).equals(string) || !(file = new File(string)).exists() || !file.isDirectory() || !file.canRead()) continue;
            return string;
        }
        string = K.e();
        n8 = n10;
        if (string != null) {
            object = new File(string);
            n8 = n10;
            if (((File)object).exists()) {
                n8 = n10;
                if (((File)object).isDirectory()) {
                    return string;
                }
            }
        }
        while (n8 < ((String[])(object = e)).length) {
            object = object[n8];
            string = f[n8];
            object2 = new File((String)object);
            if (((File)object2).exists() && ((File)object2).isDirectory() && string.equals(Build.MANUFACTURER)) {
                return object;
            }
            ++n8;
        }
        return null;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final String e() {
        Object object;
        Object object2;
        block22: {
            int n8;
            int n9;
            int n10;
            boolean bl;
            ArrayList<Object> arrayList;
            ArrayList<Object> arrayList2;
            block25: {
                block27: {
                    block24: {
                        block23: {
                            Object object3222;
                            arrayList2 = new ArrayList<Object>();
                            arrayList = new ArrayList<Object>();
                            String[] stringArray = null;
                            object2 = System.getenv("SECONDARY_STORAGE");
                            bl = TextUtils.isEmpty((CharSequence)object2);
                            n10 = 0;
                            if (!bl) {
                                for (Object object3222 : ((String)object2).split(File.pathSeparator)) {
                                    object2 = new File((String)object3222);
                                    if (!((File)object2).exists() || !((File)object2).isDirectory()) continue;
                                    return object3222;
                                }
                            }
                            object = new File("/proc/mounts");
                            object2 = new Scanner((File)object);
                            try {
                                block26: {
                                    object = K.y();
                                    break block26;
                                    catch (Throwable throwable) {
                                        object = stringArray;
                                        break block22;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        object2 = null;
                                        break block23;
                                    }
                                    catch (IOException iOException) {
                                        object2 = null;
                                        break block24;
                                    }
                                }
                                while (bl = ((Scanner)object2).hasNext()) {
                                    Object object4 = ((Scanner)object2).nextLine();
                                    object3222 = ((String)object4).toLowerCase(Locale.US);
                                    if (!((String)object3222).contains("/vold/") || ((String)object3222).contains("asec") || ((String[])(object3222 = ((String)object4).split("\\s+"))).length < 2) continue;
                                    object3222 = object3222[1];
                                    if (object != null && ((String)object3222).equals(((File)object).getAbsolutePath()) || !((File)(object4 = new File((String)object3222))).exists() || !((File)object4).isDirectory()) continue;
                                    arrayList2.add(object3222);
                                }
                                ((Scanner)object2).close();
                                object = new File("/system/etc/vold.fstab");
                                object = new Scanner((File)object);
                            }
                            catch (Throwable throwable) {
                                object = object2;
                                object2 = throwable;
                                break block22;
                            }
                            while (((Scanner)object).hasNext()) {
                                object2 = ((Scanner)object).nextLine();
                                if (!((String)object2).startsWith("dev_mount") || ((String[])(object2 = ((String)object2).split("\\s+"))).length <= 2) continue;
                                object2[2] = object3222 = object2[2].replaceAll(":.*$", "");
                                arrayList.add(object3222);
                            }
                            ((Scanner)object).close();
                            n9 = 0;
                            break block25;
                            catch (RuntimeException runtimeException) {
                                break block23;
                            }
                            catch (IOException iOException) {
                                break block24;
                            }
                            catch (Throwable throwable) {
                                break block22;
                            }
                            catch (RuntimeException runtimeException) {
                                object2 = object;
                            }
                        }
                        if (object2 == null) return null;
                        break block27;
                        catch (IOException iOException) {
                            object2 = object;
                        }
                    }
                    if (object2 == null) return null;
                }
                ((Scanner)object2).close();
                return null;
            }
            while (true) {
                n8 = n10;
                {
                    if (n9 >= arrayList2.size()) break;
                    n8 = n9;
                    if (!arrayList.contains((String)arrayList2.get(n9))) {
                        arrayList2.remove(n9);
                        n8 = n9 - 1;
                    }
                    n9 = n8 + 1;
                    continue;
                }
                break;
            }
            {
                while (n8 < arrayList2.size()) {
                    object2 = (String)arrayList2.get(n8);
                    bl = ((String)object2).toLowerCase().contains("usb");
                    if (!bl) return object2;
                    ++n8;
                }
                return null;
            }
        }
        if (object == null) throw object2;
        ((Scanner)object).close();
        throw object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final String f(List<String> object) {
        String string;
        block11: {
            Object object2 = K.o();
            string = object2;
            if (object2 == null) {
                string = K.b((List<String>)object);
            }
            if (!TextUtils.isEmpty((CharSequence)(object = System.getenv("SECONDARY_STORAGE")))) {
                Object object3 = ((String)object).split(File.pathSeparator);
                int n8 = ((String[])object3).length;
                object2 = null;
                object = null;
                if (n8 > 1) {
                    int n9 = ((String[])object3).length;
                    n8 = 0;
                    while (true) {
                        object2 = object;
                        if (n8 >= n9) break;
                        object2 = object3[n8];
                        if (!((String)object2).toLowerCase().contains("usb")) {
                            if (((String)object2).equals(string)) {
                                return object2;
                            }
                            object = object2;
                        }
                        ++n8;
                    }
                }
                if (((String[])object3).length > 0) {
                    if (object2 == null) {
                        object2 = object3[0];
                    }
                    object3 = K.y();
                    object = new File((String)object2);
                    if (!K.J((String)object2)) {
                        if (((File)object).exists() || string == null) return object2;
                        return string;
                    }
                    try {
                        if (K.M((File)object3, (File)object)) break block11;
                        boolean bl = ((File)object).exists();
                        if (!bl && string != null) return string;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    return object2;
                }
            }
        }
        if (string == null) return K.d();
        return string;
    }

    private static final String g() {
        return K.f(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final m h() {
        Object object;
        Object object2 = K.b(null);
        if (object2 != null) {
            if (!K.O(ax.Q2.b.h().g(), (String)object2)) {
                return new m((String)object2, null);
            }
            object = new ArrayList<Object>();
            object.add(object2);
        } else {
            object = null;
        }
        object2 = K.i();
        if (object2 != null) {
            return object2;
        }
        object2 = K.f(object);
        if (object2 == null) return null;
        if (K.O(ax.Q2.b.h().g(), (String)object2)) return null;
        try {
            object = new File((String)object2);
            if (!((File)object).exists()) return null;
            return new m((String)object2, null);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final m i() {
        String string;
        File file;
        String string2;
        String string3;
        N n8;
        Object object;
        Object object2;
        block7: {
            StorageManager storageManager;
            block6: {
                try {
                    object2 = ax.Q2.b.h().g();
                    storageManager = (StorageManager)object2.getSystemService("storage");
                    object = ax.X2.a.b(storageManager).iterator();
                    break block6;
                }
                catch (Exception exception) {}
                ax.Ha.c.h().f().d("6.0 HIDDEN API EXCEPTION").l(exception).h();
                return null;
            }
            while (true) {
                String string4;
                if (!object.hasNext()) {
                    return null;
                }
                n8 = object.next();
                if (n8.p() || TextUtils.isEmpty((CharSequence)(string4 = n8.l())) || "Private".equalsIgnoreCase(string4) || u.a(K.D(storageManager, n8))) continue;
                n8.n();
                string3 = n8.a((Context)object2);
                string2 = K.z(string4);
                if (K.y() != null && string2.equals(K.y().getAbsolutePath())) continue;
                file = new File(string2);
                if (K.K(string4)) break block7;
                string = n8.i();
                if (!"mounted".equals(string) || !file.exists() || !file.isDirectory()) continue;
                if (!K.N(string4)) {
                    ax.Ha.b b8 = ax.Ha.c.h().f().c("INVALID UUID HAS FILE?? V23");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("uuid=");
                    stringBuilder.append(string4);
                    stringBuilder.append(",desc=");
                    stringBuilder.append(string3);
                    stringBuilder.append(",read=");
                    stringBuilder.append(file.canRead());
                    stringBuilder.append(",state=");
                    stringBuilder.append(string);
                    b8.g(stringBuilder.toString()).h();
                }
                if (file.canRead()) break;
            }
            return new m(string2, n8);
        }
        if (file.exists()) return new m(string2, n8);
        object = K.o();
        if (object != null) {
            return new m((String)object, null);
        }
        string = K.A();
        if (TextUtils.isEmpty((CharSequence)string)) return new m(string2, n8);
        object2 = ax.Ha.c.h().f().c("UUID is OK but File Not Found. More Info V23");
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(",desc:");
        ((StringBuilder)object).append(string3);
        ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
        return new m(string2, n8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @TargetApi(value=24)
    private static final m j() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = ax.Q2.b.h().g();
        Object object6 = (StorageManager)object5.getSystemService("storage");
        Object object7 = ax.X2.a.b((StorageManager)object6);
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator<N> iterator = object7.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            u.a var4_7;
            boolean bl2;
            block34: {
                block35: {
                    block30: {
                        block33: {
                            block31: {
                                block32: {
                                    object4 = iterator.next();
                                    if (((N)object4).p() || TextUtils.isEmpty((CharSequence)(object3 = ((N)object4).l())) || "Private".equals(object3)) continue;
                                    object2 = ((N)object4).n();
                                    u.a a8 = K.D((StorageManager)object6, (N)object4);
                                    object7 = ((N)object4).k();
                                    object = object7 != null ? new File((String)object7) : null;
                                    if (!J.q() || a8 != u.a.c0) break block30;
                                    if (object != null && ((File)object).exists() && ((File)object).canRead()) break block31;
                                    if ((object2 = K.w((String)object2)) == null || !new File((String)object2).exists()) break block32;
                                    object7 = object2;
                                    break block31;
                                }
                                if (object == null || !((File)object).exists()) break block33;
                            }
                            bl2 = true;
                            break block34;
                        }
                        object = ax.Ha.c.h().f().b("ChromeOS sd file not exist");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("path:");
                        stringBuilder.append((String)object7);
                        stringBuilder.append(",");
                        stringBuilder.append((String)object2);
                        stringBuilder.append(",");
                        stringBuilder.append((String)object3);
                        ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                        u.a a9 = u.a.e0;
                        object7 = K.z((String)object3);
                        break block35;
                    }
                    if (object == null || !((File)object).exists() || !((File)object).canRead()) {
                        object7 = K.z((String)object3);
                    }
                }
                bl2 = false;
            }
            if (u.a((u.a)var4_7)) {
                arrayList.add((String)object7);
                continue;
            }
            object = ((N)object4).a((Context)object5);
            object2 = K.y();
            if (object2 != null && ((String)object7).equals(((File)object2).getAbsolutePath())) {
                bl = true;
                continue;
            }
            object2 = new File((String)object7);
            if (!K.K((String)object3)) {
                if ("mounted".equals(((N)object4).i()) && ((File)object2).exists() && ((File)object2).isDirectory()) {
                    if (!K.N((String)object3) && !K.L((String)object3)) {
                        ax.Ha.b b8 = ax.Ha.c.h().f().c("INVALID UUID HAS FILE??");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("uuid=");
                        stringBuilder.append((String)object3);
                        stringBuilder.append(",desc=");
                        stringBuilder.append((String)object);
                        stringBuilder.append(",state=");
                        stringBuilder.append(((N)object4).i());
                        stringBuilder.append(",read=");
                        stringBuilder.append(((File)object2).canRead());
                        stringBuilder.append(",path=");
                        stringBuilder.append((String)object7);
                        b8.g(stringBuilder.toString()).h();
                    }
                    if (((File)object2).canRead()) {
                        return new m((String)object7, (N)object4);
                    }
                    if (bl2) {
                        return new m((String)object7, (N)object4);
                    }
                }
                if (!u.b((u.a)var4_7) || (object7 = K.v((Context)object5, (String)object3)) == null) continue;
                return new m((String)object7, (N)object4);
            }
            if (!((File)object2).exists()) {
                object2 = K.v((Context)object5, (String)object3);
                if (object2 != null) {
                    return new m((String)object2, (N)object4);
                }
                object2 = K.o();
                if (object2 != null) {
                    return new m((String)object2, null);
                }
                object2 = K.A();
                if (!TextUtils.isEmpty((CharSequence)object2)) {
                    object6 = ax.Ha.c.h().f().c("UUID is OK but File Not Found. More Info v24");
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append("uuid:");
                    ((StringBuilder)object5).append((String)object3);
                    ((StringBuilder)object5).append(",children:");
                    ((StringBuilder)object5).append((String)object2);
                    ((StringBuilder)object5).append(",type:");
                    ((StringBuilder)object5).append(var4_7);
                    ((StringBuilder)object5).append(",desc:");
                    ((StringBuilder)object5).append((String)object);
                    ((StringBuilder)object5).append(",path:");
                    ((StringBuilder)object5).append((String)object7);
                    ((ax.Ha.b)object6).g(((StringBuilder)object5).toString()).h();
                }
            }
            return new m((String)object7, (N)object4);
        }
        if (!bl) {
            if (Q.n()) {
                return null;
            }
            if (J.q() || J.B() || J.F() || J.v()) {
                return null;
            }
        }
        if ((object4 = K.b(arrayList)) == null) {
            return null;
        }
        boolean bl3 = "/storage/emulated/0".equals(object4);
        String string = "null";
        if (bl3) {
            if (!J.t()) {
                String var4_13;
                object7 = K.y();
                if (object7 != null) {
                    String string2 = ((File)object7).getAbsolutePath();
                }
                object = ax.Ha.c.h().f().b("V24 SDCARD DETECT EXCEPTION 0");
                object7 = new StringBuilder();
                ((StringBuilder)object7).append("path:");
                ((StringBuilder)object7).append(bl);
                ((StringBuilder)object7).append(",primary:");
                ((StringBuilder)object7).append((String)var4_13);
                ((StringBuilder)object7).append(",manufacturer:");
                ((StringBuilder)object7).append(Build.MANUFACTURER);
                ((ax.Ha.b)object).g(((StringBuilder)object7).toString()).h();
            }
            return new m((String)object4, null);
        }
        object3 = y.f((Context)object5, (String)object4);
        object7 = object3 != null ? ((N)object3).l() : null;
        object = object3 != null ? ((N)object3).n() : null;
        if (object3 != null) {
            if ((object6 = K.D((StorageManager)object6, (N)object3)) == u.a.d0) {
                return null;
            }
            object2 = object6;
            if (!((N)object3).p()) {
                object2 = object6;
                if (u.a((u.a)((Object)object6))) {
                    return null;
                }
            }
        } else {
            object2 = null;
        }
        if (!"/storage/emulated/0".equals(object4)) {
            if (object7 != null && ((String)object4).contains((CharSequence)object7)) {
                String var4_15;
                object6 = new StringBuilder();
                ((StringBuilder)object6).append("");
                ((StringBuilder)object6).append(((N)object3).p());
                object6 = ((StringBuilder)object6).toString();
                if (object2 != null) {
                    String string3 = ((Enum)object2).name();
                }
                object5 = ax.Ha.c.h().f().b("V24 SDCARD DETECT EXCEPTION 1");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("uuid:");
                ((StringBuilder)object2).append((String)object7);
                ((StringBuilder)object2).append("volumeid:");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(",path:");
                ((StringBuilder)object2).append((String)object4);
                ((StringBuilder)object2).append(",primary:");
                ((StringBuilder)object2).append((String)object6);
                ((StringBuilder)object2).append(",volumeType:");
                ((StringBuilder)object2).append((String)var4_15);
                ((ax.Ha.b)object5).g(((StringBuilder)object2).toString()).h();
            } else {
                object2 = ax.Ha.c.h().f().b("V24 SDCARD DETECT EXCEPTION 2");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("uuid:");
                stringBuilder.append((String)object7);
                stringBuilder.append("volumeid:");
                stringBuilder.append((String)object);
                stringBuilder.append(",path:");
                stringBuilder.append((String)object4);
                ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
            }
        }
        if (object != null && ((String)object).startsWith("public:8")) {
            return null;
        }
        return new m((String)object4, (N)object3);
    }

    public static r k(String string) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 24) {
            return K.n(string);
        }
        if (n8 >= 23) {
            return K.m(string);
        }
        return K.l(string);
    }

    @TargetApi(value=21)
    private static final r l(String string) {
        return K.p(string);
    }

    @TargetApi(value=23)
    private static final r m(String string) {
        return K.p(string);
    }

    @TargetApi(value=24)
    private static final r n(String string) {
        return K.p(string);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final String o() {
        int n8;
        int n9;
        String[] stringArray;
        Object object = K.y();
        object = object != null ? ((File)object).getAbsolutePath() : null;
        try {
            stringArray = c;
            n9 = stringArray.length;
            n8 = 0;
        }
        catch (Exception exception) {
            return null;
        }
        while (n8 < n9) {
            String string = stringArray[n8];
            {
                boolean bl;
                File file;
                if (!string.equals(object) && (file = new File(string)).exists() && file.isDirectory() && (bl = file.canRead())) {
                    return string;
                }
                ++n8;
            }
        }
        return null;
    }

    @TargetApi(value=21)
    private static final r p(String stringArray) {
        Object object;
        if (stringArray == null) {
            return r.q;
        }
        try {
            object = new File((String)stringArray);
            object = Environment.getExternalStorageState((File)object);
        }
        catch (NullPointerException nullPointerException) {
            object = "chrome os 9 null pointer error";
        }
        if (!"mounted".equals(object) && !"mounted_ro".equals(object)) {
            if ("unknown".equals(object)) {
                if ((stringArray = new File((String)stringArray)).exists() && stringArray.isDirectory() && stringArray.canRead()) {
                    return r.c0;
                }
                return r.d0;
            }
            if ((stringArray = new File((String)stringArray)).exists() && stringArray.isDirectory() && stringArray.canRead()) {
                int n8 = (stringArray = stringArray.list()) == null ? -1 : stringArray.length;
                if (n8 > 0) {
                    return r.c0;
                }
                return r.d0;
            }
            return r.d0;
        }
        return r.c0;
    }

    /*
     * Exception decompiling
     */
    public static String q() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [18 : 168->172)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Set<String> r() {
        Object object;
        Object object2;
        block15: {
            ax.B.b<String> b8;
            block16: {
                b8 = new ax.B.b<String>();
                Object var3_1 = null;
                Object object3 = null;
                object2 = object3;
                try {
                    object2 = object3;
                    object2 = object3;
                    File file = new File("/proc/mounts");
                    object2 = object3;
                    object = new Scanner(file);
                }
                catch (Throwable throwable) {
                    break block15;
                }
                catch (IOException iOException) {
                    object = var3_1;
                    break block16;
                }
                while (true) {
                    block17: {
                        try {
                            while (((Scanner)object).hasNext()) {
                                object2 = ((Scanner)object).nextLine();
                                object3 = object2.trim().toLowerCase(Locale.US);
                                if (!((String)object3).startsWith("/dev/block/vold/public:8") || !"public:8".equals(K.S(((String)object3).split("\\s+")[0].substring(16))) || ((String[])(object2 = object2.split("\\s+"))).length < 2) {
                                    continue;
                                }
                                break block17;
                            }
                            break;
                        }
                        catch (Throwable throwable) {
                            object3 = object;
                            object = throwable;
                            object2 = object3;
                            break block15;
                        }
                        catch (IOException iOException) {
                            break block16;
                        }
                    }
                    object3 = object2[1];
                    if (K.K((String)(object2 = d0.h((String)object3)))) {
                        b8.add((String)object2);
                        continue;
                    }
                    if (K.N((String)object2)) {
                        b8.add((String)object2);
                        continue;
                    }
                    if (!((String)object3).startsWith("/mnt/media_rw/") || !((File)(object3 = new File(K.z((String)object2)))).exists()) continue;
                    b8.add((String)object2);
                }
                ((Scanner)object).close();
                return b8;
            }
            object2 = object;
            {
                RuntimeException var2_5;
                var2_5.printStackTrace();
                if (object != null) {
                    ((Scanner)object).close();
                }
                return b8;
            }
        }
        if (object2 != null) {
            object2.close();
        }
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<u> s() {
        Object object;
        Iterator<N> iterator;
        Object object2;
        Context context;
        ArrayList<u> arrayList;
        block6: {
            arrayList = new ArrayList<u>();
            try {
                context = ax.Q2.b.h().g();
                object2 = (StorageManager)context.getSystemService("storage");
                iterator = ax.X2.a.b(object2).iterator();
                break block6;
            }
            catch (Exception exception) {}
            ax.Ha.c.h().f().d("6.0 HIDDEN API EXCEPTION").l(exception).h();
            return arrayList;
        }
        while (iterator.hasNext()) {
            Object object3;
            String string;
            u.a a8;
            String string2;
            Object object4 = iterator.next();
            if (((N)object4).p() || (string2 = ((N)object4).l()) == null || "Private".equalsIgnoreCase(string2) || !u.c(a8 = K.D(object2, (N)object4)) || !"mounted".equals(string = ((N)object4).i())) continue;
            String string3 = ((N)object4).k();
            object = ((N)object4).a(context);
            if (K.H((String)object) && (object3 = ((N)object4).c((StorageManager)object2)) != null) {
                object = object3;
            }
            object3 = ((N)object4).n();
            Logger logger = a;
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("USB VOLUME DETECTED : ");
            ((StringBuilder)object4).append(string2);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append(string3);
            ((StringBuilder)object4).append(",");
            ((StringBuilder)object4).append((String)object);
            logger.fine(((StringBuilder)object4).toString());
            object4 = new u(a8, string2, (String)object3, (String)object, string, string3, true);
            arrayList.add((u)object4);
        }
        if (arrayList.size() == 0 && Build.VERSION.SDK_INT == 23) {
            for (String string2 : K.r()) {
                object2 = context.getString(2131952191);
                object = new u(u.a.d0, string2, "public:8,49", (String)object2, "mounted", null, true);
                arrayList.add((u)object);
            }
        }
        return arrayList;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static u.a t(N object, String charSequence, String string, O object2) {
        block32: {
            block31: {
                if (string == null) {
                    return null;
                }
                Object object3 = K.S(string).toLowerCase();
                if (object2 != null && ((O)object2).j()) {
                    if ("public:8".equals(object3)) {
                        object /* !! */  = u.a.d0;
                        K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                        return object /* !! */ ;
                    }
                    if (((O)object2).k() && J.q() && (object /* !! */  = object /* !! */ .k()) != null && ((String)object /* !! */ ).equals("/storage/0000000000000000000000000000CAFEF00D2019")) {
                        object /* !! */  = u.a.g0;
                        K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                        return object /* !! */ ;
                    }
                    object /* !! */  = u.a.c0;
                    K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                    return object /* !! */ ;
                }
                if (!"public:8".equals(object3) && !"8".equals(object3)) {
                    if (!"public:179".equals(object3) && !"179".equals(object3)) {
                        if (!"public:253".equals(object3) && !"253".equals(object3)) {
                            if (!"public:200".equals(object3) && !"200".equals(object3)) {
                                if (!"public:11".equals(object3) && !"11".equals(object3)) {
                                    if (J.q()) {
                                        File file;
                                        String string2 = object /* !! */ .a(ax.Q2.b.h().g());
                                        String string3 = object /* !! */ .k();
                                        if (((String)object3).startsWith("/media/removable/")) {
                                            if (!((String)object3).startsWith("/media/removable/cdrom") && !((String)object3).startsWith("/media/removable/usb_dsd")) {
                                                if (((String)object3).contains("usb")) {
                                                    object /* !! */  = u.a.d0;
                                                    K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                                    return object /* !! */ ;
                                                }
                                                if (object2 != null && ((O)object2).l()) {
                                                    object /* !! */  = u.a.d0;
                                                    K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                                    return object /* !! */ ;
                                                }
                                                K.R(object /* !! */ , string, string2, string3, (O)object2, true, true);
                                                break block31;
                                            } else {
                                                object /* !! */  = u.a.f0;
                                                K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                                return object /* !! */ ;
                                            }
                                        }
                                        if ("/home/chronos/user/MyFiles".equals(string)) {
                                            object /* !! */  = u.a.g0;
                                            K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                            return object /* !! */ ;
                                        }
                                        if ("/storage/MyFiles".equals(string3)) {
                                            object /* !! */  = u.a.g0;
                                            K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                            return object /* !! */ ;
                                        }
                                        if (object2 != null && ((O)object2).l()) {
                                            object /* !! */  = u.a.d0;
                                            K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                            return object /* !! */ ;
                                        }
                                        if (string3 != null && (string3.equals("/storage/0000000000000000000000000000CAFEF00D2019") || string3.startsWith("/storage/") && object2 != null && ((O)object2).e() == 48)) {
                                            object /* !! */  = u.a.g0;
                                            K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                            return object /* !! */ ;
                                        }
                                        if (string3 != null && string3.startsWith("/storage/") && ((File)(object3 = new File(d0.Q(string3, "Downloads")))).exists() && (file = new File("/storage/emulated/0/Download")).exists() && ((File)object3).lastModified() == file.lastModified()) {
                                            object /* !! */  = u.a.g0;
                                            K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                            return object /* !! */ ;
                                        }
                                        K.R(object /* !! */ , string, string2, string3, (O)object2, true, false);
                                        break block32;
                                    }
                                    if (object2 != null && ((O)object2).l()) {
                                        object /* !! */  = u.a.d0;
                                        K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                        return object /* !! */ ;
                                    }
                                    if (J.B()) {
                                        if ("emulated;95".equals(object3)) return u.a.h0;
                                        if ("emulated;96".equals(object3)) {
                                            return u.a.h0;
                                        }
                                    }
                                    K.R(object /* !! */ , string, object /* !! */ .a(ax.Q2.b.h().g()), object /* !! */ .k(), (O)object2, false, false);
                                    return null;
                                }
                                object /* !! */  = u.a.f0;
                                K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                                return object /* !! */ ;
                            }
                            object2 = object /* !! */ .a(ax.Q2.b.h().g());
                            if (object2 == null) return u.a.h0;
                            if (((String)object2).startsWith("U+")) return u.a.h0;
                            object /* !! */  = ax.Ha.c.h().f().b("Unknown Volume Id 200:");
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("volumeId:");
                            ((StringBuilder)charSequence).append(K.S(string));
                            ((StringBuilder)charSequence).append(",desc:");
                            ((StringBuilder)charSequence).append((String)object2);
                            ((ax.Ha.b)object /* !! */ ).g(((StringBuilder)charSequence).toString()).h();
                            return u.a.h0;
                        }
                        object /* !! */  = u.a.c0;
                        K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                        return object /* !! */ ;
                    }
                    object /* !! */  = u.a.c0;
                    K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                    return object /* !! */ ;
                }
                object /* !! */  = u.a.d0;
                K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
                return object /* !! */ ;
                catch (Exception exception) {}
            }
            object /* !! */  = u.a.i0;
            K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
            return object /* !! */ ;
            catch (Exception exception) {}
        }
        object /* !! */  = u.a.i0;
        K.Q((String)charSequence, string, (u.a)((Object)object /* !! */ ));
        return object /* !! */ ;
        catch (Exception exception) {
            return null;
        }
        catch (Exception exception) {
            return u.a.h0;
        }
    }

    private static u.a u(String string, O object) {
        if (object != null && object.j()) {
            object = u.a.c0;
            K.Q(string, "", (u.a)((Object)object));
            return object;
        }
        if (object != null && object.l()) {
            object = u.a.d0;
            K.Q(string, "", (u.a)((Object)object));
            return object;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static final String v(Context object2, String string) {
        StorageManager storageManager = (StorageManager)object2.getSystemService("storage");
        File[] fileArray = new File("/storage").listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                Object var1_3;
                N n8 = ax.X2.a.a(storageManager, file);
                if (n8 == null || n8.l() == null || !n8.l().equals(var1_3)) continue;
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    private static final String w(String string) {
        if (string != null && !string.startsWith("/media/removable")) {
            return null;
        }
        string = d0.h(string);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/storage/removable_");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    @TargetApi(value=19)
    public static List<File> x() {
        ArrayList<File> arrayList = new ArrayList<File>();
        File[] fileArray = null;
        try {
            File[] object;
            fileArray = object = ax.Q2.b.h().g().getExternalFilesDirs(null);
        }
        catch (NullPointerException | SecurityException runtimeException) {
            // empty catch block
        }
        if (fileArray != null) {
            for (File file : fileArray) {
                File file2;
                if (file == null || (file2 = K.y()) != null && file.getAbsolutePath().startsWith(file2.getAbsolutePath())) continue;
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static File y() {
        try {
            File file = Environment.getExternalStorageDirectory();
            return file;
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException runtimeException) {
            ax.Ha.c.h().f().b("PRIMARY STORAGE FAILED").l(runtimeException).h();
            return null;
        }
    }

    public static String z(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/storage/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

