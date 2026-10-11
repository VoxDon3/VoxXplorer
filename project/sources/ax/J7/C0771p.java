package ax.J7;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import ax.J7.C0776v;
import ax.L7.F;
import ax.L7.G;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import ax.j6.InterfaceC2326i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.J7.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0771p {
    static final FilenameFilter t = new FilenameFilter() { // from class: ax.J7.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith(".ae");
            return startsWith;
        }
    };
    private final Context a;
    private final C0778x b;
    private final C0773s c;
    private final ax.K7.m d;
    private final C0769n e;
    private final C f;
    private final ax.O7.g g;
    private final C0756a h;
    private final ax.K7.e i;
    private final ax.G7.a j;
    private final ax.H7.a k;
    private final C0768m l;
    private final S m;
    private C0776v n;
    private ax.Q7.i o = null;
    final C2328k<Boolean> p = new C2328k<>();
    final C2328k<Boolean> q = new C2328k<>();
    final C2328k<Void> r = new C2328k<>();
    final AtomicBoolean s = new AtomicBoolean(false);

    /* renamed from: ax.J7.p$a */
    class a implements C0776v.a {
        a() {
        }

        @Override // ax.J7.C0776v.a
        public void a(ax.Q7.i iVar, Thread thread, Throwable th) {
            C0771p.this.H(iVar, thread, th);
        }
    }

    /* renamed from: ax.J7.p$b */
    class b implements Callable<AbstractC2327j<Void>> {
        final /* synthetic */ long a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;
        final /* synthetic */ ax.Q7.i d;
        final /* synthetic */ boolean e;

        /* renamed from: ax.J7.p$b$a */
        class a implements InterfaceC2326i<ax.Q7.d, Void> {
            final /* synthetic */ Executor a;
            final /* synthetic */ String b;

            a(Executor executor, String str) {
                this.a = executor;
                this.b = str;
            }

            @Override // ax.j6.InterfaceC2326i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC2327j<Void> a(ax.Q7.d dVar) throws Exception {
                if (dVar != null) {
                    return ax.j6.m.g(C0771p.this.M(), C0771p.this.m.x(this.a, b.this.e ? this.b : null));
                }
                ax.G7.g.f().k("Received null app settings, cannot send reports at crash time.");
                return ax.j6.m.e(null);
            }
        }

        b(long j, Throwable th, Thread thread, ax.Q7.i iVar, boolean z) {
            this.a = j;
            this.b = th;
            this.c = thread;
            this.d = iVar;
            this.e = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2327j<Void> call() throws Exception {
            long F = C0771p.F(this.a);
            String B = C0771p.this.B();
            if (B == null) {
                ax.G7.g.f().d("Tried to write a fatal exception while no session was open.");
                return ax.j6.m.e(null);
            }
            C0771p.this.c.a();
            C0771p.this.m.s(this.b, this.c, B, F);
            C0771p.this.w(this.a);
            C0771p.this.t(this.d);
            C0771p.this.v(new C0763h(C0771p.this.f).toString(), Boolean.valueOf(this.e));
            if (!C0771p.this.b.d()) {
                return ax.j6.m.e(null);
            }
            Executor c = C0771p.this.e.c();
            return this.d.a().o(c, new a(c, B));
        }
    }

    /* renamed from: ax.J7.p$c */
    class c implements InterfaceC2326i<Void, Boolean> {
        c() {
        }

        @Override // ax.j6.InterfaceC2326i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC2327j<Boolean> a(Void r1) throws Exception {
            return ax.j6.m.e(Boolean.TRUE);
        }
    }

    /* renamed from: ax.J7.p$d */
    class d implements InterfaceC2326i<Boolean, Void> {
        final /* synthetic */ AbstractC2327j a;

        /* renamed from: ax.J7.p$d$a */
        class a implements Callable<AbstractC2327j<Void>> {
            final /* synthetic */ Boolean a;

            /* renamed from: ax.J7.p$d$a$a, reason: collision with other inner class name */
            class C0097a implements InterfaceC2326i<ax.Q7.d, Void> {
                final /* synthetic */ Executor a;

                C0097a(Executor executor) {
                    this.a = executor;
                }

                @Override // ax.j6.InterfaceC2326i
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public AbstractC2327j<Void> a(ax.Q7.d dVar) throws Exception {
                    if (dVar == null) {
                        ax.G7.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                        return ax.j6.m.e(null);
                    }
                    C0771p.this.M();
                    C0771p.this.m.w(this.a);
                    C0771p.this.r.e(null);
                    return ax.j6.m.e(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC2327j<Void> call() throws Exception {
                if (this.a.booleanValue()) {
                    ax.G7.g.f().b("Sending cached crash reports...");
                    C0771p.this.b.c(this.a.booleanValue());
                    Executor c = C0771p.this.e.c();
                    return d.this.a.o(c, new C0097a(c));
                }
                ax.G7.g.f().i("Deleting cached crash reports...");
                C0771p.r(C0771p.this.K());
                C0771p.this.m.v();
                C0771p.this.r.e(null);
                return ax.j6.m.e(null);
            }
        }

        d(AbstractC2327j abstractC2327j) {
            this.a = abstractC2327j;
        }

        @Override // ax.j6.InterfaceC2326i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC2327j<Void> a(Boolean bool) throws Exception {
            return C0771p.this.e.i(new a(bool));
        }
    }

    /* renamed from: ax.J7.p$e */
    class e implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        e(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (C0771p.this.J()) {
                return null;
            }
            C0771p.this.i.g(this.a, this.b);
            return null;
        }
    }

    /* renamed from: ax.J7.p$f */
    class f implements Runnable {
        final /* synthetic */ Throwable c0;
        final /* synthetic */ Thread d0;
        final /* synthetic */ long q;

        f(long j, Throwable th, Thread thread) {
            this.q = j;
            this.c0 = th;
            this.d0 = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0771p.this.J()) {
                return;
            }
            long F = C0771p.F(this.q);
            String B = C0771p.this.B();
            if (B == null) {
                ax.G7.g.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                C0771p.this.m.t(this.c0, this.d0, B, F);
            }
        }
    }

    /* renamed from: ax.J7.p$g */
    class g implements Callable<Void> {
        final /* synthetic */ String a;

        g(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            C0771p.this.v(this.a, Boolean.FALSE);
            return null;
        }
    }

    /* renamed from: ax.J7.p$h */
    class h implements Callable<Void> {
        final /* synthetic */ long a;

        h(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            C0771p.this.k.a("_ae", bundle);
            return null;
        }
    }

    C0771p(Context context, C0769n c0769n, C c2, C0778x c0778x, ax.O7.g gVar, C0773s c0773s, C0756a c0756a, ax.K7.m mVar, ax.K7.e eVar, S s, ax.G7.a aVar, ax.H7.a aVar2, C0768m c0768m) {
        this.a = context;
        this.e = c0769n;
        this.f = c2;
        this.b = c0778x;
        this.g = gVar;
        this.c = c0773s;
        this.h = c0756a;
        this.d = mVar;
        this.i = eVar;
        this.j = aVar;
        this.k = aVar2;
        this.l = c0768m;
        this.m = s;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String B() {
        SortedSet<String> o = this.m.o();
        if (o.isEmpty()) {
            return null;
        }
        return o.first();
    }

    private static long C() {
        return F(System.currentTimeMillis());
    }

    static List<F> D(ax.G7.h hVar, String str, ax.O7.g gVar, byte[] bArr) {
        File q = gVar.q(str, "user-data");
        File q2 = gVar.q(str, "keys");
        File q3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0762g("logs_file", "logs", bArr));
        arrayList.add(new A("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new A("session_meta_file", "session", hVar.f()));
        arrayList.add(new A("app_meta_file", "app", hVar.a()));
        arrayList.add(new A("device_meta_file", "device", hVar.c()));
        arrayList.add(new A("os_meta_file", "os", hVar.b()));
        arrayList.add(O(hVar));
        arrayList.add(new A("user_meta_file", "user", q));
        arrayList.add(new A("keys_file", "keys", q2));
        arrayList.add(new A("rollouts_file", "rollouts", q3));
        return arrayList;
    }

    private InputStream E(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            ax.G7.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        ax.G7.g.f().g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long F(long j) {
        return j / 1000;
    }

    private AbstractC2327j<Void> L(long j) {
        if (A()) {
            ax.G7.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return ax.j6.m.e(null);
        }
        ax.G7.g.f().b("Logging app exception event to Firebase Analytics");
        return ax.j6.m.c(new ScheduledThreadPoolExecutor(1), new h(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC2327j<Void> M() {
        ArrayList arrayList = new ArrayList();
        for (File file : K()) {
            try {
                arrayList.add(L(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                ax.G7.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return ax.j6.m.f(arrayList);
    }

    private static boolean N(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            ax.G7.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            ax.G7.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static F O(ax.G7.h hVar) {
        File e2 = hVar.e();
        return (e2 == null || !e2.exists()) ? new C0762g("minidump_file", "minidump", new byte[]{0}) : new A("minidump_file", "minidump", e2);
    }

    private static byte[] Q(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private AbstractC2327j<Boolean> V() {
        if (this.b.d()) {
            ax.G7.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e(Boolean.FALSE);
            return ax.j6.m.e(Boolean.TRUE);
        }
        ax.G7.g.f().b("Automatic data collection is disabled.");
        ax.G7.g.f().i("Notifying that unsent reports are available.");
        this.p.e(Boolean.TRUE);
        AbstractC2327j<TContinuationResult> n = this.b.j().n(new c());
        ax.G7.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return Z.i(n, this.q.a());
    }

    private void W(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            ax.G7.g.f().i("ANR feature enabled, but device is API " + i);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.m.u(str, historicalProcessExitReasons, new ax.K7.e(this.g, str), ax.K7.m.i(str, this.g, this.e));
        } else {
            ax.G7.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static G.a o(C c2, C0756a c0756a) {
        return G.a.b(c2.f(), c0756a.f, c0756a.g, c2.a().c(), EnumC0779y.h(c0756a.d).j(), c0756a.h);
    }

    private static G.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(C0764i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C0764i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), C0764i.w(), C0764i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c q() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C0764i.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(boolean z, ax.Q7.i iVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.m.o());
        if (arrayList.size() <= z) {
            ax.G7.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        if (iVar.b().b.b) {
            W(str2);
        } else {
            ax.G7.g.f().i("ANR feature disabled.");
        }
        if (this.j.c(str2)) {
            y(str2);
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.l.e(null);
            str = null;
        }
        this.m.k(C(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, Boolean bool) {
        long C = C();
        ax.G7.g.f().b("Opening a new session with ID " + str);
        this.j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", r.i()), C, ax.L7.G.b(o(this.f, this.h), q(), p(this.a)));
        if (bool.booleanValue() && str != null) {
            this.d.m(str);
        }
        this.i.e(str);
        this.l.e(str);
        this.m.p(str, C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(long j) {
        try {
            if (this.g.g(".ae" + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            ax.G7.g.f().l("Could not create app exception marker file.", e2);
        }
    }

    private void y(String str) {
        ax.G7.g.f().i("Finalizing native report for session " + str);
        ax.G7.h a2 = this.j.a(str);
        File e2 = a2.e();
        F.a d2 = a2.d();
        if (N(str, e2, d2)) {
            ax.G7.g.f().k("No native core present");
            return;
        }
        long lastModified = e2.lastModified();
        ax.K7.e eVar = new ax.K7.e(this.g, str);
        File k = this.g.k(str);
        if (!k.isDirectory()) {
            ax.G7.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(lastModified);
        List<F> D = D(a2, str, this.g, eVar.b());
        G.b(k, D);
        ax.G7.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.m.j(str, D, d2);
        eVar.a();
    }

    String G() throws IOException {
        InputStream E = E("META-INF/version-control-info.textproto");
        if (E == null) {
            return null;
        }
        ax.G7.g.f().b("Read version control info");
        return Base64.encodeToString(Q(E), 0);
    }

    void H(ax.Q7.i iVar, Thread thread, Throwable th) {
        I(iVar, thread, th, false);
    }

    synchronized void I(ax.Q7.i iVar, Thread thread, Throwable th, boolean z) {
        try {
            try {
                ax.G7.g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
                try {
                    Z.f(this.e.i(new b(System.currentTimeMillis(), th, thread, iVar, z)));
                } catch (TimeoutException unused) {
                    ax.G7.g.f().d("Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e2) {
                    ax.G7.g.f().e("Error handling uncaught exception", e2);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    boolean J() {
        C0776v c0776v = this.n;
        return c0776v != null && c0776v.a();
    }

    List<File> K() {
        return this.g.h(t);
    }

    void P(String str) {
        this.e.h(new g(str));
    }

    void R() {
        try {
            String G = G();
            if (G != null) {
                T("com.crashlytics.version-control-info", G);
                ax.G7.g.f().g("Saved version control info");
            }
        } catch (IOException e2) {
            ax.G7.g.f().l("Unable to save version control info", e2);
        }
    }

    void S(String str, String str2) {
        try {
            this.d.k(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && C0764i.u(context)) {
                throw e2;
            }
            ax.G7.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void T(String str, String str2) {
        try {
            this.d.l(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && C0764i.u(context)) {
                throw e2;
            }
            ax.G7.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    @SuppressLint({"TaskMainThread"})
    AbstractC2327j<Void> U(AbstractC2327j<ax.Q7.d> abstractC2327j) {
        if (this.m.n()) {
            ax.G7.g.f().i("Crash reports are available to be sent.");
            return V().n(new d(abstractC2327j));
        }
        ax.G7.g.f().i("No crash reports are available to be sent.");
        this.p.e(Boolean.FALSE);
        return ax.j6.m.e(null);
    }

    void X(Thread thread, Throwable th) {
        this.e.g(new f(System.currentTimeMillis(), th, thread));
    }

    void Y(long j, String str) {
        this.e.h(new e(j, str));
    }

    boolean s() {
        if (!this.c.c()) {
            String B = B();
            return B != null && this.j.c(B);
        }
        ax.G7.g.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void t(ax.Q7.i iVar) {
        u(false, iVar);
    }

    void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ax.Q7.i iVar) {
        this.o = iVar;
        P(str);
        C0776v c0776v = new C0776v(new a(), iVar, uncaughtExceptionHandler, this.j);
        this.n = c0776v;
        Thread.setDefaultUncaughtExceptionHandler(c0776v);
    }

    boolean z(ax.Q7.i iVar) {
        this.e.b();
        if (J()) {
            ax.G7.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        ax.G7.g.f().i("Finalizing previously open sessions.");
        try {
            u(true, iVar);
            ax.G7.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            ax.G7.g.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
