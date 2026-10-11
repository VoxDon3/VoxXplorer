/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import ax.G7.g;
import ax.J7.f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class i {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String A(InputStream closeable) {
        if (((Scanner)(closeable = new Scanner((InputStream)closeable).useDelimiter("\\A"))).hasNext()) {
            return ((Scanner)closeable).next();
        }
        return "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long b(Context context) {
        synchronized (i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
    }

    public static long c(String string) {
        string = new StatFs(string);
        long l8 = string.getBlockSize();
        return (long)string.getBlockCount() * l8 - l8 * (long)string.getAvailableBlocks();
    }

    @SuppressLint(value={"MissingPermission"})
    public static boolean d(Context context) {
        if (i.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return (context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && context.isConnectedOrConnecting();
        }
        return true;
    }

    public static boolean e(Context context, String string) {
        return context.checkCallingOrSelfPermission(string) == 0;
    }

    public static void f(Closeable closeable, String string) {
        if (closeable != null) {
            try {
                closeable.close();
                return;
            }
            catch (IOException iOException) {
                g.f().e(string, iOException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void g(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static String h(String ... object) {
        if (object != null && ((String[])object).length != 0) {
            CharSequence charSequence;
            int n8;
            ArrayList<String> arrayList = new ArrayList<String>();
            int n9 = ((String[])object).length;
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                charSequence = object[n8];
                if (charSequence == null) continue;
                arrayList.add(((String)charSequence).replace("-", "").toLowerCase(Locale.US));
            }
            Collections.sort(arrayList);
            charSequence = new StringBuilder();
            n9 = arrayList.size();
            for (n8 = n10; n8 < n9; ++n8) {
                object = arrayList.get(n8);
                ((StringBuilder)charSequence).append((String)object);
            }
            object = ((StringBuilder)charSequence).toString();
            if (((String)object).length() > 0) {
                return i.z((String)object);
            }
        }
        return null;
    }

    public static boolean i(Context context, String string, boolean bl) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int n8 = i.p(context, string, "bool");
            if (n8 > 0) {
                return resources.getBoolean(n8);
            }
            n8 = i.p(context, string, "string");
            if (n8 > 0) {
                return Boolean.parseBoolean(context.getString(n8));
            }
        }
        return bl;
    }

    public static List<f> j(Context stringArray) {
        ArrayList<f> arrayList = new ArrayList<f>();
        int n8 = i.p((Context)stringArray, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int n9 = i.p((Context)stringArray, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int n10 = i.p((Context)stringArray, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (n8 != 0 && n9 != 0 && n10 != 0) {
            String[] stringArray2 = stringArray.getResources().getStringArray(n8);
            String[] stringArray3 = stringArray.getResources().getStringArray(n9);
            if (stringArray2.length == (stringArray = stringArray.getResources().getStringArray(n10)).length && stringArray3.length == stringArray.length) {
                for (int i8 = 0; i8 < stringArray.length; ++i8) {
                    arrayList.add(new f(stringArray2[i8], stringArray3[i8], stringArray[i8]));
                }
                return arrayList;
            }
            g.f().b(String.format("Lengths did not match: %d %d %d", stringArray2.length, stringArray3.length, stringArray.length));
            return arrayList;
        }
        g.f().b(String.format("Could not find resources: %d %d %d", n8, n9, n10));
        return arrayList;
    }

    public static int k() {
        return ax.J7.i$a.h().ordinal();
    }

    public static int l() {
        int n8;
        int n9 = n8 = i.w();
        if (i.x()) {
            n9 = n8 | 2;
        }
        n8 = n9;
        if (i.v()) {
            n8 = n9 | 4;
        }
        return n8;
    }

    public static String m(Context context) {
        int n8;
        int n9 = n8 = i.p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (n8 == 0) {
            n9 = i.p(context, "com.crashlytics.android.build_id", "string");
        }
        if (n9 != 0) {
            return context.getResources().getString(n9);
        }
        return null;
    }

    public static boolean n(Context context) {
        if (i.w()) {
            return false;
        }
        return ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static String o(Context context) {
        int n8 = context.getApplicationContext().getApplicationInfo().icon;
        if (n8 > 0) {
            try {
                String string = context.getResources().getResourcePackageName(n8);
                if ("android".equals(string)) {
                    string = context.getPackageName();
                    return string;
                }
                return string;
            }
            catch (Resources.NotFoundException notFoundException) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static int p(Context context, String string, String string2) {
        return context.getResources().getIdentifier(string, string2, i.o(context));
    }

    public static SharedPreferences q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private static String r(String string, String string2) {
        return i.s(string.getBytes(), string2);
    }

    private static String s(byte[] byArray, String string) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(string);
            messageDigest.update(byArray);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            g g8 = g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create hashing algorithm: ");
            stringBuilder.append(string);
            stringBuilder.append(", returning empty string.");
            g8.e(stringBuilder.toString(), noSuchAlgorithmException);
            return "";
        }
        return i.t(messageDigest.digest());
    }

    public static String t(byte[] byArray) {
        char[] cArray = new char[byArray.length * 2];
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            byte by = byArray[i8];
            int n8 = i8 * 2;
            char[] cArray2 = a;
            cArray[n8] = cArray2[(by & 0xFF) >>> 4];
            cArray[n8 + 1] = cArray2[by & 0xF];
        }
        return new String(cArray);
    }

    public static boolean u(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean v() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
        {
        }
    }

    public static boolean w() {
        String string;
        return Build.PRODUCT.contains("sdk") || (string = Build.HARDWARE).contains("goldfish") || string.contains("ranchu");
        {
        }
    }

    public static boolean x() {
        boolean bl = i.w();
        Object object = Build.TAGS;
        if (!bl && object != null && ((String)object).contains("test-keys")) {
            return true;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        object = new File("/system/xbin/su");
        return !bl && ((File)object).exists();
    }

    public static boolean y(String string, String string2) {
        if (string == null) {
            return string2 == null;
        }
        return string.equals(string2);
    }

    public static String z(String string) {
        return i.r(string, "SHA-1");
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        public static final /* enum */ a i0;
        public static final /* enum */ a j0;
        public static final /* enum */ a k0;
        private static final Map<String, a> l0;
        private static final a[] m0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            q = a11 = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = new a();
            g0 = a10 = new a();
            h0 = a9 = new a();
            i0 = new a();
            j0 = new a();
            k0 = a8 = new a();
            m0 = ax.J7.i$a.d();
            HashMap<String, a> hashMap = new HashMap<String, a>(4);
            l0 = hashMap;
            hashMap.put("armeabi-v7a", a9);
            hashMap.put("armeabi", a10);
            hashMap.put("arm64-v8a", a8);
            hashMap.put("x86", a11);
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0, f0, g0, h0, i0, j0, k0};
        }

        static a h() {
            Object object = Build.CPU_ABI;
            if (TextUtils.isEmpty((CharSequence)object)) {
                g.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return i0;
            }
            object = object.toLowerCase(Locale.US);
            a a8 = l0.get(object);
            object = a8;
            if (a8 == null) {
                object = i0;
            }
            return object;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])m0.clone();
        }
    }
}

