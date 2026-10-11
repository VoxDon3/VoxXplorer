/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.A6.d;
import ax.A6.k;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.p;
import java.util.AbstractCollection;
import java.util.Iterator;

public final class l<S>
extends p<S> {
    private int e0;
    private d<S> f0;
    private a g0;

    static <T> l<T> M2(d<T> d8, int n8, a a8) {
        l l8 = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", n8);
        bundle.putParcelable("DATE_SELECTOR_KEY", d8);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)a8);
        l8.v2(bundle);
        return l8;
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)this.g0);
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = this.j0();
        }
        this.e0 = bundle2.getInt("THEME_RES_ID_KEY");
        this.f0 = (d)bundle2.getParcelable("DATE_SELECTOR_KEY");
        this.g0 = (a)bundle2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.cloneInContext((Context)new ContextThemeWrapper(this.b(), this.e0));
        return this.f0.p(layoutInflater, viewGroup, bundle, this.g0, new k<S>(this){
            final l a;
            {
                this.a = l8;
            }

            @Override
            public void a() {
                Iterator iterator = ((AbstractCollection)this.a.d0).iterator();
                while (iterator.hasNext()) {
                    ((k)iterator.next()).a();
                }
            }

            @Override
            public void b(S s8) {
                Iterator iterator = ((AbstractCollection)this.a.d0).iterator();
                while (iterator.hasNext()) {
                    ((k)iterator.next()).b(s8);
                }
            }
        });
    }
}

