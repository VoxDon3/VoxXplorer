/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;

class r
extends LinearLayoutManager {
    r(Context context, int n8, boolean bl) {
        super(context, n8, bl);
    }

    @Override
    public void N1(RecyclerView object, RecyclerView.B b8, int n8) {
        object = new l(this, object.getContext()){
            final r q;
            {
                this.q = r8;
                super(context);
            }

            @Override
            protected float v(DisplayMetrics displayMetrics) {
                return 100.0f / (float)displayMetrics.densityDpi;
            }
        };
        ((RecyclerView.A)object).p(n8);
        this.O1((RecyclerView.A)object);
    }
}

