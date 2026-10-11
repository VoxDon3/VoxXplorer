/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.b;
import androidx.preference.g;
import androidx.preference.h;
import androidx.recyclerview.widget.RecyclerView;
import ax.b2.l;
import ax.c0.d0;
import ax.o.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
extends RecyclerView.h<h>
implements Preference.c {
    private final PreferenceGroup d;
    private List<Preference> e;
    private List<Preference> f;
    private final List<c> g;
    private final Handler h;
    private final Runnable i = new Runnable(this){
        final e q;
        {
            this.q = e8;
        }

        @Override
        public void run() {
            this.q.U();
        }
    };

    public e(PreferenceGroup preferenceGroup) {
        this.d = preferenceGroup;
        this.h = new Handler(Looper.getMainLooper());
        preferenceGroup.F0(this);
        this.e = new ArrayList<Preference>();
        this.f = new ArrayList<Preference>();
        this.g = new ArrayList<c>();
        if (preferenceGroup instanceof PreferenceScreen) {
            this.K(((PreferenceScreen)preferenceGroup).h1());
        } else {
            this.K(true);
        }
        this.U();
    }

    private b N(PreferenceGroup preferenceGroup, List<Preference> object) {
        object = new b(preferenceGroup.s(), (List<Preference>)object, preferenceGroup.x());
        ((Preference)object).H0(new Preference.e(this, preferenceGroup){
            final PreferenceGroup a;
            final e b;
            {
                this.b = e8;
                this.a = preferenceGroup;
            }

            @Override
            public boolean a(Preference preference) {
                this.a.e1(Integer.MAX_VALUE);
                this.b.a(preference);
                this.a.X0();
                return true;
            }
        });
        return object;
    }

    private List<Preference> O(PreferenceGroup preferenceGroup) {
        ArrayList<Preference> arrayList = new ArrayList<Preference>();
        ArrayList<Preference> arrayList2 = new ArrayList<Preference>();
        int n8 = preferenceGroup.Z0();
        int n9 = 0;
        block0: for (int i8 = 0; i8 < n8; ++i8) {
            Preference preference = preferenceGroup.Y0(i8);
            if (!preference.V()) continue;
            if (this.R(preferenceGroup) && n9 >= preferenceGroup.W0()) {
                arrayList2.add(preference);
            } else {
                arrayList.add(preference);
            }
            if (!(preference instanceof PreferenceGroup)) {
                ++n9;
                continue;
            }
            if (!((PreferenceGroup)(preference = (PreferenceGroup)preference)).a1()) continue;
            if (this.R(preferenceGroup) && this.R((PreferenceGroup)preference)) {
                throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
            }
            Iterator<Preference> iterator = this.O((PreferenceGroup)preference).iterator();
            int n10 = n9;
            while (true) {
                n9 = ++n10;
                if (!iterator.hasNext()) continue block0;
                preference = iterator.next();
                if (this.R(preferenceGroup) && n10 >= preferenceGroup.W0()) {
                    arrayList2.add(preference);
                    continue;
                }
                arrayList.add(preference);
            }
        }
        if (this.R(preferenceGroup) && n9 > preferenceGroup.W0()) {
            arrayList.add(this.N(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void P(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.g1();
        int n8 = preferenceGroup.Z0();
        for (int i8 = 0; i8 < n8; ++i8) {
            Preference preference = preferenceGroup.Y0(i8);
            list.add(preference);
            Object object = new c(preference);
            if (!this.g.contains(object)) {
                this.g.add((c)object);
            }
            if (preference instanceof PreferenceGroup && ((PreferenceGroup)(object = (PreferenceGroup)preference)).a1()) {
                this.P(list, (PreferenceGroup)object);
            }
            preference.F0(this);
        }
    }

    private boolean R(PreferenceGroup preferenceGroup) {
        return preferenceGroup.W0() != Integer.MAX_VALUE;
    }

    public Preference Q(int n8) {
        if (n8 >= 0 && n8 < this.l()) {
            return this.f.get(n8);
        }
        return null;
    }

    public void S(h h8, int n8) {
        Preference preference = this.Q(n8);
        h8.Q();
        preference.c0(h8);
    }

    public h T(ViewGroup viewGroup, int n8) {
        Drawable drawable;
        c c8 = this.g.get(n8);
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        TypedArray typedArray = viewGroup.getContext().obtainStyledAttributes(null, l.a);
        Drawable drawable2 = drawable = typedArray.getDrawable(l.b);
        if (drawable == null) {
            drawable2 = a.b(viewGroup.getContext(), 17301602);
        }
        typedArray.recycle();
        viewGroup = layoutInflater.inflate(c8.a, viewGroup, false);
        if (viewGroup.getBackground() == null) {
            d0.o0((View)viewGroup, drawable2);
        }
        if ((drawable2 = (ViewGroup)viewGroup.findViewById(16908312)) != null) {
            n8 = c8.b;
            if (n8 != 0) {
                layoutInflater.inflate(n8, (ViewGroup)drawable2);
            } else {
                drawable2.setVisibility(8);
            }
        }
        return new h((View)viewGroup);
    }

    void U() {
        Iterator<Preference> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().F0(null);
        }
        iterator = new ArrayList(this.e.size());
        this.e = iterator;
        this.P((List<Preference>)((Object)iterator), this.d);
        this.f = this.O(this.d);
        iterator = this.d.K();
        if (iterator != null) {
            ((g)((Object)iterator)).i();
        }
        this.r();
        iterator = this.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().j();
        }
    }

    @Override
    public void a(Preference preference) {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    @Override
    public void d(Preference preference) {
        this.a(preference);
    }

    @Override
    public void f(Preference preference) {
        int n8 = this.f.indexOf(preference);
        if (n8 != -1) {
            this.t(n8, preference);
        }
    }

    @Override
    public int l() {
        return this.f.size();
    }

    @Override
    public long m(int n8) {
        if (!this.q()) {
            return -1L;
        }
        return this.Q(n8).x();
    }

    @Override
    public int n(int n8) {
        c c8 = new c(this.Q(n8));
        if ((n8 = this.g.indexOf(c8)) != -1) {
            return n8;
        }
        n8 = this.g.size();
        this.g.add(c8);
        return n8;
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

        public boolean equals(Object object) {
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            return this.a == ((c)object).a && this.b == ((c)object).b && TextUtils.equals((CharSequence)this.c, (CharSequence)((c)object).c);
        }

        public int hashCode() {
            return ((527 + this.a) * 31 + this.b) * 31 + this.c.hashCode();
        }
    }
}

