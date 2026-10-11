package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import ax.c0.C1790t;
import ax.m.C2506a;

/* loaded from: classes.dex */
public class i {
    private final Context a;
    private final e b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private j.a i;
    private h j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar) {
        this(context, eVar, null, false, C2506a.I, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(ax.m.d.c) ? new b(this.a, this.f, this.d, this.e, this.c) : new l(this.a, this.b, this.f, this.d, this.e, this.c);
        bVar.l(this.b);
        bVar.u(this.l);
        bVar.p(this.f);
        bVar.h(this.i);
        bVar.r(this.h);
        bVar.s(this.g);
        return bVar;
    }

    private void m(int i, int i2, boolean z, boolean z2) {
        h c = c();
        c.v(z2);
        if (z) {
            if ((C1790t.b(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            c.t(i);
            c.w(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.c();
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public h c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        h hVar = this.j;
        return hVar != null && hVar.b();
    }

    protected void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        h hVar = this.j;
        if (hVar != null) {
            hVar.r(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.i = aVar;
        h hVar = this.j;
        if (hVar != null) {
            hVar.h(aVar);
        }
    }

    public void k() {
        if (!n()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void l(int i, int i2) {
        if (!o(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean n() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        m(0, 0, false, false);
        return true;
    }

    public boolean o(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        m(i, i2, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    public i(Context context, e eVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = eVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
