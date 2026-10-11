/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import ax.m.a;

public class w {
    private final Context a;
    private final e b;
    private final View c;
    final i d;
    d e;
    c f;

    public w(Context context, View view) {
        this(context, view, 0);
    }

    public w(Context context, View view, int n8) {
        this(context, view, n8, ax.m.a.I, 0);
    }

    public w(Context object, View view, int n8, int n9, int n10) {
        e e8;
        this.a = object;
        this.c = view;
        this.b = e8 = new e((Context)object);
        e8.S(new e.a(this){
            final w a;
            {
                this.a = w8;
            }

            @Override
            public boolean a(e object, MenuItem menuItem) {
                object = this.a.e;
                if (object != null) {
                    return object.onMenuItemClick(menuItem);
                }
                return false;
            }

            @Override
            public void b(e e8) {
            }
        });
        object = new i((Context)object, e8, view, false, n9, n10);
        this.d = object;
        ((i)object).h(n8);
        ((i)object).i(new PopupWindow.OnDismissListener(this){
            final w a;
            {
                this.a = w8;
            }

            public void onDismiss() {
                w w8 = this.a;
                c c8 = w8.f;
                if (c8 != null) {
                    c8.a(w8);
                }
            }
        });
    }

    public void a() {
        this.d.b();
    }

    public Menu b() {
        return this.b;
    }

    public MenuInflater c() {
        return new ax.s.d(this.a);
    }

    public void d(int n8) {
        this.c().inflate(n8, (Menu)this.b);
    }

    public void e(c c8) {
        this.f = c8;
    }

    public void f(d d8) {
        this.e = d8;
    }

    public void g() {
        this.d.k();
    }

    public static interface c {
        public void a(w var1);
    }

    public static interface d {
        public boolean onMenuItemClick(MenuItem var1);
    }
}

