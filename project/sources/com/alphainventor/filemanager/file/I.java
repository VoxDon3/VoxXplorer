package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1487b;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1491f;
import ax.b3.C1493h;
import ax.b3.C1494i;
import ax.b3.C1495j;
import ax.b3.C1496k;
import ax.b3.C1497l;
import ax.c3.C1809B;
import ax.c3.C1819g;
import ax.c3.C1835x;
import ax.c3.a0;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.k0;
import ax.la.C2492b;
import ax.la.InterfaceC2490A;
import ax.la.InterfaceC2491a;
import ax.la.y;
import ax.na.C2630a;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import ax.xc.InterfaceC3488f;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.pcloud.sdk.AuthorizationActivity;
import com.pcloud.sdk.b;
import j$.net.URLEncoder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class I extends AbstractC3594m {
    private static final Logger l = Logger.getLogger("FileManager.PCloudFileHelper");
    private static final String m = StandardCharsets.UTF_8.name();
    private static d n;
    private InterfaceC2491a h;
    private InterfaceC2490A i;
    private ax.la.x j;
    private final Object k = new Object();

    class a extends ax.la.m {
        final /* synthetic */ InterfaceC3185c b;
        final /* synthetic */ ax.c3.G c;
        final /* synthetic */ long d;

        a(InterfaceC3185c interfaceC3185c, ax.c3.G g, long j) {
            this.b = interfaceC3185c;
            this.c = g;
            this.d = j;
        }

        @Override // ax.la.m
        public long a() {
            return this.d;
        }

        @Override // ax.la.m
        public void b(InterfaceC3488f interfaceC3488f) throws IOException {
            try {
                I.v0(this.b);
                InputStream b = this.c.b();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        I.v0(this.b);
                        int read = b.read(bArr);
                        if (read < 0) {
                            b.close();
                            I.v0(this.b);
                            return;
                        } else if (read != 0) {
                            interfaceC3488f.write(bArr, 0, read);
                        }
                    }
                } finally {
                }
            } catch (C1495j e) {
                throw new IOException(e);
            }
        }
    }

    class b implements ax.la.j<InterfaceC2490A> {
        final /* synthetic */ InterfaceC2491a a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ AtomicBoolean d;
        final /* synthetic */ AtomicInteger e;
        final /* synthetic */ InterfaceC3584c.a f;
        final /* synthetic */ Activity g;

        class a implements Runnable {
            final /* synthetic */ boolean q;

            a(boolean z) {
                this.q = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.q) {
                    InterfaceC3584c.a aVar = b.this.f;
                    if (aVar != null) {
                        aVar.T(false, null);
                        return;
                    }
                    return;
                }
                Activity activity = b.this.g;
                if (activity != null && !activity.isFinishing()) {
                    d r0 = I.r0(b.this.g);
                    b bVar = b.this;
                    r0.x(bVar.g, bVar.f, bVar.c);
                } else {
                    InterfaceC3584c.a aVar2 = b.this.f;
                    if (aVar2 != null) {
                        aVar2.T(false, null);
                    }
                }
            }
        }

        b(InterfaceC2491a interfaceC2491a, String str, int i, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, InterfaceC3584c.a aVar, Activity activity) {
            this.a = interfaceC2491a;
            this.b = str;
            this.c = i;
            this.d = atomicBoolean;
            this.e = atomicInteger;
            this.f = aVar;
            this.g = activity;
        }

        @Override // ax.la.j
        public void a(ax.la.i<InterfaceC2490A> iVar, Throwable th) {
            I.this.u0(null, null);
            boolean z = (th instanceof C2492b) && ((C2492b) th).a() == 2095;
            if (this.d.compareAndSet(false, true)) {
                this.e.set(2);
                I.this.f0(new a(z));
                return;
            }
            int i = this.e.get();
            ax.Ha.c.h().f().d("PCloud onConnectResult Twice 2").g("called:" + i).h();
        }

        @Override // ax.la.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ax.la.i<InterfaceC2490A> iVar, InterfaceC2490A interfaceC2490A) {
            I.this.u0(this.a, interfaceC2490A);
            if (TextUtils.isEmpty(this.b)) {
                I.r0(I.this.p()).v(this.c, interfaceC2490A);
            }
            if (this.d.compareAndSet(false, true)) {
                this.e.set(1);
                I.this.d0(this.f, true, null);
                return;
            }
            int i = this.e.get();
            ax.Ha.c.h().f().d("PCloud onConnectResult Twice 1").g("called:" + i).h();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.la.h.values().length];
            a = iArr;
            try {
                iArr[ax.la.h.ACCESS_GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.la.h.ACCESS_DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.la.h.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.la.h.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class d extends T {
        private Context a;
        private ax.g3.k b;
        private InterfaceC3584c.a c;
        private int d;
        private boolean e;
        c0 f = new c0(ax.Q2.f.R0);

        class a implements Runnable {
            final /* synthetic */ int q;

            a(int i) {
                this.q = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.b != null) {
                    d.this.b.c(ax.Q2.f.R0, this.q);
                    d.this.b = null;
                }
                if (d.this.c != null) {
                    if (d.this.e && this.q == d.this.d) {
                        d.this.c.T(false, new e());
                    } else {
                        d.this.c.T(false, null);
                    }
                    d.this.c = null;
                }
            }
        }

        public d(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit().remove("version_" + i).remove("accountid_" + i).remove("email_" + i).remove("location_name_" + i).remove("created_" + i).remove("sortindex_" + i).remove("apihost_" + i).remove("token_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("PCloudCloudPrefs", 0);
            String string = sharedPreferences.getString("email_" + i, null);
            ax.Q2.f fVar = ax.Q2.f.R0;
            return new ax.Z2.s(fVar, i, sharedPreferences.getString("location_name_" + i, fVar.M(this.a)), string, null, null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit();
            edit.putString("location_name_" + i, str);
            edit.apply();
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        public void q(com.voxdon.xplorer.activity.a aVar, ax.g3.k kVar) {
            kVar.b(ax.Q2.f.R0);
            this.b = kVar;
            w(aVar, false);
        }

        int r(String str) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("PCloudCloudPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.contains("accountid_" + i2) && !TextUtils.isEmpty(str)) {
                    if (str.equals(sharedPreferences.getString("accountid_" + i2, null))) {
                        return i2;
                    }
                }
            }
            return -1;
        }

        int s() {
            return this.a.getSharedPreferences("PCloudCloudPrefs", 0).getInt("count", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void t(int r9, android.content.Intent r10) {
            /*
                r8 = this;
                r9 = 0
                r1 = 0
                if (r10 != 0) goto Le
                com.voxdon.xplorer.file.c$a r10 = r8.c
                if (r10 == 0) goto Lc0
                r10.T(r9, r1)
                r8.c = r1
                return
            Le:
                com.pcloud.sdk.a r10 = com.pcloud.sdk.AuthorizationActivity.h(r10)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                ax.la.h r0 = r10.c0     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                int[] r2 = com.voxdon.xplorer.file.I.c.a     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                int r0 = r0.ordinal()     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r0 = r2[r0]     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r2 = 1
                if (r0 == r2) goto L7e
                r2 = 2
                if (r0 == r2) goto L64
                r2 = 3
                if (r0 == r2) goto L39
                r10 = 4
                if (r0 == r10) goto L2a
                goto Lc0
            L2a:
                com.voxdon.xplorer.file.c$a r10 = r8.c     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                if (r10 == 0) goto Lc0
                r10.T(r9, r1)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r8.c = r1     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                return
            L34:
                r0 = move-exception
            L35:
                r10 = r0
                goto La4
            L37:
                r0 = move-exception
                goto L35
            L39:
                ax.g3.k r2 = r8.b     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                if (r2 == 0) goto L5a
                ax.Q2.f r3 = ax.Q2.f.R0     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                java.lang.String r4 = ""
                java.lang.String r6 = ""
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r0.<init>()     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                java.lang.String r5 = "Account access grant error:\n"
                r0.append(r5)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                java.lang.String r10 = r10.i0     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r0.append(r10)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                java.lang.String r7 = r0.toString()     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r5 = 0
                r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
            L5a:
                com.voxdon.xplorer.file.c$a r10 = r8.c     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                if (r10 == 0) goto Lc0
                r10.T(r9, r1)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r8.c = r1     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                return
            L64:
                ax.g3.k r2 = r8.b     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                if (r2 == 0) goto L74
                ax.Q2.f r3 = ax.Q2.f.R0     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                java.lang.String r4 = ""
                java.lang.String r6 = ""
                java.lang.String r7 = "Account access denied"
                r5 = 0
                r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
            L74:
                com.voxdon.xplorer.file.c$a r10 = r8.c     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                if (r10 == 0) goto Lc0
                r10.T(r9, r1)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r8.c = r1     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                return
            L7e:
                int r0 = r8.s()     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                long r2 = r10.e0     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                int r2 = r8.r(r2)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                if (r2 < 0) goto L8f
                r0 = r2
            L8f:
                r8.u(r0, r10)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                android.os.Handler r10 = new android.os.Handler     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r10.<init>(r2)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                com.voxdon.xplorer.file.I$d$a r2 = new com.voxdon.xplorer.file.I$d$a     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r2.<init>(r0)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                r10.post(r2)     // Catch: java.lang.NullPointerException -> L34 java.lang.IllegalArgumentException -> L37
                return
            La4:
                r10.printStackTrace()
                ax.g3.k r2 = r8.b
                if (r2 == 0) goto Lb7
                ax.Q2.f r3 = ax.Q2.f.R0
                java.lang.String r6 = ""
                java.lang.String r7 = "Exception"
                java.lang.String r4 = ""
                r5 = 0
                r2.a(r3, r4, r5, r6, r7)
            Lb7:
                com.voxdon.xplorer.file.c$a r10 = r8.c
                if (r10 == 0) goto Lc0
                r10.T(r9, r1)
                r8.c = r1
            Lc0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.I.d.t(int, android.content.Intent):void");
        }

        void u(int i, com.pcloud.sdk.a aVar) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("PCloudCloudPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            c0 c0Var = this.f;
            ax.Y2.a a2 = ax.Y2.a.a();
            ax.Q2.f fVar = ax.Q2.f.R0;
            edit.putInt("version_" + i, 3).putString("apihost_" + i, aVar.h0).putString("accountid_" + i, String.valueOf(aVar.e0)).putString("token_" + i, c0Var.e(a2.b(fVar), aVar.d0)).putString("location_name_" + i, fVar.M(this.a));
            if (z) {
                edit.putLong("created_" + i, System.currentTimeMillis());
                edit.putLong("sortindex_" + i, System.currentTimeMillis());
            }
            if (z) {
                edit.putInt("count", i + 1);
            }
            edit.apply();
        }

        public void v(int i, InterfaceC2490A interfaceC2490A) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("PCloudCloudPrefs", 0).edit();
            edit.putString("email_" + i, interfaceC2490A.b());
            edit.apply();
        }

        public void w(Activity activity, boolean z) {
            activity.startActivityForResult(AuthorizationActivity.e(activity, com.pcloud.sdk.b.a().j(b.c.TOKEN).h(C1819g.c(activity).a(ax.Q2.f.R0)).i(true).f("manageshares").g()), 10006);
            this.e = z;
        }

        public void x(Activity activity, InterfaceC3584c.a aVar, int i) {
            this.c = aVar;
            this.d = i;
            w(activity, true);
        }
    }

    public static class e {
    }

    public static /* synthetic */ void k0(ax.g3.i iVar, long j, long j2) {
        if (iVar != null) {
            iVar.a(j, j2);
        }
    }

    private void n0() throws C1493h {
        if (!a()) {
            throw new C1493h("Not connected");
        }
    }

    private C1495j o0(String str, Exception exc) {
        if (exc instanceof C2492b) {
            int a2 = ((C2492b) exc).a();
            if (a2 == 2003 || a2 == 1000 || a2 == 2007) {
                return new C1490e(exc);
            }
            if (t0(a2)) {
                return new ax.b3.t();
            }
            if (a2 == 2008) {
                return new ax.b3.s(exc);
            }
            if (a2 == 2006) {
                return new C1496k();
            }
            if (a2 == 2004) {
                return new C1491f(false);
            }
            if (a2 == 2028) {
                return new C1497l(exc);
            }
        } else if (exc instanceof C2630a) {
            return new C1494i(String.format("Error (%s)", Integer.valueOf(((C2630a) exc).a())), exc);
        }
        return C1489d.b(str, exc);
    }

    private void p0(AbstractC3595n abstractC3595n, boolean z) throws C1495j {
        n0();
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        try {
            String q0 = q0(abstractC3595n.E());
            Boolean execute = (abstractC3595n.isDirectory() ? this.h.k(q0, z) : this.h.h(q0)).execute();
            if (execute == null || !execute.booleanValue()) {
                throw new C1495j("Failed to delete");
            }
        } catch (Exception e2) {
            throw o0("deleteFile", e2);
        }
    }

    private String q0(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, m);
    }

    public static d r0(Context context) {
        if (n == null) {
            n = new d(context.getApplicationContext());
        }
        return n;
    }

    private ax.la.x s0() {
        if (this.j == null) {
            int s = (int) (C3180B.s(p()) * 128.0f);
            if (s > 1024) {
                s = 1024;
            }
            this.j = new ax.la.x(s, s);
        }
        return this.j;
    }

    private boolean t0(int i) {
        return i == 2055 || i == 2001 || i == 2002 || i == 2009 || i == 2005;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(InterfaceC2491a interfaceC2491a, InterfaceC2490A interfaceC2490A) {
        synchronized (this.k) {
            this.h = interfaceC2491a;
            this.i = interfaceC2490A;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v0(InterfaceC3185c interfaceC3185c) throws C1487b {
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new C1487b();
        }
    }

    private void w0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l2, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (!z) {
            C3184b.a(abstractC3595n.n());
        }
        n0();
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new C1486a();
        }
        if (j < 0) {
            y0(abstractC3595n, g, str, l2, z, interfaceC3185c, iVar);
        } else {
            x0(abstractC3595n, g, str, j, l2, z, interfaceC3185c, iVar);
        }
    }

    private void x0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l2, boolean z, InterfaceC3185c interfaceC3185c, final ax.g3.i iVar) throws C1495j, C1486a {
        try {
            a aVar = new a(interfaceC3185c, g, j);
            Date date = l2 != null ? new Date(l2.longValue()) : null;
            ax.la.r rVar = new ax.la.r() { // from class: ax.c3.Z
                @Override // ax.la.r
                public final void a(long j2, long j3) {
                    com.voxdon.xplorer.file.I.k0(ax.g3.i.this, j2, j3);
                }
            };
            y.a a2 = ax.la.y.a();
            if (z) {
                a2.b(z);
            }
            ax.la.v execute = this.h.b(q0(abstractC3595n.T()), abstractC3595n.B(), aVar, date, rVar, a2.a()).execute();
            if (!z && execute != null && execute.a() != null && !execute.a().equals(abstractC3595n.B())) {
                throw new C1491f(execute.f());
            }
        } catch (C1495j e2) {
            throw e2;
        } catch (IOException e3) {
            if (!C1489d.d(e3, C1487b.class)) {
                throw o0("writeFile", e3);
            }
            throw new C1486a(e3);
        } catch (Exception e4) {
            throw o0("writeFile", e4);
        }
    }

    private void y0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, Long l2, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        File file;
        InputStream b2;
        InputStream inputStream = null;
        try {
            try {
                b2 = g.b();
                try {
                    file = new File(ax.Z2.a.l(p(), abstractC3595n), abstractC3595n.B() + System.currentTimeMillis() + ".tmp");
                } catch (C1486a e2) {
                    throw e2;
                } catch (C1495j e3) {
                    throw e3;
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
                file = null;
            }
        } catch (C1486a e5) {
            throw e5;
        } catch (C1495j e6) {
            throw e6;
        } catch (IOException e7) {
            e = e7;
        } catch (Throwable th2) {
            th = th2;
            file = null;
        }
        try {
            ax.c3.F.f(b2, file, -1L, interfaceC3185c);
            try {
                C3596o f = C1835x.f(file);
                x0(abstractC3595n, f.x(f.z(file.getAbsolutePath())), str, file.length(), l2, z, interfaceC3185c, iVar);
                ax.c3.F.a(null);
                if (file.exists()) {
                    file.delete();
                }
            } catch (C1486a e8) {
                e = e8;
            } catch (C1495j e9) {
                e = e9;
            } catch (IOException e10) {
                e = e10;
                throw o0("pcloud upload unknown size", e);
            } catch (Throwable th3) {
                th = th3;
                ax.c3.F.a(inputStream);
                if (file != null && file.exists()) {
                    file.delete();
                }
                throw th;
            }
        } catch (C1486a e11) {
            e = e11;
        } catch (C1495j e12) {
            e = e12;
        } catch (IOException e13) {
            e = e13;
        } catch (Throwable th4) {
            th = th4;
            inputStream = b2;
            ax.c3.F.a(inputStream);
            if (file != null) {
                file.delete();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream A(java.lang.String r4, java.lang.String r5, java.lang.String r6) throws java.io.IOException {
        /*
            r3 = this;
            r4 = 0
            if (r6 == 0) goto L16
            java.lang.String r0 = "fileid="
            boolean r0 = r6.startsWith(r0)     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto Lc
            goto L16
        Lc:
            r5 = 7
            java.lang.String r5 = r6.substring(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = android.net.Uri.decode(r5)     // Catch: java.lang.Throwable -> L60
            goto L29
        L16:
            com.voxdon.xplorer.file.n r5 = r3.z(r5)     // Catch: java.lang.Throwable -> L60
            ax.c3.a0 r5 = (ax.c3.a0) r5     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L25
            boolean r6 = r5.n()     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L25
            return r4
        L25:
            java.lang.String r5 = r5.t()     // Catch: java.lang.Throwable -> L60
        L29:
            ax.la.a r6 = r3.h     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L2e
            return r4
        L2e:
            if (r5 == 0) goto L60
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L60
            r6 = 0
            char r6 = r5.charAt(r6)     // Catch: java.lang.Throwable -> L60
            r0 = 102(0x66, float:1.43E-43)
            if (r6 == r0) goto L40
            goto L60
        L40:
            long r5 = ax.c3.a0.g0(r5)     // Catch: java.lang.Throwable -> L60
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L4b
            return r4
        L4b:
            ax.la.a r0 = r3.h
            ax.la.x r1 = r3.s0()
            r2 = 1
            ax.la.i r5 = r0.f(r5, r1, r2)
            java.lang.Object r5 = r5.execute()
            ax.xc.g r5 = (ax.xc.g) r5
            java.io.InputStream r4 = r5.V0()
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.I.A(java.lang.String, java.lang.String, java.lang.String):java.io.InputStream");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        if (this.h != null) {
            C3184b.c(abstractC3595n.isDirectory());
            try {
                ArrayList arrayList = new ArrayList();
                for (ax.la.u uVar : this.h.l(q0(abstractC3595n.E())).execute().k()) {
                    arrayList.add(new a0(this, abstractC3595n.t(), uVar, d0.Q(abstractC3595n.E(), uVar.a())));
                }
                return arrayList;
            } catch (Exception e2) {
                throw o0("listChildren", e2);
            }
        }
        C1495j c1495j = new C1495j("FolderApi == null:connected = " + a() + ":" + (this.h == null));
        ax.Q2.d.b(c1495j);
        throw c1495j;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l2, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        w0(abstractC3595n, g, str, j, l2, false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        n0();
        try {
            String q0 = q0(abstractC3595n.E());
            String q02 = q0(abstractC3595n2.E());
            if (abstractC3595n.isDirectory()) {
                if (this.h.a(q0, q02).execute() == null) {
                    throw new C1495j("No moved Folder");
                }
            } else if (this.h.i(q0, q02).execute() == null) {
                throw new C1495j("No moved file");
            }
        } catch (Exception e2) {
            throw o0("moveFile", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        n0();
        try {
            if (this.h.d(q0(abstractC3595n.E()), q0(abstractC3595n2.E()), false).execute() == null) {
                throw new C1495j("No copied file");
            }
            if (iVar != null) {
                long p = abstractC3595n.p();
                iVar.a(p, p);
            }
        } catch (Exception e2) {
            throw o0("copyFile", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (!((a0) abstractC3595n).h0()) {
            return null;
        }
        return C1809B.a0(abstractC3595n, "fileid=" + Uri.encode(abstractC3595n.t()));
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        p0(abstractC3595n, true);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        n0();
        if (((a0) abstractC3595n).f0() == null) {
            throw new ax.b3.t();
        }
        try {
            ax.la.p execute = this.h.g(q0(abstractC3595n.E()), ax.la.n.b().c(true).d(true).a()).execute();
            URL a2 = execute != null ? execute.a() : null;
            if (a2 == null) {
                throw new C1495j("No pCloud download URL");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) a2.openConnection();
            if (j > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (j > 0 && responseCode != 206) {
                throw new IOException("Range request failed: " + responseCode);
            }
            if (responseCode >= 200 && responseCode < 300) {
                return httpURLConnection.getInputStream();
            }
            throw new IOException("HTTP status: " + responseCode);
        } catch (C1495j e2) {
            throw e2;
        } catch (Exception e3) {
            throw o0("getInputStream", e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        InterfaceC3584c.a aVar2;
        if (aVar != null) {
            aVar.B();
        }
        int t = t();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        SharedPreferences sharedPreferences = p().getSharedPreferences("PCloudCloudPrefs", 0);
        sharedPreferences.getString("accountid_" + t, null);
        String string = sharedPreferences.getString("email_" + t, null);
        try {
            ax.Q2.f fVar = ax.Q2.f.R0;
            c0 c0Var = new c0(fVar);
            int i = sharedPreferences.getInt("version_" + t(), 0);
            String string2 = sharedPreferences.getString("token_" + t(), null);
            if (i != 0) {
                string2 = c0Var.a(i, ax.Y2.a.a().b(fVar), string2);
            }
            String string3 = sharedPreferences.getString("apihost_" + t, null);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                InterfaceC2491a a2 = ax.la.q.a().b(ax.la.e.b(string2)).c(string3).a();
                a2.j().A(new b(a2, string, t, atomicBoolean, atomicInteger, aVar, activity));
                return;
            }
            aVar2 = aVar;
            try {
                u0(null, null);
                d0(aVar2, false, null);
            } catch (Exception unused) {
                u0(null, null);
                d0(aVar2, false, null);
            }
        } catch (Exception unused2) {
            aVar2 = aVar;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        if (!a()) {
            return false;
        }
        try {
            ax.la.w execute = this.h.n(q0(abstractC3595n.E())).execute();
            if (execute == null) {
                return false;
            }
            if (abstractC3595n.B().equals(execute.a())) {
                return true;
            }
            execute.delete();
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        if (!a() || abstractC3595n.n()) {
            return false;
        }
        try {
            ax.la.m mVar = ax.la.m.a;
            ax.la.v execute = this.h.e(q0(abstractC3595n.T()), abstractC3595n.B(), mVar, ax.la.y.c).execute();
            if (execute == null) {
                return false;
            }
            if (abstractC3595n.B().equals(execute.a())) {
                return true;
            }
            execute.delete();
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        p0(abstractC3595n, false);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        boolean z;
        synchronized (this.k) {
            z = this.h != null;
        }
        return z;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean g0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean h0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l2, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        w0(abstractC3595n, g, str, j, l2, true, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        if (!z2) {
            o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
        } else {
            n0();
            o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        n0();
        try {
            InterfaceC2490A execute = this.h.j().execute();
            if (execute != null) {
                return new k0(execute.a(), execute.c());
            }
            throw new C1495j("No pCloud user info");
        } catch (C1495j e2) {
            throw e2;
        } catch (Exception e3) {
            throw o0("getStorageSpace", e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        n0();
        if (d0.a.equals(str)) {
            return new a0(this, str);
        }
        try {
            ax.la.v execute = this.h.m(q0(str)).execute();
            return new a0(this, a0.i0(execute.m()), execute, str);
        } catch (Exception e2) {
            if ((e2 instanceof C2492b) && t0(((C2492b) e2).a())) {
                try {
                    return new a0(this, (a0) z(d0.r(str)), str);
                } catch (C1495j unused) {
                    throw o0("getFileInfo", e2);
                }
            }
            throw o0("getFileInfo", e2);
        }
    }
}
