/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import androidx.fragment.app.l;
import androidx.fragment.app.p;
import androidx.fragment.app.s;
import androidx.fragment.app.z;
import ax.B0.c;
import ax.G0.v;
import ax.c0.d0;

class r {
    private final l a;
    private final s b;
    private final Fragment c;
    private boolean d = false;
    private int e = -1;

    r(l l8, s s8, Fragment fragment) {
        this.a = l8;
        this.b = s8;
        this.c = fragment;
    }

    r(l object, s s8, Fragment fragment, p p8) {
        this.a = object;
        this.b = s8;
        this.c = fragment;
        fragment.c = null;
        fragment.d = null;
        fragment.s = 0;
        fragment.p = false;
        fragment.l = false;
        object = fragment.h;
        object = object != null ? ((Fragment)object).f : null;
        fragment.i = object;
        fragment.h = null;
        object = p8.n0;
        if (object != null) {
            fragment.b = object;
            return;
        }
        fragment.b = new Bundle();
    }

    r(l object, s object2, ClassLoader classLoader, i i8, p p8) {
        this.a = object;
        this.b = object2;
        this.c = object2 = p8.a(i8, classLoader);
        if (FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Instantiated fragment ");
            ((StringBuilder)object).append(object2);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
    }

    private boolean l(View view) {
        if (view == this.c.I) {
            return true;
        }
        for (view = view.getParent(); view != null; view = view.getParent()) {
            if (view != this.c.I) continue;
            return true;
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.c.h2(bundle);
        this.a.j(this.c, bundle, false);
        Bundle bundle2 = bundle;
        if (bundle.isEmpty()) {
            bundle2 = null;
        }
        if (this.c.I != null) {
            this.s();
        }
        bundle = bundle2;
        if (this.c.c != null) {
            bundle = bundle2;
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.c);
        }
        bundle2 = bundle;
        if (this.c.d != null) {
            bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBundle("android:view_registry_state", this.c.d);
        }
        bundle = bundle2;
        if (!this.c.K) {
            bundle = bundle2;
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.K);
        }
        return bundle;
    }

    void a() {
        Object object;
        if (FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("moveto ACTIVITY_CREATED: ");
            ((StringBuilder)object).append(this.c);
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        object = this.c;
        ((Fragment)object).N1(((Fragment)object).b);
        object = this.a;
        Fragment fragment = this.c;
        ((l)object).a(fragment, fragment.b, false);
    }

    void b() {
        int n8 = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.H.addView(fragment.I, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    void c() {
        Object object;
        if (FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("moveto ATTACHED: ");
            ((StringBuilder)object).append(this.c);
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        Fragment fragment = this.c;
        Object object2 = fragment.h;
        object = null;
        if (object2 != null) {
            object = this.b.n(((Fragment)object2).f);
            if (object == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Fragment ");
                ((StringBuilder)object).append(this.c);
                ((StringBuilder)object).append(" declared target fragment ");
                ((StringBuilder)object).append(this.c.h);
                ((StringBuilder)object).append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            object2 = this.c;
            ((Fragment)object2).i = ((Fragment)object2).h.f;
            ((Fragment)object2).h = null;
        } else {
            object2 = fragment.i;
            if (object2 != null && (object = this.b.n((String)object2)) == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Fragment ");
                ((StringBuilder)object).append(this.c);
                ((StringBuilder)object).append(" declared target fragment ");
                ((StringBuilder)object).append(this.c.i);
                ((StringBuilder)object).append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
        }
        if (object != null) {
            ((r)object).m();
        }
        object = this.c;
        ((Fragment)object).u = ((Fragment)object).t.w0();
        object = this.c;
        ((Fragment)object).w = ((Fragment)object).t.z0();
        this.a.g(this.c, false);
        this.c.O1();
        this.a.b(this.c, false);
    }

    int d() {
        Object object = this.c;
        if (object.t == null) {
            return object.a;
        }
        int n8 = this.e;
        int n9 = androidx.fragment.app.r$b.a[object.S.ordinal()];
        int n10 = n8;
        if (n9 != 1) {
            n10 = n9 != 2 ? (n9 != 3 ? (n9 != 4 ? Math.min(n8, -1) : Math.min(n8, 0)) : Math.min(n8, 1)) : Math.min(n8, 5);
        }
        object = this.c;
        n8 = n10;
        if (object.o) {
            if (object.p) {
                n10 = Math.max(this.e, 2);
                object = this.c.I;
                n8 = n10;
                if (object != null) {
                    n8 = n10;
                    if (object.getParent() == null) {
                        n8 = Math.min(n10, 2);
                    }
                }
            } else {
                n8 = this.e < 4 ? Math.min(n10, object.a) : Math.min(n10, 1);
            }
        }
        n10 = n8;
        if (!this.c.l) {
            n10 = Math.min(n8, 1);
        }
        Fragment fragment = this.c;
        object = fragment.H;
        object = object != null ? z.n((ViewGroup)object, fragment.A0()).l(this) : null;
        if (object == z.e.b.c0) {
            n8 = Math.min(n10, 6);
        } else if (object == z.e.b.d0) {
            n8 = Math.max(n10, 3);
        } else {
            object = this.c;
            n8 = n10;
            if (object.m) {
                n8 = object.a1() ? Math.min(n10, 1) : Math.min(n10, -1);
            }
        }
        object = this.c;
        n10 = n8;
        if (object.J) {
            n10 = n8;
            if (object.a < 5) {
                n10 = Math.min(n8, 4);
            }
        }
        if (FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("computeExpectedState() of ");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(" for ");
            ((StringBuilder)object).append(this.c);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        return n10;
    }

    void e() {
        Object object;
        if (FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("moveto CREATED: ");
            ((StringBuilder)object).append(this.c);
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        object = this.c;
        if (!((Fragment)object).Q) {
            this.a.h((Fragment)object, ((Fragment)object).b, false);
            object = this.c;
            ((Fragment)object).R1(((Fragment)object).b);
            object = this.a;
            Fragment fragment = this.c;
            ((l)object).c(fragment, fragment.b, false);
            return;
        }
        ((Fragment)object).r2(((Fragment)object).b);
        this.c.a = 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void f() {
        int n8;
        Object object;
        LayoutInflater layoutInflater;
        Object object2;
        block16: {
            block17: {
                block18: {
                    if (this.c.o) {
                        return;
                    }
                    if (FragmentManager.J0(3)) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("moveto CREATE_VIEW: ");
                        ((StringBuilder)object2).append(this.c);
                        Log.d((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                    }
                    object2 = this.c;
                    layoutInflater = ((Fragment)object2).X1(((Fragment)object2).b);
                    object = this.c;
                    object2 = ((Fragment)object).H;
                    if (object2 != null) break block16;
                    n8 = ((Fragment)object).y;
                    if (n8 == 0) break block17;
                    if (n8 == -1) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Cannot create fragment ");
                        ((StringBuilder)object2).append(this.c);
                        ((StringBuilder)object2).append(" for a container view with no id");
                        throw new IllegalArgumentException(((StringBuilder)object2).toString());
                    }
                    object = (ViewGroup)((Fragment)object).t.s0().c(this.c.y);
                    if (object != null) break block18;
                    object2 = this.c;
                    if (((Fragment)object2).q) {
                        object2 = object;
                        break block16;
                    } else {
                        try {
                            object2 = ((Fragment)object2).G0().getResourceName(this.c.y);
                        }
                        catch (Resources.NotFoundException notFoundException) {
                            object2 = "unknown";
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("No view found for id 0x");
                        ((StringBuilder)object).append(Integer.toHexString(this.c.y));
                        ((StringBuilder)object).append(" (");
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(") for fragment ");
                        ((StringBuilder)object).append(this.c);
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                }
                object2 = object;
                if (!(object instanceof FragmentContainerView)) {
                    ax.B0.c.j(this.c, (ViewGroup)object);
                    object2 = object;
                }
                break block16;
            }
            object2 = null;
        }
        object = this.c;
        ((Fragment)object).H = object2;
        ((Fragment)object).T1(layoutInflater, (ViewGroup)object2, ((Fragment)object).b);
        object = this.c.I;
        if (object != null) {
            object.setSaveFromParentEnabled(false);
            object = this.c;
            ((Fragment)object).I.setTag(ax.z0.b.a, object);
            if (object2 != null) {
                this.b();
            }
            object2 = this.c;
            if (((Fragment)object2).A) {
                ((Fragment)object2).I.setVisibility(8);
            }
            if (d0.Q(this.c.I)) {
                d0.i0(this.c.I);
            } else {
                object2 = this.c.I;
                object2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this, (View)object2){
                    final View a;
                    final r b;
                    {
                        this.b = r8;
                        this.a = view;
                    }

                    public void onViewAttachedToWindow(View view) {
                        this.a.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
                        d0.i0(this.a);
                    }

                    public void onViewDetachedFromWindow(View view) {
                    }
                });
            }
            this.c.k2();
            object = this.a;
            object2 = this.c;
            ((l)object).m((Fragment)object2, ((Fragment)object2).I, ((Fragment)object2).b, false);
            n8 = this.c.I.getVisibility();
            float f8 = this.c.I.getAlpha();
            this.c.B2(f8);
            object2 = this.c;
            if (((Fragment)object2).H != null && n8 == 0) {
                object = ((Fragment)object2).I.findFocus();
                if (object != null) {
                    this.c.w2((View)object);
                    if (FragmentManager.J0(2)) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("requestFocus: Saved focused view ");
                        ((StringBuilder)object2).append(object);
                        ((StringBuilder)object2).append(" for Fragment ");
                        ((StringBuilder)object2).append(this.c);
                        Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                    }
                }
                this.c.I.setAlpha(0.0f);
            }
        }
        this.c.a = 2;
    }

    void g() {
        j<?> j8;
        if (FragmentManager.J0(3)) {
            j8 = new StringBuilder();
            ((StringBuilder)((Object)j8)).append("movefrom CREATED: ");
            ((StringBuilder)((Object)j8)).append(this.c);
            Log.d((String)"FragmentManager", (String)((StringBuilder)((Object)j8)).toString());
        }
        j8 = this.c;
        boolean bl = ((Fragment)((Object)j8)).m;
        boolean bl2 = true;
        boolean bl3 = bl && !((Fragment)((Object)j8)).a1();
        if (bl3) {
            j8 = this.c;
            if (!((Fragment)((Object)j8)).n) {
                this.b.B(((Fragment)((Object)j8)).f, null);
            }
        }
        if (!bl3 && !this.b.p().r(this.c)) {
            j8 = this.c.i;
            if (j8 != null && (j8 = this.b.f((String)((Object)j8))) != null && ((Fragment)((Object)j8)).C) {
                this.c.h = j8;
            }
            this.c.a = 0;
            return;
        }
        j8 = this.c.u;
        if (j8 instanceof v) {
            bl2 = this.b.p().o();
        } else if (j8.f() instanceof Activity) {
            bl2 = true ^ ((Activity)j8.f()).isChangingConfigurations();
        }
        if (bl3 && !this.c.n || bl2) {
            this.b.p().g(this.c);
        }
        this.c.U1();
        this.a.d(this.c, false);
        for (r r8 : this.b.k()) {
            if (r8 == null) continue;
            Fragment fragment = r8.k();
            if (!this.c.f.equals(fragment.i)) continue;
            fragment.h = this.c;
            fragment.i = null;
        }
        j8 = this.c;
        String string = ((Fragment)((Object)j8)).i;
        if (string != null) {
            ((Fragment)((Object)j8)).h = this.b.f(string);
        }
        this.b.s(this);
    }

    void h() {
        Object object;
        if (FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("movefrom CREATE_VIEW: ");
            ((StringBuilder)object).append(this.c);
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        Fragment fragment = this.c;
        object = fragment.H;
        if (object != null && (fragment = fragment.I) != null) {
            object.removeView((View)fragment);
        }
        this.c.V1();
        this.a.n(this.c, false);
        object = this.c;
        ((Fragment)object).H = null;
        ((Fragment)object).I = null;
        ((Fragment)object).U = null;
        ((Fragment)object).V.n(null);
        this.c.p = false;
    }

    void i() {
        Object object;
        if (FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("movefrom ATTACHED: ");
            ((StringBuilder)object).append(this.c);
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        this.c.W1();
        this.a.e(this.c, false);
        object = this.c;
        ((Fragment)object).a = -1;
        ((Fragment)object).u = null;
        ((Fragment)object).w = null;
        ((Fragment)object).t = null;
        if (((Fragment)object).m && !((Fragment)object).a1() || this.b.p().r(this.c)) {
            if (FragmentManager.J0(3)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("initState called for fragment: ");
                ((StringBuilder)object).append(this.c);
                Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
            this.c.V0();
        }
    }

    void j() {
        Object object = this.c;
        if (((Fragment)object).o && ((Fragment)object).p && !((Fragment)object).r) {
            if (FragmentManager.J0(3)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("moveto CREATE_VIEW: ");
                ((StringBuilder)object).append(this.c);
                Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
            object = this.c;
            ((Fragment)object).T1(((Fragment)object).X1(((Fragment)object).b), null, this.c.b);
            object = this.c.I;
            if (object != null) {
                object.setSaveFromParentEnabled(false);
                object = this.c;
                ((Fragment)object).I.setTag(ax.z0.b.a, object);
                object = this.c;
                if (((Fragment)object).A) {
                    ((Fragment)object).I.setVisibility(8);
                }
                this.c.k2();
                l l8 = this.a;
                object = this.c;
                l8.m((Fragment)object, ((Fragment)object).I, ((Fragment)object).b, false);
                this.c.a = 2;
            }
        }
    }

    Fragment k() {
        return this.c;
    }

    /*
     * Exception decompiling
     */
    void m() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 151->183)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void n() {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("movefrom RESUMED: ");
            stringBuilder.append(this.c);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.c.c2();
        this.a.f(this.c, false);
    }

    void o(ClassLoader object) {
        Object object2 = this.c.b;
        if (object2 != null) {
            object2.setClassLoader((ClassLoader)object);
            object = this.c;
            ((Fragment)object).c = ((Fragment)object).b.getSparseParcelableArray("android:view_state");
            object = this.c;
            ((Fragment)object).d = ((Fragment)object).b.getBundle("android:view_registry_state");
            object = this.c;
            ((Fragment)object).i = ((Fragment)object).b.getString("android:target_state");
            object = this.c;
            if (((Fragment)object).i != null) {
                ((Fragment)object).j = ((Fragment)object).b.getInt("android:target_req_state", 0);
            }
            object = this.c;
            object2 = ((Fragment)object).e;
            if (object2 != null) {
                ((Fragment)object).K = (Boolean)object2;
                this.c.e = null;
            } else {
                ((Fragment)object).K = ((Fragment)object).b.getBoolean("android:user_visible_hint", true);
            }
            object = this.c;
            if (!((Fragment)object).K) {
                ((Fragment)object).J = true;
            }
        }
    }

    void p() {
        Object object;
        if (FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("moveto RESUMED: ");
            ((StringBuilder)object).append(this.c);
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        if ((object = this.c.r0()) != null && this.l((View)object)) {
            boolean bl = object.requestFocus();
            if (FragmentManager.J0(2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("requestFocus: Restoring focused view ");
                stringBuilder.append(object);
                stringBuilder.append(" ");
                object = bl ? "succeeded" : "failed";
                stringBuilder.append((String)object);
                stringBuilder.append(" on Fragment ");
                stringBuilder.append(this.c);
                stringBuilder.append(" resulting in focused view ");
                stringBuilder.append(this.c.I.findFocus());
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
        }
        this.c.w2(null);
        this.c.g2();
        this.a.i(this.c, false);
        object = this.c;
        ((Fragment)object).b = null;
        ((Fragment)object).c = null;
        ((Fragment)object).d = null;
    }

    void r() {
        p p8 = new p(this.c);
        Fragment fragment = this.c;
        if (fragment.a > -1 && p8.n0 == null) {
            fragment = this.q();
            p8.n0 = fragment;
            if (this.c.i != null) {
                if (fragment == null) {
                    p8.n0 = new Bundle();
                }
                p8.n0.putString("android:target_state", this.c.i);
                int n8 = this.c.j;
                if (n8 != 0) {
                    p8.n0.putInt("android:target_req_state", n8);
                }
            }
        } else {
            p8.n0 = fragment.b;
        }
        this.b.B(this.c.f, p8);
    }

    void s() {
        if (this.c.I != null) {
            StringBuilder stringBuilder;
            if (FragmentManager.J0(2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Saving view state for fragment ");
                stringBuilder.append(this.c);
                stringBuilder.append(" with view ");
                stringBuilder.append(this.c.I);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
            stringBuilder = new SparseArray();
            this.c.I.saveHierarchyState((SparseArray)stringBuilder);
            if (stringBuilder.size() > 0) {
                this.c.c = stringBuilder;
            }
            stringBuilder = new Bundle();
            this.c.U.e((Bundle)stringBuilder);
            if (!stringBuilder.isEmpty()) {
                this.c.d = stringBuilder;
            }
        }
    }

    void t(int n8) {
        this.e = n8;
    }

    void u() {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("moveto STARTED: ");
            stringBuilder.append(this.c);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.c.i2();
        this.a.k(this.c, false);
    }

    void v() {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("movefrom STARTED: ");
            stringBuilder.append(this.c);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.c.j2();
        this.a.l(this.c, false);
    }
}

