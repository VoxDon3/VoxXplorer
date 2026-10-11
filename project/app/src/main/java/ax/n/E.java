/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.M;
import androidx.appcompat.widget.Toolbar;
import ax.b0.g;
import ax.c0.d0;
import ax.n.a;
import ax.n.h;
import ax.u.l;
import java.util.ArrayList;

class E
extends a {
    final l a;
    final Window.Callback b;
    final h.g c;
    boolean d;
    private boolean e;
    private boolean f;
    private ArrayList<a.b> g = new ArrayList();
    private final Runnable h = new Runnable(this){
        final E q;
        {
            this.q = e8;
        }

        @Override
        public void run() {
            this.q.M();
        }
    };
    private final Toolbar.h i;

    E(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        Toolbar.h h8;
        this.i = h8 = new Toolbar.h(this){
            final E a;
            {
                this.a = e8;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return this.a.b.onMenuItemSelected(0, menuItem);
            }
        };
        ax.b0.g.g(toolbar);
        M m8 = new M(toolbar, false);
        this.a = m8;
        this.b = ax.b0.g.g(callback);
        m8.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(h8);
        m8.setWindowTitle(charSequence);
        this.c = new e(this);
    }

    private Menu L() {
        if (!this.e) {
            this.a.w(new c(this), new d(this));
            this.e = true;
        }
        return this.a.r();
    }

    @Override
    public void A(float f8) {
        d0.r0((View)this.a.y(), f8);
    }

    @Override
    public void B(int n8) {
        this.a.v(n8);
    }

    @Override
    public void C(boolean bl) {
    }

    @Override
    public void D(Drawable drawable) {
        this.a.e(drawable);
    }

    @Override
    public void E(boolean bl) {
    }

    @Override
    public void F(CharSequence charSequence) {
        this.a.h(charSequence);
    }

    @Override
    public void G(int n8) {
        l l8 = this.a;
        CharSequence charSequence = n8 != 0 ? l8.b().getText(n8) : null;
        l8.setTitle(charSequence);
    }

    @Override
    public void H(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override
    public void I(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    @Override
    public void J() {
        this.a.x(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void M() {
        Throwable throwable2;
        androidx.appcompat.view.menu.e e8;
        block6: {
            block5: {
                Menu menu = this.L();
                e8 = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e)menu : null;
                if (e8 != null) {
                    e8.f0();
                }
                try {
                    menu.clear();
                    if (this.b.onCreatePanelMenu(0, menu) && this.b.onPreparePanel(0, null, menu)) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                menu.clear();
            }
            if (e8 != null) {
                e8.e0();
            }
            return;
        }
        if (e8 != null) {
            e8.e0();
        }
        throw throwable2;
    }

    @Override
    public void g(a.b b8) {
        this.g.add(b8);
    }

    @Override
    public boolean h() {
        return this.a.k();
    }

    @Override
    public boolean i() {
        if (this.a.p()) {
            this.a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override
    public void j(boolean bl) {
        if (bl != this.f) {
            this.f = bl;
            int n8 = this.g.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.g.get(i8).a(bl);
            }
        }
    }

    @Override
    public int k() {
        return this.a.A();
    }

    @Override
    public int l() {
        return this.a.f();
    }

    @Override
    public Context m() {
        return this.a.b();
    }

    @Override
    public void n() {
        this.a.x(8);
    }

    @Override
    public boolean o() {
        this.a.y().removeCallbacks(this.h);
        d0.d0((View)this.a.y(), this.h);
        return true;
    }

    @Override
    public boolean p() {
        return this.a.o() == 0;
    }

    @Override
    public void q(Configuration configuration) {
        super.q(configuration);
    }

    @Override
    void r() {
        this.a.y().removeCallbacks(this.h);
    }

    @Override
    public boolean s(int n8, KeyEvent keyEvent) {
        Menu menu = this.L();
        if (menu != null) {
            int n9 = keyEvent != null ? keyEvent.getDeviceId() : -1;
            n9 = KeyCharacterMap.load((int)n9).getKeyboardType();
            boolean bl = true;
            if (n9 == 1) {
                bl = false;
            }
            menu.setQwertyMode(bl);
            return menu.performShortcut(n8, keyEvent, 0);
        }
        return false;
    }

    @Override
    public boolean t(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.u();
        }
        return true;
    }

    @Override
    public boolean u() {
        return this.a.l();
    }

    @Override
    public void v(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override
    public void w(boolean bl) {
    }

    @Override
    public void x(boolean bl) {
        int n8 = bl ? 4 : 0;
        this.y(n8, 4);
    }

    @Override
    public void y(int n8, int n9) {
        int n10 = this.a.A();
        this.a.q(n8 & n9 | ~n9 & n10);
    }

    @Override
    public void z(boolean bl) {
        int n8 = bl ? 8 : 0;
        this.y(n8, 8);
    }

    private final class c
    implements j.a {
        private boolean a;
        final E b;

        c(E e8) {
            this.b = e8;
        }

        @Override
        public void a(androidx.appcompat.view.menu.e e8, boolean bl) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b.a.m();
            this.b.b.onPanelClosed(108, (Menu)e8);
            this.a = false;
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.e e8) {
            this.b.b.onMenuOpened(108, (Menu)e8);
            return true;
        }
    }

    private final class d
    implements e.a {
        final E a;

        d(E e8) {
            this.a = e8;
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.e e8, MenuItem menuItem) {
            return false;
        }

        @Override
        public void b(androidx.appcompat.view.menu.e e8) {
            if (this.a.a.d()) {
                this.a.b.onPanelClosed(108, (Menu)e8);
                return;
            }
            if (this.a.b.onPreparePanel(0, null, (Menu)e8)) {
                this.a.b.onMenuOpened(108, (Menu)e8);
            }
        }
    }

    private class e
    implements h.g {
        final E a;

        e(E e8) {
            this.a = e8;
        }

        @Override
        public boolean a(int n8) {
            if (n8 == 0) {
                E e8 = this.a;
                if (!e8.d) {
                    e8.a.g();
                    this.a.d = true;
                }
            }
            return false;
        }

        @Override
        public View onCreatePanelView(int n8) {
            if (n8 == 0) {
                return new View(this.a.a.b());
            }
            return null;
        }
    }
}

