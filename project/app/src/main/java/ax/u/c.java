/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import androidx.appcompat.widget.H;
import ax.m.a;
import ax.u.b;

public class c
extends RatingBar {
    private final b a;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.K);
    }

    public c(Context object, AttributeSet attributeSet, int n8) {
        super((Context)object, attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new b((ProgressBar)this);
        this.a = object;
        ((b)object).c(attributeSet, n8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onMeasure(int n8, int n9) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        super.onMeasure(n8, n9);
                        Bitmap bitmap = this.a.b();
                        if (bitmap == null) break block4;
                        this.setMeasuredDimension(View.resolveSizeAndState((int)(bitmap.getWidth() * this.getNumStars()), (int)n8, (int)0), this.getMeasuredHeight());
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

