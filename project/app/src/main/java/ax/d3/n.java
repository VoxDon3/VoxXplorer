/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.app.Notification;
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
import android.os.Parcelable;
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
import androidx.fragment.app.f;
import ax.Q2.a;
import ax.Q2.j;
import ax.R.r;
import ax.R.y;
import ax.S2.b;
import ax.W2.g;
import ax.W2.h;
import ax.X2.J;
import ax.X2.Q;
import ax.X2.v;
import ax.a3.a;
import ax.a3.z;
import ax.c3.B;
import ax.c3.K;
import ax.c3.k;
import ax.c3.u;
import ax.d3.Y;
import ax.d3.Z;
import ax.d3.m;
import ax.r3.d;
import ax.s3.a;
import ax.t3.c;
import ax.u3.q;
import ax.x3.A;
import ax.x3.h;
import com.alphainventor.filemanager.activity.MainActivity;
import com.alphainventor.filemanager.activity.ResultActivity;
import com.alphainventor.filemanager.bookmark.Bookmark;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.service.CommandService;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public abstract class n
extends Fragment
implements ax.d3.s,
Y,
Z {
    private static final Logger A0 = Logger.getLogger("FileManager.BaseFileFragment");
    private static boolean B0;
    private long d0;
    private long e0;
    private ActionMode f0;
    private o g0;
    private androidx.appcompat.view.a h0;
    private Context i0;
    private K j0;
    private boolean k0;
    private long l0;
    private s m0;
    private q n0;
    private boolean o0;
    private ax.Z2.f p0;
    private Handler q0 = new Handler(Looper.getMainLooper());
    private long r0;
    private boolean s0 = true;
    private boolean t0 = true;
    private boolean u0;
    private Snackbar v0;
    private View w0;
    private boolean x0;
    View.OnClickListener y0 = new ax.g3.c(this){
        final n c;
        {
            this.c = n8;
        }

        @Override
        public void a(View view) {
            int n8 = view.getId();
            if (n8 != 2131361926) {
                if (n8 != 2131361938 && n8 != 2131361946) {
                    return;
                }
                this.c.a4();
                return;
            }
            this.c.X2(true);
        }
    };
    View.OnClickListener z0 = new ax.g3.c(this){
        final n c;
        {
            this.c = n8;
        }

        @Override
        public void a(View view) {
            int n8 = view.getId();
            if (n8 != 2131361926) {
                if (n8 != 2131361947) {
                    return;
                }
                this.c.j4();
                return;
            }
            this.c.Y2();
        }
    };

    private void H3(t object) {
        if (ax.u3.z.y()) {
            object.a(true);
            return;
        }
        q q8 = this.n0;
        if (q8 != null && q8.m() != q.f.d0) {
            A0.fine("init webview task skipped : already running");
            return;
        }
        this.n0 = object = new q(this, (t)object);
        ((ax.u3.q)object).h(new Void[0]);
    }

    static /* synthetic */ s L2(n n8, s s8) {
        n8.m0 = s8;
        return s8;
    }

    private void O4(ax.T.b b8, boolean bl) {
        View view;
        if (!Q.W1() || (view = this.w3()) == null) {
            return;
        }
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        if (!bl) {
            view.bottomMargin = b8.d;
            return;
        }
        view.bottomMargin = 0;
    }

    static /* synthetic */ q P2(n n8, q q8) {
        n8.n0 = q8;
        return q8;
    }

    private void P4() {
        View view;
        if (!Q.W1() || (view = this.w3()) == null) {
            return;
        }
        if (this.V3() && !this.s0) {
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }

    private ax.R.r c3(com.alphainventor.filemanager.file.n n8, d object) {
        Object object2;
        Drawable drawable;
        Context context = this.o3();
        Intent intent = u.l(context, n8);
        Q.s1();
        if (J.g() && (drawable = a.c(context, n8.K())) != null) {
            object2 = Bitmap.createBitmap((int)drawable.getIntrinsicWidth(), (int)drawable.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
            object = new Canvas((Bitmap)object2);
            drawable.setBounds(0, 0, object.getWidth(), object.getHeight());
            drawable.draw((Canvas)object);
            object = IconCompat.i((Bitmap)object2);
        } else {
            object = null;
        }
        object2 = object;
        if (object == null) {
            object2 = IconCompat.l(context, n8.K());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(n8.P().I().hashCode());
        ((StringBuilder)object).append("-");
        ((StringBuilder)object).append(n8.R().b());
        ((StringBuilder)object).append("-");
        ((StringBuilder)object).append(n8.T().hashCode());
        ((StringBuilder)object).append("-");
        ((StringBuilder)object).append(n8.B().hashCode());
        return new r.b(context, ((StringBuilder)object).toString()).c(intent).b((IconCompat)object2).e(n8.B()).a();
    }

    private void d4(boolean bl) {
        CoordinatorLayout coordinatorLayout = this.n3();
        if (coordinatorLayout != null && this.f0() != null && this.v3().o0()) {
            int n8;
            n8 = this.W2() && !bl && ax.t3.a.i() && (n8 = this.v3().i0().y) >= c.n().h() && (n8 >= c.n().q() || !this.K3() && !ax.W2.c.q().v()) ? 0 : 8;
            coordinatorLayout.setVisibility(n8);
        }
    }

    private boolean e3(int n8) {
        long l8 = SystemClock.uptimeMillis();
        long l9 = this.r0;
        if (l9 != 0L && l8 - l9 <= 200L) {
            return false;
        }
        this.r0 = l8;
        return this.b4(n8);
    }

    private void h4(boolean bl) {
        if (!this.X0() || this.f0() == null) {
            return;
        }
        if (!bl && !ax.t3.a.d()) {
            this.q0.post(new Runnable(this){
                final n q;
                {
                    this.q = n8;
                }

                @Override
                public void run() {
                    if (this.q.f0() == null) {
                        return;
                    }
                    int n8 = this.q.v3().i0().x;
                    ax.S2.b.f(this.q.f0(), n8, new b.a(this){
                        final b a;
                        {
                            this.a = b8;
                        }
                    });
                }
            });
            return;
        }
        ax.S2.b.e(this.f0(), new b.c(this){
            final n a;
            {
                this.a = n8;
            }
        });
    }

    private Menu l3() {
        if (this.R0() == null) {
            return null;
        }
        if (this.k3() != null) {
            return this.k3().getMenu();
        }
        if (this.E3() != null) {
            return this.E3().e();
        }
        return null;
    }

    private void m4(b.b b8) {
        if (this.f0() instanceof MainActivity) {
            ((MainActivity)this.f0()).t2(b8);
        }
    }

    private CoordinatorLayout n3() {
        if (this.f0() instanceof MainActivity) {
            return ((MainActivity)this.f0()).r1();
        }
        return null;
    }

    private void o4(long l8) {
        if (this.f0() instanceof MainActivity) {
            ((MainActivity)this.f0()).w2(l8);
        }
    }

    private b.b p3() {
        if (this.f0() instanceof MainActivity) {
            return ((MainActivity)this.f0()).u1();
        }
        return b.b.q;
    }

    private void p4(Menu menu) {
        if (menu instanceof androidx.appcompat.view.menu.e) {
            ((androidx.appcompat.view.menu.e)menu).b0(true);
        }
    }

    private long t3() {
        if (this.f0() instanceof MainActivity) {
            return ((MainActivity)this.f0()).t1();
        }
        return ax.t3.a.a();
    }

    private void u4(com.alphainventor.filemanager.file.o o8, com.alphainventor.filemanager.file.n n8) {
        if (n8 == null) {
            return;
        }
        if (B.H(n8)) {
            u.j0((Context)this.f0(), (k)n8);
            return;
        }
        ArrayList<com.alphainventor.filemanager.file.n> arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
        arrayList.add(n8);
        this.f3(o8, arrayList, new p(){
            final com.alphainventor.filemanager.file.n a;
            final n b;
            {
                this.b = n8;
                this.a = n9;
            }

            @Override
            public void a() {
                if (this.b.f0() == null) {
                    return;
                }
                u.m0((Context)this.b.f0(), this.a.s(), this.a.N());
            }
        });
    }

    private void v4(com.alphainventor.filemanager.file.o o8, List<com.alphainventor.filemanager.file.n> list) {
        if (B.a(list)) {
            u.n0((Context)this.f0(), list);
            return;
        }
        this.f3(o8, list, new p(){
            final List a;
            final n b;
            {
                this.b = n8;
                this.a = list;
            }

            @Override
            public void a() {
                if (this.b.f0() == null) {
                    return;
                }
                ArrayList<com.alphainventor.filemanager.file.n> arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
                Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    File file = ((com.alphainventor.filemanager.file.n)iterator.next()).N();
                    com.alphainventor.filemanager.file.o o8 = ax.c3.x.f(file);
                    try {
                        arrayList.add(o8.z(file.getAbsolutePath()));
                    }
                    catch (ax.b3.j j8) {
                        j8.printStackTrace();
                    }
                }
                u.n0((Context)this.b.f0(), arrayList);
            }
        });
    }

    private long y3() {
        if (this.f0() instanceof MainActivity) {
            return ((MainActivity)this.f0()).B1();
        }
        return 0L;
    }

    @Override
    public boolean A(androidx.fragment.app.e e8, String string, boolean bl) {
        if (!this.L3()) {
            return false;
        }
        ax.u3.B.d0(this.s0(), e8, string, bl);
        return true;
    }

    public K A3() {
        if (this.j0 == null) {
            this.j0 = K.a(this.z3(), this.x3());
        }
        return this.j0;
    }

    protected void A4(int n8, int n9) {
        Context context;
        Context context2 = context = this.b();
        if (context == null) {
            context2 = this.o3();
        }
        ax.u3.z.D(context2, n8, n9);
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        if (this.e3(menuItem.getItemId())) {
            return true;
        }
        return super.B1(menuItem);
    }

    protected boolean B3() {
        return B0;
    }

    protected void B4(com.alphainventor.filemanager.file.o o8, List<com.alphainventor.filemanager.file.n> list) {
        Object object = a.e.a(list);
        ax.Q2.a.i().m("menu_folder", "properties").c("loc", this.z3().I()).c("type", (String)object).e();
        object = new z();
        ((z)object).x3(this.o3(), o8, list);
        this.A((androidx.fragment.app.e)object, "properties", false);
    }

    public abstract String C3();

    protected void C4(boolean bl, String string) {
        if (this.f0() == null) {
            return;
        }
        ((MainActivity)this.f0()).J2(bl, string);
    }

    @Override
    public void D1() {
        super.D1();
        this.l0 = System.currentTimeMillis();
    }

    protected View D3(boolean bl) {
        View view = bl && this.R0() != null ? this.R0().findViewById(2131362848) : null;
        View view2 = view;
        if (view == null) {
            view2 = this.f0().findViewById(0x1020002);
        }
        return view2;
    }

    protected void D4(Snackbar snackbar) {
        this.v0 = snackbar;
        snackbar.r(new Snackbar.a(this){
            final n a;
            {
                this.a = n8;
            }

            @Override
            public void c(Snackbar snackbar, int n8) {
                this.a.P4();
            }

            @Override
            public void d(Snackbar snackbar) {
                this.a.P4();
            }
        });
        snackbar.a0();
    }

    protected androidx.appcompat.view.a E3() {
        return this.h0;
    }

    protected void E4(int n8, int n9) {
        this.L4(n8, null, true, true, n9, 0, null, null);
    }

    protected d F3() {
        return null;
    }

    protected void F4(String string, int n8) {
        this.L4(0, string, true, true, n8, 0, null, null);
    }

    protected void G3(MenuInflater menuInflater, Menu menu, int n8) {
        menuInflater.inflate(n8, menu);
        this.p4(menu);
    }

    protected void G4(String string, int n8, int n9, View.OnClickListener onClickListener) {
        this.L4(0, string, true, true, n8, n9, onClickListener, null);
    }

    @Override
    public void H1() {
        super.H1();
        ax.Q2.a.i().q(this.z3().I());
        ax.u3.z.c(this.v3());
    }

    protected void H4(String string, int n8, View.OnClickListener onClickListener, Snackbar.a a8) {
        this.L4(0, string, true, true, n8, 0, onClickListener, a8);
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putParcelable("extrainfo", (Parcelable)this.p0);
    }

    public void I3() {
        Object object = this.f0;
        if (object != null) {
            object.invalidate();
        }
        if ((object = this.h0) != null) {
            ((androidx.appcompat.view.a)object).k();
        }
    }

    protected void I4(String string, int n8) {
        this.L4(0, string, false, true, n8, 0, null, null);
    }

    @Override
    public void J1() {
        super.J1();
        if (this.t0) {
            if (!this.Z0()) {
                this.i4();
                this.e4(true);
                this.N4();
            }
            this.t0 = false;
        }
        this.o0 = true;
        this.N4();
        this.l0 = System.currentTimeMillis();
    }

    protected void J3() {
        if (this.f0() == null) {
            return;
        }
        this.f0().invalidateOptionsMenu();
    }

    protected void J4(int n8, int n9) {
        this.L4(n8, null, false, false, n9, 0, null, null);
    }

    @Override
    public void K1() {
        super.K1();
        this.o0 = false;
        this.l0 = 0L;
    }

    public boolean K3() {
        return this.f0 != null || this.h0 != null;
        {
        }
    }

    protected void K4(String string, int n8) {
        this.L4(0, string, false, false, n8, 0, null, null);
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.u0 = true;
        this.v3().Y(this);
        if (Q.M0() && (view = this.f0().findViewById(2131362155)) != null) {
            view.setOnDragListener(new View.OnDragListener(){
                final View a;
                final n b;
                {
                    this.b = n8;
                    this.a = view;
                }

                public boolean onDrag(View view, DragEvent dragEvent) {
                    if (this.b.f0() == null) {
                        return false;
                    }
                    if (this.b.Z0()) {
                        return false;
                    }
                    if (dragEvent.getLocalState() != null) {
                        return false;
                    }
                    int n8 = dragEvent.getAction();
                    if (n8 == 1) {
                        view = dragEvent.getClipDescription();
                        if (view == null) {
                            return false;
                        }
                        if (view.getMimeTypeCount() > 0) {
                            this.a.setBackgroundResource(2131099740);
                            return true;
                        }
                        return false;
                    }
                    if (n8 == 5) {
                        this.a.setBackgroundResource(2131099739);
                        return true;
                    }
                    if (n8 == 6) {
                        this.a.setBackgroundResource(2131099740);
                        return true;
                    }
                    if (n8 == 4) {
                        this.a.setBackgroundColor(0);
                        return true;
                    }
                    if (n8 == 3) {
                        if (dragEvent.getClipDescription() == null) {
                            return false;
                        }
                        view = dragEvent.getClipData();
                        if (view == null) {
                            return false;
                        }
                        m.a(this.b.f0(), dragEvent);
                        ArrayList<g> arrayList = new ArrayList<g>();
                        for (n8 = 0; n8 < view.getItemCount(); ++n8) {
                            dragEvent = view.getItemAt(n8);
                            if (dragEvent.getUri() == null) continue;
                            g.a((Context)this.b.f0(), arrayList, dragEvent.getUri());
                        }
                        if (!arrayList.isEmpty()) {
                            ax.W2.c.q().n(arrayList);
                            if (this.b.K3()) {
                                this.b.h3();
                            }
                            this.b.e4(true);
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
    }

    public boolean L3() {
        return ax.u3.B.F(this, true);
    }

    protected void L4(int n8, String object, boolean bl, boolean bl2, int n9, int n10, View.OnClickListener onClickListener, Snackbar.a a8) {
        int n11 = 1;
        int n12 = 1;
        if (bl2 && this.L3()) {
            if (n9 == 1) {
                n9 = 0;
            } else if (n9 == 0) {
                n9 = -1;
            } else if (n9 == 2) {
                n9 = -2;
            } else {
                ax.u3.b.f();
                n9 = n12;
            }
            View view = this.D3(bl);
            object = object != null ? ax.u3.B.T(view, (CharSequence)object, n9) : ax.u3.B.S(view, n8, n9);
            if (n10 != 0 && onClickListener != null) {
                ((Snackbar)object).q0(n10, onClickListener);
            } else if (n10 == 0 && onClickListener != null) {
                ((Snackbar)object).r0("\u200b", onClickListener);
                view = ((BaseTransientBottomBar)object).H();
                TextView textView = (TextView)view.findViewById(2131362847);
                Drawable drawable = ax.Q.b.e(textView.getContext(), 2131231170);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                textView.setCompoundDrawables(drawable, null, null, null);
                view.setOnClickListener((View.OnClickListener)new ax.g3.c(this, onClickListener, (Snackbar)object){
                    final View.OnClickListener c;
                    final Snackbar d;
                    final n e;
                    {
                        this.e = n8;
                        this.c = onClickListener;
                        this.d = snackbar;
                    }

                    @Override
                    public void a(View view) {
                        this.c.onClick(view);
                        this.d.x();
                    }
                });
            }
            if (a8 != null) {
                ((BaseTransientBottomBar)object).r(a8);
            }
            this.D4((Snackbar)object);
            return;
        }
        if (n9 == 1) {
            n9 = n11;
        } else if (n9 == 0) {
            n9 = 0;
        } else if (n9 == 2) {
            n9 = n11;
        } else {
            ax.u3.b.f();
            n9 = n11;
        }
        Context context = this.b();
        onClickListener = context;
        if (context == null) {
            onClickListener = this.o3();
        }
        if (object != null) {
            Toast.makeText((Context)onClickListener, (CharSequence)object, (int)n9).show();
        } else {
            Toast.makeText((Context)onClickListener, (int)n8, (int)n9).show();
        }
        if (a8 != null) {
            a8.c(null, 0);
        }
    }

    protected boolean M3() {
        if (this.f0() == null) {
            return false;
        }
        return ax.u3.z.w((Context)this.f0());
    }

    public abstract void M4();

    public abstract boolean N3();

    protected void N4() {
        Object object = this.p3();
        if (object != b.b.e0 && object != b.b.q && this.W2() && !this.Z0() && (object = this.n3()) != null) {
            if (!ax.t3.a.i()) {
                if (object.getChildCount() > 0) {
                    this.g4();
                    return;
                }
            } else if (object.getVisibility() == 0) {
                switch (e.b[this.p3().ordinal()]) {
                    default: {
                        break;
                    }
                    case 10: {
                        if (System.currentTimeMillis() - this.y3() <= 1000L) break;
                        this.x4();
                        return;
                    }
                    case 9: {
                        if (System.currentTimeMillis() - this.y3() <= 30000L) break;
                        this.x4();
                        return;
                    }
                    case 8: {
                        this.x4();
                        return;
                    }
                    case 7: {
                        if (System.currentTimeMillis() - this.y3() <= 1800000L) break;
                        this.x4();
                        return;
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        if (System.currentTimeMillis() - this.y3() <= this.t3()) break;
                        this.x4();
                        return;
                    }
                    case 3: {
                        if (System.currentTimeMillis() - this.y3() <= 30000L) break;
                        this.x4();
                        return;
                    }
                    case 1: 
                    case 2: {
                        ax.u3.b.f();
                    }
                }
            }
        }
    }

    public boolean O3() {
        return this.k0;
    }

    protected boolean P3() {
        if (this.l0 == 0L) {
            return false;
        }
        return System.currentTimeMillis() - this.l0 > 4000L;
    }

    protected boolean Q3() {
        if (this.f0() == null) {
            return false;
        }
        return ((MainActivity)this.f0()).Y1();
    }

    protected boolean R3() {
        Snackbar snackbar = this.v0;
        if (snackbar == null) {
            return false;
        }
        return snackbar.L();
    }

    protected void S2(K k8, ax.Z2.s object, boolean bl) {
        Context context = this.o3();
        Intent intent = object != null && !TextUtils.isEmpty((CharSequence)((ax.Z2.s)object).d()) ? u.k(context, k8, ((ax.Z2.s)object).d()) : u.k(context, k8, null);
        Object object2 = bl ? ax.s3.b.e(context, k8.d(), null) : ax.s3.b.f(context, k8.d(), null);
        object2 = IconCompat.i(ax.u3.z.e(object2));
        object = object == null ? k8.f(context) : ((ax.Z2.s)object).f();
        y.c(context, new r.b(context, k8.k()).c(intent).b((IconCompat)object2).e((CharSequence)object).a(), null);
    }

    public boolean S3() {
        return this.o0;
    }

    protected void T2(com.alphainventor.filemanager.file.n n8, d d8) {
        y.c(this.o3(), this.c3(n8, d8), null);
    }

    protected boolean T3() {
        return this.u0;
    }

    protected void U2(ax.Z2.s object) {
        this.o3();
        K k8 = ((ax.Z2.s)object).e();
        String string = ((ax.Z2.s)object).f();
        object = !TextUtils.isEmpty((CharSequence)((ax.Z2.s)object).d()) ? ((ax.Z2.s)object).d() : k8.e();
        object = Bookmark.h(string, k8, (String)object, (String)object, true);
        if (ax.V2.b.a((Context)this.f0(), (Bookmark)object, false)) {
            this.E4(2131952316, 0);
        }
    }

    protected void U3(String string) {
        if (this.f0() == null) {
            return;
        }
        this.v3().q0(string);
    }

    public abstract boolean V2();

    protected boolean V3() {
        return this.R3();
    }

    protected boolean W2() {
        if (this.f0() == null) {
            return false;
        }
        if (!ax.t3.a.j()) {
            return false;
        }
        return this.v3().i0().y >= c.n().i();
    }

    protected void W3(o o8) {
        if (this.f0() == null) {
            return;
        }
        this.v3().L0();
        this.r4(this.r3());
        this.g0 = null;
    }

    public void X2(boolean bl) {
        ax.W2.c.q().l();
        this.d0 = System.currentTimeMillis();
        if (this.f0() == null) {
            return;
        }
        this.f0().supportInvalidateOptionsMenu();
        this.e4(true);
        String string = bl ? "manual" : "byapp";
        ax.Q2.a.i().m("menu_folder", "cancel_paste").c("loc", this.z3().I()).c("info", string).e();
    }

    protected void X3(o o8) {
        if (this.f0() == null) {
            return;
        }
        this.g0 = o8;
        this.v3().p0();
        this.r4(ax.Q.b.c((Context)this.f0(), 2131100794));
    }

    public void Y2() {
        f f8 = this.f0();
        if (f8 == null) {
            return;
        }
        ax.Q2.a.i().m("menu_folder", "cancel_select").c("loc", this.z3().I()).e();
        f8.setResult(0);
        f8.finish();
    }

    public boolean Y3(int n8, KeyEvent keyEvent) {
        return false;
    }

    protected boolean Z2(K k8, String string) {
        if (k8 != K.f && k8 != K.e) {
            return false;
        }
        if (k8 == K.e && string == null) {
            return false;
        }
        if (x.D1(this.o3(), k8, string)) {
            if (this.v3() != null) {
                this.v3().R(3, k8, string, false, true);
            }
            return true;
        }
        return false;
    }

    public abstract void Z3(String var1);

    public void a3() {
        this.f0 = null;
        this.h0 = null;
    }

    public void a4() {
        if (!ax.W2.c.q().v()) {
            if (System.currentTimeMillis() - this.d0 > 1000L && System.currentTimeMillis() - this.e0 > 1000L) {
                ax.Ha.b b8 = ax.Ha.c.h().d("PASTE");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(System.currentTimeMillis() - this.d0);
                stringBuilder.append(",");
                stringBuilder.append(System.currentTimeMillis() - this.e0);
                b8.g(stringBuilder.toString()).h();
            }
            this.e4(true);
            return;
        }
        this.e0 = System.currentTimeMillis();
        this.M4();
        ax.Q2.a.i().m("menu_folder", "paste").c("loc", this.z3().I()).e();
    }

    protected void b3(ActionMode actionMode, Menu menu, int n8) {
        this.f0 = actionMode;
        menu.clear();
        if (n8 != 0) {
            this.f0().getMenuInflater().inflate(n8, menu);
        }
        this.d4(false);
    }

    protected boolean b4(int n8) {
        return false;
    }

    public abstract void c4(boolean var1);

    protected void d3(androidx.appcompat.view.a a8, Menu menu, int n8) {
        this.h0 = a8;
        menu.clear();
        if (n8 != 0) {
            this.f0().getMenuInflater().inflate(n8, menu);
        }
        this.d4(false);
    }

    public void e4(boolean bl) {
        A a8;
        block12: {
            block11: {
                if (this.f0() == null) break block11;
                com.alphainventor.filemanager.activity.b b8 = this.v3();
                a8 = b8.h0();
                if (b8.d0() == this) break block12;
            }
            return;
        }
        if (this.v3().g0().g()) {
            a8.y(0);
            if (bl) {
                a8.A();
            }
            a8.F(false);
        } else if (ax.W2.c.q().v()) {
            if (this.K3()) {
                a8.y(8);
            } else {
                a8.y(0);
                if (bl) {
                    a8.A();
                }
                a8.E(ax.W2.c.q().u(), this.N3());
            }
        } else {
            a8.y(8);
        }
        this.d4(false);
    }

    protected void f3(com.alphainventor.filemanager.file.o o8, List<com.alphainventor.filemanager.file.n> list, p p8) {
        ax.W2.r r8 = ax.W2.r.l();
        r8.k(o8, list, false, new h.a(){
            final p a;
            final n b;
            {
                this.b = n8;
                this.a = p8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                int n8 = e.a[b8.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2 && n8 != 3) {
                        return;
                    }
                    this.b.y4(b8, string, string2, arrayList);
                    return;
                }
                this.a.a();
            }

            @Override
            public void b() {
            }
        });
        try {
            this.l(r8, true);
            return;
        }
        catch (ax.b3.c c8) {
            this.J4(2131951927, 1);
            return;
        }
    }

    void f4() {
        this.s4(this.s3());
        this.r4(this.r3());
        this.l4(this.q3());
    }

    protected int g3() {
        if (this.R0() == null) {
            return -1;
        }
        Menu menu = this.l3();
        if (menu == null) {
            return -1;
        }
        for (int i8 = menu.size() - 1; i8 >= 0; --i8) {
            int n8 = menu.getItem(i8).getItemId();
            View view = this.R0().getRootView().findViewById(n8);
            if (view == null || !view.isShown() || !view.isEnabled()) continue;
            return view.getId();
        }
        return -1;
    }

    protected void g4() {
        CoordinatorLayout coordinatorLayout = this.n3();
        if (coordinatorLayout != null) {
            View view = coordinatorLayout.getChildAt(0);
            if (view != null) {
                ax.S2.b.a(view, this.b());
            }
            coordinatorLayout.removeAllViews();
            coordinatorLayout.setBackgroundResource(0);
            this.m4(b.b.g0);
        }
        this.J3();
    }

    @Override
    public void h1(Bundle bundle) {
        super.h1(bundle);
        this.j3();
    }

    public void h3() {
        Object object = this.f0;
        if (object != null) {
            object.finish();
            this.d4(false);
        }
        if ((object = this.h0) != null) {
            ((androidx.appcompat.view.a)object).c();
            this.d4(false);
        }
    }

    protected void i3(String object) {
        if (this.f0() == null) {
            object = ax.Ha.c.h().f().c("FINISH SELF NULL ACTIVITY").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Detached:");
            stringBuilder.append(this.Y0());
            stringBuilder.append(",Added:");
            stringBuilder.append(this.X0());
            stringBuilder.append(",Removing:");
            stringBuilder.append(this.d1());
            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
            return;
        }
        this.v3().a0(this.z3(), this.x3(), (String)object);
    }

    public void i4() {
        if (this.f0() == null) {
            return;
        }
        A a8 = this.v3().h0();
        if (this.v3().g0().g()) {
            a8.u(2131361926, this.z0);
            a8.u(2131361947, this.z0);
            return;
        }
        a8.u(2131361926, this.y0);
        a8.u(2131361938, this.y0);
        a8.u(2131361946, this.y0);
    }

    public abstract void j3();

    public void j4() {
    }

    @Override
    public void k1(Context context) {
        this.k0 = false;
        this.i0 = context.getApplicationContext();
        super.k1(context);
        if (!this.Z0()) {
            this.f4();
        }
    }

    protected ActionMode k3() {
        return this.f0;
    }

    protected void k4(com.alphainventor.filemanager.file.o o8, List<com.alphainventor.filemanager.file.n> list) {
        String string;
        boolean bl;
        j j8;
        block7: {
            block6: {
                com.alphainventor.filemanager.activity.b b8;
                if (list.size() == 0 || (b8 = this.v3()) == null || (j8 = b8.g0()) == null) break block6;
                if (j8.d()) {
                    b8.setResult(-1, y.a((Context)b8, this.c3(list.get(0), this.F3())));
                    b8.finish();
                    j8.a();
                    return;
                }
                bl = j8.f();
                string = j8.b();
                if (!B.a(list)) break block7;
                try {
                    b8.setResult(-1, u.j((Context)b8, bl, string, list));
                    b8.finish();
                    j8.a();
                    return;
                }
                catch (RuntimeException runtimeException) {
                    this.J4(2131951927, 1);
                    b8.setResult(0);
                }
            }
            return;
        }
        this.f3(o8, list, new p(){
            final boolean a;
            final String b;
            final List c;
            final j d;
            final n e;
            {
                this.e = n8;
                this.a = bl;
                this.b = string;
                this.c = list;
                this.d = j8;
            }

            @Override
            public void a() {
                f f8 = this.e.f0();
                if (f8 == null) {
                    return;
                }
                f8.setResult(-1, u.j((Context)f8, this.a, this.b, this.c));
                f8.finish();
                this.d.a();
            }
        });
    }

    @Override
    public void l(h h8, boolean bl) throws ax.b3.c {
        f f8 = this.f0();
        if (f8 == null) {
            return;
        }
        CommandService.M(f8, this, h8, bl, h8 instanceof ax.W2.B ^ true);
    }

    protected void l4(int n8) {
        if (this.f0() != null) {
            this.v3().T(n8);
        }
    }

    public o m3() {
        return this.g0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle == null) return;
        if (bundle.isEmpty()) return;
        try {
            this.p0 = (ax.Z2.f)bundle.getParcelable("extrainfo");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void n4(ax.Z2.f f8) {
        this.p0 = f8;
    }

    Context o3() {
        return this.i0;
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
        this.s0 = bl;
        this.P4();
        this.O4(b8, bl);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d4(false);
    }

    protected int q3() {
        if (this.b() == null) {
            return 0;
        }
        return ax.Q.b.c(this.b(), 2131099681);
    }

    public void q4() {
        this.k0 = true;
    }

    protected int r3() {
        if (this.b() == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return ax.Q.b.c(this.b(), 2131100838);
        }
        return ax.Q.b.c(this.b(), 2131100837);
    }

    protected void r4(int n8) {
        if (this.f0() != null && Q.N1()) {
            v.s(this.f0().getWindow(), n8);
            if (Q.W1()) {
                this.v3().E0(n8);
            }
            if (Q.b1()) {
                ax.u3.z.B(this.f0(), n8);
            }
        }
    }

    @Override
    public void s1() {
        if (this.v3() != null && this.T3()) {
            this.v3().C0(this);
        }
        super.s1();
    }

    protected h.a s3() {
        if (this.M3()) {
            return h.a.q;
        }
        return h.a.c0;
    }

    protected void s4(h.a a8) {
        if (this.f0() != null) {
            this.v3().F0(a8);
        }
    }

    @Override
    public void t(int n8, int n9) {
        this.d4(false);
    }

    protected void t4(com.alphainventor.filemanager.file.o o8, List<com.alphainventor.filemanager.file.n> list) {
        String string = a.e.a(list);
        ax.Q2.a.i().m("menu_folder", "share").c("loc", this.z3().I()).c("type", string).e();
        if (list.size() > 1) {
            this.v4(o8, list);
            return;
        }
        if (list.size() == 1) {
            this.u4(o8, list.get(0));
        }
    }

    public ax.Z2.f u3() {
        return this.p0;
    }

    public com.alphainventor.filemanager.activity.b v3() {
        return (com.alphainventor.filemanager.activity.b)this.f0();
    }

    protected View w3() {
        if (this.R0() == null) {
            return null;
        }
        if (!this.x0) {
            this.w0 = this.R0().findViewById(2131362333);
            this.x0 = true;
        }
        return this.w0;
    }

    protected void w4(com.alphainventor.filemanager.file.o o8, k k8, a.c c8) {
        ax.a3.a a8 = new ax.a3.a();
        a8.v3(this.o3(), o8, k8);
        a8.u3(c8);
        this.A(a8, "apkproperties", true);
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (!bl) {
            this.i4();
            this.e4(true);
            this.f4();
            this.N4();
            this.j3();
        }
    }

    public abstract int x3();

    protected void x4() {
        block6: {
            block7: {
                block5: {
                    if (this.f0() == null) break block5;
                    if (!ax.t3.a.i()) break block6;
                    B0 = true;
                    int n8 = this.v3().i0().x;
                    if (this.v3().i0().y >= c.n().h()) break block7;
                    if (this.p3() == b.b.q) {
                        if (n8 >= c.n().h()) {
                            this.m4(b.b.h0);
                            return;
                        }
                        this.m4(b.b.e0);
                    }
                }
                return;
            }
            this.H3(new t(this){
                final n a;
                {
                    this.a = n8;
                }

                @Override
                public void a(boolean bl) {
                    if (bl) {
                        if (this.a.m0 != null && this.a.m0.m() != q.f.d0) {
                            A0.fine("request desktop ads skipped : already running");
                            return;
                        }
                        this.a.o4(System.currentTimeMillis());
                        this.a.m4(b.b.d0);
                        n.L2(this.a, new s(this.a));
                        this.a.m0.i(new Void[0]);
                        return;
                    }
                    this.a.m4(b.b.i0);
                }
            });
            return;
        }
        A0.severe("DESKTOP ADS NOT ENABLED");
    }

    void y4(h.b object, String string, String string2, ArrayList<String> arrayList) {
        block7: {
            block9: {
                block6: {
                    block8: {
                        if (TextUtils.isEmpty((CharSequence)string)) break block6;
                        int n8 = e.a[object.ordinal()];
                        if (n8 == 1) break block7;
                        if (n8 == 2) break block8;
                        if (n8 == 3) break block7;
                        break block6;
                    }
                    if (this.L3()) break block9;
                    Intent intent = new Intent(this.o3(), ResultActivity.class);
                    intent.putExtra(ResultActivity.a, (Serializable)object);
                    intent.putExtra(ResultActivity.b, string);
                    intent.putExtra(ResultActivity.c, string2);
                    if (arrayList.size() > 1000) {
                        object = new ArrayList<String>(arrayList.subList(0, 1000));
                        intent.putExtra(ResultActivity.d, (Serializable)object);
                    } else {
                        intent.putExtra(ResultActivity.d, arrayList);
                    }
                    intent.setFlags(0x10000000);
                    this.o3().startActivity(intent);
                    if (Q.M()) {
                        object = u.J(this.o3());
                        object = ax.s3.u.j(this.o3()).f((Intent)object, string, string2);
                        ax.s3.u.j(this.o3()).l(104, (Notification)object);
                    }
                }
                return;
            }
            this.A(ax.a3.k.i3(2131951894, string, string2, arrayList), "result", false);
            return;
        }
        this.F4(string, 1);
    }

    public abstract ax.Q2.f z3();

    protected void z4(CharSequence charSequence, List<String> list) {
        if (this.b() == null) {
            return;
        }
        this.D4(ax.u3.B.O(this.R0().findViewById(2131362848), charSequence, 0, 2131952279, true, new ax.g3.c(this){
            final n c;
            {
                this.c = n8;
            }

            @Override
            public void a(View view) {
                ax.Q2.a.i().m("menu_folder", "open_recycle_bin").c("by", "command_result_snackbar").c("loc", this.c.z3().I()).e();
                ((MainActivity)this.c.f0()).H2(this.c.A3(), "command_result_snackbar");
            }
        }));
    }

    public static final class o
    extends Enum<o> {
        public static final /* enum */ o c0;
        public static final /* enum */ o d0;
        public static final /* enum */ o e0;
        public static final /* enum */ o f0;
        private static final o[] g0;
        public static final /* enum */ o q;

        static {
            q = new o();
            c0 = new o();
            d0 = new o();
            e0 = new o();
            f0 = new o();
            g0 = o.d();
        }

        private static /* synthetic */ o[] d() {
            return new o[]{q, c0, d0, e0, f0};
        }

        public static o valueOf(String string) {
            return Enum.valueOf(o.class, string);
        }

        public static o[] values() {
            return (o[])g0.clone();
        }
    }

    public static interface p {
        public void a();
    }

    private class q
    extends ax.u3.q<Void, Void, Object> {
        private t h;
        private boolean i;
        private boolean j;
        private boolean k;
        final n l;

        q(n n8, t t8) {
            this.l = n8;
            super(q.e.e0);
            this.h = t8;
        }

        @Override
        protected void q(Object object) {
            if (this.l.f0() == null) {
                return;
            }
            if (this.k && !this.j) {
                ax.u3.z.q(this.l.f0());
                if (this.i) {
                    ax.u3.z.g((ax.n.c)this.l.f0());
                }
                this.h.a(true);
            } else {
                this.h.a(false);
            }
            n.P2(this.l, null);
        }

        protected Object w(Void ... object) {
            object = this.l.f0();
            if (object == null) {
                return null;
            }
            this.k = ax.u3.z.F((Context)object);
            this.j = ax.u3.z.t((Context)object);
            if (!ax.u3.z.y() && !this.j && this.k) {
                boolean bl;
                this.i = bl = ax.u3.z.a((Activity)object);
                if (bl && !Q.J()) {
                    ax.u3.z.A((Context)object);
                }
            }
            return null;
        }
    }

    static class r {
        private LinkedList<Integer> a = new LinkedList();
        private boolean b = false;
        private boolean c = true;

        r() {
        }

        public boolean a() {
            return this.c;
        }

        public boolean b() {
            if (this.a.size() < 2) {
                return false;
            }
            return Math.abs(this.a.get(0) - this.a.get(1)) > 1;
        }

        public void c() {
            this.a.clear();
            this.b = false;
        }

        public void d(AbsListView absListView) {
            this.b = true;
            this.c = false;
            int n8 = absListView.getCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (i8 == n8 - 1) {
                    this.c = true;
                }
                absListView.setItemChecked(i8, true);
            }
            this.b = false;
            this.c = true;
        }

        public void e(AbsListView absListView) {
            if (this.b()) {
                int n8;
                int n9 = this.a.get(0);
                if (n9 <= (n8 = this.a.get(1).intValue())) {
                    int n10 = n9;
                    n9 = n8;
                    n8 = n10;
                }
                this.b = true;
                this.c = false;
                if (n9 < absListView.getCount()) {
                    while (n8 < n9) {
                        if (n8 == n9 - 1) {
                            this.c = true;
                        }
                        absListView.setItemChecked(n8, true);
                        ++n8;
                    }
                }
                this.b = false;
                this.c = true;
                this.a.clear();
            }
        }

        public void f(int n8, boolean bl) {
            if (!this.b) {
                Integer n9 = n8;
                if (bl) {
                    this.a.addFirst(n9);
                    return;
                }
                if (this.a.contains(n9)) {
                    this.a.remove(n9);
                    return;
                }
                this.a.clear();
            }
        }
    }

    private class s
    extends ax.u3.q<Void, Void, Object> {
        final n h;

        s(n n8) {
            this.h = n8;
            super(q.e.d0);
        }

        @Override
        protected void q(Object object) {
            n.L2(this.h, null);
        }

        protected Object w(Void ... context) {
            context = this.h.b();
            if (context == null) {
                return null;
            }
            if (ax.u3.z.u(context)) {
                this.h.m4(b.b.i0);
                return null;
            }
            ax.S2.b.b(context);
            this.h.h4(false);
            return null;
        }
    }

    private static interface t {
        public void a(boolean var1);
    }
}

