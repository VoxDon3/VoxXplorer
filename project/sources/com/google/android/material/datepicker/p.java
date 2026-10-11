package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
abstract class p<S> extends Fragment {
    protected final LinkedHashSet<ax.A6.k<S>> d0 = new LinkedHashSet<>();

    p() {
    }

    boolean K2(ax.A6.k<S> kVar) {
        return this.d0.add(kVar);
    }

    void L2() {
        this.d0.clear();
    }
}
