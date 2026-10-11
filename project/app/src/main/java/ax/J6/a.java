/*
 * Decompiled with CFR 0.152.
 */
package ax.J6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.s;
import ax.F6.w;
import ax.h0.c;
import ax.k6.l;
import ax.k6.m;

public class a
extends s {
    private static final int g = l.y;
    private static final int[][] h;
    private ColorStateList e;
    private boolean f;

    static {
        int[] nArray = new int[]{-16842910, 0x10100A0};
        h = new int[][]{{16842910, 0x10100A0}, {16842910, -16842912}, nArray, {-16842910, -16842912}};
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.J);
    }

    public a(Context context, AttributeSet attributeSet, int n8) {
        int n9 = g;
        super(ax.V6.a.d(context, attributeSet, n8, n9), attributeSet, n8);
        context = this.getContext();
        attributeSet = w.i(context, attributeSet, m.Q3, n8, n9, new int[0]);
        n8 = m.R3;
        if (attributeSet.hasValue(n8)) {
            c.d((CompoundButton)this, ax.K6.c.a(context, (TypedArray)attributeSet, n8));
        }
        this.f = attributeSet.getBoolean(m.S3, false);
        attributeSet.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int n8 = ax.z6.a.d((View)this, ax.m.a.v);
            int n9 = ax.z6.a.d((View)this, ax.k6.c.f);
            int n10 = ax.z6.a.d((View)this, ax.k6.c.i);
            int[][] nArray = h;
            int[] nArray2 = new int[nArray.length];
            nArray2[0] = ax.z6.a.k(n10, n8, 1.0f);
            nArray2[1] = ax.z6.a.k(n10, n9, 0.54f);
            nArray2[2] = ax.z6.a.k(n10, n9, 0.38f);
            nArray2[3] = ax.z6.a.k(n10, n9, 0.38f);
            this.e = new ColorStateList(nArray, nArray2);
        }
        return this.e;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && c.b((CompoundButton)this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean bl) {
        this.f = bl;
        if (bl) {
            c.d((CompoundButton)this, this.getMaterialThemeColorsTintList());
            return;
        }
        c.d((CompoundButton)this, null);
    }
}

