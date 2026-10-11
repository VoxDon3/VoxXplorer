/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.G;
import androidx.media3.ui.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.P0.H;
import ax.P0.I;
import ax.P0.N;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P0.n;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.a2.A;
import ax.a2.B;
import ax.a2.C;
import ax.a2.D;
import ax.a2.E;
import ax.a2.F;
import ax.a2.u;
import ax.a2.x;
import ax.a2.y;
import ax.a2.z;
import ax.r7.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class d
extends FrameLayout {
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
    private final ax.a2.G p;
    private H p0;
    private final PopupWindow q;
    private d q0;
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

    static {
        ax.P0.z.a("media3.ui");
        H0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d(Context object, AttributeSet object2, int n8, AttributeSet object3) {
        Object object4;
        boolean bl;
        int n9;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int n22;
        int n23;
        int n24;
        int n25;
        Object object5;
        block41: {
            block42: {
                block40: {
                    int n26;
                    block44: {
                        int n27;
                        int n28;
                        block43: {
                            RuntimeException var1_4;
                            block45: {
                                boolean bl9;
                                object5 = Boolean.TYPE;
                                super((Context)object, (AttributeSet)object2, n8);
                                n26 = ax.a2.B.b;
                                n25 = ax.a2.x.g;
                                n24 = ax.a2.x.f;
                                n23 = ax.a2.x.e;
                                n22 = ax.a2.x.n;
                                n21 = ax.a2.x.h;
                                n20 = ax.a2.x.o;
                                n19 = ax.a2.x.d;
                                n28 = ax.a2.x.c;
                                n27 = ax.a2.x.j;
                                n18 = ax.a2.x.k;
                                n17 = ax.a2.x.i;
                                n16 = ax.a2.x.m;
                                n15 = ax.a2.x.l;
                                n14 = ax.a2.x.r;
                                n13 = ax.a2.x.q;
                                n12 = ax.a2.x.s;
                                this.u0 = true;
                                this.x0 = 5000;
                                this.A0 = 0;
                                this.z0 = 200;
                                if (object3 == null) break block43;
                                object2 = object.getTheme().obtainStyledAttributes((AttributeSet)object3, ax.a2.F.y, n8, 0);
                                n26 = object2.getResourceId(ax.a2.F.A, n26);
                                n25 = object2.getResourceId(ax.a2.F.G, n25);
                                n24 = object2.getResourceId(ax.a2.F.F, n24);
                                n23 = object2.getResourceId(ax.a2.F.E, n23);
                                n11 = object2.getResourceId(ax.a2.F.B, n22);
                                n22 = object2.getResourceId(ax.a2.F.H, n21);
                                n20 = object2.getResourceId(ax.a2.F.M, n20);
                                n19 = object2.getResourceId(ax.a2.F.D, n19);
                                n10 = object2.getResourceId(ax.a2.F.C, n28);
                                n21 = object2.getResourceId(ax.a2.F.J, n27);
                                n18 = object2.getResourceId(ax.a2.F.K, n18);
                                n28 = object2.getResourceId(ax.a2.F.I, n17);
                                n16 = object2.getResourceId(ax.a2.F.W, n16);
                                n15 = object2.getResourceId(ax.a2.F.V, n15);
                                n14 = object2.getResourceId(ax.a2.F.Y, n14);
                                n8 = object2.getResourceId(ax.a2.F.X, n13);
                                n27 = ax.a2.F.b0;
                                n17 = object2.getResourceId(n27, n12);
                                n12 = ax.a2.F.T;
                                try {
                                    this.x0 = object2.getInt(n12, this.x0);
                                    this.A0 = androidx.media3.ui.d.d0((TypedArray)object2, this.A0);
                                    bl8 = object2.getBoolean(ax.a2.F.Q, true);
                                    bl7 = object2.getBoolean(ax.a2.F.N, true);
                                    bl9 = object2.getBoolean(ax.a2.F.P, true);
                                    bl6 = object2.getBoolean(ax.a2.F.O, true);
                                    bl5 = object2.getBoolean(ax.a2.F.R, false);
                                    bl4 = object2.getBoolean(ax.a2.F.S, false);
                                    bl3 = object2.getBoolean(ax.a2.F.U, false);
                                    this.y0 = object2.getBoolean(ax.a2.F.a0, false);
                                    this.setTimeBarMinUpdateInterval(object2.getInt(ax.a2.F.Z, this.z0));
                                    bl2 = object2.getBoolean(ax.a2.F.z, true);
                                }
                                catch (Throwable throwable) {}
                                object2.recycle();
                                n12 = n11;
                                n27 = n22;
                                n11 = n21;
                                n22 = n17;
                                n9 = n27;
                                n21 = n12;
                                n13 = n8;
                                bl = bl5;
                                bl5 = bl6;
                                bl6 = bl9;
                                n17 = n28;
                                break block44;
                                break block45;
                                catch (Throwable throwable) {
                                    // empty catch block
                                }
                            }
                            object2.recycle();
                            throw var1_4;
                        }
                        n8 = n19;
                        n11 = n21;
                        bl3 = false;
                        bl4 = false;
                        bl = false;
                        bl5 = true;
                        bl6 = true;
                        bl8 = true;
                        bl7 = true;
                        bl2 = true;
                        n21 = n22;
                        n9 = n11;
                        n10 = n28;
                        n19 = n8;
                        n22 = n12;
                        n11 = n27;
                    }
                    LayoutInflater.from((Context)object).inflate(n26, (ViewGroup)this);
                    this.setDescendantFocusability(262144);
                    this.c = new c(this);
                    this.j = new CopyOnWriteArrayList();
                    this.N = new N.b();
                    this.O = new N.c();
                    this.L = object2 = new StringBuilder();
                    this.M = new Formatter((Appendable)object2, Locale.getDefault());
                    this.B0 = new long[0];
                    this.C0 = new boolean[0];
                    this.D0 = new long[0];
                    this.E0 = new boolean[0];
                    this.P = new ax.a2.g(this);
                    object2 = ExoPlayer.class.getMethod("setScrubbingModeEnabled", new Class[]{object5});
                    object4 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
                    break block40;
                    catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                        block46: {
                            object2 = null;
                            break block46;
                            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException2) {}
                        }
                        object4 = null;
                    }
                }
                this.d = ExoPlayer.class;
                this.e = object2;
                this.f = object4;
                object4 = Class.forName("androidx.media3.transformer.CompositionPlayer");
                object2 = ((Class)object4).getMethod("setScrubbingModeEnabled", new Class[]{object5});
                try {
                    object5 = ((Class)object4).getMethod("isScrubbingModeEnabled", null);
                    break block41;
                }
                catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                    break block42;
                }
                catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                    object2 = null;
                    break block42;
                }
                catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                    object2 = null;
                    object4 = null;
                }
            }
            object5 = null;
        }
        this.g = object4;
        this.h = object2;
        this.i = object5;
        this.I = (TextView)this.findViewById(ax.a2.z.m);
        this.J = (TextView)this.findViewById(ax.a2.z.E);
        object2 = (ImageView)this.findViewById(ax.a2.z.P);
        this.C = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this.c);
        }
        object2 = (ImageView)this.findViewById(ax.a2.z.s);
        this.D = object2;
        androidx.media3.ui.d.h0((View)object2, new ax.a2.h(this));
        object2 = (ImageView)this.findViewById(ax.a2.z.x);
        this.E = object2;
        androidx.media3.ui.d.h0((View)object2, new ax.a2.h(this));
        object2 = this.findViewById(ax.a2.z.L);
        this.F = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this.c);
        }
        object2 = this.findViewById(ax.a2.z.D);
        this.G = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this.c);
        }
        object2 = this.findViewById(ax.a2.z.c);
        this.H = object2;
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this.c);
        }
        n8 = ax.a2.z.G;
        object2 = (G)this.findViewById(n8);
        object4 = this.findViewById(ax.a2.z.H);
        if (object2 != null) {
            this.K = object2;
            object2 = this;
        } else if (object4 != null) {
            n12 = ax.a2.E.a;
            object2 = this;
            object5 = new androidx.media3.ui.b((Context)object, null, 0, (AttributeSet)object3, n12);
            object5.setId(n8);
            object5.setLayoutParams(object4.getLayoutParams());
            object3 = (ViewGroup)object4.getParent();
            n8 = object3.indexOfChild((View)object4);
            object3.removeView((View)object4);
            object3.addView((View)object5, n8);
            ((d)((Object)object2)).K = object5;
        } else {
            object2 = this;
            ((d)((Object)object2)).K = null;
        }
        object2 = this;
        object3 = ((d)((Object)object2)).K;
        if (object3 != null) {
            object3.a(((d)((Object)object2)).c);
        }
        object3 = object.getResources();
        ((d)((Object)object2)).b = object3;
        object4 = (ImageView)object2.findViewById(ax.a2.z.C);
        ((d)((Object)object2)).u = object4;
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)((d)((Object)object2)).c);
        }
        object4 = (ImageView)object2.findViewById(ax.a2.z.F);
        ((d)((Object)object2)).s = object4;
        if (object4 != null) {
            object4.setImageDrawable(ax.S0.d0.a0((Context)object, (Resources)object3, n9));
            object4.setOnClickListener((View.OnClickListener)((d)((Object)object2)).c);
        }
        object4 = (ImageView)object2.findViewById(ax.a2.z.y);
        ((d)((Object)object2)).t = object4;
        if (object4 != null) {
            object4.setImageDrawable(ax.S0.d0.a0((Context)object, (Resources)object3, n23));
            object4.setOnClickListener((View.OnClickListener)((d)((Object)object2)).c);
        }
        object4 = ax.S.h.g((Context)object, ax.a2.y.a);
        object5 = (ImageView)object2.findViewById(ax.a2.z.J);
        Object object6 = (TextView)object2.findViewById(ax.a2.z.K);
        if (object5 != null) {
            object5.setImageDrawable(ax.S0.d0.a0((Context)object, (Resources)object3, n20));
            ((d)((Object)object2)).w = object5;
            ((d)((Object)object2)).y = null;
        } else if (object6 != null) {
            object6.setTypeface((Typeface)object4);
            ((d)((Object)object2)).y = object6;
            ((d)((Object)object2)).w = object6;
        } else {
            ((d)((Object)object2)).y = null;
            ((d)((Object)object2)).w = null;
        }
        object5 = ((d)((Object)object2)).w;
        if (object5 != null) {
            object5.setOnClickListener((View.OnClickListener)((d)((Object)object2)).c);
        }
        object5 = (ImageView)object2.findViewById(ax.a2.z.q);
        object6 = (TextView)object2.findViewById(ax.a2.z.r);
        if (object5 != null) {
            object5.setImageDrawable(ax.S0.d0.a0((Context)object, (Resources)object3, n21));
            ((d)((Object)object2)).v = object5;
            ((d)((Object)object2)).x = null;
        } else if (object6 != null) {
            object6.setTypeface((Typeface)object4);
            ((d)((Object)object2)).x = object6;
            ((d)((Object)object2)).v = object6;
        } else {
            ((d)((Object)object2)).x = null;
            ((d)((Object)object2)).v = null;
        }
        object4 = ((d)((Object)object2)).v;
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)((d)((Object)object2)).c);
        }
        object4 = (ImageView)object2.findViewById(ax.a2.z.I);
        ((d)((Object)object2)).z = object4;
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)((d)((Object)object2)).c);
        }
        object4 = (ImageView)object2.findViewById(ax.a2.z.M);
        ((d)((Object)object2)).A = object4;
        if (object4 != null) {
            object4.setOnClickListener((View.OnClickListener)((d)((Object)object2)).c);
        }
        ((d)((Object)object2)).d0 = (float)object3.getInteger(ax.a2.A.b) / 100.0f;
        ((d)((Object)object2)).e0 = (float)object3.getInteger(ax.a2.A.a) / 100.0f;
        object4 = (ImageView)object2.findViewById(ax.a2.z.T);
        ((d)((Object)object2)).B = object4;
        if (object4 != null) {
            object4.setImageDrawable(ax.S0.d0.a0((Context)object, (Resources)object3, n22));
            super.x0(false, (View)object4);
        }
        ((d)((Object)object2)).a = object4 = new w((d)((Object)object2));
        ((w)object4).T(bl2);
        object6 = object3.getString(ax.a2.D.h);
        object4 = ax.S0.d0.a0((Context)object, (Resources)object3, ax.a2.x.p);
        object5 = object3.getString(ax.a2.D.y);
        Drawable drawable = ax.S0.d0.a0((Context)object, (Resources)object3, ax.a2.x.b);
        ((d)((Object)object2)).l = object5 = new h((d)((Object)object2), new String[]{object6, object5}, new Drawable[]{object4, drawable});
        ((d)((Object)object2)).r = object3.getDimensionPixelSize(ax.a2.w.a);
        ((d)((Object)object2)).k = object4 = (RecyclerView)LayoutInflater.from((Context)object).inflate(ax.a2.B.d, null);
        ((RecyclerView)object4).setAdapter((RecyclerView.h)object5);
        ((RecyclerView)object4).setLayoutManager(new LinearLayoutManager(object2.getContext()));
        object4 = new PopupWindow((View)object4, -2, -2, true);
        ((d)((Object)object2)).q = object4;
        if (Build.VERSION.SDK_INT < 23) {
            object4.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        }
        object4.setOnDismissListener((PopupWindow.OnDismissListener)((d)((Object)object2)).c);
        ((d)((Object)object2)).G0 = true;
        ((d)((Object)object2)).p = new ax.a2.f(object2.getResources());
        ((d)((Object)object2)).h0 = ax.S0.d0.a0((Context)object, (Resources)object3, n14);
        ((d)((Object)object2)).i0 = ax.S0.d0.a0((Context)object, (Resources)object3, n13);
        ((d)((Object)object2)).j0 = object3.getString(ax.a2.D.b);
        ((d)((Object)object2)).k0 = object3.getString(ax.a2.D.a);
        ((d)((Object)object2)).n = new j((d)((Object)object2));
        ((d)((Object)object2)).o = new b((d)((Object)object2));
        ((d)((Object)object2)).m = new e((d)((Object)object2), ((d)((Object)object2)).b.getStringArray(ax.a2.u.a), H0);
        ((d)((Object)object2)).Q = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n25);
        ((d)((Object)object2)).R = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n24);
        ((d)((Object)object2)).l0 = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n19);
        ((d)((Object)object2)).m0 = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n10);
        ((d)((Object)object2)).S = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n11);
        ((d)((Object)object2)).T = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n18);
        ((d)((Object)object2)).U = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n17);
        ((d)((Object)object2)).b0 = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n16);
        ((d)((Object)object2)).c0 = ax.S0.d0.a0((Context)object, ((d)((Object)object2)).b, n15);
        ((d)((Object)object2)).n0 = ((d)((Object)object2)).b.getString(ax.a2.D.d);
        ((d)((Object)object2)).o0 = ((d)((Object)object2)).b.getString(ax.a2.D.c);
        ((d)((Object)object2)).V = ((d)((Object)object2)).b.getString(ax.a2.D.j);
        ((d)((Object)object2)).W = ((d)((Object)object2)).b.getString(ax.a2.D.k);
        ((d)((Object)object2)).a0 = ((d)((Object)object2)).b.getString(ax.a2.D.i);
        ((d)((Object)object2)).f0 = ((d)((Object)object2)).b.getString(ax.a2.D.n);
        ((d)((Object)object2)).g0 = ((d)((Object)object2)).b.getString(ax.a2.D.m);
        object = (ViewGroup)object2.findViewById(ax.a2.z.e);
        ((d)((Object)object2)).a.U((View)object, true);
        ((d)((Object)object2)).a.U(((d)((Object)object2)).v, bl7);
        ((d)((Object)object2)).a.U(((d)((Object)object2)).w, bl8);
        ((d)((Object)object2)).a.U((View)((d)((Object)object2)).s, bl6);
        ((d)((Object)object2)).a.U((View)((d)((Object)object2)).t, bl5);
        ((d)((Object)object2)).a.U((View)((d)((Object)object2)).A, bl);
        ((d)((Object)object2)).a.U((View)((d)((Object)object2)).C, bl4);
        ((d)((Object)object2)).a.U((View)((d)((Object)object2)).B, bl3);
        object = ((d)((Object)object2)).a;
        object3 = ((d)((Object)object2)).z;
        bl8 = ((d)((Object)object2)).A0 != 0;
        ((w)object).U((View)object3, bl8);
        object2.addOnLayoutChangeListener((View.OnLayoutChangeListener)new ax.a2.i((d)((Object)object2)));
    }

    private static void A0(View view, boolean bl) {
        if (view == null) {
            return;
        }
        if (bl) {
            view.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }

    private void C0() {
        if (this.n0() && this.s0) {
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            Object object = this.p0;
            if (object != null) {
                bl5 = this.t0 && androidx.media3.ui.d.Z((H)object, this.O) ? object.c0(10) : object.c0(5);
                bl4 = object.c0(7);
                boolean bl6 = object.c0(11);
                bl3 = object.c0(12);
                bl2 = object.c0(9);
                bl = bl5;
                bl5 = bl6;
            } else {
                bl = false;
                bl2 = false;
                bl4 = false;
                bl5 = false;
                bl3 = false;
            }
            if (bl5) {
                this.H0();
            }
            if (bl3) {
                this.y0();
            }
            this.x0(bl4, (View)this.s);
            this.x0(bl5, this.w);
            this.x0(bl3, this.v);
            this.x0(bl2, (View)this.t);
            object = this.K;
            if (object != null) {
                object.setEnabled(bl);
            }
        }
    }

    private void D0() {
        if (this.n0() && this.s0 && this.u != null) {
            boolean bl = ax.S0.d0.w1(this.p0, this.u0);
            Drawable drawable = bl ? this.Q : this.R;
            int n8 = bl ? ax.a2.D.g : ax.a2.D.f;
            this.u.setImageDrawable(drawable);
            this.u.setContentDescription((CharSequence)this.b.getString(n8));
            this.x0(ax.S0.d0.u1(this.p0), (View)this.u);
        }
    }

    private void E0() {
        H h8 = this.p0;
        if (h8 == null) {
            return;
        }
        this.m.R(h8.h().a);
        this.l.Q(0, this.m.O());
        this.I0();
    }

    private void F0() {
        if (this.n0() && this.s0) {
            long l8;
            long l9;
            H h8 = this.p0;
            if (h8 != null && h8.c0(16)) {
                l9 = this.F0 + h8.V();
                l8 = this.F0 + h8.l0();
            } else {
                l9 = 0L;
                l8 = 0L;
            }
            Object object = this.J;
            if (object != null && !this.w0) {
                object.setText((CharSequence)ax.S0.d0.q0(this.L, this.M, l9));
            }
            if ((object = this.K) != null) {
                object.setPosition(l9);
                object = this.K;
                if (this.m0(h8)) {
                    l8 = l9;
                }
                object.setBufferedPosition(l8);
            }
            this.removeCallbacks(this.P);
            int n8 = h8 == null ? 1 : h8.i();
            long l10 = 1000L;
            if (h8 != null && h8.n()) {
                object = this.K;
                l8 = object != null ? object.getPreferredUpdateDelay() : 1000L;
                l8 = Math.min(l8, 1000L - l9 % 1000L);
                float f8 = h8.h().a;
                l9 = l10;
                if (f8 > 0.0f) {
                    l9 = (long)((float)l8 / f8);
                }
                l9 = ax.S0.d0.q(l9, this.z0, 1000L);
                this.postDelayed(this.P, l9);
                return;
            }
            if (n8 != 4 && n8 != 1) {
                this.postDelayed(this.P, 1000L);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void G0() {
        Object object;
        if (!this.n0() || !this.s0 || (object = this.z) == null) return;
        if (this.A0 == 0) {
            this.x0(false, (View)object);
            return;
        }
        object = this.p0;
        if (object != null && object.c0(15)) {
            this.x0(true, (View)this.z);
            int n8 = object.o();
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) return;
                    this.z.setImageDrawable(this.U);
                    this.z.setContentDescription((CharSequence)this.a0);
                    return;
                }
                this.z.setImageDrawable(this.T);
                this.z.setContentDescription((CharSequence)this.W);
                return;
            }
            this.z.setImageDrawable(this.S);
            this.z.setContentDescription((CharSequence)this.V);
            return;
        }
        this.x0(false, (View)this.z);
        this.z.setImageDrawable(this.S);
        this.z.setContentDescription((CharSequence)this.V);
    }

    private void H0() {
        H h8 = this.p0;
        long l8 = h8 != null ? h8.t0() : 5000L;
        int n8 = (int)(l8 / 1000L);
        h8 = this.y;
        if (h8 != null) {
            h8.setText(String.valueOf(n8));
        }
        if ((h8 = this.w) != null) {
            h8.setContentDescription(this.b.getQuantityString(ax.a2.C.b, n8, new Object[]{n8}));
        }
    }

    private void I0() {
        this.x0(this.l.N(), this.F);
    }

    private void J0() {
        this.k.measure(0, 0);
        int n8 = this.getWidth();
        int n9 = this.r;
        n8 = Math.min(this.k.getMeasuredWidth(), n8 - n9 * 2);
        this.q.setWidth(n8);
        n8 = Math.min(this.getHeight() - this.r * 2, this.k.getMeasuredHeight());
        this.q.setHeight(n8);
    }

    private void K0() {
        Object object;
        if (this.n0() && this.s0 && (object = this.A) != null) {
            H h8 = this.p0;
            if (!this.a.A((View)object)) {
                this.x0(false, (View)this.A);
                return;
            }
            if (h8 != null && h8.c0(14)) {
                this.x0(true, (View)this.A);
                ImageView imageView = this.A;
                object = h8.j0() ? this.b0 : this.c0;
                imageView.setImageDrawable((Drawable)object);
                imageView = this.A;
                object = h8.j0() ? this.f0 : this.g0;
                imageView.setContentDescription((CharSequence)object);
                return;
            }
            this.x0(false, (View)this.A);
            this.A.setImageDrawable(this.c0);
            this.A.setContentDescription((CharSequence)this.g0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void L0() {
        int n8;
        int n9;
        int n10;
        long l8;
        Object object = this.p0;
        if (object == null) {
            return;
        }
        boolean bl = this.t0 && androidx.media3.ui.d.Z((H)object, this.O);
        this.v0 = bl;
        long l9 = 0L;
        this.F0 = 0L;
        Object object2 = object.c0(17) ? object.h0() : ax.P0.N.a;
        bl = ((N)object2).q();
        long l10 = -9223372036854775807L;
        if (bl) {
            l8 = object.c0(16) && (l8 = object.C()) != -9223372036854775807L ? ax.S0.d0.a1(l8) : 0L;
            n10 = 0;
        } else {
            n9 = object.b0();
            int n11 = bl ? ((N)object2).p() - 1 : n9;
            l8 = 0L;
            n10 = 0;
            block0: for (n8 = (bl = this.v0) ? 0 : n9; n8 <= n11; l8 += ((N.c)object).m, ++n8) {
                if (n8 == n9) {
                    this.F0 = ax.S0.d0.E1(l8);
                }
                ((N)object2).n(n8, this.O);
                object = this.O;
                if (((N.c)object).m == l10) {
                    ax.S0.a.g(this.v0 ^ true);
                    break;
                }
                int n12 = ((N.c)object).n;
                int n13 = n10;
                n10 = n12;
                while (true) {
                    int n14;
                    object = this.O;
                    if (n10 <= ((N.c)object).o) {
                        ((N)object2).f(n10, this.N);
                        n14 = this.N.c();
                    } else {
                        n10 = n13;
                        continue block0;
                    }
                    for (n12 = this.N.p(); n12 < n14; ++n12) {
                        int n15;
                        long l11 = this.N.f(n12);
                        if (l11 == Long.MIN_VALUE && (l11 = this.N.d) == l10) {
                            n15 = n13;
                        } else {
                            n15 = n13;
                            if ((l11 += this.N.o()) >= l9) {
                                object = this.B0;
                                if (n13 == ((Object)object).length) {
                                    n15 = ((Object)object).length == 0 ? 1 : ((Object)object).length * 2;
                                    this.B0 = Arrays.copyOf((long[])object, n15);
                                    this.C0 = Arrays.copyOf(this.C0, n15);
                                }
                                this.B0[n13] = ax.S0.d0.E1(l8 + l11);
                                this.C0[n13] = this.N.q(n12);
                                n15 = n13 + 1;
                            }
                        }
                        n13 = n15;
                    }
                    ++n10;
                }
            }
        }
        l8 = ax.S0.d0.E1(l8);
        object2 = this.I;
        if (object2 != null) {
            object2.setText((CharSequence)ax.S0.d0.q0(this.L, this.M, l8));
        }
        if ((object2 = this.K) != null) {
            object2.setDuration(l8);
            n8 = this.D0.length;
            n9 = n10 + n8;
            object2 = this.B0;
            if (n9 > ((Object)object2).length) {
                this.B0 = Arrays.copyOf((long[])object2, n9);
                this.C0 = Arrays.copyOf(this.C0, n9);
            }
            System.arraycopy(this.D0, 0, this.B0, n10, n8);
            System.arraycopy(this.E0, 0, this.C0, n10, n8);
            this.K.b(this.B0, this.C0, n9);
        }
        this.F0();
    }

    private void M0() {
        this.g0();
        boolean bl = this.n.l() > 0;
        this.x0(bl, (View)this.C);
        this.I0();
    }

    private static boolean Z(H object, N.c c8) {
        if (!object.c0(17)) {
            return false;
        }
        int n8 = ((N)(object = object.h0())).p();
        if (n8 > 1 && n8 <= 100) {
            for (int i8 = 0; i8 < n8; ++i8) {
                if (((N)object).n((int)i8, (N.c)c8).m != -9223372036854775807L) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ void a(d d8, View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        d8.q0(view, n8, n9, n10, n11, n12, n13, n14, n15);
    }

    public static /* synthetic */ void b(d d8) {
        d8.F0();
    }

    private void b0(RecyclerView.h<?> h8, View view) {
        this.k.setAdapter(h8);
        this.J0();
        this.G0 = false;
        this.q.dismiss();
        this.G0 = true;
        int n8 = this.getWidth();
        int n9 = this.q.getWidth();
        int n10 = this.r;
        int n11 = -this.q.getHeight();
        int n12 = this.r;
        this.q.showAsDropDown(view, n8 - n9 - n10, n11 - n12);
    }

    public static /* synthetic */ void c(d d8, View view) {
        d8.p0(view);
    }

    private ax.r7.z<k> c0(V v8, int n8) {
        z.a<k> a8 = new z.a<k>();
        ax.r7.z<V.a> z8 = v8.a();
        for (int i8 = 0; i8 < z8.size(); ++i8) {
            V.a a9 = (V.a)z8.get(i8);
            if (a9.d() != n8) continue;
            for (int i9 = 0; i9 < a9.a; ++i9) {
                if (!a9.j(i9)) continue;
                v v9 = a9.b(i9);
                if ((v9.e & 2) != 0) continue;
                a8.h(new k(v8, i8, i9, this.p.a(v9)));
            }
        }
        return a8.k();
    }

    private static int d0(TypedArray typedArray, int n8) {
        return typedArray.getInt(ax.a2.F.L, n8);
    }

    static /* synthetic */ boolean e(d d8, boolean bl) {
        d8.w0 = bl;
        return bl;
    }

    private void g0() {
        this.n.O();
        this.o.O();
        Object object = this.p0;
        if (object != null && object.c0(30) && this.p0.c0(29)) {
            object = this.p0.X();
            this.o.V(this.c0((V)object, 1));
            if (this.a.A((View)this.C)) {
                this.n.U(this.c0((V)object, 3));
                return;
            }
            this.n.U(ax.r7.z.<k>z());
        }
    }

    private static void h0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private boolean i0(H h8) {
        Class<?> clazz;
        return h8 != null && (clazz = this.g) != null && clazz.isAssignableFrom(h8.getClass());
    }

    private boolean j0(H h8) {
        Class<?> clazz;
        return h8 != null && (clazz = this.d) != null && clazz.isAssignableFrom(h8.getClass());
    }

    @SuppressLint(value={"InlinedApi"})
    private static boolean l0(int n8) {
        return n8 == 90 || n8 == 89 || n8 == 85 || n8 == 79 || n8 == 126 || n8 == 127 || n8 == 87 || n8 == 88;
        {
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean m0(H h8) {
        Throwable var1_4;
        try {
            if (this.j0(h8)) {
                if ((Boolean)ax.S0.a.e(ax.S0.a.e(this.f).invoke(h8, null)) != false) return true;
            }
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException((Throwable)var1_4);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException((Throwable)var1_4);
        }
        if (!this.i0(h8)) return false;
        boolean bl = (Boolean)ax.S0.a.e(ax.S0.a.e(this.i).invoke(h8, null));
        if (!bl) return false;
        return true;
    }

    private void p0(View view) {
        this.B0(this.r0 ^ true);
    }

    private void q0(View view, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        if ((n10 - n8 != n14 - n12 || n11 - n9 != n15 - n13) && this.q.isShowing()) {
            this.J0();
            n8 = this.getWidth();
            n10 = this.q.getWidth();
            n9 = this.r;
            n11 = -this.q.getHeight();
            n12 = this.r;
            this.q.update(view, n8 - n10 - n9, n11 - n12, -1, -1);
        }
    }

    private void r0(int n8) {
        if (n8 == 0) {
            this.b0(this.m, ax.S0.a.e(this.F));
            return;
        }
        if (n8 == 1) {
            this.b0(this.o, ax.S0.a.e(this.F));
            return;
        }
        this.q.dismiss();
    }

    private void setPlaybackSpeed(float f8) {
        H h8 = this.p0;
        if (h8 != null && h8.c0(13)) {
            h8 = this.p0;
            h8.e(h8.h().b(f8));
        }
    }

    private void u0(H h8, long l8) {
        block3: {
            block4: {
                if (!this.v0) break block4;
                if (!h8.c0(17) || !h8.c0(10)) break block3;
                N n8 = h8.h0();
                int n9 = n8.p();
                int n10 = 0;
                while (true) {
                    long l9;
                    block6: {
                        block5: {
                            if (l8 < (l9 = n8.n(n10, this.O).d())) break block5;
                            if (n10 != n9 - 1) break block6;
                            l8 = l9;
                        }
                        h8.s(n10, l8);
                        break block3;
                    }
                    l8 -= l9;
                    ++n10;
                }
            }
            if (h8.c0(5)) {
                h8.t(l8);
            }
        }
        this.F0();
    }

    private void x0(boolean bl, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(bl);
        float f8 = bl ? this.d0 : this.e0;
        view.setAlpha(f8);
    }

    private void y0() {
        H h8 = this.p0;
        long l8 = h8 != null ? h8.T() : 15000L;
        int n8 = (int)(l8 / 1000L);
        h8 = this.x;
        if (h8 != null) {
            h8.setText(String.valueOf(n8));
        }
        if ((h8 = this.v) != null) {
            h8.setContentDescription(this.b.getQuantityString(ax.a2.C.a, n8, new Object[]{n8}));
        }
    }

    private void z0(ImageView imageView, boolean bl) {
        if (imageView == null) {
            return;
        }
        if (bl) {
            imageView.setImageDrawable(this.l0);
            imageView.setContentDescription((CharSequence)this.n0);
            return;
        }
        imageView.setImageDrawable(this.m0);
        imageView.setContentDescription((CharSequence)this.o0);
    }

    public void B0(boolean bl) {
        if (this.r0 != bl) {
            this.r0 = bl;
            this.z0(this.D, bl);
            this.z0(this.E, bl);
            d d8 = this.q0;
            if (d8 != null) {
                d8.G(bl);
            }
        }
    }

    @Deprecated
    public void Y(m m8) {
        ax.S0.a.e(m8);
        this.j.add(m8);
    }

    public boolean a0(KeyEvent keyEvent) {
        int n8 = keyEvent.getKeyCode();
        H h8 = this.p0;
        if (h8 != null && androidx.media3.ui.d.l0(n8)) {
            if (keyEvent.getAction() == 0) {
                if (n8 == 90) {
                    if (h8.i() != 4 && h8.c0(12)) {
                        h8.n0();
                    }
                } else if (n8 == 89 && h8.c0(11)) {
                    h8.p0();
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (n8 != 79 && n8 != 85) {
                        if (n8 != 87) {
                            if (n8 != 88) {
                                if (n8 != 126) {
                                    if (n8 == 127) {
                                        ax.S0.d0.y0(h8);
                                    }
                                } else {
                                    ax.S0.d0.z0(h8);
                                }
                            } else if (h8.c0(7)) {
                                h8.Q();
                            }
                        } else if (h8.c0(9)) {
                            h8.m0();
                        }
                    } else {
                        ax.S0.d0.B0(h8, this.u0);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        {
        }
    }

    public void e0() {
        this.a.C();
    }

    public void f0() {
        this.a.F();
    }

    public H getPlayer() {
        return this.p0;
    }

    public int getRepeatToggleModes() {
        return this.A0;
    }

    public boolean getShowShuffleButton() {
        return this.a.A((View)this.A);
    }

    public boolean getShowSubtitleButton() {
        return this.a.A((View)this.C);
    }

    public int getShowTimeoutMs() {
        return this.x0;
    }

    public boolean getShowVrButton() {
        return this.a.A((View)this.B);
    }

    public boolean k0() {
        return this.a.I();
    }

    public boolean n0() {
        return this.getVisibility() == 0;
    }

    void o0() {
        Iterator<m> iterator = this.j.iterator();
        while (iterator.hasNext()) {
            iterator.next().K(this.getVisibility());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.K();
        this.s0 = true;
        if (this.k0()) {
            this.a.S();
        }
        this.w0();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.L();
        this.s0 = false;
        this.removeCallbacks(this.P);
        this.a.R();
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        this.a.M(bl, n8, n9, n10, n11);
    }

    @Deprecated
    public void s0(m m8) {
        this.j.remove(m8);
    }

    public void setAnimationEnabled(boolean bl) {
        this.a.T(bl);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d d8) {
        this.q0 = d8;
        ImageView imageView = this.D;
        boolean bl = false;
        boolean bl2 = d8 != null;
        androidx.media3.ui.d.A0((View)imageView, bl2);
        imageView = this.E;
        bl2 = bl;
        if (d8 != null) {
            bl2 = true;
        }
        androidx.media3.ui.d.A0((View)imageView, bl2);
    }

    public void setPlayer(H h8) {
        boolean bl;
        Object object;
        block7: {
            block6: {
                object = Looper.myLooper();
                Looper looper = Looper.getMainLooper();
                boolean bl2 = false;
                bl = object == looper;
                ax.S0.a.g(bl);
                if (h8 == null) break block6;
                bl = bl2;
                if (h8.i0() != Looper.getMainLooper()) break block7;
            }
            bl = true;
        }
        ax.S0.a.a(bl);
        object = this.p0;
        if (object == h8) {
            return;
        }
        if (object != null) {
            object.q(this.c);
        }
        this.p0 = h8;
        if (h8 != null) {
            h8.N(this.c);
        }
        this.w0();
    }

    public void setProgressUpdateListener(f f8) {
    }

    public void setRepeatToggleModes(int n8) {
        this.A0 = n8;
        H h8 = this.p0;
        boolean bl = false;
        if (h8 != null && h8.c0(15)) {
            int n9 = this.p0.o();
            if (n8 == 0 && n9 != 0) {
                this.p0.j(0);
            } else if (n8 == 1 && n9 == 2) {
                this.p0.j(1);
            } else if (n8 == 2 && n9 == 1) {
                this.p0.j(2);
            }
        }
        w w8 = this.a;
        h8 = this.z;
        if (n8 != 0) {
            bl = true;
        }
        w8.U((View)h8, bl);
        this.G0();
    }

    public void setShowFastForwardButton(boolean bl) {
        this.a.U(this.v, bl);
        this.C0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean bl) {
        this.t0 = bl;
        this.L0();
    }

    public void setShowNextButton(boolean bl) {
        this.a.U((View)this.t, bl);
        this.C0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean bl) {
        this.u0 = bl;
        this.D0();
    }

    public void setShowPreviousButton(boolean bl) {
        this.a.U((View)this.s, bl);
        this.C0();
    }

    public void setShowRewindButton(boolean bl) {
        this.a.U(this.w, bl);
        this.C0();
    }

    public void setShowShuffleButton(boolean bl) {
        this.a.U((View)this.A, bl);
        this.K0();
    }

    public void setShowSubtitleButton(boolean bl) {
        this.a.U((View)this.C, bl);
    }

    public void setShowTimeoutMs(int n8) {
        this.x0 = n8;
        if (this.k0()) {
            this.a.S();
        }
    }

    public void setShowVrButton(boolean bl) {
        this.a.U((View)this.B, bl);
    }

    public void setTimeBarMinUpdateInterval(int n8) {
        this.z0 = ax.S0.d0.p(n8, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean bl) {
        this.y0 = bl;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            boolean bl = onClickListener != null;
            this.x0(bl, (View)this.B);
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
        this.D0();
        this.C0();
        this.G0();
        this.K0();
        this.M0();
        this.E0();
        this.L0();
    }

    private final class b
    extends l {
        final d f;

        private b(d d8) {
            this.f = d8;
            super(d8);
        }

        public static /* synthetic */ void T(b b8, View object) {
            if (b8.f.p0 != null && b8.f.p0.c0(29)) {
                object = b8.f.p0.k0();
                ax.S0.d0.i(b8.f.p0).w(((T)object).I().G(1).U(1, false).F());
                b8.f.l.Q(1, b8.f.getResources().getString(ax.a2.D.w));
                b8.f.q.dismiss();
            }
        }

        private boolean U(T t8) {
            for (int i8 = 0; i8 < this.d.size(); ++i8) {
                P p8 = this.d.get((int)i8).a.a();
                if (!t8.D.containsKey(p8)) continue;
                return true;
            }
            return false;
        }

        @Override
        public void Q(i i8) {
            i8.u.setText(ax.a2.D.w);
            boolean bl = this.U(ax.S0.a.e(this.f.p0).k0());
            View view = i8.v;
            int n8 = bl ? 4 : 0;
            view.setVisibility(n8);
            i8.a.setOnClickListener((View.OnClickListener)new androidx.media3.ui.e(this));
        }

        @Override
        public void S(String string) {
            this.f.l.Q(1, string);
        }

        public void V(List<k> list) {
            this.d = list;
            Object object = ax.S0.a.e(this.f.p0).k0();
            if (list.isEmpty()) {
                this.f.l.Q(1, this.f.getResources().getString(ax.a2.D.x));
                return;
            }
            if (!this.U((T)object)) {
                this.f.l.Q(1, this.f.getResources().getString(ax.a2.D.w));
                return;
            }
            for (int i8 = 0; i8 < list.size(); ++i8) {
                object = list.get(i8);
                if (!((k)object).a()) continue;
                this.f.l.Q(1, ((k)object).c);
                return;
            }
        }
    }

    private final class c
    implements H.d,
    G.a,
    View.OnClickListener,
    PopupWindow.OnDismissListener {
        final d a;

        private c(d d8) {
            this.a = d8;
        }

        @Override
        public /* synthetic */ void D(int n8) {
            ax.P0.I.r(this, n8);
        }

        @Override
        public /* synthetic */ void E(boolean bl) {
            ax.P0.I.k(this, bl);
        }

        @Override
        public /* synthetic */ void F(int n8) {
            ax.P0.I.v(this, n8);
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public void G(G object, long l8) {
            androidx.media3.ui.d.e(this.a, true);
            if (this.a.J != null) {
                this.a.J.setText((CharSequence)ax.S0.d0.q0(this.a.L, this.a.M, l8));
            }
            this.a.a.R();
            if (this.a.p0 != null && this.a.y0) {
                object = this.a;
                if (((d)((Object)object)).j0(((d)((Object)object)).p0)) {
                    Throwable var1_4;
                    try {
                        ax.S0.a.e(this.a.e).invoke(this.a.p0, Boolean.TRUE);
                        return;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        // empty catch block
                    }
                    throw new RuntimeException((Throwable)var1_4);
                }
                object = this.a;
                if (((d)((Object)object)).i0(((d)((Object)object)).p0)) {
                    Throwable var1_7;
                    try {
                        ax.S0.a.e(this.a.h).invoke(this.a.p0, Boolean.TRUE);
                        return;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        // empty catch block
                    }
                    throw new RuntimeException((Throwable)var1_7);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                ((StringBuilder)object).append(ax.S0.a.e(this.a.p0).getClass());
                ax.S0.u.h("PlayerControlView", ((StringBuilder)object).toString());
            }
        }

        @Override
        public /* synthetic */ void H(V v8) {
            ax.P0.I.E(this, v8);
        }

        @Override
        public /* synthetic */ void I(boolean bl) {
            ax.P0.I.i(this, bl);
        }

        @Override
        public /* synthetic */ void J(ax.P0.F f8) {
            ax.P0.I.t(this, f8);
        }

        @Override
        public void K(G object, long l8) {
            if (this.a.J != null) {
                this.a.J.setText((CharSequence)ax.S0.d0.q0(this.a.L, this.a.M, l8));
            }
            if (((d)((Object)(object = this.a))).m0(((d)((Object)object)).p0)) {
                object = this.a;
                ((d)((Object)object)).u0(((d)((Object)object)).p0, l8);
            }
        }

        @Override
        public /* synthetic */ void L(float f8) {
            ax.P0.I.G(this, f8);
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public void M(G object, long l8, boolean bl) {
            block10: {
                androidx.media3.ui.d.e(this.a, false);
                if (this.a.p0 != null) {
                    if (!bl) {
                        object = this.a;
                        ((d)((Object)object)).u0(((d)((Object)object)).p0, l8);
                    }
                    if (((d)((Object)(object = this.a))).j0(((d)((Object)object)).p0)) {
                        Throwable var1_4;
                        try {
                            ax.S0.a.e(this.a.e).invoke(this.a.p0, Boolean.FALSE);
                            break block10;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            // empty catch block
                        }
                        throw new RuntimeException((Throwable)var1_4);
                    }
                    object = this.a;
                    if (((d)((Object)object)).i0(((d)((Object)object)).p0)) {
                        Throwable var1_7;
                        try {
                            ax.S0.a.e(this.a.h).invoke(this.a.p0, Boolean.FALSE);
                            break block10;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            // empty catch block
                        }
                        throw new RuntimeException((Throwable)var1_7);
                    }
                }
            }
            this.a.a.S();
        }

        @Override
        public /* synthetic */ void N(ax.P0.F f8) {
            ax.P0.I.s(this, f8);
        }

        @Override
        public /* synthetic */ void O(int n8) {
            ax.P0.I.q(this, n8);
        }

        @Override
        public /* synthetic */ void P(N n8, int n9) {
            ax.P0.I.C(this, n8, n9);
        }

        @Override
        public /* synthetic */ void S(boolean bl) {
            ax.P0.I.z(this, bl);
        }

        @Override
        public /* synthetic */ void U(T t8) {
            ax.P0.I.D(this, t8);
        }

        @Override
        public /* synthetic */ void W(H.b b8) {
            ax.P0.I.c(this, b8);
        }

        @Override
        public /* synthetic */ void Y(int n8, boolean bl) {
            ax.P0.I.g(this, n8, bl);
        }

        @Override
        public /* synthetic */ void Z(boolean bl, int n8) {
            ax.P0.I.u(this, bl, n8);
        }

        @Override
        public /* synthetic */ void a(a0 a02) {
            ax.P0.I.F(this, a02);
        }

        @Override
        public /* synthetic */ void a0(ax.P0.y y8, int n8) {
            ax.P0.I.l(this, y8, n8);
        }

        @Override
        public /* synthetic */ void b0() {
            ax.P0.I.x(this);
        }

        @Override
        public /* synthetic */ void c(int n8) {
            ax.P0.I.b(this, n8);
        }

        @Override
        public void c0(H h8, H.c c8) {
            if (c8.a(4, 5, 13)) {
                this.a.D0();
            }
            if (c8.a(4, 5, 7, 13)) {
                this.a.F0();
            }
            if (c8.a(8, 13)) {
                this.a.G0();
            }
            if (c8.a(9, 13)) {
                this.a.K0();
            }
            if (c8.a(8, 9, 11, 0, 16, 17, 13)) {
                this.a.C0();
            }
            if (c8.a(11, 0, 13)) {
                this.a.L0();
            }
            if (c8.a(12, 13)) {
                this.a.E0();
            }
            if (c8.a(2, 13)) {
                this.a.M0();
            }
        }

        @Override
        public /* synthetic */ void e(boolean bl) {
            ax.P0.I.A(this, bl);
        }

        @Override
        public /* synthetic */ void i0(boolean bl, int n8) {
            ax.P0.I.o(this, bl, n8);
        }

        @Override
        public /* synthetic */ void j(ax.P0.G g8) {
            ax.P0.I.p(this, g8);
        }

        @Override
        public /* synthetic */ void j0(ax.P0.A a8) {
            ax.P0.I.m(this, a8);
        }

        @Override
        public /* synthetic */ void k0(n n8) {
            ax.P0.I.f(this, n8);
        }

        @Override
        public /* synthetic */ void o0(int n8, int n9) {
            ax.P0.I.B(this, n8, n9);
        }

        public void onClick(View object) {
            H h8 = this.a.p0;
            if (h8 != null) {
                this.a.a.S();
                if (this.a.t == object) {
                    if (h8.c0(9)) {
                        h8.m0();
                        return;
                    }
                } else if (this.a.s == object) {
                    if (h8.c0(7)) {
                        h8.Q();
                        return;
                    }
                } else if (this.a.v == object) {
                    if (h8.i() != 4 && h8.c0(12)) {
                        h8.n0();
                        return;
                    }
                } else if (this.a.w == object) {
                    if (h8.c0(11)) {
                        h8.p0();
                        return;
                    }
                } else {
                    if (this.a.u == object) {
                        ax.S0.d0.B0(h8, this.a.u0);
                        return;
                    }
                    if (this.a.z == object) {
                        if (h8.c0(15)) {
                            h8.j(ax.S0.H.a(h8.o(), this.a.A0));
                            return;
                        }
                    } else if (this.a.A == object) {
                        if (h8.c0(14)) {
                            h8.z(h8.j0() ^ true);
                            return;
                        }
                    } else {
                        if (this.a.F == object) {
                            this.a.a.R();
                            object = this.a;
                            ((d)((Object)object)).b0(((d)((Object)object)).l, this.a.F);
                            return;
                        }
                        if (this.a.G == object) {
                            this.a.a.R();
                            object = this.a;
                            ((d)((Object)object)).b0(((d)((Object)object)).m, this.a.G);
                            return;
                        }
                        if (this.a.H == object) {
                            this.a.a.R();
                            object = this.a;
                            ((d)((Object)object)).b0(((d)((Object)object)).o, this.a.H);
                            return;
                        }
                        if (this.a.C == object) {
                            this.a.a.R();
                            object = this.a;
                            ((d)((Object)object)).b0(((d)((Object)object)).n, (View)this.a.C);
                        }
                    }
                }
            }
        }

        public void onDismiss() {
            if (this.a.G0) {
                this.a.a.S();
            }
        }

        @Override
        public /* synthetic */ void p0(H.e e8, H.e e9, int n8) {
            ax.P0.I.w(this, e8, e9, n8);
        }

        @Override
        public /* synthetic */ void r(ax.P0.C c8) {
            ax.P0.I.n(this, c8);
        }

        @Override
        public /* synthetic */ void r0(ax.P0.c c8) {
            ax.P0.I.a(this, c8);
        }

        @Override
        public /* synthetic */ void s(ax.R0.c c8) {
            ax.P0.I.d(this, c8);
        }

        public /* synthetic */ void t(List list) {
            ax.P0.I.e(this, list);
        }

        @Override
        public /* synthetic */ void t0(boolean bl) {
            ax.P0.I.j(this, bl);
        }

        @Override
        public /* synthetic */ void v(int n8) {
            ax.P0.I.y(this, n8);
        }
    }

    @Deprecated
    public static interface d {
        public void G(boolean var1);
    }

    private final class e
    extends RecyclerView.h<i> {
        private final String[] d;
        private final float[] e;
        private int f;
        final d g;

        public e(d d8, String[] stringArray, float[] fArray) {
            this.g = d8;
            this.d = stringArray;
            this.e = fArray;
        }

        public static /* synthetic */ void N(e e8, int n8, View view) {
            if (n8 != e8.f) {
                e8.g.setPlaybackSpeed(e8.e[n8]);
            }
            e8.g.q.dismiss();
        }

        public String O() {
            return this.d[this.f];
        }

        public void P(i i8, int n8) {
            String[] stringArray = this.d;
            if (n8 < stringArray.length) {
                i8.u.setText((CharSequence)stringArray[n8]);
            }
            if (n8 == this.f) {
                i8.a.setSelected(true);
                i8.v.setVisibility(0);
            } else {
                i8.a.setSelected(false);
                i8.v.setVisibility(4);
            }
            i8.a.setOnClickListener((View.OnClickListener)new androidx.media3.ui.f(this, n8));
        }

        public i Q(ViewGroup viewGroup, int n8) {
            return new i(LayoutInflater.from((Context)this.g.getContext()).inflate(ax.a2.B.f, viewGroup, false));
        }

        public void R(float f8) {
            float[] fArray;
            int n8 = 0;
            float f9 = Float.MAX_VALUE;
            for (int i8 = 0; i8 < (fArray = this.e).length; ++i8) {
                float f10 = Math.abs(f8 - fArray[i8]);
                float f11 = f9;
                if (f10 < f9) {
                    n8 = i8;
                    f11 = f10;
                }
                f9 = f11;
            }
            this.f = n8;
        }

        @Override
        public int l() {
            return this.d.length;
        }
    }

    public static interface f {
    }

    private final class g
    extends RecyclerView.F {
        private final TextView u;
        private final TextView v;
        private final ImageView w;
        final d x;

        public g(d d8, View view) {
            this.x = d8;
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView)view.findViewById(ax.a2.z.v);
            this.v = (TextView)view.findViewById(ax.a2.z.O);
            this.w = (ImageView)view.findViewById(ax.a2.z.t);
            view.setOnClickListener((View.OnClickListener)new androidx.media3.ui.g(this));
        }

        public static /* synthetic */ void N(g g8, View view) {
            g8.x.r0(g8.k());
        }
    }

    private class h
    extends RecyclerView.h<g> {
        private final String[] d;
        private final String[] e;
        private final Drawable[] f;
        final d g;

        public h(d d8, String[] stringArray, Drawable[] drawableArray) {
            this.g = d8;
            this.d = stringArray;
            this.e = new String[stringArray.length];
            this.f = drawableArray;
        }

        private boolean R(int n8) {
            if (this.g.p0 == null) {
                return false;
            }
            if (n8 != 0) {
                if (n8 != 1) {
                    return true;
                }
                return this.g.p0.c0(30) && this.g.p0.c0(29);
            }
            return this.g.p0.c0(13);
        }

        public boolean N() {
            return this.R(1) || this.R(0);
            {
            }
        }

        public void O(g g8, int n8) {
            if (this.R(n8)) {
                g8.a.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.q(-1, -2));
            } else {
                g8.a.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.q(0, 0));
            }
            g8.u.setText((CharSequence)this.d[n8]);
            if (this.e[n8] == null) {
                g8.v.setVisibility(8);
            } else {
                g8.v.setText((CharSequence)this.e[n8]);
            }
            if (this.f[n8] == null) {
                g8.w.setVisibility(8);
                return;
            }
            g8.w.setImageDrawable(this.f[n8]);
        }

        public g P(ViewGroup viewGroup, int n8) {
            viewGroup = LayoutInflater.from((Context)this.g.getContext()).inflate(ax.a2.B.e, viewGroup, false);
            return new g(this.g, (View)viewGroup);
        }

        public void Q(int n8, String string) {
            this.e[n8] = string;
        }

        @Override
        public int l() {
            return this.d.length;
        }

        @Override
        public long m(int n8) {
            return n8;
        }
    }

    private static class i
    extends RecyclerView.F {
        public final TextView u;
        public final View v;

        public i(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView)view.findViewById(ax.a2.z.R);
            this.v = view.findViewById(ax.a2.z.h);
        }
    }

    private final class j
    extends l {
        final d f;

        private j(d d8) {
            this.f = d8;
            super(d8);
        }

        public static /* synthetic */ void T(j j8, View object) {
            if (j8.f.p0 != null && j8.f.p0.c0(29)) {
                object = j8.f.p0.k0();
                j8.f.p0.w(((T)object).I().G(3).M(-3).Q(null).S(0).F());
                j8.f.q.dismiss();
            }
        }

        @Override
        public void P(i i8, int n8) {
            super.P(i8, n8);
            if (n8 > 0) {
                k k8 = this.d.get(n8 - 1);
                i8 = i8.v;
                n8 = k8.a() ? 0 : 4;
                i8.setVisibility(n8);
            }
        }

        @Override
        public void Q(i i8) {
            int n8;
            int n9;
            block1: {
                i8.u.setText(ax.a2.D.x);
                n9 = 0;
                for (n8 = 0; n8 < this.d.size(); ++n8) {
                    if (!this.d.get(n8).a()) continue;
                    n8 = 0;
                    break block1;
                }
                n8 = 1;
            }
            View view = i8.v;
            n8 = n8 != 0 ? n9 : 4;
            view.setVisibility(n8);
            i8.a.setOnClickListener((View.OnClickListener)new androidx.media3.ui.h(this));
        }

        @Override
        public void S(String string) {
        }

        public void U(List<k> list) {
            boolean bl;
            boolean bl2 = false;
            int n8 = 0;
            while (true) {
                bl = bl2;
                if (n8 >= list.size()) break;
                if (list.get(n8).a()) {
                    bl = true;
                    break;
                }
                ++n8;
            }
            if (this.f.C != null) {
                ImageView imageView = this.f.C;
                Object object = this.f;
                object = bl ? ((d)object).h0 : ((d)object).i0;
                imageView.setImageDrawable((Drawable)object);
                imageView = this.f.C;
                object = bl ? this.f.j0 : this.f.k0;
                imageView.setContentDescription((CharSequence)object);
            }
            this.d = list;
        }
    }

    private static final class k {
        public final V.a a;
        public final int b;
        public final String c;

        public k(V v8, int n8, int n9, String string) {
            this.a = (V.a)v8.a().get(n8);
            this.b = n9;
            this.c = string;
        }

        public boolean a() {
            return this.a.i(this.b);
        }
    }

    private abstract class l
    extends RecyclerView.h<i> {
        protected List<k> d;
        final d e;

        protected l(d d8) {
            this.e = d8;
            this.d = new ArrayList<k>();
        }

        public static /* synthetic */ void N(l l8, H h8, P p8, k k8, View view) {
            l8.getClass();
            if (!h8.c0(29)) {
                return;
            }
            h8.w(h8.k0().I().N(new Q(p8, ax.r7.z.A(k8.b))).U(k8.a.d(), false).F());
            l8.S(k8.c);
            l8.e.q.dismiss();
        }

        protected void O() {
            this.d = Collections.EMPTY_LIST;
        }

        public void P(i i8, int n8) {
            H h8 = this.e.p0;
            if (h8 == null) {
                return;
            }
            if (n8 == 0) {
                this.Q(i8);
                return;
            }
            Object object = this.d;
            int n9 = 1;
            object = object.get(n8 - 1);
            P p8 = ((k)object).a.a();
            Q q8 = h8.k0().D.get(p8);
            int n10 = 0;
            n8 = q8 != null && ((k)object).a() ? n9 : 0;
            i8.u.setText((CharSequence)((k)object).c);
            q8 = i8.v;
            n8 = n8 != 0 ? n10 : 4;
            q8.setVisibility(n8);
            i8.a.setOnClickListener((View.OnClickListener)new androidx.media3.ui.i(this, h8, p8, (k)object));
        }

        protected abstract void Q(i var1);

        public i R(ViewGroup viewGroup, int n8) {
            return new i(LayoutInflater.from((Context)this.e.getContext()).inflate(ax.a2.B.f, viewGroup, false));
        }

        protected abstract void S(String var1);

        @Override
        public int l() {
            if (this.d.isEmpty()) {
                return 0;
            }
            return this.d.size() + 1;
        }
    }

    @Deprecated
    public static interface m {
        public void K(int var1);
    }
}

