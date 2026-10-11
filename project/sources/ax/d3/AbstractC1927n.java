package ax.d3;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.Fragment;
import ax.Q2.a;
import ax.R.r;
import ax.S2.b;
import ax.W2.C1011c;
import ax.W2.h;
import ax.a3.C1345a;
import ax.a3.C1355k;
import ax.b3.C1488c;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1835x;
import ax.n.ActivityC2561c;
import ax.r3.C2947d;
import ax.s3.C3045a;
import ax.t3.C3098a;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.x3.C3405A;
import ax.x3.C3422h;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.ResultActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: ax.d3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1927n extends Fragment implements InterfaceC1931s, Y, Z {
    private static final Logger A0 = Logger.getLogger("FileManager.BaseFileFragment");
    private static boolean B0;
    private long d0;
    private long e0;
    private ActionMode f0;
    private o g0;
    private androidx.appcompat.view.a h0;
    private Context i0;
    private ax.c3.K j0;
    private boolean k0;
    private long l0;
    private s m0;
    private q n0;
    private boolean o0;
    private ax.Z2.f p0;
    private long r0;
    private boolean u0;
    private Snackbar v0;
    private View w0;
    private boolean x0;
    private Handler q0 = new Handler(Looper.getMainLooper());
    private boolean s0 = true;
    private boolean t0 = true;
    View.OnClickListener y0 = new g();
    View.OnClickListener z0 = new h();

    /* renamed from: ax.d3.n$a */
    class a implements b.c {
        a() {
        }
    }

    /* renamed from: ax.d3.n$b */
    class b implements Runnable {

        /* renamed from: ax.d3.n$b$a */
        class a implements b.a {
            a() {
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1927n.this.f0() == null) {
                return;
            }
            ax.S2.b.f(AbstractC1927n.this.f0(), AbstractC1927n.this.v3().i0().x, new a());
        }
    }

    /* renamed from: ax.d3.n$c */
    class c extends ax.g3.c {
        final /* synthetic */ View.OnClickListener c;
        final /* synthetic */ Snackbar d;

        c(View.OnClickListener onClickListener, Snackbar snackbar) {
            this.c = onClickListener;
            this.d = snackbar;
        }

        @Override // ax.g3.c
        public void a(View view) {
            this.c.onClick(view);
            this.d.x();
        }
    }

    /* renamed from: ax.d3.n$d */
    class d extends Snackbar.a {
        d() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i) {
            AbstractC1927n.this.P4();
        }

        @Override // com.google.android.material.snackbar.Snackbar.a, com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* renamed from: d */
        public void b(Snackbar snackbar) {
            AbstractC1927n.this.P4();
        }
    }

    /* renamed from: ax.d3.n$e */
    static /* synthetic */ class e {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.EnumC0188b.values().length];
            b = iArr;
            try {
                iArr[b.EnumC0188b.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.EnumC0188b.NOT_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.EnumC0188b.REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.EnumC0188b.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[b.EnumC0188b.LOADED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[b.EnumC0188b.AD_ERROR_NO_FILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[b.EnumC0188b.SWIPED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[b.EnumC0188b.SKIPPED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[b.EnumC0188b.AD_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[b.EnumC0188b.FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[h.b.values().length];
            a = iArr2;
            try {
                iArr2[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: ax.d3.n$f */
    class f implements View.OnDragListener {
        final /* synthetic */ View a;

        f(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnDragListener
        public boolean onDrag(View view, DragEvent dragEvent) {
            ClipData clipData;
            if (AbstractC1927n.this.f0() == null || AbstractC1927n.this.Z0() || dragEvent.getLocalState() != null) {
                return false;
            }
            int action = dragEvent.getAction();
            if (action == 1) {
                ClipDescription clipDescription = dragEvent.getClipDescription();
                if (clipDescription == null || clipDescription.getMimeTypeCount() <= 0) {
                    return false;
                }
                this.a.setBackgroundResource(R.color.color_drap_and_drop_started);
                return true;
            }
            if (action == 5) {
                this.a.setBackgroundResource(R.color.color_drap_and_drop_entered);
                return true;
            }
            if (action == 6) {
                this.a.setBackgroundResource(R.color.color_drap_and_drop_started);
                return true;
            }
            if (action == 4) {
                this.a.setBackgroundColor(0);
                return true;
            }
            if (action != 3 || dragEvent.getClipDescription() == null || (clipData = dragEvent.getClipData()) == null) {
                return false;
            }
            AbstractC1927n.this.f0().requestDragAndDropPermissions(dragEvent);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < clipData.getItemCount(); i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (itemAt.getUri() != null) {
                    ax.W2.g.a(AbstractC1927n.this.f0(), arrayList, itemAt.getUri());
                }
            }
            if (!arrayList.isEmpty()) {
                C1011c.q().n(arrayList);
                if (AbstractC1927n.this.K3()) {
                    AbstractC1927n.this.h3();
                }
                AbstractC1927n.this.e4(true);
                return true;
            }
            return false;
        }
    }

    /* renamed from: ax.d3.n$g */
    class g extends ax.g3.c {
        g() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            int id = view.getId();
            if (id == R.id.bottom_menu_cancel) {
                AbstractC1927n.this.X2(true);
            } else if (id == R.id.bottom_menu_paste || id == R.id.bottom_menu_save) {
                AbstractC1927n.this.a4();
            }
        }
    }

    /* renamed from: ax.d3.n$h */
    class h extends ax.g3.c {
        h() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            int id = view.getId();
            if (id == R.id.bottom_menu_cancel) {
                AbstractC1927n.this.Y2();
            } else {
                if (id != R.id.bottom_menu_select) {
                    return;
                }
                AbstractC1927n.this.j4();
            }
        }
    }

    /* renamed from: ax.d3.n$j */
    class j implements p {
        final /* synthetic */ AbstractC3595n a;

        j(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            if (AbstractC1927n.this.f0() == null) {
                return;
            }
            C1832u.m0(AbstractC1927n.this.f0(), this.a.s(), this.a.N());
        }
    }

    /* renamed from: ax.d3.n$k */
    class k implements p {
        final /* synthetic */ List a;

        k(List list) {
            this.a = list;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            if (AbstractC1927n.this.f0() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                File N = ((AbstractC3595n) it.next()).N();
                try {
                    arrayList.add(C1835x.f(N).z(N.getAbsolutePath()));
                } catch (C1495j e) {
                    e.printStackTrace();
                }
            }
            C1832u.n0(AbstractC1927n.this.f0(), arrayList);
        }
    }

    /* renamed from: ax.d3.n$l */
    class l implements p {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;
        final /* synthetic */ List c;
        final /* synthetic */ ax.Q2.j d;

        l(boolean z, String str, List list, ax.Q2.j jVar) {
            this.a = z;
            this.b = str;
            this.c = list;
            this.d = jVar;
        }

        @Override // ax.d3.AbstractC1927n.p
        public void a() {
            androidx.fragment.app.f f0 = AbstractC1927n.this.f0();
            if (f0 == null) {
                return;
            }
            f0.setResult(-1, C1832u.j(f0, this.a, this.b, this.c));
            f0.finish();
            this.d.a();
        }
    }

    /* renamed from: ax.d3.n$m */
    class m extends ax.g3.c {
        m() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ax.Q2.a.i().m("menu_folder", "open_recycle_bin").c("by", "command_result_snackbar").c("loc", AbstractC1927n.this.z3().I()).e();
            ((MainActivity) AbstractC1927n.this.f0()).H2(AbstractC1927n.this.A3(), "command_result_snackbar");
        }
    }

    /* renamed from: ax.d3.n$n, reason: collision with other inner class name */
    class C0284n implements t {
        C0284n() {
        }

        @Override // ax.d3.AbstractC1927n.t
        public void a(boolean z) {
            if (!z) {
                AbstractC1927n.this.m4(b.EnumC0188b.FAILED);
                return;
            }
            if (AbstractC1927n.this.m0 != null && AbstractC1927n.this.m0.m() != AbstractC3199q.f.FINISHED) {
                AbstractC1927n.A0.fine("request desktop ads skipped : already running");
                return;
            }
            AbstractC1927n.this.o4(System.currentTimeMillis());
            AbstractC1927n.this.m4(b.EnumC0188b.REQUESTED);
            AbstractC1927n.this.m0 = AbstractC1927n.this.new s();
            AbstractC1927n.this.m0.i(new Void[0]);
        }
    }

    /* renamed from: ax.d3.n$o */
    public enum o {
        NONE,
        FILE_NORMAL,
        FILE_PICKER,
        SUBLOCATION,
        SUBLOCATION_EDIT
    }

    /* renamed from: ax.d3.n$p */
    public interface p {
        void a();
    }

    /* renamed from: ax.d3.n$q */
    private class q extends AbstractC3199q<Void, Void, Object> {
        private t h;
        private boolean i;
        private boolean j;
        private boolean k;

        q(t tVar) {
            super(AbstractC3199q.e.HIGH);
            this.h = tVar;
        }

        @Override // ax.u3.AbstractC3199q
        protected void q(Object obj) {
            if (AbstractC1927n.this.f0() == null) {
                return;
            }
            if (!this.k || this.j) {
                this.h.a(false);
            } else {
                ax.u3.z.q(AbstractC1927n.this.f0());
                if (this.i) {
                    ax.u3.z.g((ActivityC2561c) AbstractC1927n.this.f0());
                }
                this.h.a(true);
            }
            AbstractC1927n.this.n0 = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Object g(Void... voidArr) {
            androidx.fragment.app.f f0 = AbstractC1927n.this.f0();
            if (f0 == null) {
                return null;
            }
            this.k = ax.u3.z.F(f0);
            this.j = ax.u3.z.t(f0);
            if (!ax.u3.z.y() && !this.j && this.k) {
                boolean a = ax.u3.z.a(f0);
                this.i = a;
                if (a && !ax.X2.Q.J()) {
                    ax.u3.z.A(f0);
                }
            }
            return null;
        }
    }

    /* renamed from: ax.d3.n$r */
    static class r {
        private LinkedList<Integer> a = new LinkedList<>();
        private boolean b = false;
        private boolean c = true;

        r() {
        }

        public boolean a() {
            return this.c;
        }

        public boolean b() {
            return this.a.size() >= 2 && Math.abs(this.a.get(0).intValue() - this.a.get(1).intValue()) > 1;
        }

        public void c() {
            this.a.clear();
            this.b = false;
        }

        public void d(AbsListView absListView) {
            this.b = true;
            this.c = false;
            int count = absListView.getCount();
            for (int i = 0; i < count; i++) {
                if (i == count - 1) {
                    this.c = true;
                }
                absListView.setItemChecked(i, true);
            }
            this.b = false;
            this.c = true;
        }

        public void e(AbsListView absListView) {
            if (b()) {
                int intValue = this.a.get(0).intValue();
                int intValue2 = this.a.get(1).intValue();
                if (intValue <= intValue2) {
                    intValue2 = intValue;
                    intValue = intValue2;
                }
                this.b = true;
                this.c = false;
                if (intValue < absListView.getCount()) {
                    while (intValue2 < intValue) {
                        if (intValue2 == intValue - 1) {
                            this.c = true;
                        }
                        absListView.setItemChecked(intValue2, true);
                        intValue2++;
                    }
                }
                this.b = false;
                this.c = true;
                this.a.clear();
            }
        }

        public void f(int i, boolean z) {
            if (this.b) {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (z) {
                this.a.addFirst(valueOf);
            } else if (this.a.contains(valueOf)) {
                this.a.remove(valueOf);
            } else {
                this.a.clear();
            }
        }
    }

    /* renamed from: ax.d3.n$s */
    private class s extends AbstractC3199q<Void, Void, Object> {
        s() {
            super(AbstractC3199q.e.HIGHER);
        }

        @Override // ax.u3.AbstractC3199q
        protected void q(Object obj) {
            AbstractC1927n.this.m0 = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Object g(Void... voidArr) {
            Context b = AbstractC1927n.this.b();
            if (b == null) {
                return null;
            }
            if (ax.u3.z.u(b)) {
                AbstractC1927n.this.m4(b.EnumC0188b.FAILED);
                return null;
            }
            ax.S2.b.b(b);
            AbstractC1927n.this.h4(false);
            return null;
        }
    }

    /* renamed from: ax.d3.n$t */
    private interface t {
        void a(boolean z);
    }

    private void H3(t tVar) {
        if (ax.u3.z.y()) {
            tVar.a(true);
            return;
        }
        q qVar = this.n0;
        if (qVar != null && qVar.m() != AbstractC3199q.f.FINISHED) {
            A0.fine("init webview task skipped : already running");
            return;
        }
        q qVar2 = new q(tVar);
        this.n0 = qVar2;
        qVar2.h(new Void[0]);
    }

    private void O4(ax.T.b bVar, boolean z) {
        View w3;
        if (ax.X2.Q.W1() && (w3 = w3()) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w3.getLayoutParams();
            if (z) {
                marginLayoutParams.bottomMargin = 0;
            } else {
                marginLayoutParams.bottomMargin = bVar.d;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P4() {
        View w3;
        if (ax.X2.Q.W1() && (w3 = w3()) != null) {
            if (!V3() || this.s0) {
                w3.setVisibility(8);
            } else {
                w3.setVisibility(0);
            }
        }
    }

    private ax.R.r c3(AbstractC3595n abstractC3595n, C2947d c2947d) {
        IconCompat iconCompat;
        Drawable c2;
        Context o3 = o3();
        Intent l2 = C1832u.l(o3, abstractC3595n);
        ax.X2.Q.s1();
        if (!ax.X2.J.g() || (c2 = C3045a.c(o3, abstractC3595n.K())) == null) {
            iconCompat = null;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(c2.getIntrinsicWidth(), c2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            c2.draw(canvas);
            iconCompat = IconCompat.i(createBitmap);
        }
        if (iconCompat == null) {
            iconCompat = IconCompat.l(o3, abstractC3595n.K());
        }
        return new r.b(o3, abstractC3595n.P().I().hashCode() + "-" + abstractC3595n.R().b() + "-" + abstractC3595n.T().hashCode() + "-" + abstractC3595n.B().hashCode()).c(l2).b(iconCompat).e(abstractC3595n.B()).a();
    }

    private void d4(boolean z) {
        int i2;
        CoordinatorLayout n3 = n3();
        if (n3 == null || f0() == null || !v3().o0()) {
            return;
        }
        n3.setVisibility((!W2() || z || !C3098a.i() || (i2 = v3().i0().y) < ax.t3.c.n().h() || (i2 < ax.t3.c.n().q() && (K3() || C1011c.q().v()))) ? 8 : 0);
    }

    private boolean e3(int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = this.r0;
        if (j2 != 0 && uptimeMillis - j2 <= 200) {
            return false;
        }
        this.r0 = uptimeMillis;
        return b4(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h4(boolean z) {
        if (X0() && f0() != null) {
            if (z || C3098a.d()) {
                ax.S2.b.e(f0(), new a());
            } else {
                this.q0.post(new b());
            }
        }
    }

    private Menu l3() {
        if (R0() == null) {
            return null;
        }
        if (k3() != null) {
            return k3().getMenu();
        }
        if (E3() != null) {
            return E3().e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4(b.EnumC0188b enumC0188b) {
        if (f0() instanceof MainActivity) {
            ((MainActivity) f0()).t2(enumC0188b);
        }
    }

    private CoordinatorLayout n3() {
        if (f0() instanceof MainActivity) {
            return ((MainActivity) f0()).r1();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4(long j2) {
        if (f0() instanceof MainActivity) {
            ((MainActivity) f0()).w2(j2);
        }
    }

    private b.EnumC0188b p3() {
        return f0() instanceof MainActivity ? ((MainActivity) f0()).u1() : b.EnumC0188b.NOT_LOADED;
    }

    private void p4(Menu menu) {
        if (menu instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e) menu).b0(true);
        }
    }

    private long t3() {
        return f0() instanceof MainActivity ? ((MainActivity) f0()).t1() : C3098a.a();
    }

    private void u4(C3596o c3596o, AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return;
        }
        if (C1809B.H(abstractC3595n)) {
            C1832u.j0(f0(), (AbstractC1823k) abstractC3595n);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC3595n);
        f3(c3596o, arrayList, new j(abstractC3595n));
    }

    private void v4(C3596o c3596o, List<AbstractC3595n> list) {
        if (C1809B.a(list)) {
            C1832u.n0(f0(), list);
        } else {
            f3(c3596o, list, new k(list));
        }
    }

    private long y3() {
        if (f0() instanceof MainActivity) {
            return ((MainActivity) f0()).B1();
        }
        return 0L;
    }

    @Override // ax.d3.InterfaceC1931s
    public boolean A(androidx.fragment.app.e eVar, String str, boolean z) {
        if (!L3()) {
            return false;
        }
        C3180B.d0(s0(), eVar, str, z);
        return true;
    }

    public ax.c3.K A3() {
        if (this.j0 == null) {
            this.j0 = ax.c3.K.a(z3(), x3());
        }
        return this.j0;
    }

    protected void A4(int i2, int i3) {
        Context b2 = b();
        if (b2 == null) {
            b2 = o3();
        }
        ax.u3.z.D(b2, i2, i3);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean B1(MenuItem menuItem) {
        if (e3(menuItem.getItemId())) {
            return true;
        }
        return super.B1(menuItem);
    }

    protected boolean B3() {
        return B0;
    }

    protected void B4(C3596o c3596o, List<AbstractC3595n> list) {
        ax.Q2.a.i().m("menu_folder", "properties").c("loc", z3().I()).c("type", a.e.a(list)).e();
        ax.a3.z zVar = new ax.a3.z();
        zVar.x3(o3(), c3596o, list);
        A(zVar, "properties", false);
    }

    public abstract String C3();

    protected void C4(boolean z, String str) {
        if (f0() == null) {
            return;
        }
        ((MainActivity) f0()).J2(z, str);
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        super.D1();
        this.l0 = System.currentTimeMillis();
    }

    protected View D3(boolean z) {
        View findViewById = (!z || R0() == null) ? null : R0().findViewById(R.id.snackbar_container);
        return findViewById == null ? f0().findViewById(android.R.id.content) : findViewById;
    }

    protected void D4(Snackbar snackbar) {
        this.v0 = snackbar;
        snackbar.r(new d());
        snackbar.a0();
    }

    protected androidx.appcompat.view.a E3() {
        return this.h0;
    }

    protected void E4(int i2, int i3) {
        L4(i2, null, true, true, i3, 0, null, null);
    }

    protected C2947d F3() {
        return null;
    }

    protected void F4(String str, int i2) {
        L4(0, str, true, true, i2, 0, null, null);
    }

    protected void G3(MenuInflater menuInflater, Menu menu, int i2) {
        menuInflater.inflate(i2, menu);
        p4(menu);
    }

    protected void G4(String str, int i2, int i3, View.OnClickListener onClickListener) {
        L4(0, str, true, true, i2, i3, onClickListener, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        ax.Q2.a.i().q(z3().I());
        ax.u3.z.c(v3());
    }

    protected void H4(String str, int i2, View.OnClickListener onClickListener, Snackbar.a aVar) {
        L4(0, str, true, true, i2, 0, onClickListener, aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putParcelable("extrainfo", this.p0);
    }

    public void I3() {
        ActionMode actionMode = this.f0;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        androidx.appcompat.view.a aVar = this.h0;
        if (aVar != null) {
            aVar.k();
        }
    }

    protected void I4(String str, int i2) {
        L4(0, str, false, true, i2, 0, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        if (this.t0) {
            if (!Z0()) {
                i4();
                e4(true);
                N4();
            }
            this.t0 = false;
        }
        this.o0 = true;
        N4();
        this.l0 = System.currentTimeMillis();
    }

    protected void J3() {
        if (f0() == null) {
            return;
        }
        f0().invalidateOptionsMenu();
    }

    protected void J4(int i2, int i3) {
        L4(i2, null, false, false, i3, 0, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void K1() {
        super.K1();
        this.o0 = false;
        this.l0 = 0L;
    }

    public boolean K3() {
        return (this.f0 == null && this.h0 == null) ? false : true;
    }

    protected void K4(String str, int i2) {
        L4(0, str, false, false, i2, 0, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        View findViewById;
        super.L1(view, bundle);
        this.u0 = true;
        v3().Y(this);
        if (!ax.X2.Q.M0() || (findViewById = f0().findViewById(R.id.drag_and_drop_view)) == null) {
            return;
        }
        findViewById.setOnDragListener(new f(findViewById));
    }

    public boolean L3() {
        return C3180B.F(this, true);
    }

    protected void L4(int i2, String str, boolean z, boolean z2, int i3, int i4, View.OnClickListener onClickListener, Snackbar.a aVar) {
        int i5 = 1;
        if (!z2 || !L3()) {
            if (i3 != 1) {
                if (i3 == 0) {
                    i5 = 0;
                } else if (i3 != 2) {
                    C3184b.f();
                }
            }
            Context b2 = b();
            if (b2 == null) {
                b2 = o3();
            }
            if (str != null) {
                Toast.makeText(b2, str, i5).show();
            } else {
                Toast.makeText(b2, i2, i5).show();
            }
            if (aVar != null) {
                aVar.a(null, 0);
                return;
            }
            return;
        }
        if (i3 == 1) {
            i5 = 0;
        } else if (i3 == 0) {
            i5 = -1;
        } else if (i3 == 2) {
            i5 = -2;
        } else {
            C3184b.f();
        }
        View D3 = D3(z);
        Snackbar T = str != null ? C3180B.T(D3, str, i5) : C3180B.S(D3, i2, i5);
        if (i4 != 0 && onClickListener != null) {
            T.q0(i4, onClickListener);
        } else if (i4 == 0 && onClickListener != null) {
            T.r0("\u200b", onClickListener);
            View H = T.H();
            TextView textView = (TextView) H.findViewById(R.id.snackbar_action);
            Drawable e2 = ax.Q.b.e(textView.getContext(), R.drawable.ic_more_vert);
            e2.setBounds(0, 0, e2.getIntrinsicWidth(), e2.getIntrinsicHeight());
            textView.setCompoundDrawables(e2, null, null, null);
            H.setOnClickListener(new c(onClickListener, T));
        }
        if (aVar != null) {
            T.r(aVar);
        }
        D4(T);
    }

    protected boolean M3() {
        if (f0() == null) {
            return false;
        }
        return ax.u3.z.w(f0());
    }

    public abstract void M4();

    public abstract boolean N3();

    protected void N4() {
        CoordinatorLayout n3;
        b.EnumC0188b p3 = p3();
        if (p3 == b.EnumC0188b.DISABLED || p3 == b.EnumC0188b.NOT_LOADED || !W2() || Z0() || (n3 = n3()) == null) {
            return;
        }
        if (!C3098a.i()) {
            if (n3.getChildCount() > 0) {
                g4();
            }
            return;
        }
        if (n3.getVisibility() != 0) {
            return;
        }
        switch (e.b[p3().ordinal()]) {
            case 1:
            case 2:
                C3184b.f();
                break;
            case 3:
                if (System.currentTimeMillis() - y3() > 30000) {
                    x4();
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
                if (System.currentTimeMillis() - y3() > t3()) {
                    x4();
                    break;
                }
                break;
            case 7:
                if (System.currentTimeMillis() - y3() > 1800000) {
                    x4();
                    break;
                }
                break;
            case 8:
                x4();
                break;
            case 9:
                if (System.currentTimeMillis() - y3() > 30000) {
                    x4();
                    break;
                }
                break;
            case 10:
                if (System.currentTimeMillis() - y3() > 1000) {
                    x4();
                    break;
                }
                break;
        }
    }

    public boolean O3() {
        return this.k0;
    }

    protected boolean P3() {
        return this.l0 != 0 && System.currentTimeMillis() - this.l0 > 4000;
    }

    protected boolean Q3() {
        if (f0() == null) {
            return false;
        }
        return ((MainActivity) f0()).Y1();
    }

    protected boolean R3() {
        Snackbar snackbar = this.v0;
        if (snackbar == null) {
            return false;
        }
        return snackbar.L();
    }

    protected void S2(ax.c3.K k2, ax.Z2.s sVar, boolean z) {
        Context o3 = o3();
        Intent k3 = (sVar == null || TextUtils.isEmpty(sVar.d())) ? C1832u.k(o3, k2, null) : C1832u.k(o3, k2, sVar.d());
        ax.R.y.c(o3, new r.b(o3, k2.k()).c(k3).b(IconCompat.i(ax.u3.z.e(z ? ax.s3.b.e(o3, k2.d(), null) : ax.s3.b.f(o3, k2.d(), null)))).e(sVar == null ? k2.f(o3) : sVar.f()).a(), null);
    }

    public boolean S3() {
        return this.o0;
    }

    protected void T2(AbstractC3595n abstractC3595n, C2947d c2947d) {
        ax.R.y.c(o3(), c3(abstractC3595n, c2947d), null);
    }

    protected boolean T3() {
        return this.u0;
    }

    protected void U2(ax.Z2.s sVar) {
        o3();
        ax.c3.K e2 = sVar.e();
        String f2 = sVar.f();
        String d2 = !TextUtils.isEmpty(sVar.d()) ? sVar.d() : e2.e();
        if (ax.V2.b.a(f0(), Bookmark.h(f2, e2, d2, d2, true), false)) {
            E4(R.string.msg_add_bookmark_success, 0);
        }
    }

    protected void U3(String str) {
        if (f0() == null) {
            return;
        }
        v3().q0(str);
    }

    public abstract boolean V2();

    protected boolean V3() {
        return R3();
    }

    protected boolean W2() {
        return f0() != null && C3098a.j() && v3().i0().y >= ax.t3.c.n().i();
    }

    protected void W3(o oVar) {
        if (f0() == null) {
            return;
        }
        v3().L0();
        r4(r3());
        this.g0 = null;
    }

    public void X2(boolean z) {
        C1011c.q().l();
        this.d0 = System.currentTimeMillis();
        if (f0() == null) {
            return;
        }
        f0().supportInvalidateOptionsMenu();
        e4(true);
        ax.Q2.a.i().m("menu_folder", "cancel_paste").c("loc", z3().I()).c("info", z ? "manual" : "byapp").e();
    }

    protected void X3(o oVar) {
        if (f0() == null) {
            return;
        }
        this.g0 = oVar;
        v3().p0();
        r4(ax.Q.b.c(f0(), R.color.selection_statusbar));
    }

    public void Y2() {
        androidx.fragment.app.f f0 = f0();
        if (f0 == null) {
            return;
        }
        ax.Q2.a.i().m("menu_folder", "cancel_select").c("loc", z3().I()).e();
        f0.setResult(0);
        f0.finish();
    }

    public boolean Y3(int i2, KeyEvent keyEvent) {
        return false;
    }

    protected boolean Z2(ax.c3.K k2, String str) {
        if (k2 != ax.c3.K.f && k2 != ax.c3.K.e) {
            return false;
        }
        if ((k2 == ax.c3.K.e && str == null) || !C3604x.D1(o3(), k2, str)) {
            return false;
        }
        if (v3() == null) {
            return true;
        }
        v3().R(3, k2, str, false, true);
        return true;
    }

    public abstract void Z3(String str);

    public void a3() {
        this.f0 = null;
        this.h0 = null;
    }

    public void a4() {
        if (C1011c.q().v()) {
            this.e0 = System.currentTimeMillis();
            M4();
            ax.Q2.a.i().m("menu_folder", "paste").c("loc", z3().I()).e();
            return;
        }
        if (System.currentTimeMillis() - this.d0 > 1000 && System.currentTimeMillis() - this.e0 > 1000) {
            ax.Ha.c.h().d("PASTE").g((System.currentTimeMillis() - this.d0) + "," + (System.currentTimeMillis() - this.e0)).h();
        }
        e4(true);
    }

    protected void b3(ActionMode actionMode, Menu menu, int i2) {
        this.f0 = actionMode;
        menu.clear();
        if (i2 != 0) {
            f0().getMenuInflater().inflate(i2, menu);
        }
        d4(false);
    }

    protected boolean b4(int i2) {
        return false;
    }

    public abstract void c4(boolean z);

    protected void d3(androidx.appcompat.view.a aVar, Menu menu, int i2) {
        this.h0 = aVar;
        menu.clear();
        if (i2 != 0) {
            f0().getMenuInflater().inflate(i2, menu);
        }
        d4(false);
    }

    public void e4(boolean z) {
        if (f0() == null) {
            return;
        }
        com.voxdon.xplorer.activity.b v3 = v3();
        C3405A h0 = v3.h0();
        if (v3.d0() != this) {
            return;
        }
        if (v3().g0().g()) {
            h0.y(0);
            if (z) {
                h0.A();
            }
            h0.F(false);
        } else if (!C1011c.q().v()) {
            h0.y(8);
        } else if (K3()) {
            h0.y(8);
        } else {
            h0.y(0);
            if (z) {
                h0.A();
            }
            h0.E(C1011c.q().u(), N3());
        }
        d4(false);
    }

    protected void f3(C3596o c3596o, List<AbstractC3595n> list, p pVar) {
        ax.W2.r l2 = ax.W2.r.l();
        l2.k(c3596o, list, false, new i(pVar));
        try {
            l(l2, true);
        } catch (C1488c unused) {
            J4(R.string.error, 1);
        }
    }

    void f4() {
        s4(s3());
        r4(r3());
        l4(q3());
    }

    protected int g3() {
        Menu l3;
        if (R0() == null || (l3 = l3()) == null) {
            return -1;
        }
        for (int size = l3.size() - 1; size >= 0; size--) {
            View findViewById = R0().getRootView().findViewById(l3.getItem(size).getItemId());
            if (findViewById != null && findViewById.isShown() && findViewById.isEnabled()) {
                return findViewById.getId();
            }
        }
        return -1;
    }

    protected void g4() {
        CoordinatorLayout n3 = n3();
        if (n3 != null) {
            View childAt = n3.getChildAt(0);
            if (childAt != null) {
                ax.S2.b.a(childAt, b());
            }
            n3.removeAllViews();
            n3.setBackgroundResource(0);
            m4(b.EnumC0188b.REMOVED);
        }
        J3();
    }

    @Override // androidx.fragment.app.Fragment
    public void h1(Bundle bundle) {
        super.h1(bundle);
        j3();
    }

    public void h3() {
        ActionMode actionMode = this.f0;
        if (actionMode != null) {
            actionMode.finish();
            d4(false);
        }
        androidx.appcompat.view.a aVar = this.h0;
        if (aVar != null) {
            aVar.c();
            d4(false);
        }
    }

    protected void i3(String str) {
        if (f0() != null) {
            v3().a0(z3(), x3(), str);
            return;
        }
        ax.Ha.c.h().f().c("FINISH SELF NULL ACTIVITY").j().g("Detached:" + Y0() + ",Added:" + X0() + ",Removing:" + d1()).h();
    }

    public void i4() {
        if (f0() == null) {
            return;
        }
        C3405A h0 = v3().h0();
        if (v3().g0().g()) {
            h0.u(R.id.bottom_menu_cancel, this.z0);
            h0.u(R.id.bottom_menu_select, this.z0);
        } else {
            h0.u(R.id.bottom_menu_cancel, this.y0);
            h0.u(R.id.bottom_menu_paste, this.y0);
            h0.u(R.id.bottom_menu_save, this.y0);
        }
    }

    public abstract void j3();

    @Override // androidx.fragment.app.Fragment
    public void k1(Context context) {
        this.k0 = false;
        this.i0 = context.getApplicationContext();
        super.k1(context);
        if (Z0()) {
            return;
        }
        f4();
    }

    protected ActionMode k3() {
        return this.f0;
    }

    protected void k4(C3596o c3596o, List<AbstractC3595n> list) {
        com.voxdon.xplorer.activity.b v3;
        ax.Q2.j g0;
        if (list.size() == 0 || (v3 = v3()) == null || (g0 = v3.g0()) == null) {
            return;
        }
        if (g0.d()) {
            v3.setResult(-1, ax.R.y.a(v3, c3(list.get(0), F3())));
            v3.finish();
            g0.a();
            return;
        }
        boolean f2 = g0.f();
        String b2 = g0.b();
        if (!C1809B.a(list)) {
            f3(c3596o, list, new l(f2, b2, list, g0));
            return;
        }
        try {
            v3.setResult(-1, C1832u.j(v3, f2, b2, list));
            v3.finish();
            g0.a();
        } catch (RuntimeException unused) {
            J4(R.string.error, 1);
            v3.setResult(0);
        }
    }

    public void l(ax.W2.h hVar, boolean z) throws C1488c {
        androidx.fragment.app.f f0 = f0();
        if (f0 == null) {
            return;
        }
        CommandService.M(f0, this, hVar, z, !(hVar instanceof ax.W2.B));
    }

    protected void l4(int i2) {
        if (f0() != null) {
            v3().T(i2);
        }
    }

    public o m3() {
        return this.g0;
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle == null || bundle.isEmpty()) {
            return;
        }
        try {
            this.p0 = (ax.Z2.f) bundle.getParcelable("extrainfo");
        } catch (Exception unused) {
        }
    }

    public void n4(ax.Z2.f fVar) {
        this.p0 = fVar;
    }

    Context o3() {
        return this.i0;
    }

    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        this.s0 = z;
        P4();
        O4(bVar, z);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d4(false);
    }

    protected int q3() {
        if (b() == null) {
            return 0;
        }
        return ax.Q.b.c(b(), R.color.actionbar_color);
    }

    public void q4() {
        this.k0 = true;
    }

    protected int r3() {
        if (b() == null) {
            return 0;
        }
        return Build.VERSION.SDK_INT < 23 ? ax.Q.b.c(b(), R.color.statusbar_color_before_23) : ax.Q.b.c(b(), R.color.statusbar_color);
    }

    protected void r4(int i2) {
        if (f0() == null || !ax.X2.Q.N1()) {
            return;
        }
        ax.X2.v.s(f0().getWindow(), i2);
        if (ax.X2.Q.W1()) {
            v3().E0(i2);
        }
        if (ax.X2.Q.b1()) {
            ax.u3.z.B(f0(), i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        if (v3() != null && T3()) {
            v3().C0(this);
        }
        super.s1();
    }

    protected C3422h.a s3() {
        return M3() ? C3422h.a.DARK : C3422h.a.LIGHT;
    }

    protected void s4(C3422h.a aVar) {
        if (f0() != null) {
            v3().F0(aVar);
        }
    }

    public void t(int i2, int i3) {
        d4(false);
    }

    protected void t4(C3596o c3596o, List<AbstractC3595n> list) {
        ax.Q2.a.i().m("menu_folder", "share").c("loc", z3().I()).c("type", a.e.a(list)).e();
        if (list.size() > 1) {
            v4(c3596o, list);
        } else if (list.size() == 1) {
            u4(c3596o, list.get(0));
        }
    }

    public ax.Z2.f u3() {
        return this.p0;
    }

    public com.voxdon.xplorer.activity.b v3() {
        return (com.voxdon.xplorer.activity.b) f0();
    }

    protected View w3() {
        if (R0() == null) {
            return null;
        }
        if (!this.x0) {
            this.w0 = R0().findViewById(R.id.fragment_navigation_area);
            this.x0 = true;
        }
        return this.w0;
    }

    protected void w4(C3596o c3596o, AbstractC1823k abstractC1823k, C1345a.c cVar) {
        C1345a c1345a = new C1345a();
        c1345a.v3(o3(), c3596o, abstractC1823k);
        c1345a.u3(cVar);
        A(c1345a, "apkproperties", true);
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z) {
            return;
        }
        i4();
        e4(true);
        f4();
        N4();
        j3();
    }

    public abstract int x3();

    protected void x4() {
        if (f0() == null) {
            return;
        }
        if (!C3098a.i()) {
            A0.severe("DESKTOP ADS NOT ENABLED");
            return;
        }
        B0 = true;
        int i2 = v3().i0().x;
        if (v3().i0().y >= ax.t3.c.n().h()) {
            H3(new C0284n());
        } else if (p3() == b.EnumC0188b.NOT_LOADED) {
            if (i2 >= ax.t3.c.n().h()) {
                m4(b.EnumC0188b.SKIPPED);
            } else {
                m4(b.EnumC0188b.DISABLED);
            }
        }
    }

    void y4(h.b bVar, String str, String str2, ArrayList<String> arrayList) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = e.a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (L3()) {
                    A(C1355k.i3(R.string.dialog_title_failure, str, str2, arrayList), "result", false);
                    return;
                }
                Intent intent = new Intent(o3(), (Class<?>) ResultActivity.class);
                intent.putExtra(ResultActivity.a, bVar);
                intent.putExtra(ResultActivity.b, str);
                intent.putExtra(ResultActivity.c, str2);
                if (arrayList.size() > 1000) {
                    intent.putExtra(ResultActivity.d, new ArrayList(arrayList.subList(0, 1000)));
                } else {
                    intent.putExtra(ResultActivity.d, arrayList);
                }
                intent.setFlags(268435456);
                o3().startActivity(intent);
                if (ax.X2.Q.M()) {
                    ax.s3.u.j(o3()).l(104, ax.s3.u.j(o3()).f(C1832u.J(o3()), str, str2));
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
        }
        F4(str, 1);
    }

    public abstract ax.Q2.f z3();

    protected void z4(CharSequence charSequence, List<String> list) {
        if (b() == null) {
            return;
        }
        D4(C3180B.O(R0().findViewById(R.id.snackbar_container), charSequence, 0, R.string.menu_open, true, new m()));
    }

    /* renamed from: ax.d3.n$i */
    class i implements h.a {
        final /* synthetic */ p a;

        i(p pVar) {
            this.a = pVar;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            int i = e.a[bVar.ordinal()];
            if (i == 1) {
                this.a.a();
            } else if (i == 2 || i == 3) {
                AbstractC1927n.this.y4(bVar, str, str2, arrayList);
            }
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    public void j4() {
    }
}
