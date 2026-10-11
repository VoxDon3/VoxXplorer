package androidx.preference;

import android.R;
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
import androidx.preference.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.b2.C1473a;
import ax.b2.C1474b;
import ax.b2.C1477e;
import ax.b2.C1478f;
import ax.b2.C1480h;
import ax.b2.C1481i;
import ax.b2.C1483k;
import ax.b2.C1484l;

/* loaded from: classes.dex */
public abstract class d extends Fragment implements g.c, g.a, g.b, DialogPreference.a {
    private g e0;
    RecyclerView f0;
    private boolean g0;
    private boolean h0;
    private Runnable j0;
    private final c d0 = new c();
    private int i0 = C1481i.c;
    private final Handler k0 = new a(Looper.getMainLooper());
    private final Runnable l0 = new b();

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            d.this.L2();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = d.this.f0;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    private class c extends RecyclerView.o {
        private Drawable a;
        private int b;
        private boolean c = true;

        c() {
        }

        private boolean o(View view, RecyclerView recyclerView) {
            RecyclerView.F m0 = recyclerView.m0(view);
            if (!(m0 instanceof h) || !((h) m0).P()) {
                return false;
            }
            boolean z = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z;
            }
            RecyclerView.F m02 = recyclerView.m0(recyclerView.getChildAt(indexOfChild + 1));
            return (m02 instanceof h) && ((h) m02).O();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b) {
            if (o(view, recyclerView)) {
                rect.bottom = this.b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b) {
            if (this.a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (o(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.b + y);
                    this.a.draw(canvas);
                }
            }
        }

        public void l(boolean z) {
            this.c = z;
        }

        public void m(Drawable drawable) {
            if (drawable != null) {
                this.b = drawable.getIntrinsicHeight();
            } else {
                this.b = 0;
            }
            this.a = drawable;
            d.this.f0.C0();
        }

        public void n(int i) {
            this.b = i;
            d.this.f0.C0();
        }
    }

    /* renamed from: androidx.preference.d$d, reason: collision with other inner class name */
    public interface InterfaceC0034d {
        boolean a(d dVar, Preference preference);
    }

    public interface e {
        boolean a(d dVar, Preference preference);
    }

    public interface f {
        boolean a(d dVar, PreferenceScreen preferenceScreen);
    }

    private void W2() {
        if (this.k0.hasMessages(1)) {
            return;
        }
        this.k0.obtainMessage(1).sendToTarget();
    }

    private void X2() {
        if (this.e0 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void c3() {
        N2().setAdapter(null);
        PreferenceScreen P2 = P2();
        if (P2 != null) {
            P2.f0();
        }
        V2();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        PreferenceScreen P2 = P2();
        if (P2 != null) {
            Bundle bundle2 = new Bundle();
            P2.y0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        this.e0.q(this);
        this.e0.o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void K1() {
        super.K1();
        this.e0.q(null);
        this.e0.o(null);
    }

    public void K2(int i) {
        X2();
        a3(this.e0.m(p2(), i, P2()));
    }

    @Override // androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen P2;
        super.L1(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (P2 = P2()) != null) {
            P2.x0(bundle2);
        }
        if (this.g0) {
            L2();
            Runnable runnable = this.j0;
            if (runnable != null) {
                runnable.run();
                this.j0 = null;
            }
        }
        this.h0 = true;
    }

    void L2() {
        PreferenceScreen P2 = P2();
        if (P2 != null) {
            N2().setAdapter(R2(P2));
            P2.Z();
        }
        Q2();
    }

    public Fragment M2() {
        return null;
    }

    public final RecyclerView N2() {
        return this.f0;
    }

    @Override // androidx.preference.g.a
    public void O(Preference preference) {
        androidx.fragment.app.e m3;
        boolean a2 = M2() instanceof InterfaceC0034d ? ((InterfaceC0034d) M2()).a(this, preference) : false;
        for (Fragment fragment = this; !a2 && fragment != null; fragment = fragment.z0()) {
            if (fragment instanceof InterfaceC0034d) {
                a2 = ((InterfaceC0034d) fragment).a(this, preference);
            }
        }
        if (!a2 && (b() instanceof InterfaceC0034d)) {
            a2 = ((InterfaceC0034d) b()).a(this, preference);
        }
        if (!a2 && (f0() instanceof InterfaceC0034d)) {
            a2 = ((InterfaceC0034d) f0()).a(this, preference);
        }
        if (!a2 && A0().k0("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                m3 = androidx.preference.a.n3(preference.B());
            } else if (preference instanceof ListPreference) {
                m3 = C1473a.m3(preference.B());
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                m3 = C1474b.m3(preference.B());
            }
            m3.D2(this, 0);
            m3.c3(A0(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public g O2() {
        return this.e0;
    }

    public PreferenceScreen P2() {
        return this.e0.k();
    }

    protected void Q2() {
    }

    @Override // androidx.preference.g.b
    public void R(PreferenceScreen preferenceScreen) {
        boolean a2 = M2() instanceof f ? ((f) M2()).a(this, preferenceScreen) : false;
        for (Fragment fragment = this; !a2 && fragment != null; fragment = fragment.z0()) {
            if (fragment instanceof f) {
                a2 = ((f) fragment).a(this, preferenceScreen);
            }
        }
        if (!a2 && (b() instanceof f)) {
            a2 = ((f) b()).a(this, preferenceScreen);
        }
        if (a2 || !(f0() instanceof f)) {
            return;
        }
        ((f) f0()).a(this, preferenceScreen);
    }

    protected RecyclerView.h R2(PreferenceScreen preferenceScreen) {
        return new androidx.preference.e(preferenceScreen);
    }

    public RecyclerView.p S2() {
        return new LinearLayoutManager(p2());
    }

    public abstract void T2(Bundle bundle, String str);

    @Override // androidx.preference.g.c
    public boolean U(Preference preference) {
        if (preference.w() == null) {
            return false;
        }
        boolean a2 = M2() instanceof e ? ((e) M2()).a(this, preference) : false;
        for (Fragment fragment = this; !a2 && fragment != null; fragment = fragment.z0()) {
            if (fragment instanceof e) {
                a2 = ((e) fragment).a(this, preference);
            }
        }
        if (!a2 && (b() instanceof e)) {
            a2 = ((e) b()).a(this, preference);
        }
        if (!a2 && (f0() instanceof e)) {
            a2 = ((e) f0()).a(this, preference);
        }
        if (a2) {
            return true;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        FragmentManager A0 = A0();
        Bundle t = preference.t();
        Fragment a3 = A0.u0().a(n2().getClassLoader(), preference.w());
        a3.v2(t);
        a3.D2(this, 0);
        A0.o().r(((View) q2().getParent()).getId(), a3).g(null).i();
        return true;
    }

    public RecyclerView U2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (p2().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(C1480h.b)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(C1481i.d, viewGroup, false);
        recyclerView2.setLayoutManager(S2());
        recyclerView2.setAccessibilityDelegateCompat(new C1477e(recyclerView2));
        return recyclerView2;
    }

    protected void V2() {
    }

    public void Y2(Drawable drawable) {
        this.d0.m(drawable);
    }

    public void Z2(int i) {
        this.d0.n(i);
    }

    public void a3(PreferenceScreen preferenceScreen) {
        if (!this.e0.r(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        V2();
        this.g0 = true;
        if (this.h0) {
            W2();
        }
    }

    public void b3(int i, String str) {
        X2();
        PreferenceScreen m = this.e0.m(p2(), i, null);
        Object obj = m;
        if (str != null) {
            Object V0 = m.V0(str);
            boolean z = V0 instanceof PreferenceScreen;
            obj = V0;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        a3((PreferenceScreen) obj);
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T n(CharSequence charSequence) {
        g gVar = this.e0;
        if (gVar == null) {
            return null;
        }
        return (T) gVar.a(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        TypedValue typedValue = new TypedValue();
        p2().getTheme().resolveAttribute(C1478f.i, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = C1483k.a;
        }
        p2().getTheme().applyStyle(i, false);
        g gVar = new g(p2());
        this.e0 = gVar;
        gVar.p(this);
        T2(bundle, j0() != null ? j0().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = p2().obtainStyledAttributes(null, C1484l.v0, C1478f.f, 0);
        this.i0 = obtainStyledAttributes.getResourceId(C1484l.w0, this.i0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1484l.x0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1484l.y0, -1);
        boolean z = obtainStyledAttributes.getBoolean(C1484l.z0, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(p2());
        View inflate = cloneInContext.inflate(this.i0, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView U2 = U2(cloneInContext, viewGroup2, bundle);
        if (U2 == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.f0 = U2;
        U2.j(this.d0);
        Y2(drawable);
        if (dimensionPixelSize != -1) {
            Z2(dimensionPixelSize);
        }
        this.d0.l(z);
        if (this.f0.getParent() == null) {
            viewGroup2.addView(this.f0);
        }
        this.k0.post(this.l0);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void u1() {
        this.k0.removeCallbacks(this.l0);
        this.k0.removeMessages(1);
        if (this.g0) {
            c3();
        }
        this.f0 = null;
        super.u1();
    }
}
