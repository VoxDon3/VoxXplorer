/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import ax.J7.A;
import ax.J7.C;
import ax.J7.F;
import ax.J7.G;
import ax.J7.S;
import ax.J7.Z;
import ax.J7.g;
import ax.J7.h;
import ax.J7.i;
import ax.J7.m;
import ax.J7.n;
import ax.J7.o;
import ax.J7.r;
import ax.J7.s;
import ax.J7.v;
import ax.J7.x;
import ax.J7.y;
import ax.K7.e;
import ax.L7.F;
import ax.L7.G;
import ax.j6.j;
import ax.j6.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

class p {
    static final FilenameFilter t = new o();
    private final Context a;
    private final x b;
    private final s c;
    private final ax.K7.m d;
    private final n e;
    private final C f;
    private final ax.O7.g g;
    private final ax.J7.a h;
    private final e i;
    private final ax.G7.a j;
    private final ax.H7.a k;
    private final m l;
    private final S m;
    private v n;
    private ax.Q7.i o = null;
    final k<Boolean> p = new k();
    final k<Boolean> q = new k();
    final k<Void> r = new k();
    final AtomicBoolean s = new AtomicBoolean(false);

    p(Context context, n n8, C c8, x x8, ax.O7.g g8, s s8, ax.J7.a a8, ax.K7.m m8, e e8, S s9, ax.G7.a a9, ax.H7.a a10, m m9) {
        this.a = context;
        this.e = n8;
        this.f = c8;
        this.b = x8;
        this.g = g8;
        this.c = s8;
        this.h = a8;
        this.d = m8;
        this.i = e8;
        this.j = a9;
        this.k = a10;
        this.l = m9;
        this.m = s9;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private String B() {
        SortedSet<String> sortedSet = this.m.o();
        if (!sortedSet.isEmpty()) {
            return sortedSet.first();
        }
        return null;
    }

    private static long C() {
        return ax.J7.p.F(System.currentTimeMillis());
    }

    static List<F> D(ax.G7.h h8, String object, ax.O7.g object2, byte[] byArray) {
        File file = ((ax.O7.g)object2).q((String)object, "user-data");
        File file2 = ((ax.O7.g)object2).q((String)object, "keys");
        object2 = ((ax.O7.g)object2).q((String)object, "rollouts-state");
        object = new ArrayList();
        object.add(new g("logs_file", "logs", byArray));
        object.add(new A("crash_meta_file", "metadata", h8.g()));
        object.add(new A("session_meta_file", "session", h8.f()));
        object.add(new A("app_meta_file", "app", h8.a()));
        object.add(new A("device_meta_file", "device", h8.c()));
        object.add(new A("os_meta_file", "os", h8.b()));
        object.add(ax.J7.p.O(h8));
        object.add(new A("user_meta_file", "user", file));
        object.add(new A("keys_file", "keys", file2));
        object.add(new A("rollouts_file", "rollouts", (File)object2));
        return object;
    }

    private InputStream E(String object) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        if (classLoader == null) {
            ax.G7.g.f().k("Couldn't get Class Loader");
            return null;
        }
        if ((object = classLoader.getResourceAsStream((String)object)) == null) {
            ax.G7.g.f().g("No version control information found");
            return null;
        }
        return object;
    }

    private static long F(long l8) {
        return l8 / 1000L;
    }

    private j<Void> L(long l8) {
        if (ax.J7.p.A()) {
            ax.G7.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return ax.j6.m.e(null);
        }
        ax.G7.g.f().b("Logging app exception event to Firebase Analytics");
        return ax.j6.m.c(new ScheduledThreadPoolExecutor(1), new Callable<Void>(){
            final long a;
            final p b;
            {
                this.b = p8;
                this.a = l8;
            }

            public Void a() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", this.a);
                this.b.k.a("_ae", bundle);
                return null;
            }
        });
    }

    private j<Void> M() {
        ArrayList<j<Void>> arrayList = new ArrayList<j<Void>>();
        for (File file : this.K()) {
            try {
                arrayList.add(this.L(Long.parseLong(file.getName().substring(3))));
            }
            catch (NumberFormatException numberFormatException) {
                ax.G7.g g8 = ax.G7.g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not parse app exception timestamp from file ");
                stringBuilder.append(file.getName());
                g8.k(stringBuilder.toString());
            }
            file.delete();
        }
        return ax.j6.m.f(arrayList);
    }

    private static boolean N(String string, File file, F.a a8) {
        Object object;
        Object object2;
        if (file == null || !file.exists()) {
            object2 = ax.G7.g.f();
            object = new StringBuilder();
            ((StringBuilder)object).append("No minidump data found for session ");
            ((StringBuilder)object).append(string);
            ((ax.G7.g)object2).k(((StringBuilder)object).toString());
        }
        if (a8 == null) {
            object = ax.G7.g.f();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("No Tombstones data found for session ");
            ((StringBuilder)object2).append(string);
            ((ax.G7.g)object).g(((StringBuilder)object2).toString());
        }
        return (file == null || !file.exists()) && a8 == null;
    }

    private static F O(ax.G7.h object) {
        if ((object = object.e()) != null && ((File)object).exists()) {
            return new A("minidump_file", "minidump", (File)object);
        }
        return new g("minidump_file", "minidump", new byte[]{0});
    }

    private static byte[] Q(InputStream inputStream) throws IOException {
        int n8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        while ((n8 = inputStream.read(byArray)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n8);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private j<Boolean> V() {
        if (this.b.d()) {
            ax.G7.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e(Boolean.FALSE);
            return ax.j6.m.e(Boolean.TRUE);
        }
        ax.G7.g.f().b("Automatic data collection is disabled.");
        ax.G7.g.f().i("Notifying that unsent reports are available.");
        this.p.e(Boolean.TRUE);
        j<Boolean> j8 = this.b.j().n(new ax.j6.i<Void, Boolean>(this){
            final p a;
            {
                this.a = p8;
            }

            public j<Boolean> b(Void void_) throws Exception {
                return ax.j6.m.e(Boolean.TRUE);
            }
        });
        ax.G7.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return Z.i(j8, this.q.a());
    }

    private void W(String charSequence) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30) {
            List list = ax.L2.e.a((ActivityManager)this.a.getSystemService("activity"), null, 0, 0);
            if (list.size() != 0) {
                e e8 = new e(this.g, (String)charSequence);
                ax.K7.m m8 = ax.K7.m.i((String)charSequence, this.g, this.e);
                this.m.u((String)charSequence, list, e8, m8);
                return;
            }
            ax.G7.g g8 = ax.G7.g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No ApplicationExitInfo available. Session: ");
            stringBuilder.append((String)charSequence);
            g8.i(stringBuilder.toString());
            return;
        }
        ax.G7.g g9 = ax.G7.g.f();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("ANR feature enabled, but device is API ");
        ((StringBuilder)charSequence).append(n8);
        g9.i(((StringBuilder)charSequence).toString());
    }

    public static /* synthetic */ boolean a(File file, String string) {
        return string.startsWith(".ae");
    }

    private static G.a o(C c8, ax.J7.a a8) {
        return G.a.b(c8.f(), a8.f, a8.g, c8.a().c(), y.h(a8.d).j(), a8.h);
    }

    private static G.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long l8 = statFs.getBlockCount();
        long l9 = statFs.getBlockSize();
        return G.b.c(ax.J7.i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), ax.J7.i.b(context), l8 * l9, ax.J7.i.w(), ax.J7.i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c q() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, ax.J7.i.x());
    }

    private static void r(List<File> object) {
        object = object.iterator();
        while (object.hasNext()) {
            ((File)object.next()).delete();
        }
    }

    private void u(boolean n8, ax.Q7.i object) {
        ArrayList<String> arrayList = new ArrayList<String>(this.m.o());
        if (arrayList.size() <= n8) {
            ax.G7.g.f().i("No open sessions to be closed.");
            return;
        }
        String string = (String)arrayList.get(n8);
        if (object.b().b.b) {
            this.W(string);
        } else {
            ax.G7.g.f().i("ANR feature disabled.");
        }
        if (this.j.c(string)) {
            this.y(string);
        }
        if (n8 != 0) {
            object = (String)arrayList.get(0);
        } else {
            this.l.e(null);
            object = null;
        }
        this.m.k(ax.J7.p.C(), (String)object);
    }

    private void v(String string, Boolean bl) {
        long l8 = ax.J7.p.C();
        Object object = ax.G7.g.f();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("Opening a new session with ID ");
        ((StringBuilder)object2).append(string);
        ((ax.G7.g)object).b(((StringBuilder)object2).toString());
        String string2 = String.format(Locale.US, "Crashlytics Android SDK/%s", ax.J7.r.i());
        object2 = ax.J7.p.o(this.f, this.h);
        object = ax.J7.p.q();
        G.b b8 = ax.J7.p.p(this.a);
        this.j.d(string, string2, l8, ax.L7.G.b((G.a)object2, (G.c)object, b8));
        if (bl.booleanValue() && string != null) {
            this.d.m(string);
        }
        this.i.e(string);
        this.l.e(string);
        this.m.p(string, l8);
    }

    private void w(long l8) {
        try {
            ax.O7.g g8 = this.g;
            Serializable serializable = new StringBuilder();
            serializable.append(".ae");
            serializable.append(l8);
            if (!g8.g(serializable.toString()).createNewFile()) {
                serializable = new IOException("Create new file failed.");
                throw serializable;
            }
        }
        catch (IOException iOException) {
            ax.G7.g.f().l("Could not create app exception marker file.", iOException);
        }
    }

    private void y(String string) {
        Object object = ax.G7.g.f();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("Finalizing native report for session ");
        ((StringBuilder)object2).append(string);
        ((ax.G7.g)object).i(((StringBuilder)object2).toString());
        Object object3 = this.j.a(string);
        object = object3.e();
        object2 = object3.d();
        if (ax.J7.p.N(string, (File)object, (F.a)object2)) {
            ax.G7.g.f().k("No native core present");
            return;
        }
        long l8 = ((File)object).lastModified();
        e e8 = new e(this.g, string);
        object = this.g.k(string);
        if (!((File)object).isDirectory()) {
            ax.G7.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        this.w(l8);
        object3 = ax.J7.p.D((ax.G7.h)object3, string, this.g, e8.b());
        G.b((File)object, (List<F>)object3);
        ax.G7.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.m.j(string, (List<F>)object3, (F.a)object2);
        e8.a();
    }

    String G() throws IOException {
        InputStream inputStream = this.E("META-INF/version-control-info.textproto");
        if (inputStream == null) {
            return null;
        }
        ax.G7.g.f().b("Read version control info");
        return Base64.encodeToString((byte[])ax.J7.p.Q(inputStream), (int)0);
    }

    void H(ax.Q7.i i8, Thread thread, Throwable throwable) {
        this.I(i8, thread, throwable, false);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void I(ax.Q7.i j8, Thread thread, Throwable throwable, boolean bl) {
        synchronized (this) {
            RuntimeException var1_3;
            block9: {
                block8: {
                    long l8;
                    Callable<j<Void>> callable;
                    Object object;
                    try {
                        object = ax.G7.g.f();
                        callable = new StringBuilder();
                        ((StringBuilder)((Object)callable)).append("Handling uncaught exception \"");
                        ((StringBuilder)((Object)callable)).append(throwable);
                        ((StringBuilder)((Object)callable)).append("\" from thread ");
                        ((StringBuilder)((Object)callable)).append(thread.getName());
                        ((ax.G7.g)object).b(((StringBuilder)((Object)callable)).toString());
                        l8 = System.currentTimeMillis();
                        object = this.e;
                    }
                    catch (Throwable throwable2) {}
                    try {
                        callable = new Callable<j<Void>>(){
                            final long a;
                            final Throwable b;
                            final Thread c;
                            final ax.Q7.i d;
                            final boolean e;
                            final p f;
                            {
                                this.f = p8;
                                this.a = l8;
                                this.b = throwable;
                                this.c = thread;
                                this.d = i8;
                                this.e = bl;
                            }

                            public j<Void> a() throws Exception {
                                long l8 = ax.J7.p.F(this.a);
                                String string = this.f.B();
                                if (string == null) {
                                    ax.G7.g.f().d("Tried to write a fatal exception while no session was open.");
                                    return ax.j6.m.e(null);
                                }
                                this.f.c.a();
                                this.f.m.s(this.b, this.c, string, l8);
                                this.f.w(this.a);
                                this.f.t(this.d);
                                this.f.v(new h(this.f.f).toString(), this.e);
                                if (!this.f.b.d()) {
                                    return ax.j6.m.e(null);
                                }
                                Executor executor = this.f.e.c();
                                return this.d.a().o(executor, new ax.j6.i<ax.Q7.d, Void>(){
                                    final Executor a;
                                    final String b;
                                    final b c;
                                    {
                                        this.c = b8;
                                        this.a = executor;
                                        this.b = string;
                                    }

                                    public j<Void> b(ax.Q7.d object) throws Exception {
                                        Object var2_2 = null;
                                        if (object == null) {
                                            ax.G7.g.f().k("Received null app settings, cannot send reports at crash time.");
                                            return ax.j6.m.e(null);
                                        }
                                        j j8 = this.c.f.M();
                                        S s8 = this.c.f.m;
                                        Executor executor = this.a;
                                        object = var2_2;
                                        if (this.c.e) {
                                            object = this.b;
                                        }
                                        return ax.j6.m.g(j8, s8.x(executor, (String)object));
                                    }
                                });
                            }
                        };
                        j8 = ((n)object).i(callable);
                        Z.f(j8);
                        break block8;
                    }
                    catch (Throwable throwable3) {
                        break block9;
                    }
                    catch (Exception exception) {
                        ax.G7.g.f().e("Error handling uncaught exception", exception);
                    }
                    catch (TimeoutException timeoutException) {
                        ax.G7.g.f().d("Cannot send reports. Timed out while fetching settings.");
                    }
                }
                return;
            }
            throw var1_3;
        }
    }

    boolean J() {
        v v8 = this.n;
        return v8 != null && v8.a();
    }

    List<File> K() {
        return this.g.h(t);
    }

    void P(String string) {
        this.e.h(new Callable<Void>(){
            final String a;
            final p b;
            {
                this.b = p8;
                this.a = string;
            }

            public Void a() throws Exception {
                this.b.v(this.a, Boolean.FALSE);
                return null;
            }
        });
    }

    void R() {
        block3: {
            String string = this.G();
            if (string == null) break block3;
            try {
                this.T("com.crashlytics.version-control-info", string);
                ax.G7.g.f().g("Saved version control info");
                return;
            }
            catch (IOException iOException) {
                ax.G7.g.f().l("Unable to save version control info", iOException);
            }
        }
    }

    void S(String string, String string2) {
        try {
            this.d.k(string, string2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string = this.a;
            if (string != null && ax.J7.i.u((Context)string)) {
                throw illegalArgumentException;
            }
            ax.G7.g.f().d("Attempting to set custom attribute with null key, ignoring.");
            return;
        }
    }

    void T(String string, String string2) {
        try {
            this.d.l(string, string2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string = this.a;
            if (string != null && ax.J7.i.u((Context)string)) {
                throw illegalArgumentException;
            }
            ax.G7.g.f().d("Attempting to set custom attribute with null key, ignoring.");
            return;
        }
    }

    @SuppressLint(value={"TaskMainThread"})
    j<Void> U(j<ax.Q7.d> j8) {
        if (!this.m.n()) {
            ax.G7.g.f().i("No crash reports are available to be sent.");
            this.p.e(Boolean.FALSE);
            return ax.j6.m.e(null);
        }
        ax.G7.g.f().i("Crash reports are available to be sent.");
        return this.V().n(new ax.j6.i<Boolean, Void>(){
            final j a;
            final p b;
            {
                this.b = p8;
                this.a = j8;
            }

            public j<Void> b(Boolean bl) throws Exception {
                return this.b.e.i(new Callable<j<Void>>(){
                    final Boolean a;
                    final d b;
                    {
                        this.b = d8;
                        this.a = bl;
                    }

                    public j<Void> a() throws Exception {
                        if (!this.a.booleanValue()) {
                            ax.G7.g.f().i("Deleting cached crash reports...");
                            ax.J7.p.r(this.b.b.K());
                            this.b.b.m.v();
                            this.b.b.r.e(null);
                            return ax.j6.m.e(null);
                        }
                        ax.G7.g.f().b("Sending cached crash reports...");
                        boolean bl = this.a;
                        this.b.b.b.c(bl);
                        Executor executor = this.b.b.e.c();
                        return this.b.a.o(executor, new ax.j6.i<ax.Q7.d, Void>(){
                            final Executor a;
                            final a b;
                            {
                                this.b = a8;
                                this.a = executor;
                            }

                            public j<Void> b(ax.Q7.d d8) throws Exception {
                                if (d8 == null) {
                                    ax.G7.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                                    return ax.j6.m.e(null);
                                }
                                this.b.b.b.M();
                                this.b.b.b.m.w(this.a);
                                this.b.b.b.r.e(null);
                                return ax.j6.m.e(null);
                            }
                        });
                    }
                });
            }
        });
    }

    void X(Thread thread, Throwable throwable) {
        long l8 = System.currentTimeMillis();
        this.e.g(new Runnable(){
            final Throwable c0;
            final Thread d0;
            final p e0;
            final long q;
            {
                this.e0 = p8;
                this.q = l8;
                this.c0 = throwable;
                this.d0 = thread;
            }

            @Override
            public void run() {
                if (!this.e0.J()) {
                    long l8 = ax.J7.p.F(this.q);
                    String string = this.e0.B();
                    if (string == null) {
                        ax.G7.g.f().k("Tried to write a non-fatal exception while no session was open.");
                        return;
                    }
                    this.e0.m.t(this.c0, this.d0, string, l8);
                }
            }
        });
    }

    void Y(long l8, String string) {
        this.e.h(new Callable<Void>(){
            final long a;
            final String b;
            final p c;
            {
                this.c = p8;
                this.a = l8;
                this.b = string;
            }

            public Void a() throws Exception {
                if (!this.c.J()) {
                    this.c.i.g(this.a, this.b);
                }
                return null;
            }
        });
    }

    boolean s() {
        if (!this.c.c()) {
            String string = this.B();
            return string != null && this.j.c(string);
        }
        ax.G7.g.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void t(ax.Q7.i i8) {
        this.u(false, i8);
    }

    void x(String object, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ax.Q7.i i8) {
        this.o = i8;
        this.P((String)object);
        this.n = object = new v(new v.a(this){
            final p a;
            {
                this.a = p8;
            }

            @Override
            public void a(ax.Q7.i i8, Thread thread, Throwable throwable) {
                this.a.H(i8, thread, throwable);
            }
        }, i8, uncaughtExceptionHandler, this.j);
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
    }

    boolean z(ax.Q7.i i8) {
        this.e.b();
        if (this.J()) {
            ax.G7.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        ax.G7.g.f().i("Finalizing previously open sessions.");
        try {
            this.u(true, i8);
            ax.G7.g.f().i("Closed all previously open sessions.");
            return true;
        }
        catch (Exception exception) {
            ax.G7.g.f().e("Unable to finalize previously open sessions.", exception);
            return false;
        }
    }
}

