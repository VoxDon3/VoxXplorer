/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import ax.b2.l;

@SuppressLint(value={"AppCompatCustomView"})
public class PreferenceImageView
extends ImageView {
    private int a = Integer.MAX_VALUE;
    private int b = Integer.MAX_VALUE;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        context = context.obtainStyledAttributes(attributeSet, l.D0, n8, 0);
        this.setMaxWidth(context.getDimensionPixelSize(l.F0, Integer.MAX_VALUE));
        this.setMaxHeight(context.getDimensionPixelSize(l.E0, Integer.MAX_VALUE));
        context.recycle();
    }

    public int getMaxHeight() {
        return this.b;
    }

    public int getMaxWidth() {
        return this.a;
    }

    protected void onMeasure(int n8, int n9) {
        int n10;
        block8: {
            int n11;
            block9: {
                int n12;
                int n13;
                block7: {
                    block5: {
                        block6: {
                            block4: {
                                n11 = View.MeasureSpec.getMode((int)n8);
                                if (n11 == Integer.MIN_VALUE) break block4;
                                n10 = n8;
                                if (n11 != 0) break block5;
                            }
                            n13 = View.MeasureSpec.getSize((int)n8);
                            n12 = this.getMaxWidth();
                            n10 = n8;
                            if (n12 == Integer.MAX_VALUE) break block5;
                            if (n12 < n13) break block6;
                            n10 = n8;
                            if (n11 != 0) break block5;
                        }
                        n10 = View.MeasureSpec.makeMeasureSpec((int)n12, (int)Integer.MIN_VALUE);
                    }
                    if ((n13 = View.MeasureSpec.getMode((int)n9)) == Integer.MIN_VALUE) break block7;
                    n8 = n9;
                    if (n13 != 0) break block8;
                }
                n12 = View.MeasureSpec.getSize((int)n9);
                n11 = this.getMaxHeight();
                n8 = n9;
                if (n11 == Integer.MAX_VALUE) break block8;
                if (n11 < n12) break block9;
                n8 = n9;
                if (n13 != 0) break block8;
            }
            n8 = View.MeasureSpec.makeMeasureSpec((int)n11, (int)Integer.MIN_VALUE);
        }
        super.onMeasure(n10, n8);
    }

    public void setMaxHeight(int n8) {
        this.b = n8;
        super.setMaxHeight(n8);
    }

    public void setMaxWidth(int n8) {
        this.a = n8;
        super.setMaxWidth(n8);
    }
}

