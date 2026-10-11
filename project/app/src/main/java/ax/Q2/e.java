/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import ax.Ha.c;
import ax.Q2.b;
import ax.Q2.f;
import ax.Q2.g;
import ax.X2.J;
import ax.X2.K;
import ax.X2.N;
import ax.X2.Q;
import ax.X2.a;
import ax.Z2.m;
import ax.Z2.r;
import ax.Z2.u;
import ax.c3.B;
import ax.t3.j;
import ax.u3.o;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class e {
    private static final Logger a = ax.Q2.g.a(e.class);
    private static e b;
    private static e c;
    private static boolean d;
    private static final List<e> e;
    private static File f;
    private static long g;
    private static boolean h;
    private static Boolean i;
    private static String j;
    private static File k;
    private static File l;

    static {
        d = true;
        e = java.util.DesugarCollections.synchronizedList(new ArrayList());
    }

    public static int A() {
        File file = K.y();
        if (file == null) {
            return 97;
        }
        long l8 = file.getTotalSpace();
        if (l8 == 0L) {
            return 97;
        }
        if (l8 <= 0x200000000L) {
            return 95;
        }
        if (l8 <= 0x400000000L) {
            return 96;
        }
        if (l8 <= 0x800000000L) {
            return 97;
        }
        return 98;
    }

    private static File B() {
        return new File("/storage");
    }

    public static final File C(Context context) {
        return ax.Q2.e.n(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final List<e> D() {
        if (ax.Q2.e.c()) {
            if (e.size() != 0) {
                a.fine("USB VOLUME STATUS CHANGED!!!!");
            }
            ax.Q2.e.R();
        }
        List<e> list = e;
        synchronized (list) {
            return new ArrayList<e>(list);
        }
    }

    public static String E(Context object, String stringArray) {
        object = object != null && (object = ax.X2.a.a((StorageManager)object.getSystemService("storage"), new File((String)stringArray))) != null ? ((N)object).l() : null;
        Object object2 = object;
        if (object == null) {
            stringArray = stringArray.split("/");
            object2 = object;
            if (stringArray.length > 2) {
                object2 = stringArray[2];
            }
        }
        return object2;
    }

    private static List<u> F() {
        if (Build.VERSION.SDK_INT >= 24) {
            return K.E();
        }
        return null;
    }

    private static String G(String string, String string2) {
        return K.F(string, string2);
    }

    public static List<e> H() {
        ArrayList<e> arrayList = new ArrayList<e>();
        if (!Q.S1()) {
            a.severe("THIS DEVICE DOES NOT SUPPORT VOLUME LIST");
            return arrayList;
        }
        List<u> list = ax.Q2.e.F();
        if (list == null) {
            ax.u3.b.f();
            return arrayList;
        }
        list = list.iterator();
        while (list.hasNext()) {
            e e8 = ax.Q2.e.V((u)list.next(), true);
            if (e8.a == null) continue;
            arrayList.add(e8);
        }
        return arrayList;
    }

    public static boolean I() {
        if (!Q.z0()) {
            return false;
        }
        return o.c();
    }

    private static boolean J(String object) {
        if (K.J((String)object)) {
            return false;
        }
        if ("/storage/sdcard0".equals(object)) {
            File file = new File("/storage/emulated/0");
            File file2 = new File((String)object);
            object = new File(file, "Android");
            File file3 = new File(file2, "Android");
            if (file.exists() && file.lastModified() == file2.lastModified() && ((File)object).lastModified() == file3.lastModified()) {
                ax.Ha.c.h().c("Secondary storage is internal sdcard0").h();
                return false;
            }
        }
        return true;
    }

    public static final boolean K() {
        if (b == null) {
            ax.Q2.e.P();
        }
        return ax.Q2.e.b.e == r.c0;
    }

    public static boolean L(long l8, long l9) {
        if (l9 > 0xC0000000L) {
            return l8 > l9 / 5L;
        }
        if (l9 < 0x40000000L) {
            return l8 > 0xC800000L;
        }
        return l8 > 524288000L;
    }

    public static boolean M(long l8) {
        return l8 > 0x3200000L;
    }

    public static final boolean N() {
        return h;
    }

    public static boolean O(String string) {
        return string.toLowerCase().contains("usb");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void P() {
        block25: {
            block24: {
                block23: {
                    var11 = K.y();
                    var9_1 /* !! */  = r.q;
                    var6_2 = ax.Q2.e.e();
                    var5_3 /* !! */  = null;
                    if (var6_2 == null || var6_2.a == null) ** GOTO lbl22
                    var3_5 = new File(var6_2.a);
                    var4_8 = ax.Q2.e.f(var6_2.a);
                    if (Q.K1() && (var5_3 /* !! */  = var6_2.b) != null) {
                        var5_3 /* !! */  = var5_3 /* !! */ .l();
                        var7_10 = var6_2.b.n();
                        var6_2 = var3_5;
                        var3_5 = var5_3 /* !! */ ;
                        var8_11 = var4_8;
                    } else {
                        var5_3 /* !! */  = var3_5;
lbl16:
                        // 2 sources

                        while (true) {
                            var3_5 = null;
                            var7_10 = null;
                            var6_2 = var5_3 /* !! */ ;
                            var8_11 = var4_8;
                            break block23;
                            break;
                        }
lbl22:
                        // 1 sources

                        var4_8 = var9_1 /* !! */ ;
                        ** continue;
                    }
                }
                var10_12 = "unknown";
                if (var11 == null) ** GOTO lbl47
                try {
                    var4_8 = Environment.getExternalStorageState((File)var11);
                }
                catch (NullPointerException var4_9) {
                    ax.Ha.c.h().f().b("EXTERNAL STORAGE STATE").l(var4_9).h();
                    var4_8 = "unknown";
                }
                try {
                    var0_13 = Environment.isExternalStorageRemovable((File)var11);
                }
                catch (IllegalArgumentException | NullPointerException var5_4) {
                    var0_13 = false;
                }
                if ("mounted".equals(var4_8)) {
                    var5_3 /* !! */  = r.c0;
lbl40:
                    // 2 sources

                    while (true) {
                        var9_1 /* !! */  = var5_3 /* !! */ ;
                        var5_3 /* !! */  = var4_8;
                        var2_14 = var0_13;
                        break;
                    }
                } else {
                    var5_3 /* !! */  = r.d0;
                    ** continue;
lbl47:
                    // 1 sources

                    ax.Ha.c.h().f().b("MAIN STORAGE NOT DETECTED!!!!").h();
                    var5_3 /* !! */  = "unknown";
                    var2_14 = false;
                }
                if (var6_2 == null) break block24;
                var12_15 = var6_2.getAbsolutePath();
                var4_8 = var3_5;
                if (Build.VERSION.SDK_INT >= 23) {
                    var10_12 = ax.Q2.b.h().g();
                    if (var10_12 == null) {
                        ax.u3.b.e("context null");
                    }
                    var4_8 = var3_5;
                    if (var3_5 == null) {
                        var4_8 = ax.Q2.e.E((Context)var10_12, var12_15);
                    }
                }
                var10_12 = Environment.getExternalStorageState((File)var6_2);
                try {
                    var0_13 = Environment.isExternalStorageRemovable((File)var6_2);
                }
                catch (NullPointerException var3_6) {
                    var0_13 = ax.Q2.e.J(var12_15);
                }
                catch (IllegalArgumentException var3_7) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        System.getenv("SECONDARY_STORAGE");
                    }
                    var0_13 = ax.Q2.e.J(var12_15);
                }
                if (!Q.V1()) ** GOTO lbl-1000
                if (!var6_2.canWrite() || !var6_2.canRead() || !var6_2.exists() || !var6_2.isDirectory()) ** GOTO lbl-1000
                var3_5 = ax.Q2.b.h().g();
                if (!Q.p0() && !K.J(var12_15) && J.s((Context)var3_5) || (!Q.z0() || !ax.Q2.e.I()) && (Q.z0() && !ax.Q2.e.I() && !J.k() && Q.C1() || !B.e0(var12_15))) lbl-1000:
                // 2 sources

                {
                    var1_16 = false;
                } else lbl-1000:
                // 2 sources

                {
                    var1_16 = true;
                }
                var3_5 = var4_8;
                var4_8 = var10_12;
                break block25;
            }
            var1_16 = false;
            if (var2_14) {
                var0_13 = false;
                var4_8 = var10_12;
            } else {
                var0_13 = true;
                var4_8 = var10_12;
            }
        }
        var10_12 = new e();
        var10_12.b = var11;
        var10_12.e = var9_1 /* !! */ ;
        var10_12.c = var2_14;
        var10_12.d = var5_3 /* !! */ ;
        var10_12.f = true;
        var10_12.a = ax.Q2.f.o0;
        var10_12.g = "primary";
        var10_12.i = "emulated;0";
        ax.Q2.e.b = var10_12;
        var5_3 /* !! */  = new e();
        var5_3 /* !! */ .b = var6_2;
        var5_3 /* !! */ .e = var8_11;
        var5_3 /* !! */ .c = var0_13;
        var5_3 /* !! */ .d = var4_8;
        var5_3 /* !! */ .f = var1_16;
        var5_3 /* !! */ .g = var3_5;
        var5_3 /* !! */ .i = var7_10;
        var5_3 /* !! */ .a = ax.Q2.f.p0;
        ax.Q2.e.c = var5_3 /* !! */ ;
        if (var3_5 != null && var7_10 != null) {
            K.Q((String)var3_5, var7_10, u.a.c0);
        }
        if (var6_2 != null) {
            ax.Q2.e.f = var6_2;
        }
        ax.Q2.e.h = var5_3 /* !! */ .e == r.q && Q.y0() != false ? K.a(ax.Q2.b.h().g()) : false;
        ax.Q2.e.g = ax.Q2.e.B().lastModified();
        var3_5 = ax.Q2.e.a;
        var4_8 = new StringBuilder();
        var4_8.append("SecondaryStorageStatus:");
        var4_8.append((Object)var5_3 /* !! */ .e);
        var3_5.fine(var4_8.toString());
        var4_8 = new StringBuilder();
        var4_8.append("SecondaryStorageRemovable:");
        var4_8.append(var5_3 /* !! */ .c);
        var3_5.fine(var4_8.toString());
        var4_8 = new StringBuilder();
        var4_8.append("SecondaryStorageState:");
        var4_8.append(var5_3 /* !! */ .d);
        var3_5.fine(var4_8.toString());
    }

    public static void Q() {
        ax.Q2.e.P();
    }

    @TargetApi(value=23)
    private static void R() {
        if (!Q.R1()) {
            e.clear();
            a.severe("THIS DEVICE DOES NOT SUPPORT USB VOLUME");
            return;
        }
        e.clear();
        Object object = ax.Q2.e.g();
        if (object != null) {
            Iterator<u> iterator = object.iterator();
            while (iterator.hasNext()) {
                object = ax.Q2.e.V(iterator.next(), true);
                if (((e)object).a == null) continue;
                e.add((e)object);
                Logger logger = a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UsbVolumeRoot:");
                stringBuilder.append(((e)object).b);
                logger.fine(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("UsbVolumeStatus:");
                stringBuilder.append((Object)((e)object).e);
                logger.fine(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("UsbVolumeRemovable:");
                stringBuilder.append(((e)object).c);
                logger.fine(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("UsbVolumeState:");
                stringBuilder.append(((e)object).d);
                logger.fine(stringBuilder.toString());
            }
            return;
        }
        a.fine("UsbVolumeState: no USB");
    }

    public static void S(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            j = string;
            i = Boolean.TRUE;
        }
    }

    public static void T() {
        d = true;
    }

    public static boolean U() {
        if (i == null) {
            i = ax.Q2.e.h();
        }
        return i;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static e V(u var0, boolean var1_1) {
        block25: {
            block21: {
                block22: {
                    block19: {
                        block23: {
                            block24: {
                                block18: {
                                    block20: {
                                        var10_2 = new e();
                                        var7_3 = var0.a;
                                        var8_4 /* !! */  = u.a.q;
                                        var6_5 = null;
                                        var5_6 = true;
                                        if (var7_3 != var8_4 /* !! */ ) break block20;
                                        if (Q.Y()) {
                                            Q.l(28);
                                            var10_2.b = null;
                                            var10_2.f = false;
                                        } else {
                                            var10_2.b = K.y();
                                            var10_2.f = true;
                                        }
                                        break block21;
                                    }
                                    if (!var1_1) break block22;
                                    var8_4 /* !! */  = var0.f;
                                    if (var8_4 /* !! */  == null) ** GOTO lbl35
                                    var6_5 = var9_7 = new File((String)var8_4 /* !! */ );
                                    var7_3 = var8_4 /* !! */ ;
                                    if (!var9_7.exists()) ** GOTO lbl-1000
                                    var6_5 = var9_7;
                                    var7_3 = var8_4 /* !! */ ;
                                    if (!var9_7.isDirectory()) ** GOTO lbl-1000
                                    var6_5 = var9_7;
                                    var7_3 = var8_4 /* !! */ ;
                                    if (var9_7.canRead()) {
                                        var2_8 = true;
                                        var6_5 = var9_7;
                                        var7_3 = var8_4 /* !! */ ;
                                    } else lbl-1000:
                                    // 4 sources

                                    {
                                        while (true) {
                                            var2_8 = false;
                                            break block18;
                                            break;
                                        }
lbl35:
                                        // 1 sources

                                        var7_3 = null;
                                        ** continue;
                                    }
                                }
                                var3_9 = var2_8;
                                var8_4 /* !! */  = var6_5;
                                var9_7 = var7_3;
                                if (!var2_8) {
                                    var3_9 = var2_8;
                                    var8_4 /* !! */  = var6_5;
                                    var9_7 = var7_3;
                                    if ("mounted".equals(var0.d)) {
                                        var6_5 = K.z(var0.b);
                                        var7_3 = new File((String)var6_5);
                                        var3_9 = var2_8;
                                        var8_4 /* !! */  = var7_3;
                                        var9_7 = var6_5;
                                        if (var7_3.exists()) {
                                            var3_9 = var2_8;
                                            var8_4 /* !! */  = var7_3;
                                            var9_7 = var6_5;
                                            if (var7_3.isDirectory()) {
                                                var3_9 = var2_8;
                                                var8_4 /* !! */  = var7_3;
                                                var9_7 = var6_5;
                                                if (var7_3.canRead()) {
                                                    var3_9 = true;
                                                    var9_7 = var6_5;
                                                    var8_4 /* !! */  = var7_3;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!var3_9 || !var8_4 /* !! */ .canWrite()) break block23;
                                if (var0.a != u.a.c0 || (var6_5 = ax.Q2.e.c) == null || (var6_5 = var6_5.b) == null || !var6_5.getAbsolutePath().equals(var9_7)) break block24;
                                var4_10 = ax.Q2.e.c.f;
                                var1_1 = false;
                                break block19;
                            }
                            if (Q.m()) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var1_1 = false;
                                    var4_10 = true;
                                    break block19;
                                    break;
                                }
                            }
                            if (Q.z0() && ax.Q2.b.h().g() != null && J.D(ax.Q2.b.h().g()) || B.e0((String)var9_7)) {
                                ** continue;
                            }
                            ** GOTO lbl-1000
                        }
                        if (var3_9 && !var8_4 /* !! */ .canWrite() && Q.m()) {
                            var1_1 = B.b0((String)var9_7);
lbl80:
                            // 2 sources

                            while (true) {
                                var4_10 = false;
                                break;
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 = false;
                            ** continue;
                        }
                    }
                    if (var3_9) {
                        var10_2.b = var8_4 /* !! */ ;
                    }
                    var10_2.f = var4_10;
                    break block25;
                }
                var10_2.f = false;
            }
            var1_1 = false;
        }
        var10_2.g = var0.b;
        var10_2.i = var0.g;
        var10_2.h = var0.c;
        var10_2.c = var0.e;
        var10_2.d = var0.d;
        var4_10 = var10_2.b != null ? var5_6 : false;
        var10_2.a = ax.Q2.e.r(var0, var4_10);
        var10_2.j = var1_1;
        if ("mounted".equals(var10_2.d)) {
            var10_2.e = r.c0;
            return var10_2;
        }
        var10_2.e = r.d0;
        return var10_2;
    }

    private static boolean a() {
        if (b == null) {
            return true;
        }
        Object object = ax.Q2.e.b.b;
        if (object != null) {
            try {
                object = Environment.getExternalStorageState((File)object);
            }
            catch (NullPointerException nullPointerException) {
                ax.Ha.b b8 = ax.Ha.c.h().f().b("CHROMEOS 9 NULL POINTER").l(nullPointerException);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("root exist:");
                stringBuilder.append(ax.Q2.e.b.b.exists());
                b8.g(stringBuilder.toString()).h();
                return false;
            }
        } else {
            object = "unknown";
        }
        return !ax.Q2.e.b.d.equals(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean b() {
        NullPointerException nullPointerException2;
        block7: {
            Object object;
            if (c == null) {
                return true;
            }
            try {
                object = ax.Q2.e.c.b;
                object = object != null ? Environment.getExternalStorageState((File)object) : ((object = f) != null ? Environment.getExternalStorageState((File)object) : "unknown");
            }
            catch (NullPointerException nullPointerException2) {
                break block7;
            }
            if (!ax.Q2.e.c.d.equals(object)) {
                return true;
            }
            object = ax.Q2.e.c.b;
            if (object != null) {
                object = ((File)object).getAbsolutePath();
                return ax.Q2.e.c.e != ax.Q2.e.f((String)object);
            } else {
                long l8 = ax.Q2.e.B().lastModified();
                if (g != l8 && (object = ax.Q2.e.e()) != null && (object = ((m)object).a) != null) return ax.Q2.e.c.e != ax.Q2.e.f((String)object);
                object = null;
            }
            return ax.Q2.e.c.e != ax.Q2.e.f((String)object);
        }
        ax.Ha.c.h().f().b("getExternalStorageState null pointer").l(nullPointerException2).h();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean c() {
        if (!Q.R1()) {
            return false;
        }
        if (d) {
            d = false;
            return true;
        }
        List<e> list = e;
        synchronized (list) {
            e e8;
            String string;
            Iterator<e> iterator;
            try {
                iterator = list.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            do {
                if (!iterator.hasNext()) {
                    return false;
                }
                e8 = iterator.next();
            } while ((string = e8.g) == null || e8.d.equals(string = ax.Q2.e.G(string, e8.i)));
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        Object object = c;
        if (object != null && "unknown".equals(((e)object).d)) {
            ax.Q2.e.c.d = "";
        }
        if ((object = b) != null && "unknown".equals(((e)object).d)) {
            ax.Q2.e.b.d = "";
        }
        object = e;
        synchronized (object) {
            try {
                Iterator iterator = object.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    e e8 = (e)iterator.next();
                    if (e8 == null || !"unknown".equals(e8.d)) continue;
                    e8.d = "";
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static final m e() {
        return K.c();
    }

    private static r f(String string) {
        return K.k(string);
    }

    private static List<u> g() {
        return K.s();
    }

    private static boolean h() {
        if (Q.S1()) {
            return false;
        }
        if (j != null && new File(j).exists()) {
            return true;
        }
        if (Q.R1()) {
            return false;
        }
        FileFilter fileFilter = new FileFilter(){

            @Override
            public boolean accept(File file) {
                return ax.Q2.e.O(file.getAbsolutePath());
            }
        };
        Object object = new File("/storage");
        if (((File)object).exists() && (object = ((File)object).listFiles(fileFilter)) != null && ((File[])object).length > 0) {
            return true;
        }
        if (Q.y() && ((File)(object = new File("/mnt"))).exists() && (object = ((File)object).listFiles(fileFilter)) != null && ((Object)object).length > 0) {
            return true;
        }
        object = K.q();
        if (object != null && ((File)(object = new File((String)object))).exists()) {
            j = ((File)object).getAbsolutePath();
            return true;
        }
        object = new File("/Removable");
        if (((File)object).exists() && (object = ((File)object).listFiles(fileFilter)) != null && ((Object)object).length > 0) {
            return true;
        }
        object = new File("/storage/removable");
        return ((File)object).exists() && (fileFilter = ((File)object).listFiles(fileFilter)) != null && ((File[])fileFilter).length > 0;
    }

    public static File i() {
        Object object;
        if (j != null && ((File)(object = new File(j))).canWrite() && ((File)object).canRead()) {
            return object;
        }
        object = ax.Q2.e.j(new File("/storage"));
        if (object != null) {
            j = ((File)object).getAbsolutePath();
            return object;
        }
        if (Q.y() && (object = ax.Q2.e.j(new File("/mnt"))) != null) {
            j = ((File)object).getAbsolutePath();
            return object;
        }
        object = K.q();
        if (object != null && ((File)(object = new File((String)object))).exists()) {
            j = ((File)object).getAbsolutePath();
            return object;
        }
        object = ax.Q2.e.j(new File("/Removable"));
        if (object != null) {
            j = ((File)object).getAbsolutePath();
            return object;
        }
        object = ax.Q2.e.j(new File("/storage/removable"));
        if (object != null) {
            j = ((File)object).getAbsolutePath();
            return object;
        }
        return null;
    }

    private static File j(File fileArray) {
        if (!fileArray.exists()) {
            return null;
        }
        FileFilter object2 = new FileFilter(){

            @Override
            public boolean accept(File file) {
                if (!ax.Q2.e.O(file.getAbsolutePath())) {
                    return false;
                }
                return file.isDirectory();
            }
        };
        FileFilter fileFilter = new FileFilter(){

            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        if ((fileArray = fileArray.listFiles(object2)) != null) {
            for (File file : fileArray) {
                if (file.canRead() && file.canWrite()) {
                    return file;
                }
                File[] fileArray2 = file.listFiles(fileFilter);
                if (fileArray2 == null) continue;
                for (File[] fileArray3 : fileArray2) {
                    if (fileArray3.canWrite() && fileArray3.canRead()) {
                        return fileArray3;
                    }
                    if ((fileArray3 = fileArray3.listFiles(fileFilter)) == null) continue;
                    int n8 = fileArray3.length;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        File file2 = fileArray3[i8];
                        if (!file2.canRead() || !file2.canWrite()) continue;
                        return file2;
                    }
                }
            }
        }
        return null;
    }

    public static final File k(Context context) {
        File file = ax.Q2.e.n(context);
        if (file != null) {
            return file;
        }
        return context.getCacheDir();
    }

    public static int l(Context context) {
        return ax.t3.j.l(context);
    }

    public static int m(Context context) {
        return ax.t3.j.l(context);
    }

    private static File n(Context object) {
        try {
            if (l == null) {
                l = object.getExternalCacheDir();
            }
            object = l;
            return object;
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException | SecurityException runtimeException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File o(Context object) {
        File file = K.y();
        if (file == null) return ax.Q2.e.k((Context)object);
        object = new File(file, "/Android/media/com.voxdon.xplorer/.localcache");
        if (!((File)object).exists()) {
            ((File)object).mkdirs();
        }
        if ((file = new File((File)object, ".nomedia")).exists()) return object;
        try {
            file.createNewFile();
            return object;
        }
        catch (IOException iOException) {
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static File p(Context object) {
        try {
            File file = k;
            if (file == null) {
                k = object.getExternalFilesDir(null);
                return k;
            } else {
                if (file.exists()) return k;
                k = object.getExternalFilesDir(null);
            }
            return k;
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException | SecurityException runtimeException) {
            return null;
        }
    }

    public static final File q(Context context) {
        File file = ax.Q2.e.p(context);
        if (file != null) {
            return file;
        }
        return context.getFilesDir();
    }

    private static f r(u u8, boolean bl) {
        switch (ax.Q2.e$d.a[u8.a.ordinal()]) {
            default: {
                return null;
            }
            case 7: {
                if (bl) {
                    return ax.Q2.f.v0;
                }
                return ax.Q2.f.c1;
            }
            case 6: {
                return ax.Q2.f.g1;
            }
            case 5: {
                if (bl) {
                    return ax.Q2.f.w0;
                }
                return ax.Q2.f.f1;
            }
            case 4: {
                return ax.Q2.f.e1;
            }
            case 3: {
                return ax.Q2.f.d1;
            }
            case 2: {
                return ax.Q2.f.p0;
            }
            case 1: 
        }
        return ax.Q2.f.o0;
    }

    public static final String s(Context context) {
        if (b == null) {
            ax.Q2.e.P();
        }
        e e8 = b;
        String string = e8.d;
        if (e8.c) {
            if ("shared".equals(string)) {
                return context.getString(2131952560);
            }
            return context.getString(2131952453);
        }
        if ("shared".equals(string)) {
            return context.getString(2131952666);
        }
        return context.getString(2131952665);
    }

    public static File t(Context object) {
        if (Q.L() && (object = K.y()) != null && ((File)(object = new File((File)object, ".localcache"))).exists()) {
            return object;
        }
        return null;
    }

    public static final e u() {
        if (ax.Q2.e.a()) {
            if (b != null) {
                a.fine("PRIMARY STORAGE STATUS CHANGED!!!!");
            }
            ax.Q2.e.P();
        }
        return b;
    }

    public static final String v() {
        File file;
        if (b == null) {
            ax.Q2.e.P();
        }
        if ((file = ax.Q2.e.b.b) != null) {
            return file.getAbsolutePath();
        }
        file = K.y();
        if (file == null) {
            ax.Ha.c.h().f().d("GET MAIN STORAGE PATH FAILED").g("null").h();
        } else {
            ax.Ha.c.h().f().d("GET MAIN STORAGE PATH FAILED").g(file.getAbsolutePath()).h();
        }
        return "/";
    }

    public static final File w(Context object) {
        if (!((File)(object = new File(object.getFilesDir(), "storage_index"))).exists()) {
            ((File)object).mkdir();
        }
        return object;
    }

    public static final e x() {
        if (ax.Q2.e.b()) {
            if (c != null) {
                a.fine("SECONDARY STORAGE STATUS CHANGED!!!!");
            }
            ax.Q2.e.P();
        }
        return c;
    }

    public static final String y() {
        File file;
        if (c == null) {
            ax.Q2.e.P();
        }
        if ((file = ax.Q2.e.c.b) != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static final r z() {
        if (c == null) {
            ax.Q2.e.P();
        }
        return ax.Q2.e.c.e;
    }

    public static class e {
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

        public void a(e e8) {
            this.b = e8.b;
            this.c = e8.c;
            this.d = e8.d;
            this.e = e8.e;
            this.f = e8.f;
            this.j = e8.j;
            this.h = e8.h;
        }
    }
}

