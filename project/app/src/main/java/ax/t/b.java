/*
 * Decompiled with CFR 0.152.
 */
package ax.t;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import ax.B.k;
import ax.t.c;
import ax.t.f;

abstract class b {
    final Context a;
    private k<ax.V.b, MenuItem> b;
    private k<ax.V.c, SubMenu> c;

    b(Context context) {
        this.a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof ax.V.b) {
            MenuItem menuItem2;
            ax.V.b b8 = (ax.V.b)menuItem;
            if (this.b == null) {
                this.b = new k();
            }
            menuItem = menuItem2 = this.b.get(b8);
            if (menuItem2 == null) {
                menuItem = new c(this.a, b8);
                this.b.put(b8, menuItem);
            }
            return menuItem;
        }
        return menuItem;
    }

    final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof ax.V.c) {
            SubMenu subMenu2;
            ax.V.c c8 = (ax.V.c)subMenu;
            if (this.c == null) {
                this.c = new k();
            }
            subMenu = subMenu2 = this.c.get(c8);
            if (subMenu2 == null) {
                subMenu = new f(this.a, c8);
                this.c.put(c8, subMenu);
            }
            return subMenu;
        }
        return subMenu;
    }

    final void e() {
        k<Object, Object> k8 = this.b;
        if (k8 != null) {
            k8.clear();
        }
        if ((k8 = this.c) != null) {
            k8.clear();
        }
    }

    final void f(int n8) {
        if (this.b != null) {
            int n9 = 0;
            while (n9 < this.b.size()) {
                int n10 = n9;
                if (this.b.f(n9).getGroupId() == n8) {
                    this.b.i(n9);
                    n10 = n9 - 1;
                }
                n9 = n10 + 1;
            }
        }
    }

    final void g(int n8) {
        if (this.b != null) {
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                if (this.b.f(i8).getItemId() != n8) continue;
                this.b.i(i8);
                return;
            }
        }
    }
}

