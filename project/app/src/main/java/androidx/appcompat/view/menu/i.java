/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import ax.c0.t;
import ax.m.a;
import ax.m.d;

public class i {
    private final Context a;
    private final e b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g = 0x800003;
    private boolean h;
    private j.a i;
    private h j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l = new PopupWindow.OnDismissListener(this){
        final i a;
        {
            this.a = i8;
        }

        public void onDismiss() {
            this.a.e();
        }
    };

    public i(Context context, e e8) {
        this(context, e8, null, false, ax.m.a.I, 0);
    }

    public i(Context context, e e8, View view, boolean bl, int n8) {
        this(context, e8, view, bl, n8, 0);
    }

    public i(Context context, e e8, View view, boolean bl, int n8, int n9) {
        this.a = context;
        this.b = e8;
        this.f = view;
        this.c = bl;
        this.d = n8;
        this.e = n9;
    }

    private h a() {
        Display display = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        Object object = new Point();
        display.getRealSize((Point)object);
        object = Math.min(((Point)object).x, ((Point)object).y) >= this.a.getResources().getDimensionPixelSize(ax.m.d.c) ? new b(this.a, this.f, this.d, this.e, this.c) : new l(this.a, this.b, this.f, this.d, this.e, this.c);
        ((h)object).l(this.b);
        ((h)object).u(this.l);
        ((h)object).p(this.f);
        object.h(this.i);
        ((h)object).r(this.h);
        ((h)object).s(this.g);
        return object;
    }

    private void m(int n8, int n9, boolean bl, boolean bl2) {
        h h8 = this.c();
        h8.v(bl2);
        if (bl) {
            int n10 = n8;
            if ((t.b(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                n10 = n8 - this.f.getWidth();
            }
            h8.t(n10);
            h8.w(n9);
            n8 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            h8.q(new Rect(n10 - n8, n9 - n8, n10 + n8, n9 + n8));
        }
        h8.c();
    }

    public void b() {
        if (this.d()) {
            this.j.dismiss();
        }
    }

    public h c() {
        if (this.j == null) {
            this.j = this.a();
        }
        return this.j;
    }

    public boolean d() {
        h h8 = this.j;
        return h8 != null && h8.b();
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

    public void g(boolean bl) {
        this.h = bl;
        h h8 = this.j;
        if (h8 != null) {
            h8.r(bl);
        }
    }

    public void h(int n8) {
        this.g = n8;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(j.a a8) {
        this.i = a8;
        h h8 = this.j;
        if (h8 != null) {
            h8.h(a8);
        }
    }

    public void k() {
        if (this.n()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public void l(int n8, int n9) {
        if (this.o(n8, n9)) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean n() {
        if (this.d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.m(0, 0, false, false);
        return true;
    }

    public boolean o(int n8, int n9) {
        if (this.d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.m(n8, n9, true, true);
        return true;
    }
}

