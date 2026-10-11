package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l<S> extends p<S> {
    private int e0;
    private ax.A6.d<S> f0;
    private com.google.android.material.datepicker.a g0;

    class a extends ax.A6.k<S> {
        a() {
        }

        @Override // ax.A6.k
        public void a() {
            Iterator<ax.A6.k<S>> it = l.this.d0.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // ax.A6.k
        public void b(S s) {
            Iterator<ax.A6.k<S>> it = l.this.d0.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    static <T> l<T> M2(ax.A6.d<T> dVar, int i, com.google.android.material.datepicker.a aVar) {
        l<T> lVar = new l<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.v2(bundle);
        return lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.g0);
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle == null) {
            bundle = j0();
        }
        this.e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f0 = (ax.A6.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.g0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f0.p(layoutInflater.cloneInContext(new ContextThemeWrapper(b(), this.e0)), viewGroup, bundle, this.g0, new a());
    }
}
