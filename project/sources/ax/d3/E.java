package ax.d3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ax.Q2.a;
import ax.Q2.i;
import ax.T2.h;
import ax.V2.c;
import ax.W2.C1011c;
import ax.W2.e;
import ax.W2.h;
import ax.W2.k;
import ax.W2.t;
import ax.W2.z;
import ax.Z2.c;
import ax.a3.C1345a;
import ax.a3.C1348d;
import ax.a3.C1350f;
import ax.a3.C1357m;
import ax.a3.C1358n;
import ax.a3.C1360p;
import ax.a3.C1367x;
import ax.a3.EnumC1356l;
import ax.a3.Q;
import ax.b0.InterfaceC1440a;
import ax.b3.C1486a;
import ax.b3.C1488c;
import ax.b3.C1490e;
import ax.b3.C1492g;
import ax.b3.C1495j;
import ax.c0.C1751A;
import ax.c3.AbstractC1823k;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1810C;
import ax.c3.C1812E;
import ax.c3.C1832u;
import ax.c3.C1833v;
import ax.c3.C1834w;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.d3.AbstractC1927n;
import ax.d3.E;
import ax.n.AbstractC2559a;
import ax.n.ActivityC2561c;
import ax.o.C2653a;
import ax.o3.C2685b;
import ax.o3.C2686c;
import ax.o3.C2688e;
import ax.r3.C2947d;
import ax.s.C3036c;
import ax.u.w;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3189g;
import ax.u3.C3203u;
import ax.u3.InterfaceC3185c;
import ax.x3.C3405A;
import ax.x3.C3418d;
import ax.x3.C3421g;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3588g;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3591j;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.service.FileObserverService;
import com.voxdon.xplorer.service.HttpServerService;
import com.voxdon.xplorer.sharing.QuickShareProvider;
import com.voxdon.xplorer.viewer.e;
import com.voxdon.xplorer.widget.PathBar;
import com.voxdon.xplorer.widget.a;
import com.google.android.material.snackbar.Snackbar;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class E extends ax.d3.H implements InterfaceC3584c.a, ax.g3.f, Q.f {
    private static final Logger r2 = ax.Q2.g.a(E.class);
    private Drawable A1;
    private Drawable B1;
    private SwipeRefreshLayout C0;
    protected View.OnClickListener C1;
    private SwipeRefreshLayout D0;
    private SwipeRefreshLayout E0;
    private SwipeRefreshLayout F0;
    private RecyclerView G0;
    private ax.Q2.f G1;
    private View H0;
    private ax.t3.i I0;
    private boolean J0;
    private ListView K0;
    private GridView L0;
    private View M0;
    private AbsListView N0;
    private int O0;
    private String P0;
    private View Q0;
    private TextView R0;
    private boolean R1;
    private TextView S0;
    private TextView T0;
    private int T1;
    private CoordinatorLayout U0;
    private int U1;
    private View V0;
    private long V1;
    protected PathBar W0;
    private EditText X0;
    private C3418d Y0;
    private ax.u.w Z0;
    private ax.u.w a1;
    private String b2;
    protected com.voxdon.xplorer.widget.a c1;
    private String c2;
    protected com.voxdon.xplorer.widget.a d1;
    private String d2;
    protected com.voxdon.xplorer.widget.a e1;
    private Set<String> e2;
    private ax.V2.c f1;
    private C2947d g1;
    private MediaControllerCompat g2;
    private C3596o h1;
    private AbstractC3595n i1;
    private AbstractC3595n j1;
    private String l1;
    private long m1;
    private String n1;
    private boolean o1;
    private String p1;
    private List<AbstractC3595n> q1;
    private String r1;
    private boolean s1;
    private AbstractC3595n t1;
    private r0 u1;
    private q0 v1;
    private n0 w1;
    private boolean x1;
    private MenuItem y1;
    private MenuItem z1;
    private AbstractC1927n.r b1 = new AbstractC1927n.r();
    private long k1 = -1;
    private boolean D1 = false;
    private boolean E1 = false;
    private int F1 = -1;
    private boolean H1 = false;
    private boolean I1 = true;
    private boolean J1 = false;
    private k0 K1 = k0.NOT_CONNECTED;
    private boolean L1 = false;
    private boolean M1 = false;
    private boolean N1 = false;
    private int O1 = -1;
    private int P1 = -1;
    private int Q1 = -1;
    private int S1 = -1;
    private StringBuffer W1 = new StringBuffer();
    private Handler X1 = new Handler(Looper.getMainLooper());
    private boolean Y1 = true;
    private boolean Z1 = true;
    private boolean a2 = false;
    private final BroadcastReceiver f2 = new C1894k();
    AbsListView.MultiChoiceModeListener h2 = new C1885a();
    AbsListView.MultiChoiceModeListener i2 = new C1886b();
    AdapterView.OnItemClickListener j2 = new C1887c();
    AdapterView.OnItemClickListener k2 = new C1888d(500);
    AdapterView.OnItemClickListener l2 = new e(400);
    private MediaControllerCompat.a m2 = new S();
    BroadcastReceiver n2 = new a0();
    BroadcastReceiver o2 = new b0();
    BroadcastReceiver p2 = new d0();
    Runnable q2 = new e0();

    class A extends l0 {
        A() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            E.this.j9();
            E.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class B implements C1357m.f {
        final /* synthetic */ ax.W2.k a;

        B(ax.W2.k kVar) {
            this.a = kVar;
        }

        @Override // ax.a3.C1357m.f
        public void a(String str, k.a aVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.p(str);
            this.a.o(aVar);
            try {
                E.this.l(this.a, true);
            } catch (C1488c unused) {
                E.this.J4(com.voxdon.xplorer.R.string.error, 1);
            }
        }
    }

    class C extends l0 {
        C() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            E.this.j9();
            E.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class D implements z.c {
        D() {
        }

        @Override // ax.W2.z.c
        public boolean a(String str) {
            return E.this.n1 != null && E.this.c1.X(str);
        }
    }

    /* renamed from: ax.d3.E$E, reason: collision with other inner class name */
    class C0276E extends l0 {
        C0276E() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            E.this.h8(bVar);
            if (bVar != h.b.SUCCESS || arrayList == null || arrayList.size() <= 0) {
                E.this.y4(bVar, str, str2, arrayList);
            } else {
                E.this.z4(str, arrayList);
            }
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class F extends l0 {
        F() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            E.this.j9();
            E.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class G extends ax.g3.c {
        G() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (E.this.X0 == null || !E.this.X0.isShown()) {
                return;
            }
            E.this.y1.collapseActionView();
        }
    }

    class H extends l0 {
        H() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            E.this.j9();
            E.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class I extends l0 {
        I() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            E.this.j9();
            E.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class J implements AbstractC1927n.p {
        final /* synthetic */ AbstractC3595n a;
        final /* synthetic */ ax.c3.V b;
        final /* synthetic */ boolean c;

        J(AbstractC3595n abstractC3595n, ax.c3.V v, boolean z) {
            this.a = abstractC3595n;
            this.b = v;
            this.c = z;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            if (E.this.X0()) {
                E.this.E8(this.a, this.b.h(), this.c);
            }
        }
    }

    class K implements AbstractC1927n.p {
        final /* synthetic */ AbstractC3595n a;

        K(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            if (E.this.X0()) {
                E.this.F8(this.a);
            }
        }
    }

    class M extends l0 {
        final /* synthetic */ AbstractC3595n b;
        final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(AbstractC3595n abstractC3595n, File file) {
            super();
            this.b = abstractC3595n;
            this.c = file;
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            C2688e.b().j(this.b, this.c.lastModified());
            C2685b.j().p(this.b.Q());
            E.this.k1 = -1L;
            E.this.j9();
            E.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class N implements AbstractC1927n.p {
        final /* synthetic */ Intent a;
        final /* synthetic */ AbstractC3595n b;
        final /* synthetic */ boolean c;

        N(Intent intent, AbstractC3595n abstractC3595n, boolean z) {
            this.a = intent;
            this.b = abstractC3595n;
            this.c = z;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            if (E.this.X0()) {
                if (this.a == null) {
                    E.this.E8(this.b, null, this.c);
                    return;
                }
                E e = E.this;
                AbstractC3595n abstractC3595n = this.b;
                e.C9(abstractC3595n, abstractC3595n.N().lastModified());
                E e2 = E.this;
                AbstractC3595n abstractC3595n2 = this.b;
                e2.ja(abstractC3595n2, abstractC3595n2.N());
                E.this.B8(this.a, 0, false, this.b.A());
            }
        }
    }

    class O implements Runnable {
        final /* synthetic */ boolean q;

        O(boolean z) {
            this.q = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (E.this.X0()) {
                if (E.this.F0.m() != this.q) {
                    E.this.F0.setRefreshing(this.q);
                }
                if (E.this.C0.m() != this.q) {
                    E.this.C0.setRefreshing(this.q);
                }
            }
        }
    }

    class P implements View.OnLayoutChangeListener {

        class a implements Runnable {
            final /* synthetic */ int c0;
            final /* synthetic */ int q;

            a(int i, int i2) {
                this.q = i;
                this.c0 = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (E.this.f0() == null) {
                    return;
                }
                E.this.L0.setSelectionFromTop(this.q, this.c0);
            }
        }

        P() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            E.this.L0.removeOnLayoutChangeListener(this);
            int i9 = E.this.S1;
            int paddingTop = E.this.T1 - E.this.L0.getPaddingTop();
            int i10 = E.this.U1;
            E.this.R1 = false;
            E.this.S1 = -1;
            if (!E.this.K3() || i9 < 0 || i9 >= E.this.L0.getCount()) {
                return;
            }
            E.this.L0.post(new a(i9, Math.max(E.this.L0.getPaddingTop(), Math.min(paddingTop, (E.this.L0.getHeight() - E.this.L0.getPaddingBottom()) - i10))));
        }
    }

    class Q implements Runnable {
        Q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (E.this.K3()) {
                int g3 = E.this.g3();
                int i = E.this.Y0.i();
                if (g3 < 0) {
                    g3 = -1;
                }
                if (i < 0) {
                    i = -1;
                }
                E.this.K0.setNextFocusLeftId(g3);
                E.this.L0.setNextFocusLeftId(g3);
                E.this.K0.setNextFocusRightId(i);
                E.this.L0.setNextFocusRightId(i);
            }
        }
    }

    class R implements View.OnKeyListener {
        R() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1 && (i == 59 || i == 60)) {
                E.this.r9();
            }
            if (keyEvent.getAction() == 0) {
                if (i == 62) {
                    int selectedItemPosition = E.this.N0.getSelectedItemPosition();
                    if (selectedItemPosition != -1) {
                        E.this.N0.setItemChecked(selectedItemPosition, !E.this.N0.isItemChecked(selectedItemPosition));
                    }
                    return true;
                }
                if (i != 66 && i != 160) {
                    switch (i) {
                        case 19:
                        case 20:
                            if (!keyEvent.isShiftPressed()) {
                                E.this.r9();
                                break;
                            } else {
                                return E.this.d8((AbsListView) view, (i != 19 ? 1 : -1) * (view instanceof GridView ? Math.max(1, ((GridView) view).getNumColumns()) : 1), i, keyEvent);
                            }
                        case 21:
                        case 22:
                            if (!(view instanceof GridView) || !keyEvent.isShiftPressed()) {
                                E.this.r9();
                                break;
                            } else {
                                return E.this.d8((AbsListView) view, i == 21 ? -1 : 1, i, keyEvent);
                            }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    if (E.this.N0 != null && !E.this.V7()) {
                        E.this.J7(com.voxdon.xplorer.R.id.menu_open_with, false, true);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    class S extends MediaControllerCompat.a {
        S() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            E.this.g8();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void e(PlaybackStateCompat playbackStateCompat) {
            E.this.g8();
        }
    }

    class T extends ax.g3.c {
        final /* synthetic */ String c;

        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (E.this.f0() != null) {
                    C3180B.Y(E.this.f0());
                }
            }
        }

        T(String str) {
            this.c = str;
        }

        public static /* synthetic */ void b(T t, String str, Integer num) {
            if (E.this.b() == null) {
                return;
            }
            E.this.W9(false);
            if (num.intValue() != ax.w3.d.j) {
                if (num.intValue() == ax.w3.d.k) {
                    E.this.E4(com.voxdon.xplorer.R.string.error, 0);
                }
            } else {
                if (ax.P2.b.j()) {
                    E e = E.this;
                    e.G4(e.N0(com.voxdon.xplorer.R.string.file_is_downloaded, str), 2, com.voxdon.xplorer.R.string.menu_restart, t.new a());
                } else {
                    E e2 = E.this;
                    e2.F4(e2.N0(com.voxdon.xplorer.R.string.file_is_downloaded, str), 1);
                }
                E.this.j9();
            }
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (E.this.f0() == null) {
                return;
            }
            E.this.W9(true);
            androidx.fragment.app.f f0 = E.this.f0();
            final String str = this.c;
            new ax.w3.d(f0, new InterfaceC1440a() { // from class: ax.d3.G
                @Override // ax.b0.InterfaceC1440a
                public final void accept(Object obj) {
                    E.T.b(E.T.this, str, (Integer) obj);
                }
            }).i(new Void[0]);
        }
    }

    class U extends l0 {

        class a extends ax.g3.c {
            final /* synthetic */ e.C0217e c;

            a(e.C0217e c0217e) {
                this.c = c0217e;
            }

            @Override // ax.g3.c
            public void a(View view) {
                E.this.ga(this.c);
            }
        }

        class b extends Snackbar.a {
            final /* synthetic */ e.C0217e a;

            b(e.C0217e c0217e) {
                this.a = c0217e;
            }

            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
            /* renamed from: c */
            public void a(Snackbar snackbar, int i) {
                C3596o c3596o;
                e.C0217e c0217e = this.a;
                if (c0217e == null || (c3596o = c0217e.b) == null) {
                    return;
                }
                c3596o.k0(false);
            }
        }

        U() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            e.C0217e c0217e;
            C3596o c3596o;
            super.a(bVar, str, str2, arrayList, obj);
            E.this.j9();
            boolean z = false;
            if (bVar == h.b.SUCCESS && (obj instanceof e.C0217e)) {
                c0217e = (e.C0217e) obj;
                if (E.this.U7(c0217e) || c0217e.a) {
                    z = true;
                }
            } else {
                c0217e = null;
            }
            if (!z) {
                E.this.y4(bVar, str, str2, arrayList);
                return;
            }
            if (c0217e != null && (c3596o = c0217e.b) != null) {
                c3596o.n0();
            }
            E.this.H4(str, 1, new a(c0217e), new b(c0217e));
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    class V extends ax.g3.c {
        final /* synthetic */ e.C0217e c;

        V(e.C0217e c0217e) {
            this.c = c0217e;
        }

        @Override // ax.g3.c
        public void a(View view) {
            E.this.P8(Uri.parse(this.c.c.Q()));
        }
    }

    class W extends ax.g3.c {
        final /* synthetic */ e.C0217e c;

        W(e.C0217e c0217e) {
            this.c = c0217e;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (E.this.f0() == null) {
                return;
            }
            C1011c q = C1011c.q();
            e.C0217e c0217e = this.c;
            q.m(c0217e.b, c0217e.c, c0217e.d, false);
            E.this.J3();
            E.this.e4(true);
        }
    }

    class X implements PopupWindow.OnDismissListener {
        final /* synthetic */ e.C0217e a;

        X(e.C0217e c0217e) {
            this.a = c0217e;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C3596o c3596o = this.a.b;
            if (c3596o != null) {
                c3596o.k0(false);
            }
        }
    }

    class Y extends ax.g3.c {
        Y() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (E.this.X0()) {
                com.voxdon.xplorer.shizuku.c.t().F(E.this);
            }
        }
    }

    class Z extends ax.g3.c {
        final /* synthetic */ C3605y c;

        Z(C3605y c3605y) {
            this.c = c3605y;
        }

        @Override // ax.g3.c
        public void a(View view) {
            C3605y c3605y = this.c;
            if (c3605y != null) {
                E.this.Q8(c3605y);
            }
        }
    }

    /* renamed from: ax.d3.E$a, reason: case insensitive filesystem */
    class C1885a implements AbsListView.MultiChoiceModeListener {
        private AccessibilityManager a;

        C1885a() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return E.this.J7(menuItem.getItemId(), false, false);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) E.this.b().getSystemService("accessibility");
            this.a = accessibilityManager;
            if (!accessibilityManager.isTouchExplorationEnabled()) {
                this.a = null;
            }
            E.this.b3(actionMode, menu, com.voxdon.xplorer.R.menu.action_mode_file_list);
            E.this.g9();
            E.this.X3(AbstractC1927n.o.FILE_NORMAL);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            E.this.a3();
            E.this.b1.c();
            E.this.W3(AbstractC1927n.o.FILE_NORMAL);
            this.a = null;
        }

        @Override // android.widget.AbsListView.MultiChoiceModeListener
        public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
            E.this.b1.f(i, z);
            if (E.this.b1.a()) {
                AccessibilityManager accessibilityManager = this.a;
                if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                    int checkedItemCount = E.this.N0.getCheckedItemCount();
                    String quantityString = E.this.o3().getResources().getQuantityString(com.voxdon.xplorer.R.plurals.selected_count, checkedItemCount, Integer.valueOf(checkedItemCount));
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(Http2.INITIAL_MAX_FRAME_SIZE);
                    obtain.getText().add(quantityString);
                    this.a.sendAccessibilityEvent(obtain);
                }
                actionMode.setTitle(E.this.N0.getCheckedItemCount() + "/" + E.this.N0.getCount());
                actionMode.invalidate();
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            if (E.this.c1.getCount() == 0) {
                if (E.this.i1 != null) {
                    ax.Ha.c.h().n("AMO STATE").j().g("LOADED:" + E.this.o1 + ":" + E.this.N0.getCheckedItemCount() + ":" + E.this.N0.getCount()).h();
                }
                return false;
            }
            MenuItem findItem = menu.findItem(com.voxdon.xplorer.R.id.menu_select_range);
            if (findItem != null) {
                ax.u3.z.C(E.this.o3(), findItem, com.voxdon.xplorer.R.color.action_mode_icon);
                if (E.this.b1.b()) {
                    findItem.setEnabled(true);
                } else {
                    findItem.setEnabled(false);
                }
            }
            if (E.this.N0.getCheckedItemCount() == 0) {
                return false;
            }
            if (E.this.N0.getCheckedItemCount() == 1) {
                List u7 = E.this.u7(false);
                if (u7.size() > 0) {
                    E.this.l8((AbstractC3595n) u7.get(0));
                }
            } else {
                E e = E.this;
                e.k8(e.u7(false));
            }
            E.this.Y0.B();
            return false;
        }
    }

    class a0 extends BroadcastReceiver {
        a0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            E.this.j9();
        }
    }

    /* renamed from: ax.d3.E$b, reason: case insensitive filesystem */
    class C1886b implements AbsListView.MultiChoiceModeListener {
        private AccessibilityManager a;
        private boolean b;
        private ax.Q2.j c;

        C1886b() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return E.this.J7(menuItem.getItemId(), false, false);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) E.this.b().getSystemService("accessibility");
            this.a = accessibilityManager;
            if (!accessibilityManager.isTouchExplorationEnabled()) {
                this.a = null;
            }
            ax.Q2.j g0 = E.this.v3().g0();
            this.c = g0;
            boolean e = g0.e();
            this.b = e;
            if (e) {
                E.this.b3(actionMode, menu, com.voxdon.xplorer.R.menu.action_mode_file_list_picker);
            } else {
                E.this.b3(actionMode, menu, 0);
            }
            E.this.X3(AbstractC1927n.o.FILE_PICKER);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            if (E.this.f0() == null) {
                return;
            }
            E.this.v3().h0().F(false);
            E.this.a3();
            E.this.b1.c();
            E.this.W3(AbstractC1927n.o.FILE_PICKER);
            this.a = null;
        }

        @Override // android.widget.AbsListView.MultiChoiceModeListener
        public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
            boolean z2;
            if (this.b) {
                E.this.b1.f(i, z);
                z2 = E.this.b1.a();
            } else {
                z2 = true;
            }
            if (z2) {
                AccessibilityManager accessibilityManager = this.a;
                if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                    int checkedItemCount = E.this.N0.getCheckedItemCount();
                    String quantityString = E.this.o3().getResources().getQuantityString(com.voxdon.xplorer.R.plurals.selected_count, checkedItemCount, Integer.valueOf(checkedItemCount));
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(Http2.INITIAL_MAX_FRAME_SIZE);
                    obtain.getText().add(quantityString);
                    this.a.sendAccessibilityEvent(obtain);
                }
                actionMode.setTitle(E.this.N0.getCheckedItemCount() + "/" + E.this.N0.getCount());
                actionMode.invalidate();
            }
            AbstractC3595n abstractC3595n = (AbstractC3595n) E.this.c1.getItem(i);
            if (z && abstractC3595n != null) {
                if (!(E.this.v3() != null && E.this.v3().g0().d()) && abstractC3595n.isDirectory()) {
                    E.this.N0.setItemChecked(i, false);
                    return;
                } else if (!this.c.h(abstractC3595n.s())) {
                    E.this.N0.setItemChecked(i, false);
                    return;
                }
            }
            if (this.b || E.this.N0.getCheckedItemCount() <= 1) {
                return;
            }
            SparseBooleanArray checkedItemPositions = E.this.N0.getCheckedItemPositions();
            for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
                if (checkedItemPositions.valueAt(i2) && i != checkedItemPositions.keyAt(i2)) {
                    E.this.N0.setItemChecked(checkedItemPositions.keyAt(i2), false);
                    return;
                }
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            if (E.this.c1.getCount() == 0) {
                return false;
            }
            MenuItem findItem = menu.findItem(com.voxdon.xplorer.R.id.menu_select_range);
            if (findItem != null) {
                ax.u3.z.C(E.this.o3(), findItem, com.voxdon.xplorer.R.color.action_mode_icon);
                if (E.this.b1.b()) {
                    findItem.setEnabled(true);
                } else {
                    findItem.setEnabled(false);
                }
            }
            C3405A h0 = E.this.v3().h0();
            if (!E.this.Y7()) {
                h0.F(false);
            } else if (E.this.N0.getCheckedItemCount() <= 0) {
                h0.F(false);
            } else {
                h0.F(true);
            }
            return false;
        }
    }

    class b0 extends BroadcastReceiver {
        b0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (E.this.Z0() || (stringExtra = intent.getStringExtra("mimetype")) == null) {
                return;
            }
            E.this.N9(stringExtra);
        }
    }

    /* renamed from: ax.d3.E$c, reason: case insensitive filesystem */
    class C1887c extends ax.g3.d {
        C1887c() {
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < 0 || i >= E.this.c1.getCount()) {
                return;
            }
            E.this.t7().setItemChecked(i, !E.this.t7().isItemChecked(i));
        }
    }

    /* renamed from: ax.d3.E$d, reason: case insensitive filesystem */
    class C1888d extends ax.g3.d {
        C1888d(long j) {
            super(j);
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < 0 || i >= E.this.c1.getCount()) {
                return;
            }
            AbstractC3595n abstractC3595n = (AbstractC3595n) E.this.c1.getItem(i);
            E.this.D8(abstractC3595n);
            if (abstractC3595n.isDirectory() && C1809B.q(abstractC3595n) == 0 && ax.Q2.f.k0(E.this.z3())) {
                String h = ax.c3.d0.h(abstractC3595n.E());
                if (C1810C.e(h)) {
                    return;
                }
                ax.Q2.a.i().m("general", "first_dir").c("info", h).e();
            }
        }
    }

    class d0 extends BroadcastReceiver {
        d0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("filepath");
            String stringExtra2 = intent.getStringExtra("location_uri");
            if (E.this.j1 == null || !E.this.j1.N().getAbsolutePath().equals(stringExtra) || stringExtra2 == null || !stringExtra2.equals(E.this.j1.Q())) {
                return;
            }
            E.this.q9();
        }
    }

    class e extends ax.g3.d {
        e(long j) {
            super(j);
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < 0 || i >= E.this.c1.getCount()) {
                return;
            }
            AbstractC3595n abstractC3595n = (AbstractC3595n) E.this.c1.getItem(i);
            if (abstractC3595n.isDirectory()) {
                E.this.D8(abstractC3595n);
            } else {
                E.this.N0.setItemChecked(i, true);
            }
        }
    }

    class e0 implements Runnable {
        e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (E.this.f0() == null) {
                return;
            }
            E.this.N6(false);
        }
    }

    /* renamed from: ax.d3.E$f, reason: case insensitive filesystem */
    class C1889f extends ax.g3.c {
        C1889f() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (E.this.Y0.k() != 0) {
                return;
            }
            E.this.J7(view.getId(), false, false);
        }
    }

    static /* synthetic */ class f0 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C1367x.b.values().length];
            a = iArr;
            try {
                iArr[C1367x.b.HERE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C1367x.b.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C1367x.b.CHOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ax.d3.E$g, reason: case insensitive filesystem */
    class ViewOnLongClickListenerC1890g implements View.OnLongClickListener {
        ViewOnLongClickListenerC1890g() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!C3203u.a(E.this.u7(false))) {
                return E.this.Y0.h().onLongClick(view);
            }
            E.this.O9();
            return true;
        }
    }

    class g0 implements SwipeRefreshLayout.j {
        g0() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            if (E.this.T7() || ax.Q2.f.D0(E.this.z3())) {
                E.this.c4(true);
            } else {
                E.this.B9(false);
            }
        }
    }

    /* renamed from: ax.d3.E$h, reason: case insensitive filesystem */
    class ViewOnLongClickListenerC1891h implements View.OnLongClickListener {
        ViewOnLongClickListenerC1891h() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!ax.Q2.f.l(E.this.z3())) {
                return E.this.Y0.h().onLongClick(view);
            }
            E.this.Q9();
            return true;
        }
    }

    class h0 implements SwipeRefreshLayout.j {
        h0() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            if (E.this.T7() || ax.Q2.f.D0(E.this.z3())) {
                E.this.c4(true);
            } else {
                E.this.B9(false);
            }
        }
    }

    /* renamed from: ax.d3.E$i, reason: case insensitive filesystem */
    class C1892i implements C3418d.f {
        C1892i() {
        }

        @Override // ax.x3.C3418d.f
        public boolean a(int i) {
            E.this.J7(i, false, false);
            return false;
        }
    }

    class i0 implements SwipeRefreshLayout.j {
        i0() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            if (E.this.T7() || ax.Q2.f.D0(E.this.z3())) {
                E.this.c4(true);
            } else {
                E.this.B9(false);
            }
        }
    }

    /* renamed from: ax.d3.E$j, reason: case insensitive filesystem */
    class C1893j implements w.d {
        C1893j() {
        }

        @Override // ax.u.w.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            E.this.Z0.a();
            return E.this.J7(menuItem.getItemId(), false, false);
        }
    }

    class j0 extends ax.g3.d {
        j0(long j) {
            super(j);
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            if (E.this.X0 != null) {
                E.this.f7(E.this.I0.e(i));
            }
        }
    }

    /* renamed from: ax.d3.E$k, reason: case insensitive filesystem */
    class C1894k extends BroadcastReceiver {
        C1894k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            E.this.j8(intent.getBooleanExtra("CONNECTED", false));
        }
    }

    enum k0 {
        NOT_CONNECTED,
        CONNECTING,
        CONNECTED,
        DISCONNECTED
    }

    /* renamed from: ax.d3.E$l, reason: case insensitive filesystem */
    class C1895l implements w.d {
        C1895l() {
        }

        @Override // ax.u.w.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            E.this.a1.a();
            return E.this.J7(menuItem.getItemId(), false, false);
        }
    }

    /* renamed from: ax.d3.E$m, reason: case insensitive filesystem */
    class RunnableC1896m implements Runnable {
        final /* synthetic */ int q;

        RunnableC1896m(int i) {
            this.q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            E.this.N0.scrollListBy(this.q * (-1));
        }
    }

    static class m0 implements AbsListView.OnScrollListener {
        AbsListView a;
        int b;
        final Runnable c = new a();
        final Runnable d = new b();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m0 m0Var = m0.this;
                if (m0Var.b == 0) {
                    m0Var.a.setFastScrollEnabled(false);
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m0 m0Var = m0.this;
                if (m0Var.b == 2) {
                    m0Var.a.setFastScrollEnabled(true);
                }
            }
        }

        m0(AbsListView absListView) {
            this.a = absListView;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (this.b == 0) {
                this.a.removeCallbacks(this.c);
                if (this.a.isFastScrollEnabled()) {
                    this.a.postDelayed(this.c, 500L);
                }
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            com.voxdon.xplorer.widget.a aVar = (com.voxdon.xplorer.widget.a) this.a.getAdapter();
            if (aVar == null) {
                return;
            }
            this.a.removeCallbacks(this.d);
            this.a.removeCallbacks(this.c);
            aVar.q0(i == 2);
            if (i == 2) {
                int childCount = this.a.getChildCount();
                int count = aVar.getCount();
                if (childCount > 0 && count / childCount >= 4) {
                    this.a.postDelayed(this.d, 1000L);
                }
            } else if (i != 0) {
                if (this.a.isFastScrollEnabled()) {
                    this.a.postDelayed(this.c, 500L);
                }
            } else if (i == 0 && this.a.isFastScrollEnabled()) {
                this.a.postDelayed(this.c, 100L);
            }
            this.b = i;
        }
    }

    /* renamed from: ax.d3.E$n, reason: case insensitive filesystem */
    class ViewOnFocusChangeListenerC1897n implements View.OnFocusChangeListener {

        /* renamed from: ax.d3.E$n$a */
        class a implements Runnable {
            final /* synthetic */ View c0;
            final /* synthetic */ InputMethodManager q;

            a(InputMethodManager inputMethodManager, View view) {
                this.q = inputMethodManager;
                this.c0 = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.q.showSoftInput(this.c0, 1);
            }
        }

        ViewOnFocusChangeListenerC1897n() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (E.this.f0() != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) E.this.f0().getSystemService("input_method");
                if (z) {
                    view.postDelayed(new a(inputMethodManager, view), 100L);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
                }
            }
        }
    }

    private class n0 extends AbstractC3199q<String, Void, AbstractC3595n> {
        C3596o h;
        Throwable i;
        String j;

        public n0(String str) {
            super(AbstractC3199q.e.HIGHER);
            this.h = E.this.w7();
            this.j = str;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            E.this.w7().k0(false);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            this.h.n0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public AbstractC3595n g(String... strArr) {
            try {
                if (!E.this.S7() && !ax.Q2.f.D0(E.this.z3())) {
                    return null;
                }
                AbstractC3595n z = this.h.z(this.j);
                if (z != null) {
                    z.n();
                }
                return z;
            } catch (C1495j e) {
                e.printStackTrace();
                this.i = e;
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(AbstractC3595n abstractC3595n) {
            this.h.k0(false);
            if (abstractC3595n == null) {
                E.this.B9(false);
                if (E.this.i1 == null) {
                    E.this.S9(this.i, false);
                    return;
                } else {
                    E.this.E4(com.voxdon.xplorer.R.string.error_file_load, 1);
                    return;
                }
            }
            if (abstractC3595n.n()) {
                E.this.D8(abstractC3595n);
                return;
            }
            E.this.B9(false);
            E.this.E4(com.voxdon.xplorer.R.string.requested_file_not_found, 1);
            E.this.k9(true);
        }
    }

    /* renamed from: ax.d3.E$o, reason: case insensitive filesystem */
    class C1898o implements C1751A.c {
        final /* synthetic */ Menu a;

        /* renamed from: ax.d3.E$o$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (E.this.f0() == null) {
                    return;
                }
                C1898o c1898o = C1898o.this;
                E.this.G6(c1898o.a, false);
            }
        }

        C1898o(Menu menu) {
            this.a = menu;
        }

        @Override // ax.c0.C1751A.c
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            E.this.X0.clearComposingText();
            E.this.X0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            E.this.X0.clearFocus();
            E.this.A9(false);
            E.this.X1.post(new a());
            return true;
        }

        @Override // ax.c0.C1751A.c
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            ax.Q2.a.i().m("menu_folder", "search").c("loc", E.this.z3().I()).e();
            E.this.X0.requestFocus();
            E.this.A9(true);
            E.this.G6(this.a, true);
            E.this.P7();
            E.this.ra();
            return true;
        }
    }

    class o0 extends AbstractC3199q<String, Void, List<AbstractC3595n>> {
        private List<AbstractC3595n> h;

        o0(List<AbstractC3595n> list) {
            super(AbstractC3199q.e.HIGH);
            this.h = list;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            E.this.W9(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public List<AbstractC3595n> g(String... strArr) {
            return E.this.r7(this.h);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(List<AbstractC3595n> list) {
            E.this.W9(false);
            if (list == null || list.isEmpty()) {
                E.this.E4(com.voxdon.xplorer.R.string.error_file_not_found, 1);
                return;
            }
            try {
                QuickShareProvider.c().d(E.this.f0(), E.this.i1, list);
            } catch (Exception unused) {
                E.this.E4(com.voxdon.xplorer.R.string.error, 1);
            }
        }
    }

    /* renamed from: ax.d3.E$p, reason: case insensitive filesystem */
    class C1899p implements TextView.OnEditorActionListener {
        C1899p() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 0 && (i & 255) == 0) {
                return false;
            }
            if (E.this.f0() == null) {
                return true;
            }
            E.this.f7(E.this.X0.getText().toString());
            return true;
        }
    }

    protected class p0 extends AbstractC3199q<String, Void, Void> {
        p0() {
            super(AbstractC3199q.e.HIGHER);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(String... strArr) {
            E.this.w7().b();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Void r2) {
            E.this.E1 = true;
            E.this.X6();
        }
    }

    /* renamed from: ax.d3.E$q, reason: case insensitive filesystem */
    class MenuItemOnMenuItemClickListenerC1900q implements MenuItem.OnMenuItemClickListener {
        MenuItemOnMenuItemClickListenerC1900q() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!E.this.Z1) {
                return true;
            }
            E.this.Y1 = !r3.Y1;
            E.this.ra();
            return true;
        }
    }

    private class q0 extends AbstractC3199q<Void, Integer, Boolean> {
        List<AbstractC3595n> h;
        C3596o i;
        private boolean j;
        private String k;
        private ax.c3.k0 l;
        private AbstractC3595n m;

        public q0(List<AbstractC3595n> list, AbstractC3595n abstractC3595n) {
            super(AbstractC3199q.e.LOW);
            this.h = new ArrayList(list);
            this.i = E.this.w7();
            this.j = false;
            this.m = abstractC3595n;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            if (this.j) {
                ax.Ha.c.h().f().c("SCANMORETASK RELEASE TWICE 2").g(this.k).h();
                return;
            }
            this.i.k0(false);
            this.j = true;
            this.k = "onCancel";
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            this.i.n0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            boolean E = ax.c3.d0.E(this.m);
            if (!this.i.q0()) {
                return Boolean.FALSE;
            }
            if (this.i.d0() && ax.Q2.f.n0(E.this.z3()) && E) {
                if (isCancelled()) {
                    return Boolean.FALSE;
                }
                if (!E.this.S7()) {
                    return Boolean.FALSE;
                }
                try {
                    this.l = this.i.W();
                    v(-1);
                } catch (C1495j unused) {
                }
            }
            if (!ax.Q2.f.B0(E.this.z3())) {
                return Boolean.FALSE;
            }
            if (!E.this.S7() && ax.Q2.f.D0(E.this.z3())) {
                try {
                    this.i.z(E.this.z3().r());
                } catch (C1495j unused2) {
                }
            }
            for (int i = 0; i < this.h.size(); i++) {
                if (isCancelled()) {
                    return Boolean.FALSE;
                }
                if (!E.this.S7()) {
                    return Boolean.FALSE;
                }
                AbstractC3595n abstractC3595n = this.h.get(i);
                try {
                    if (abstractC3595n.isDirectory()) {
                        if (this.i.u0(abstractC3595n)) {
                            this.i.q(abstractC3595n, AbstractC3594m.f.NONE);
                        } else {
                            this.i.s(abstractC3595n, AbstractC3594m.f.NONE);
                        }
                        v(Integer.valueOf(i));
                    }
                } catch (C1490e unused3) {
                } catch (C1495j e) {
                    e.printStackTrace();
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (this.j) {
                ax.Ha.c.h().f().c("SCANMORETASK RELEASE TWICE 1").g(this.k).h();
            } else {
                this.i.k0(false);
                this.j = true;
                this.k = "onPost";
            }
            if (E.this.X0() && !E.this.d1() && bool.booleanValue()) {
                E.this.g8();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void s(Integer... numArr) {
            View childAt;
            if (E.this.X0()) {
                int intValue = numArr[0].intValue();
                if (intValue != -1) {
                    AbstractC3595n abstractC3595n = this.h.get(intValue);
                    if (intValue >= E.this.c1.getCount() || E.this.c1.getItem(intValue) != abstractC3595n || (childAt = E.this.N0.getChildAt(intValue - E.this.N0.getFirstVisiblePosition())) == null) {
                        return;
                    }
                    a.c cVar = (a.c) childAt.getTag();
                    if (cVar.A() == null || !cVar.A().equals(abstractC3595n.Q())) {
                        return;
                    }
                    cVar.y(abstractC3595n, intValue);
                    return;
                }
                ax.c3.k0 k0Var = this.l;
                if (k0Var != null) {
                    E.this.W0.setStorageSpace(k0Var);
                    if (this.l.b != 0 || this.i.S() == ax.Q2.f.P0) {
                        return;
                    }
                    ax.Ha.b b = ax.Ha.c.h().f().b("StorageSpace Total 0");
                    StringBuilder sb = new StringBuilder();
                    sb.append("LOC:");
                    sb.append(this.i.S().I());
                    sb.append(",used > 0:");
                    sb.append(this.l.a > 0);
                    b.g(sb.toString()).h();
                }
            }
        }
    }

    /* renamed from: ax.d3.E$r, reason: case insensitive filesystem */
    class C1901r extends l0 {
        C1901r() {
            super();
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            super.a(bVar, str, str2, arrayList, obj);
            E.this.j9();
            E.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.d3.E.l0, ax.W2.h.a
        public void b() {
            super.b();
        }
    }

    /* renamed from: ax.d3.E$s, reason: case insensitive filesystem */
    class C1902s implements C1360p.d {
        final /* synthetic */ ax.W2.m a;

        C1902s(ax.W2.m mVar) {
            this.a = mVar;
        }

        @Override // ax.a3.C1360p.d
        public EnumC1356l a(String str) {
            C3184b.c(!TextUtils.isEmpty(str));
            if (E.this.n1 != null) {
                if (E.this.c1.X(ax.c3.d0.Q(this.a.m(), str))) {
                    return EnumC1356l.FAILURE_FILENAME_CONFLICT;
                }
            }
            this.a.o(str);
            try {
                E.this.l(this.a, false);
                return EnumC1356l.SUCCESS;
            } catch (C1488c unused) {
                return EnumC1356l.FAILURE_COMMAND_START;
            }
        }
    }

    class s0 extends AbstractC3199q<String, Void, Boolean> {
        private AbstractC1823k h;
        private String i;

        s0(AbstractC1823k abstractC1823k) {
            super(AbstractC3199q.e.HIGH);
            this.h = abstractC1823k;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            E.this.W9(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(String... strArr) {
            try {
                return Boolean.valueOf(ax.U2.d.O(E.this.o3(), this.h));
            } catch (C1495j e) {
                if (e instanceof ax.b3.s) {
                    this.i = E.this.o3().getString(com.voxdon.xplorer.R.string.error_not_enough_storage);
                }
                return Boolean.FALSE;
            } catch (SecurityException e2) {
                if (e2.getMessage() != null && e2.getMessage().contains("FRP")) {
                    this.i = e2.getMessage();
                }
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            E.this.W9(false);
            if (bool == null || !bool.booleanValue()) {
                if (this.i == null) {
                    E.this.E4(com.voxdon.xplorer.R.string.error, 1);
                    return;
                }
                E.this.F4(E.this.o3().getString(com.voxdon.xplorer.R.string.error) + ":" + this.i, 1);
            }
        }
    }

    /* renamed from: ax.d3.E$t, reason: case insensitive filesystem */
    class C1903t implements C3604x.f {
        final /* synthetic */ AbstractC3595n a;

        C1903t(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // com.voxdon.xplorer.file.C3604x.f
        public void a() {
            E.this.E4(com.voxdon.xplorer.R.string.error, 1);
        }

        @Override // com.voxdon.xplorer.file.C3604x.f
        public void b(boolean z) {
            if (E.this.L3()) {
                E.this.c4(false);
                if (z) {
                    E.this.ha(this.a);
                }
            }
        }
    }

    /* renamed from: ax.d3.E$u, reason: case insensitive filesystem */
    class C1904u extends ax.g3.c {
        final /* synthetic */ AbstractC3595n c;

        C1904u(AbstractC3595n abstractC3595n) {
            this.c = abstractC3595n;
        }

        @Override // ax.g3.c
        public void a(View view) {
            E.this.L7(this.c, false);
        }
    }

    /* renamed from: ax.d3.E$v, reason: case insensitive filesystem */
    class C1905v implements PathBar.h {
        C1905v() {
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void a(String str) {
            if (E.this.K3()) {
                E.this.h3();
            }
            E.this.i3(str);
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void b(String str) {
            if (E.this.K3()) {
                E.this.h3();
            }
            if (E.this.T7()) {
                E.this.Z3(str);
            }
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void c(String str) {
            if (E.this.K3()) {
                E.this.h3();
            }
            E.this.L8();
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void d(String str) {
            if (E.this.K3()) {
                E.this.h3();
            }
            E.this.U3(str);
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void e() {
            if (E.this.K3()) {
                E.this.h3();
            }
            if (E.this.z3() == ax.Q2.f.F0) {
                ax.t3.k.D(System.currentTimeMillis());
                E.this.c4(true);
            } else {
                ax.Q2.a.i().m("menu_folder", "analyze").c("loc", E.this.z3().I()).c("by", "pathbar_analysis").e();
                E.this.O8();
            }
        }
    }

    /* renamed from: ax.d3.E$w, reason: case insensitive filesystem */
    class C1906w implements C1345a.c {
        C1906w() {
        }

        @Override // ax.a3.C1345a.c
        public void a(AbstractC1823k abstractC1823k) {
            if (E.this.b() == null) {
                return;
            }
            if (C1808A.Q(abstractC1823k)) {
                E.this.Q7(abstractC1823k);
                return;
            }
            Intent n = C1832u.n(C1832u.g(abstractC1823k), abstractC1823k.s(), true, false);
            if (C3180B.L(E.this.o3(), "com.google.android.packageinstaller")) {
                n.setPackage("com.google.android.packageinstaller");
                E.this.B8(n, 0, false, abstractC1823k.A());
            } else if (C1809B.P(abstractC1823k)) {
                E.this.E8(abstractC1823k, abstractC1823k.s(), false);
            } else if (C1809B.J(abstractC1823k)) {
                E.this.v8((C3590i) abstractC1823k, abstractC1823k.s(), false);
            }
        }
    }

    private void A8(AbstractC3595n abstractC3595n) {
        if (!X0() || d1() || Z0()) {
            return;
        }
        B8(Z6(abstractC3595n), 0, false, abstractC3595n.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A9(boolean z) {
        this.J0 = z;
        if (this.H0 == null) {
            C3184b.f();
            return;
        }
        ea(z);
        h7(!z);
        this.N0.setEnabled(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B8(Intent intent, int i, boolean z, String str) {
        String str2;
        AbstractC3595n abstractC3595n;
        if (!X0() || Z0()) {
            return false;
        }
        if (str == null) {
            if (intent.getData() != null) {
                str = ax.c3.d0.j(ax.c3.d0.h(intent.getData().getPath()));
            } else {
                if ("com.filemanager.plugin.action.LAUNCH_FILE_URI".equals(intent.getAction()) && intent.hasExtra("com.filemanager.plugin.extra.DATA")) {
                    String stringExtra = intent.getStringExtra("com.filemanager.plugin.extra.DATA");
                    if (stringExtra != null) {
                        str = ax.c3.d0.j(ax.c3.d0.h(Uri.parse(stringExtra).getPath()));
                    }
                } else {
                    C3184b.g("What case is this?" + intent);
                }
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        if (C1832u.R(str) && C1832u.W(intent) && intent.getData() != null && intent.getData().getPath() != null) {
            ax.Z2.k z2 = C2686c.z(intent.getData().getPath());
            if (z2 != null) {
                if (ax.Q2.f.l0(z3()) || (abstractC3595n = this.j1) == null || !abstractC3595n.N().getPath().equals(z2.e())) {
                    com.voxdon.xplorer.service.b.f(b()).a(z2.toString());
                    HttpServerService.q(o3(), z2.b(), z2.c(), false, false, true, null);
                } else {
                    intent.setData(HttpServerService.l(com.voxdon.xplorer.service.b.f(b()).h(), this.j1));
                    com.voxdon.xplorer.service.b.f(b()).a(this.j1.Q());
                    HttpServerService.q(o3(), z3(), x3(), false, false, true, null);
                }
            }
        } else if (C1832u.Y(intent)) {
            boolean W2 = C1832u.W(intent);
            boolean E = MyFileProvider.E(intent.getData());
            String packageName = intent.getComponent().getPackageName();
            if (ax.Q2.f.n0(z3()) && ((W2 || E) && intent.getData() != null && intent.getData().getPath() != null && C1808A.g(str) == EnumC1837z.VIDEO)) {
                AbstractC3595n abstractC3595n2 = this.j1;
                if (abstractC3595n2 != null) {
                    intent.putExtra("size", abstractC3595n2.p());
                }
                I6(intent, W2, E, packageName);
                if (C3180B.x(intent) >= 524288) {
                    intent.removeExtra("video_list");
                }
            }
        } else if (C1832u.X(intent)) {
            Uri data = intent.getData();
            if (MyFileProvider.B(data)) {
                intent.setDataAndType(MyFileProvider.i(data), intent.getType());
            }
        }
        T8();
        boolean n = C1834w.n(this, intent, i, z);
        this.J1 = n;
        if (n) {
            str2 = "success";
        } else {
            V6();
            str2 = "failure";
        }
        ax.Q2.a.i().m("command", "file_open").c("loc", z3().I()).c("ext", str).c("result", str2).e();
        return this.J1;
    }

    private void C8(Uri uri, String str, String str2, boolean z, boolean z2) {
        ax.a3.Q.R3(this, c.a.GENERAL, uri, str, str2, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C9(AbstractC3595n abstractC3595n, long j) {
        this.j1 = abstractC3595n;
        C2688e.b().h(abstractC3595n, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D8(AbstractC3595n abstractC3595n) {
        if (f0() == null || !X0() || d1()) {
            return;
        }
        if (abstractC3595n.isDirectory()) {
            if (this.i1 != null) {
                d9();
            }
            t8(abstractC3595n, 0, 0);
            return;
        }
        if (K8()) {
            String T2 = abstractC3595n.T();
            if (!ax.c3.d0.B(T2)) {
                ax.Ha.c.h().f().b("INVALID PARENT PATH").g("loc:" + z3() + ",path:" + T2).h();
                if (T2 != null && T2.endsWith("/")) {
                    T2 = ax.c3.d0.U(T2);
                }
            }
            if (!ax.c3.d0.G(this.n1, T2)) {
                d9();
                u8(T2, 0, 0);
            } else if (!this.o1 && !AbstractC3199q.n(this.u1)) {
                u8(T2, 0, 0);
            }
        }
        x8(abstractC3595n);
    }

    private void D9(AbstractC3595n abstractC3595n) {
        this.j1 = abstractC3595n;
        C2688e.b().h(abstractC3595n, 0L);
    }

    private void E6(List<AbstractC3595n> list) {
        ax.Q2.a.i().m("menu_folder", "bookmark").c("loc", z3().I()).c("type", a.e.a(list)).e();
        AbstractC3595n abstractC3595n = list.get(0);
        if (ax.V2.b.a(f0(), Bookmark.h(abstractC3595n.B(), A3(), abstractC3595n.E(), abstractC3595n.t(), abstractC3595n.isDirectory()), false)) {
            E4(com.voxdon.xplorer.R.string.msg_add_bookmark_success, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E8(AbstractC3595n abstractC3595n, String str, boolean z) {
        C3605y c3605y;
        Intent g;
        if (X0() && !d1() && !Z0()) {
            if (C1809B.P(abstractC3595n)) {
                c3605y = (C3605y) abstractC3595n;
                D9(abstractC3595n);
            } else {
                File N2 = abstractC3595n.N();
                C9(abstractC3595n, N2.lastModified());
                try {
                    c3605y = (C3605y) C1835x.f(N2).z(N2.getAbsolutePath());
                } catch (C1495j e2) {
                    E4(com.voxdon.xplorer.R.string.error_file_load, 1);
                    e2.printStackTrace();
                    return;
                }
            }
            C3605y c3605y2 = c3605y;
            int i = 0;
            if (ax.t3.j.C(o3()) && C1808A.B(c3605y2, true) && str == null) {
                g = Z6(abstractC3595n);
            } else {
                if (ax.t3.j.F(o3()) && C1808A.E(c3605y2) && str == null && !ax.a3.Q.K3(o3(), c.a.GENERAL, c3605y2, false)) {
                    R8(abstractC3595n);
                } else if (ax.t3.j.D(o3()) && C1808A.C(c3605y2) && str == null && !ax.a3.Q.J3(o3(), c3605y2, false)) {
                    G8(c3605y2);
                } else if (ax.t3.j.E(o3()) && ((C1808A.D(c3605y2) && str == null) || (ax.c3.V.TEXT.h().equals(str) && !z))) {
                    g = C1834w.g(o3(), abstractC3595n, c3605y2);
                    z = false;
                    i = 1002;
                } else if (C1808A.p(abstractC3595n) && str == null) {
                    k7(Collections.singletonList(abstractC3595n));
                } else {
                    if (!ax.X2.Q.H1() || !C1808A.K(abstractC3595n) || str != null) {
                        String s = c3605y2.s();
                        String str2 = str != null ? str : s;
                        ja(abstractC3595n, c3605y2.F0());
                        s8(c3605y2, s, str2, z, true);
                        return;
                    }
                    o8(c3605y2);
                }
                g = null;
            }
            if (g != null) {
                B8(g, i, z, abstractC3595n.A());
            }
        }
    }

    private void F6(AbstractC3595n abstractC3595n, long j) {
        if (abstractC3595n == null || f0() == null || !C7()) {
            return;
        }
        v3().r0(Bookmark.j(A3(), abstractC3595n.E(), abstractC3595n.t(), abstractC3595n.isDirectory(), j));
    }

    public static String F7(Context context, ax.Q2.f fVar, int i, String str, boolean z) {
        String j = ax.t3.e.j(context, fVar, i, str, z);
        return z ? "SizeUp".equals(j) ? "RecursiveUp" : "SizeDown".equals(j) ? "RecursiveDown" : j : j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F8(AbstractC3595n abstractC3595n) {
        if (!X0() || d1()) {
            return;
        }
        String s = abstractC3595n.s();
        File N2 = abstractC3595n.N();
        if (abstractC3595n instanceof AbstractC1823k) {
            D9(abstractC3595n);
        } else {
            C9(abstractC3595n, N2.lastModified());
        }
        if (!C1834w.a(o3(), abstractC3595n, s, false)) {
            ba(abstractC3595n, true);
        } else {
            ja(abstractC3595n, N2);
            y8(N2, s, s, true, true);
        }
    }

    private void F9() {
        if (u3() == null || u3().e0) {
            this.W0.setParentLocation(this.G1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G6(Menu menu, boolean z) {
        if (f0() == null) {
            return;
        }
        if (z) {
            menu.setGroupVisible(com.voxdon.xplorer.R.id.group_non_search, false);
            menu.setGroupVisible(com.voxdon.xplorer.R.id.group_search_option, true);
            return;
        }
        menu.setGroupVisible(com.voxdon.xplorer.R.id.group_non_search, true);
        menu.setGroupVisible(com.voxdon.xplorer.R.id.group_search_option, false);
        MenuItem findItem = menu.findItem(com.voxdon.xplorer.R.id.menu_analyze);
        if (findItem != null) {
            findItem.setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H9(List<AbstractC3595n> list) {
        ax.u3.z.c(v3());
        com.voxdon.xplorer.widget.a aVar = this.d1;
        if (aVar != null) {
            aVar.clear();
            this.d1.f0();
            this.d1.addAll(list);
        }
        com.voxdon.xplorer.widget.a aVar2 = this.e1;
        if (aVar2 != null) {
            aVar2.clear();
            this.e1.f0();
            this.e1.addAll(list);
        }
        this.g1.f();
        R6();
        g8();
    }

    private void I6(Intent intent, boolean z, boolean z2, String str) {
        Context b = b();
        if (b == null) {
            return;
        }
        int h = z ? com.voxdon.xplorer.service.b.f(b).h() : 0;
        ArrayList<AbstractC3595n> N2 = this.c1.N();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < N2.size(); i++) {
            AbstractC3595n abstractC3595n = N2.get(i);
            if (abstractC3595n.G() == EnumC1837z.VIDEO) {
                if (z) {
                    com.voxdon.xplorer.service.b.f(b).c(abstractC3595n);
                    arrayList.add(HttpServerService.l(h, abstractC3595n));
                    arrayList2.add(Long.valueOf(abstractC3595n.p()));
                } else {
                    try {
                        Uri L2 = C1832u.L(abstractC3595n, z2);
                        b.grantUriPermission(str, L2, 65);
                        arrayList.add(L2);
                        arrayList2.add(Long.valueOf(abstractC3595n.p()));
                    } catch (Exception unused) {
                    }
                }
            }
        }
        intent.putExtra("video_list", (Parcelable[]) arrayList.toArray(new Uri[0]));
        if (arrayList2.size() == arrayList.size()) {
            intent.putExtra("video_list.size", ax.u7.h.k(arrayList2));
        }
    }

    private e.a I7(int i, AbstractC3595n abstractC3595n, boolean z) {
        Uri L2 = z ? C1832u.L(abstractC3595n, true) : HttpServerService.l(i, abstractC3595n);
        AbstractC3595n V2 = this.c1.V(abstractC3595n);
        return new e.a(L2, V2 != null ? z ? C1832u.L(V2, true) : HttpServerService.l(i, V2) : null);
    }

    private void I8(AbstractC3595n abstractC3595n, boolean z) {
        if (!X0() || d1()) {
            return;
        }
        String s = abstractC3595n.s();
        if (ax.Q2.f.n0(abstractC3595n.P()) && "application/octet-stream".equals(s)) {
            s = C1833v.e(abstractC3595n, "application/octet-stream");
        }
        String str = s;
        if (!z && ax.t3.j.F(o3()) && C1808A.M(str, false) && !ax.a3.Q.K3(o3(), c.a.GENERAL, abstractC3595n, true)) {
            R8(abstractC3595n);
            return;
        }
        if (!z && ax.t3.j.D(o3()) && C1808A.C(abstractC3595n) && !ax.a3.Q.J3(o3(), abstractC3595n, true)) {
            G8(abstractC3595n);
            return;
        }
        Uri l = HttpServerService.l(com.voxdon.xplorer.service.b.f(b()).h(), abstractC3595n);
        Intent n = C1832u.n(l, str, false, false);
        if (!C3180B.K(o3(), n)) {
            g7(abstractC3595n, z, null);
            return;
        }
        com.voxdon.xplorer.service.b.f(b()).c(abstractC3595n);
        HttpServerService.q(o3(), z3(), x3(), false, true, true, n);
        C8(l, str, str, z, false);
    }

    private Intent J6(AbstractC3595n abstractC3595n) {
        if (this.c1 == null) {
            return null;
        }
        boolean e2 = C1809B.e(abstractC3595n);
        int h = com.voxdon.xplorer.service.b.f(b()).h();
        Uri L2 = e2 ? C1832u.L(abstractC3595n, true) : HttpServerService.l(h, abstractC3595n);
        ArrayList<AbstractC3595n> N2 = this.c1.N();
        Iterator<AbstractC3595n> it = N2.iterator();
        while (it.hasNext()) {
            AbstractC3595n next = it.next();
            if (!(ax.a3.Q.I3(o3(), L2) ? C1808A.F(next) : C1808A.E(next))) {
                it.remove();
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < N2.size(); i++) {
            arrayList.add(I7(h, N2.get(i), e2));
        }
        if (arrayList.size() == 0) {
            arrayList.add(I7(h, abstractC3595n, e2));
        }
        Intent j = C1834w.j(o3(), L2, arrayList, ax.Q2.f.g0(z3()), true);
        if (!e2) {
            com.voxdon.xplorer.service.b.f(b()).c(abstractC3595n);
            if (N2.size() > 0) {
                com.voxdon.xplorer.service.b.f(b()).b(N2);
            }
            HttpServerService.q(o3(), z3(), x3(), false, true, false, j);
        }
        return j;
    }

    private void J8(List<AbstractC3595n> list) {
        ax.Q2.a.i().m("menu_folder", "open_parent").c("loc", z3().I()).e();
        if (list.size() <= 0) {
            return;
        }
        AbstractC3595n abstractC3595n = list.get(0);
        if (abstractC3595n.isDirectory()) {
            return;
        }
        if (!(abstractC3595n instanceof com.voxdon.xplorer.file.C)) {
            C3184b.f();
        } else {
            C3605y c3605y = (C3605y) abstractC3595n;
            P8(Uri.parse(C1809B.U(c3605y.B0(), c3605y.T())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K9(ax.c3.K k, String str) {
        com.voxdon.xplorer.widget.a aVar = this.d1;
        if (aVar != null) {
            aVar.t0(k, str);
        }
        com.voxdon.xplorer.widget.a aVar2 = this.e1;
        if (aVar2 != null) {
            aVar2.t0(k, str);
        }
    }

    private void L6() {
        M6();
        n0 n0Var = this.w1;
        if (n0Var != null) {
            n0Var.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L7(AbstractC3595n abstractC3595n, boolean z) {
        new C3604x.g(w7(), abstractC3595n, z, new C1903t(abstractC3595n)).i(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L8() {
        String r = this.s1 ? "/" : ax.c3.d0.r(this.n1);
        c.a c = this.f1.c(r);
        if (c == null) {
            Z3(r);
        } else {
            d9();
            t8(c.a(), c.b(), c.i());
        }
    }

    private void M6() {
        r0 r0Var = this.u1;
        if (r0Var != null) {
            r0Var.e();
        }
        q0 q0Var = this.v1;
        if (q0Var != null) {
            q0Var.e();
        }
    }

    private boolean M7() {
        ax.V2.c cVar = this.f1;
        c.a e2 = cVar != null ? cVar.e() : null;
        if (e2 == null) {
            return false;
        }
        ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", z3().I()).c("by", "hw_back").e();
        if (!e2.j()) {
            t8(e2.a(), e2.b(), e2.i());
            return true;
        }
        M8(e2.f(), e2.e(), e2.c(), e2.h(), e2.d(), e2.g());
        t8(e2.a(), e2.b(), e2.i());
        return true;
    }

    private void M8(String str, String str2, ax.Z2.p pVar, String str3, int i, int i2) {
        if (f0() == null || str2 == null || str2.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("query", str2);
        bundle.putString("ROOT", str);
        bundle.putSerializable("LOCATION", z3());
        bundle.putInt("LOCATION_KEY", x3());
        bundle.putBoolean("INCLUDE_SUBFOLDER", this.Y1);
        bundle.putSerializable("FILTER_INFO", pVar);
        bundle.putString("SORT_METHOD", str3);
        bundle.putInt("INDEX", i);
        bundle.putInt("TOP", i2);
        h3();
        this.I0.d(str2);
        ((MainActivity) f0()).f2(A3(), bundle);
    }

    private void M9() {
        C3180B.d0(A0(), C1358n.l3(0, com.voxdon.xplorer.R.string.error_access_denied, android.R.string.ok, 0, true, true), "confirm_access_denied", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N6(boolean z) {
        if (this.J1) {
            ax.s3.u.j(o3()).a(120);
            AbstractC3595n abstractC3595n = this.j1;
            if (abstractC3595n != null) {
                String str = this.n1;
                if (str != null && !ax.c3.d0.I(str, abstractC3595n.E())) {
                    this.J1 = false;
                    V6();
                    return;
                } else if (!C1809B.H(this.j1)) {
                    pa();
                }
            }
            if (z) {
                this.J1 = false;
                V6();
            }
        }
    }

    private void N7() {
        if (this.f1 == null) {
            this.f1 = x7();
        }
        if (this.n1 == null) {
            this.n1 = A3().e();
            this.o1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N9(String str) {
        Snackbar T2;
        if (f0() == null) {
            return;
        }
        androidx.fragment.app.f f02 = f0();
        String b = ax.w3.h.b(f02, str);
        View D3 = D3(true);
        if (ax.w3.d.w(f02, str)) {
            T2 = C3180B.T(D3, b, 0);
            T2.q0(com.voxdon.xplorer.R.string.download_action, new T(str));
        } else {
            T2 = C3180B.T(D3, b, 0);
        }
        D4(T2);
    }

    private void P6() {
        if (L3()) {
            return;
        }
        ax.Ha.c.h().d("STATCHK").j().g("RESUMED:" + e1()).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P7() {
        if (!ax.Q2.f.g0(z3())) {
            if (this.a2) {
                return;
            }
            this.Y1 = true;
            this.Z1 = true;
            this.a2 = true;
            return;
        }
        if (ax.c3.d0.E(this.i1)) {
            this.Y1 = true;
            this.Z1 = false;
        } else {
            this.Y1 = false;
            this.Z1 = false;
        }
    }

    public static /* synthetic */ void Q4(E e2, Bundle bundle) {
        e2.getClass();
        if (bundle.getBoolean("result_pref_changed")) {
            e2.n8();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q6() {
        com.voxdon.xplorer.widget.a aVar = this.d1;
        if (aVar != null) {
            aVar.clear();
        }
        com.voxdon.xplorer.widget.a aVar2 = this.e1;
        if (aVar2 != null) {
            aVar2.clear();
        }
        this.g1.f();
        R6();
        g8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q7(AbstractC3595n abstractC3595n) {
        if (f0() == null || !X0()) {
            return;
        }
        if (!(abstractC3595n instanceof AbstractC1823k)) {
            C3184b.f();
            return;
        }
        if (ax.U2.d.V(abstractC3595n.A()) && com.voxdon.xplorer.shizuku.c.t().C()) {
            com.voxdon.xplorer.shizuku.c.t().m(new C1907x(abstractC3595n));
            if (com.voxdon.xplorer.shizuku.c.t().A()) {
                return;
            }
        }
        new s0((AbstractC1823k) abstractC3595n).i(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q8(C3605y c3605y) {
        Uri m = C3588g.m(A3(), c3605y.M0());
        try {
            Intent intent = new Intent();
            if (ax.X2.Q.L0() && C3180B.L(o3(), "com.google.android.documentsui")) {
                intent.setPackage("com.google.android.documentsui");
            } else if (C3180B.L(o3(), "com.android.documentsui")) {
                intent.setPackage("com.android.documentsui");
            }
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(m, "vnd.android.document/root");
            intent.setFlags(134217728);
            C1832u.p0(this, intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void R4(E e2, boolean z, Bundle bundle) {
        e2.getClass();
        int i = bundle.getInt("result_selection", -1);
        if (i == -1) {
            return;
        }
        if (i == 0) {
            e2.p8(ax.c3.V.TEXT, z);
            return;
        }
        if (i == 1) {
            e2.p8(ax.c3.V.IMAGE, z);
            return;
        }
        if (i == 2) {
            e2.p8(ax.c3.V.AUDIO, z);
        } else if (i == 3) {
            e2.p8(ax.c3.V.VIDEO, z);
        } else {
            if (i != 4) {
                return;
            }
            e2.p8(ax.c3.V.OTHER, z);
        }
    }

    private void R6() {
        this.O1 = -1;
        this.V1 = 0L;
        this.W1.setLength(0);
    }

    private void R8(AbstractC3595n abstractC3595n) {
        Intent J6 = J6(abstractC3595n);
        if (J6 != null) {
            B8(J6, 0, false, abstractC3595n.A());
        }
    }

    public static /* synthetic */ void S4(E e2, Bundle bundle) {
        e2.getClass();
        if (bundle.getBoolean("result_pref_changed")) {
            e2.I3();
        }
    }

    private void S8(List<AbstractC3595n> list) {
        ax.Q2.a.i().m("menu_folder", "open_with").c("loc", z3().I()).e();
        AbstractC3595n abstractC3595n = list.get(0);
        if (abstractC3595n.isDirectory()) {
            return;
        }
        if (C1809B.P(abstractC3595n)) {
            F8(abstractC3595n);
            return;
        }
        if (C1809B.J(abstractC3595n)) {
            w8((C3590i) abstractC3595n);
            return;
        }
        if (C1808A.G(abstractC3595n)) {
            D9(abstractC3595n);
            I8(abstractC3595n, true);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractC3595n);
            f3(w7(), arrayList, new K(abstractC3595n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S9(Throwable th, boolean z) {
        ka(true);
        this.R0.setText(com.voxdon.xplorer.R.string.error_loading);
        if (z && z3() == ax.Q2.f.p0 && this.n1 == null) {
            this.S0.setText(com.voxdon.xplorer.R.string.no_sdcard);
            return;
        }
        if (th instanceof C1490e) {
            if (ax.t3.j.o(o3())) {
                ax.Ha.c.h().f().d("Debug Mode : Loading Error : Access Denied").l(th).h();
                this.S0.setText(M0(com.voxdon.xplorer.R.string.error_access_denied) + " : " + th.getMessage());
            } else {
                this.S0.setText(com.voxdon.xplorer.R.string.error_access_denied);
            }
            if (this.T0 != null) {
                if (ax.X2.Q.L()) {
                    AbstractC3595n abstractC3595n = this.i1;
                    if ((abstractC3595n instanceof C3605y) && ((C3605y) abstractC3595n).a1()) {
                        if (com.voxdon.xplorer.shizuku.c.t().C()) {
                            this.T0.setVisibility(0);
                            this.T0.setText(com.voxdon.xplorer.R.string.msg_start_shizuku);
                            this.T0.setOnClickListener(new Y());
                            return;
                        } else if (ax.X2.J.D(o3())) {
                            this.T0.setVisibility(8);
                            return;
                        } else {
                            if (z3() != ax.Q2.f.t0) {
                                C3605y c3605y = (C3605y) this.i1;
                                this.T0.setVisibility(0);
                                this.T0.setOnClickListener(new Z(c3605y));
                                return;
                            }
                            return;
                        }
                    }
                }
                this.T0.setVisibility(8);
                return;
            }
            return;
        }
        if (th instanceof ax.b3.t) {
            if (ax.X2.P.a()) {
                this.S0.setText(com.voxdon.xplorer.R.string.error_access_denied);
                return;
            } else {
                this.S0.setText(com.voxdon.xplorer.R.string.error_folder_does_not_exist_anymore);
                return;
            }
        }
        if (th instanceof C1492g) {
            this.S0.setText(com.voxdon.xplorer.R.string.file_corrupted);
            return;
        }
        if (!ax.Q2.f.n0(z3())) {
            if (th == null || !ax.t3.j.o(o3())) {
                this.S0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            }
            String str = "Cause:" + th.getMessage();
            if (th.getCause() != null) {
                str = str + "\n" + th.getCause().getMessage();
            }
            this.S0.setText(str);
            return;
        }
        if (th == null || !ax.t3.j.o(o3())) {
            this.S0.setText(com.voxdon.xplorer.R.string.error_check_network);
            return;
        }
        ax.Ha.c.h().f().d("Debug Mode : Loading Error : Check network").l(th).h();
        String str2 = M0(com.voxdon.xplorer.R.string.error_check_network) + ":\n" + th.getMessage();
        if (th.getCause() != null) {
            str2 = str2 + "\n" + th.getCause().getMessage();
        }
        this.S0.setText(str2);
    }

    private void T6() {
        for (int i = 0; i < this.N0.getChildCount(); i++) {
            ((a.c) this.N0.getChildAt(i).getTag()).t();
        }
    }

    private void T8() {
        this.L1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U7(e.C0217e c0217e) {
        AbstractC3595n abstractC3595n = c0217e.c;
        return (abstractC3595n == null || this.i1 == null || abstractC3595n.Q().equals(this.i1.Q())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U9(String str) {
        int O2 = this.c1.O(str);
        if (O2 >= 0) {
            Z9(O2);
        }
    }

    private void V6() {
        if (this.j1 == null) {
            return;
        }
        this.j1 = null;
        C2688e.b().a();
        this.k1 = -1L;
        if (b() != null) {
            FileObserverService.b(b());
        }
        C2685b.j().n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V7() {
        return this.N0.getCheckedItemCount() > 1;
    }

    private void W6(List<AbstractC3595n> list) {
        if (X9(A3())) {
            return;
        }
        ax.Q2.a.i().m("menu_folder", "compress").c("loc", z3().I()).c("type", a.e.a(list)).e();
        ax.W2.k n = ax.W2.k.n();
        n.k(w7(), list, new A());
        C1357m m3 = C1357m.m3(n.l());
        m3.p3(new B(n));
        A(m3, "compressFileName", true);
    }

    private boolean W7() {
        C3405A h02;
        com.voxdon.xplorer.activity.b v3 = v3();
        return (v3 == null || (h02 = v3.h0()) == null || h02.k() != 0) ? false : true;
    }

    public static boolean X7(Context context, AbstractC3595n abstractC3595n) {
        boolean z;
        if (TextUtils.isEmpty(abstractC3595n.A())) {
            return true;
        }
        if (ax.t3.j.C(context) && C1808A.B(abstractC3595n, true)) {
            return false;
        }
        if (ax.t3.j.D(context) && C1808A.C(abstractC3595n)) {
            return false;
        }
        if (ax.t3.j.E(context) && C1808A.D(abstractC3595n)) {
            return false;
        }
        if ((ax.t3.j.F(context) && C1808A.E(abstractC3595n)) || C1808A.p(abstractC3595n)) {
            return false;
        }
        if (ax.X2.Q.H1() && C1808A.Q(abstractC3595n)) {
            return false;
        }
        String s = abstractC3595n.s();
        if ("application/octet-stream".equals(s) || TextUtils.isEmpty(s)) {
            s = C1833v.e(abstractC3595n, "application/octet-stream");
            z = true;
        } else {
            z = false;
        }
        if ("application/octet-stream".equals(s) && !C1809B.C(context, abstractC3595n)) {
            return true;
        }
        if (C1834w.a(context, abstractC3595n, s, false)) {
            return false;
        }
        if (!z) {
            String e2 = C1833v.e(abstractC3595n, "application/octet-stream");
            if (s != null && !s.equals(e2) && C1834w.a(context, abstractC3595n, e2, false)) {
                return false;
            }
        }
        return true;
    }

    private void X8() {
        int selectedItemPosition;
        AbsListView absListView = this.N0;
        GridView gridView = this.L0;
        if (absListView != gridView || gridView.isInTouchMode() || this.R1 || this.L0.getChildCount() == 0 || (selectedItemPosition = this.L0.getSelectedItemPosition()) == -1) {
            return;
        }
        View childAt = this.L0.getChildAt(selectedItemPosition - this.L0.getFirstVisiblePosition());
        if (childAt == null) {
            return;
        }
        this.R1 = true;
        this.S1 = selectedItemPosition;
        this.T1 = childAt.getTop();
        this.U1 = childAt.getHeight();
        this.L0.addOnLayoutChangeListener(new P());
    }

    private boolean X9(ax.c3.K k) {
        if (!C3604x.C1(o3(), k, null)) {
            return false;
        }
        o9(3, k, null, false);
        return true;
    }

    private void Y6() {
        if (Z0()) {
            return;
        }
        if (S7()) {
            h9();
        } else {
            X6();
        }
    }

    private Intent Z6(AbstractC3595n abstractC3595n) {
        String E;
        ArrayList<AbstractC3595n> arrayList;
        int i;
        ArrayList<AbstractC3595n> arrayList2;
        String str;
        if (this.o1) {
            E = this.n1;
            ArrayList<AbstractC3595n> P2 = this.c1.P();
            int i2 = -1;
            for (int i3 = 0; i3 < P2.size(); i3++) {
                if (abstractC3595n.E().equals(P2.get(i3).E())) {
                    i2 = i3;
                }
            }
            if (i2 != -1) {
                arrayList2 = P2;
                i = i2;
                str = E;
                return C1834w.c(f0(), A3(), str, arrayList2, i, true);
            }
            arrayList = new ArrayList<>();
            arrayList.add(abstractC3595n);
        } else {
            E = abstractC3595n.E();
            arrayList = new ArrayList<>();
            arrayList.add(abstractC3595n);
        }
        str = E;
        arrayList2 = arrayList;
        i = 0;
        return C1834w.c(f0(), A3(), str, arrayList2, i, true);
    }

    private boolean Z7(int i) {
        return i == com.voxdon.xplorer.R.id.menu_selection_settings || i == com.voxdon.xplorer.R.id.menu_select_all || i == com.voxdon.xplorer.R.id.menu_select_range;
    }

    private void Z9(int i) {
        int height = this.N0.getHeight() / 2;
        AbsListView absListView = this.N0;
        if ((absListView instanceof ListView) || !absListView.isInTouchMode()) {
            this.N0.setSelectionFromTop(i, height);
        } else {
            this.N0.setSelection(i);
            this.N0.post(new RunnableC1896m(height));
        }
    }

    private boolean a9(int i) {
        char c = (char) i;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        int selectedItemPosition = this.N0.getSelectedItemPosition();
        int i2 = -1;
        if (selectedItemPosition < 0 || this.O1 != selectedItemPosition) {
            selectedItemPosition = -1;
        }
        if (this.W1.length() == 1 && this.W1.charAt(0) == c && selectedItemPosition >= 0 && (i2 = this.c1.M(selectedItemPosition + 1, String.valueOf(c))) >= 0) {
            this.W1.setLength(0);
        }
        if (i2 < 0) {
            if (selectedItemPosition < 0) {
                selectedItemPosition = 0;
            }
            if (this.V1 < currentTimeMillis - 3000) {
                this.W1.setLength(0);
                selectedItemPosition = 0;
            }
            sb.append(this.W1);
            sb.append(c);
            i2 = this.c1.M(selectedItemPosition, sb.toString());
            if (i2 < 0 && this.W1.length() != 0 && this.V1 < currentTimeMillis - 1500) {
                this.W1.setLength(0);
                i2 = this.c1.M(0, String.valueOf(c));
            }
        }
        this.V1 = System.currentTimeMillis();
        if (i2 < 0) {
            return false;
        }
        Z9(i2);
        this.W1.append(c);
        this.O1 = i2;
        return true;
    }

    private void b7(List<AbstractC3595n> list, int i) {
        String I2;
        if (a8()) {
            String a = a.e.a(list);
            if (this.H1) {
                I2 = z3().I() + "-analysis";
            } else {
                I2 = z3().I();
            }
            ax.Q2.a.i().m("menu_folder", "delete").c("loc", I2).c("type", a).e();
            c7(list, i);
        }
    }

    private void ba(AbstractC3595n abstractC3595n, final boolean z) {
        this.t1 = abstractC3595n;
        A(ax.a3.J.i3(), "open_as", true);
        ax.d3.J.c(this, "request_open_as", new Consumer() { // from class: ax.d3.B
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void s(Object obj) {
                E.R4(E.this, z, (Bundle) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d8(AbsListView absListView, int i, int i2, KeyEvent keyEvent) {
        int i3;
        if (this.P1 == -1) {
            i3 = absListView.getSelectedItemPosition();
            if (i3 == -1) {
                return false;
            }
            this.P1 = i3;
            this.Q1 = i3;
            absListView.setItemChecked(i3, true);
        } else {
            i3 = this.Q1;
        }
        int i4 = i + i3;
        if (i4 >= 0 && i4 < absListView.getCount()) {
            int min = Math.min(this.P1, i3);
            int max = Math.max(this.P1, i3);
            int min2 = Math.min(this.P1, i4);
            int max2 = Math.max(this.P1, i4);
            for (int i5 = min; i5 <= max; i5++) {
                if (i5 < min2 || i5 > max2) {
                    absListView.setItemChecked(i5, false);
                }
            }
            while (min2 <= max2) {
                if (min2 < min || min2 > max) {
                    absListView.setItemChecked(min2, true);
                }
                min2++;
            }
            this.Q1 = i4;
            e8(absListView, i4, i2, keyEvent);
        }
        return true;
    }

    private void d9() {
        if (this.o1) {
            int firstVisiblePosition = this.N0.getFirstVisiblePosition();
            View childAt = this.N0.getChildAt(0);
            this.f1.f(this.i1, firstVisiblePosition, childAt != null ? childAt.getTop() - this.N0.getPaddingTop() : 0);
        }
    }

    private void e8(AbsListView absListView, int i, int i2, KeyEvent keyEvent) {
        int height;
        if (!(absListView instanceof GridView)) {
            absListView.onKeyDown(i2, new KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), i2, keyEvent.getRepeatCount(), 0, keyEvent.getDeviceId(), keyEvent.getScanCode(), keyEvent.getFlags(), keyEvent.getSource()));
            return;
        }
        int paddingTop = absListView.getPaddingTop();
        int firstVisiblePosition = absListView.getFirstVisiblePosition();
        int lastVisiblePosition = absListView.getLastVisiblePosition();
        if (i < firstVisiblePosition || i > lastVisiblePosition) {
            if (i > lastVisiblePosition && absListView.getChildCount() > 0) {
                height = absListView.getChildAt(absListView.getChildCount() - 1).getHeight();
                paddingTop = Math.max(absListView.getPaddingTop(), (absListView.getHeight() - absListView.getPaddingBottom()) - height);
            }
            height = 0;
        } else {
            View childAt = absListView.getChildAt(i - firstVisiblePosition);
            if (childAt != null) {
                paddingTop = childAt.getTop();
                height = childAt.getHeight();
            }
            height = 0;
        }
        if (height == 0 && absListView.getChildCount() > 0) {
            height = absListView.getChildAt(0).getHeight();
        }
        if (!this.R1) {
            absListView.setSelectionFromTop(i, paddingTop);
            return;
        }
        this.S1 = i;
        this.T1 = paddingTop;
        this.U1 = height;
    }

    private void ea(boolean z) {
        if (!z) {
            this.H0.setVisibility(8);
            return;
        }
        this.H0.setVisibility(0);
        this.I0.g();
        this.G0.setAdapter(this.I0.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7(String str) {
        E e2;
        if (str == null || str.isEmpty()) {
            e2 = this;
        } else {
            L6();
            e2 = this;
            e2.M8(C3(), str, null, null, -1, -1);
        }
        e2.X0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        e2.y1.collapseActionView();
        ((InputMethodManager) f0().getSystemService("input_method")).hideSoftInputFromWindow(e2.X0.getWindowToken(), 2);
    }

    private void f9(List<AbstractC3595n> list) {
        if (f0() == null) {
            return;
        }
        if (ax.Q2.f.Y(z3())) {
            if (QuickShareProvider.c() == null) {
                E4(com.voxdon.xplorer.R.string.error, 1);
                return;
            } else {
                new o0(list).i(new String[0]);
                return;
            }
        }
        C3184b.g("Invalid quick share location:" + z3().I());
        E4(com.voxdon.xplorer.R.string.error, 1);
    }

    private void g7(AbstractC3595n abstractC3595n, boolean z, Intent intent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC3595n);
        f3(w7(), arrayList, new N(intent, abstractC3595n, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g8() {
        com.voxdon.xplorer.widget.a aVar = this.d1;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        com.voxdon.xplorer.widget.a aVar2 = this.e1;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g9() {
        int i;
        e4(false);
        if (K3()) {
            if (this.Y0.k() != 0) {
                X8();
            }
            this.Y0.y(0);
            this.Y0.A();
            this.N0.post(new Q());
            return;
        }
        if (!W7() || (i = q7()) < 0) {
            i = -1;
        }
        int parentButtonId = this.W0.getParentButtonId();
        this.K0.setNextFocusLeftId(parentButtonId);
        this.L0.setNextFocusLeftId(parentButtonId);
        this.K0.setNextFocusRightId(i);
        this.L0.setNextFocusRightId(i);
        this.Y0.y(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ga(e.C0217e c0217e) {
        C3596o c3596o;
        if (b() == null) {
            return;
        }
        if (c0217e == null) {
            C3184b.f();
            return;
        }
        ax.x3.x xVar = new ax.x3.x(new C3036c(b(), com.voxdon.xplorer.R.style.Bottom_Widget_PopupTheme));
        if (U7(c0217e)) {
            xVar.b(com.voxdon.xplorer.R.drawable.ic_folder_open, com.voxdon.xplorer.R.string.menu_return_to_source_folder, new V(c0217e));
        }
        if (c0217e.a && (c3596o = c0217e.b) != null && c3596o.a()) {
            xVar.b(com.voxdon.xplorer.R.drawable.ic_button_copy, com.voxdon.xplorer.R.string.menu_copy_again, new W(c0217e));
        }
        C3596o c3596o2 = c0217e.b;
        if (c3596o2 != null) {
            c3596o2.n0();
        }
        xVar.c(this.V0, 0, -C3180B.e(b(), 8), new X(c0217e));
    }

    private void h7(boolean z) {
        this.D0.setEnabled(z);
        this.E0.setEnabled(z);
        this.C0.setEnabled(z);
        this.W0.setActionButtonEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ha(AbstractC3595n abstractC3595n) {
        if (b() == null) {
            return;
        }
        D4(C3180B.O(this.U0, N0(com.voxdon.xplorer.R.string.msg_hidden_single_item, abstractC3595n.B()), 0, com.voxdon.xplorer.R.string.menu_undo, false, new C1904u(abstractC3595n)));
    }

    private void i9() {
        MediaControllerCompat c;
        if (f0() == null || (c = MediaControllerCompat.c(f0())) == null) {
            return;
        }
        MediaControllerCompat mediaControllerCompat = this.g2;
        if (mediaControllerCompat != null && mediaControllerCompat != c) {
            oa();
        }
        this.g2 = c;
        c.j(this.m2);
    }

    private void j7(String str) {
        if (!ax.c3.d0.B(str)) {
            ax.Ha.c.h().d("Open Not Normalized Path").j().g(str).h();
            str = ax.c3.d0.U(str);
        }
        n0 n0Var = this.w1;
        if (n0Var != null && !n0Var.isCancelled()) {
            this.w1.e();
        }
        if (!S7() && !ax.Q2.f.D0(z3())) {
            ax.Ha.c.h().b("!! NOT CONNECT EXECUTE OPEN TASK !!").j().g("location: " + z3() + "," + e1() + "," + S3()).h();
        }
        n0 n0Var2 = new n0(str);
        this.w1 = n0Var2;
        n0Var2.i(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ja(AbstractC3595n abstractC3595n, File file) {
        if (ax.Q2.f.n0(abstractC3595n.P()) && C1808A.u(abstractC3595n)) {
            FileObserverService.a(b(), abstractC3595n, file);
        }
    }

    private void k7(List<AbstractC3595n> list) {
        ax.Q2.a.i().m("menu_folder", "extract").c("loc", z3().I()).e();
        C1367x c1367x = new C1367x();
        Bundle bundle = new Bundle();
        this.q1 = list;
        if (list.isEmpty()) {
            C3184b.f();
            return;
        }
        if (list.size() == 1) {
            this.r1 = list.get(0).T();
        } else {
            String str = this.n1;
            this.r1 = str;
            if (TextUtils.isEmpty(str)) {
                C3184b.g("Current Path is Null");
                return;
            }
        }
        bundle.putString("fileName", list.get(0).B());
        bundle.putInt("numArchiveFiles", list.size());
        bundle.putInt("showOption", !a8() ? 2 : C1809B.D(list) ? 0 : 1);
        c1367x.v2(bundle);
        c1367x.D2(this, 0);
        A(c1367x, "extract", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka(boolean z) {
        if (z) {
            this.F0.setVisibility(4);
            this.C0.setVisibility(0);
        } else {
            this.F0.setVisibility(0);
            this.C0.setVisibility(4);
        }
    }

    private void l9() {
        if (this.i1 != null) {
            ax.Z2.b.k().v(this.i1);
        }
    }

    private void la(int i) {
        r9();
        this.D0.setVisibility(8);
        this.E0.setVisibility(8);
        if (z3() == ax.Q2.f.l1) {
            this.N0 = this.K0;
            this.F0 = this.D0;
            com.voxdon.xplorer.widget.a aVar = this.d1;
            this.c1 = aVar;
            aVar.o0(20);
        } else if (i == 0) {
            this.N0 = this.K0;
            this.F0 = this.D0;
            com.voxdon.xplorer.widget.a aVar2 = this.d1;
            this.c1 = aVar2;
            aVar2.o0(0);
        } else if (i == 1) {
            this.N0 = this.K0;
            this.F0 = this.D0;
            com.voxdon.xplorer.widget.a aVar3 = this.d1;
            this.c1 = aVar3;
            aVar3.o0(1);
        } else if (i == 10) {
            this.N0 = this.K0;
            this.F0 = this.D0;
            com.voxdon.xplorer.widget.a aVar4 = this.d1;
            this.c1 = aVar4;
            aVar4.o0(10);
        } else if (i == 2) {
            this.N0 = this.L0;
            this.F0 = this.E0;
            com.voxdon.xplorer.widget.a aVar5 = this.e1;
            this.c1 = aVar5;
            aVar5.o0(2);
        } else if (i == 12) {
            this.N0 = this.L0;
            this.F0 = this.E0;
            com.voxdon.xplorer.widget.a aVar6 = this.e1;
            this.c1 = aVar6;
            aVar6.o0(12);
        } else if (i == 16) {
            this.N0 = this.L0;
            this.F0 = this.E0;
            com.voxdon.xplorer.widget.a aVar7 = this.e1;
            this.c1 = aVar7;
            aVar7.o0(16);
        }
        this.F0.setVisibility(0);
        this.N0.setAdapter((ListAdapter) this.c1);
        this.O0 = i;
        y9(v3().i0().x);
    }

    private void m9(List<AbstractC3595n> list) {
        if (list.size() > 0 && a8()) {
            ax.Q2.a.i().m("menu_folder", "rename").c("loc", z3().I()).c("type", a.e.a(list)).e();
            ax.W2.z.o(w7(), this.n1, list, this, new C(), new D());
        }
    }

    private void ma(List<AbstractC3595n> list) {
        if (list.size() < 1) {
            return;
        }
        L7(list.get(0), !r3.h());
    }

    private void o7(List<AbstractC3595n> list, boolean z) {
        if (!z || a8()) {
            F6(this.i1, System.currentTimeMillis());
            ax.Q2.a.i().m("menu_folder", z ? "cut" : "copy").c("loc", z3().I()).c("type", a.e.a(list)).e();
            C1011c.q().m(w7(), this.i1, list, z);
            J3();
            e4(true);
        }
    }

    private void o8(AbstractC1823k abstractC1823k) {
        w4(C1835x.e(abstractC1823k.R()), abstractC1823k, new C1906w());
    }

    private void oa() {
        if (this.g2 == null || f0() == null) {
            return;
        }
        this.g2.m(this.m2);
        this.g2 = null;
    }

    private void p7(List<AbstractC3595n> list) {
        if (f0() == null) {
            return;
        }
        if ((list == null) || list.isEmpty()) {
            return;
        }
        C3203u.c(f0(), C3203u.b(list, list.get(0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        r8 = r3.get(0).getTaskInfo().baseActivity;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pa() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.d3.E.pa():void");
    }

    private int q7() {
        if (v3() == null) {
            return -1;
        }
        return v3().h0().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q9() {
        this.X1.removeCallbacks(this.q2);
        this.X1.postDelayed(this.q2, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qa(AbstractC3595n abstractC3595n, long j) {
        if (this.j1 == null) {
            this.j1 = abstractC3595n;
            C2688e.b().j(abstractC3595n, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<AbstractC3595n> r7(List<AbstractC3595n> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC3595n abstractC3595n : list) {
            if (abstractC3595n.isDirectory()) {
                Stack stack = new Stack();
                stack.push(abstractC3595n);
                while (stack.size() > 0) {
                    try {
                        for (AbstractC3595n abstractC3595n2 : w7().f0((AbstractC3595n) stack.pop())) {
                            if (abstractC3595n2.isDirectory()) {
                                stack.push(abstractC3595n2);
                            } else {
                                arrayList.add(abstractC3595n2);
                            }
                        }
                    } catch (C1495j unused) {
                    }
                }
            } else {
                arrayList.add(abstractC3595n);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r9() {
        this.P1 = -1;
        this.Q1 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ra() {
        MenuItem menuItem;
        if (b() == null || (menuItem = this.z1) == null) {
            return;
        }
        if (this.Y1) {
            menuItem.setIcon(this.B1);
            this.z1.setTitle(M0(com.voxdon.xplorer.R.string.label_all_subfolders));
        } else {
            menuItem.setIcon(this.A1);
            this.z1.setTitle(M0(com.voxdon.xplorer.R.string.label_current_folder));
        }
        this.z1.setEnabled(this.Z1);
    }

    private void s8(AbstractC1823k abstractC1823k, String str, String str2, boolean z, boolean z2) {
        C8(ax.a3.Q.E3(abstractC1823k), str, str2, z, z2);
    }

    private void sa(List<AbstractC3595n> list) {
        list.get(0);
    }

    private void t8(AbstractC3595n abstractC3595n, int i, int i2) {
        String str = this.n1;
        if (str != null && !str.equals(abstractC3595n.E())) {
            S6();
        }
        this.i1 = abstractC3595n;
        this.n1 = abstractC3595n.E();
        this.o1 = false;
        b8(i, i2);
        e4(false);
        N4();
        V6();
    }

    private void t9(List<AbstractC3595n> list) {
        ax.Q2.a.i().m("menu_folder", "restore").c("loc", z3().I()).e();
        ax.W2.x l = ax.W2.x.l();
        l.k(w7(), list, new F());
        try {
            l(l, true);
        } catch (C1488c unused) {
            J4(com.voxdon.xplorer.R.string.error, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<AbstractC3595n> u7(boolean z) {
        return ax.x3.u.a(this.N0, this.c1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u9(String str) {
        com.voxdon.xplorer.widget.a aVar = this.d1;
        if (aVar != null) {
            aVar.k0(str);
        }
        com.voxdon.xplorer.widget.a aVar2 = this.e1;
        if (aVar2 != null) {
            aVar2.k0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v8(C3590i c3590i, String str, boolean z) {
        Intent f;
        if (!X0() || d1() || Z0()) {
            return;
        }
        D9(c3590i);
        int i = 0;
        if (ax.t3.j.C(o3()) && C1808A.B(c3590i, true) && str == null) {
            f = Z6(c3590i);
        } else {
            if (ax.t3.j.F(o3()) && C1808A.E(c3590i) && str == null && !ax.a3.Q.K3(o3(), c.a.GENERAL, c3590i, false)) {
                R8(c3590i);
            } else if (ax.t3.j.D(o3()) && C1808A.C(c3590i) && str == null && !ax.a3.Q.J3(o3(), c3590i, false)) {
                G8(c3590i);
            } else if (ax.t3.j.E(o3()) && ((C1808A.D(c3590i) && str == null) || ax.c3.V.TEXT.h().equals(str))) {
                f = C1834w.f(o3(), c3590i);
                z = false;
                i = 1002;
            } else if (C1808A.p(c3590i) && str == null) {
                k7(Collections.singletonList(c3590i));
            } else {
                if (!ax.X2.Q.H1() || !C1808A.K(c3590i) || str != null) {
                    String s = c3590i.s();
                    s8(c3590i, s, str != null ? str : s, z, true);
                    return;
                }
                o8(c3590i);
            }
            f = null;
        }
        if (f != null) {
            B8(f, i, z, c3590i.A());
        }
    }

    private void w8(C3590i c3590i) {
        if (!X0() || d1()) {
            return;
        }
        String s = c3590i.s();
        D9(c3590i);
        if (C1834w.a(o3(), c3590i, s, false)) {
            s8(c3590i, s, s, true, true);
        } else {
            ba(c3590i, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x8(com.voxdon.xplorer.file.AbstractC3595n r6) {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.voxdon.xplorer.file.n r2 = r5.i1
            r5.F6(r2, r0)
            r2 = 1
            long r0 = r0 + r2
            r5.F6(r6, r0)
            r5.V6()
            r0 = 0
            r5.C9(r6, r0)
            android.content.Context r0 = r5.o3()
            android.content.Intent r0 = ax.a3.Q.A3(r0, r6)
            boolean r1 = r6 instanceof ax.c3.C1812E
            r2 = 0
            if (r1 == 0) goto L32
            r1 = r6
            ax.c3.E r1 = (ax.c3.C1812E) r1
            boolean r3 = r1.j0()
            if (r3 == 0) goto L32
            r5.z8(r1)
            goto Lcf
        L32:
            if (r0 == 0) goto L6b
            boolean r1 = ax.c3.C1832u.S(r0)
            if (r1 == 0) goto L3f
            r5.A8(r6)
            goto Lcf
        L3f:
            boolean r1 = ax.c3.C1832u.T(r0)
            if (r1 == 0) goto L4a
            r5.G8(r6)
            goto Lcf
        L4a:
            boolean r1 = ax.c3.C1832u.U(r0)
            if (r1 == 0) goto L55
            r5.R8(r6)
            goto Lcf
        L55:
            boolean r1 = ax.c3.C1809B.H(r6)
            if (r1 == 0) goto L67
            r5.D9(r6)
            java.lang.String r1 = r6.A()
            r5.B8(r0, r2, r2, r1)
            goto Lcf
        L67:
            r5.g7(r6, r2, r0)
            goto Lcf
        L6b:
            android.content.Context r0 = r5.o3()
            boolean r0 = X7(r0, r6)
            if (r0 == 0) goto L96
            ax.c3.z r0 = r6.G()
            ax.c3.z r1 = ax.c3.EnumC1837z.ARCHIVE
            r3 = 2131952449(0x7f130341, float:1.9541341E38)
            r4 = 1
            if (r1 != r0) goto L85
            r5.E4(r3, r4)
            goto Lcf
        L85:
            java.lang.String r0 = r6.A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L92
            r5.E4(r3, r4)
        L92:
            r5.ba(r6, r4)
            goto Lcf
        L96:
            boolean r0 = ax.c3.C1809B.P(r6)
            r1 = 0
            if (r0 == 0) goto La1
            r5.E8(r6, r1, r2)
            goto Lcf
        La1:
            boolean r0 = ax.c3.C1809B.J(r6)
            if (r0 == 0) goto Lae
            r0 = r6
            com.voxdon.xplorer.file.i r0 = (com.voxdon.xplorer.file.C3590i) r0
            r5.v8(r0, r1, r2)
            goto Lcf
        Lae:
            boolean r0 = ax.c3.C1808A.B(r6, r2)
            if (r0 == 0) goto Lc2
            android.content.Context r0 = r5.o3()
            boolean r0 = ax.t3.j.C(r0)
            if (r0 == 0) goto Lc2
            r5.A8(r6)
            goto Lcf
        Lc2:
            boolean r0 = ax.c3.C1808A.G(r6)
            if (r0 == 0) goto Lcc
            r5.I8(r6, r2)
            goto Lcf
        Lcc:
            r5.g7(r6, r2, r1)
        Lcf:
            androidx.fragment.app.f r0 = r5.f0()
            if (r0 == 0) goto Le8
            com.voxdon.xplorer.activity.b r0 = r5.v3()
            ax.Q2.f r1 = r5.z3()
            int r3 = r5.x3()
            java.lang.String r6 = r6.E()
            r0.w0(r1, r3, r6, r2)
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.d3.E.x8(com.voxdon.xplorer.file.n):void");
    }

    private int y7() {
        if (z3().P()) {
            return ax.t3.e.d(o3(), z3(), x3(), this.n1, this.H1);
        }
        return 2;
    }

    private void y8(File file, String str, String str2, boolean z, boolean z2) {
        C8(C1832u.w(file), str, str2, z, z2);
    }

    private void y9(int i) {
        if (f0() == null) {
            return;
        }
        int z7 = z7();
        int y7 = y7();
        if (z7 == 2) {
            this.L0.setNumColumns((C3180B.e(b(), i) - (G0().getDimensionPixelSize(com.voxdon.xplorer.R.dimen.file_grid_padding) * 2)) / (y7 == 4 ? G0().getDimensionPixelSize(com.voxdon.xplorer.R.dimen.file_grid_column_width_large) : G0().getDimensionPixelSize(com.voxdon.xplorer.R.dimen.file_grid_column_width_medium)));
            return;
        }
        if (z7 == 12 || z7 == 16) {
            int i2 = G0().getConfiguration().orientation == 1 ? i <= 480 ? 3 : i <= 600 ? 4 : i / 150 : i <= 640 ? 5 : i <= 960 ? 6 : i / 145;
            if (y7 == 4) {
                i2--;
            }
            if (z7 == 12) {
                this.L0.setNumColumns(i2);
            } else if (z7 == 16) {
                this.L0.setNumColumns(i2 + 1);
            }
        }
    }

    private void z8(C1812E c1812e) {
        String f02 = c1812e.f0();
        if (f02 == null) {
            E4(com.voxdon.xplorer.R.string.error, 1);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(f02));
        intent.setFlags(268435456);
        B8(intent, 0, false, c1812e.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z9(ax.c3.K k, String str) {
        boolean c = ax.t3.e.c(o3(), k.d(), k.b(), str, false);
        com.voxdon.xplorer.widget.a aVar = this.d1;
        if (aVar != null) {
            aVar.j0(c);
        }
        com.voxdon.xplorer.widget.a aVar2 = this.e1;
        if (aVar2 != null) {
            aVar2.j0(c);
        }
    }

    protected AdapterView.OnItemClickListener A7() {
        return this.k2;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
    public void B() {
        w7().n0();
    }

    protected abstract String B7();

    void B9(boolean z) {
        if (X0()) {
            this.F0.post(new O(z));
        }
    }

    @Override // ax.d3.AbstractC1927n
    public String C3() {
        return this.n1;
    }

    protected boolean C7() {
        return true;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void D1() {
        if (this.L1) {
            this.M1 = true;
            this.L1 = false;
        }
        super.D1();
    }

    protected int D7() {
        if (!z3().P()) {
            return ax.t3.e.b(z3());
        }
        if (this.n1 == null && A3().e() != null) {
            ax.Ha.c.h().f().b("current path == null in getSavedListViewType").g("location:" + z3()).h();
        }
        return ax.t3.e.k(o3(), z3(), x3(), this.n1, this.H1);
    }

    protected AdapterView.OnItemClickListener E7() {
        return this.l2;
    }

    public void E9(ax.Q2.f fVar) {
        this.G1 = fVar;
        if (this.W0 != null) {
            F9();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(Menu menu) {
        MenuItem menuItem;
        super.F1(menu);
        if (f0() == null) {
            return;
        }
        Y8(menu);
        i7(menu, com.voxdon.xplorer.R.id.menu_search);
        i7(menu, com.voxdon.xplorer.R.id.menu_refresh);
        i7(menu, com.voxdon.xplorer.R.id.menu_view_settings);
        AbstractC2559a supportActionBar = ((ActivityC2561c) f0()).getSupportActionBar();
        MenuItem findItem = menu.findItem(com.voxdon.xplorer.R.id.menu_view_settings);
        if (findItem != null && supportActionBar != null) {
            findItem.setIcon(ax.u3.z.p(supportActionBar.m(), D7()));
        }
        G6(menu, false);
        if (this.d2 == null || (menuItem = this.y1) == null || this.X0 == null) {
            return;
        }
        menuItem.expandActionView();
        this.X0.setText(this.d2);
        this.X0.setSelection(this.d2.length());
        this.d2 = null;
    }

    protected String G7(String str) {
        return F7(o3(), z3(), x3(), str, this.H1);
    }

    protected boolean G8(AbstractC3595n abstractC3595n) {
        if (this.n1 == null || this.c1 == null) {
            ax.Q2.a.i().m("command", "file_open").c("loc", abstractC3595n.P().I()).c("ext", abstractC3595n.A()).c("result", "failure").e();
            return false;
        }
        if (ax.X2.Q.h0()) {
            MyFileProvider.y(b());
        }
        z3();
        ax.Q2.f fVar = ax.Q2.f.l0;
        boolean H8 = H8(abstractC3595n, C1809B.U(A3(), this.n1), this.c1.N(), 0);
        ax.Q2.a.i().m("command", "file_open").c("loc", z3().I()).c("ext", abstractC3595n.A()).c("result", "success").e();
        ax.Q2.a.i().m("music_player", "open_player").c("loc", z3().I()).c("ext", abstractC3595n.A()).e();
        ax.Q2.a.i().o("music_player_open").b("loc", z3().I()).b("ext", abstractC3595n.A()).c();
        return H8;
    }

    protected void G9(boolean z) {
        this.s1 = z;
        this.W0.setIsTwoDepth(z);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        if (this.M1 || P3()) {
            r2.fine("refresh on resume");
            Y6();
            N6(false);
            this.M1 = false;
        }
        if (this.N1) {
            ax.s3.u.j(o3()).a(120);
        }
    }

    public void H6() {
        if (this.H1) {
            if (this.G1 == null) {
                I9(false);
                c4(false);
                return;
            }
            return;
        }
        if (ax.Q2.f.U(z3())) {
            I9(true);
            c4(false);
            return;
        }
        ax.Ha.c.h().d("INVALID ANALYZE CURRENT PATH!!!!").g("location:" + z3().I()).h();
        C3184b.e("Invalid Analyze Location : " + z3().I());
    }

    protected AdapterView.OnItemClickListener H7() {
        return this.j2;
    }

    public boolean H8(AbstractC3595n abstractC3595n, String str, List<AbstractC3595n> list, int i) {
        if (f0() == null) {
            return false;
        }
        return ((com.voxdon.xplorer.activity.b) f0()).y0(abstractC3595n, str, list, false, i);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putString("path", this.n1);
        if (!this.J1 || this.j1 == null || C2688e.b().d(this.j1) == 0) {
            return;
        }
        bundle.putString("file_open_path", this.j1.E());
        bundle.putLong("file_open_last_modified", C2688e.b().d(this.j1));
    }

    public void I9(boolean z) {
        if (this.H1 && !z) {
            ax.T2.h.S(A3()).G0();
        }
        if (!this.H1 && z) {
            ax.T2.h.S(A3()).J0();
        }
        this.H1 = z;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        Y6();
        N6(false);
        this.M1 = false;
        i9();
        C3189g.a().d("local.intent.action.ACTION_MEDIA_CONTROLLER_CHANGED", this.f2);
    }

    protected boolean J7(int i, boolean z, boolean z2) {
        boolean z3 = z2 && this.N0.hasFocus() && this.N0.getSelectedItemPosition() != -1;
        if (!K3() && !z3) {
            if (this.Y0.k() == 0) {
                ax.Ha.c.h().d("HCM: NOTRECHABLE").h();
                W3(m3());
            }
            return false;
        }
        P6();
        if (i != com.voxdon.xplorer.R.id.cancel && !Z7(i) && C1011c.q().v()) {
            X2(false);
        }
        List<AbstractC3595n> u7 = u7(z3);
        if (!u7.isEmpty()) {
            return K7(i, u7, z);
        }
        if (z3) {
            ax.Ha.c.h().f().d("NOSEL KEY:").j().g("count:" + this.c1.getCount() + ",pos:" + this.N0.getSelectedItemPosition()).h();
        } else {
            ax.Ha.b j = ax.Ha.c.h().f().d("NOSEL:").j();
            StringBuilder sb = new StringBuilder();
            sb.append(K3());
            sb.append(":");
            sb.append(f0() == null);
            j.g(sb.toString()).h();
            E4(com.voxdon.xplorer.R.string.error, 1);
        }
        h3();
        return true;
    }

    public void J9(Context context, boolean z) {
        if (ax.Q2.f.U(z3())) {
            I9(z);
            if (z) {
                ax.t3.e.q(context, z3(), x3(), null, true, 1);
                ax.t3.e.p(context, z3(), x3(), null, true, "SizeDown");
            }
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void K1() {
        r2.fine("onStop");
        super.K1();
        oa();
        C3189g.a().h(this.f2);
        if (ax.Q2.f.n0(z3())) {
            this.g1.f();
        }
    }

    protected boolean K6() {
        return a8();
    }

    protected boolean K7(int i, List<AbstractC3595n> list, boolean z) {
        C3591j R0 = ax.Q2.f.A0(z3()) ? C3604x.R0(o3(), list) : null;
        switch (i) {
            case com.voxdon.xplorer.R.id.bottom_menu_cut /* 2131361930 */:
            case com.voxdon.xplorer.R.id.bottom_menu_delete /* 2131361931 */:
            case com.voxdon.xplorer.R.id.bottom_menu_permanently_delete /* 2131361939 */:
            case com.voxdon.xplorer.R.id.bottom_menu_recycle /* 2131361941 */:
            case com.voxdon.xplorer.R.id.bottom_menu_rename /* 2131361943 */:
            case com.voxdon.xplorer.R.id.bottom_menu_restore /* 2131361944 */:
                if (R0 != null) {
                    o9(3, R0.a, R0.b, false);
                    return true;
                }
                break;
        }
        switch (i) {
            case com.voxdon.xplorer.R.id.bottom_menu_copy /* 2131361928 */:
                o7(list, false);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_copy_to_clipboard /* 2131361929 */:
                p7(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_cut /* 2131361930 */:
                o7(list, true);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_delete /* 2131361931 */:
                b7(list, 0);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_permanently_delete /* 2131361939 */:
                b7(list, 1);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_properties /* 2131361940 */:
            case com.voxdon.xplorer.R.id.menu_properties /* 2131362528 */:
                B4(w7(), list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_recycle /* 2131361941 */:
                b7(list, 2);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_rename /* 2131361943 */:
                m9(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.bottom_menu_restore /* 2131361944 */:
                t9(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.cancel /* 2131361999 */:
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_bookmark /* 2131362504 */:
                E6(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_compress /* 2131362505 */:
                W6(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_extract /* 2131362512 */:
                k7(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_hide_unhide /* 2131362515 */:
                ma(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_open_as /* 2131362521 */:
                ba(list.get(0), true);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_open_parent /* 2131362523 */:
                J8(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_open_with /* 2131362524 */:
                S8(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_quick_share /* 2131362529 */:
                f9(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_ringtone /* 2131362534 */:
                sa(list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_select_all /* 2131362540 */:
                if (list.size() == this.c1.getCount()) {
                    ax.Q2.a.i().m("menu_folder", "deselect").c("loc", z3().I()).e();
                    h3();
                    return true;
                }
                ax.Q2.a.i().m("menu_folder", "select_all").c("loc", z3().I()).e();
                this.b1.d(this.N0);
                return true;
            case com.voxdon.xplorer.R.id.menu_select_range /* 2131362541 */:
                this.b1.e(this.N0);
                I3();
                return true;
            case com.voxdon.xplorer.R.id.menu_selection_settings /* 2131362542 */:
                ax.Q2.a.i().m("menu_folder", "selection_settings").e();
                ax.a3.T i3 = ax.a3.T.i3(this);
                ax.d3.J.c(this, "selection_settings_popup_request", new Consumer() { // from class: ax.d3.C
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void s(Object obj) {
                        E.S4(E.this, (Bundle) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                A(i3, "settings", true);
                return true;
            case com.voxdon.xplorer.R.id.menu_share /* 2131362545 */:
                t4(w7(), list);
                h3();
                return true;
            case com.voxdon.xplorer.R.id.menu_shortcut /* 2131362546 */:
                T2(list.get(0), this.g1);
                h3();
                return true;
            default:
                return false;
        }
    }

    protected boolean K8() {
        return true;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    @SuppressLint({"InlinedApi"})
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(com.voxdon.xplorer.R.id.listview_swipe_refresh_layout);
        this.D0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnChildScrollUpCallback(new C3421g());
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) view.findViewById(com.voxdon.xplorer.R.id.gridview_swipe_refresh_layout);
        this.E0 = swipeRefreshLayout2;
        swipeRefreshLayout2.setOnChildScrollUpCallback(new C3421g());
        this.C0 = (SwipeRefreshLayout) view.findViewById(com.voxdon.xplorer.R.id.message_swipe_refresh_layout);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(com.voxdon.xplorer.R.id.history_list);
        this.G0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(b(), 1, false));
        this.H0 = view.findViewById(com.voxdon.xplorer.R.id.history_layout);
        this.K0 = (ListView) view.findViewById(com.voxdon.xplorer.R.id.list);
        this.L0 = (GridView) view.findViewById(com.voxdon.xplorer.R.id.grid);
        this.Q0 = view.findViewById(com.voxdon.xplorer.R.id.message);
        this.R0 = (TextView) view.findViewById(com.voxdon.xplorer.R.id.main_message);
        this.S0 = (TextView) view.findViewById(com.voxdon.xplorer.R.id.sub_message);
        this.T0 = (TextView) view.findViewById(com.voxdon.xplorer.R.id.clickable_message);
        this.U0 = (CoordinatorLayout) view.findViewById(com.voxdon.xplorer.R.id.snackbar_container);
        this.V0 = view.findViewById(com.voxdon.xplorer.R.id.bottom_popup_menu_anchor);
        this.W0 = (PathBar) view.findViewById(com.voxdon.xplorer.R.id.pathbar);
        F9();
        this.W0.setLocationUnit(A3());
        this.W0.setRootInfo(B7());
        this.W0.setPathBarListener(new C1905v());
        this.Y0 = new C3418d(v3(), view.findViewById(com.voxdon.xplorer.R.id.bottom_menu_layout), view.findViewById(com.voxdon.xplorer.R.id.bottom_menu_safe_area));
        L9();
        this.H0.setOnClickListener(new G());
        this.K0.setChoiceMode(3);
        this.L0.setChoiceMode(3);
        ArrayList arrayList = new ArrayList();
        if (!ax.Q2.p.a(o3())) {
            ListView listView = this.K0;
            listView.setOnScrollListener(new m0(listView));
            GridView gridView = this.L0;
            gridView.setOnScrollListener(new m0(gridView));
        }
        R r = new R();
        this.K0.setOnKeyListener(r);
        this.L0.setOnKeyListener(r);
        c0 c0Var = new c0();
        if (this.d1 == null) {
            this.d1 = new com.voxdon.xplorer.widget.a(f0(), arrayList, w7(), this.g1, 0, c0Var, fa(), true);
        }
        this.K0.setAdapter((ListAdapter) this.d1);
        if (this.e1 == null) {
            this.e1 = new com.voxdon.xplorer.widget.a(f0(), arrayList, w7(), this.g1, 2, c0Var, false, false);
        }
        this.L0.setAdapter((ListAdapter) this.e1);
        this.D0.setOnRefreshListener(new g0());
        this.E0.setOnRefreshListener(new h0());
        this.C0.setOnRefreshListener(new i0());
        s9();
        la(z7());
        this.c1.m0(y7());
        this.c1.A0();
        x2(true);
        ax.t3.i iVar = new ax.t3.i(b(), "file");
        this.I0 = iVar;
        iVar.i(new j0(400L));
        if (bundle == null || bundle.isEmpty()) {
            return;
        }
        this.n1 = bundle.getString("path");
        this.o1 = false;
        this.l1 = bundle.getString("file_open_path");
        this.m1 = bundle.getLong("file_open_last_modified");
    }

    protected void L9() {
        C1889f c1889f = new C1889f();
        this.C1 = c1889f;
        View d = this.Y0.d(com.voxdon.xplorer.R.id.bottom_menu_copy, com.voxdon.xplorer.R.string.menu_copy, com.voxdon.xplorer.R.drawable.ic_content_copy, c1889f);
        d.setOnLongClickListener(new ViewOnLongClickListenerC1890g());
        this.Y0.d(com.voxdon.xplorer.R.id.bottom_menu_cut, com.voxdon.xplorer.R.string.menu_move, com.voxdon.xplorer.R.drawable.ic_file_move, this.C1);
        this.Y0.d(com.voxdon.xplorer.R.id.bottom_menu_rename, com.voxdon.xplorer.R.string.menu_rename, com.voxdon.xplorer.R.drawable.ic_rename, this.C1);
        View d2 = this.Y0.d(com.voxdon.xplorer.R.id.bottom_menu_delete, com.voxdon.xplorer.R.string.menu_delete, com.voxdon.xplorer.R.drawable.ic_delete, this.C1);
        this.Y0.e();
        d2.setOnLongClickListener(new ViewOnLongClickListenerC1891h());
        this.Y0.n(new C1892i());
        C3036c c3036c = new C3036c(b(), com.voxdon.xplorer.R.style.Bottom_Widget_PopupTheme);
        ax.u.w wVar = new ax.u.w(c3036c, d2);
        this.Z0 = wVar;
        wVar.d(com.voxdon.xplorer.R.menu.delete_popup);
        this.Z0.f(new C1893j());
        Menu b = this.Z0.b();
        if (b instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e) b).b0(true);
        }
        ax.u.w wVar2 = new ax.u.w(c3036c, d);
        this.a1 = wVar2;
        wVar2.d(com.voxdon.xplorer.R.menu.copy_popup);
        this.a1.f(new C1895l());
        Menu b2 = this.a1.b();
        if (b2 instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e) b2).b0(true);
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void M4() {
        if (this.i1 != null) {
            if (C3604x.E1(f0(), this.i1, true)) {
                p9(3, this.i1);
                return;
            }
            C1011c.q().o(w7(), this.i1, new U());
            try {
                l(C1011c.q(), true);
            } catch (C1488c unused) {
                J4(com.voxdon.xplorer.R.string.error, 1);
            }
            J3();
            e4(true);
            return;
        }
        if (this.o1) {
            if (C1011c.q().t()) {
                E4(com.voxdon.xplorer.R.string.msg_move_failed, 0);
            } else {
                E4(com.voxdon.xplorer.R.string.msg_copy_failed, 0);
            }
        }
        ax.Ha.c.h().c("Paste to CURRENT PATH INFO == NULL").g("loaded:" + this.o1).h();
    }

    @Override // ax.d3.AbstractC1927n
    public boolean N3() {
        return v7() != null && a8() && C1011c.q().k(v7());
    }

    public void N8() {
        if (this.n1 == null) {
            ax.Ha.c.h().b("Open settings with no path").g("location:" + z3()).j().h();
        }
        A(C1348d.i3(this, this.n1, V9()), "settings", true);
        ax.d3.J.c(this, "view_settings_request", new Consumer() { // from class: ax.d3.D
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void s(Object obj) {
                E.Q4(E.this, (Bundle) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    protected boolean O6(List<AbstractC3595n> list) {
        for (AbstractC3595n abstractC3595n : list) {
            if (C1809B.P(abstractC3595n) && (abstractC3595n.P() == ax.Q2.f.o0 || abstractC3595n.P() == ax.Q2.f.p0 || ax.Q2.f.g0(abstractC3595n.P()))) {
                String C0 = ((C3605y) abstractC3595n).C0();
                if ("/DCIM".equals(C0) || "/DCIM/Camera".equals(C0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void O7(Menu menu) {
        MenuItem findItem = menu.findItem(com.voxdon.xplorer.R.id.menu_search);
        this.y1 = findItem;
        if (findItem == null) {
            return;
        }
        if (this.J0) {
            C3184b.e("init search is called when searching");
            A9(false);
        }
        EditText editText = (EditText) C1751A.a(this.y1).findViewById(com.voxdon.xplorer.R.id.edit);
        this.X0 = editText;
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1897n());
        this.X0.setFocusable(true);
        C1751A.h(this.y1, new C1898o(menu));
        this.X0.setOnEditorActionListener(new C1899p());
        MenuItem findItem2 = menu.findItem(com.voxdon.xplorer.R.id.menu_search_folder_option);
        this.z1 = findItem2;
        if (findItem2 == null || b() == null) {
            return;
        }
        Context context = v3().e0().e().getContext();
        this.B1 = C2653a.b(context, com.voxdon.xplorer.R.drawable.ic_ab_include_subfolder);
        this.A1 = C2653a.b(context, com.voxdon.xplorer.R.drawable.ic_ab_current_folder);
        this.z1.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1900q());
    }

    public void O8() {
        MainActivity mainActivity = (MainActivity) f0();
        mainActivity.d2(A3(), true, Bookmark.n(mainActivity, ax.T2.h.B(A3())), "pathbar_analysis");
    }

    public void O9() {
        try {
            this.a1.g();
        } catch (WindowManager.BadTokenException unused) {
            ax.Ha.c.h().d("BADTOKEN 3").g("activestate:" + L3()).h();
        }
    }

    protected void P8(Uri uri) {
        if (f0() == null) {
            return;
        }
        if (!(f0() instanceof MainActivity)) {
            C3184b.f();
        } else {
            ((MainActivity) f0()).c2(Bookmark.c(o3(), uri), null, null, null, new L());
        }
    }

    protected void P9(ax.W2.m mVar, boolean z) {
        ax.Q2.a.i().m("menu_folder", z ? "new_folder" : "new_file").c("loc", z3().I()).e();
        A(C1360p.l3(z, new C1902s(mVar)), "createFileName", true);
    }

    public void Q9() {
        try {
            this.Z0.g();
        } catch (WindowManager.BadTokenException unused) {
            ax.Ha.c.h().d("BADTOKEN 2").g("activestate:" + L3()).h();
        }
    }

    public boolean R7() {
        return true;
    }

    protected boolean R9() {
        return false;
    }

    void S6() {
        this.e2 = null;
    }

    boolean S7() {
        if (this.h1 == null) {
            return false;
        }
        return w7().a();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
    public void T(boolean z, Object obj) {
        if (z) {
            v9(k0.CONNECTED);
        } else {
            B9(false);
            v9(k0.NOT_CONNECTED);
        }
        m8(z, obj);
        w7().k0(false);
        if (z) {
            this.E1 = false;
        }
    }

    boolean T7() {
        return S7() || this.K1 == k0.CONNECTED;
    }

    protected void T9(int i, int i2) {
        ka(true);
        this.R0.setText(i);
        if (i2 != 0) {
            this.S0.setText(i2);
        }
    }

    public void U6() {
        this.o1 = false;
        ax.V2.c cVar = this.f1;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void U8(String str) {
        this.c2 = str;
    }

    @Override // ax.g3.f
    public String V() {
        return z3().I() + x3();
    }

    @Override // ax.d3.AbstractC1927n
    public boolean V2() {
        if (K3()) {
            h3();
            return true;
        }
        EditText editText = this.X0;
        if (editText == null || !editText.isShown()) {
            return M7();
        }
        this.y1.collapseActionView();
        return true;
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean V3() {
        C3418d c3418d = this.Y0;
        if (c3418d == null || !c3418d.m()) {
            return super.V3();
        }
        return true;
    }

    public void V8(AbstractC3595n abstractC3595n) {
        this.b2 = abstractC3595n.B();
    }

    public boolean V9() {
        return this.H1;
    }

    @Override // ax.a3.Q.f
    public void W(int i, Intent intent) {
        ax.Z2.k z;
        if (intent != null) {
            int i2 = 0;
            if (intent.hasExtra("custom_internal")) {
                if (intent.getIntExtra("custom_internal", 0) == 1) {
                    ba(this.j1, intent.getBooleanExtra("show_chooser", false));
                    return;
                } else {
                    C3184b.f();
                    return;
                }
            }
            if (this.j1 != null && C1832u.S(intent)) {
                C1834w.b(intent.getData(), this.j1);
                A8(this.j1);
                return;
            }
            if (!C1832u.T(intent)) {
                if (this.j1 == null || !C1832u.U(intent)) {
                    B8(intent, i, false, null);
                    return;
                } else {
                    C1834w.b(intent.getData(), this.j1);
                    R8(this.j1);
                    return;
                }
            }
            if (intent.getData() != null && "http".equals(intent.getData().getScheme()) && (z = C2686c.z(intent.getData().getPath())) != null && z.e() != null) {
                ArrayList<AbstractC3595n> N2 = this.c1.N();
                int size = N2.size();
                while (i2 < size) {
                    AbstractC3595n abstractC3595n = N2.get(i2);
                    i2++;
                    AbstractC3595n abstractC3595n2 = abstractC3595n;
                    if (z.e().equals(abstractC3595n2.E())) {
                        G8(abstractC3595n2);
                        return;
                    }
                }
            }
            if (this.j1 != null) {
                C1834w.b(intent.getData(), this.j1);
                G8(this.j1);
            }
        }
    }

    @Override // ax.d3.AbstractC1927n
    protected void W3(AbstractC1927n.o oVar) {
        super.W3(oVar);
        if (f0() == null) {
            return;
        }
        this.W0.setBackgroundResource(com.voxdon.xplorer.R.drawable.bg_path_bar);
        this.W0.s(true);
        d7();
        g9();
        if (X0()) {
            h7(true);
        }
        this.c1.g0(false);
    }

    public void W8() {
        this.M1 = true;
    }

    protected void W9(boolean z) {
        ViewStub viewStub;
        if (this.M0 == null && (viewStub = (ViewStub) R0().findViewById(com.voxdon.xplorer.R.id.full_progress)) != null) {
            this.M0 = viewStub.inflate();
        }
        View view = this.M0;
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    @Override // ax.d3.AbstractC1927n
    protected void X3(AbstractC1927n.o oVar) {
        super.X3(oVar);
        if (f0() == null) {
            return;
        }
        this.b1.c();
        h7(false);
        this.W0.setBackgroundColor(ax.Q.b.c(f0(), com.voxdon.xplorer.R.color.selection_background));
        this.W0.s(false);
        this.c1.g0(true);
    }

    protected void X6() {
        if (S7()) {
            v9(k0.CONNECTED);
            return;
        }
        k0 k0Var = this.K1;
        k0 k0Var2 = k0.CONNECTING;
        if (k0Var == k0Var2 && (ax.Q2.f.X(z3()) || ax.Q2.f.p0(z3()))) {
            return;
        }
        if (this.K1 == k0.CONNECTED) {
            this.E1 = true;
        }
        v9(k0Var2);
        B9(true);
        w7().K(f0(), this, this);
    }

    @Override // ax.d3.AbstractC1927n
    public boolean Y3(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (i != 29) {
                if (i != 31) {
                    if (i != 42) {
                        if (i != 50) {
                            if (i != 52) {
                                if (i == 132) {
                                    if (this.N0 != null && !V7()) {
                                        J7(com.voxdon.xplorer.R.id.bottom_menu_rename, false, true);
                                    }
                                    return true;
                                }
                                if (i != 111) {
                                    if (i == 112) {
                                        if (keyEvent.isShiftPressed()) {
                                            J7(com.voxdon.xplorer.R.id.bottom_menu_permanently_delete, false, true);
                                        } else {
                                            J7(com.voxdon.xplorer.R.id.bottom_menu_delete, false, true);
                                        }
                                        return true;
                                    }
                                } else if (keyEvent.hasNoModifiers() && K3()) {
                                    h3();
                                    return true;
                                }
                            } else if (keyEvent.isCtrlPressed()) {
                                J7(com.voxdon.xplorer.R.id.bottom_menu_cut, false, true);
                                return true;
                            }
                        } else if (keyEvent.isCtrlPressed()) {
                            a4();
                            return true;
                        }
                    }
                    if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                        a7(true);
                        return true;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    J7(com.voxdon.xplorer.R.id.bottom_menu_copy, false, true);
                    return true;
                }
            } else if (keyEvent.isCtrlPressed()) {
                AbsListView absListView = this.N0;
                if (absListView != null) {
                    this.b1.d(absListView);
                }
                return true;
            }
            int unicodeChar = keyEvent.getUnicodeChar();
            if (unicodeChar >= 32) {
                return a9(unicodeChar);
            }
        }
        return false;
    }

    public boolean Y7() {
        return true;
    }

    void Y8(Menu menu) {
        i7(menu, com.voxdon.xplorer.R.id.menu_new);
        MenuItem findItem = menu.findItem(com.voxdon.xplorer.R.id.menu_new);
        if (findItem == null || K6()) {
            return;
        }
        findItem.setEnabled(false);
    }

    protected boolean Y9(String str) {
        return ax.t3.e.h(o3(), z3(), x3(), str, this.H1);
    }

    @Override // ax.d3.AbstractC1927n
    public void Z3(String str) {
        String str2;
        if (this.n1 == null) {
            N7();
        }
        if (str == null || (str2 = this.n1) == null) {
            return;
        }
        this.c2 = null;
        this.d2 = null;
        if (str2.equals(str)) {
            if (X0() && S7()) {
                j9();
            }
            if (f0() != null) {
                v3().w0(z3(), x3(), str, true);
                return;
            }
            return;
        }
        if (X0() && !S7() && !ax.Q2.f.D0(z3()) && this.f1.b(str) != null) {
            ax.Ha.c.h().b("!! ADDED BUT NOT CONNECT OPEN !!").j().g("location: " + z3() + "," + e1() + "," + S3()).h();
        }
        if (!X0() || !S3()) {
            this.p1 = str;
            this.D1 = true;
            return;
        }
        if (!S7()) {
            L6();
            this.p1 = str;
            this.D1 = true;
            X6();
            return;
        }
        AbstractC3595n b = this.f1.b(str);
        if (b != null) {
            D8(b);
        } else {
            L6();
            j7(str);
        }
    }

    void Z8(boolean z, Object obj) {
        String str;
        if (z) {
            h9();
            str = "success";
        } else {
            K4(N0(com.voxdon.xplorer.R.string.msg_connection_failed, A3().f(o3())), 1);
            i3("on_connect_result");
            str = "failure";
        }
        ax.Q2.a.i().m("network", "connect_cloud").c("loc", z3().I()).c("result", str).e();
    }

    protected void a7(boolean z) {
        if (a8()) {
            if (this.i1 != null && C3604x.E1(o3(), this.i1, false)) {
                p9(3, this.i1);
                return;
            }
            ax.W2.m n = ax.W2.m.n();
            n.k(w7(), this.n1, z, new C1901r());
            P9(n, z);
        }
    }

    public boolean a8() {
        if (w7() != null) {
            return w7().e0(v7());
        }
        C3184b.f();
        return false;
    }

    protected void aa() {
        if (b() != null) {
            String M0 = M0(com.voxdon.xplorer.R.string.msg_delete_failed);
            String M02 = M0(com.voxdon.xplorer.R.string.error_access_denied);
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("/DCIM/Camera");
            y4(h.b.FAILURE, M0, M02, arrayList);
        }
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean b4(int i) {
        switch (i) {
            case com.voxdon.xplorer.R.id.menu_analyze /* 2131362502 */:
                ax.Q2.a.i().m("menu_folder", "analyze_path").c("loc", z3().I()).e();
                H6();
                return true;
            case com.voxdon.xplorer.R.id.menu_new_file /* 2131362518 */:
            case com.voxdon.xplorer.R.id.menu_new_folder /* 2131362519 */:
                a7(i == com.voxdon.xplorer.R.id.menu_new_folder);
                return true;
            case com.voxdon.xplorer.R.id.menu_view_settings /* 2131362551 */:
                ax.Q2.a.i().m("menu_folder", "view_settings").c("loc", z3().I()).e();
                N8();
                return true;
            default:
                return false;
        }
    }

    public void b8(int i, int i2) {
        c8(i, i2, true);
        if (f0() != null) {
            v3().w0(z3(), x3(), this.n1, true);
        }
    }

    void b9() {
        String str;
        if (ax.W2.w.c().f()) {
            ax.c3.K d = ax.W2.w.c().d();
            String e2 = ax.W2.w.c().e();
            if (d == A3() && (str = this.n1) != null && str.equals(e2)) {
                w9();
            }
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
        if (z) {
            w7().g();
            S6();
        }
        l9();
        k9(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c7(List<AbstractC3595n> list, int i) {
        boolean l = ax.Q2.f.l(z3());
        if (O6(list)) {
            aa();
        } else {
            ax.W2.o.m(w7(), list, i, l, this, true, new C0276E(), null);
        }
    }

    public void c8(int i, int i2, boolean z) {
        if (!X0() || d1()) {
            return;
        }
        try {
            if (!T7()) {
                SwipeRefreshLayout swipeRefreshLayout = this.F0;
                String str = swipeRefreshLayout != null ? swipeRefreshLayout.m() ? "true" : "false" : "null";
                ax.Ha.c.h().f().b("!! NOT CONNECT SCANTASK!!!!").j().g(z3().I() + ",refreshing:" + str + ",connectionstatus:" + this.K1).h();
                return;
            }
        } catch (Exception unused) {
        }
        M6();
        int z7 = z7();
        if (z7 != this.O0) {
            la(z7);
        }
        int y7 = y7();
        if (this.c1.S() != y7) {
            this.c1.m0(y7);
            y9(v3().i0().x);
        }
        this.c1.A0();
        b9();
        this.W0.h(this.n1);
        r0 r0Var = new r0(i, i2, z);
        this.u1 = r0Var;
        r0Var.i(new Void[0]);
    }

    void c9(boolean z, Object obj, String str) {
        String str2;
        boolean z2 = false;
        if (z) {
            String str3 = (obj == null || !(obj instanceof String)) ? null : (String) obj;
            if (str3 == null || this.D1 || this.E1) {
                h9();
            } else {
                u8(str3, 0, 0);
            }
            str2 = "success";
        } else {
            if (!Z0()) {
                String N0 = N0(com.voxdon.xplorer.R.string.msg_connection_failed, str);
                if (ax.t3.j.o(o3())) {
                    if (obj instanceof String) {
                        N0 = N0 + " : " + obj;
                    } else if (obj instanceof Exception) {
                        Exception exc = (Exception) obj;
                        if (exc.getMessage() != null) {
                            N0 = N0 + " : " + exc.getMessage();
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                    I4(N0, 1);
                } else {
                    K4(N0, 1);
                }
            }
            i3("on_connect_result");
            str2 = "failure";
        }
        ax.Q2.a.i().m("network", "connect_remote").c("loc", z3().I()).c("result", str2).e();
    }

    protected boolean ca() {
        return false;
    }

    protected void d7() {
        this.Y0.f();
        this.Z0.a();
        this.a1.a();
    }

    protected boolean da(C3596o c3596o, AbstractC3595n abstractC3595n) {
        ax.Q2.f S2 = c3596o.S();
        return (S2 == ax.Q2.f.o0 || S2 == ax.Q2.f.p0) ? "/DCIM/Camera".equals(abstractC3595n.W()) : !c3596o.c0(abstractC3595n) && c3596o.u0(abstractC3595n);
    }

    protected boolean e7() {
        return true;
    }

    public void e9(String str, String str2, ax.Z2.p pVar, String str3, int i, int i2) {
        this.f1.g(this.n1, this.i1, str, str2, pVar, str3, i, i2);
    }

    @Override // ax.a3.Q.f
    public void f() {
        if (f0() == null) {
            return;
        }
        E4(com.voxdon.xplorer.R.string.no_application, 1);
    }

    boolean f8(List<AbstractC3595n> list) {
        if (!ax.Q2.f.F0(z3())) {
            return false;
        }
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isDirectory()) {
                return true;
            }
        }
        return false;
    }

    protected boolean fa() {
        return ax.t3.k.I() || this.H1;
    }

    @Override // ax.d3.AbstractC1927n
    public void h3() {
        r9();
        super.h3();
        if (this.Y0.k() != 8) {
            ax.Ha.c.h().f().c("BOTTOM MENU VISIBILITY NOT GONE!!!!").h();
            this.Y0.y(8);
        }
    }

    protected void h8(h.b bVar) {
        j9();
    }

    protected void h9() {
        if (this.D1) {
            j7(this.p1);
            this.D1 = false;
        } else if (this.o1) {
            j9();
        } else {
            b8(0, 0);
        }
        e4(false);
        this.E1 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(int i, int i2, Intent intent) {
        super.i1(i, i2, intent);
        if (i == 1002) {
            N6(true);
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void i4() {
        super.i4();
        if (this.K0 == null || this.L0 == null) {
            return;
        }
        s9();
    }

    void i7(Menu menu, int i) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            if (this.i1 == null || !T7()) {
                findItem.setEnabled(false);
            } else {
                findItem.setEnabled(true);
            }
        }
    }

    protected void i8(boolean z) {
        if (v3() != null) {
            v3().t0(z3(), x3(), this.n1, z);
        }
    }

    protected void ia(Menu menu) {
        menu.findItem(com.voxdon.xplorer.R.id.menu_search).setShowAsActionFlags(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.G1 = (ax.Q2.f) j0().getSerializable("parent_location");
        if (this.h1 != null) {
            ax.Ha.c.h().d("ATTACHED AGAIN!!!!!").g(HttpUrl.FRAGMENT_ENCODE_SET).h();
        }
        C3596o e2 = C1835x.e(A3());
        this.h1 = e2;
        e2.n0();
        if (this.h1.i0()) {
            com.voxdon.xplorer.service.b.f(o3()).e(this.h1);
        }
        N7();
        if (this.g1 == null) {
            this.g1 = new C2947d(o3(), w7());
        }
        C3189g.a().d("check_file_update", this.p2);
        C3189g.a().d("local.intent.action.SHOW_CODEC_DOWNLOAD", this.o2);
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
        AbsListView absListView = this.N0;
        if (absListView != null) {
            absListView.requestFocus();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void j4() {
        if (f0() == null) {
            return;
        }
        k4(this.h1, u7(false));
    }

    protected void j8(boolean z) {
        if (z) {
            i9();
        } else {
            oa();
        }
    }

    public void j9() {
        com.voxdon.xplorer.widget.a aVar = this.c1;
        if (aVar == null || aVar.getCount() <= 0 || !this.o1) {
            k9(true);
        } else {
            k9(false);
        }
    }

    protected void k8(List<AbstractC3595n> list) {
        if (a8()) {
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_cut, true);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_rename, true);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_delete, true);
        } else {
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_cut, false);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_rename, false);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_delete, false);
        }
        this.Y0.l(com.voxdon.xplorer.R.menu.more_multi);
        boolean B2 = C1809B.B(list);
        if (B2) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_share, false);
        }
        if (B2 && f0() != null && QuickShareProvider.a(f0()) && ax.Q2.f.l0(z3())) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_quick_share, true);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_quick_share, false);
        }
        if (!ax.Q2.f.l0(z3())) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_compress, false);
        } else if (C1808A.t(list)) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_compress, false);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_compress, true);
        }
        if (!ax.Q2.f.l0(z3())) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_extract, false);
        } else if (C1808A.A(list)) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_extract, true);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_extract, false);
        }
    }

    public void k9(boolean z) {
        if (z) {
            c8(0, 0, true);
        } else {
            c8(-1, -1, false);
        }
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.InterfaceC1931s
    public void l(ax.W2.h hVar, boolean z) throws C1488c {
        super.l(hVar, z);
        F6(this.i1, System.currentTimeMillis());
    }

    protected void l7(t.a aVar, String str, ParcelFileDescriptor parcelFileDescriptor, AbstractC3595n abstractC3595n, AbstractC1823k abstractC1823k, String str2, C3596o c3596o, List<AbstractC3595n> list) {
        if (X9(c3596o.T())) {
            return;
        }
        ax.W2.t n = ax.W2.t.n();
        n.l(aVar, str, parcelFileDescriptor, abstractC3595n, abstractC1823k, c3596o, str2, list, new I());
        try {
            l(n, true);
        } catch (C1488c unused) {
            J4(com.voxdon.xplorer.R.string.error, 1);
        }
    }

    protected void l8(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return;
        }
        if (a8()) {
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_cut, true);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_rename, true);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_delete, true);
        } else {
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_cut, false);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_rename, false);
            this.Y0.o(com.voxdon.xplorer.R.id.bottom_menu_delete, false);
        }
        this.Y0.l(com.voxdon.xplorer.R.menu.more_single);
        if (!ax.Q2.f.l0(z3())) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_compress, false);
        } else if (C1808A.s(abstractC3595n)) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_compress, false);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_compress, true);
        }
        if (f0() == null || !QuickShareProvider.a(f0()) || !ax.Q2.f.l0(z3())) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_quick_share, false);
        } else if (abstractC3595n.isDirectory()) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_quick_share, true);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_quick_share, false);
        }
        if (!ax.Q2.f.l0(z3())) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_extract, false);
        } else if (C1808A.z(abstractC3595n)) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_extract, true);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_extract, false);
        }
        if (ax.t3.j.y(o3()) && abstractC3595n.isDirectory() && ax.Q2.f.j(abstractC3595n.P()) && C1809B.P(abstractC3595n)) {
            if (abstractC3595n.h()) {
                C3605y.b H0 = ((C3605y) abstractC3595n).H0();
                if (H0 == C3605y.b.HIDDEN_DOTHIDDEN || H0 == C3605y.b.HIDDEN_LIBRARY) {
                    this.Y0.r(com.voxdon.xplorer.R.id.menu_hide_unhide, com.voxdon.xplorer.R.string.menu_unhide);
                    this.Y0.t(com.voxdon.xplorer.R.id.menu_hide_unhide, true);
                    this.Y0.p(com.voxdon.xplorer.R.id.menu_hide_unhide, com.voxdon.xplorer.R.drawable.ic_ab_unhide);
                }
            } else {
                this.Y0.r(com.voxdon.xplorer.R.id.menu_hide_unhide, com.voxdon.xplorer.R.string.menu_hide);
                this.Y0.t(com.voxdon.xplorer.R.id.menu_hide_unhide, true);
                this.Y0.p(com.voxdon.xplorer.R.id.menu_hide_unhide, com.voxdon.xplorer.R.drawable.ic_ab_hide);
            }
        }
        this.Y0.t(com.voxdon.xplorer.R.id.menu_share, !abstractC3595n.isDirectory());
        this.Y0.t(com.voxdon.xplorer.R.id.menu_open_with, !abstractC3595n.isDirectory());
        this.Y0.t(com.voxdon.xplorer.R.id.menu_bookmark, false);
        if (ax.t3.j.x(o3()) && R7()) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_shortcut, true);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_shortcut, false);
        }
        if (ax.t3.j.z(o3())) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_open_as, !abstractC3595n.isDirectory());
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_open_as, false);
        }
        if (z3() == ax.Q2.f.F0) {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_open_parent, true);
        } else {
            this.Y0.t(com.voxdon.xplorer.R.id.menu_open_parent, false);
        }
    }

    protected void m7(List<AbstractC3595n> list, C3596o c3596o, C1367x.b bVar, String str) {
        if (X9(c3596o.T())) {
            return;
        }
        ax.W2.t n = ax.W2.t.n();
        n.m(list, c3596o, bVar, str, new H());
        try {
            l(n, true);
        } catch (C1488c unused) {
            J4(com.voxdon.xplorer.R.string.error, 1);
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle != null) {
            r2.severe("Fragment onCreate SavedInstance : tag=" + O0() + ",hidden=" + Z0());
            if (e7() && Z0()) {
                try {
                    f0().getSupportFragmentManager().o().q(this).j();
                } catch (Exception e2) {
                    ax.Ha.c.h().b("remove saved instance error").l(e2).h();
                }
            }
        }
    }

    public void n7(C1367x.b bVar) {
        AbstractC1823k abstractC1823k;
        if (f0() == null) {
            return;
        }
        List<AbstractC3595n> list = this.q1;
        if (list == null) {
            ax.Ha.c.h().d("EXTRACTTO!!!:NULL").g("type:" + bVar.name()).h();
            return;
        }
        String str = this.r1;
        this.q1 = null;
        this.r1 = null;
        if (list.size() != 1) {
            int i = f0.a[bVar.ordinal()];
            if (i == 1 || i == 2) {
                m7(list, w7(), bVar, str);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                r8(A3(), new C1908y(list, bVar));
                return;
            }
        }
        AbstractC3595n abstractC3595n = list.get(0);
        t.a k = ax.W2.t.k(abstractC3595n.B());
        if (C1809B.H(abstractC3595n)) {
            abstractC1823k = (AbstractC1823k) abstractC3595n;
        } else {
            if (!abstractC3595n.N().exists()) {
                ax.Ha.c.h().f().b("INVALID EXTRACT SOURCE FILE INFO").g("loc:" + z3().I() + ",info:" + abstractC3595n.P().I()).h();
                E4(com.voxdon.xplorer.R.string.error, 1);
                C3184b.f();
                return;
            }
            File N2 = abstractC3595n.N();
            try {
                abstractC1823k = (C3605y) C1835x.f(N2).z(N2.getAbsolutePath());
            } catch (C1495j unused) {
                E4(com.voxdon.xplorer.R.string.error, 1);
                return;
            }
        }
        int i2 = f0.a[bVar.ordinal()];
        if (i2 == 1) {
            l7(k, abstractC3595n.B(), null, abstractC3595n, abstractC1823k, abstractC3595n.T(), w7(), null);
        } else if (i2 == 2) {
            l7(k, abstractC3595n.B(), null, abstractC3595n, abstractC1823k, ax.c3.d0.e(abstractC3595n.T(), abstractC3595n.B()), w7(), null);
        } else {
            if (i2 != 3) {
                return;
            }
            q8(A3(), k, abstractC3595n.B(), null, abstractC3595n, abstractC1823k, null);
        }
    }

    public void n8() {
        if (ax.Q2.f.m0(z3())) {
            if (this.n1 == null) {
                ax.Ha.c.h().b("no current path onSettingsChanged").g("location:" + z3()).h();
            }
            if (!ax.t3.e.j(o3(), z3(), x3(), this.n1, this.H1).equals(this.P0)) {
                this.g1.D(z3().t());
                AbstractC3595n abstractC3595n = this.i1;
                if (abstractC3595n != null && ax.c3.d0.E(abstractC3595n)) {
                    T6();
                }
            }
        }
        h9();
        if (f0() != null) {
            J3();
        }
    }

    protected void n9(ax.c3.K k, boolean z) {
        o9(0, k, null, z);
    }

    public void na(String str) {
        if (this.n1 == null || ax.c3.d0.D(A3(), this.n1)) {
            i3(str);
        } else if (!S7()) {
            i3(str);
        } else {
            L8();
            ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", z3().I()).c("by", "toolbar_back").e();
        }
    }

    public void o9(int i, ax.c3.K k, String str, boolean z) {
        v3().R(i, k, str, false, z);
        T8();
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        super.onApplyWindowsInsets(bVar, z);
        if (R0() == null || !T3()) {
            return;
        }
        if (!z) {
            this.K0.setClipToPadding(false);
            ListView listView = this.K0;
            listView.setPadding(listView.getPaddingLeft(), this.K0.getPaddingTop(), this.K0.getPaddingRight(), bVar.d);
            this.L0.setClipToPadding(false);
            GridView gridView = this.L0;
            gridView.setPadding(gridView.getPaddingLeft(), this.L0.getPaddingTop(), this.L0.getPaddingRight(), bVar.d);
        }
        View view = this.V0;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (z) {
                marginLayoutParams.bottomMargin = 0;
            } else {
                marginLayoutParams.bottomMargin = bVar.d;
            }
        }
    }

    public void p8(ax.c3.V v, boolean z) {
        AbstractC3595n abstractC3595n = this.t1;
        if (abstractC3595n == null) {
            ax.Ha.c.h().d("OPEN AS FILEINFO == null").h();
            return;
        }
        if (C1809B.P(abstractC3595n)) {
            E8(abstractC3595n, v.h(), z);
        } else {
            if (C1809B.J(abstractC3595n)) {
                v8((C3590i) abstractC3595n, v.h(), z);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractC3595n);
            f3(w7(), arrayList, new J(abstractC3595n, v, z));
        }
    }

    public void p9(int i, AbstractC3595n abstractC3595n) {
        ax.c3.K R2;
        String str;
        if (C1809B.P(abstractC3595n)) {
            C3605y c3605y = (C3605y) abstractC3595n;
            R2 = c3605y.B0();
            str = c3605y.M0();
        } else {
            R2 = abstractC3595n.R();
            str = null;
        }
        if (ax.Z2.j.F().E0(R2) && str != null && C3605y.U0(R2, str)) {
            M9();
        } else {
            o9(i, R2, str, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, com.voxdon.xplorer.R.menu.list);
        O7(menu);
        ia(menu);
        if (z3().P()) {
            return;
        }
        menu.removeItem(com.voxdon.xplorer.R.id.menu_view_settings);
    }

    protected void q8(ax.c3.K k, t.a aVar, String str, ParcelFileDescriptor parcelFileDescriptor, AbstractC3595n abstractC3595n, AbstractC1823k abstractC1823k, List<AbstractC3595n> list) {
        C1350f F3 = C1350f.F3(this, k);
        F3.P3(new C1909z(aVar, str, parcelFileDescriptor, abstractC3595n, abstractC1823k, list));
        A(F3, "directory", true);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(com.voxdon.xplorer.R.layout.fragment_file_list, (ViewGroup) null);
    }

    protected void r8(ax.c3.K k, C1350f.j jVar) {
        C1350f F3 = C1350f.F3(this, k);
        F3.P3(jVar);
        A(F3, "directory", true);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        V6();
    }

    protected C3418d s7() {
        return this.Y0;
    }

    protected void s9() {
        if (v3().g0().g()) {
            this.K0.setMultiChoiceModeListener(this.i2);
            this.L0.setMultiChoiceModeListener(this.i2);
            this.K0.setOnItemClickListener(E7());
            this.L0.setOnItemClickListener(E7());
            this.d1.p0(E7());
            this.e1.p0(E7());
            return;
        }
        this.K0.setMultiChoiceModeListener(this.h2);
        this.L0.setMultiChoiceModeListener(this.h2);
        this.K0.setOnItemClickListener(A7());
        this.L0.setOnItemClickListener(A7());
        this.d1.p0(A7());
        this.e1.p0(A7());
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Z
    public void t(int i, int i2) {
        super.t(i, i2);
        y9(i);
    }

    protected AbsListView t7() {
        return this.N0;
    }

    @Override // androidx.fragment.app.Fragment
    public void u1() {
        super.u1();
        this.g1.f();
    }

    protected void u8(String str, int i, int i2) {
        this.n1 = str;
        this.i1 = null;
        this.o1 = false;
        b8(i, i2);
        e4(false);
        V6();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        this.f1.a();
        L6();
        C3596o c3596o = this.h1;
        if (c3596o != null) {
            int U2 = c3596o.U();
            r2.fine(z3().I() + " retain count : " + U2);
            if (this.h1.i0()) {
                com.voxdon.xplorer.service.b.f(o3()).o(this.h1);
            }
            this.h1.k0(false);
            v9(k0.DISCONNECTED);
        }
        if (this.H1) {
            ax.T2.h.S(A3()).G0();
        }
        C3189g.a().h(this.p2);
        C3189g.a().h(this.n2);
        C3189g.a().h(this.o2);
    }

    protected AbstractC3595n v7() {
        return this.i1;
    }

    protected void v9(k0 k0Var) {
        this.K1 = k0Var;
    }

    public C3596o w7() {
        int U2 = this.h1.U();
        if (U2 <= 0 && this.I1) {
            this.I1 = false;
            ax.Ha.c.h().d("FGFO").j().g(d1() + ":" + X0() + ":" + z3().I() + ":" + this.h1.R()).h();
            Logger logger = r2;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid operator retain count: ");
            sb.append(U2);
            sb.append(" location:");
            sb.append(z3().I());
            logger.severe(sb.toString());
            logger.severe("------stack trace------");
            new RuntimeException().printStackTrace();
            logger.severe("-----------------------");
        }
        return this.h1;
    }

    void w9() {
        this.e2 = ax.W2.w.c().b();
        ax.W2.w.c().a();
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z) {
            V6();
        } else {
            X6();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public int x3() {
        if (this.F1 < 0) {
            this.F1 = j0().getInt("location_key");
        }
        return this.F1;
    }

    public ax.V2.c x7() {
        return ax.V2.c.d(A3());
    }

    protected void x9(View.OnClickListener onClickListener) {
        this.Q0.setOnClickListener(onClickListener);
    }

    @Override // ax.d3.AbstractC1927n
    public abstract ax.Q2.f z3();

    protected int z7() {
        int D7 = D7();
        if (!z3().P() || !ax.Q2.f.m0(z3())) {
            return D7;
        }
        AbstractC3595n abstractC3595n = this.i1;
        if (ax.c3.d0.D(A3(), abstractC3595n == null ? this.n1 : abstractC3595n.E())) {
            return D7 == 2 ? 12 : 10;
        }
        if (D7 == 2) {
            return 16;
        }
        return D7;
    }

    private class r0 extends AbstractC3199q<Void, Void, List<AbstractC3595n>> {
        C1495j h;
        boolean i;
        private int j;
        private int k;
        private C3596o l;
        private boolean m;
        private String n;
        private long o;
        private long p;
        private boolean q;
        private ax.c3.k0 r;
        private boolean s;
        private AbstractC3595n t;
        private boolean u;

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                r0.this.u = true;
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                r0.this.I();
            }
        }

        class d implements InterfaceC3185c {
            d() {
            }

            @Override // ax.u3.InterfaceC3185c
            public boolean isCancelled() {
                return r0.this.u;
            }
        }

        class e implements Runnable {
            final /* synthetic */ int q;

            e(int i) {
                this.q = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.q == r0.this.k) {
                    E.this.N0.scrollListBy(r0.this.k * (-1));
                }
            }
        }

        class f implements Runnable {
            final /* synthetic */ int q;

            f(int i) {
                this.q = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.q == r0.this.k) {
                    E.this.N0.scrollListBy(r0.this.k * (-1));
                }
            }
        }

        public r0(int i, int i2, boolean z) {
            super(AbstractC3199q.e.HIGHER);
            this.h = null;
            if (E.this.b2 != null) {
                this.i = true;
            } else {
                this.i = z;
            }
            this.j = i;
            this.k = i2;
            this.l = E.this.w7();
            this.m = false;
            this.o = -1L;
            this.p = -1L;
            this.s = false;
        }

        private void B() throws C1495j {
            if (E.this.f0() == null) {
                return;
            }
            ax.T2.h S = ax.T2.h.S(E.this.A3());
            if (!S.k0()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    try {
                        E.this.B9(true);
                        E.this.X1.post(new b());
                        this.u = false;
                        S.f(false, new c(countDownLatch), new d());
                    } catch (C1486a unused) {
                        E.this.I9(false);
                    }
                } finally {
                    try {
                        countDownLatch.await(5L, TimeUnit.SECONDS);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            this.o = S.Y(this.t);
            this.p = S.F(this.t);
        }

        private void C() {
            com.voxdon.xplorer.shizuku.c.t().m(new g());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E() {
            E.this.ka(false);
            E.this.S0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            if (E.this.T0 != null) {
                E.this.T0.setVisibility(8);
                E.this.T0.setOnClickListener(null);
            }
        }

        private void G(AbstractC3595n abstractC3595n) {
            String str;
            if (ax.X2.Q.L() && C1809B.P(abstractC3595n) && !E.this.v3().M() && ax.X2.Q.f()) {
                C3605y c3605y = (C3605y) abstractC3595n;
                if (!c3605y.a1() || c3605y.T0()) {
                    return;
                }
                if (ax.X2.Q.C1()) {
                    C3184b.f();
                    str = null;
                } else {
                    str = c3605y.M0();
                }
                String str2 = str;
                if (str2 != null) {
                    ax.Z2.j.F().E0(c3605y.B0());
                }
                E.this.v3().R(0, E.this.A3(), str2, true, true);
            }
        }

        private void H(List<AbstractC3595n> list, Set<String> set) {
            if (set.isEmpty()) {
                return;
            }
            E.this.N0.clearChoices();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (set.contains(list.get(i2).E())) {
                    E.this.N0.setItemChecked(i2, true);
                    i++;
                }
            }
            if (i != 0) {
                E.this.I3();
            } else if (E.this.K3()) {
                E.this.h3();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I() {
            if (E.this.f0() == null) {
                return;
            }
            E.this.ka(true);
            E.this.R0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            E.this.S0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            if (E.this.T0 != null) {
                E.this.T0.setVisibility(0);
                E.this.T0.setOnClickListener(new a());
                E.this.T0.setText(android.R.string.cancel);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:35:0x012b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.List<com.voxdon.xplorer.file.AbstractC3595n> g(java.lang.Void... r9) {
            /*
                Method dump skipped, instructions count: 559
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.d3.E.r0.g(java.lang.Void[]):java.util.List");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x03d4, code lost:
        
            if (r10.m == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            if (r10.m == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            r10.l.k0(false);
            r10.m = true;
            r10.n = "onPost";
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x03da, code lost:
        
            if (r10.m == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            ax.Ha.c.h().f().c("SCANTASK RELEASE TWICE 1").g(r10.n).h();
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0381 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x001e, B:17:0x0056, B:19:0x0060, B:21:0x0064, B:23:0x0070, B:24:0x007d, B:26:0x0083, B:28:0x0094, B:30:0x009a, B:31:0x009f, B:33:0x00a8, B:34:0x00bb, B:36:0x00c3, B:37:0x00d1, B:39:0x00d9, B:40:0x00de, B:42:0x00e5, B:44:0x00f9, B:45:0x00fc, B:47:0x0106, B:49:0x0112, B:50:0x0121, B:52:0x0134, B:53:0x0157, B:55:0x016e, B:58:0x0179, B:59:0x0188, B:61:0x01b0, B:63:0x01b6, B:65:0x01c0, B:68:0x01cd, B:69:0x01e9, B:70:0x01f7, B:72:0x0201, B:73:0x0211, B:75:0x021b, B:77:0x022c, B:78:0x023c, B:80:0x0244, B:81:0x0261, B:83:0x0267, B:85:0x0276, B:87:0x0282, B:89:0x0288, B:90:0x02bf, B:92:0x02c7, B:93:0x0352, B:95:0x035d, B:97:0x0367, B:99:0x0377, B:101:0x0381, B:102:0x0385, B:105:0x02a8, B:106:0x02d4, B:108:0x02d8, B:109:0x02e0, B:111:0x02f6, B:112:0x030a, B:114:0x0312, B:115:0x0316, B:117:0x031c, B:120:0x0332, B:125:0x0346, B:126:0x025c, B:127:0x0181, B:128:0x0140, B:130:0x0148, B:131:0x0150, B:132:0x011a, B:133:0x038f, B:135:0x03a1, B:137:0x03a9, B:139:0x03b5, B:141:0x03bb, B:143:0x03c5, B:144:0x03c9, B:145:0x00b4), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0385 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x001e, B:17:0x0056, B:19:0x0060, B:21:0x0064, B:23:0x0070, B:24:0x007d, B:26:0x0083, B:28:0x0094, B:30:0x009a, B:31:0x009f, B:33:0x00a8, B:34:0x00bb, B:36:0x00c3, B:37:0x00d1, B:39:0x00d9, B:40:0x00de, B:42:0x00e5, B:44:0x00f9, B:45:0x00fc, B:47:0x0106, B:49:0x0112, B:50:0x0121, B:52:0x0134, B:53:0x0157, B:55:0x016e, B:58:0x0179, B:59:0x0188, B:61:0x01b0, B:63:0x01b6, B:65:0x01c0, B:68:0x01cd, B:69:0x01e9, B:70:0x01f7, B:72:0x0201, B:73:0x0211, B:75:0x021b, B:77:0x022c, B:78:0x023c, B:80:0x0244, B:81:0x0261, B:83:0x0267, B:85:0x0276, B:87:0x0282, B:89:0x0288, B:90:0x02bf, B:92:0x02c7, B:93:0x0352, B:95:0x035d, B:97:0x0367, B:99:0x0377, B:101:0x0381, B:102:0x0385, B:105:0x02a8, B:106:0x02d4, B:108:0x02d8, B:109:0x02e0, B:111:0x02f6, B:112:0x030a, B:114:0x0312, B:115:0x0316, B:117:0x031c, B:120:0x0332, B:125:0x0346, B:126:0x025c, B:127:0x0181, B:128:0x0140, B:130:0x0148, B:131:0x0150, B:132:0x011a, B:133:0x038f, B:135:0x03a1, B:137:0x03a9, B:139:0x03b5, B:141:0x03bb, B:143:0x03c5, B:144:0x03c9, B:145:0x00b4), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x02d4 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x001e, B:17:0x0056, B:19:0x0060, B:21:0x0064, B:23:0x0070, B:24:0x007d, B:26:0x0083, B:28:0x0094, B:30:0x009a, B:31:0x009f, B:33:0x00a8, B:34:0x00bb, B:36:0x00c3, B:37:0x00d1, B:39:0x00d9, B:40:0x00de, B:42:0x00e5, B:44:0x00f9, B:45:0x00fc, B:47:0x0106, B:49:0x0112, B:50:0x0121, B:52:0x0134, B:53:0x0157, B:55:0x016e, B:58:0x0179, B:59:0x0188, B:61:0x01b0, B:63:0x01b6, B:65:0x01c0, B:68:0x01cd, B:69:0x01e9, B:70:0x01f7, B:72:0x0201, B:73:0x0211, B:75:0x021b, B:77:0x022c, B:78:0x023c, B:80:0x0244, B:81:0x0261, B:83:0x0267, B:85:0x0276, B:87:0x0282, B:89:0x0288, B:90:0x02bf, B:92:0x02c7, B:93:0x0352, B:95:0x035d, B:97:0x0367, B:99:0x0377, B:101:0x0381, B:102:0x0385, B:105:0x02a8, B:106:0x02d4, B:108:0x02d8, B:109:0x02e0, B:111:0x02f6, B:112:0x030a, B:114:0x0312, B:115:0x0316, B:117:0x031c, B:120:0x0332, B:125:0x0346, B:126:0x025c, B:127:0x0181, B:128:0x0140, B:130:0x0148, B:131:0x0150, B:132:0x011a, B:133:0x038f, B:135:0x03a1, B:137:0x03a9, B:139:0x03b5, B:141:0x03bb, B:143:0x03c5, B:144:0x03c9, B:145:0x00b4), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x025c A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x001e, B:17:0x0056, B:19:0x0060, B:21:0x0064, B:23:0x0070, B:24:0x007d, B:26:0x0083, B:28:0x0094, B:30:0x009a, B:31:0x009f, B:33:0x00a8, B:34:0x00bb, B:36:0x00c3, B:37:0x00d1, B:39:0x00d9, B:40:0x00de, B:42:0x00e5, B:44:0x00f9, B:45:0x00fc, B:47:0x0106, B:49:0x0112, B:50:0x0121, B:52:0x0134, B:53:0x0157, B:55:0x016e, B:58:0x0179, B:59:0x0188, B:61:0x01b0, B:63:0x01b6, B:65:0x01c0, B:68:0x01cd, B:69:0x01e9, B:70:0x01f7, B:72:0x0201, B:73:0x0211, B:75:0x021b, B:77:0x022c, B:78:0x023c, B:80:0x0244, B:81:0x0261, B:83:0x0267, B:85:0x0276, B:87:0x0282, B:89:0x0288, B:90:0x02bf, B:92:0x02c7, B:93:0x0352, B:95:0x035d, B:97:0x0367, B:99:0x0377, B:101:0x0381, B:102:0x0385, B:105:0x02a8, B:106:0x02d4, B:108:0x02d8, B:109:0x02e0, B:111:0x02f6, B:112:0x030a, B:114:0x0312, B:115:0x0316, B:117:0x031c, B:120:0x0332, B:125:0x0346, B:126:0x025c, B:127:0x0181, B:128:0x0140, B:130:0x0148, B:131:0x0150, B:132:0x011a, B:133:0x038f, B:135:0x03a1, B:137:0x03a9, B:139:0x03b5, B:141:0x03bb, B:143:0x03c5, B:144:0x03c9, B:145:0x00b4), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01b0 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x001e, B:17:0x0056, B:19:0x0060, B:21:0x0064, B:23:0x0070, B:24:0x007d, B:26:0x0083, B:28:0x0094, B:30:0x009a, B:31:0x009f, B:33:0x00a8, B:34:0x00bb, B:36:0x00c3, B:37:0x00d1, B:39:0x00d9, B:40:0x00de, B:42:0x00e5, B:44:0x00f9, B:45:0x00fc, B:47:0x0106, B:49:0x0112, B:50:0x0121, B:52:0x0134, B:53:0x0157, B:55:0x016e, B:58:0x0179, B:59:0x0188, B:61:0x01b0, B:63:0x01b6, B:65:0x01c0, B:68:0x01cd, B:69:0x01e9, B:70:0x01f7, B:72:0x0201, B:73:0x0211, B:75:0x021b, B:77:0x022c, B:78:0x023c, B:80:0x0244, B:81:0x0261, B:83:0x0267, B:85:0x0276, B:87:0x0282, B:89:0x0288, B:90:0x02bf, B:92:0x02c7, B:93:0x0352, B:95:0x035d, B:97:0x0367, B:99:0x0377, B:101:0x0381, B:102:0x0385, B:105:0x02a8, B:106:0x02d4, B:108:0x02d8, B:109:0x02e0, B:111:0x02f6, B:112:0x030a, B:114:0x0312, B:115:0x0316, B:117:0x031c, B:120:0x0332, B:125:0x0346, B:126:0x025c, B:127:0x0181, B:128:0x0140, B:130:0x0148, B:131:0x0150, B:132:0x011a, B:133:0x038f, B:135:0x03a1, B:137:0x03a9, B:139:0x03b5, B:141:0x03bb, B:143:0x03c5, B:144:0x03c9, B:145:0x00b4), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0244 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x001e, B:17:0x0056, B:19:0x0060, B:21:0x0064, B:23:0x0070, B:24:0x007d, B:26:0x0083, B:28:0x0094, B:30:0x009a, B:31:0x009f, B:33:0x00a8, B:34:0x00bb, B:36:0x00c3, B:37:0x00d1, B:39:0x00d9, B:40:0x00de, B:42:0x00e5, B:44:0x00f9, B:45:0x00fc, B:47:0x0106, B:49:0x0112, B:50:0x0121, B:52:0x0134, B:53:0x0157, B:55:0x016e, B:58:0x0179, B:59:0x0188, B:61:0x01b0, B:63:0x01b6, B:65:0x01c0, B:68:0x01cd, B:69:0x01e9, B:70:0x01f7, B:72:0x0201, B:73:0x0211, B:75:0x021b, B:77:0x022c, B:78:0x023c, B:80:0x0244, B:81:0x0261, B:83:0x0267, B:85:0x0276, B:87:0x0282, B:89:0x0288, B:90:0x02bf, B:92:0x02c7, B:93:0x0352, B:95:0x035d, B:97:0x0367, B:99:0x0377, B:101:0x0381, B:102:0x0385, B:105:0x02a8, B:106:0x02d4, B:108:0x02d8, B:109:0x02e0, B:111:0x02f6, B:112:0x030a, B:114:0x0312, B:115:0x0316, B:117:0x031c, B:120:0x0332, B:125:0x0346, B:126:0x025c, B:127:0x0181, B:128:0x0140, B:130:0x0148, B:131:0x0150, B:132:0x011a, B:133:0x038f, B:135:0x03a1, B:137:0x03a9, B:139:0x03b5, B:141:0x03bb, B:143:0x03c5, B:144:0x03c9, B:145:0x00b4), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0267 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:3:0x000c, B:5:0x0014, B:8:0x001e, B:17:0x0056, B:19:0x0060, B:21:0x0064, B:23:0x0070, B:24:0x007d, B:26:0x0083, B:28:0x0094, B:30:0x009a, B:31:0x009f, B:33:0x00a8, B:34:0x00bb, B:36:0x00c3, B:37:0x00d1, B:39:0x00d9, B:40:0x00de, B:42:0x00e5, B:44:0x00f9, B:45:0x00fc, B:47:0x0106, B:49:0x0112, B:50:0x0121, B:52:0x0134, B:53:0x0157, B:55:0x016e, B:58:0x0179, B:59:0x0188, B:61:0x01b0, B:63:0x01b6, B:65:0x01c0, B:68:0x01cd, B:69:0x01e9, B:70:0x01f7, B:72:0x0201, B:73:0x0211, B:75:0x021b, B:77:0x022c, B:78:0x023c, B:80:0x0244, B:81:0x0261, B:83:0x0267, B:85:0x0276, B:87:0x0282, B:89:0x0288, B:90:0x02bf, B:92:0x02c7, B:93:0x0352, B:95:0x035d, B:97:0x0367, B:99:0x0377, B:101:0x0381, B:102:0x0385, B:105:0x02a8, B:106:0x02d4, B:108:0x02d8, B:109:0x02e0, B:111:0x02f6, B:112:0x030a, B:114:0x0312, B:115:0x0316, B:117:0x031c, B:120:0x0332, B:125:0x0346, B:126:0x025c, B:127:0x0181, B:128:0x0140, B:130:0x0148, B:131:0x0150, B:132:0x011a, B:133:0x038f, B:135:0x03a1, B:137:0x03a9, B:139:0x03b5, B:141:0x03bb, B:143:0x03c5, B:144:0x03c9, B:145:0x00b4), top: B:2:0x000c }] */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void q(java.util.List<com.voxdon.xplorer.file.AbstractC3595n> r11) {
            /*
                Method dump skipped, instructions count: 1031
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.d3.E.r0.q(java.util.List):void");
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            E.this.x1 = false;
            E.this.b2 = null;
            E.this.B9(false);
            if (this.m) {
                ax.Ha.c.h().f().c("SCANTASK RELEASE TWICE 2").g(this.n).h();
                return;
            }
            this.l.k0(false);
            this.m = true;
            this.n = "onCancel";
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            this.l.n0();
            if (E.this.v1 != null) {
                E.this.v1.e();
            }
            if (this.i) {
                if (E.this.K3()) {
                    if (E.this.i1 != null) {
                        ax.Ha.c.h().f().d("AMOP:PRECLEAR").j().g("LOADED:" + E.this.o1 + ":" + E.this.N0.getCheckedItemCount() + ":" + E.this.N0.getCount()).h();
                    }
                    E.this.h3();
                }
                E.this.Q6();
                E.this.ka(false);
            }
            E.this.x1 = true;
        }

        class c implements h.g {
            final /* synthetic */ CountDownLatch a;

            class a implements Runnable {
                final /* synthetic */ int q;

                a(int i) {
                    this.q = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    E.this.S0.setText(this.q);
                }
            }

            class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    r0.this.E();
                    c.this.a.countDown();
                }
            }

            c(CountDownLatch countDownLatch) {
                this.a = countDownLatch;
            }

            @Override // ax.T2.h.g
            public void b() {
                E.this.X1.post(new b());
            }

            @Override // ax.T2.h.g
            public void d(int i) {
                E.this.X1.post(new a(i));
            }

            @Override // ax.T2.h.g
            public void a() {
            }

            @Override // ax.T2.h.g
            public void c(String str, boolean z) {
            }
        }

        class g implements i.a {
            g() {
            }

            @Override // ax.Q2.i.a
            public void b() {
                if (E.this.X0()) {
                    E.this.c4(false);
                }
            }

            @Override // ax.Q2.i.a
            public void c() {
            }

            @Override // ax.Q2.i.a
            public void a(boolean z) {
            }
        }
    }

    class l0 implements h.a {
        l0() {
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            E.this.S6();
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    /* renamed from: ax.d3.E$x, reason: case insensitive filesystem */
    class C1907x implements i.a {
        final /* synthetic */ AbstractC3595n a;

        C1907x(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // ax.Q2.i.a
        public void b() {
            if (E.this.X0()) {
                E.this.new s0((AbstractC1823k) this.a).i(new String[0]);
            }
        }

        @Override // ax.Q2.i.a
        public void c() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
        }
    }

    /* renamed from: ax.d3.E$y, reason: case insensitive filesystem */
    class C1908y implements C1350f.j {
        final /* synthetic */ List a;
        final /* synthetic */ C1367x.b b;

        C1908y(List list, C1367x.b bVar) {
            this.a = list;
            this.b = bVar;
        }

        @Override // ax.a3.C1350f.j
        public void c(C3596o c3596o, AbstractC3595n abstractC3595n) {
            if (abstractC3595n != null) {
                E e = E.this;
                e.m7(this.a, e.w7(), this.b, abstractC3595n.E());
            }
        }

        @Override // ax.a3.C1350f.j
        public void a() {
        }

        @Override // ax.a3.C1350f.j
        public void b() {
        }
    }

    /* renamed from: ax.d3.E$z, reason: case insensitive filesystem */
    class C1909z implements C1350f.j {
        final /* synthetic */ t.a a;
        final /* synthetic */ String b;
        final /* synthetic */ ParcelFileDescriptor c;
        final /* synthetic */ AbstractC3595n d;
        final /* synthetic */ AbstractC1823k e;
        final /* synthetic */ List f;

        C1909z(t.a aVar, String str, ParcelFileDescriptor parcelFileDescriptor, AbstractC3595n abstractC3595n, AbstractC1823k abstractC1823k, List list) {
            this.a = aVar;
            this.b = str;
            this.c = parcelFileDescriptor;
            this.d = abstractC3595n;
            this.e = abstractC1823k;
            this.f = list;
        }

        @Override // ax.a3.C1350f.j
        public void a() {
            ParcelFileDescriptor parcelFileDescriptor = this.c;
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
        }

        @Override // ax.a3.C1350f.j
        public void c(C3596o c3596o, AbstractC3595n abstractC3595n) {
            if (abstractC3595n != null) {
                E.this.l7(this.a, this.b, this.c, this.d, this.e, abstractC3595n.E(), c3596o, this.f);
            }
        }

        @Override // ax.a3.C1350f.j
        public void b() {
        }
    }

    class L implements MainActivity.G {
        L() {
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.G
        public void a(AbstractC1927n abstractC1927n) {
        }
    }

    class c0 implements ax.x3.z {
        c0() {
        }

        @Override // ax.x3.z
        public void b(int i) {
            if (i < 0 || i >= E.this.c1.getCount()) {
                return;
            }
            try {
                if (E.this.v3().g0().g() && !E.this.K3() && E.this.Y7() && !E.this.v3().g0().d()) {
                    AbstractC3595n abstractC3595n = (AbstractC3595n) E.this.c1.getItem(i);
                    if (abstractC3595n.isDirectory()) {
                        E.this.D8(abstractC3595n);
                        return;
                    }
                }
                E.this.N0.setItemChecked(i, !E.this.N0.isItemChecked(i));
            } catch (IndexOutOfBoundsException e) {
                ax.Ha.c.h().f().d("Toggle position problem").l(e).h();
            }
        }

        @Override // ax.x3.z
        public void c(int i, View view, int i2, int i3) {
            boolean isInMultiWindowMode;
            boolean isInMultiWindowMode2;
            if (i < 0 || i >= E.this.c1.getCount()) {
                return;
            }
            if (E.this.N0.isItemChecked(i)) {
                if (ax.X2.Q.m1()) {
                    isInMultiWindowMode2 = E.this.v3().isInMultiWindowMode();
                    if (isInMultiWindowMode2 && ax.Q2.f.Y(E.this.z3())) {
                        E.this.c1.z0(E.this.u7(true), view, i, i2, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            boolean K3 = E.this.K3();
            b(i);
            if (E.this.K3() && E.this.b1.b()) {
                E.this.b1.e(E.this.N0);
                E.this.I3();
            } else {
                if (K3 || !ax.X2.Q.m1()) {
                    return;
                }
                isInMultiWindowMode = E.this.v3().isInMultiWindowMode();
                if (isInMultiWindowMode && ax.Q2.f.Y(E.this.z3())) {
                    E.this.c1.z0(E.this.u7(true), view, i, i2, i3);
                }
            }
        }

        @Override // ax.x3.z
        public void a(int i) {
        }
    }

    @Override // ax.a3.Q.f
    public void L() {
    }

    @Override // ax.g3.f
    public void q() {
    }

    protected void m8(boolean z, Object obj) {
    }
}
