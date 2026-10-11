package com.voxdon.xplorer.shizuku;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.util.AndroidRuntimeException;
import androidx.fragment.app.Fragment;
import ax.Q2.d;
import ax.Q2.i;
import ax.X2.L;
import ax.X2.Q;
import ax.c3.C1832u;
import ax.c3.K;
import ax.g3.g;
import ax.ne.i;
import ax.p3.C2761a;
import ax.u3.C3180B;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.shizuku.a;
import com.voxdon.xplorer.shizuku.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    private static c m;
    private com.voxdon.xplorer.shizuku.a a;
    private Context b;
    private Boolean c;
    private i.a g;
    private boolean d = false;
    private int e = 0;
    private boolean f = false;
    private final i.f h = new i.f(new ComponentName("com.voxdon.xplorer", ShizukuUserService.class.getName())).c(false).g("service").d(false).h(278);
    private final i.d i = new i.d() { // from class: ax.p3.b
        @Override // ax.ne.i.d
        public final void a() {
            com.voxdon.xplorer.shizuku.c.a(com.voxdon.xplorer.shizuku.c.this);
        }
    };
    private final i.c j = new i.c() { // from class: ax.p3.c
        @Override // ax.ne.i.c
        public final void a() {
            com.voxdon.xplorer.shizuku.c.b();
        }
    };
    private final i.e k = new b();
    private final ServiceConnection l = new ServiceConnectionC0532c();

    class a implements g {
        a() {
        }

        @Override // ax.g3.g
        public void J(String str) {
            c.this.c = null;
        }
    }

    class b implements i.e {
        b() {
        }

        @Override // ax.ne.i.e
        public void a(int i, int i2) {
            if (i2 == 0) {
                c.this.k();
            } else if (c.this.g != null) {
                c.this.g.c();
                c.this.g = null;
            }
            c.this.f = false;
        }
    }

    /* renamed from: com.voxdon.xplorer.shizuku.c$c, reason: collision with other inner class name */
    class ServiceConnectionC0532c implements ServiceConnection {
        ServiceConnectionC0532c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null || !iBinder.pingBinder()) {
                return;
            }
            c.this.J(a.AbstractBinderC0528a.r(iBinder));
            if (c.this.g != null) {
                c.this.g.b();
                c.this.g = null;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.this.n();
        }
    }

    private c(Context context) {
        this.b = context;
        ax.Q2.b.h().e(new a());
    }

    private boolean D() {
        return this.a != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(com.voxdon.xplorer.shizuku.a aVar) {
        this.a = aVar;
    }

    private void K() {
        try {
            if (ax.ne.i.C() < 10) {
                return;
            }
            ax.ne.i.Q(this.h, this.l, true);
        } catch (Throwable th) {
            th.printStackTrace();
            th.toString();
        }
    }

    public static /* synthetic */ void a(c cVar) {
        cVar.getClass();
        ax.ne.i.D();
        if (cVar.e <= 0 || cVar.D()) {
            return;
        }
        cVar.k();
    }

    public static /* synthetic */ void b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            ax.ne.i.y();
            try {
                if (ax.ne.i.C() < 10) {
                    return;
                }
                ax.ne.i.x(this.h, this.l);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.a = null;
    }

    public static c t() {
        if (m == null) {
            d.b(new Exception("Shizuku not initialized"));
        }
        return m;
    }

    public static void z(Context context) {
        if (m == null) {
            m = new c(context);
        }
    }

    public boolean A() {
        return this.f;
    }

    public boolean B() {
        try {
            return ax.ne.i.B() != -1;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean C() {
        if (!Q.F1()) {
            return false;
        }
        if (this.c == null) {
            this.c = Boolean.valueOf(C3180B.L(this.b, "moe.shizuku.privileged.api"));
        }
        return this.c.booleanValue();
    }

    public List<C3605y> E(C3604x c3604x, K k, String str) {
        try {
            List<C2761a> d1 = this.a.d1(str);
            if (d1 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C2761a> it = d1.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3605y(c3604x, k, it.next()));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void F(Fragment fragment) {
        if (fragment.b() == null) {
            return;
        }
        try {
            Intent launchIntentForPackage = fragment.b().getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
            if (launchIntentForPackage != null) {
                C1832u.p0(fragment, launchIntentForPackage);
            }
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        } catch (AndroidRuntimeException e2) {
            e = e2;
            e.printStackTrace();
        } catch (NullPointerException e3) {
            e = e3;
            e.printStackTrace();
        } catch (SecurityException e4) {
            e = e4;
            e.printStackTrace();
        }
    }

    public void G() {
        int i = this.e - 1;
        this.e = i;
        if (i <= 0) {
            ax.ne.i.H(this.i);
            ax.ne.i.G(this.j);
            ax.ne.i.I(this.k);
            K();
        }
    }

    public boolean H(String str, String str2) {
        try {
            return this.a.X0(str, str2);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean I(String str, long j) {
        try {
            return this.a.l0(str, j);
        } catch (Exception unused) {
            return false;
        }
    }

    public void j() {
        if (this.e == 0) {
            ax.ne.i.r(this.i);
            ax.ne.i.o(this.j);
            ax.ne.i.t(this.k);
            k();
        }
        this.e++;
    }

    public boolean l() {
        if (C() && B()) {
            return D();
        }
        return false;
    }

    public boolean m(i.a aVar) {
        this.f = false;
        if (!B() || ax.ne.i.D()) {
            return false;
        }
        if (ax.ne.i.y() == 0) {
            return true;
        }
        if (ax.ne.i.P()) {
            return false;
        }
        this.g = aVar;
        ax.ne.i.J(65001);
        this.f = true;
        return false;
    }

    public boolean o(String str) {
        try {
            return this.a.W1(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean p(String str) {
        try {
            return this.a.x1(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean q(String str) {
        try {
            return this.a.h(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public AbstractC3595n r(C3604x c3604x, K k, String str) {
        try {
            return new C3605y(c3604x, k, this.a.z(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public InputStream s(String str, long j) throws IOException {
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a.z0(str));
            if (j > 0 && autoCloseInputStream.skip(j) != j) {
                throw new IOException("AutoCloseInputStream skip failed");
            }
            return autoCloseInputStream;
        } catch (IOException e) {
            throw e;
        } catch (IllegalStateException e2) {
            b.c e3 = com.voxdon.xplorer.shizuku.b.e(e2);
            if (e3 == null) {
                throw new IOException(e2);
            }
            if (e3.a == com.voxdon.xplorer.shizuku.b.d) {
                throw new FileNotFoundException(e3.b);
            }
            throw new IOException(e3.b);
        } catch (Exception e4) {
            throw new IOException(e4);
        }
    }

    public int u(String str, boolean z) {
        try {
            return this.a.K1(str, z);
        } catch (Exception unused) {
            return -2;
        }
    }

    public OutputStream v(String str, boolean z) throws IOException {
        try {
            return new ParcelFileDescriptor.AutoCloseOutputStream(this.a.G1(str, z));
        } catch (IllegalStateException e) {
            b.c e2 = com.voxdon.xplorer.shizuku.b.e(e);
            if (e2 != null) {
                throw new IOException(e2.b);
            }
            throw new IOException(e);
        } catch (Exception e3) {
            throw new IOException(e3);
        }
    }

    public ParcelFileDescriptor w(String str) throws IOException {
        try {
            return this.a.z0(str);
        } catch (IllegalStateException e) {
            b.c e2 = com.voxdon.xplorer.shizuku.b.e(e);
            if (e2 == null) {
                throw new IOException(e);
            }
            if (e2.a == com.voxdon.xplorer.shizuku.b.d) {
                throw new FileNotFoundException(e2.b);
            }
            throw new IOException(e2.b);
        } catch (Exception e3) {
            throw new IOException(e3);
        }
    }

    public ParcelFileDescriptor x(String str) throws IOException {
        try {
            return this.a.w0(str);
        } catch (IllegalStateException e) {
            b.c e2 = com.voxdon.xplorer.shizuku.b.e(e);
            if (e2 != null) {
                throw new IOException(e2.b);
            }
            throw new IOException(e);
        } catch (Exception e3) {
            throw new IOException(e3);
        }
    }

    public L y(String str) throws IOException {
        try {
            C2761a L0 = this.a.L0(str);
            L l = new L();
            l.e = L0.d0;
            l.b = L0.e0;
            l.a = L0.i0;
            l.c = L0.j0;
            return l;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
