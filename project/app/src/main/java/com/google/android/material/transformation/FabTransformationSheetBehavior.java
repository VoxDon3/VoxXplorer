/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.k6.b;
import ax.l6.h;
import ax.l6.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior
extends FabTransformationBehavior {
    private Map<View, Integer> i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void k0(View view, boolean bl) {
        Object object = view.getParent();
        if (object instanceof CoordinatorLayout) {
            object = (CoordinatorLayout)object;
            int n8 = object.getChildCount();
            if (bl) {
                this.i = new HashMap<View, Integer>(n8);
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                View view2 = object.getChildAt(i8);
                boolean bl2 = view2.getLayoutParams() instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)view2.getLayoutParams()).f() instanceof FabTransformationScrimBehavior;
                if (view2 == view || bl2) continue;
                if (!bl) {
                    Map<View, Integer> map = this.i;
                    if (map == null || !map.containsKey(view2)) continue;
                    view2.setImportantForAccessibility(this.i.get(view2).intValue());
                    continue;
                }
                this.i.put(view2, view2.getImportantForAccessibility());
                view2.setImportantForAccessibility(4);
            }
            if (!bl) {
                this.i = null;
            }
        }
    }

    @Override
    protected boolean L(View view, View view2, boolean bl, boolean bl2) {
        this.k0(view2, bl);
        return super.L(view, view2, bl, bl2);
    }

    @Override
    protected FabTransformationBehavior.e i0(Context context, boolean bl) {
        int n8 = bl ? b.d : b.c;
        FabTransformationBehavior.e e8 = new FabTransformationBehavior.e();
        e8.a = h.c(context, n8);
        e8.b = new j(17, 0.0f, 0.0f);
        return e8;
    }
}

