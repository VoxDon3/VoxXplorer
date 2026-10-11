/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

public class m
extends e
implements SubMenu {
    private e B;
    private g C;

    public m(Context context, e e8, g g8) {
        super(context);
        this.B = e8;
        this.C = g8;
    }

    @Override
    public e D() {
        return this.B.D();
    }

    @Override
    public boolean G() {
        return this.B.G();
    }

    @Override
    public boolean H() {
        return this.B.H();
    }

    @Override
    public boolean I() {
        return this.B.I();
    }

    @Override
    public void S(e.a a8) {
        this.B.S(a8);
    }

    @Override
    public boolean f(g g8) {
        return this.B.f(g8);
    }

    public Menu g0() {
        return this.B;
    }

    public MenuItem getItem() {
        return this.C;
    }

    @Override
    boolean h(e e8, MenuItem menuItem) {
        return super.h(e8, menuItem) || this.B.h(e8, menuItem);
        {
        }
    }

    @Override
    public boolean k(g g8) {
        return this.B.k(g8);
    }

    @Override
    public void setGroupDividerEnabled(boolean bl) {
        this.B.setGroupDividerEnabled(bl);
    }

    public SubMenu setHeaderIcon(int n8) {
        return (SubMenu)super.V(n8);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu)super.W(drawable);
    }

    public SubMenu setHeaderTitle(int n8) {
        return (SubMenu)super.Y(n8);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu)super.Z(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu)super.a0(view);
    }

    public SubMenu setIcon(int n8) {
        this.C.setIcon(n8);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override
    public void setQwertyMode(boolean bl) {
        this.B.setQwertyMode(bl);
    }

    @Override
    public String t() {
        Object object = this.C;
        int n8 = object != null ? ((g)object).getItemId() : 0;
        if (n8 == 0) {
            return null;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(super.t());
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(n8);
        return ((StringBuilder)object).toString();
    }
}

