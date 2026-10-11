package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import ax.b2.C1484l;
import ax.c0.C1760d0;
import ax.o.C2653a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class e extends RecyclerView.h<h> implements Preference.c {
    private final PreferenceGroup d;
    private List<Preference> e;
    private List<Preference> f;
    private final List<c> g;
    private final Runnable i = new a();
    private final Handler h = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.U();
        }
    }

    class b implements Preference.e {
        final /* synthetic */ PreferenceGroup a;

        b(PreferenceGroup preferenceGroup) {
            this.a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            this.a.e1(SubsamplingScaleImageView.TILE_SIZE_AUTO);
            e.this.a(preference);
            this.a.X0();
            return true;
        }
    }

    private static class c {
        int a;
        int b;
        String c;

        c(Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.C();
            this.b = preference.P();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && TextUtils.equals(this.c, cVar.c);
        }

        public int hashCode() {
            return ((((527 + this.a) * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public e(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        preferenceGroup.F0(this);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            K(((PreferenceScreen) preferenceGroup).h1());
        } else {
            K(true);
        }
        U();
    }

    private androidx.preference.b N(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.s(), list, preferenceGroup.x());
        bVar.H0(new b(preferenceGroup));
        return bVar;
    }

    private List<Preference> O(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int Z0 = preferenceGroup.Z0();
        int i = 0;
        for (int i2 = 0; i2 < Z0; i2++) {
            Preference Y0 = preferenceGroup.Y0(i2);
            if (Y0.V()) {
                if (!R(preferenceGroup) || i < preferenceGroup.W0()) {
                    arrayList.add(Y0);
                } else {
                    arrayList2.add(Y0);
                }
                if (Y0 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) Y0;
                    if (!preferenceGroup2.a1()) {
                        continue;
                    } else {
                        if (R(preferenceGroup) && R(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : O(preferenceGroup2)) {
                            if (!R(preferenceGroup) || i < preferenceGroup.W0()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (R(preferenceGroup) && i > preferenceGroup.W0()) {
            arrayList.add(N(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void P(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.g1();
        int Z0 = preferenceGroup.Z0();
        for (int i = 0; i < Z0; i++) {
            Preference Y0 = preferenceGroup.Y0(i);
            list.add(Y0);
            c cVar = new c(Y0);
            if (!this.g.contains(cVar)) {
                this.g.add(cVar);
            }
            if (Y0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) Y0;
                if (preferenceGroup2.a1()) {
                    P(list, preferenceGroup2);
                }
            }
            Y0.F0(this);
        }
    }

    private boolean R(PreferenceGroup preferenceGroup) {
        return preferenceGroup.W0() != Integer.MAX_VALUE;
    }

    public Preference Q(int i) {
        if (i < 0 || i >= l()) {
            return null;
        }
        return this.f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void B(h hVar, int i) {
        Preference Q = Q(i);
        hVar.Q();
        Q.c0(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public h D(ViewGroup viewGroup, int i) {
        c cVar = this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C1484l.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1484l.b);
        if (drawable == null) {
            drawable = C2653a.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(cVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C1760d0.o0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = cVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new h(inflate);
    }

    void U() {
        Iterator<Preference> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().F0(null);
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        this.e = arrayList;
        P(arrayList, this.d);
        this.f = O(this.d);
        g K = this.d.K();
        if (K != null) {
            K.i();
        }
        r();
        Iterator<Preference> it2 = this.e.iterator();
        while (it2.hasNext()) {
            it2.next().j();
        }
    }

    @Override // androidx.preference.Preference.c
    public void a(Preference preference) {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    @Override // androidx.preference.Preference.c
    public void d(Preference preference) {
        a(preference);
    }

    @Override // androidx.preference.Preference.c
    public void f(Preference preference) {
        int indexOf = this.f.indexOf(preference);
        if (indexOf != -1) {
            t(indexOf, preference);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long m(int i) {
        if (q()) {
            return Q(i).x();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int n(int i) {
        c cVar = new c(Q(i));
        int indexOf = this.g.indexOf(cVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.g.size();
        this.g.add(cVar);
        return size;
    }
}
