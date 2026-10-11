package ax.u;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.L;

/* renamed from: ax.u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3156a extends PopupWindow {
    private static final boolean b = false;
    private boolean a;

    public C3156a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        L v = L.v(context, attributeSet, ax.m.j.Y1, i, i2);
        int i3 = ax.m.j.a2;
        if (v.s(i3)) {
            b(v.a(i3, false));
        }
        setBackgroundDrawable(v.g(ax.m.j.Z1));
        v.x();
    }

    private void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            ax.h0.h.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
