/*
 * Decompiled with CFR 0.152.
 */
package ax.U2;

import android.annotation.SuppressLint;
import android.app.usage.StorageStats;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ax.U2.a;
import ax.U2.b;
import ax.U2.c;
import ax.X2.Q;
import ax.Z2.j;
import ax.c3.B;
import ax.c3.F;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.k;
import ax.r8.r;
import ax.u3.l;
import ax.u3.o;
import ax.u3.q;
import ax.u3.z;
import com.voxdon.xplorer.data.ApkPlusInfo;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import com.voxdon.xplorer.receiver.PackageCommitReceiver;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

@SuppressLint(value={"DefaultLocale"})
public class d {
    private static final Logger j = ax.Q2.g.a(d.class);
    private static d k;
    final String a;
    Context b;
    List<Intent> c = new ArrayList<Intent>();
    ax.Z2.b d;
    HashMap<String, f> e;
    final Object f = new Object();
    HashMap<String, Boolean> g = new HashMap();
    HashMap<String, e> h = new HashMap();
    private final Object i = new Object();

    private d(Context context) {
        this.a = "\u0000";
        this.d = ax.Z2.b.k();
        this.b = context.getApplicationContext();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<ax.U2.f> A() {
        synchronized (this) {
            try {
                var1_1 = new ArrayList<ax.U2.f>();
                var2_3 = this.b.getPackageManager();
                ** for (var4_6 : var2_3.getInstalledPackages((int)0))
lbl-1000:
                // 1 sources

                {
                    try {
                        if (var4_6.applicationInfo == null) continue;
                        var5_8 = new ax.U2.f(var2_3, var4_6);
                        var1_1.add(var5_8);
                        continue;
                    }
                    catch (Exception var4_7) {
                        try {
                            var4_7.printStackTrace();
                            continue;
                        }
                        catch (Exception var2_4) {
                            var2_4.printStackTrace();
                            break;
                        }
                    }
                }
lbl20:
                // 2 sources

                return var1_1;
            }
            catch (Throwable var1_2) {}
            throw var1_2;
        }
    }

    public static Bitmap E(ax.U2.f f8) {
        if ((f8 = f8.l()) instanceof BitmapDrawable) {
            return ((BitmapDrawable)f8).getBitmap();
        }
        if (f8 != null) {
            return z.e((Drawable)f8);
        }
        return null;
    }

    public static d F(Context context) {
        if (k == null) {
            k = new d(context);
        }
        return k;
    }

    private File H() {
        File file = ax.Q2.e.q(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("appcache_");
        stringBuilder.append(Locale.getDefault().toString());
        return new File(file, stringBuilder.toString());
    }

    public static String K(ax.U2.f f8) {
        return B.A(f8);
    }

    public static long L(PackageInfo packageInfo) {
        if (Q.q0()) {
            return ax.U2.b.a(packageInfo);
        }
        return packageInfo.versionCode;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ApkPlusInfo M(k object) {
        try {
            boolean bl;
            Object object2 = F.g((k)object, "manifest.json");
            if (object2 == null) {
                return null;
            }
            object = new String((byte[])object2);
            object2 = new Gson;
            object2();
            object2 = object2.k((String)object, Map.class);
            object = new ApkPlusInfo();
            Object v8 = object2.get("name");
            if (v8 instanceof String) {
                ((ApkPlusInfo)object).app_name = (String)v8;
            }
            if ((v8 = object2.get("version_name")) instanceof String) {
                ((ApkPlusInfo)object).version_name = (String)v8;
            }
            if ((v8 = object2.get("package_name")) instanceof String) {
                ((ApkPlusInfo)object).package_name = (String)v8;
            }
            if (bl = (v8 = object2.get("version_code")) instanceof String) {
                try {
                    ((ApkPlusInfo)object).version_code = Long.parseLong((String)v8);
                }
                catch (NumberFormatException numberFormatException) {}
            }
            if (bl = (object2 = object2.get("min_sdk_version")) instanceof String) {
                try {
                    ((ApkPlusInfo)object).min_sdk_version = Integer.parseInt((String)object2);
                }
                catch (NumberFormatException numberFormatException) {}
            }
            if (((ApkPlusInfo)object).app_name == null) return null;
            object2 = ((ApkPlusInfo)object).version_name;
            if (object2 == null) return null;
            return object;
        }
        catch (ax.b3.j | r | NullPointerException exception) {
            return null;
        }
    }

    private static boolean N(String string) {
        return "apkm".equals(string) || "apk+".equals(string) || "xapk".equals(string);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean O(Context context, k packageInstaller) throws ax.b3.j {
        IOException iOException3;
        int n8;
        block19: {
            IllegalStateException illegalStateException2;
            int n9;
            block18: {
                int n10;
                Object object = new File(ax.Z2.a.m(context, "apks-tmp"), String.valueOf(packageInstaller.E().hashCode()));
                ax.Z2.a.f((File)object, true);
                F.l((k)packageInstaller, (File)object, null);
                PackageInstaller packageInstaller2 = new File((File)object, "Android/obb");
                if (packageInstaller2.exists()) {
                    try {
                        packageInstaller = d0.Q(K.e.e(), "Android/obb");
                        ax.U2.d.e(packageInstaller2.getAbsolutePath(), (String)packageInstaller);
                    }
                    catch (IOException iOException2) {
                        iOException2.printStackTrace();
                    }
                }
                packageInstaller2 = new File((File)object, "splits");
                packageInstaller = object;
                if (packageInstaller2.exists()) {
                    packageInstaller = object;
                    if (packageInstaller2.isDirectory()) {
                        packageInstaller = packageInstaller2;
                    }
                }
                packageInstaller2 = packageInstaller.listFiles();
                object = packageInstaller;
                if (packageInstaller2 != null) {
                    object = packageInstaller;
                    if (((File[])packageInstaller2).length == 1) {
                        object = packageInstaller;
                        if (packageInstaller2[0].isDirectory()) {
                            object = packageInstaller2[0];
                        }
                    }
                }
                if ((packageInstaller = ((File)object).listFiles(new FilenameFilter(){

                    @Override
                    public boolean accept(File file, String string) {
                        return "apk".equals(d0.j(string));
                    }
                })) == null) {
                    return false;
                }
                object = Arrays.asList(packageInstaller);
                Collections.sort(object, new Comparator<File>(){

                    public int a(File file, File file2) {
                        return Integer.compare(ax.U2.d.o(file.getName()), ax.U2.d.o(file.getName()));
                    }
                });
                packageInstaller = context.getPackageManager().getPackageInstaller();
                packageInstaller2 = new PackageInstaller.SessionParams(1);
                packageInstaller2.setSize(0L);
                int n11 = n10 = -1;
                n9 = n10;
                n8 = n10;
                try {
                    n11 = n10 = packageInstaller.createSession((PackageInstaller.SessionParams)packageInstaller2);
                    n9 = n10;
                    n8 = n10;
                    object = object.iterator();
                    while (true) {
                        n11 = n10;
                        n9 = n10;
                        n8 = n10;
                        if (!object.hasNext()) {
                            n11 = n10;
                            n9 = n10;
                            n8 = n10;
                            ax.U2.d.c0(context, packageInstaller, n10);
                            return true;
                        }
                        n11 = n10;
                        n9 = n10;
                        n8 = n10;
                        ax.U2.d.d0(packageInstaller, n10, (File)object.next());
                    }
                }
                catch (NullPointerException nullPointerException) {
                }
                catch (IllegalStateException illegalStateException2) {
                    break block18;
                }
                catch (IOException iOException3) {
                    break block19;
                }
                if (n11 > 0) {
                    packageInstaller.abandonSession(n11);
                }
                return false;
            }
            illegalStateException2.printStackTrace();
            ax.Ha.c.h().f().b("APP INSTALL SESSION ERROR").l(illegalStateException2).h();
            if (n9 > 0) {
                packageInstaller.abandonSession(n9);
            }
            return false;
        }
        iOException3.printStackTrace();
        if (n8 > 0) {
            packageInstaller.abandonSession(n8);
        }
        return false;
    }

    public static boolean P(String string) {
        return "apk+".equals(string);
    }

    public static boolean Q(String string) {
        return string.endsWith("/cache") && string.startsWith("/Android/data/") && string.split("/").length == 5;
    }

    public static boolean S(String string) {
        return "apk".equals(string) || "apk+".equals(string);
        {
        }
    }

    public static boolean T() {
        if (!Q.z0()) {
            return false;
        }
        j j8 = ax.Z2.j.F();
        return j8.t0() && j8.T() != null && j8.j0(K.f);
    }

    public static boolean U(String string) {
        return "apks".equals(string) || "apkm".equals(string) || "apk+".equals(string) || "xapk".equals(string);
        {
        }
    }

    public static boolean V(String string) {
        return "xapk".equals(string);
    }

    private void X(List<ax.U2.f> list, Intent object) {
        String string = object.getAction();
        object = object.getDataString().replace("package:", "");
        if (!"android.intent.action.PACKAGE_ADDED".equals(string) && !"android.intent.action.PACKAGE_REPLACED".equals(string)) {
            if ("android.intent.action.PACKAGE_REMOVED".equals(string)) {
                this.a0(list, (String)object);
            }
            return;
        }
        this.a0(list, (String)object);
        this.c(list, (String)object);
    }

    private HashMap<String, f> Y() {
        File file = this.H();
        if (file.exists()) {
            file.delete();
        }
        if ((file = this.w()).exists()) {
            file.delete();
        }
        return null;
    }

    private void a0(List<ax.U2.f> list, String object) {
        if ((object = this.j(list, (String)object)) != null) {
            list.remove(object);
        }
    }

    private void c(List<ax.U2.f> list, String object) {
        PackageManager packageManager = this.b.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo((String)object, 0);
            if (packageInfo.applicationInfo != null) {
                object = new ax.U2.f(packageManager, packageInfo);
                list.add((ax.U2.f)object);
                return;
            }
        }
        catch (Exception exception) {
            j.severe("Adding changed packaged to cache was failed");
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c0(Context context, PackageInstaller packageInstaller, int n8) throws IOException {
        RuntimeException var0_3;
        block5: {
            try {
                packageInstaller = packageInstaller.openSession(n8);
            }
            catch (Throwable throwable) {
                packageInstaller = null;
                break block5;
            }
            try {
                Intent intent = new Intent(context, PackageCommitReceiver.class);
                packageInstaller.commit(l.b(context, 0, intent, 0).getIntentSender());
                packageInstaller.close();
            }
            catch (Throwable throwable) {
                break block5;
            }
            packageInstaller.close();
            return;
        }
        if (packageInstaller != null) {
            packageInstaller.close();
        }
        throw var0_3;
    }

    private void d(List<ax.U2.f> object) {
        this.e = new HashMap();
        Iterator<ax.U2.f> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            this.e.put(((ax.U2.f)object).r(), new f(((ax.U2.f)object).q(), ((ax.U2.f)object).n()));
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d0(PackageInstaller packageInstaller, int n8, File object) throws IOException {
        RuntimeException var0_2;
        PackageInstaller.Session session;
        Closeable closeable;
        block12: {
            block11: {
                OutputStream outputStream;
                closeable = null;
                session = packageInstaller.openSession(n8);
                try {
                    outputStream = session.openWrite(((File)object).getName(), 0L, ((File)object).length());
                }
                catch (Throwable throwable) {
                    object = null;
                    break block12;
                }
                closeable = new FileInputStream((File)object);
                try {
                    F.b((InputStream)closeable, outputStream);
                    session.fsync(outputStream);
                    if (outputStream == null) break block11;
                }
                catch (Throwable throwable) {
                    block13: {
                        object = closeable;
                        break block13;
                        catch (Throwable throwable2) {
                            object = null;
                        }
                    }
                    closeable = outputStream;
                }
                outputStream.close();
            }
            ((FileInputStream)closeable).close();
            session.close();
            return;
            break block12;
            catch (Throwable throwable) {
                object = null;
                session = null;
            }
        }
        if (closeable != null) {
            ((OutputStream)closeable).close();
        }
        if (object != null) {
            ((FileInputStream)object).close();
        }
        if (session != null) {
            session.close();
        }
        throw var0_2;
    }

    public static void e(String object, String object2) throws IOException {
        try {
            com.voxdon.xplorer.file.o o8 = ax.c3.x.g((String)object);
            object = o8.z((String)object);
            object2 = o8.z((String)object2);
            if (object.isDirectory()) {
                if (!object2.n()) {
                    o8.k((n)object2, false);
                }
                for (n n8 : o8.f0((n)object)) {
                    ax.U2.d.e(n8.E(), d0.Q(((n)object2).E(), n8.B()));
                }
            } else {
                if (object2.n()) {
                    o8.P((n)object2);
                }
                o8.F((n)object, (n)object2, null, null);
            }
            o8.P((n)object);
            return;
        }
        catch (ax.b3.a | ax.b3.j exception) {
            exception.printStackTrace();
            return;
        }
    }

    public static g f0(k object, File iterator) throws ax.b3.j {
        Object object2 = new ax.B.b<String>();
        ((ax.B.b)object2).add("splits/base-master.apk");
        ((ax.B.b)object2).add("base.apk");
        ((ax.B.b)object2).add("icon.png");
        iterator = F.l((k)object, (File)((Object)iterator), object2);
        object = new g();
        if (iterator != null) {
            iterator = ((ax.B.b)((Object)iterator)).iterator();
            while (iterator.hasNext()) {
                object2 = (String)iterator.next();
                if ("icon.png".equals(object2)) {
                    ((g)object).b = object2;
                    continue;
                }
                ((g)object).a = object2;
            }
        }
        return object;
    }

    public static String g(String string) {
        return string.substring(14, string.lastIndexOf(47));
    }

    private void g0(HashMap<String, f> hashMap) {
    }

    public static List<ax.U2.f> h(List<ax.U2.f> object) {
        if (object == null) {
            return null;
        }
        ArrayList<ax.U2.f> arrayList = new ArrayList<ax.U2.f>();
        Iterator<ax.U2.f> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (((ax.U2.f)object).F()) continue;
            arrayList.add((ax.U2.f)object);
        }
        return arrayList;
    }

    private ax.U2.f j(List<ax.U2.f> object, String string) {
        object = object.iterator();
        while (object.hasNext()) {
            ax.U2.f f8 = (ax.U2.f)object.next();
            if (!f8.r().equals(string)) continue;
            return f8;
        }
        return null;
    }

    private static a k(Context object, y y8) {
        PackageManager packageManager = object.getPackageManager();
        y8 = packageManager.getPackageArchiveInfo((String)(object = y8.K0()), 0);
        if (y8 == null) {
            return null;
        }
        a a8 = new a();
        ApplicationInfo applicationInfo = ((PackageInfo)y8).applicationInfo;
        applicationInfo.sourceDir = object;
        applicationInfo.publicSourceDir = object;
        object = ((PackageInfo)y8).versionName;
        if (object == null) {
            object = "";
        }
        a8.b = object;
        a8.a = applicationInfo.loadLabel(packageManager).toString();
        a8.c = ((PackageInfo)y8).packageName;
        a8.d = ax.U2.d.L((PackageInfo)y8);
        return a8;
    }

    private static a l(ApkPlusInfo apkPlusInfo) {
        a a8 = new a();
        String string = apkPlusInfo.version_name;
        if (string == null) {
            string = "";
        }
        a8.b = string;
        a8.a = apkPlusInfo.app_name;
        a8.c = apkPlusInfo.package_name;
        a8.d = apkPlusInfo.version_code;
        return a8;
    }

    public static e m(k object) {
        if ((object = ax.U2.d.n((k)object)) == null) {
            return null;
        }
        return new e(((ApkPlusInfo)object).package_name, ((ApkPlusInfo)object).version_code);
    }

    public static ApkPlusInfo n(k object) {
        Object object2;
        block3: {
            object2 = F.g((k)object, "apk+.json");
            if (object2 != null) break block3;
            return null;
        }
        try {
            object = new String((byte[])object2);
            object2 = new Gson;
            ((Gson)object2)();
            object = ((Gson)object2).k((String)object, ApkPlusInfo.class);
            return object;
        }
        catch (ax.b3.j | r | NullPointerException exception) {
            return null;
        }
    }

    private static int o(String string) {
        if (string == null) {
            return 100;
        }
        if (string.contains("base.apk")) {
            return 0;
        }
        if (!string.contains("split") && !string.contains("config")) {
            if (string.contains("base")) {
                return 1;
            }
            return 2;
        }
        return 10;
    }

    private static InputStream p(Context context, String string) {
        PackageInfo packageInfo = (context = context.getPackageManager()).getPackageArchiveInfo(string, 0);
        if (packageInfo == null) {
            return null;
        }
        packageInfo = packageInfo.applicationInfo;
        packageInfo.sourceDir = string;
        packageInfo.publicSourceDir = string;
        if ((context = packageInfo.loadIcon((PackageManager)context)) == null) {
            return null;
        }
        context = context instanceof BitmapDrawable ? ((BitmapDrawable)context).getBitmap() : z.e((Drawable)context);
        return new ByteArrayInputStream(z.d((Bitmap)context));
    }

    public static a q(Context context, y y8) {
        if (ax.U2.d.U(y8.A())) {
            return ax.U2.d.s(context, y8);
        }
        return ax.U2.d.k(context, y8);
    }

    public static InputStream r(Context context, String string) {
        if (ax.U2.d.U(d0.k(string))) {
            return ax.U2.d.t(context, string);
        }
        return ax.U2.d.p(context, string);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static a s(Context object, y object2) {
        Throwable throwable222222;
        File file;
        block13: {
            block12: {
                Object object3;
                block11: {
                    block10: {
                        file = new File(ax.Z2.a.m(object, "apks-tmp"), String.valueOf(((n)object2).E().hashCode()));
                        ax.Z2.a.f(file, true);
                        if (!ax.U2.d.P(((n)object2).A())) break block10;
                        object3 = ax.U2.d.n((k)object2);
                        if (object3 == null) break block11;
                        object = ax.U2.d.l((ApkPlusInfo)object3);
                        ax.Z2.a.f(file, true);
                        return object;
                    }
                    if (!ax.U2.d.V(((n)object2).A()) || (object3 = ax.U2.d.M((k)object2)) == null) break block11;
                    object = ax.U2.d.l((ApkPlusInfo)object3);
                    ax.Z2.a.f(file, true);
                    return object;
                }
                object2 = ax.U2.d.f0((k)object2, file);
                object3 = ((g)object2).a;
                if (object3 != null) break block12;
                ax.Z2.a.f(file, true);
                return null;
            }
            try {
                object2 = d0.Q(file.getAbsolutePath(), ((g)object2).a);
                try {
                    object = ax.U2.d.k(object, y.I0((String)object2));
                }
                catch (ax.b3.j j8) {
                    ax.Z2.a.f(file, true);
                    return null;
                }
                ax.Z2.a.f(file, true);
                return object;
            }
            catch (Throwable throwable222222) {
                break block13;
            }
            catch (ax.b3.j j9) {}
            {
                j9.printStackTrace();
            }
            ax.Z2.a.f(file, true);
            return null;
        }
        ax.Z2.a.f(file, true);
        throw throwable222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static InputStream t(Context var0, String var1_3) {
        block9: {
            block10: {
                var3_4 = new File(ax.Z2.a.m(var0 /* !! */ , "apks-tmp"), String.valueOf(var1_3.hashCode()));
                var4_5 = y.I0((String)var1_3);
                if (ax.U2.d.N(d0.k((String)var1_3)) && (var1_3 = (Object)F.g((k)var4_5, "icon.png")) != null) {
                    var0 /* !! */  = new ByteArrayInputStream((byte[])var1_3);
                }
                ** GOTO lbl15
                {
                    catch (Throwable var0_1) {
                        break block9;
                    }
                    catch (ax.b3.j var0_2) {
                        ** GOTO lbl-1000
                    }
                    ax.Z2.a.f(var3_4, true);
                    return var0 /* !! */ ;
lbl15:
                    // 1 sources

                    ax.Z2.a.f(var3_4, true);
                    var1_3 = ax.U2.d.f0((k)var4_5, var3_4);
                    if (var1_3.b == null || !(var2_8 = (var4_5 = new File((String)(var5_7 = d0.Q(var3_4.getAbsolutePath(), var1_3.b)))).exists())) ** GOTO lbl30
                    try {
                        var5_7 = new FileInputStream((File)var4_5);
                        var4_5 = new ByteArrayOutputStream();
                        F.b((InputStream)var5_7, (OutputStream)var4_5);
                        var4_5 = new ByteArrayInputStream(var4_5.toByteArray());
                    }
                    catch (IOException var4_6) {}
                    ax.Z2.a.f(var3_4, true);
                    return var4_5;
                    {
                        var4_6.printStackTrace();
lbl30:
                        // 2 sources

                        if (var1_3.a == null || !(var4_5 = new File((String)(var1_3 = d0.Q(var3_4.getAbsolutePath(), var1_3.a)))).exists()) break block10;
                        var0 /* !! */  = ax.U2.d.p(var0 /* !! */ , (String)var1_3);
                    }
                }
                ax.Z2.a.f(var3_4, true);
                return var0 /* !! */ ;
            }
            ax.Z2.a.f(var3_4, true);
            return null;
lbl-1000:
            // 1 sources

            {
                var0_2.printStackTrace();
            }
            ax.Z2.a.f(var3_4, true);
            return null;
        }
        ax.Z2.a.f(var3_4, true);
        throw var0_1;
    }

    public static K u(Context context) {
        if (ax.t3.j.H(context) && ax.U2.d.T()) {
            return K.f;
        }
        return K.e;
    }

    private File w() {
        File file = ax.Q2.e.w(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("appcache_");
        stringBuilder.append(Locale.getDefault().toString());
        return new File(file, stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<ax.U2.f> B() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                List<ax.U2.f> list;
                block4: {
                    try {
                        list = this.d.i("APPS_BASE");
                        if (list == null || list.size() == 0) break block4;
                        if (this.c.size() <= 0) return new ArrayList<ax.U2.f>(list);
                        Iterator<Intent> iterator = this.c.iterator();
                        while (iterator.hasNext()) {
                            this.X(list, iterator.next());
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.c.clear();
                    return new ArrayList<ax.U2.f>(list);
                }
                this.c.clear();
                list = this.A();
                this.d.n("APPS_BASE", list);
                return new ArrayList<ax.U2.f>(list);
            }
            throw throwable2;
        }
    }

    public long C(StorageStats storageStats) {
        return ax.U2.c.a(storageStats);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<ax.U2.f> D(String string) {
        List<ax.U2.f> list = this.d.i(string);
        if (list != null && list.size() != 0) {
            return new ArrayList<ax.U2.f>(list);
        }
        Object object = this.B();
        list = object;
        if ("APPS_DOWNLOADED".equals(string)) {
            list = ax.U2.d.h(object);
        }
        this.d.n(string, new ArrayList<ax.U2.f>(list));
        if (this.e == null) {
            object = this.f;
            synchronized (object) {
                this.e = this.Y();
            }
        }
        Iterator<ax.U2.f> iterator = list.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            ax.U2.f f8 = iterator.next();
            object = this.f;
            synchronized (object) {
                if (f8.a(this.e)) {
                    bl = true;
                }
            }
        }
        if ("APPS_ALL".equals(string) && bl) {
            object = this.f;
            synchronized (object) {
                this.d(list);
                this.g0(this.e);
            }
        }
        this.g.put(string, Boolean.TRUE);
        return list;
    }

    public int G(boolean bl) {
        List<ax.U2.f> list = this.B();
        if (bl) {
            return list.size();
        }
        return ax.U2.d.h(list).size();
    }

    public long I(boolean bl) {
        Object object;
        Object object2 = object = this.B();
        if (!bl) {
            object2 = ax.U2.d.h(object);
        }
        if (o.d(this.b)) {
            ax.U2.d.F(this.b).i((List<ax.U2.f>)object2, false);
        }
        object2 = object2.iterator();
        long l8 = 0L;
        while (object2.hasNext()) {
            object = (ax.U2.f)object2.next();
            try {
                long l9 = ((ax.U2.f)object).s();
                l8 += l9;
            }
            catch (NullPointerException nullPointerException) {
                ax.Ha.c.h().d("AHFLNULL!!:").l(nullPointerException).h();
            }
        }
        return l8;
    }

    public InputStream J(Uri object) {
        String string = object.getPath();
        if ("apk".equals(object.getAuthority())) {
            return ax.U2.d.r(this.b, string);
        }
        object = this.x(string.substring(1));
        if (object != null && (object = ax.U2.d.E((ax.U2.f)object)) != null) {
            return new ByteArrayInputStream(z.d((Bitmap)object));
        }
        return null;
    }

    public boolean R(String object) {
        if ((object = this.g.get(object)) == null) {
            return false;
        }
        return (Boolean)object;
    }

    public boolean W() {
        return false;
    }

    public void Z() {
        File file = this.w();
        if (file.exists()) {
            file.delete();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b0(Intent object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.c.add((Intent)object.clone());
                        object = this.d.i("APPS_BASE");
                        this.d.b();
                        if (object == null) break block4;
                        this.d.n("APPS_BASE", (List<ax.U2.f>)object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<ax.U2.f> e0(List<ax.U2.f> list, String object) {
        Comparator<ax.U2.f> comparator = ax.U2.f.d((String)object);
        if (comparator != null) {
            IllegalArgumentException illegalArgumentException2;
            block7: {
                block6: {
                    try {
                        if (!ax.U2.f.D((String)object)) break block6;
                        object = this.i;
                        synchronized (object) {
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        break block7;
                    }
                    {
                        Collections.sort(list, comparator);
                        return list;
                    }
                }
                Collections.sort(list, comparator);
                return list;
            }
            ax.Ha.c.h().f().b("APPINFO SORT ERROR").l(illegalArgumentException2).h();
        }
        return list;
    }

    public void f() {
        File file = this.v();
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /*
     * Exception decompiling
     */
    public void i(List<ax.U2.f> var1_1, boolean var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [9, 6, 7, 8 : 106->130)] java.lang.Throwable
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

    public File v() {
        String string = ax.U2.d.u(this.b) == K.f ? ax.Z2.j.F().T() : ax.Z2.j.F().O();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/backups/apps");
        return new File(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ax.U2.f x(String object) {
        Object object2 = this.d.i("APPS_BASE");
        if (object2 != null && object2.size() != 0) {
            synchronized (this) {
                try {
                    ax.U2.f f8;
                    object2 = object2.iterator();
                    do {
                        if (!object2.hasNext()) return null;
                    } while (!((String)object).equals((f8 = (ax.U2.f)object2.next()).r()));
                    return f8;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
        object2 = this.b.getPackageManager();
        try {
            object = object2.getPackageInfo((String)object, 0);
            if (object == null) return null;
            if (((PackageInfo)object).applicationInfo == null) return null;
            return new ax.U2.f((PackageManager)object2, (PackageInfo)object);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    public Map<String, e> y() {
        File[] fileArray;
        HashMap<String, e> hashMap = new HashMap<String, e>();
        Object object = this.v();
        if (((File)object).exists() && ((File)object).isDirectory() && (fileArray = ((File)object).listFiles(new FilenameFilter(this){
            final d q;
            {
                this.q = d8;
            }

            @Override
            public boolean accept(File file, String string) {
                return ax.U2.d.S(d0.j(string));
            }
        })) != null) {
            PackageManager packageManager = this.b.getPackageManager();
            for (File file : fileArray) {
                String string = d0.j(file.getName());
                String string2 = file.getAbsolutePath();
                object = new StringBuilder();
                ((StringBuilder)object).append(file.getAbsolutePath());
                ((StringBuilder)object).append("-");
                ((StringBuilder)object).append(file.lastModified());
                String string3 = ((StringBuilder)object).toString();
                e e8 = this.h.get(string3);
                object = e8;
                if (e8 == null) {
                    if (ax.U2.d.P(string)) {
                        e8 = ax.U2.d.m(x.O0(file));
                        object = e8;
                        if (e8 != null) {
                            this.h.put(string3, e8);
                            object = e8;
                        }
                    } else {
                        file = packageManager.getPackageArchiveInfo(string2, 0);
                        object = e8;
                        if (file != null) {
                            long l8 = ax.U2.d.L((PackageInfo)file);
                            object = new e(((PackageInfo)file).packageName, l8);
                            this.h.put(string3, (e)object);
                        }
                    }
                }
                if (object == null || (e8 = (e)hashMap.get(((e)object).a)) != null && e8.b >= ((e)object).b) continue;
                hashMap.put(((e)object).a, (e)object);
            }
        }
        return hashMap;
    }

    public File z(ax.U2.f object) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(((ax.U2.f)object).q());
        charSequence.append(" ");
        charSequence.append(((ax.U2.f)object).x());
        charSequence = d0.b(charSequence.toString());
        object = ((ax.U2.f)object).E() ? "apk+" : d0.f(((ax.U2.f)object).f().getName());
        File file = this.v();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(".");
        stringBuilder.append((String)object);
        return new File(file, stringBuilder.toString());
    }

    public static class d
    extends q<Void, Void, Void> {
        Context h;

        public d(Context context) {
            super(q.e.g0);
            this.h = context;
        }

        protected Void w(Void ... voidArray) {
            j.fine("start caching app name");
            ax.U2.d.F(this.h).D("APPS_ALL");
            return null;
        }
    }

    public static class e {
        public String a;
        public long b;

        public e(String string, long l8) {
            this.a = string;
            this.b = l8;
        }
    }

    public static class f {
        String a;
        long b;

        f(String string, long l8) {
            this.a = string;
            this.b = l8;
        }

        public long a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    public static class g {
        public String a;
        public String b;
    }
}

