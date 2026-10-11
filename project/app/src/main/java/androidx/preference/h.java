/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.c0.d0;

public class h
extends RecyclerView.F {
    private final Drawable u;
    private ColorStateList v;
    private final SparseArray<View> w;
    private boolean x;
    private boolean y;

    h(View view) {
        super(view);
        SparseArray sparseArray;
        this.w = sparseArray = new SparseArray(4);
        TextView textView = (TextView)view.findViewById(16908310);
        sparseArray.put(16908310, (Object)textView);
        sparseArray.put(0x1020010, (Object)view.findViewById(0x1020010));
        sparseArray.put(16908294, (Object)view.findViewById(16908294));
        int n8 = ax.b2.h.a;
        sparseArray.put(n8, (Object)view.findViewById(n8));
        sparseArray.put(16908350, (Object)view.findViewById(16908350));
        this.u = view.getBackground();
        if (textView != null) {
            this.v = textView.getTextColors();
        }
    }

    public View N(int n8) {
        View view = (View)this.w.get(n8);
        if (view != null) {
            return view;
        }
        view = this.a.findViewById(n8);
        if (view != null) {
            this.w.put(n8, (Object)view);
        }
        return view;
    }

    public boolean O() {
        return this.x;
    }

    public boolean P() {
        return this.y;
    }

    void Q() {
        Drawable drawable;
        Drawable drawable2 = this.a.getBackground();
        if (drawable2 != (drawable = this.u)) {
            d0.o0(this.a, drawable);
        }
        if ((drawable2 = (TextView)this.N(16908310)) != null && this.v != null && !drawable2.getTextColors().equals(this.v)) {
            drawable2.setTextColor(this.v);
        }
    }

    public void R(boolean bl) {
        this.x = bl;
    }

    public void S(boolean bl) {
        this.y = bl;
    }
}

