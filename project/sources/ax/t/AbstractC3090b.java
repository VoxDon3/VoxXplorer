package ax.t;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import ax.B.k;

/* renamed from: ax.t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3090b {
    final Context a;
    private k<ax.V.b, MenuItem> b;
    private k<ax.V.c, SubMenu> c;

    AbstractC3090b(Context context) {
        this.a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof ax.V.b)) {
            return menuItem;
        }
        ax.V.b bVar = (ax.V.b) menuItem;
        if (this.b == null) {
            this.b = new k<>();
        }
        MenuItem menuItem2 = this.b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC3091c menuItemC3091c = new MenuItemC3091c(this.a, bVar);
        this.b.put(bVar, menuItemC3091c);
        return menuItemC3091c;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof ax.V.c)) {
            return subMenu;
        }
        ax.V.c cVar = (ax.V.c) subMenu;
        if (this.c == null) {
            this.c = new k<>();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC3094f subMenuC3094f = new SubMenuC3094f(this.a, cVar);
        this.c.put(cVar, subMenuC3094f);
        return subMenuC3094f;
    }

    final void e() {
        k<ax.V.b, MenuItem> kVar = this.b;
        if (kVar != null) {
            kVar.clear();
        }
        k<ax.V.c, SubMenu> kVar2 = this.c;
        if (kVar2 != null) {
            kVar2.clear();
        }
    }

    final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (this.b.f(i2).getGroupId() == i) {
                this.b.i(i2);
                i2--;
            }
            i2++;
        }
    }

    final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.f(i2).getItemId() == i) {
                this.b.i(i2);
                return;
            }
        }
    }
}
