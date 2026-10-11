/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import ax.A6.k;
import java.util.AbstractCollection;
import java.util.LinkedHashSet;

abstract class p<S>
extends Fragment {
    protected final LinkedHashSet<k<S>> d0 = new LinkedHashSet();

    p() {
    }

    boolean K2(k<S> k8) {
        return ((AbstractCollection)this.d0).add(k8);
    }

    void L2() {
        ((AbstractCollection)this.d0).clear();
    }
}

