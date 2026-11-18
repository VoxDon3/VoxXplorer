package com.voxdon.xplorer.activity;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.UriPermission;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.J5.C0747h;
import ax.Q2.g;
import ax.S2.b;
import ax.T2.h;
import ax.V2.d;
import ax.V2.f;
import ax.W2.C1011c;
import ax.X2.Q;
import ax.a3.C1351g;
import ax.a3.C1352h;
import ax.a3.C1353i;
import ax.a3.C1358n;
import ax.a3.C1364u;
import ax.a3.C1365v;
import ax.a3.C1366w;
import ax.a3.DialogC1343B;
import ax.a3.U;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1835x;
import ax.c3.d0;
import ax.d3.AbstractC1927n;
import ax.d3.C1912b;
import ax.d3.e0;
import ax.d3.l0;
import ax.g3.c;
import ax.g3.e;
import ax.g3.k;
import ax.m3.C2514a;
import ax.t3.C3098a;
import ax.t3.j;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3189g;
import ax.x3.C3405A;
import ax.x3.C3418d;
import ax.x3.C3422h;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.C3583b;
import com.voxdon.xplorer.file.C3585d;
import com.voxdon.xplorer.file.C3588g;
import com.voxdon.xplorer.file.C3592k;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3598q;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.file.I;
import com.voxdon.xplorer.file.L;
import com.voxdon.xplorer.file.OneDriveFileHelper;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.W;
import com.voxdon.xplorer.file.Y;
import com.voxdon.xplorer.musicplayer.FullScreenPlayerActivity;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.service.FtpServerService;
import com.voxdon.xplorer.service.HttpServerService;
import com.voxdon.xplorer.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class MainActivity extends b implements e, l0.o, U.c {
    private static final Logger E0 = g.a(MainActivity.class);
    private View A;
    private TabLayout B;
    private FrameLayout C;
    private View D;
    private View E;
    private CoordinatorLayout F;
    private CoordinatorLayout G;
    private View H;
    private C3405A I;
    private ViewGroup J;
    private Toolbar K;
    private ListView L;
    private f M;
    private ax.Z2.l N;
    private d O;
    private View P;
    private Button Q;
    private ViewGroup R;
    private ViewGroup S;
    private C3422h T;
    private AbstractC1927n U;
    private Bookmark V;
    private ax.Z2.f W;
    private int Y;
    private Runnable a0;
    private Bookmark b0;
    private Runnable c0;
    private Bookmark d0;
    private long e0;
    private Toast f0;
    private long h0;
    private long i0;
    private View j0;
    private boolean k0;
    private Object l0;
    private K m0;
    private BroadcastReceiver n0;
    private BroadcastReceiver o0;
    private Boolean p0;
    private e0 r0;
    private boolean s0;
    private boolean u0;
    private DrawerLayout z;
    private final Object y = new Object();
    private ArrayList<J> X = new ArrayList<>();
    private boolean Z = false;
    private b.EnumC0188b g0 = b.EnumC0188b.NOT_LOADED;
    private CountDownLatch q0 = new CountDownLatch(1);
    private Handler t0 = new Handler();
    private c v0 = new D(100);
    Runnable w0 = new E();
    ax.i.r x0 = new C3574d(true);
    private Runnable y0 = new RunnableC3575e();
    k z0 = new C3576f();
    C1352h.c A0 = new C3577g();
    k B0 = new C3578h();
    ax.g3.b C0 = new C3579i();
    b.d D0 = new y();

    class A extends c {
        A() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            MainActivity.this.M2();
        }
    }

    class B extends BroadcastReceiver {
        B() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (!"local.intent.action.LICENSE_STATUS_CHANGED".equals(intent.getAction())) {
                "local.intent.action.SETTING_CHANGED".equals(intent.getAction());
            } else if (ax.t3.g.c()) {
                if (MainActivity.this.Q != null) {
                    MainActivity.this.Q.setVisibility(8);
                }
                j.a(context);
            }
        }
    }

    class C extends BroadcastReceiver {
        C() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("local.intent.action.USB_IS_EJECTING".equals(intent.getAction())) {
                MainActivity.this.D2(intent.getStringExtra("desc"));
            } else if ("local.intent.action.USB_IS_EJECTED".equals(intent.getAction())) {
                MainActivity.this.Q1();
            }
        }
    }

    class D extends c {
        D(long j) {
            super(j);
        }

        @Override // ax.g3.c
        public void a(View view) {
            AbstractC1927n x1 = MainActivity.this.x1();
            if (x1 instanceof ax.d3.E) {
                ((ax.d3.E) x1).na("toolbar_back");
            } else if ((x1 instanceof l0) && FtpServerService.x()) {
                ((l0) x1).c6();
            } else {
                MainActivity.this.m2(true, "toolbar_back");
            }
        }
    }

    class E implements Runnable {
        E() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MainActivity.this.H != null) {
                MainActivity.this.Q1();
            }
        }
    }

    class F implements Animation.AnimationListener {
        F() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (MainActivity.this.H != null) {
                MainActivity.this.H.setVisibility(8);
                MainActivity.this.H = null;
                MainActivity.this.B0();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public interface G {
        void a(AbstractC1927n abstractC1927n);
    }

    public interface H {
        void a(AbstractC1927n abstractC1927n);
    }

    public static class I extends AbstractC3199q<Long, Long, Long> {
        private MainActivity h;
        private boolean i;
        private boolean j;
        private CountDownLatch k;

        I(MainActivity mainActivity) {
            super(AbstractC3199q.e.HIGH);
            this.h = mainActivity;
            this.k = mainActivity.q0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Long g(Long... lArr) {
            if (ax.t3.k.v()) {
                ax.V2.b.d(this.h);
            }
            try {
                this.k.await(3000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            try {
                Thread.sleep(100L);
            } catch (Exception unused2) {
            }
            if (!ax.u3.z.y() && !ax.u3.z.t(this.h)) {
                boolean a = ax.u3.z.a(this.h);
                this.i = a;
                if (a) {
                    boolean F = ax.u3.z.F(this.h);
                    this.j = F;
                    if (!F) {
                        ax.Ha.c.h().f().b("WebView Locked detected!!").h();
                    } else if (!Q.J()) {
                        ax.u3.z.A(this.h);
                    }
                }
            }
            if (ax.X2.J.G() && j.b(this.h)) {
                j.p(this.h, false);
                C3180B.c0(this.h, UsbAttachActivity.class, false);
            }
            ax.Q2.m.d(this.h.getApplicationContext());
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Long l) {
            if (this.h.isFinishing()) {
                return;
            }
            if (this.i) {
                if (this.j) {
                    ax.u3.z.q(this.h);
                }
                ax.u3.z.g(this.h);
            }
            if (ax.t3.k.w(this.h)) {
                this.h.finish();
            }
        }
    }

    public interface J {
        void C();
    }

    enum K {
        NONE,
        LOADING,
        LOADING_SHOW_ADS_AFTER_LOAD,
        LOADED,
        CLOSED,
        FAILED_TO_LOAD_NO_FILL,
        FAILED_TO_LOAD_NETWORK
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$a, reason: case insensitive filesystem */
    class C3571a implements H {
        final /* synthetic */ boolean a;

        C3571a(boolean z) {
            this.a = z;
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.H
        public void a(AbstractC1927n abstractC1927n) {
            if (this.a && (abstractC1927n instanceof C1912b)) {
                ((C1912b) abstractC1927n).W5();
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$b, reason: case insensitive filesystem */
    class ViewTreeObserverOnPreDrawListenerC3572b implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC3572b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ax.u3.z.c(MainActivity.this);
            MainActivity.this.q0.countDown();
            MainActivity.this.z.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$c, reason: case insensitive filesystem */
    class RunnableC3573c implements Runnable {
        final /* synthetic */ Intent q;

        RunnableC3573c(Intent intent) {
            this.q = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.startActivity(this.q);
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$d, reason: case insensitive filesystem */
    class C3574d extends ax.i.r {
        C3574d(boolean z) {
            super(z);
        }

        @Override // ax.i.r
        public void d() {
            if (MainActivity.this.r0 != null && MainActivity.this.r0.X0() && MainActivity.this.r0.e3()) {
                return;
            }
            if (MainActivity.this.z.A(MainActivity.this.A)) {
                MainActivity.this.z.d(MainActivity.this.A);
                return;
            }
            if (MainActivity.this.Z1()) {
                MainActivity.this.R1();
                return;
            }
            if (MainActivity.this.x1() == null || MainActivity.this.x1().V2()) {
                return;
            }
            if (MainActivity.this.x1().z3() != ax.Q2.f.l0) {
                MainActivity.this.m2(true, "hw_back");
            } else if (ax.t3.g.c() || !C2514a.c(MainActivity.this)) {
                MainActivity.this.m1();
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$e, reason: case insensitive filesystem */
    class RunnableC3575e implements Runnable {
        RunnableC3575e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.u0 = false;
            MainActivity.this.p();
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$g, reason: case insensitive filesystem */
    class C3577g implements C1352h.c {
        C3577g() {
        }

        @Override // ax.a3.C1352h.c
        public void a(C1352h.d dVar) {
            if (MainActivity.this.n()) {
                return;
            }
            C1365v c1365v = new C1365v();
            Bundle bundle = new Bundle();
            if (dVar != null) {
                String str = dVar.b;
                if (str == null) {
                    bundle.putString("host", dVar.a);
                } else {
                    bundle.putString("host", str);
                    bundle.putString("display_name", dVar.a);
                }
            }
            bundle.putInt("action", 1);
            bundle.putInt("port", 0);
            bundle.putSerializable("location", ax.Q2.f.J0);
            c1365v.v2(bundle);
            c1365v.c3(MainActivity.this.getSupportFragmentManager(), "smb");
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$i, reason: case insensitive filesystem */
    class C3579i implements ax.g3.b {
        C3579i() {
        }

        @Override // ax.g3.b
        public void a(ax.Q2.f fVar, Object obj) {
            switch (z.a[fVar.ordinal()]) {
                case 1:
                    MainActivity.this.A(new C1352h(), "chooseSmb", true);
                    break;
                case 2:
                    C1365v c1365v = new C1365v();
                    Bundle bundle = new Bundle();
                    bundle.putInt("action", 1);
                    bundle.putInt("port", 0);
                    bundle.putSerializable("location", ax.Q2.f.J0);
                    c1365v.v2(bundle);
                    MainActivity.this.A(c1365v, "smb", true);
                    break;
                case 3:
                    C1365v c1365v2 = new C1365v();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("action", 1);
                    bundle2.putInt("port", C3598q.w0());
                    bundle2.putSerializable("location", ax.Q2.f.H0);
                    c1365v2.v2(bundle2);
                    MainActivity.this.A(c1365v2, "ftp", true);
                    break;
                case 4:
                    C1365v c1365v3 = new C1365v();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("action", 1);
                    bundle3.putInt("port", L.y0());
                    bundle3.putSerializable("location", ax.Q2.f.I0);
                    c1365v3.v2(bundle3);
                    MainActivity.this.A(c1365v3, "sftp", true);
                    break;
                case 5:
                    C1365v c1365v4 = new C1365v();
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("action", 1);
                    bundle4.putInt("port", W.w0());
                    bundle4.putSerializable("location", ax.Q2.f.K0);
                    c1365v4.v2(bundle4);
                    MainActivity.this.A(c1365v4, "webdav", true);
                    break;
                case 6:
                    MainActivity.this.j2();
                    C3592k.a s0 = C3592k.s0(MainActivity.this.getApplicationContext());
                    MainActivity mainActivity = MainActivity.this;
                    s0.k(mainActivity, mainActivity.B0);
                    break;
                case 7:
                    int g = C0747h.o().g(MainActivity.this);
                    if (g != 0) {
                        C0747h.o().l(MainActivity.this, g, 10002).show();
                        break;
                    } else {
                        try {
                            MainActivity mainActivity2 = MainActivity.this;
                            C1832u.q0(mainActivity2, com.voxdon.xplorer.file.r.A0(mainActivity2.getApplicationContext()).n(null), 1);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(MainActivity.this, R.string.error, 1).show();
                            return;
                        }
                    }
                case 8:
                    MainActivity.this.j2();
                    OneDriveFileHelper.j G0 = OneDriveFileHelper.G0(MainActivity.this.getApplicationContext());
                    MainActivity mainActivity3 = MainActivity.this;
                    G0.k(mainActivity3, mainActivity3.B0);
                    break;
                case 9:
                    MainActivity.this.j2();
                    Y.e t0 = Y.t0(MainActivity.this.getApplicationContext());
                    MainActivity mainActivity4 = MainActivity.this;
                    t0.k(mainActivity4, mainActivity4.B0);
                    break;
                case 10:
                    MainActivity.this.j2();
                    I.d r0 = com.voxdon.xplorer.file.I.r0(MainActivity.this.getApplicationContext());
                    MainActivity mainActivity5 = MainActivity.this;
                    r0.q(mainActivity5, mainActivity5.B0);
                    break;
                case 11:
                    MainActivity.this.j2();
                    com.voxdon.xplorer.file.D.a1(MainActivity.this.getApplicationContext()).n(MainActivity.this);
                    break;
                case 12:
                    MainActivity.this.j2();
                    com.voxdon.xplorer.file.H.U0(MainActivity.this.getApplicationContext()).l(MainActivity.this);
                    break;
                case 13:
                    MainActivity.this.j2();
                    C3585d.f r02 = C3585d.r0(MainActivity.this.getApplicationContext());
                    MainActivity mainActivity6 = MainActivity.this;
                    r02.k(mainActivity6, mainActivity6.B0);
                    break;
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$j, reason: case insensitive filesystem */
    class RunnableC3580j implements Runnable {
        final /* synthetic */ int c0;
        final /* synthetic */ ax.Q2.f q;

        RunnableC3580j(ax.Q2.f fVar, int i) {
            this.q = fVar;
            this.c0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.C1().s(this.q, this.c0);
            MainActivity.P0(MainActivity.this);
            MainActivity.this.N.h(this.q, this.c0);
            MainActivity.this.j2();
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$k, reason: case insensitive filesystem */
    class C3581k implements ax.g3.l {
        final /* synthetic */ String a;

        C3581k(String str) {
            this.a = str;
        }

        @Override // ax.g3.l
        public void d(ax.Q2.f fVar, int i) {
            MainActivity.this.q2(fVar, i);
        }

        @Override // ax.g3.l
        public void e(ax.Z2.s sVar) {
            MainActivity.this.g2(sVar, null, this.a);
        }
    }

    class l implements TabLayout.d {
        l() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            Object i = gVar.i();
            if (i != null) {
                MainActivity.this.L2(i.toString());
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    class m implements H {
        m() {
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.H
        public void a(AbstractC1927n abstractC1927n) {
            if (abstractC1927n instanceof ax.d3.E) {
                ax.d3.E e = (ax.d3.E) abstractC1927n;
                e.U6();
                e.J9(MainActivity.this.getApplicationContext(), true);
            }
        }
    }

    class n implements Runnable {
        final /* synthetic */ AbstractC1927n c0;
        final /* synthetic */ G q;

        n(G g, AbstractC1927n abstractC1927n) {
            this.q = g;
            this.c0 = abstractC1927n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.a(this.c0);
        }
    }

    class o implements Runnable {
        final /* synthetic */ Bookmark c0;
        final /* synthetic */ AbstractC1927n q;

        o(AbstractC1927n abstractC1927n, Bookmark bookmark) {
            this.q = abstractC1927n;
            this.c0 = bookmark;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.Z3(this.c0.w());
        }
    }

    class p implements G {
        final /* synthetic */ Runnable a;

        p(Runnable runnable) {
            this.a = runnable;
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.G
        public void a(AbstractC1927n abstractC1927n) {
            this.a.run();
        }
    }

    class q implements C3418d.h {
        q() {
        }

        @Override // ax.x3.C3418d.h
        public void a(int i) {
            MainActivity.this.B0();
        }
    }

    class r implements H {
        r() {
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.H
        public void a(AbstractC1927n abstractC1927n) {
            if (abstractC1927n instanceof ax.d3.E) {
                ((ax.d3.E) abstractC1927n).U6();
            }
        }
    }

    class s extends c {
        s() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            MainActivity.this.R1();
        }
    }

    class t implements View.OnKeyListener {
        t() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            View findViewById;
            if (i != 22 || keyEvent.getAction() != 0) {
                return false;
            }
            MainActivity.this.L.setItemsCanFocus(true);
            View selectedView = MainActivity.this.L.getSelectedView();
            if (selectedView != null && (findViewById = selectedView.findViewById(R.id.clear_button)) != null) {
                findViewById.requestFocus();
            }
            return true;
        }
    }

    class u implements AdapterView.OnItemClickListener {
        u() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ax.c3.K y1 = MainActivity.this.y1();
            String z1 = MainActivity.this.z1();
            if (y1 != null && z1 != null) {
                MainActivity.this.C1().a(Bookmark.i(MainActivity.this, y1, z1));
            }
            Bookmark bookmark = (Bookmark) MainActivity.this.M.getItem(i);
            if (bookmark != null) {
                ax.Q2.a.i().m("menu_drawer", "open_in_drawer").c("by", "top_window").c("tgt", bookmark.s().I()).e();
                MainActivity.this.R1();
                MainActivity.this.c2(bookmark, "history", null, null, null);
            }
        }
    }

    class v implements b.c {
        v() {
        }
    }

    class w implements b.a {
        w() {
        }
    }

    class y implements b.d {
        y() {
        }
    }

    static /* synthetic */ class z {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.L0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.J0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.H0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.I0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.Q2.f.K0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ax.Q2.f.N0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ax.Q2.f.O0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ax.Q2.f.P0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ax.Q2.f.Q0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ax.Q2.f.R0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ax.Q2.f.T0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ax.Q2.f.U0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ax.Q2.f.S0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D2(String str) {
        this.G.removeAllViews();
        View findViewById = getLayoutInflater().inflate(R.layout.view_storage_is_ejecting, (ViewGroup) this.G, true).findViewById(R.id.msg_container);
        this.H = findViewById;
        ((TextView) findViewById.findViewById(R.id.message1)).setText(getString(R.string.ext_media_unmounting_notification_title, str));
        this.H.startAnimation(AnimationUtils.loadAnimation(this, R.anim.dock_bottom_enter));
        B0();
        this.t0.postDelayed(this.w0, 30000L);
    }

    private void E2(Bookmark bookmark, ax.Z2.f fVar) {
        int i;
        ax.Q2.f J2;
        int c;
        if (fVar == null || !fVar.c()) {
            i = 0;
            J2 = (bookmark == null || bookmark.s().J() == null) ? null : bookmark.s().J();
        } else {
            J2 = fVar.a();
            i = fVar.b();
        }
        if (J2 == null || (c = this.N.c(J2, i)) < 0) {
            return;
        }
        c2(this.N.d(c), "show_parent", this.N.f(c), null, null);
    }

    private boolean F1(Intent intent) {
        if (intent == null || intent.getAction() == null || !"com.voxdon.xplorer.OPEN_ANALYSIS".equals(intent.getAction())) {
            return false;
        }
        ax.c3.K d = intent.getData() != null ? ax.Z2.k.a(intent.getData()).d() : null;
        if (d != null) {
            ax.Q2.a.i().m("notification", "storage_full_noti_clicked").c("loc", d.d().I()).e();
            K2(d, true, "notification");
        } else {
            K2(null, false, "notification");
        }
        return true;
    }

    private boolean G1(Intent intent) {
        if (intent != null && !intent.getBooleanExtra("com.filemanager.extra.HAS_PENDING_DIALOG", false)) {
            return false;
        }
        CommandService q2 = CommandService.q();
        if (q2 != null) {
            q2.G(this);
        }
        ax.s3.u.j(this).a(102);
        return true;
    }

    private boolean H1(Intent intent) {
        Bookmark c;
        if (intent == null || intent.getAction() == null || !"com.voxdon.xplorer.OPEN_FILE".equals(intent.getAction()) || intent.getData() == null || (c = Bookmark.c(this, intent.getData())) == null) {
            return false;
        }
        c2(c, null, null, null, null);
        return true;
    }

    private boolean I1(Intent intent) {
        boolean z2 = false;
        if (intent != null && intent.getAction() != null && "com.voxdon.xplorer.SAVE_FILE".equals(intent.getAction())) {
            q0("save_file");
            AbstractC1927n d0 = d0();
            z2 = true;
            if (d0 != null) {
                d0.e4(true);
            }
        }
        return z2;
    }

    private void J1(Intent intent) {
        g0().m(false);
        if (M1(intent) || H1(intent) || F1(intent) || I1(intent) || K1(intent) || P1(intent) || G1(intent) || L1(intent) || O1(intent)) {
            return;
        }
        N1(intent);
    }

    private boolean K1(Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return false;
        }
        String action = intent.getAction();
        if (!"android.intent.action.GET_CONTENT".equals(action) && !"android.intent.action.OPEN_DOCUMENT".equals(action) && !"android.intent.action.PICK".equals(action) && !"android.intent.action.CREATE_SHORTCUT".equals(action)) {
            return false;
        }
        if (C1011c.q().v()) {
            C1011c.q().l();
        }
        boolean booleanExtra = Q.l1() ? intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false) : false;
        g0().i(intent.getStringExtra("com.filemanager.plugin.extra.CALLING_PACKAGE"));
        g0().l(intent.getAction());
        g0().m(true);
        g0().k(booleanExtra);
        g0().j(intent.getType());
        return true;
    }

    private boolean L1(Intent intent) {
        if (intent == null || intent.getAction() == null || !"com.filemanager.SET_PERMISSION".equals(intent.getAction())) {
            return false;
        }
        this.s0 = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2(String str) {
        int i;
        int i2 = 0;
        int i3 = 4;
        if ("Favorite".equals(str)) {
            i = 4;
        } else if ("History".equals(str)) {
            i = 4;
            i2 = 4;
            i3 = 0;
        } else {
            i = "LastVisited".equals(str) ? 0 : 4;
            i2 = 4;
        }
        View view = this.D;
        if (view != null) {
            view.setVisibility(i2);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setVisibility(i3);
        }
        View view3 = this.P;
        if (view3 != null) {
            view3.setVisibility(i);
        }
    }

    private boolean M1(Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return false;
        }
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("com.example.android.uamp.open_ui")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("PLAY_FOLDER_URI");
        Intent putExtra = new Intent(this, (Class<?>) FullScreenPlayerActivity.class).setFlags(603979776).putExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION", intent.getParcelableExtra("com.example.android.uamp.CURRENT_MEDIA_DESCRIPTION"));
        if (stringExtra == null) {
            startActivity(putExtra);
            return true;
        }
        if (intent.getBooleanExtra("com.example.android.uamp.EXTRA_START_FULLSCREEN", false)) {
            e2(stringExtra, new RunnableC3573c(putExtra));
            return true;
        }
        e2(stringExtra, null);
        return true;
    }

    private boolean N1(Intent intent) {
        if (intent != null && intent.getAction() != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && "content".equals(intent.getData().getScheme())) {
            Toast.makeText(this, R.string.error_invalid_file_format, 1).show();
        }
        return false;
    }

    private AbstractC1927n N2(ax.Q2.f fVar, int i, Bundle bundle, ax.Z2.f fVar2) {
        String p1 = p1(fVar, i);
        AbstractC1927n abstractC1927n = (AbstractC1927n) getSupportFragmentManager().k0(p1);
        if (abstractC1927n == null) {
            abstractC1927n = b2(fVar);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSerializable("location", fVar);
            bundle.putInt("location_key", i);
            abstractC1927n.v2(bundle);
        }
        if (abstractC1927n instanceof ax.d3.E) {
            ax.d3.E e = (ax.d3.E) abstractC1927n;
            if (fVar2 == null || !fVar2.c()) {
                e.E9(null);
            } else {
                e.E9(fVar2.a());
            }
        }
        r2(abstractC1927n, p1);
        return abstractC1927n;
    }

    private boolean O1(Intent intent) {
        if (intent == null || intent.getAction() == null || !"android.intent.action.VIEW_DOWNLOADS".equals(intent.getAction())) {
            return false;
        }
        ax.c3.K k = ax.c3.K.i;
        c2(Bookmark.i(this, k, k.e()), null, null, null, null);
        return true;
    }

    private void O2() {
        C3189g.a().h(this.n0);
        C3189g.a().h(this.o0);
        this.t0.removeCallbacks(this.w0);
    }

    static /* synthetic */ ax.V2.e P0(MainActivity mainActivity) {
        mainActivity.getClass();
        return null;
    }

    private boolean P1(Intent intent) {
        List<ax.Z2.s> n2;
        String path;
        boolean z2 = false;
        if (intent != null && intent.getAction() != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) {
            Uri data = intent.getData();
            String scheme = intent.getData().getScheme();
            if ("content".equals(scheme) && "com.android.externalstorage.documents".equals(intent.getData().getHost())) {
                String r2 = C3588g.r(data);
                if (r2 == null) {
                    return false;
                }
                c2(Bookmark.g(this, d0.U(r2)), null, null, null, null);
                return true;
            }
            if (scheme == null || "file".equals(scheme)) {
                String path2 = data.getPath();
                if (path2 == null) {
                    return false;
                }
                c2(Bookmark.g(this, d0.U(path2)), null, null, null, null);
                return true;
            }
            if ("smb".equals(scheme) || "ftp".equals(scheme) || "sftp".equals(scheme)) {
                String host = data.getHost();
                if ("smb".equals(scheme)) {
                    n2 = com.voxdon.xplorer.file.Q.t0(this).n();
                } else if ("ftp".equals(scheme)) {
                    n2 = C3598q.z0(this).p();
                } else {
                    if (!"sftp".equals(scheme)) {
                        return false;
                    }
                    n2 = L.A0(this).n();
                }
                ax.c3.K k = null;
                for (ax.Z2.s sVar : n2) {
                    if (sVar.c() != null && sVar.c().equals(host)) {
                        k = sVar.e();
                    }
                }
                if (k == null || (path = data.getPath()) == null) {
                    return false;
                }
                c2(Bookmark.i(this, k, d0.U(path)), null, null, null, null);
                return true;
            }
            if ("content".equals(scheme) && "com.android.mtp.documents".equals(intent.getData().getHost()) && Q.k1()) {
                try {
                    List<UriPermission> persistedUriPermissions = getContentResolver().getPersistedUriPermissions();
                    Uri r0 = ax.c3.L.r0(intent.getData());
                    if (persistedUriPermissions != null) {
                        boolean z3 = false;
                        for (UriPermission uriPermission : persistedUriPermissions) {
                            if (uriPermission.getUri() != null && uriPermission.getUri().equals(r0)) {
                                z3 = true;
                            }
                        }
                        z2 = z3;
                    }
                    if (z2) {
                        ax.Z2.j.F().t();
                    } else {
                        ax.c3.K V0 = ax.Z2.j.F().V0(intent.getData());
                        if (V0 != null) {
                            R(0, V0, null, true, true);
                        }
                    }
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1() {
        if (this.H == null) {
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.dock_bottom_exit);
        loadAnimation.setAnimationListener(new F());
        this.H.startAnimation(loadAnimation);
    }

    private void Q2() {
        R2();
    }

    private void R2() {
        Bookmark bookmark = this.V;
        if (bookmark == null || bookmark.s() != ax.Q2.f.l0) {
            this.T.l(true);
            Bookmark bookmark2 = this.V;
            if (bookmark2 == null || bookmark2.s() != ax.Q2.f.s1) {
                this.T.m(R.drawable.abc_ic_ab_back_material);
            } else {
                this.T.m(R.drawable.ic_clear_material);
            }
        } else {
            this.T.i();
            this.T.l(false);
        }
        k2();
    }

    private void S1() {
        this.T.n(this.v0);
    }

    private void a2() {
        k2();
    }

    private AbstractC1927n b2(ax.Q2.f fVar) {
        if (fVar.A() == null) {
            return null;
        }
        try {
            return fVar.A().newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void i1() {
        if (this.f0 != null) {
            this.t0.removeCallbacks(this.y0);
            this.f0.cancel();
            this.f0 = null;
        }
    }

    private void k1(Bundle bundle) {
        Object obj = bundle.get("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (obj instanceof Bundle) {
            Object obj2 = ((Bundle) obj).get("android:support:fragments");
            if (obj2 instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj2;
                for (String str : bundle2.keySet()) {
                    if (str != null && str.startsWith("fragment_")) {
                        Object obj3 = bundle2.get(str);
                        if (obj3 instanceof Bundle) {
                            Object obj4 = ((Bundle) obj3).get("state");
                            if ((obj4 instanceof Parcelable) && C3180B.x((Parcelable) obj4) >= 524288) {
                                androidx.fragment.app.q.a(obj4);
                            }
                        }
                    }
                }
            }
        }
    }

    private void k2() {
        Bookmark bookmark = this.V;
        if (bookmark == null || !ax.Q2.f.n(bookmark.s()) || T1() || !W1() || C1().i() <= 1) {
            this.T.r(false);
            this.T.k(false);
        } else {
            this.T.r(true);
            this.T.k(true);
        }
    }

    private void l1() {
        if (this.l0 != null) {
            this.l0 = null;
        }
    }

    private void l2() {
        this.n0 = new B();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("local.intent.action.LICENSE_STATUS_CHANGED");
        intentFilter.addAction("local.intent.action.SETTING_CHANGED");
        C3189g.a().c(intentFilter, this.n0);
        this.o0 = new C();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("local.intent.action.USB_IS_EJECTING");
        intentFilter2.addAction("local.intent.action.USB_IS_EJECTED");
        C3189g.a().c(intentFilter2, this.o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1() {
        if (this.e0 + 3500 > System.currentTimeMillis()) {
            ax.Q2.a.i().m("general", "double_back_exit").c("from", "Main").e();
            finish();
            i1();
            return;
        }
        if (U1() && C3098a.k(b())) {
            C3180B.d0(getSupportFragmentManager(), new C1366w(), "exitads", true);
        } else {
            if (!j.e(this)) {
                j.r(this);
            }
            this.u0 = true;
            p();
            this.t0.postDelayed(this.y0, 3500L);
            try {
                Toast makeText = Toast.makeText(this, R.string.back_again_to_exit, 1);
                this.f0 = makeText;
                makeText.show();
            } catch (NullPointerException | SecurityException unused) {
            }
        }
        this.e0 = System.currentTimeMillis();
    }

    private void n1(boolean z2) {
        if (z2) {
            this.S.setDescendantFocusability(131072);
        } else {
            this.S.setDescendantFocusability(393216);
        }
    }

    private void n2(String str) {
        Fragment k0 = getSupportFragmentManager().k0(str);
        if (k0 != null) {
            if (k0 instanceof AbstractC1927n) {
                ((AbstractC1927n) k0).q4();
            }
            getSupportFragmentManager().o().q(k0).j();
        }
    }

    private void o1(boolean z2) {
        if (z2) {
            this.R.setDescendantFocusability(131072);
        } else {
            this.R.setDescendantFocusability(393216);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        boolean z2 = true;
        if (x1() != null && x1().z3() == ax.Q2.f.l0) {
            z2 = true ^ this.u0;
        }
        this.x0.j(z2);
    }

    private String p1(ax.Q2.f fVar, int i) {
        return fVar.I() + i;
    }

    private String q1(Bookmark bookmark) {
        return p1(bookmark.s(), bookmark.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q2(ax.Q2.f fVar, int i) {
        n2(p1(fVar, i));
        runOnUiThread(new RunnableC3580j(fVar, i));
    }

    private void r2(AbstractC1927n abstractC1927n, String str) {
        AbstractC1927n d0;
        if (this.Z || (d0 = d0()) == abstractC1927n) {
            return;
        }
        androidx.fragment.app.t o2 = getSupportFragmentManager().o();
        if (d0 != null && !d0.O3()) {
            o2.p(d0);
        }
        if (abstractC1927n.X0()) {
            o2.v(abstractC1927n);
        } else {
            o2.c(R.id.fragment_container, abstractC1927n, str);
        }
        o2.j();
    }

    private void u2(Bookmark bookmark, ax.Z2.f fVar, AbstractC1927n abstractC1927n) {
        Bookmark f = Bookmark.f(bookmark);
        f.G(abstractC1927n.C3());
        this.N.a(f, fVar);
        this.V = f;
        this.W = fVar;
        this.U = abstractC1927n;
        v2(f);
        p();
    }

    private void v2(Bookmark bookmark) {
        if (getSupportActionBar() == null || this.T == null) {
            return;
        }
        String H2 = ax.Q2.f.H(this, bookmark.u());
        String G2 = ax.Q2.f.G(this, bookmark.u());
        if (bookmark.s() == ax.Q2.f.l0) {
            this.T.p(R.string.app_name);
        } else if (bookmark.s() == ax.Q2.f.i1) {
            int t2 = bookmark.t();
            if (h.C0(t2)) {
                this.T.q(H2);
            } else {
                this.T.q(ax.Q2.f.H(this, h.q(t2)));
            }
        } else {
            this.T.q(H2);
        }
        if (G2 != null) {
            this.T.o(G2);
        } else {
            this.T.o(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ax.c3.K y1() {
        AbstractC1927n d0 = d0();
        if (d0 == null) {
            return null;
        }
        return d0.A3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String z1() {
        AbstractC1927n d0 = d0();
        if (d0 == null) {
            return null;
        }
        return d0.C3();
    }

    public View A1() {
        return this.j0;
    }

    public void A2() {
        if (n()) {
            return;
        }
        C1353i.d3().c3(getSupportFragmentManager(), "add_sublocation");
    }

    public long B1() {
        return this.h0;
    }

    public void B2() {
        if (n()) {
            return;
        }
        new C1351g().c3(getSupportFragmentManager(), "add_sublocation");
    }

    public d C1() {
        if (this.O == null) {
            d dVar = new d(this);
            this.O = dVar;
            dVar.o();
        }
        return this.O;
    }

    public void C2() {
        if (n()) {
            return;
        }
        C1353i.e3().c3(getSupportFragmentManager(), "add_sublocation");
    }

    public k D1() {
        return this.z0;
    }

    public ax.g3.l E1(String str) {
        return new C3581k(str);
    }

    public void F2(boolean z2) {
        Fragment k0 = getSupportFragmentManager().k0("permission_screen");
        androidx.fragment.app.t o2 = getSupportFragmentManager().o();
        if (k0 != null) {
            o2.q(k0);
        }
        e0 V2 = e0.V2(z2);
        this.r0 = V2;
        o2.c(R.id.root_view, V2, "permission_screen");
        o2.j();
        this.z.setVisibility(4);
    }

    public void G2(String str) {
        c2(Bookmark.m(this, ax.Q2.f.p1, 0), str, null, null, null);
    }

    public void H2(ax.c3.K k, String str) {
        d2(k, true, Bookmark.m(this, ax.Q2.f.p1, 0), str);
    }

    public void I2() {
        Object obj;
        if (this.m0 == null) {
            C3184b.g("rewarded ads null?");
            return;
        }
        try {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment k0 = supportFragmentManager.k0("progress");
            if (k0 != null) {
                androidx.fragment.app.t o2 = supportFragmentManager.o();
                o2.q(k0);
                o2.j();
            }
        } catch (Exception unused) {
        }
        K k = this.m0;
        if (k == K.LOADING) {
            this.m0 = K.LOADING_SHOW_ADS_AFTER_LOAD;
            A(new ax.a3.D(), "progress", true);
        } else {
            if (k == K.FAILED_TO_LOAD_NO_FILL) {
                h2();
                return;
            }
            if (k == K.FAILED_TO_LOAD_NETWORK) {
                Toast.makeText(this, R.string.error_network, 1).show();
            } else {
                if (k != K.LOADED || (obj = this.l0) == null) {
                    return;
                }
                ax.S2.b.m(this, obj, this.D0);
            }
        }
    }

    public void J2(boolean z2, String str) {
        if (n()) {
            return;
        }
        ax.Q2.a.i().m("ads", "rewarded_ads_open").c("from", str).e();
        C1358n k3 = C1358n.k3(z2 ? R.string.remove_ads : R.string.rewarded_video_title, R.string.rewarded_video_message, R.string.rewarded_video_watch, android.R.string.cancel);
        k3.c3(getSupportFragmentManager(), "rewardads");
        k3.n3(new x(str));
    }

    public void K2(ax.c3.K k, boolean z2, String str) {
        c2(Bookmark.n(this, h.B(k)), str, null, new C3571a(z2), null);
    }

    @Override // com.voxdon.xplorer.activity.b
    public void L0() {
        Q2();
        invalidateOptionsMenu();
        o1(true);
    }

    public void M2() {
        if (this.J == null) {
            s sVar = new s();
            this.J = (ViewGroup) findViewById(R.id.top_windows);
            Toolbar toolbar = (Toolbar) findViewById(R.id.top_windows_toolbar);
            this.K = toolbar;
            toolbar.setNavigationIcon(R.drawable.ic_clear_material);
            this.K.setNavigationOnClickListener(sVar);
            this.K.setNavigationContentDescription(R.string.close_button_text);
            this.J.setOnClickListener(sVar);
            ListView listView = (ListView) findViewById(R.id.top_windows_list);
            this.L = listView;
            listView.setOnKeyListener(new t());
            f fVar = new f(this, C1());
            this.M = fVar;
            this.L.setAdapter((ListAdapter) fVar);
            this.L.setOnItemClickListener(new u());
        }
        this.J.setVisibility(0);
        TextView textView = (TextView) this.K.findViewById(R.id.top_windows_title);
        TextView textView2 = (TextView) this.K.findViewById(R.id.top_windows_subtitle);
        textView.setText(this.T.h());
        String g = this.T.g();
        if (TextUtils.isEmpty(g)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(g);
            textView2.setVisibility(0);
        }
        this.L.startAnimation(AnimationUtils.loadAnimation(this, R.anim.top_window_in));
        this.M.d(y1(), z1());
        o1(false);
        n1(false);
        this.J.requestFocus();
    }

    public void P2(ax.Q2.f fVar, int i) {
        this.N.l(fVar, i);
    }

    public void R1() {
        ViewGroup viewGroup = this.J;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
        o1(true);
        n1(true);
        this.S.requestFocus();
        k2();
    }

    public boolean T1() {
        return x1() != null && x1().K3();
    }

    public boolean U1() {
        return this.j0 != null && this.k0;
    }

    public boolean V1() {
        return this.s0;
    }

    public boolean W1() {
        return this.O != null;
    }

    public boolean X1() {
        e0 e0Var = this.r0;
        if (e0Var == null) {
            return false;
        }
        return e0Var.X0();
    }

    public boolean Y1() {
        return this.m0 == K.LOADED && this.l0 != null;
    }

    public boolean Z1() {
        ViewGroup viewGroup = this.J;
        return viewGroup != null && viewGroup.getVisibility() == 0;
    }

    @Override // ax.d3.l0.o
    public void a(String str) {
        AbstractC1927n x1 = x1();
        if ((x1 instanceof ax.d3.Q) && x1.C3().equals(str)) {
            ((ax.d3.Q) x1).j9();
        }
    }

    @Override // com.voxdon.xplorer.activity.b
    public void a0(ax.Q2.f fVar, int i, String str) {
        String p1 = p1(fVar, i);
        Bookmark bookmark = this.V;
        if (bookmark != null && q1(bookmark).equals(p1)) {
            m2(true, str);
        } else {
            n2(p1);
            this.N.h(fVar, i);
        }
    }

    @Override // ax.a3.U.c
    public void c(ax.Q2.f fVar, String str) {
        if (fVar == ax.Q2.f.T0) {
            com.voxdon.xplorer.file.D.a1(getApplicationContext()).k(this, str, this.B0);
        } else if (fVar == ax.Q2.f.U0) {
            com.voxdon.xplorer.file.H.U0(getApplicationContext()).k(this, str, this.B0);
        } else {
            C3184b.f();
        }
    }

    public void c2(Bookmark bookmark, String str, ax.Z2.f fVar, H h, G g) {
        Bundle bundle;
        if (this.Z) {
            ax.Ha.c.h().d("OPEN_BOOKMARK_AFTER_DESTORY").j().g("from:" + str).h();
            return;
        }
        ax.Q2.f s2 = bookmark.s();
        int t2 = bookmark.t();
        if (s2 == ax.Q2.f.Y0) {
            B2();
            return;
        }
        if (s2 == ax.Q2.f.Z0) {
            startActivity(new Intent(this, (Class<?>) PaymentActivity.class));
            return;
        }
        if (s2 == ax.Q2.f.X0) {
            e2(C1809B.U(bookmark.u(), bookmark.w()), null);
            return;
        }
        if (s2 == ax.Q2.f.a1) {
            startActivityForResult(new Intent(this, (Class<?>) DevSettingsActivity.class), 10004);
            return;
        }
        Bundle bundle2 = new Bundle();
        if (fVar != null && fVar.c()) {
            bundle2.putSerializable("parent_location", fVar.a());
        }
        if (fVar != null && (bundle = fVar.d0) != null) {
            bundle2.putAll(bundle);
        }
        AbstractC1927n N2 = N2(s2, t2, bundle2, fVar);
        if (str != null) {
            E0.fine("Open location : " + s2.I());
            ax.Q2.a.i().n("navigation", "open_location").c("loc", s2.I()).c("from", str).e();
        }
        if (N2 != null) {
            if (h != null) {
                h.a(N2);
            }
            if (g != null) {
                y2(bookmark, new n(g, N2));
            }
            if (bookmark.w() == null && bookmark.u().e() != null) {
                if (bookmark.s() != ax.Q2.f.V0) {
                    ax.Ha.c.h().f().d("!!INVLIAD OPEN PATH!!").j().g(bookmark.s().I() + "," + bookmark.z()).h();
                }
                bookmark.G(bookmark.u().e());
            }
            if (bookmark.A()) {
                N2.Z3(bookmark.w());
            } else {
                Bookmark f = Bookmark.f(bookmark);
                f.G(d0.r(bookmark.w()));
                x2(f, new o(N2, bookmark));
                N2.Z3(f.w());
            }
            N2.n4(fVar);
            u2(bookmark, fVar, N2);
            M0();
        }
        Q2();
    }

    @Override // com.voxdon.xplorer.activity.b
    public AbstractC1927n d0() {
        return this.U;
    }

    public void d2(ax.c3.K k, boolean z2, Bookmark bookmark, String str) {
        if (k.d() == ax.Q2.f.i1) {
            c2(bookmark, str, new ax.Z2.f(k, z2), new m(), null);
        } else {
            c2(bookmark, str, new ax.Z2.f(k, z2), null, null);
        }
    }

    @Override // com.voxdon.xplorer.activity.b
    public C3422h e0() {
        return this.T;
    }

    public void e2(String str, Runnable runnable) {
        C3583b c3583b;
        Uri O0;
        Uri parse = Uri.parse(str);
        if (ax.Z2.k.g(parse, ax.Q2.f.X0)) {
            ax.Z2.k a = ax.Z2.k.a(parse);
            C3596o e = C1835x.e(a.d());
            boolean a2 = e.a();
            if (a2) {
                C3583b c3583b2 = (C3583b) e.u();
                c3583b = c3583b2;
                O0 = c3583b2.O0();
            } else {
                O0 = C3583b.P0(a.d());
                c3583b = null;
            }
            if (O0 == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setComponent(new ComponentName(this, (Class<?>) ArchiveActivity.class));
                intent.putExtra("data_uri", O0);
                intent.putExtra("open_uri", parse);
                if (a2) {
                    e.n0();
                    intent.putExtra("open_uri_release", true);
                }
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
            if (c3583b != null && c3583b.N0() == 1 && c3583b.V0() != null) {
                E0.fine("Open local file archive viewer : " + O0);
                C3605y V0 = c3583b.V0();
                if (!ax.Z2.a.p(this, V0.T())) {
                    parse = Uri.parse(V0.S());
                }
                parse = null;
            } else if (C1832u.P(O0)) {
                String r2 = d0.r(O0.getPath());
                if (!ax.Z2.a.p(this, r2)) {
                    parse = Uri.parse(C1809B.U(C1835x.g(r2).T(), r2));
                }
                parse = null;
            } else {
                if (MyFileProvider.B(O0) || MyFileProvider.A(O0)) {
                    E0.fine("Open document file archive viewer : " + O0);
                    ax.Z2.k e2 = MyFileProvider.e(O0);
                    if (e2 == null) {
                        return;
                    } else {
                        parse = Uri.parse(C1809B.U(e2.d(), d0.r(e2.e())));
                    }
                }
                parse = null;
            }
        }
        if (parse == null) {
            return;
        }
        Bookmark c = Bookmark.c(this, parse);
        if (c != null) {
            c2(c, "location_uri", null, null, runnable != null ? new p(runnable) : null);
            return;
        }
        throw new IllegalArgumentException("Illegal location uri : " + parse.toString());
    }

    public void f2(ax.c3.K k, Bundle bundle) {
        c2(Bookmark.m(this, ax.Q2.f.s1, k.hashCode()), "search", new ax.Z2.f(k, false, bundle), null, null);
    }

    @Override // ax.g3.e
    public void g(ax.c3.K k) {
        if (k.d() != ax.Q2.f.p0 || ax.Z2.j.F().t0()) {
            c2(Bookmark.n(getApplicationContext(), k), "home", null, new r(), null);
        } else if (ax.Z2.j.F().v0()) {
            N(k);
        } else {
            Toast.makeText(this, R.string.storage_not_available, 1).show();
        }
    }

    public void g2(ax.Z2.s sVar, ax.c3.K k, String str) {
        Bookmark o2 = Bookmark.o(sVar);
        if (k != null) {
            d2(k, false, o2, str);
        } else {
            c2(o2, str, null, null, null);
        }
    }

    @Override // com.voxdon.xplorer.activity.b
    public C3405A h0() {
        if (this.I == null) {
            C3405A c3405a = new C3405A(this, findViewById(R.id.paste_layout), findViewById(R.id.paste_layout_safe_area));
            this.I = c3405a;
            c3405a.D();
            this.I.v(new q());
        }
        return this.I;
    }

    public void h1(J j) {
        this.X.add(j);
    }

    public void h2() {
        C3098a.f(this);
        C3189g.a().e(new Intent("local.intent.action.LICENSE_STATUS_CHANGED"));
        this.m0 = K.NONE;
        l1();
    }

    public void i2(ax.Q2.f fVar, int i) {
        j2();
        P2(fVar, i);
        v2(this.V);
    }

    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z2) {
        if (C3098a.i() || m0()) {
            return true;
        }
        C3405A c3405a = this.I;
        if (c3405a != null && c3405a.m()) {
            return true;
        }
        View view = this.H;
        return view != null && view.getVisibility() == 0;
    }

    public void j1() {
        View view = this.j0;
        if (view != null) {
            ax.S2.b.a(view, this);
            this.j0 = null;
        }
    }

    public void j2() {
        s2();
    }

    public void m2(boolean z2, String str) {
        if (this.z.A(this.A)) {
            this.z.d(this.A);
        }
        Bookmark bookmark = this.V;
        ax.Z2.f fVar = this.W;
        if (bookmark != null) {
            n2(q1(bookmark));
            this.N.h(bookmark.s(), bookmark.t());
        }
        c2(Bookmark.l(this, ax.Q2.f.l0), str, null, null, null);
        if (bookmark == null || !z2) {
            return;
        }
        E2(bookmark, fVar);
    }

    public void o2() {
        if (this.r0 == null) {
            return;
        }
        androidx.fragment.app.t o2 = getSupportFragmentManager().o();
        o2.q(this.r0);
        o2.j();
        this.r0 = null;
        this.z.setVisibility(0);
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1 || intent == null || intent.getExtras() == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
                return;
            }
            com.voxdon.xplorer.file.r.A0(getApplicationContext()).k(stringExtra, this.B0);
            return;
        }
        if (i != 10004) {
            if (i != 10006) {
                return;
            }
            com.voxdon.xplorer.file.I.r0(getApplicationContext()).t(i2, intent);
        } else {
            int k = ax.t3.k.k();
            if (this.Y != k) {
                this.Y = k;
                Q2();
            }
        }
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z2) {
        if (z2) {
            this.C.setPadding(0, 0, 0, 0);
        } else {
            this.C.setPadding(0, 0, 0, bVar.d);
        }
    }

    @Override // androidx.fragment.app.f
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override // com.voxdon.xplorer.activity.b, ax.n.ActivityC2561c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ax.u3.z.c(this);
        J();
    }

    @Override // com.voxdon.xplorer.activity.b, com.voxdon.xplorer.activity.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        MainActivity mainActivity;
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        if (Q.N1() && ax.u3.z.w(this)) {
            ax.X2.v.r(getWindow(), -16777216);
        }
        if (getSupportFragmentManager().v0() != null) {
            androidx.fragment.app.t o2 = getSupportFragmentManager().o();
            for (Fragment fragment : getSupportFragmentManager().v0()) {
                if (fragment instanceof AbstractC1927n) {
                    o2.p(fragment);
                } else if (fragment instanceof e0) {
                    o2.q(fragment);
                }
            }
            o2.j();
        }
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.z = drawerLayout;
        drawerLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC3572b());
        this.z.setDrawerLockMode(1);
        this.F = (CoordinatorLayout) findViewById(R.id.ad_container);
        this.G = (CoordinatorLayout) findViewById(R.id.activity_message_container);
        this.R = (ViewGroup) findViewById(R.id.toolbar_container);
        this.S = (ViewGroup) findViewById(R.id.fragment_container);
        this.A = findViewById(R.id.tab_view);
        this.B = (TabLayout) findViewById(R.id.tab_layout);
        this.C = (FrameLayout) findViewById(R.id.tab_content);
        this.B.s();
        this.B.h(new l());
        C3422h c3422h = new C3422h(this, this.R);
        this.T = c3422h;
        c3422h.s(new A());
        k0();
        this.Y = ax.t3.k.k();
        this.N = new ax.Z2.l(this);
        S1();
        if (bundle == null) {
            mainActivity = this;
            mainActivity.c2(Bookmark.l(this, ax.Q2.f.l0), "on_create", null, null, null);
            getSupportFragmentManager().g0();
            J1(getIntent());
        } else {
            mainActivity = this;
            Q2();
        }
        getOnBackPressedDispatcher().h(this, mainActivity.x0);
        new I(this).h(new Long[0]);
        l2();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || menu == this.T.f()) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // com.voxdon.xplorer.activity.b, com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        this.Z = true;
        super.onDestroy();
        j1();
        O2();
        l1();
        i1();
        View s1 = s1();
        if (s1 != null) {
            ax.S2.b.a(s1, this);
            this.F.removeAllViews();
        }
    }

    @Override // ax.n.ActivityC2561c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (x1() == null || !x1().Y3(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i != 4 || x1() == null) {
            return super.onKeyLongPress(i, keyEvent);
        }
        q0("long_back");
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ax.u3.z.c(this);
        J1(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_refresh /* 2131362530 */:
                ax.Q2.a.i().m("menu_folder", "refresh").c("loc", this.V.s().I()).e();
                AbstractC1927n x1 = x1();
                if (x1 != null) {
                    x1.c4(true);
                }
            case android.R.id.home:
                return true;
            case R.id.menu_settings /* 2131362544 */:
                ax.Q2.a.i().m("menu_desktop", "general_settings").e();
                startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
            case R.id.menu_search /* 2131362538 */:
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        super.onPause();
        View view = this.j0;
        if (view != null) {
            ax.S2.b.c(view, this);
        }
        View s1 = s1();
        if (s1 != null) {
            ax.S2.b.c(s1, this);
        }
    }

    @Override // com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.voxdon.xplorer.activity.a, android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.V = (Bookmark) bundle.getSerializable("CURRENT_BOOKMARK");
        this.W = (ax.Z2.f) bundle.getParcelable("CURRENT_EXTRAINFO");
        ArrayList<Bookmark> arrayList = (ArrayList) bundle.getSerializable("OPEN_BOOKMARK");
        ArrayList<ax.Z2.f> arrayList2 = (ArrayList) bundle.getSerializable("OPEN_EXTRAINFOS");
        if (arrayList != null) {
            this.N.i(arrayList);
        }
        if (arrayList2 != null) {
            this.N.j(arrayList2);
        }
        Bookmark bookmark = this.V;
        if (bookmark != null) {
            c2(bookmark, "on_restore_instance", this.W, null, null);
        }
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        C3592k.s0(getApplicationContext()).p(this);
        j2();
        HttpServerService.v(this);
        View view = this.j0;
        if (view != null) {
            ax.S2.b.l(view, this);
        }
        View s1 = s1();
        if (s1 != null) {
            ax.S2.b.l(s1, this);
        }
    }

    @Override // com.voxdon.xplorer.activity.a, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            bundle.putSerializable("CURRENT_BOOKMARK", this.V);
            bundle.putParcelable("CURRENT_EXTRAINFO", this.W);
            bundle.putSerializable("OPEN_BOOKMARK", this.N.e());
            bundle.putSerializable("OPEN_EXTRAINFOS", this.N.g());
        } catch (IllegalStateException e) {
            ax.Ha.c.h().d("MainActivity onSaveInstanceState Error").l(e).h();
        }
        try {
            k1(bundle);
        } catch (Exception unused) {
        }
    }

    @Override // com.voxdon.xplorer.activity.b, com.voxdon.xplorer.activity.a, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // com.voxdon.xplorer.activity.b, ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        C1().u();
    }

    @Override // com.voxdon.xplorer.activity.b
    public void p0() {
        a2();
        e0().b();
        o1(false);
    }

    public void p2(J j) {
        this.X.remove(j);
    }

    @Override // com.voxdon.xplorer.activity.b
    public void q0(String str) {
        if (this.z.A(this.A)) {
            this.z.d(this.A);
        }
        Bookmark l2 = Bookmark.l(this, ax.Q2.f.l0);
        l2.G("/moveToHome");
        c2(l2, str, null, null, null);
    }

    @Override // com.voxdon.xplorer.activity.b
    public void r0(Bookmark bookmark) {
        Boolean bool = this.p0;
        if (bool != null && bool.booleanValue()) {
            ax.V2.a.b(this).a(bookmark);
        }
        if (bookmark.A()) {
            C1().a(bookmark);
        }
    }

    public CoordinatorLayout r1() {
        return this.F;
    }

    View s1() {
        View childAt;
        CoordinatorLayout coordinatorLayout = this.F;
        if (coordinatorLayout == null || (childAt = coordinatorLayout.getChildAt(0)) == null) {
            return null;
        }
        return childAt;
    }

    public void s2() {
        ArrayList<J> arrayList = this.X;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            J j = arrayList.get(i);
            i++;
            j.C();
        }
    }

    @Override // com.voxdon.xplorer.activity.b
    public void t0(ax.Q2.f fVar, int i, String str, boolean z2) {
        Bookmark bookmark = this.d0;
        if (bookmark != null && bookmark.s() == fVar && this.d0.t() == i && this.d0.w().equals(str)) {
            this.c0.run();
            this.c0 = null;
            this.d0 = null;
        }
    }

    public long t1() {
        if (this.i0 == 0) {
            this.i0 = C3098a.a();
        }
        return this.i0;
    }

    public void t2(b.EnumC0188b enumC0188b) {
        synchronized (this.y) {
            this.g0 = enumC0188b;
        }
        if (enumC0188b == b.EnumC0188b.LOADED) {
            if (C3098a.h(this) && !ax.S2.a.b() && !ax.u3.z.u(this)) {
                ax.S2.a.a(this);
            }
            if (!C3098a.k(this) || U1() || ax.u3.z.u(this)) {
                return;
            }
            if (C3098a.e()) {
                ax.S2.b.g(this, new v());
            } else {
                this.j0 = ax.S2.b.h(this, (DialogC1343B.l(s()) && C1366w.n3(ax.t3.c.n().l())) ? C1366w.m3(this) : 300, new w());
            }
        }
    }

    public b.EnumC0188b u1() {
        b.EnumC0188b enumC0188b;
        synchronized (this.y) {
            enumC0188b = this.g0;
        }
        return enumC0188b;
    }

    public ax.g3.b v1() {
        return this.C0;
    }

    @Override // com.voxdon.xplorer.activity.b
    public void w0(ax.Q2.f fVar, int i, String str, boolean z2) {
        int c;
        if (z2 && (c = this.N.c(fVar, i)) >= 0) {
            this.N.k(fVar, i, str);
            C1().c(this.N.d(c));
            M0();
            k2();
        }
        Bookmark bookmark = this.b0;
        if (bookmark != null && bookmark.s() == fVar && this.b0.t() == i && this.b0.w().equals(str)) {
            this.a0.run();
            this.a0 = null;
            this.b0 = null;
        }
    }

    public C1352h.c w1() {
        return this.A0;
    }

    public void w2(long j) {
        this.h0 = j;
    }

    @Override // com.voxdon.xplorer.activity.b
    public void x0() {
        Q2();
    }

    public AbstractC1927n x1() {
        Bookmark bookmark = this.V;
        if (bookmark == null) {
            return null;
        }
        return (AbstractC1927n) getSupportFragmentManager().k0(q1(bookmark));
    }

    void x2(Bookmark bookmark, Runnable runnable) {
        this.d0 = bookmark;
        this.c0 = runnable;
    }

    void y2(Bookmark bookmark, Runnable runnable) {
        this.b0 = bookmark;
        this.a0 = runnable;
    }

    public void z2(String str, String str2) {
        C3422h c3422h;
        if (getSupportActionBar() == null || (c3422h = this.T) == null) {
            return;
        }
        c3422h.q(str);
        if (str2 != null) {
            this.T.o(str2);
        } else {
            this.T.o(null);
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$f, reason: case insensitive filesystem */
    class C3576f implements k {
        C3576f() {
        }

        @Override // ax.g3.k
        public void c(ax.Q2.f fVar, int i) {
            MainActivity.this.j2();
            MainActivity.this.c2(Bookmark.o(T.d(MainActivity.this.getApplicationContext(), fVar).f(i)), "remote_add", null, null, null);
        }

        @Override // ax.g3.k
        public void b(ax.Q2.f fVar) {
        }

        @Override // ax.g3.k
        public void d(ax.Q2.f fVar, int i, Map<String, Object> map) {
        }

        @Override // ax.g3.k
        public void a(ax.Q2.f fVar, String str, int i, String str2, String str3) {
        }
    }

    /* renamed from: com.voxdon.xplorer.activity.MainActivity$h, reason: case insensitive filesystem */
    class C3578h implements k {

        /* renamed from: com.voxdon.xplorer.activity.MainActivity$h$a */
        class a implements C1364u.c {
            final /* synthetic */ int a;

            a(int i) {
                this.a = i;
            }

            @Override // ax.a3.C1364u.c
            public void a(boolean z) {
                if (MainActivity.this.s() == null) {
                    return;
                }
                C3592k.a s0 = C3592k.s0(MainActivity.this.getApplicationContext());
                MainActivity mainActivity = MainActivity.this;
                s0.l(mainActivity, mainActivity.B0, this.a, z);
            }
        }

        C3578h() {
        }

        @Override // ax.g3.k
        public void a(ax.Q2.f fVar, String str, int i, String str2, String str3) {
            MainActivity mainActivity = MainActivity.this;
            String string = mainActivity.getString(R.string.msg_connection_failed, fVar.M(mainActivity));
            if (!TextUtils.isEmpty(str3)) {
                if (j.o(MainActivity.this.s())) {
                    string = string + " : " + str3;
                } else if (str3.contains("ERR_SSL_VERSION_OR_CIPHER_MISMATCH")) {
                    string = string + " (" + str3 + ")";
                }
            }
            Toast.makeText(MainActivity.this, string, 1).show();
        }

        @Override // ax.g3.k
        public void c(ax.Q2.f fVar, int i) {
            MainActivity.this.j2();
            MainActivity.this.c2(Bookmark.o(T.b(MainActivity.this.getApplicationContext(), fVar).f(i)), "cloud_add", null, null, null);
        }

        @Override // ax.g3.k
        public void d(ax.Q2.f fVar, int i, Map<String, Object> map) {
            if (fVar != ax.Q2.f.N0) {
                C3184b.f();
                return;
            }
            C1364u c1364u = new C1364u();
            c1364u.c3(MainActivity.this.getSupportFragmentManager(), "dropbox_confirm");
            c1364u.j3(new a(i));
        }

        @Override // ax.g3.k
        public void b(ax.Q2.f fVar) {
        }
    }

    class x implements C1358n.c {
        final /* synthetic */ String a;

        x(String str) {
            this.a = str;
        }

        @Override // ax.a3.C1358n.c
        public void P(C1358n c1358n) {
            if (MainActivity.this.s() == null) {
                return;
            }
            ((MainActivity) MainActivity.this.s()).I2();
            ax.Q2.a.i().o("ads_rewarded_dialog").b("unit", "desktop_reward").b("from", this.a).b("result", "confirm").c();
        }

        @Override // ax.a3.C1358n.c
        public void Z(C1358n c1358n) {
            ax.Q2.a.i().o("ads_rewarded_dialog").b("unit", "desktop_reward").b("from", this.a).b("result", "cancel").c();
        }

        @Override // ax.a3.C1358n.c
        public void G(C1358n c1358n) {
        }
    }
}
