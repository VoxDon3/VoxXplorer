/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class g
extends View {
    private boolean a = true;

    public g(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @SuppressLint(value={"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    protected void onMeasure(int n8, int n9) {
        this.setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean bl) {
        this.a = bl;
    }

    public void setGuidelineBegin(int n8) {
        ConstraintLayout.b b8 = (ConstraintLayout.b)this.getLayoutParams();
        if (this.a && b8.a == n8) {
            return;
        }
        b8.a = n8;
        this.setLayoutParams((ViewGroup.LayoutParams)b8);
    }

    public void setGuidelineEnd(int n8) {
        ConstraintLayout.b b8 = (ConstraintLayout.b)this.getLayoutParams();
        if (this.a && b8.b == n8) {
            return;
        }
        b8.b = n8;
        this.setLayoutParams((ViewGroup.LayoutParams)b8);
    }

    public void setGuidelinePercent(float f8) {
        ConstraintLayout.b b8 = (ConstraintLayout.b)this.getLayoutParams();
        if (this.a && b8.c == f8) {
            return;
        }
        b8.c = f8;
        this.setLayoutParams((ViewGroup.LayoutParams)b8);
    }

    public void setVisibility(int n8) {
    }
}

