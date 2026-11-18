/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.content.Context;
import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import ax.X2.Q;
import ax.Z2.t;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.r;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
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

public class z {
    private static final Logger d = Logger.getLogger("FileManager.LocalFileRootAccess");
    private static final SimpleDateFormat e;
    private static final SimpleDateFormat f;
    private static final SimpleDateFormat g;
    private static final SimpleDateFormat h;
    private static final SimpleDateFormat i;
    private static z j;
    private static z k;
    private static final HashSet<String> l;
    private boolean a;
    private Boolean b;
    private Pattern c;

    static {
        Locale locale = Locale.US;
        e = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
        f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", locale);
        g = new SimpleDateFormat("yyyyMMdd.HHmmss", locale);
        h = new SimpleDateFormat("yyyyMMddHHmm.ssSSS", locale);
        i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
        l = new HashSet<String>(Arrays.asList("ext_data_rw", "ext_obb_rw", "media_rw", "external_storage"));
    }

    z(boolean bl) {
        this.a = bl;
        this.c = Pattern.compile("\u001b\\[[;\\d]*m");
    }

    private static String B(int n8) {
        return String.format("%o", n8);
    }

    private FileOutputStream E(n object) {
        String string = ((n)object).E();
        a a8 = this.m(string) ? this.t(string) : null;
        try {
            object = new c(this, string, z.I(((n)object).x()).getAbsolutePath(), a8);
            return object;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    private FileOutputStream F(String string, boolean bl) {
        boolean bl2;
        int n8;
        block8: {
            Throwable throwable2;
            FileOutputStream fileOutputStream;
            block7: {
                n8 = this.p(string);
                if (n8 < 0) {
                    return null;
                }
                bl2 = z.N(n8, 2);
                if (!bl2 && !this.d(string, n8 | 2)) {
                    return null;
                }
                try {
                    fileOutputStream = new FileOutputStream(string, bl);
                    if (bl2) break block7;
                    this.d(string, n8);
                }
                catch (Throwable throwable2) {
                }
                catch (IOException iOException) {
                    break block8;
                }
            }
            return fileOutputStream;
            if (!bl2) {
                this.d(string, n8);
            }
            throw throwable2;
        }
        if (!bl2) {
            this.d(string, n8);
        }
        return null;
    }

    private static File I(Context object) {
        File file;
        object = object.getCacheDir();
        while ((file = new File((File)object, String.valueOf(new Random().nextLong()))).exists()) {
        }
        return file;
    }

    public static long J(String string) {
        try {
            long l8 = e.parse(string).getTime();
            return l8;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0L;
        }
    }

    private static boolean L(String string) {
        return "sh".equals(d0.k(string));
    }

    private boolean M(Context context) {
        if (this.b == null) {
            if (Q.Q0()) {
                boolean bl = this.l("ls -lan --full-time /", 10000L) != null;
                this.b = bl;
            } else {
                this.b = Boolean.FALSE;
            }
        }
        return this.b;
    }

    private static boolean N(int n8, int n9) {
        return (n8 & n9) == n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static p Q(ArrayList<String> arrayList) {
        int n8 = 0;
        while (n8 < arrayList.size()) {
            String[] stringArray;
            String string = arrayList.get(n8);
            if (!string.startsWith("total") && (stringArray = string.split("\\s+")).length >= 4) {
                String string2 = stringArray[0];
                try {
                    return new p(stringArray[2], stringArray[3], string2);
                }
                catch (Exception exception) {}
            }
            ++n8;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b R(String var1_1, String var2_3, boolean var3_4, boolean var4_5) {
        block22: {
            block23: {
                var16_6 /* !! */  = var4_5 != false ? Pattern.compile("\\s\\d\\d:\\d\\d:\\d\\d(\\.\\d{9})?\\s[+-]\\d\\d\\d\\d\\s") : Pattern.compile("\\s\\d\\d:\\d\\d\\s");
                if ((var16_6 /* !! */  = var16_6 /* !! */ .matcher((CharSequence)var2_3)).find()) {
                    var5_7 = var16_6 /* !! */ .end();
                    var6_8 = var16_6 /* !! */ .start();
                } else {
                    var5_7 = -1;
                    var6_8 = -1;
                }
                if (var6_8 <= 0 || var5_7 <= 0) ** GOTO lbl119
                try {
                    var17_9 = var2_3.substring(var5_7);
                    var18_10 = var2_3.substring(0, var5_7).split("\\s+");
                    var6_8 = var18_10.length;
                }
                catch (Exception var1_2) {
                    break block22;
                }
                var16_6 /* !! */  = var18_10[0];
                var8_11 = var16_6 /* !! */ .startsWith("d");
                var9_12 = var16_6 /* !! */ .startsWith("l");
                var10_13 = -1L;
                if (var8_11) {
                    var16_6 /* !! */  = var2_3.substring(var5_7);
                    if (var16_6 /* !! */ .equals(".") != false) return null;
                    var2_3 = var16_6 /* !! */ ;
                    if (var16_6 /* !! */ .equals("..")) {
                        return null;
                    }
lbl26:
                    // 4 sources

                    while (true) {
                        var17_9 = null;
                        var12_14 = var10_13;
                        var16_6 /* !! */  = var2_3;
                        break block23;
                        break;
                    }
                }
                if (!var9_12) ** GOTO lbl-1000
                var2_3 = var17_9.split("\\s->\\s", 2);
                var16_6 /* !! */  = var2_3[0];
                var17_9 = var2_3[1];
                var12_14 = -1L;
                break block23;
lbl-1000:
                // 1 sources

                {
                    block25: {
                        var2_3 = var2_3.substring(var5_7);
                        if (!var4_5) break block25;
                        var10_13 = Long.valueOf(var18_10[var6_8 - 4]);
                        ** GOTO lbl26
                    }
                    var10_13 = Long.valueOf(var18_10[var6_8 - 3]);
                    ** continue;
                }
            }
            if (!var4_5) ** GOTO lbl76
            {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                block24: {
                                    var5_7 = var6_8 - 2;
                                    var7_15 = var18_10[var5_7].indexOf(".");
                                    if (var7_15 >= 0) {
                                        var19_16 = var18_10[var5_7].substring(0, var7_15);
                                        var2_3 = new StringBuilder();
                                        var2_3.append(var18_10[var6_8 - 3]);
                                        var2_3.append(" ");
                                        var2_3.append(var19_16);
                                        var2_3.append(" ");
                                        var2_3.append(var18_10[var6_8 - 1]);
                                        var2_3 = var2_3.toString();
                                        break block24;
                                    } else {
                                        var2_3 = new StringBuilder();
                                        var2_3.append(var18_10[var6_8 - 3]);
                                        var2_3.append(" ");
                                        var2_3.append(var18_10[var5_7]);
                                        var2_3.append(" ");
                                        var2_3.append(var18_10[var6_8 - 1]);
                                        var2_3 = var2_3.toString();
                                    }
                                    break block24;
lbl76:
                                    // 1 sources

                                    var2_3 = new StringBuilder();
                                    var2_3.append(var18_10[var6_8 - 2]);
                                    var2_3.append(" ");
                                    var2_3.append(var18_10[var6_8 - 1]);
                                    var2_3 = var2_3.toString();
                                }
                                var14_17 = var4_5 != false ? z.v((String)var2_3) : z.J((String)var2_3);
                                var10_13 = var12_14;
                                var4_5 = var8_11;
                                if (!var9_12) break block26;
                                var10_13 = var12_14;
                                var4_5 = var8_11;
                                if (var17_9 == null) break block26;
                                if (var17_9.startsWith("/")) {
                                    var1_1 = new File(var17_9);
                                } else {
                                    if (!var3_4) {
                                        var1_1 = d0.r((String)var1_1);
                                    }
                                    var1_1 = new File((String)var1_1, var17_9);
                                }
                                if (!var1_1.exists()) break block27;
                                var3_4 = var4_5 = var1_1.isDirectory();
                                if (var4_5) break block28;
                                var10_13 = var1_1.length();
                            }
lbl103:
                            // 3 sources

                            while (true) {
                                var3_4 = var4_5;
                                return new b((String)var16_6 /* !! */ , var3_4, var9_12, true, false, var10_13, var14_17);
                            }
                        }
                        var10_13 = var12_14;
                        var4_5 = var8_11;
                        if (!this.m(var1_1.getAbsolutePath())) ** GOTO lbl103
                        var3_4 = var4_5 = this.K(var1_1.getAbsolutePath());
                        if (!var4_5) break block29;
                    }
                    var10_13 = 0L;
                    return new b((String)var16_6 /* !! */ , var3_4, var9_12, true, false, var10_13, var14_17);
                }
                var10_13 = this.s(var1_1.getAbsolutePath());
                ** continue;
lbl119:
                // 1 sources

                if (var2_3.toLowerCase().startsWith("total") != false) return null;
                var1_1 = z.d;
                var16_6 /* !! */  = new StringBuilder();
                var16_6 /* !! */ .append("Invalid line of ls  :");
                var16_6 /* !! */ .append((String)var2_3);
                var1_1.severe(var16_6 /* !! */ .toString());
                return null;
            }
        }
        var1_2.printStackTrace();
        return null;
    }

    private static int S(String string) {
        if (string.length() != 10) {
            return -1;
        }
        int n8 = string.charAt(1) == 'r' ? 256 : 0;
        int n9 = n8;
        if (string.charAt(2) == 'w') {
            n9 = n8 | 0x80;
        }
        if (string.charAt(3) == 'x') {
            n8 = n9 | 0x40;
        } else if (string.charAt(3) == 's') {
            n8 = n9 | 0x840;
        } else {
            n8 = n9;
            if (string.charAt(3) == 'S') {
                n8 = n9 | 0x800;
            }
        }
        int n10 = n8;
        if (string.charAt(4) == 'r') {
            n10 = n8 | 0x20;
        }
        n9 = n10;
        if (string.charAt(5) == 'w') {
            n9 = n10 | 0x10;
        }
        if (string.charAt(6) == 'x') {
            n8 = n9 | 8;
        } else if (string.charAt(6) == 's') {
            n8 = n9 | 0x408;
        } else {
            n8 = n9;
            if (string.charAt(6) == 'S') {
                n8 = n9 | 0x400;
            }
        }
        n9 = n8;
        if (string.charAt(7) == 'r') {
            n9 = n8 | 4;
        }
        n8 = n9;
        if (string.charAt(8) == 'w') {
            n8 = n9 | 2;
        }
        if (string.charAt(9) == 'x') {
            return n8 | 1;
        }
        return n8;
    }

    private static int T(String string) {
        if (string.length() != 10) {
            return 0;
        }
        if (string.charAt(0) == 'd') {
            return 16384;
        }
        if (string.charAt(0) == 'l') {
            return 40960;
        }
        if (string.charAt(0) == 'p') {
            return 4096;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void W(String string, boolean bl) {
        int n8;
        block12: {
            block11: {
                String string2;
                p p8 = this.o(d0.r(string));
                if (p8 == null || (string2 = p8.b) == null) return;
                boolean bl2 = l.contains(string2);
                n8 = 1528;
                int n9 = 432;
                if (bl2) {
                    string2 = p8.a;
                    if (string2 == null) return;
                    this.f(string, string2, p8.b);
                    if (!bl || !p8.a.startsWith("u0_a")) {
                        n8 = bl ? 504 : 432;
                    }
                    this.d(string, n8);
                    return;
                }
                if (p8.b.startsWith("u0_a")) {
                    string2 = p8.a;
                    if (string2 == null) return;
                    this.f(string, string2, p8.b);
                    if (!bl || !p8.b.endsWith("_cache")) {
                        n8 = bl ? 504 : 432;
                    }
                    this.d(string, n8);
                    return;
                }
                this.f(string, "root", "root");
                if (bl) break block11;
                n8 = n9;
                if (!z.L(string)) break block12;
            }
            n8 = 504;
        }
        this.d(string, n8);
    }

    public static z X() {
        if (k == null) {
            k = new z(false);
        }
        return k;
    }

    public static z Y() {
        if (j == null) {
            j = new z(true);
        }
        return j;
    }

    private boolean d(String string, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("chmod ");
        stringBuilder.append(z.B(n8));
        stringBuilder.append(" ");
        stringBuilder.append(z.k(string));
        return this.l(stringBuilder.toString(), 2000L) != null;
    }

    private boolean e(String string, int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("chown ");
        stringBuilder.append(n8);
        stringBuilder.append(":");
        stringBuilder.append(n9);
        stringBuilder.append(" ");
        stringBuilder.append(z.k(string));
        return this.l(stringBuilder.toString(), 2000L) != null;
    }

    private boolean f(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("chown ");
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(string3);
        stringBuilder.append(" ");
        stringBuilder.append(z.k(string));
        return this.l(stringBuilder.toString(), 2000L) != null;
    }

    private static String k(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(string.replaceAll("'", "'\"'\"'"));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    private static long v(String string) {
        try {
            long l8 = f.parse(string).getTime();
            return l8;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0L;
        }
    }

    private FileInputStream x(String string, long l8, a object) {
        boolean bl;
        int n8;
        block11: {
            Throwable throwable2;
            block10: {
                block9: {
                    n8 = object != null ? ((a)object).c : this.p(string);
                    if (n8 < 0) {
                        return null;
                    }
                    bl = z.N(n8, 4);
                    if (!bl && !this.d(string, n8 | 4)) {
                        return null;
                    }
                    object = new FileInputStream(string);
                    if (l8 <= 0L) break block9;
                    try {
                        ((FileInputStream)object).skip(l8);
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    catch (IOException iOException) {
                        break block11;
                    }
                }
                if (!bl) {
                    this.d(string, n8);
                }
                return object;
            }
            if (!bl) {
                this.d(string, n8);
            }
            throw throwable2;
        }
        if (!bl) {
            this.d(string, n8);
        }
        return null;
    }

    public FileInputStream A(n object, long l8) {
        CharSequence charSequence = ((n)object).E();
        Object object2 = ((n)object).x().getCacheDir();
        while (((File)(object = new File((File)object2, String.valueOf(new Random().nextLong())))).exists()) {
        }
        object = ((File)object).getAbsolutePath();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("ln -f ");
        ((StringBuilder)object2).append(z.k((String)charSequence));
        ((StringBuilder)object2).append(" ");
        ((StringBuilder)object2).append(z.k((String)object));
        if (this.l(((StringBuilder)object2).toString(), 2000L) == null) {
            return null;
        }
        object2 = this.x((String)object, l8, null);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("rm ");
        ((StringBuilder)charSequence).append(z.k((String)object));
        this.l(((StringBuilder)charSequence).toString(), 2000L);
        return object2;
    }

    public int C(String string, boolean bl) {
        CharSequence charSequence;
        Serializable serializable;
        if (Q.a1()) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("ls -1A ");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)serializable).append(z.k(((StringBuilder)charSequence).toString()));
            serializable = this.l(((StringBuilder)serializable).toString(), 10000L);
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("ls -lan ");
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append("/");
            ((StringBuilder)charSequence).append(z.k(((StringBuilder)serializable).toString()));
            serializable = this.l(((StringBuilder)charSequence).toString(), 10000L);
        }
        if (serializable == null) {
            return -1;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < ((ArrayList)serializable).size(); ++i8) {
            charSequence = (String)((ArrayList)serializable).get(i8);
            if (d0.C((String)charSequence) || (((String)charSequence).endsWith(" .") || ((String)charSequence).endsWith(" ..")) && this.R(string, (String)charSequence, true, false) == null || !bl && ((String)charSequence).startsWith(".") || !Q.a1() && ((String)charSequence).startsWith("total")) continue;
            ++n8;
        }
        return n8;
    }

    public FileOutputStream D(n n8, boolean bl) {
        FileOutputStream fileOutputStream = this.H(n8, bl);
        if (fileOutputStream == null) {
            return this.G(n8, bl);
        }
        return fileOutputStream;
    }

    public FileOutputStream G(n object, boolean bl) {
        if (bl) {
            return null;
        }
        String string = ((n)object).T();
        int n8 = this.p(string);
        if (n8 < 0) {
            return null;
        }
        bl = z.N(n8, 3);
        if (!bl && !this.d(string, n8 | 3)) {
            return null;
        }
        object = this.E((n)object);
        if (!bl) {
            this.d(string, n8);
        }
        return object;
    }

    public FileOutputStream H(n object, boolean bl) {
        CharSequence charSequence = ((n)object).E();
        boolean bl2 = this.m((String)charSequence);
        if (!bl2 && !this.h((String)charSequence)) {
            return null;
        }
        object = z.I(((n)object).x()).getAbsolutePath();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("ln -f ");
        ((StringBuilder)object2).append(z.k((String)charSequence));
        ((StringBuilder)object2).append(" ");
        ((StringBuilder)object2).append(z.k((String)object));
        if (this.l(((StringBuilder)object2).toString(), 2000L) == null) {
            if (!bl2) {
                object = new StringBuilder();
                ((StringBuilder)object).append("rm ");
                ((StringBuilder)object).append(z.k((String)charSequence));
                this.l(((StringBuilder)object).toString(), 2000L);
            }
            return null;
        }
        object2 = this.F((String)object, bl);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("rm ");
        ((StringBuilder)charSequence).append(z.k((String)object));
        this.l(((StringBuilder)charSequence).toString(), 2000L);
        return object2;
    }

    public boolean K(String arrayList) {
        if (Q.Q1()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("test -d ");
            stringBuilder.append(z.k((String)((Object)arrayList)));
            stringBuilder.append(" && echo YES || echo NO");
            arrayList = this.l(stringBuilder.toString(), 10000L);
            if (arrayList != null && arrayList.size() > 0) {
                return "YES".equals(arrayList.get(0));
            }
            return false;
        }
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("ls -land ");
        ((StringBuilder)charSequence).append(z.k((String)((Object)arrayList)));
        arrayList = this.l(((StringBuilder)charSequence).toString(), 10000L);
        if (arrayList == null) {
            return false;
        }
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            charSequence = arrayList.get(i8);
            if (((String)charSequence).startsWith("total")) {
                continue;
            }
            if (((String)charSequence).length() <= 0 || ((String)charSequence).charAt(0) != 'd') break;
            return true;
        }
        return false;
    }

    public ArrayList<y> O(x x8, K k8, String string) {
        Object object;
        ArrayList<y> arrayList = new ArrayList<y>();
        Object object2 = "/";
        if (!"/".equals(string)) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append("/");
            object2 = ((StringBuilder)object2).toString();
        }
        boolean bl = this.M(x8.p());
        int n8 = 0;
        if (bl) {
            object = new StringBuilder();
            ((StringBuilder)object).append("ls -lan --full-time ");
            ((StringBuilder)object).append(z.k((String)object2));
            object2 = ((StringBuilder)object).toString();
            bl = true;
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("ls -lan ");
            ((StringBuilder)object).append(z.k((String)object2));
            object2 = ((StringBuilder)object).toString();
            bl = false;
        }
        object2 = this.l((String)object2, 10000L);
        if (object2 == null) {
            return null;
        }
        while (n8 < ((ArrayList)object2).size()) {
            object = (String)((ArrayList)object2).get(n8);
            if (!((String)object).startsWith("total") && (object = this.R(string, this.c.matcher((CharSequence)object).replaceAll(""), true, bl)) != null) {
                arrayList.add(new y(x8, new File(string, ((b)object).a), k8, ((b)object).b, ((b)object).c, ((b)object).d, ((b)object).e, ((b)object).f, ((b)object).g));
            }
            ++n8;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean P(String object, String string, boolean bl) {
        String string2 = bl ? "mv -f" : "mv";
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(z.k((String)object));
            stringBuilder.append(" ");
            stringBuilder.append(z.k(string));
            object = this.l(stringBuilder.toString(), 2000L);
            if (object == null) return false;
            return true;
        }
        catch (Exception exception) {}
        exception.printStackTrace();
        return false;
    }

    public void U(String string, long l8) {
        if (Build.VERSION.SDK_INT >= 23) {
            String string2 = h.format(new Date(l8));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("touch -t ");
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append(z.k(string));
            this.l(stringBuilder.toString(), 10000L);
            return;
        }
        String string3 = g.format(new Date(l8));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("touch -t ");
        stringBuilder.append(string3);
        stringBuilder.append(" ");
        stringBuilder.append(z.k(string));
        this.l(stringBuilder.toString(), 10000L);
    }

    public void V(String string, p object) {
        int n8;
        String string2 = ((p)object).c;
        if (string2 != null && (n8 = z.S(string2)) >= 0) {
            this.d(string, n8);
        }
        if ((string2 = ((p)object).a) != null && (object = ((p)object).b) != null) {
            this.f(string, string2, (String)object);
        }
    }

    public boolean g(String object, String string, long l8) {
        block3: {
            try {
                long l9 = l8 / 1024L / 1024L;
                l8 = 2000L;
                if (l9 <= 0L) break block3;
                l8 = 2000L * l9;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cp ");
        stringBuilder.append(z.k((String)object));
        stringBuilder.append(" ");
        stringBuilder.append(z.k(string));
        object = this.l(stringBuilder.toString(), l8);
        return object != null;
    }

    public boolean h(String string) {
        block3: {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("touch ");
                stringBuilder.append(z.k(string));
                if (this.l(stringBuilder.toString(), 2000L) != null) break block3;
                return false;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
        }
        this.W(string, false);
        return true;
    }

    public boolean i(String string) {
        block3: {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mkdir ");
                stringBuilder.append(z.k(string));
                if (this.l(stringBuilder.toString(), 2000L) != null) break block3;
                return false;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
        }
        this.W(string, true);
        return true;
    }

    public boolean j(String object) {
        String string = this.K((String)object) ? "rmdir" : "rm";
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(z.k((String)object));
            object = this.l(stringBuilder.toString(), 2000L);
            return object != null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    ArrayList<String> l(String string, long l8) {
        if (this.a) {
            return r.d(string, l8);
        }
        return r.h(string, l8);
    }

    public boolean m(String object) {
        if (Q.Q1()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("test -e ");
            stringBuilder.append(z.k((String)object));
            stringBuilder.append(" && echo YES || echo NO");
            object = this.l(stringBuilder.toString(), 10000L);
            if (object != null && ((ArrayList)object).size() > 0) {
                return "YES".equals(((ArrayList)object).get(0));
            }
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ls -land ");
        stringBuilder.append(z.k((String)object));
        return this.l(stringBuilder.toString(), 10000L) != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long n(String arrayList) {
        if (Q.I1()) {
            String[] stringArray = new StringBuilder();
            stringArray.append("stat -c\"%y|%Y\" ");
            stringArray.append(z.k(arrayList));
            arrayList = this.l(stringArray.toString(), 10000L);
            if (arrayList == null) return 0L;
            if (arrayList.size() <= 0) return 0L;
            stringArray = arrayList.get(0).split("\\|");
            try {
                return i.parse(stringArray[0]).getTime();
            }
            catch (ParseException parseException) {
                try {
                    if (stringArray.length <= 1) return 0L;
                    long l8 = Long.valueOf(stringArray[1]);
                    return l8 * 1000L;
                }
                catch (NumberFormatException numberFormatException) {
                    return 0L;
                }
            }
        }
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("ls -land ");
        ((StringBuilder)serializable).append(z.k(arrayList));
        serializable = this.l(((StringBuilder)serializable).toString(), 10000L);
        if (serializable == null) {
            return 0L;
        }
        int n8 = 0;
        while (n8 < ((ArrayList)serializable).size()) {
            Object object = (String)((ArrayList)serializable).get(n8);
            if (!((String)object).startsWith("total") && (object = this.R((String)((Object)arrayList), (String)object, false, false)) != null) {
                return ((b)object).g;
            }
            ++n8;
        }
        return 0L;
    }

    public p o(String object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ls -lad ");
        stringBuilder.append(z.k((String)object));
        object = this.l(stringBuilder.toString(), 10000L);
        if (object == null) {
            return null;
        }
        return z.Q((ArrayList<String>)object);
    }

    public int p(String string) {
        if (Q.P1()) {
            try {
                int n8 = Os.stat((String)string).st_mode;
                return n8 & 0x1FF;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (Q.I1()) {
            return this.r(string);
        }
        return this.q(string);
    }

    public int q(String string) {
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("ls -land ");
        ((StringBuilder)serializable).append(z.k(string));
        serializable = this.l(((StringBuilder)serializable).toString(), 10000L);
        if (serializable == null) {
            return -1;
        }
        for (int i8 = 0; i8 < ((ArrayList)serializable).size(); ++i8) {
            string = (String)((ArrayList)serializable).get(i8);
            if (string.startsWith("total")) {
                continue;
            }
            return z.S(string.split("\\s+")[0]);
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int r(String arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stat -c%a ");
        stringBuilder.append(z.k(arrayList));
        arrayList = this.l(stringBuilder.toString(), 10000L);
        if (arrayList == null) return -1;
        if (arrayList.size() <= 0) return -1;
        try {
            int n8 = Integer.valueOf(arrayList.get(0), 8);
            return n8 & 0x1FF;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long s(String arrayList) {
        if (Q.I1()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("stat -c%s ");
            stringBuilder.append(z.k(arrayList));
            arrayList = this.l(stringBuilder.toString(), 10000L);
            if (arrayList == null) return 0L;
            if (arrayList.size() <= 0) return 0L;
            try {
                return Long.valueOf(arrayList.get(0));
            }
            catch (NumberFormatException numberFormatException) {
                return 0L;
            }
        }
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("ls -land ");
        ((StringBuilder)serializable).append(z.k(arrayList));
        serializable = this.l(((StringBuilder)serializable).toString(), 10000L);
        if (serializable == null) {
            return 0L;
        }
        int n8 = 0;
        while (n8 < ((ArrayList)serializable).size()) {
            Object object = (String)((ArrayList)serializable).get(n8);
            if (!((String)object).startsWith("total") && (object = this.R((String)((Object)arrayList), (String)object, false, false)) != null) {
                return ((b)object).f;
            }
            ++n8;
        }
        return 0L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public a t(String string) {
        if (!Q.P1()) return this.u(string);
        try {
            StructStat structStat = Os.stat((String)string);
            int n8 = structStat.st_mode;
            return new a(structStat.st_uid, structStat.st_gid, com.voxdon.xplorer.file.z$a.c(n8), n8 & 0x1FF);
        }
        catch (Exception exception) {
            return this.u(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a u(String arrayList) {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("ls -land ");
        ((StringBuilder)object).append(z.k(arrayList));
        arrayList = this.l(((StringBuilder)object).toString(), 10000L);
        if (arrayList == null) {
            return null;
        }
        int n8 = 0;
        while (n8 < arrayList.size()) {
            object = arrayList.get(n8);
            if (!((String)object).startsWith("total") && ((CharSequence)(object = ((String)object).split("\\s+"))).length >= 4) {
                CharSequence charSequence = object[0];
                try {
                    int n9 = z.T((String)charSequence);
                    int n10 = z.S((String)charSequence);
                    return new a(Integer.parseInt((String)object[2]), Integer.parseInt((String)object[3]), n9, n10);
                }
                catch (Exception exception) {}
            }
            ++n8;
        }
        return null;
    }

    public FileInputStream w(n n8, long l8) {
        a a8 = this.t(n8.E());
        if (a8 != null && !a8.e() && !a8.d()) {
            FileInputStream fileInputStream;
            FileInputStream fileInputStream2 = fileInputStream = this.A(n8, l8);
            if (fileInputStream == null) {
                fileInputStream2 = this.y(n8, l8, a8);
            }
            if (fileInputStream2 == null) {
                return this.z(n8, l8);
            }
            return fileInputStream2;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FileInputStream y(n var1_1, long var2_6, a var4_7) {
        block18: {
            block13: {
                block14: {
                    var13_8 = var1_1.T();
                    var12_9 = d0.r(var13_8);
                    var6_10 = this.p(var13_8);
                    if (var6_10 < 0) {
                        return null;
                    }
                    var5_11 = "/".equals(var13_8) != false ? 0 : this.p(var12_9);
                    var7_12 = true;
                    var8_13 = true;
                    var9_14 = z.N(var6_10, 1);
                    if (var9_14) break block13;
                    var8_13 = this.d(var13_8, var6_10 | 1);
                    if (var8_13) break block13;
                    if (var9_14) break block14;
                    this.d(var13_8, var6_10);
                }
                return null;
            }
            if (var5_11 <= 0) ** GOTO lbl45
            try {
                var7_12 = var10_15 = z.N(var5_11, 1);
                if (var10_15) ** GOTO lbl45
                var8_13 = var10_15;
                ** GOTO lbl30
            }
            catch (Throwable var1_2) {
                block19: {
                    block17: {
                        block15: {
                            block16: {
                                var7_12 = var9_14;
                                break block19;
lbl30:
                                // 1 sources

                                try {
                                    var11_16 = this.d(var12_9, var5_11 | 1);
                                    var7_12 = var10_15;
                                    if (var11_16) break block15;
                                    if (var9_14) break block16;
                                    this.d(var13_8, var6_10);
                                }
                                catch (Throwable var1_4) {
                                    var7_12 = var9_14;
                                    break block18;
                                }
                            }
                            if (!var10_15) {
                                this.d(var12_9, var5_11);
                            }
                            return null;
                        }
                        var8_13 = var7_12;
                        var1_1 = this.x(var1_1.E(), var2_6, var4_7);
                        if (var9_14) break block17;
                        this.d(var13_8, var6_10);
                    }
                    if (!var7_12) {
                        this.d(var12_9, var5_11);
                    }
                    return var1_1;
                    catch (Throwable var1_5) {
                        var7_12 = var8_13;
                    }
                }
                var8_13 = true;
            }
        }
        if (!var7_12) {
            this.d(var13_8, var6_10);
        }
        if (!var8_13) {
            this.d(var12_9, var5_11);
        }
        throw var1_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FileInputStream z(n object, long l8) {
        block7: {
            File file;
            block6: {
                file = ((n)object).Z();
                String string = file.getAbsolutePath();
                if (!this.g(((n)object).E(), string, object.p())) return null;
                try {
                    this.d(string, 511);
                    object = new FileInputStream(string);
                    if (l8 == 0L) break block6;
                }
                catch (IOException iOException) {
                    object = null;
                    break block7;
                }
                try {
                    ((FileInputStream)object).skip(l8);
                }
                catch (IOException iOException) {
                    break block7;
                }
            }
            t.b().c(file);
            t.b().a();
            return object;
        }
        if (object == null) return null;
        try {
            ((FileInputStream)object).close();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    static class a {
        int a;
        int b;
        int c;
        int d;

        a(int n8, int n9, int n10, int n11) {
            this.a = n8;
            this.b = n9;
            this.d = n10;
            this.c = n11;
        }

        static int c(int n8) {
            return n8 & 0xF000;
        }

        private boolean d() {
            return this.d == 16384;
        }

        private boolean e() {
            return this.d == 4096;
        }
    }

    private static class b {
        String a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        long f;
        long g;

        b(String string, boolean bl, boolean bl2, boolean bl3, boolean bl4, long l8, long l9) {
            this.a = string;
            this.b = bl;
            this.c = bl2;
            this.d = bl3;
            this.e = bl4;
            this.f = l8;
            this.g = l9;
        }
    }

    class c
    extends FileOutputStream
    implements AutoCloseable {
        private String c0;
        private a d0;
        private boolean e0;
        final z f0;
        private String q;

        c(z z8, String string, String string2, a a8) throws IOException {
            this.f0 = z8;
            super(string2);
            this.e0 = false;
            this.c0 = string;
            this.q = string2;
            this.d0 = a8;
        }

        @Override
        public void close() throws IOException {
            super.close();
            if (this.e0) {
                return;
            }
            this.e0 = true;
            if (this.f0.P(this.q, this.c0, true)) {
                Object object = this.d0;
                if (object != null) {
                    this.f0.d(this.c0, ((a)object).c);
                    object = this.f0;
                    String string = this.c0;
                    a a8 = this.d0;
                    ((z)object).e(string, a8.a, a8.b);
                    return;
                }
                this.f0.W(this.c0, false);
                return;
            }
            throw new IOException("Move temp file to the path failed");
        }
    }
}

