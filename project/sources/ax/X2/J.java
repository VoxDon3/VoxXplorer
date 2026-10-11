package ax.X2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ax.c3.d0;
import ax.u3.C3180B;
import ax.u3.C3184b;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/* loaded from: classes.dex */
public class J {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    private static Boolean e;
    private static Integer f;
    private static Integer g;
    private static Boolean h;
    private static Boolean i;
    private static Boolean j;
    private static Integer k;
    private static int l;
    private static Boolean m;

    public static boolean A() {
        if (g == null) {
            p();
        }
        return g.intValue() == 9;
    }

    public static boolean B() {
        if (g == null) {
            p();
        }
        return g.intValue() == 1;
    }

    public static boolean C(ax.c3.K k2) {
        if (b == null) {
            if (k2.e() != null) {
                b = Boolean.valueOf(new File(d0.Q(k2.e(), ".MetaEcfsFile")).exists());
            } else {
                b = Boolean.FALSE;
            }
        }
        return b.booleanValue();
    }

    public static boolean D(Context context) {
        if (i == null) {
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                i = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.software.leanback"));
            } else {
                i = Boolean.TRUE;
            }
        }
        return i.booleanValue();
    }

    public static boolean E() {
        if (g == null) {
            p();
        }
        return g.intValue() == 8;
    }

    public static boolean F() {
        if (g == null) {
            p();
        }
        return g.intValue() == 3;
    }

    public static boolean G() {
        return false;
    }

    private static HashSet<String> a() {
        HashSet<String> hashSet = new HashSet<>();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            hashSet.add("Expanse");
            hashSet.add("brady_f");
            hashSet.add("A3A_XL_4G");
            hashSet.add("SHIFT6m");
            hashSet.add("Hi9Air");
            hashSet.add("V3_Viper");
            hashSet.add("CatS41");
            hashSet.add("BV9000Pro-F");
            hashSet.add("CP-W5s");
            hashSet.add("S55");
            hashSet.add("M20_4G");
            hashSet.add("CO2_sprout");
            hashSet.add("WP2");
            hashSet.add("K8");
            hashSet.add("AS160");
            hashSet.add("NE1");
            hashSet.add("manning");
            hashSet.add("marino_f");
            hashSet.add("ES2_sprout");
            hashSet.add("ES2N_sprout");
            hashSet.add("CO2N_sprout");
            hashSet.add("CUBOT_X18_Plus");
            hashSet.add("Plume_L2");
            hashSet.add("V0250WW");
            hashSet.add("Doppio_SL558");
            hashSet.add("BV8000Pro");
            hashSet.add("VK7000");
            hashSet.add("S99");
            return hashSet;
        }
        if (i2 != 27) {
            if (i2 != 24 && i2 != 25) {
                return hashSet;
            }
            Collections.addAll(hashSet, "Slide_Wings_4GP", "TECNO-i7", "v3953", "Grand_XL", "U5_3G", "LIVE_6plus", "KOOLNEE_K1", "C5s", "KEMPLER_8_PLUS", "C9", "P637F10", "Ilium_L1120", "HS6737MT", "Q17", "Q11", "WE_T1", "mickey6t", "Bharat_5", "DW55B8L", "QY77", "GOME", "ML-JI11-M7_3G_PLUS", "EB50B1L", "BV8000Pro_RU", "Phantom6-Plus", "TELMA_F1_4G", "TECNO-WX3", "TECNO-WX3P", "Pixi5-10_4G", "Kylin_5_0S", "TECNO-LA6", "X557", "TECNO-WX4", "ZTE_BLADE_V0820", "SENSEIT_A150", "v3961", "ELEMENT_PRO", "A10", "Aquaris_A45_sprout", "ComioC2", "Ilium_L920", "SDQ_52004L", "Z60", "S530", "Impress_Energy", "ELEGANCE02A-S17A", "Alpha", "Active", "elsa6_na", "BL7000", "S1a", "P8_3D", "MIX_2", "K5", "62S", "GLAM", "Impress_Lion_4G", "Alpha_X", "Ilium_X520", "MS50L_4G", "Impress_Luck", "N5702L", "CatS41", "XT1663", "C5a", "K3", "G3312", "G3311", "G3313", "H3311", "H3321", "H4311", "H4331", "marino_f", "1601", "1714", "Orsa", "U20_Plus", "CLEVER", "M2", "P8_Max", "S8", "S8_Pro", "S8_Pro1", "S8_pro1", "K350t", "V2", "V3", "V4", "P6000", "K5000", "GS170", "manning", "Power_3", "Power_3S", "BV8000Pro", "BV9000", "BV9000-F", "BV9000Pro-F", "MIX", "MIX2", "LRExplore", "S2_PRO", "t816_gq_ulefone", "t777_dg_m1_65_n", "MS50L", "cedric", "D0070WW", "TECNO-F2", "TECNO-F3", "TECNO-F3-13M", "TECNO-K7", "INOI_2", "INOI_2_LITE", "INOI_3_LITE", "INOI_6_Lite", "Infinix-X571", "Infinix-X572", "Infinix-X559", "Infinix-X559C", "Infinix-X603", "S16", "M555i", "A3A_XL_3G", "PIXI5-6_4G", "U5A_PLUS_3G", "U17", "TB-7304I", "TB-7304X", "Riga", "Selfie", "vkworld_S8");
            return hashSet;
        }
        hashSet.add("VFD720");
        hashSet.add("LT_C2200");
        hashSet.add("V0350WW");
        hashSet.add("U3A_PLUS_4G");
        hashSet.add("Plume_L1_Plus");
        hashSet.add("VFD527");
        hashSet.add("LeLift");
        hashSet.add("ES2_sprout");
        hashSet.add("ES2N_sprout");
        hashSet.add("GM6_d_sprout");
        hashSet.add("GM6_s_sprout");
        hashSet.add("Infinix-X572");
        hashSet.add("Infinix-X571");
        hashSet.add("HWDUA-M");
        hashSet.add("HWDRA-M");
        hashSet.add("HWDRA-MG");
        hashSet.add("TECNO-CA7");
        hashSet.add("TECNO-CA8");
        hashSet.add("NOA_N7");
        hashSet.add("FRT");
        hashSet.add("HWCAG-L6737M");
        hashSet.add("U5A_PLUS_4G");
        hashSet.add("VFD620");
        hashSet.add("W_C200SN");
        hashSet.add("iris65");
        hashSet.add("Z50");
        hashSet.add("S9");
        hashSet.add("P639F10");
        hashSet.add("A3A");
        hashSet.add("cactus");
        hashSet.add("cereus");
        return hashSet;
    }

    public static int b() {
        Integer num = k;
        if (num != null) {
            return num.intValue();
        }
        k = 100;
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (scanner.hasNext()) {
                String nextLine = scanner.nextLine();
                if (nextLine.startsWith("Hardware")) {
                    if (nextLine.contains("Qualcomm")) {
                        k = 1;
                    } else if (nextLine.contains("Hardware: MT")) {
                        k = 3;
                    } else if (nextLine.contains("Amlogic")) {
                        k = 4;
                    }
                }
            }
            scanner.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (k.intValue() == 100 && B()) {
            k = 2;
        }
        return k.intValue();
    }

    public static int c() {
        if (!q()) {
            C3184b.f();
            return 0;
        }
        if (f == null) {
            try {
                String str = Build.FINGERPRINT;
                if (str == null) {
                    throw new IllegalArgumentException();
                }
                String[] split = str.split("/");
                if (split.length < 4) {
                    throw new IllegalArgumentException();
                }
                String str2 = split[3];
                if (!str2.startsWith("R")) {
                    throw new IllegalArgumentException();
                }
                int indexOf = str2.indexOf("-");
                if (indexOf < 0) {
                    throw new IllegalArgumentException();
                }
                f = Integer.valueOf(str2.substring(1, indexOf));
            } catch (NumberFormatException unused) {
                C3184b.e("UNKNOWN CHROME OS FINGER PRINT 1");
                f = 0;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                C3184b.e("UNKNOWN CHROME OS FINGER PRINT 2");
                f = 0;
            }
        }
        return f.intValue();
    }

    public static boolean d() {
        return (E() && Build.VERSION.SDK_INT == 24) || Build.VERSION.SDK_INT == 25;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e() {
        /*
            java.lang.Boolean r0 = ax.X2.J.j
            if (r0 != 0) goto L3a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L32
            boolean r0 = B()
            if (r0 == 0) goto L32
            android.os.LocaleList r0 = ax.X2.I.a()
            r1 = 0
        L15:
            int r2 = ax.Y.k.a(r0)
            if (r1 >= r2) goto L32
            java.util.Locale r2 = ax.Y.n.a(r0, r1)
            java.lang.String r3 = "en"
            java.lang.String r2 = r2.getLanguage()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2f
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            ax.X2.J.j = r2
        L2f:
            int r1 = r1 + 1
            goto L15
        L32:
            java.lang.Boolean r0 = ax.X2.J.j
            if (r0 != 0) goto L3a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            ax.X2.J.j = r0
        L3a:
            java.lang.Boolean r0 = ax.X2.J.j
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X2.J.e():boolean");
    }

    public static boolean f() {
        return A() && Build.VERSION.SDK_INT == 29;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean h() {
        return v() && Build.VERSION.SDK_INT == 23;
    }

    public static boolean i() {
        return q();
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT == 30 && A();
    }

    public static boolean k() {
        String str = Build.MODEL;
        return B() && Q.z0() && ("SM-T870".equals(str) || "SM-T875".equals(str) || "SM-T876B".equals(str));
    }

    public static boolean l() {
        if (a == null) {
            a = Boolean.valueOf(Build.VERSION.SDK_INT < 26 && "samsung".equalsIgnoreCase(Build.MANUFACTURER));
        }
        return a.booleanValue();
    }

    public static boolean m() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 || i2 > 25) {
            return false;
        }
        int b2 = b();
        return b2 == 3 || b2 == 4 || b2 == 100;
    }

    public static boolean n() {
        if (d == null) {
            if (F()) {
                int i2 = Build.VERSION.SDK_INT;
                d = Boolean.valueOf(i2 >= 26 && i2 <= 28);
            } else {
                d = Boolean.FALSE;
            }
        }
        return d.booleanValue();
    }

    public static boolean o() {
        return F() && Build.VERSION.SDK_INT == 29;
    }

    private static void p() {
        if (g == null) {
            String str = Build.MANUFACTURER;
            if (str == null) {
                g = 100;
                return;
            }
            String lowerCase = str.toLowerCase();
            if ("samsung".equalsIgnoreCase(lowerCase)) {
                g = 1;
                return;
            }
            if ("huawei".equalsIgnoreCase(lowerCase)) {
                g = 2;
                return;
            }
            if ("xiaomi".equalsIgnoreCase(lowerCase)) {
                g = 3;
                return;
            }
            if ("lg".equalsIgnoreCase(lowerCase)) {
                g = 5;
                return;
            }
            if ("motorola".equalsIgnoreCase(lowerCase)) {
                g = 6;
                return;
            }
            if ("oppo".equalsIgnoreCase(lowerCase)) {
                g = 7;
                return;
            }
            if ("oneplus".equalsIgnoreCase(lowerCase)) {
                g = 4;
                return;
            }
            if ("wiko".equalsIgnoreCase(lowerCase)) {
                g = 8;
                return;
            }
            if ("realme".equalsIgnoreCase(lowerCase)) {
                g = 9;
            } else if ("vivo".equalsIgnoreCase(lowerCase)) {
                g = 10;
            } else {
                g = 100;
            }
        }
    }

    public static boolean q() {
        if (e == null) {
            String str = Build.DEVICE;
            e = Boolean.valueOf(str != null && str.matches(".+_cheets|cheets_.+"));
        }
        return e.booleanValue();
    }

    public static boolean r() {
        if (c == null) {
            if (a().contains(Build.DEVICE)) {
                c = Boolean.TRUE;
            } else {
                c = Boolean.FALSE;
            }
        }
        return c.booleanValue();
    }

    public static boolean s(Context context) {
        if (context == null) {
            return true;
        }
        if (h == null) {
            try {
                h = Boolean.valueOf(C3180B.K(context, new Intent("android.intent.action.OPEN_DOCUMENT_TREE")));
            } catch (Exception e2) {
                ax.Ha.c.h().f().b("QUERY ACTIVITY").l(e2).h();
                h = Boolean.TRUE;
            }
        }
        return h.booleanValue();
    }

    public static boolean t() {
        if (g == null) {
            p();
        }
        return g.intValue() == 2;
    }

    public static boolean u(Context context) {
        return "px3 (1024x600 O)".equalsIgnoreCase(Build.MODEL) || D(context);
    }

    public static boolean v() {
        if (g == null) {
            p();
        }
        return g.intValue() == 5;
    }

    private static int w(Context context) {
        int i2 = l;
        if (i2 != 0) {
            return i2;
        }
        File file = new File("/storage/emulated/0/Android/media/com.voxdon.xplorer");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "deleteparam_test");
        try {
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                file2.createNewFile();
                String absolutePath = file2.getAbsolutePath();
                if (!ax.c3.M.e(context, absolutePath)) {
                    C3184b.e("what case is this?");
                    l = 3;
                } else if (ax.c3.M.j(context, absolutePath, false, false) < 1) {
                    C3184b.e("what case is this?");
                    l = 3;
                } else if (new File(absolutePath).exists()) {
                    l = 1;
                } else {
                    l = 2;
                }
            } catch (Throwable th) {
                try {
                    file2.delete();
                } catch (Exception unused) {
                }
                throw th;
            }
        } catch (Exception unused2) {
            l = 3;
        }
        try {
            file2.delete();
        } catch (Exception unused3) {
        }
        return l;
    }

    public static boolean x(Context context) {
        return Q.W() && w(context) != 1;
    }

    public static boolean y(Context context) {
        Boolean bool = m;
        if (bool != null) {
            return bool.booleanValue();
        }
        File file = new File("/storage/emulated/0/Android/media/com.voxdon.xplorer");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "mediastore_update_test");
        try {
            file2.createNewFile();
            if (ax.c3.M.e(context, file2.getAbsolutePath())) {
                file2.delete();
                if (ax.c3.M.e(context, file2.getAbsolutePath())) {
                    m = Boolean.FALSE;
                } else {
                    m = Boolean.TRUE;
                }
            } else {
                file2.delete();
                m = Boolean.FALSE;
            }
        } catch (Exception unused) {
            m = Boolean.FALSE;
        }
        return m.booleanValue();
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT == 26;
    }
}
