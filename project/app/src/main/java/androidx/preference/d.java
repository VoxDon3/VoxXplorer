/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.a;
import androidx.preference.g;
import androidx.preference.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.b2.b;
import ax.b2.i;
import ax.b2.k;
import ax.b2.l;

public abstract class d
extends Fragment
implements g.c,
g.a,
g.b,
DialogPreference.a {
    private final c d0 = new c(this);
    private g e0;
    RecyclerView f0;
    private boolean g0;
    private boolean h0;
    private int i0 = i.c;
    private Runnable j0;
    private final Handler k0 = new Handler(this, Looper.getMainLooper()){
        final d a;
        {
            this.a = d8;
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            this.a.L2();
        }
    };
    private final Runnable l0 = new Runnable(this){
        final d q;
        {
            this.q = d8;
        }

        @Override
        public void run() {
            RecyclerView recyclerView = this.q.f0;
            recyclerView.focusableViewAvailable((View)recyclerView);
        }
    };

    private void W2() {
        if (this.k0.hasMessages(1)) {
            return;
        }
        this.k0.obtainMessage(1).sendToTarget();
    }

    private void X2() {
        if (this.e0 != null) {
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    private void c3() {
        this.N2().setAdapter(null);
        PreferenceScreen preferenceScreen = this.P2();
        if (preferenceScreen != null) {
            preferenceScreen.f0();
        }
        this.V2();
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        PreferenceScreen preferenceScreen = this.P2();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.y0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override
    public void J1() {
        super.J1();
        this.e0.q(this);
        this.e0.o(this);
    }

    @Override
    public void K1() {
        super.K1();
        this.e0.q(null);
        this.e0.o(null);
    }

    public void K2(int n8) {
        this.X2();
        this.a3(this.e0.m(this.p2(), n8, this.P2()));
    }

    @Override
    public void L1(View object, Bundle bundle) {
        super.L1((View)object, bundle);
        if (bundle != null && (bundle = bundle.getBundle("android:preferences")) != null && (object = this.P2()) != null) {
            ((Preference)object).x0(bundle);
        }
        if (this.g0) {
            this.L2();
            object = this.j0;
            if (object != null) {
                object.run();
                this.j0 = null;
            }
        }
        this.h0 = true;
    }

    void L2() {
        PreferenceScreen preferenceScreen = this.P2();
        if (preferenceScreen != null) {
            this.N2().setAdapter(this.R2(preferenceScreen));
            preferenceScreen.Z();
        }
        this.Q2();
    }

    public Fragment M2() {
        return null;
    }

    public final RecyclerView N2() {
        return this.f0;
    }

    @Override
    public void O(Preference object) {
        Object object2;
        block12: {
            block10: {
                block11: {
                    block9: {
                        boolean bl = this.M2() instanceof d ? ((d)((Object)this.M2())).a(this, (Preference)object) : false;
                        for (object2 = this; !bl && object2 != null; object2 = ((Fragment)object2).z0()) {
                            if (!(object2 instanceof d)) continue;
                            bl = ((d)object2).a(this, (Preference)object);
                        }
                        boolean bl2 = bl;
                        if (!bl) {
                            bl2 = bl;
                            if (this.b() instanceof d) {
                                bl2 = ((d)this.b()).a(this, (Preference)object);
                            }
                        }
                        bl = bl2;
                        if (!bl2) {
                            bl = bl2;
                            if (this.f0() instanceof d) {
                                bl = ((d)((Object)this.f0())).a(this, (Preference)object);
                            }
                        }
                        if (bl || this.A0().k0("androidx.preference.PreferenceFragment.DIALOG") != null) {
                            return;
                        }
                        if (!(object instanceof EditTextPreference)) break block9;
                        object = a.n3(((Preference)object).B());
                        break block10;
                    }
                    if (!(object instanceof ListPreference)) break block11;
                    object = ax.b2.a.m3(((Preference)object).B());
                    break block10;
                }
                if (!(object instanceof MultiSelectListPreference)) break block12;
                object = b.m3(((Preference)object).B());
            }
            ((Fragment)object).D2(this, 0);
            ((androidx.fragment.app.e)object).c3(this.A0(), "androidx.preference.PreferenceFragment.DIALOG");
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Cannot display dialog for an unknown Preference type: ");
        ((StringBuilder)object2).append(object.getClass().getSimpleName());
        ((StringBuilder)object2).append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        throw new IllegalArgumentException(((StringBuilder)object2).toString());
    }

    public g O2() {
        return this.e0;
    }

    public PreferenceScreen P2() {
        return this.e0.k();
    }

    protected void Q2() {
    }

    @Override
    public void R(PreferenceScreen preferenceScreen) {
        boolean bl = this.M2() instanceof f ? ((f)((Object)this.M2())).a(this, preferenceScreen) : false;
        for (Fragment fragment = this; !bl && fragment != null; fragment = fragment.z0()) {
            if (!(fragment instanceof f)) continue;
            bl = ((f)((Object)fragment)).a(this, preferenceScreen);
        }
        boolean bl2 = bl;
        if (!bl) {
            bl2 = bl;
            if (this.b() instanceof f) {
                bl2 = ((f)this.b()).a(this, preferenceScreen);
            }
        }
        if (!bl2 && this.f0() instanceof f) {
            ((f)((Object)this.f0())).a(this, preferenceScreen);
        }
    }

    protected RecyclerView.h R2(PreferenceScreen preferenceScreen) {
        return new androidx.preference.e(preferenceScreen);
    }

    public RecyclerView.p S2() {
        return new LinearLayoutManager(this.p2());
    }

    public abstract void T2(Bundle var1, String var2);

    @Override
    public boolean U(Preference object) {
        if (((Preference)object).w() != null) {
            Object object2;
            boolean bl = this.M2() instanceof e ? ((e)((Object)this.M2())).a(this, (Preference)object) : false;
            for (object2 = this; !bl && object2 != null; object2 = ((Fragment)object2).z0()) {
                if (!(object2 instanceof e)) continue;
                bl = ((e)object2).a(this, (Preference)object);
            }
            boolean bl2 = bl;
            if (!bl) {
                bl2 = bl;
                if (this.b() instanceof e) {
                    bl2 = ((e)this.b()).a(this, (Preference)object);
                }
            }
            bl = bl2;
            if (!bl2) {
                bl = bl2;
                if (this.f0() instanceof e) {
                    bl = ((e)((Object)this.f0())).a(this, (Preference)object);
                }
            }
            if (!bl) {
                Log.w((String)"PreferenceFragment", (String)"onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                object2 = this.A0();
                Bundle bundle = ((Preference)object).t();
                object = ((FragmentManager)object2).u0().a(this.n2().getClassLoader(), ((Preference)object).w());
                ((Fragment)object).v2(bundle);
                ((Fragment)object).D2(this, 0);
                ((FragmentManager)object2).o().r(((View)this.q2().getParent()).getId(), (Fragment)object).g(null).i();
            }
            return true;
        }
        return false;
    }

    public RecyclerView U2(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        if (this.p2().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (object2 = (RecyclerView)viewGroup.findViewById(ax.b2.h.b)) != null) {
            return object2;
        }
        object = (RecyclerView)object.inflate(i.d, viewGroup, false);
        ((RecyclerView)object).setLayoutManager(this.S2());
        ((RecyclerView)object).setAccessibilityDelegateCompat(new ax.b2.e((RecyclerView)object));
        return object;
    }

    protected void V2() {
    }

    public void Y2(Drawable drawable) {
        this.d0.m(drawable);
    }

    public void Z2(int n8) {
        this.d0.n(n8);
    }

    public void a3(PreferenceScreen preferenceScreen) {
        if (this.e0.r(preferenceScreen) && preferenceScreen != null) {
            this.V2();
            this.g0 = true;
            if (this.h0) {
                this.W2();
            }
        }
    }

    public void b3(int n8, String string) {
        this.X2();
        PreferenceScreen preferenceScreen = this.e0.m(this.p2(), n8, null);
        Comparable<Preference> comparable = preferenceScreen;
        if (string != null && !((comparable = preferenceScreen.V0(string)) instanceof PreferenceScreen)) {
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("Preference object with key ");
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append(" is not a PreferenceScreen");
            throw new IllegalArgumentException(((StringBuilder)comparable).toString());
        }
        this.a3((PreferenceScreen)comparable);
    }

    @Override
    public <T extends Preference> T n(CharSequence charSequence) {
        g g8 = this.e0;
        if (g8 == null) {
            return null;
        }
        return g8.a(charSequence);
    }

    @Override
    public void n1(Bundle bundle) {
        int n8;
        super.n1(bundle);
        Object object = new TypedValue();
        this.p2().getTheme().resolveAttribute(ax.b2.f.i, (TypedValue)object, true);
        int n9 = n8 = ((TypedValue)object).resourceId;
        if (n8 == 0) {
            n9 = k.a;
        }
        this.p2().getTheme().applyStyle(n9, false);
        object = new g(this.p2());
        this.e0 = object;
        ((g)object).p(this);
        object = this.j0() != null ? this.j0().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null;
        this.T2(bundle, (String)object);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        TypedArray typedArray = this.p2().obtainStyledAttributes(null, l.v0, ax.b2.f.f, 0);
        this.i0 = typedArray.getResourceId(l.w0, this.i0);
        Drawable drawable = typedArray.getDrawable(l.x0);
        int n8 = typedArray.getDimensionPixelSize(l.y0, -1);
        boolean bl = typedArray.getBoolean(l.z0, true);
        typedArray.recycle();
        typedArray = layoutInflater.cloneInContext(this.p2());
        layoutInflater = typedArray.inflate(this.i0, viewGroup, false);
        viewGroup = layoutInflater.findViewById(16908351);
        if (viewGroup instanceof ViewGroup) {
            if ((object = this.U2((LayoutInflater)typedArray, viewGroup, (Bundle)object)) != null) {
                this.f0 = object;
                ((RecyclerView)object).j(this.d0);
                this.Y2(drawable);
                if (n8 != -1) {
                    this.Z2(n8);
                }
                this.d0.l(bl);
                if (this.f0.getParent() == null) {
                    viewGroup.addView((View)this.f0);
                }
                this.k0.post(this.l0);
                return layoutInflater;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override
    public void u1() {
        this.k0.removeCallbacks(this.l0);
        this.k0.removeMessages(1);
        if (this.g0) {
            this.c3();
        }
        this.f0 = null;
        super.u1();
    }

    private class c
    extends RecyclerView.o {
        private Drawable a;
        private int b;
        private boolean c;
        final d d;

        c(d d8) {
            this.d = d8;
            this.c = true;
        }

        private boolean o(View object, RecyclerView recyclerView) {
            RecyclerView.F f8 = recyclerView.m0((View)object);
            if (f8 instanceof h && ((h)f8).P()) {
                boolean bl = this.c;
                int n8 = recyclerView.indexOfChild((View)object);
                if (n8 < recyclerView.getChildCount() - 1) {
                    object = recyclerView.m0(recyclerView.getChildAt(n8 + 1));
                    return object instanceof h && ((h)object).O();
                }
                return bl;
            }
            return false;
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b8) {
            if (this.o(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }

        @Override
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
            if (this.a != null) {
                int n8 = recyclerView.getChildCount();
                int n9 = recyclerView.getWidth();
                for (int i8 = 0; i8 < n8; ++i8) {
                    b8 = recyclerView.getChildAt(i8);
                    if (!this.o((View)b8, recyclerView)) continue;
                    int n10 = (int)b8.getY() + b8.getHeight();
                    this.a.setBounds(0, n10, n9, this.b + n10);
                    this.a.draw(canvas);
                }
            }
        }

        public void l(boolean bl) {
            this.c = bl;
        }

        public void m(Drawable drawable) {
            this.b = drawable != null ? drawable.getIntrinsicHeight() : 0;
            this.a = drawable;
            this.d.f0.C0();
        }

        public void n(int n8) {
            this.b = n8;
            this.d.f0.C0();
        }
    }

    public static interface d {
        public boolean a(d var1, Preference var2);
    }

    public static interface e {
        public boolean a(d var1, Preference var2);
    }

    public static interface f {
        public boolean a(d var1, PreferenceScreen var2);
    }
}

