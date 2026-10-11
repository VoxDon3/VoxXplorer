/*
 * Decompiled with CFR 0.152.
 */
package ax.t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ax.V.c;
import ax.t.d;

class f
extends d
implements SubMenu {
    private final c e;

    f(Context context, c c8) {
        super(context, c8);
        this.e = c8;
    }

    public void clearHeader() {
        this.e.clearHeader();
    }

    public MenuItem getItem() {
        return this.c(this.e.getItem());
    }

    public SubMenu setHeaderIcon(int n8) {
        this.e.setHeaderIcon(n8);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int n8) {
        this.e.setHeaderTitle(n8);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int n8) {
        this.e.setIcon(n8);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }
}

