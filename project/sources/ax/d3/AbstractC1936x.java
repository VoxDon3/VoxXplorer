package ax.d3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import ax.Q2.i;
import ax.U2.d;
import ax.a3.C1358n;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1835x;
import ax.h3.C2149c;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3189g;
import ax.u3.C3194l;
import ax.u3.C3197o;
import ax.x3.AbstractC3428n;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3603w;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.d3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1936x extends AbstractC1927n {
    private static final Logger O0 = Logger.getLogger("FileManager.DesktopParentFragment");
    private BroadcastReceiver C0;
    private Snackbar D0;
    private Snackbar E0;
    private Snackbar F0;
    private ax.g3.e G0;
    private boolean H0;
    private ax.Q2.i I0;
    private boolean J0 = true;
    private boolean K0 = false;
    private boolean L0 = false;
    private boolean M0 = false;
    BroadcastReceiver N0 = new g();

    /* renamed from: ax.d3.x$a */
    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ax.Q2.a.i().m("menu_desktop", "open_recycle_bin").c("by", "recycle_bin_full_snackbar").e();
            ((MainActivity) AbstractC1936x.this.f0()).G2("recycle_bin_full_snackbar");
        }
    }

    /* renamed from: ax.d3.x$b */
    class b implements MenuItem.OnMenuItemClickListener {
        final /* synthetic */ ax.c3.K a;
        final /* synthetic */ ax.Q2.f b;

        b(ax.c3.K k, ax.Q2.f fVar) {
            this.a = k;
            this.b = fVar;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (AbstractC1936x.this.f0() == null) {
                return true;
            }
            int itemId = menuItem.getItemId();
            if (itemId != R.id.menu_eject) {
                if (itemId == R.id.menu_settings) {
                    ((com.voxdon.xplorer.activity.a) AbstractC1936x.this.f0()).N(this.a);
                } else if (itemId == R.id.menu_shortcut) {
                    AbstractC1936x.this.S2(this.a, null, false);
                }
            } else if (CommandService.x(this.b)) {
                AbstractC1936x.this.E4(R.string.error_device_is_in_use, 1);
            } else {
                ax.Z2.j.F().y();
            }
            return true;
        }
    }

    /* renamed from: ax.d3.x$d */
    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.o0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.p0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.u0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.v0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.Q2.f.c1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ax.Q2.f.x0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ax.Q2.f.d1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ax.Q2.f.e1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ax.Q2.f.w0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ax.Q2.f.f1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ax.Q2.f.g1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ax.Q2.f.h1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ax.Q2.f.b1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[ax.Q2.f.r0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[ax.Q2.f.q0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[ax.Q2.f.F0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[ax.Q2.f.s0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[ax.Q2.f.t0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[ax.Q2.f.V0.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[ax.Q2.f.M0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[ax.Q2.f.G0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[ax.Q2.f.p1.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[ax.Q2.f.i1.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* renamed from: ax.d3.x$e */
    class e implements i.a {
        e() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            C3184b.f();
        }

        @Override // ax.Q2.i.a
        public void b() {
            AbstractC1936x.this.u5();
        }

        @Override // ax.Q2.i.a
        public void c() {
            AbstractC1936x.this.n5(2);
        }
    }

    /* renamed from: ax.d3.x$f */
    class f implements i.a {
        f() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            C3184b.f();
        }

        @Override // ax.Q2.i.a
        public void b() {
            AbstractC1936x.this.u5();
            AbstractC1936x.this.l5();
        }

        @Override // ax.Q2.i.a
        public void c() {
            AbstractC1936x.this.r5();
        }
    }

    /* renamed from: ax.d3.x$g */
    class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC1936x.this.u5();
            AbstractC1936x.this.v5();
        }
    }

    /* renamed from: ax.d3.x$h */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1936x.this.f0() == null) {
                return;
            }
            if (ax.X2.Q.z0()) {
                AbstractC1936x.this.r5();
            } else {
                AbstractC1936x.this.t5();
            }
        }
    }

    /* renamed from: ax.d3.x$j */
    class j implements i.a {
        j() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            if (z) {
                AbstractC1936x.this.m5();
            } else {
                AbstractC1936x.this.n5(2);
            }
        }

        @Override // ax.Q2.i.a
        public void b() {
            AbstractC1936x.this.u5();
            AbstractC1936x.this.l5();
        }

        @Override // ax.Q2.i.a
        public void c() {
            AbstractC1936x.this.n5(1);
        }
    }

    /* renamed from: ax.d3.x$k */
    class k extends BroadcastReceiver {
        final /* synthetic */ ax.g3.e a;
        final /* synthetic */ ax.c3.K b;

        k(ax.g3.e eVar, ax.c3.K k) {
            this.a = eVar;
            this.b = k;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.filemanager.action.USB_PERMISSION".equals(intent.getAction())) {
                if (intent.getBooleanExtra("permission", false) && AbstractC1936x.this.X0()) {
                    this.a.g(this.b);
                }
                if (AbstractC1936x.this.C0 == null || AbstractC1936x.this.f0() == null) {
                    return;
                }
                AbstractC1936x.this.f0().unregisterReceiver(AbstractC1936x.this.C0);
                AbstractC1936x.this.C0 = null;
            }
        }
    }

    /* renamed from: ax.d3.x$l */
    class l extends ax.g3.c {
        final /* synthetic */ int c;

        l(int i) {
            this.c = i;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (AbstractC1936x.this.f0() == null) {
                return;
            }
            int i = this.c;
            if (i == 1) {
                AbstractC1936x.this.t5();
            } else if (i == 2) {
                AbstractC1936x.this.m5();
            } else if (i == 3) {
                AbstractC1936x.this.h5();
            }
        }
    }

    /* renamed from: ax.d3.x$m */
    class m extends ax.g3.c {
        final /* synthetic */ ax.c3.K c;

        m(ax.c3.K k) {
            this.c = k;
        }

        @Override // ax.g3.c
        public void a(View view) {
            ax.Q2.a.i().m("menu_desktop", "analyze").c("by", "disk_full_snackbar").e();
            AbstractC1936x.this.s5(this.c, true, "disk_full_snackbar");
        }
    }

    /* renamed from: ax.d3.x$n */
    public static class n extends ax.K0.a<Void> {
        private int o;
        private String p;
        private String q;
        private ax.Z2.d r;
        private ax.c3.K s;
        private boolean t;
        private float u;
        private long v;
        private long w;
        Set<Integer> x;

        public n(Context context, ax.Z2.d dVar, ax.c3.K k, Set<Integer> set) {
            super(context);
            this.r = dVar;
            this.s = k;
            this.x = set;
        }

        void L(Context context, ax.c3.k0 k0Var) {
            this.o = k0Var.c;
            long j = k0Var.a;
            this.w = j;
            this.p = C1809B.j(context, j);
            this.q = C1809B.k(context, k0Var.a);
        }

        void M(Context context, ax.c3.k0 k0Var) {
            this.o = 0;
            long j = k0Var.a;
            this.w = j;
            long j2 = k0Var.b;
            if (j2 != 0) {
                this.p = C1809B.m(context, j2, j, C1809B.a.MEDIUM);
                this.q = C1809B.m(context, k0Var.b, k0Var.a, C1809B.a.SHORT);
            }
        }

        public int N() {
            return this.o;
        }

        public long O() {
            return this.v;
        }

        public String P() {
            return this.p;
        }

        public ax.Q2.f Q() {
            return this.s.d();
        }

        public ax.c3.K R() {
            return this.s;
        }

        public String S() {
            return this.q;
        }

        public long T() {
            return this.w;
        }

        ax.c3.k0 U(ax.c3.K k, boolean z) {
            C3596o e = C1835x.e(k);
            e.n0();
            if (z) {
                try {
                    if (!e.a()) {
                        e.h(null);
                    }
                } catch (Throwable th) {
                    e.k0(false);
                    throw th;
                }
            }
            if (e.a()) {
                try {
                    ax.c3.k0 W = e.W();
                    e.k0(false);
                    return W;
                } catch (C1495j unused) {
                }
            }
            e.k0(false);
            return null;
        }

        public float V() {
            return this.u;
        }

        public boolean W() {
            return this.t;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // ax.K0.a
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public Void I() {
            if (j() != null) {
                Context applicationContext = j().getApplicationContext();
                this.o = 0;
                this.p = null;
                this.q = null;
                boolean h = ax.t3.e.h(j(), ax.Q2.f.V0, 0, null, false);
                if (!ax.Q2.f.r0(this.s, true)) {
                    if (this.s == ax.c3.K.f && ax.Z2.j.F().v0()) {
                        String string = j().getString(R.string.menu_set_up);
                        this.q = string;
                        this.p = string;
                    } else {
                        String string2 = j().getString(R.string.storage_not_available);
                        this.q = string2;
                        this.p = string2;
                    }
                    return null;
                }
                switch (d.a[this.s.d().ordinal()]) {
                    case 1:
                    case 2:
                        ax.c3.k0 U = U(this.s, true);
                        if (U != null) {
                            M(applicationContext, U);
                            long j = U.b;
                            if (j != 0) {
                                float f = (float) ((U.a * 100.0d) / j);
                                this.u = f;
                                if (f >= ax.Q2.e.l(applicationContext)) {
                                    this.t = true;
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        ax.c3.k0 U2 = U(this.s, true);
                        if (U2 != null) {
                            M(applicationContext, U2);
                            break;
                        }
                        break;
                    case 13:
                        try {
                            ax.c3.k0 W = C1835x.e(this.s).W();
                            if (W != null) {
                                M(applicationContext, W);
                                break;
                            }
                        } catch (C1495j unused) {
                            break;
                        }
                        break;
                    case 14:
                    case 15:
                    case 16:
                        ax.c3.k0 U3 = U(this.s, true);
                        if (U3 != null) {
                            L(applicationContext, U3);
                            break;
                        }
                        break;
                    case 17:
                    case 18:
                        this.q = HttpUrl.FRAGMENT_ENCODE_SET;
                        this.p = HttpUrl.FRAGMENT_ENCODE_SET;
                        break;
                    case 19:
                        this.o = ax.U2.d.F(applicationContext).G(h);
                        long I = ax.U2.d.F(applicationContext).I(h);
                        this.w = I;
                        this.p = C1809B.j(applicationContext, I);
                        this.q = C1809B.k(applicationContext, this.w);
                        if (ax.U2.d.F(j()).W()) {
                            new d.C0202d(j()).i(new Void[0]);
                            break;
                        }
                        break;
                    case 20:
                        this.o = com.voxdon.xplorer.file.T.c(applicationContext).size();
                        break;
                    case 21:
                        this.o = com.voxdon.xplorer.file.T.e(applicationContext).size();
                        break;
                    case 22:
                        this.w = ax.Z2.j.F().o(null);
                        this.v = new File(ax.c3.K.e.e()).getUsableSpace();
                        this.o = 0;
                        this.p = String.format("%s", C1809B.j(applicationContext, this.w));
                        this.q = String.format("%s", C1809B.k(applicationContext, this.w));
                        break;
                    case 23:
                        ax.c3.k0 U4 = U(ax.c3.K.e, true);
                        if (U4 != null) {
                            this.o = 0;
                            long j2 = U4.b;
                            if (j2 != 0) {
                                float f2 = (float) ((U4.a * 100.0d) / j2);
                                this.u = f2;
                                if (f2 >= ax.Q2.e.l(applicationContext)) {
                                    this.t = true;
                                }
                                String string3 = applicationContext.getString(R.string.used_percent, C3180B.P(this.u));
                                this.p = string3;
                                this.q = string3;
                                break;
                            }
                        }
                        break;
                }
            } else {
                return null;
            }
            return null;
        }

        @Override // ax.K0.c
        protected void t() {
            this.x.add(Integer.valueOf(k()));
            a();
        }
    }

    /* renamed from: ax.d3.x$o */
    private class o extends AbstractC3199q<Void, Void, Void> {
        o() {
            super(AbstractC3199q.e.HIGH);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            ax.Z2.j.F().K0();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Void r2) {
            if (AbstractC1936x.this.X0() && !AbstractC1936x.this.c5()) {
                AbstractC1936x.this.g5(false);
            }
        }
    }

    private void Z4() {
        if (f0() == null) {
            return;
        }
        if (C3197o.e(f0())) {
            this.L0 = true;
            return;
        }
        if (((MainActivity) f0()).X1()) {
            if (this.K0) {
                return;
            }
            f5();
            return;
        }
        this.L0 = false;
        if (!this.J0) {
            new Handler(Looper.getMainLooper()).post(new h());
            return;
        }
        ((MainActivity) f0()).F2(ax.t3.k.v());
        f5();
        ax.Q2.a.i().p("show_permission_screen").c();
        this.J0 = false;
    }

    private void f5() {
        C3189g.a().d("local.intent.action.STORAGE_GRANTED", this.N0);
        this.K0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m5() {
        this.I0.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r5() {
        if (!ax.X2.Q.z0()) {
            C3184b.f();
        } else {
            if (s0() == null) {
                return;
            }
            C1358n l3 = C1358n.l3(R.string.title_access_request, R.string.request_all_files_access_permissions, android.R.string.ok, 0, false, false);
            l3.n3(new i());
            C3180B.d0(A0(), l3, "allfilesaccess", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t5() {
        this.I0.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u5() {
        this.L0 = true;
        C1809B.f();
        ax.Q2.e.Q();
        ax.Z2.j.F().x();
        ax.Z2.j.F().K0();
        String e2 = ax.c3.K.e.e();
        if (TextUtils.isEmpty(e2)) {
            return;
        }
        File file = new File(e2);
        if (file.exists() && (!file.canRead() || !file.canWrite())) {
            if (f0() != null) {
                C3180B.Y(f0());
            }
        } else if (f0() == null || !((MainActivity) f0()).V1()) {
            g5(true);
        } else {
            f0().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v5() {
        C3189g.a().h(this.N0);
        this.K0 = false;
    }

    @Override // ax.d3.AbstractC1927n
    public String C3() {
        return null;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
    }

    @Override // ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    @Override // ax.d3.AbstractC1927n
    public boolean V2() {
        return false;
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean W2() {
        return true;
    }

    protected void X4(ax.x3.v vVar, ax.c3.K k2) {
        ax.Q2.f d2 = k2.d();
        f0().getMenuInflater().inflate(R.menu.context_desktop, vVar);
        vVar.g0(k2.f(f0()));
        b bVar = new b(k2, d2);
        if (ax.Q2.f.w0(d2)) {
            MenuItem findItem = vVar.findItem(R.id.menu_settings);
            findItem.setVisible(true);
            findItem.setOnMenuItemClickListener(bVar);
        } else if (d2 == ax.Q2.f.b1) {
            MenuItem findItem2 = vVar.findItem(R.id.menu_eject);
            findItem2.setVisible(true);
            findItem2.setOnMenuItemClickListener(bVar);
        } else if (ax.t3.j.x(o3())) {
            MenuItem findItem3 = vVar.findItem(R.id.menu_shortcut);
            findItem3.setVisible(true);
            findItem3.setOnMenuItemClickListener(bVar);
        }
    }

    protected boolean Y4(ax.c3.K k2) {
        UsbDevice f2 = ax.Q2.o.i().f(f0());
        if (f2 == null || ax.Q2.o.i().l(f0(), f2)) {
            return false;
        }
        i5(f2, k2, this.G0);
        return true;
    }

    protected void a5() {
        O0.fine("desktop info load finished");
        C2149c.d(this, 3600000L);
    }

    protected void b5() {
        Snackbar snackbar = this.D0;
        if (snackbar != null) {
            snackbar.x();
            this.D0 = null;
        }
        Snackbar snackbar2 = this.E0;
        if (snackbar2 != null) {
            snackbar2.x();
            this.E0 = null;
        }
        Snackbar snackbar3 = this.F0;
        if (snackbar3 != null) {
            snackbar3.x();
            this.F0 = null;
        }
    }

    public boolean c5() {
        return this.H0;
    }

    void d5(ax.c3.K k2) {
        this.G0.g(k2);
    }

    protected void e5() {
        new o().i(new Void[0]);
    }

    protected abstract void g5(boolean z);

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void h1(Bundle bundle) {
        super.h1(bundle);
        Z4();
    }

    public void h5() {
        if (b() == null) {
            return;
        }
        this.I0.g();
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(int i2, int i3, Intent intent) {
        if (b() == null) {
            return;
        }
        this.I0.b(b(), i2, i3, intent, new e(), new f());
    }

    protected void i5(UsbDevice usbDevice, ax.c3.K k2, ax.g3.e eVar) {
        if (f0() == null) {
            return;
        }
        if (this.C0 != null) {
            f0().unregisterReceiver(this.C0);
            this.C0 = null;
        }
        this.C0 = new k(eVar, k2);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.filemanager.action.USB_PERMISSION");
        ax.Q.b.i(f0(), this.C0, intentFilter, 2);
        UsbManager usbManager = (UsbManager) f0().getSystemService("usb");
        Intent intent = new Intent("com.filemanager.action.USB_PERMISSION");
        intent.setPackage(f0().getPackageName());
        try {
            usbManager.requestPermission(usbDevice, C3194l.b(f0(), 0, intent, 0));
        } catch (IllegalArgumentException | SecurityException e2) {
            ax.Ha.c.h().d("USB permission error").l(e2).h();
            E4(R.string.error, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.G0 = (ax.g3.e) activity;
    }

    public void j5(boolean z) {
        this.H0 = z;
    }

    protected void k5(ax.c3.K k2, float f2) {
        if (b() == null) {
            return;
        }
        Snackbar snackbar = this.F0;
        if (snackbar == null || !snackbar.M()) {
            Snackbar O = C3180B.O(R0().findViewById(R.id.snackbar_container), Html.fromHtml(N0(R.string.storage_is_full, k2.f(b()), "<font color='red'>" + C3180B.P(f2) + "</font>")), -2, R.string.analyze, true, new m(k2));
            this.D0 = O;
            D4(O);
        }
    }

    protected void l5() {
        new Handler(Looper.getMainLooper()).postDelayed(new c(), 500L);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.I0 = new ax.Q2.i(this);
    }

    protected void n5(int i2) {
        this.F0 = C3197o.n(f0().findViewById(android.R.id.content), R.string.request_storage_permissions, new l(i2));
    }

    protected void o5(long j2) {
        q5(Html.fromHtml(N0(R.string.msg_recycle_bin_deleted_size, "<font color='red'>" + C1809B.k(b(), j2) + "</font>")), 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.I0.c(i2, strArr, iArr, new j(), null);
    }

    protected void p5(long j2) {
        q5(Html.fromHtml(N0(R.string.msg_recycle_bin_full, "<font color='red'>" + C1809B.k(b(), j2) + "</font>")), -2);
    }

    protected void q5(CharSequence charSequence, int i2) {
        if (b() == null) {
            return;
        }
        Snackbar snackbar = this.F0;
        if (snackbar == null || !snackbar.M()) {
            Snackbar O = C3180B.O(R0().findViewById(R.id.snackbar_container), charSequence, i2, R.string.menu_open, true, new a());
            this.E0 = O;
            D4(O);
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        if (this.K0) {
            v5();
        }
    }

    public void s5(ax.c3.K k2, boolean z, String str) {
        ((MainActivity) f0()).K2(k2, z, str);
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (this.C0 != null) {
            b().unregisterReceiver(this.C0);
            this.C0 = null;
        }
    }

    protected void w5(Context context, AbstractC3428n abstractC3428n, ax.Z2.d dVar, HashMap<ax.Q2.f, C3603w.f> hashMap) {
        ax.Z2.d dVar2;
        int i2 = 0;
        while (i2 < abstractC3428n.getCount()) {
            ax.c3.K item = abstractC3428n.getItem(i2);
            ax.Q2.f d2 = item.d();
            if (ax.Q2.f.g0(d2)) {
                C3603w.f fVar = hashMap.get(d2);
                if (fVar != null) {
                    dVar2 = dVar;
                    dVar2.x(item, fVar.c, fVar.b, 0.0f, C1809B.j(context, fVar.b), C1809B.k(context, fVar.b));
                    dVar2.y(d2, fVar.d, fVar.e);
                } else {
                    dVar2 = dVar;
                    ax.Q2.d.c("updatelibaryadapter", new Exception("null scaninfo location:" + d2));
                }
            } else {
                dVar2 = dVar;
            }
            i2++;
            dVar = dVar2;
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z) {
            b5();
        } else {
            Z4();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public int x3() {
        return 0;
    }

    @Override // ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.l0;
    }

    /* renamed from: ax.d3.x$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: ax.d3.x$i */
    class i implements C1358n.c {
        i() {
        }

        @Override // ax.a3.C1358n.c
        public void P(C1358n c1358n) {
            if (AbstractC1936x.this.f0() == null) {
                return;
            }
            AbstractC1936x.this.h5();
        }

        @Override // ax.a3.C1358n.c
        public void G(C1358n c1358n) {
        }

        @Override // ax.a3.C1358n.c
        public void Z(C1358n c1358n) {
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void M4() {
    }

    @Override // ax.d3.AbstractC1927n
    public void Z3(String str) {
    }
}
