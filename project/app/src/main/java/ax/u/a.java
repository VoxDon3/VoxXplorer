/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.L;
import ax.h0.h;
import ax.m.j;

class a
extends PopupWindow {
    private static final boolean b = false;
    private boolean a;

    public a(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        this.a(context, attributeSet, n8, n9);
    }

    private void a(Context object, AttributeSet attributeSet, int n8, int n9) {
        if (((L)(object = L.v((Context)object, attributeSet, j.Y1, n8, n9))).s(n8 = j.a2)) {
            this.b(((L)object).a(n8, false));
        }
        this.setBackgroundDrawable(((L)object).g(j.Z1));
        ((L)object).x();
    }

    private void b(boolean bl) {
        if (b) {
            this.a = bl;
            return;
        }
        h.a(this, bl);
    }

    public void showAsDropDown(View view, int n8, int n9) {
        int n10 = n9;
        if (b) {
            n10 = n9;
            if (this.a) {
                n10 = n9 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n8, n10);
    }

    public void showAsDropDown(View view, int n8, int n9, int n10) {
        int n11 = n9;
        if (b) {
            n11 = n9;
            if (this.a) {
                n11 = n9 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n8, n11, n10);
    }

    public void update(View view, int n8, int n9, int n10, int n11) {
        int n12 = n9;
        if (b) {
            n12 = n9;
            if (this.a) {
                n12 = n9 - view.getHeight();
            }
        }
        super.update(view, n8, n12, n10, n11);
    }
}

