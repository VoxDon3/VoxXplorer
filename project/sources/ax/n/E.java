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
import ax.b0.C1446g;
import ax.c0.C1760d0;
import ax.n.AbstractC2559a;
import ax.n.LayoutInflaterFactory2C2566h;
import java.util.ArrayList;

/* loaded from: classes.dex */
class E extends AbstractC2559a {
    final ax.u.l a;
    final Window.Callback b;
    final LayoutInflaterFactory2C2566h.g c;
    boolean d;
    private boolean e;
    private boolean f;
    private ArrayList<AbstractC2559a.b> g = new ArrayList<>();
    private final Runnable h = new a();
    private final Toolbar.h i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            E.this.M();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return E.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {
        private boolean a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            E.this.a.m();
            E.this.b.onPanelClosed(108, eVar);
            this.a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            E.this.b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (E.this.a.d()) {
                E.this.b.onPanelClosed(108, eVar);
            } else if (E.this.b.onPreparePanel(0, null, eVar)) {
                E.this.b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements LayoutInflaterFactory2C2566h.g {
        e() {
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.g
        public boolean a(int i) {
            if (i != 0) {
                return false;
            }
            E e = E.this;
            if (e.d) {
                return false;
            }
            e.a.g();
            E.this.d = true;
            return false;
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(E.this.a.b());
            }
            return null;
        }
    }

    E(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        C1446g.g(toolbar);
        M m = new M(toolbar, false);
        this.a = m;
        this.b = (Window.Callback) C1446g.g(callback);
        m.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        m.setWindowTitle(charSequence);
        this.c = new e();
    }

    private Menu L() {
        if (!this.e) {
            this.a.w(new c(), new d());
            this.e = true;
        }
        return this.a.r();
    }

    @Override // ax.n.AbstractC2559a
    public void A(float f) {
        C1760d0.r0(this.a.y(), f);
    }

    @Override // ax.n.AbstractC2559a
    public void B(int i) {
        this.a.v(i);
    }

    @Override // ax.n.AbstractC2559a
    public void D(Drawable drawable) {
        this.a.e(drawable);
    }

    @Override // ax.n.AbstractC2559a
    public void F(CharSequence charSequence) {
        this.a.h(charSequence);
    }

    @Override // ax.n.AbstractC2559a
    public void G(int i) {
        ax.u.l lVar = this.a;
        lVar.setTitle(i != 0 ? lVar.b().getText(i) : null);
    }

    @Override // ax.n.AbstractC2559a
    public void H(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // ax.n.AbstractC2559a
    public void I(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    @Override // ax.n.AbstractC2559a
    public void J() {
        this.a.x(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void M() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.L()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.e
            r2 = 0
            if (r1 == 0) goto Ld
            r1 = r0
            androidx.appcompat.view.menu.e r1 = (androidx.appcompat.view.menu.e) r1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == 0) goto L13
            r1.f0()
        L13:
            r0.clear()     // Catch: java.lang.Throwable -> L28
            android.view.Window$Callback r3 = r5.b     // Catch: java.lang.Throwable -> L28
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            android.view.Window$Callback r3 = r5.b     // Catch: java.lang.Throwable -> L28
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2d
            goto L2a
        L28:
            r0 = move-exception
            goto L33
        L2a:
            r0.clear()     // Catch: java.lang.Throwable -> L28
        L2d:
            if (r1 == 0) goto L32
            r1.e0()
        L32:
            return
        L33:
            if (r1 == 0) goto L38
            r1.e0()
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n.E.M():void");
    }

    @Override // ax.n.AbstractC2559a
    public void g(AbstractC2559a.b bVar) {
        this.g.add(bVar);
    }

    @Override // ax.n.AbstractC2559a
    public boolean h() {
        return this.a.k();
    }

    @Override // ax.n.AbstractC2559a
    public boolean i() {
        if (!this.a.p()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // ax.n.AbstractC2559a
    public void j(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(z);
        }
    }

    @Override // ax.n.AbstractC2559a
    public int k() {
        return this.a.A();
    }

    @Override // ax.n.AbstractC2559a
    public int l() {
        return this.a.f();
    }

    @Override // ax.n.AbstractC2559a
    public Context m() {
        return this.a.b();
    }

    @Override // ax.n.AbstractC2559a
    public void n() {
        this.a.x(8);
    }

    @Override // ax.n.AbstractC2559a
    public boolean o() {
        this.a.y().removeCallbacks(this.h);
        C1760d0.d0(this.a.y(), this.h);
        return true;
    }

    @Override // ax.n.AbstractC2559a
    public boolean p() {
        return this.a.o() == 0;
    }

    @Override // ax.n.AbstractC2559a
    public void q(Configuration configuration) {
        super.q(configuration);
    }

    @Override // ax.n.AbstractC2559a
    void r() {
        this.a.y().removeCallbacks(this.h);
    }

    @Override // ax.n.AbstractC2559a
    public boolean s(int i, KeyEvent keyEvent) {
        Menu L = L();
        if (L == null) {
            return false;
        }
        L.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return L.performShortcut(i, keyEvent, 0);
    }

    @Override // ax.n.AbstractC2559a
    public boolean t(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            u();
        }
        return true;
    }

    @Override // ax.n.AbstractC2559a
    public boolean u() {
        return this.a.l();
    }

    @Override // ax.n.AbstractC2559a
    public void v(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // ax.n.AbstractC2559a
    public void x(boolean z) {
        y(z ? 4 : 0, 4);
    }

    @Override // ax.n.AbstractC2559a
    public void y(int i, int i2) {
        this.a.q((i & i2) | ((~i2) & this.a.A()));
    }

    @Override // ax.n.AbstractC2559a
    public void z(boolean z) {
        y(z ? 8 : 0, 8);
    }

    @Override // ax.n.AbstractC2559a
    public void C(boolean z) {
    }

    @Override // ax.n.AbstractC2559a
    public void E(boolean z) {
    }

    @Override // ax.n.AbstractC2559a
    public void w(boolean z) {
    }
}
