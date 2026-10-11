package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.C0641d;
import androidx.media3.ui.G;
import androidx.recyclerview.widget.RecyclerView;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.C0916z;
import ax.P0.H;
import ax.P0.I;
import ax.P0.N;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.a2.C1311B;
import ax.a2.C1312C;
import ax.a2.C1313D;
import ax.a2.C1315F;
import ax.a2.InterfaceC1316G;
import ax.r7.AbstractC2991z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.ui.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0641d extends FrameLayout {
    private static final float[] H0;
    private final ImageView A;
    private int A0;
    private final ImageView B;
    private long[] B0;
    private final ImageView C;
    private boolean[] C0;
    private final ImageView D;
    private long[] D0;
    private final ImageView E;
    private boolean[] E0;
    private final View F;
    private long F0;
    private final View G;
    private boolean G0;
    private final View H;
    private final TextView I;
    private final TextView J;
    private final G K;
    private final StringBuilder L;
    private final Formatter M;
    private final N.b N;
    private final N.c O;
    private final Runnable P;
    private final Drawable Q;
    private final Drawable R;
    private final Drawable S;
    private final Drawable T;
    private final Drawable U;
    private final String V;
    private final String W;
    private final w a;
    private final String a0;
    private final Resources b;
    private final Drawable b0;
    private final c c;
    private final Drawable c0;
    private final Class<?> d;
    private final float d0;
    private final Method e;
    private final float e0;
    private final Method f;
    private final String f0;
    private final Class<?> g;
    private final String g0;
    private final Method h;
    private final Drawable h0;
    private final Method i;
    private final Drawable i0;
    private final CopyOnWriteArrayList<m> j;
    private final String j0;
    private final RecyclerView k;
    private final String k0;
    private final h l;
    private final Drawable l0;
    private final e m;
    private final Drawable m0;
    private final j n;
    private final String n0;
    private final b o;
    private final String o0;
    private final InterfaceC1316G p;
    private ax.P0.H p0;
    private final PopupWindow q;
    private InterfaceC0029d q0;
    private final int r;
    private boolean r0;
    private final ImageView s;
    private boolean s0;
    private final ImageView t;
    private boolean t0;
    private final ImageView u;
    private boolean u0;
    private final View v;
    private boolean v0;
    private final View w;
    private boolean w0;
    private final TextView x;
    private int x0;
    private final TextView y;
    private boolean y0;
    private final ImageView z;
    private int z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$b */
    final class b extends l {
        private b() {
            super();
        }

        public static /* synthetic */ void T(b bVar, View view) {
            if (C0641d.this.p0 == null || !C0641d.this.p0.c0(29)) {
                return;
            }
            ((ax.P0.H) d0.i(C0641d.this.p0)).w(C0641d.this.p0.k0().I().G(1).U(1, false).F());
            C0641d.this.l.Q(1, C0641d.this.getResources().getString(C1313D.w));
            C0641d.this.q.dismiss();
        }

        private boolean U(T t) {
            for (int i = 0; i < this.d.size(); i++) {
                if (t.D.containsKey(this.d.get(i).a.a())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.C0641d.l
        public void Q(i iVar) {
            iVar.u.setText(C1313D.w);
            iVar.v.setVisibility(U(((ax.P0.H) C0968a.e(C0641d.this.p0)).k0()) ? 4 : 0);
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0641d.b.T(C0641d.b.this, view);
                }
            });
        }

        @Override // androidx.media3.ui.C0641d.l
        public void S(String str) {
            C0641d.this.l.Q(1, str);
        }

        public void V(List<k> list) {
            this.d = list;
            T k0 = ((ax.P0.H) C0968a.e(C0641d.this.p0)).k0();
            if (list.isEmpty()) {
                C0641d.this.l.Q(1, C0641d.this.getResources().getString(C1313D.x));
                return;
            }
            if (!U(k0)) {
                C0641d.this.l.Q(1, C0641d.this.getResources().getString(C1313D.w));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                k kVar = list.get(i);
                if (kVar.a()) {
                    C0641d.this.l.Q(1, kVar.c);
                    return;
                }
            }
        }
    }

    /* renamed from: androidx.media3.ui.d$c */
    private final class c implements H.d, G.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void D(int i) {
            I.r(this, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void E(boolean z) {
            I.k(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void F(int i) {
            I.v(this, i);
        }

        @Override // androidx.media3.ui.G.a
        public void G(G g, long j) {
            C0641d.this.w0 = true;
            if (C0641d.this.J != null) {
                C0641d.this.J.setText(d0.q0(C0641d.this.L, C0641d.this.M, j));
            }
            C0641d.this.a.R();
            if (C0641d.this.p0 == null || !C0641d.this.y0) {
                return;
            }
            C0641d c0641d = C0641d.this;
            if (c0641d.j0(c0641d.p0)) {
                try {
                    ((Method) C0968a.e(C0641d.this.e)).invoke(C0641d.this.p0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
            C0641d c0641d2 = C0641d.this;
            if (c0641d2.i0(c0641d2.p0)) {
                try {
                    ((Method) C0968a.e(C0641d.this.h)).invoke(C0641d.this.p0, Boolean.TRUE);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                C0987u.h("PlayerControlView", "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=" + ((ax.P0.H) C0968a.e(C0641d.this.p0)).getClass());
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void H(V v) {
            I.E(this, v);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void I(boolean z) {
            I.i(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void J(ax.P0.F f) {
            I.t(this, f);
        }

        @Override // androidx.media3.ui.G.a
        public void K(G g, long j) {
            if (C0641d.this.J != null) {
                C0641d.this.J.setText(d0.q0(C0641d.this.L, C0641d.this.M, j));
            }
            C0641d c0641d = C0641d.this;
            if (c0641d.m0(c0641d.p0)) {
                C0641d c0641d2 = C0641d.this;
                c0641d2.u0(c0641d2.p0, j);
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void L(float f) {
            I.G(this, f);
        }

        @Override // androidx.media3.ui.G.a
        public void M(G g, long j, boolean z) {
            C0641d.this.w0 = false;
            if (C0641d.this.p0 != null) {
                if (!z) {
                    C0641d c0641d = C0641d.this;
                    c0641d.u0(c0641d.p0, j);
                }
                C0641d c0641d2 = C0641d.this;
                if (c0641d2.j0(c0641d2.p0)) {
                    try {
                        ((Method) C0968a.e(C0641d.this.e)).invoke(C0641d.this.p0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    C0641d c0641d3 = C0641d.this;
                    if (c0641d3.i0(c0641d3.p0)) {
                        try {
                            ((Method) C0968a.e(C0641d.this.h)).invoke(C0641d.this.p0, Boolean.FALSE);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
            C0641d.this.a.S();
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void N(ax.P0.F f) {
            I.s(this, f);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void O(int i) {
            I.q(this, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void P(N n, int i) {
            I.C(this, n, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void S(boolean z) {
            I.z(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void U(T t) {
            I.D(this, t);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void W(H.b bVar) {
            I.c(this, bVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void Y(int i, boolean z) {
            I.g(this, i, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void Z(boolean z, int i) {
            I.u(this, z, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void a(a0 a0Var) {
            I.F(this, a0Var);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void a0(C0915y c0915y, int i) {
            I.l(this, c0915y, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void b0() {
            I.x(this);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void c(int i) {
            I.b(this, i);
        }

        @Override // ax.P0.H.d
        public void c0(ax.P0.H h, H.c cVar) {
            if (cVar.a(4, 5, 13)) {
                C0641d.this.D0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                C0641d.this.F0();
            }
            if (cVar.a(8, 13)) {
                C0641d.this.G0();
            }
            if (cVar.a(9, 13)) {
                C0641d.this.K0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                C0641d.this.C0();
            }
            if (cVar.a(11, 0, 13)) {
                C0641d.this.L0();
            }
            if (cVar.a(12, 13)) {
                C0641d.this.E0();
            }
            if (cVar.a(2, 13)) {
                C0641d.this.M0();
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void e(boolean z) {
            I.A(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void i0(boolean z, int i) {
            I.o(this, z, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j(ax.P0.G g) {
            I.p(this, g);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j0(ax.P0.A a) {
            I.m(this, a);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void k0(C0905n c0905n) {
            I.f(this, c0905n);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void o0(int i, int i2) {
            I.B(this, i, i2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ax.P0.H h = C0641d.this.p0;
            if (h == null) {
                return;
            }
            C0641d.this.a.S();
            if (C0641d.this.t == view) {
                if (h.c0(9)) {
                    h.m0();
                    return;
                }
                return;
            }
            if (C0641d.this.s == view) {
                if (h.c0(7)) {
                    h.Q();
                    return;
                }
                return;
            }
            if (C0641d.this.v == view) {
                if (h.i() == 4 || !h.c0(12)) {
                    return;
                }
                h.n0();
                return;
            }
            if (C0641d.this.w == view) {
                if (h.c0(11)) {
                    h.p0();
                    return;
                }
                return;
            }
            if (C0641d.this.u == view) {
                d0.B0(h, C0641d.this.u0);
                return;
            }
            if (C0641d.this.z == view) {
                if (h.c0(15)) {
                    h.j(ax.S0.H.a(h.o(), C0641d.this.A0));
                    return;
                }
                return;
            }
            if (C0641d.this.A == view) {
                if (h.c0(14)) {
                    h.z(!h.j0());
                    return;
                }
                return;
            }
            if (C0641d.this.F == view) {
                C0641d.this.a.R();
                C0641d c0641d = C0641d.this;
                c0641d.b0(c0641d.l, C0641d.this.F);
                return;
            }
            if (C0641d.this.G == view) {
                C0641d.this.a.R();
                C0641d c0641d2 = C0641d.this;
                c0641d2.b0(c0641d2.m, C0641d.this.G);
            } else if (C0641d.this.H == view) {
                C0641d.this.a.R();
                C0641d c0641d3 = C0641d.this;
                c0641d3.b0(c0641d3.o, C0641d.this.H);
            } else if (C0641d.this.C == view) {
                C0641d.this.a.R();
                C0641d c0641d4 = C0641d.this;
                c0641d4.b0(c0641d4.n, C0641d.this.C);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (C0641d.this.G0) {
                C0641d.this.a.S();
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void p0(H.e eVar, H.e eVar2, int i) {
            I.w(this, eVar, eVar2, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r(ax.P0.C c) {
            I.n(this, c);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r0(C0894c c0894c) {
            I.a(this, c0894c);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void s(ax.R0.c cVar) {
            I.d(this, cVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void t(List list) {
            I.e(this, list);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void t0(boolean z) {
            I.j(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void v(int i) {
            I.y(this, i);
        }
    }

    @Deprecated
    /* renamed from: androidx.media3.ui.d$d, reason: collision with other inner class name */
    public interface InterfaceC0029d {
        void G(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$e */
    final class e extends RecyclerView.h<i> {
        private final String[] d;
        private final float[] e;
        private int f;

        public e(String[] strArr, float[] fArr) {
            this.d = strArr;
            this.e = fArr;
        }

        public static /* synthetic */ void N(e eVar, int i, View view) {
            if (i != eVar.f) {
                C0641d.this.setPlaybackSpeed(eVar.e[i]);
            }
            C0641d.this.q.dismiss();
        }

        public String O() {
            return this.d[this.f];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public void B(i iVar, final int i) {
            String[] strArr = this.d;
            if (i < strArr.length) {
                iVar.u.setText(strArr[i]);
            }
            if (i == this.f) {
                iVar.a.setSelected(true);
                iVar.v.setVisibility(0);
            } else {
                iVar.a.setSelected(false);
                iVar.v.setVisibility(4);
            }
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0641d.e.N(C0641d.e.this, i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public i D(ViewGroup viewGroup, int i) {
            return new i(LayoutInflater.from(C0641d.this.getContext()).inflate(C1311B.f, viewGroup, false));
        }

        public void R(float f) {
            int i = 0;
            int i2 = 0;
            float f2 = Float.MAX_VALUE;
            while (true) {
                float[] fArr = this.e;
                if (i >= fArr.length) {
                    this.f = i2;
                    return;
                }
                float abs = Math.abs(f - fArr[i]);
                if (abs < f2) {
                    i2 = i;
                    f2 = abs;
                }
                i++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int l() {
            return this.d.length;
        }
    }

    /* renamed from: androidx.media3.ui.d$f */
    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$g */
    final class g extends RecyclerView.F {
        private final TextView u;
        private final TextView v;
        private final ImageView w;

        public g(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView) view.findViewById(ax.a2.z.v);
            this.v = (TextView) view.findViewById(ax.a2.z.O);
            this.w = (ImageView) view.findViewById(ax.a2.z.t);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0641d.this.r0(C0641d.g.this.k());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$h */
    class h extends RecyclerView.h<g> {
        private final String[] d;
        private final String[] e;
        private final Drawable[] f;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.d = strArr;
            this.e = new String[strArr.length];
            this.f = drawableArr;
        }

        private boolean R(int i) {
            if (C0641d.this.p0 == null) {
                return false;
            }
            if (i == 0) {
                return C0641d.this.p0.c0(13);
            }
            if (i != 1) {
                return true;
            }
            return C0641d.this.p0.c0(30) && C0641d.this.p0.c0(29);
        }

        public boolean N() {
            return R(1) || R(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public void B(g gVar, int i) {
            if (R(i)) {
                gVar.a.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.a.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.u.setText(this.d[i]);
            if (this.e[i] == null) {
                gVar.v.setVisibility(8);
            } else {
                gVar.v.setText(this.e[i]);
            }
            if (this.f[i] == null) {
                gVar.w.setVisibility(8);
            } else {
                gVar.w.setImageDrawable(this.f[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public g D(ViewGroup viewGroup, int i) {
            return C0641d.this.new g(LayoutInflater.from(C0641d.this.getContext()).inflate(C1311B.e, viewGroup, false));
        }

        public void Q(int i, String str) {
            this.e[i] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int l() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long m(int i) {
            return i;
        }
    }

    /* renamed from: androidx.media3.ui.d$i */
    private static class i extends RecyclerView.F {
        public final TextView u;
        public final View v;

        public i(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView) view.findViewById(ax.a2.z.R);
            this.v = view.findViewById(ax.a2.z.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$j */
    final class j extends l {
        private j() {
            super();
        }

        public static /* synthetic */ void T(j jVar, View view) {
            if (C0641d.this.p0 == null || !C0641d.this.p0.c0(29)) {
                return;
            }
            C0641d.this.p0.w(C0641d.this.p0.k0().I().G(3).M(-3).Q(null).S(0).F());
            C0641d.this.q.dismiss();
        }

        @Override // androidx.media3.ui.C0641d.l, androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public void B(i iVar, int i) {
            super.B(iVar, i);
            if (i > 0) {
                iVar.v.setVisibility(this.d.get(i + (-1)).a() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.C0641d.l
        public void Q(i iVar) {
            boolean z;
            iVar.u.setText(C1313D.x);
            int i = 0;
            while (true) {
                if (i >= this.d.size()) {
                    z = true;
                    break;
                } else {
                    if (this.d.get(i).a()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            iVar.v.setVisibility(z ? 0 : 4);
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0641d.j.T(C0641d.j.this, view);
                }
            });
        }

        @Override // androidx.media3.ui.C0641d.l
        public void S(String str) {
        }

        public void U(List<k> list) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (list.get(i).a()) {
                    z = true;
                    break;
                }
                i++;
            }
            if (C0641d.this.C != null) {
                ImageView imageView = C0641d.this.C;
                C0641d c0641d = C0641d.this;
                imageView.setImageDrawable(z ? c0641d.h0 : c0641d.i0);
                C0641d.this.C.setContentDescription(z ? C0641d.this.j0 : C0641d.this.k0);
            }
            this.d = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$k */
    static final class k {
        public final V.a a;
        public final int b;
        public final String c;

        public k(V v, int i, int i2, String str) {
            this.a = v.a().get(i);
            this.b = i2;
            this.c = str;
        }

        public boolean a() {
            return this.a.i(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.ui.d$l */
    abstract class l extends RecyclerView.h<i> {
        protected List<k> d = new ArrayList();

        protected l() {
        }

        public static /* synthetic */ void N(l lVar, ax.P0.H h, P p, k kVar, View view) {
            lVar.getClass();
            if (h.c0(29)) {
                h.w(h.k0().I().N(new Q(p, AbstractC2991z.A(Integer.valueOf(kVar.b)))).U(kVar.a.d(), false).F());
                lVar.S(kVar.c);
                C0641d.this.q.dismiss();
            }
        }

        protected void O() {
            this.d = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: P */
        public void B(i iVar, int i) {
            final ax.P0.H h = C0641d.this.p0;
            if (h == null) {
                return;
            }
            if (i == 0) {
                Q(iVar);
                return;
            }
            final k kVar = this.d.get(i - 1);
            final P a = kVar.a.a();
            boolean z = h.k0().D.get(a) != null && kVar.a();
            iVar.u.setText(kVar.c);
            iVar.v.setVisibility(z ? 0 : 4);
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0641d.l.N(C0641d.l.this, h, a, kVar, view);
                }
            });
        }

        protected abstract void Q(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public i D(ViewGroup viewGroup, int i) {
            return new i(LayoutInflater.from(C0641d.this.getContext()).inflate(C1311B.f, viewGroup, false));
        }

        protected abstract void S(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int l() {
            if (this.d.isEmpty()) {
                return 0;
            }
            return this.d.size() + 1;
        }
    }

    @Deprecated
    /* renamed from: androidx.media3.ui.d$m */
    public interface m {
        void K(int i);
    }

    static {
        C0916z.a("media3.ui");
        H0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:0|1|(7:3|4|5|6|7|8|9)(1:136)|10|11|12|13|14|15|(6:16|17|18|19|20|21)|22|23|24|25|26|(10:27|28|29|30|31|32|33|34|35|36)|37|(1:39)|40|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)(1:(1:105)(1:106))|52|(1:54)|55|(1:57)|58|(1:60)|61|(1:63)|64|(1:66)(2:100|(1:102)(1:103))|67|(1:69)|70|(1:72)(2:96|(1:98)(1:99))|73|(1:75)|76|(1:78)|79|(1:81)|82|(1:84)|85|(1:87)(1:95)|88|(1:90)(1:94)|91|92|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025e, code lost:
    
        r7 = null;
        r5 = null;
        r6 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0426  */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.media3.ui.G] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0641d(android.content.Context r35, android.util.AttributeSet r36, int r37, android.util.AttributeSet r38) {
        /*
            Method dump skipped, instructions count: 1622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C0641d.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    private static void A0(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (n0() && this.s0) {
            ax.P0.H h2 = this.p0;
            if (h2 != null) {
                z = (this.t0 && Z(h2, this.O)) ? h2.c0(10) : h2.c0(5);
                z3 = h2.c0(7);
                z4 = h2.c0(11);
                z5 = h2.c0(12);
                z2 = h2.c0(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (z4) {
                H0();
            }
            if (z5) {
                y0();
            }
            x0(z3, this.s);
            x0(z4, this.w);
            x0(z5, this.v);
            x0(z2, this.t);
            G g2 = this.K;
            if (g2 != null) {
                g2.setEnabled(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        if (n0() && this.s0 && this.u != null) {
            boolean w1 = d0.w1(this.p0, this.u0);
            Drawable drawable = w1 ? this.Q : this.R;
            int i2 = w1 ? C1313D.g : C1313D.f;
            this.u.setImageDrawable(drawable);
            this.u.setContentDescription(this.b.getString(i2));
            x0(d0.u1(this.p0), this.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        ax.P0.H h2 = this.p0;
        if (h2 == null) {
            return;
        }
        this.m.R(h2.h().a);
        this.l.Q(0, this.m.O());
        I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        long j2;
        long j3;
        if (n0() && this.s0) {
            ax.P0.H h2 = this.p0;
            if (h2 == null || !h2.c0(16)) {
                j2 = 0;
                j3 = 0;
            } else {
                j2 = this.F0 + h2.V();
                j3 = this.F0 + h2.l0();
            }
            TextView textView = this.J;
            if (textView != null && !this.w0) {
                textView.setText(d0.q0(this.L, this.M, j2));
            }
            G g2 = this.K;
            if (g2 != null) {
                g2.setPosition(j2);
                G g3 = this.K;
                if (m0(h2)) {
                    j3 = j2;
                }
                g3.setBufferedPosition(j3);
            }
            removeCallbacks(this.P);
            int i2 = h2 == null ? 1 : h2.i();
            if (h2 == null || !h2.n()) {
                if (i2 == 4 || i2 == 1) {
                    return;
                }
                postDelayed(this.P, 1000L);
                return;
            }
            G g4 = this.K;
            long min = Math.min(g4 != null ? g4.getPreferredUpdateDelay() : 1000L, 1000 - (j2 % 1000));
            float f2 = h2.h().a;
            postDelayed(this.P, d0.q(f2 > 0.0f ? (long) (min / f2) : 1000L, this.z0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0() {
        ImageView imageView;
        if (n0() && this.s0 && (imageView = this.z) != null) {
            if (this.A0 == 0) {
                x0(false, imageView);
                return;
            }
            ax.P0.H h2 = this.p0;
            if (h2 == null || !h2.c0(15)) {
                x0(false, this.z);
                this.z.setImageDrawable(this.S);
                this.z.setContentDescription(this.V);
                return;
            }
            x0(true, this.z);
            int o = h2.o();
            if (o == 0) {
                this.z.setImageDrawable(this.S);
                this.z.setContentDescription(this.V);
            } else if (o == 1) {
                this.z.setImageDrawable(this.T);
                this.z.setContentDescription(this.W);
            } else {
                if (o != 2) {
                    return;
                }
                this.z.setImageDrawable(this.U);
                this.z.setContentDescription(this.a0);
            }
        }
    }

    private void H0() {
        ax.P0.H h2 = this.p0;
        int t0 = (int) ((h2 != null ? h2.t0() : 5000L) / 1000);
        TextView textView = this.y;
        if (textView != null) {
            textView.setText(String.valueOf(t0));
        }
        View view = this.w;
        if (view != null) {
            view.setContentDescription(this.b.getQuantityString(C1312C.b, t0, Integer.valueOf(t0)));
        }
    }

    private void I0() {
        x0(this.l.N(), this.F);
    }

    private void J0() {
        this.k.measure(0, 0);
        this.q.setWidth(Math.min(this.k.getMeasuredWidth(), getWidth() - (this.r * 2)));
        this.q.setHeight(Math.min(getHeight() - (this.r * 2), this.k.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        ImageView imageView;
        if (n0() && this.s0 && (imageView = this.A) != null) {
            ax.P0.H h2 = this.p0;
            if (!this.a.A(imageView)) {
                x0(false, this.A);
                return;
            }
            if (h2 == null || !h2.c0(14)) {
                x0(false, this.A);
                this.A.setImageDrawable(this.c0);
                this.A.setContentDescription(this.g0);
            } else {
                x0(true, this.A);
                this.A.setImageDrawable(h2.j0() ? this.b0 : this.c0);
                this.A.setContentDescription(h2.j0() ? this.f0 : this.g0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
        long j2;
        int i2;
        N.c cVar;
        long j3;
        ax.P0.H h2 = this.p0;
        if (h2 == null) {
            return;
        }
        this.v0 = this.t0 && Z(h2, this.O);
        long j4 = 0;
        this.F0 = 0L;
        N h0 = h2.c0(17) ? h2.h0() : N.a;
        long j5 = -9223372036854775807L;
        if (h0.q()) {
            if (h2.c0(16)) {
                long C = h2.C();
                if (C != -9223372036854775807L) {
                    j2 = d0.a1(C);
                    i2 = 0;
                }
            }
            j2 = 0;
            i2 = 0;
        } else {
            int b0 = h2.b0();
            boolean z = this.v0;
            int i3 = z ? 0 : b0;
            int p = z ? h0.p() - 1 : b0;
            long j6 = 0;
            i2 = 0;
            while (true) {
                if (i3 > p) {
                    break;
                }
                if (i3 == b0) {
                    this.F0 = d0.E1(j6);
                }
                h0.n(i3, this.O);
                N.c cVar2 = this.O;
                long j7 = j4;
                if (cVar2.m == j5) {
                    C0968a.g(!this.v0);
                    break;
                }
                int i4 = cVar2.n;
                while (true) {
                    cVar = this.O;
                    if (i4 <= cVar.o) {
                        h0.f(i4, this.N);
                        int p2 = this.N.p();
                        int c2 = this.N.c();
                        while (p2 < c2) {
                            long f2 = this.N.f(p2);
                            if (f2 == Long.MIN_VALUE) {
                                j3 = j5;
                                long j8 = this.N.d;
                                if (j8 == j3) {
                                    p2++;
                                    j5 = j3;
                                } else {
                                    f2 = j8;
                                }
                            } else {
                                j3 = j5;
                            }
                            long o = f2 + this.N.o();
                            if (o >= j7) {
                                long[] jArr = this.B0;
                                if (i2 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.B0 = Arrays.copyOf(jArr, length);
                                    this.C0 = Arrays.copyOf(this.C0, length);
                                }
                                this.B0[i2] = d0.E1(j6 + o);
                                this.C0[i2] = this.N.q(p2);
                                i2++;
                            }
                            p2++;
                            j5 = j3;
                        }
                        i4++;
                    }
                }
                j6 += cVar.m;
                i3++;
                j4 = j7;
            }
            j2 = j6;
        }
        long E1 = d0.E1(j2);
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(d0.q0(this.L, this.M, E1));
        }
        G g2 = this.K;
        if (g2 != null) {
            g2.setDuration(E1);
            int length2 = this.D0.length;
            int i5 = i2 + length2;
            long[] jArr2 = this.B0;
            if (i5 > jArr2.length) {
                this.B0 = Arrays.copyOf(jArr2, i5);
                this.C0 = Arrays.copyOf(this.C0, i5);
            }
            System.arraycopy(this.D0, 0, this.B0, i2, length2);
            System.arraycopy(this.E0, 0, this.C0, i2, length2);
            this.K.b(this.B0, this.C0, i5);
        }
        F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0() {
        g0();
        x0(this.n.l() > 0, this.C);
        I0();
    }

    private static boolean Z(ax.P0.H h2, N.c cVar) {
        N h0;
        int p;
        if (!h2.c0(17) || (p = (h0 = h2.h0()).p()) <= 1 || p > 100) {
            return false;
        }
        for (int i2 = 0; i2 < p; i2++) {
            if (h0.n(i2, cVar).m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(RecyclerView.h<?> hVar, View view) {
        this.k.setAdapter(hVar);
        J0();
        this.G0 = false;
        this.q.dismiss();
        this.G0 = true;
        this.q.showAsDropDown(view, (getWidth() - this.q.getWidth()) - this.r, (-this.q.getHeight()) - this.r);
    }

    private AbstractC2991z<k> c0(V v, int i2) {
        AbstractC2991z.a aVar = new AbstractC2991z.a();
        AbstractC2991z<V.a> a2 = v.a();
        for (int i3 = 0; i3 < a2.size(); i3++) {
            V.a aVar2 = a2.get(i3);
            if (aVar2.d() == i2) {
                for (int i4 = 0; i4 < aVar2.a; i4++) {
                    if (aVar2.j(i4)) {
                        C0912v b2 = aVar2.b(i4);
                        if ((b2.e & 2) == 0) {
                            aVar.a(new k(v, i3, i4, this.p.a(b2)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int d0(TypedArray typedArray, int i2) {
        return typedArray.getInt(C1315F.L, i2);
    }

    private void g0() {
        this.n.O();
        this.o.O();
        ax.P0.H h2 = this.p0;
        if (h2 != null && h2.c0(30) && this.p0.c0(29)) {
            V X = this.p0.X();
            this.o.V(c0(X, 1));
            if (this.a.A(this.C)) {
                this.n.U(c0(X, 3));
            } else {
                this.n.U(AbstractC2991z.z());
            }
        }
    }

    private static void h0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i0(ax.P0.H h2) {
        Class<?> cls;
        return (h2 == null || (cls = this.g) == null || !cls.isAssignableFrom(h2.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0(ax.P0.H h2) {
        Class<?> cls;
        return (h2 == null || (cls = this.d) == null || !cls.isAssignableFrom(h2.getClass())) ? false : true;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean l0(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m0(ax.P0.H h2) {
        try {
            if (j0(h2) && ((Boolean) C0968a.e(((Method) C0968a.e(this.f)).invoke(h2, null))).booleanValue()) {
                return true;
            }
            if (i0(h2)) {
                return ((Boolean) C0968a.e(((Method) C0968a.e(this.i)).invoke(h2, null))).booleanValue();
            }
            return false;
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(View view) {
        B0(!this.r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i3;
        int i11 = i9 - i7;
        if (!(i4 - i2 == i8 - i6 && i10 == i11) && this.q.isShowing()) {
            J0();
            this.q.update(view, (getWidth() - this.q.getWidth()) - this.r, (-this.q.getHeight()) - this.r, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(int i2) {
        if (i2 == 0) {
            b0(this.m, (View) C0968a.e(this.F));
        } else if (i2 == 1) {
            b0(this.o, (View) C0968a.e(this.F));
        } else {
            this.q.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        ax.P0.H h2 = this.p0;
        if (h2 == null || !h2.c0(13)) {
            return;
        }
        ax.P0.H h3 = this.p0;
        h3.e(h3.h().b(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(ax.P0.H h2, long j2) {
        if (this.v0) {
            if (h2.c0(17) && h2.c0(10)) {
                N h0 = h2.h0();
                int p = h0.p();
                int i2 = 0;
                while (true) {
                    long d = h0.n(i2, this.O).d();
                    if (j2 < d) {
                        break;
                    }
                    if (i2 == p - 1) {
                        j2 = d;
                        break;
                    } else {
                        j2 -= d;
                        i2++;
                    }
                }
                h2.s(i2, j2);
            }
        } else if (h2.c0(5)) {
            h2.t(j2);
        }
        F0();
    }

    private void x0(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.d0 : this.e0);
    }

    private void y0() {
        ax.P0.H h2 = this.p0;
        int T = (int) ((h2 != null ? h2.T() : 15000L) / 1000);
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(String.valueOf(T));
        }
        View view = this.v;
        if (view != null) {
            view.setContentDescription(this.b.getQuantityString(C1312C.a, T, Integer.valueOf(T)));
        }
    }

    private void z0(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.l0);
            imageView.setContentDescription(this.n0);
        } else {
            imageView.setImageDrawable(this.m0);
            imageView.setContentDescription(this.o0);
        }
    }

    public void B0(boolean z) {
        if (this.r0 == z) {
            return;
        }
        this.r0 = z;
        z0(this.D, z);
        z0(this.E, z);
        InterfaceC0029d interfaceC0029d = this.q0;
        if (interfaceC0029d != null) {
            interfaceC0029d.G(z);
        }
    }

    @Deprecated
    public void Y(m mVar) {
        C0968a.e(mVar);
        this.j.add(mVar);
    }

    public boolean a0(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ax.P0.H h2 = this.p0;
        if (h2 == null || !l0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (h2.i() == 4 || !h2.c0(12)) {
                return true;
            }
            h2.n0();
            return true;
        }
        if (keyCode == 89 && h2.c0(11)) {
            h2.p0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            d0.B0(h2, this.u0);
            return true;
        }
        if (keyCode == 87) {
            if (!h2.c0(9)) {
                return true;
            }
            h2.m0();
            return true;
        }
        if (keyCode == 88) {
            if (!h2.c0(7)) {
                return true;
            }
            h2.Q();
            return true;
        }
        if (keyCode == 126) {
            d0.z0(h2);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        d0.y0(h2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e0() {
        this.a.C();
    }

    public void f0() {
        this.a.F();
    }

    public ax.P0.H getPlayer() {
        return this.p0;
    }

    public int getRepeatToggleModes() {
        return this.A0;
    }

    public boolean getShowShuffleButton() {
        return this.a.A(this.A);
    }

    public boolean getShowSubtitleButton() {
        return this.a.A(this.C);
    }

    public int getShowTimeoutMs() {
        return this.x0;
    }

    public boolean getShowVrButton() {
        return this.a.A(this.B);
    }

    public boolean k0() {
        return this.a.I();
    }

    public boolean n0() {
        return getVisibility() == 0;
    }

    void o0() {
        Iterator<m> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().K(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.K();
        this.s0 = true;
        if (k0()) {
            this.a.S();
        }
        w0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.L();
        this.s0 = false;
        removeCallbacks(this.P);
        this.a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.a.M(z, i2, i3, i4, i5);
    }

    @Deprecated
    public void s0(m mVar) {
        this.j.remove(mVar);
    }

    public void setAnimationEnabled(boolean z) {
        this.a.T(z);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0029d interfaceC0029d) {
        this.q0 = interfaceC0029d;
        A0(this.D, interfaceC0029d != null);
        A0(this.E, interfaceC0029d != null);
    }

    public void setPlayer(ax.P0.H h2) {
        C0968a.g(Looper.myLooper() == Looper.getMainLooper());
        C0968a.a(h2 == null || h2.i0() == Looper.getMainLooper());
        ax.P0.H h3 = this.p0;
        if (h3 == h2) {
            return;
        }
        if (h3 != null) {
            h3.q(this.c);
        }
        this.p0 = h2;
        if (h2 != null) {
            h2.N(this.c);
        }
        w0();
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i2) {
        this.A0 = i2;
        ax.P0.H h2 = this.p0;
        if (h2 != null && h2.c0(15)) {
            int o = this.p0.o();
            if (i2 == 0 && o != 0) {
                this.p0.j(0);
            } else if (i2 == 1 && o == 2) {
                this.p0.j(1);
            } else if (i2 == 2 && o == 1) {
                this.p0.j(2);
            }
        }
        this.a.U(this.z, i2 != 0);
        G0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.U(this.v, z);
        C0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.t0 = z;
        L0();
    }

    public void setShowNextButton(boolean z) {
        this.a.U(this.t, z);
        C0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.u0 = z;
        D0();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.U(this.s, z);
        C0();
    }

    public void setShowRewindButton(boolean z) {
        this.a.U(this.w, z);
        C0();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.U(this.A, z);
        K0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.U(this.C, z);
    }

    public void setShowTimeoutMs(int i2) {
        this.x0 = i2;
        if (k0()) {
            this.a.S();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.U(this.B, z);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.z0 = d0.p(i2, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.y0 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            x0(onClickListener != null, this.B);
        }
    }

    void t0() {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void v0() {
        this.a.X();
    }

    void w0() {
        D0();
        C0();
        G0();
        K0();
        M0();
        E0();
        L0();
    }
}
