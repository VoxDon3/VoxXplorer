/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.LocaleList;
import ax.Ha.c;
import ax.X2.I;
import ax.X2.Q;
import ax.Y.k;
import ax.Y.n;
import ax.c3.K;
import ax.c3.M;
import ax.c3.d0;
import ax.u3.B;
import ax.u3.b;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

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
            J.p();
        }
        return g == 9;
    }

    public static boolean B() {
        if (g == null) {
            J.p();
        }
        return g == 1;
    }

    public static boolean C(K k8) {
        if (b == null) {
            b = k8.e() != null ? Boolean.valueOf(new File(d0.Q(k8.e(), ".MetaEcfsFile")).exists()) : Boolean.FALSE;
        }
        return b;
    }

    public static boolean D(Context context) {
        if (i == null) {
            UiModeManager uiModeManager = (UiModeManager)context.getSystemService("uimode");
            i = uiModeManager != null && uiModeManager.getCurrentModeType() == 4 ? Boolean.TRUE : Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.software.leanback"));
        }
        return i;
    }

    public static boolean E() {
        if (g == null) {
            J.p();
        }
        return g == 8;
    }

    public static boolean F() {
        if (g == null) {
            J.p();
        }
        return g == 3;
    }

    public static boolean G() {
        return false;
    }

    private static HashSet<String> a() {
        HashSet<String> hashSet = new HashSet<String>();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 == 26) {
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
        if (n8 == 27) {
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
        if (n8 != 24 && n8 != 25) {
            return hashSet;
        }
        Collections.addAll(hashSet, "Slide_Wings_4GP", "TECNO-i7", "v3953", "Grand_XL", "U5_3G", "LIVE_6plus", "KOOLNEE_K1", "C5s", "KEMPLER_8_PLUS", "C9", "P637F10", "Ilium_L1120", "HS6737MT", "Q17", "Q11", "WE_T1", "mickey6t", "Bharat_5", "DW55B8L", "QY77", "GOME", "ML-JI11-M7_3G_PLUS", "EB50B1L", "BV8000Pro_RU", "Phantom6-Plus", "TELMA_F1_4G", "TECNO-WX3", "TECNO-WX3P", "Pixi5-10_4G", "Kylin_5_0S", "TECNO-LA6", "X557", "TECNO-WX4", "ZTE_BLADE_V0820", "SENSEIT_A150", "v3961", "ELEMENT_PRO", "A10", "Aquaris_A45_sprout", "ComioC2", "Ilium_L920", "SDQ_52004L", "Z60", "S530", "Impress_Energy", "ELEGANCE02A-S17A", "Alpha", "Active", "elsa6_na", "BL7000", "S1a", "P8_3D", "MIX_2", "K5", "62S", "GLAM", "Impress_Lion_4G", "Alpha_X", "Ilium_X520", "MS50L_4G", "Impress_Luck", "N5702L", "CatS41", "XT1663", "C5a", "K3", "G3312", "G3311", "G3313", "H3311", "H3321", "H4311", "H4331", "marino_f", "1601", "1714", "Orsa", "U20_Plus", "CLEVER", "M2", "P8_Max", "S8", "S8_Pro", "S8_Pro1", "S8_pro1", "K350t", "V2", "V3", "V4", "P6000", "K5000", "GS170", "manning", "Power_3", "Power_3S", "BV8000Pro", "BV9000", "BV9000-F", "BV9000Pro-F", "MIX", "MIX2", "LRExplore", "S2_PRO", "t816_gq_ulefone", "t777_dg_m1_65_n", "MS50L", "cedric", "D0070WW", "TECNO-F2", "TECNO-F3", "TECNO-F3-13M", "TECNO-K7", "INOI_2", "INOI_2_LITE", "INOI_3_LITE", "INOI_6_Lite", "Infinix-X571", "Infinix-X572", "Infinix-X559", "Infinix-X559C", "Infinix-X603", "S16", "M555i", "A3A_XL_3G", "PIXI5-6_4G", "U5A_PLUS_3G", "U17", "TB-7304I", "TB-7304X", "Riga", "Selfie", "vkworld_S8");
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int b() {
        block8: {
            Object object;
            Object object2;
            block7: {
                object2 = k;
                if (object2 != null) {
                    return (Integer)object2;
                }
                k = 100;
                try {
                    object = new File("/proc/cpuinfo");
                    object2 = new Scanner((File)object);
                    break block7;
                }
                catch (Exception exception) {}
                exception.printStackTrace();
                break block8;
            }
            while (((Scanner)object2).hasNext()) {
                object = ((Scanner)object2).nextLine();
                if (!((String)object).startsWith("Hardware")) continue;
                if (((String)object).contains("Qualcomm")) {
                    k = 1;
                    continue;
                }
                if (((String)object).contains("Hardware: MT")) {
                    k = 3;
                    continue;
                }
                if (!((String)object).contains("Amlogic")) continue;
                k = 4;
            }
            ((Scanner)object2).close();
        }
        if (k == 100 && J.B()) {
            k = 2;
        }
        return k;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int c() {
        IllegalArgumentException illegalArgumentException2;
        Integer n8;
        block9: {
            Object object;
            block7: {
                block8: {
                    boolean bl = J.q();
                    n8 = 0;
                    if (!bl) {
                        ax.u3.b.f();
                        return 0;
                    }
                    if (f != null) return f;
                    try {
                        object = Build.FINGERPRINT;
                        if (object == null) break block7;
                        if (((String[])(object = ((String)object).split("/"))).length < 4) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        break block9;
                    }
                    catch (NumberFormatException numberFormatException) {
                        ax.u3.b.e("UNKNOWN CHROME OS FINGER PRINT 1");
                        f = n8;
                        return f;
                    }
                    object = object[3];
                    if (!((String)object).startsWith("R")) {
                        object = new IllegalArgumentException();
                        throw object;
                    }
                    int n9 = ((String)object).indexOf("-");
                    if (n9 >= 0) {
                        f = Integer.valueOf(((String)object).substring(1, n9));
                        return f;
                    }
                    object = new IllegalArgumentException();
                    throw object;
                }
                object = new IllegalArgumentException();
                throw object;
            }
            object = new IllegalArgumentException();
            throw object;
        }
        illegalArgumentException2.printStackTrace();
        ax.u3.b.e("UNKNOWN CHROME OS FINGER PRINT 2");
        f = n8;
        return f;
    }

    public static boolean d() {
        return J.E() && Build.VERSION.SDK_INT == 24 || Build.VERSION.SDK_INT == 25;
    }

    public static boolean e() {
        if (j == null) {
            if (Build.VERSION.SDK_INT >= 31 && J.B()) {
                LocaleList localeList = I.a();
                for (int i8 = 0; i8 < ax.Y.k.a(localeList); ++i8) {
                    if (!"en".equals(n.a(localeList, i8).getLanguage())) continue;
                    j = Boolean.TRUE;
                }
            }
            if (j == null) {
                j = Boolean.FALSE;
            }
        }
        return j;
    }

    public static boolean f() {
        return J.A() && Build.VERSION.SDK_INT == 29;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean h() {
        return J.v() && Build.VERSION.SDK_INT == 23;
    }

    public static boolean i() {
        return J.q();
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT == 30 && J.A();
    }

    public static boolean k() {
        String string = Build.MODEL;
        boolean bl = "SM-T870".equals(string) || "SM-T875".equals(string) || "SM-T876B".equals(string);
        return J.B() && Q.z0() && bl;
    }

    public static boolean l() {
        if (a == null) {
            boolean bl = Build.VERSION.SDK_INT < 26 && "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            a = bl;
        }
        return a;
    }

    public static boolean m() {
        int n8 = Build.VERSION.SDK_INT;
        return n8 >= 23 && n8 <= 25 && ((n8 = J.b()) == 3 || n8 == 4 || n8 == 100);
    }

    public static boolean n() {
        if (d == null) {
            if (J.F()) {
                int n8 = Build.VERSION.SDK_INT;
                boolean bl = n8 >= 26 && n8 <= 28;
                d = bl;
            } else {
                d = Boolean.FALSE;
            }
        }
        return d;
    }

    public static boolean o() {
        return J.F() && Build.VERSION.SDK_INT == 29;
    }

    private static void p() {
        if (g == null) {
            String string = Build.MANUFACTURER;
            if (string == null) {
                g = 100;
                return;
            }
            if ("samsung".equalsIgnoreCase(string = string.toLowerCase())) {
                g = 1;
                return;
            }
            if ("huawei".equalsIgnoreCase(string)) {
                g = 2;
                return;
            }
            if ("xiaomi".equalsIgnoreCase(string)) {
                g = 3;
                return;
            }
            if ("lg".equalsIgnoreCase(string)) {
                g = 5;
                return;
            }
            if ("motorola".equalsIgnoreCase(string)) {
                g = 6;
                return;
            }
            if ("oppo".equalsIgnoreCase(string)) {
                g = 7;
                return;
            }
            if ("oneplus".equalsIgnoreCase(string)) {
                g = 4;
                return;
            }
            if ("wiko".equalsIgnoreCase(string)) {
                g = 8;
                return;
            }
            if ("realme".equalsIgnoreCase(string)) {
                g = 9;
                return;
            }
            if ("vivo".equalsIgnoreCase(string)) {
                g = 10;
                return;
            }
            g = 100;
        }
    }

    public static boolean q() {
        if (e == null) {
            String string = Build.DEVICE;
            boolean bl = string != null && string.matches(".+_cheets|cheets_.+");
            e = bl;
        }
        return e;
    }

    public static boolean r() {
        if (c == null) {
            c = J.a().contains(Build.DEVICE) ? Boolean.TRUE : Boolean.FALSE;
        }
        return c;
    }

    public static boolean s(Context context) {
        if (context == null) {
            return true;
        }
        if (h == null) {
            try {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                h = B.K(context, intent);
            }
            catch (Exception exception) {
                ax.Ha.c.h().f().b("QUERY ACTIVITY").l(exception).h();
                h = Boolean.TRUE;
            }
        }
        return h;
    }

    public static boolean t() {
        if (g == null) {
            J.p();
        }
        return g == 2;
    }

    public static boolean u(Context context) {
        if ("px3 (1024x600 O)".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return J.D(context);
    }

    public static boolean v() {
        if (g == null) {
            J.p();
        }
        return g == 5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int w(Context object) {
        Throwable throwable222222;
        File file;
        block15: {
            block14: {
                int n8 = l;
                if (n8 != 0) {
                    return n8;
                }
                file = new File("/storage/emulated/0/Android/media/com.voxdon.xplorer");
                if (!file.exists()) {
                    file.mkdirs();
                }
                file = new File(file, "deleteparam_test");
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                String string = file.getAbsolutePath();
                boolean bl = M.e((Context)object, string);
                if (!bl) {
                    ax.u3.b.e("what case is this?");
                    l = 3;
                    break block14;
                }
                if (M.j((Context)object, string, false, false) >= 1) {
                    object = new File(string);
                    l = ((File)object).exists() ? 1 : 2;
                    break block14;
                } else {
                    ax.u3.b.e("what case is this?");
                    l = 3;
                }
                {
                    catch (Throwable throwable222222) {
                        break block15;
                    }
                    catch (Exception exception) {}
                    {
                        l = 3;
                    }
                }
            }
            try {
                file.delete();
                return l;
            }
            catch (Exception exception) {
                return l;
            }
        }
        try {
            file.delete();
        }
        catch (Exception exception) {
            throw throwable222222;
        }
        throw throwable222222;
    }

    public static boolean x(Context context) {
        if (!Q.W()) {
            return false;
        }
        return J.w(context) != 1;
    }

    public static boolean y(Context context) {
        Comparable<Boolean> comparable = m;
        if (comparable != null) {
            return (Boolean)comparable;
        }
        comparable = new File("/storage/emulated/0/Android/media/com.voxdon.xplorer");
        if (!((File)comparable).exists()) {
            ((File)comparable).mkdirs();
        }
        comparable = new File((File)comparable, "mediastore_update_test");
        try {
            ((File)comparable).createNewFile();
            if (!M.e(context, ((File)comparable).getAbsolutePath())) {
                ((File)comparable).delete();
                m = Boolean.FALSE;
            } else {
                ((File)comparable).delete();
                m = M.e(context, ((File)comparable).getAbsolutePath()) ? Boolean.FALSE : Boolean.TRUE;
            }
        }
        catch (Exception exception) {
            m = Boolean.FALSE;
        }
        return m;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT == 26;
    }
}

