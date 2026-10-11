/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import ax.s.d;
import java.lang.ref.WeakReference;

public class b
extends a
implements e.a {
    private Context c;
    private ActionBarContextView d;
    private a.a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private e i;

    public b(Context object, ActionBarContextView actionBarContextView, a.a a8, boolean bl) {
        this.c = object;
        this.d = actionBarContextView;
        this.e = a8;
        object = new e(actionBarContextView.getContext()).T(1);
        this.i = object;
        ((e)object).S(this);
        this.h = bl;
    }

    @Override
    public boolean a(e e8, MenuItem menuItem) {
        return this.e.d(this, menuItem);
    }

    @Override
    public void b(e e8) {
        this.k();
        this.d.l();
    }

    @Override
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.a(this);
    }

    @Override
    public View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return (View)weakReference.get();
        }
        return null;
    }

    @Override
    public Menu e() {
        return this.i;
    }

    @Override
    public MenuInflater f() {
        return new d(this.d.getContext());
    }

    @Override
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override
    public void k() {
        this.e.c(this, this.i);
    }

    @Override
    public boolean l() {
        return this.d.j();
    }

    @Override
    public void m(View object) {
        this.d.setCustomView((View)object);
        object = object != null ? new WeakReference<View>((View)object) : null;
        this.f = object;
    }

    @Override
    public void n(int n8) {
        this.o(this.c.getString(n8));
    }

    @Override
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public void q(int n8) {
        this.r(this.c.getString(n8));
    }

    @Override
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public void s(boolean bl) {
        super.s(bl);
        this.d.setTitleOptional(bl);
    }
}

