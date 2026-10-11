package ax.u;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
import ax.m.C2506a;
import ax.s.C3037d;

/* loaded from: classes.dex */
public class w {
    private final Context a;
    private final androidx.appcompat.view.menu.e b;
    private final View c;
    final androidx.appcompat.view.menu.i d;
    d e;
    c f;

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            w wVar = w.this;
            c cVar = wVar.f;
            if (cVar != null) {
                cVar.a(wVar);
            }
        }
    }

    public interface c {
        void a(w wVar);
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public w(Context context, View view) {
        this(context, view, 0);
    }

    public void a() {
        this.d.b();
    }

    public Menu b() {
        return this.b;
    }

    public MenuInflater c() {
        return new C3037d(this.a);
    }

    public void d(int i) {
        c().inflate(i, this.b);
    }

    public void e(c cVar) {
        this.f = cVar;
    }

    public void f(d dVar) {
        this.e = dVar;
    }

    public void g() {
        this.d.k();
    }

    public w(Context context, View view, int i) {
        this(context, view, i, C2506a.I, 0);
    }

    public w(Context context, View view, int i, int i2, int i3) {
        this.a = context;
        this.c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.b = eVar;
        eVar.S(new a());
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(context, eVar, view, false, i2, i3);
        this.d = iVar;
        iVar.h(i);
        iVar.i(new b());
    }

    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            d dVar = w.this.e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }
}
