/*
 * Decompiled with CFR 0.152.
 */
package ax.t;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import ax.V.a;
import ax.t.b;

public class d
extends b
implements Menu {
    private final a d;

    public d(Context context, a a8) {
        super(context);
        if (a8 != null) {
            this.d = a8;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int n8) {
        return this.c(this.d.add(n8));
    }

    public MenuItem add(int n8, int n9, int n10, int n11) {
        return this.c(this.d.add(n8, n9, n10, n11));
    }

    public MenuItem add(int n8, int n9, int n10, CharSequence charSequence) {
        return this.c(this.d.add(n8, n9, n10, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return this.c(this.d.add(charSequence));
    }

    public int addIntentOptions(int n8, int n9, int n10, ComponentName componentName, Intent[] intentArray, Intent intent, int n11, MenuItem[] menuItemArray) {
        MenuItem[] menuItemArray2 = menuItemArray != null ? new MenuItem[menuItemArray.length] : null;
        n9 = this.d.addIntentOptions(n8, n9, n10, componentName, intentArray, intent, n11, menuItemArray2);
        if (menuItemArray2 != null) {
            n10 = menuItemArray2.length;
            for (n8 = 0; n8 < n10; ++n8) {
                menuItemArray[n8] = this.c(menuItemArray2[n8]);
            }
        }
        return n9;
    }

    public SubMenu addSubMenu(int n8) {
        return this.d(this.d.addSubMenu(n8));
    }

    public SubMenu addSubMenu(int n8, int n9, int n10, int n11) {
        return this.d(this.d.addSubMenu(n8, n9, n10, n11));
    }

    public SubMenu addSubMenu(int n8, int n9, int n10, CharSequence charSequence) {
        return this.d(this.d.addSubMenu(n8, n9, n10, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.d(this.d.addSubMenu(charSequence));
    }

    public void clear() {
        this.e();
        this.d.clear();
    }

    public void close() {
        this.d.close();
    }

    public MenuItem findItem(int n8) {
        return this.c(this.d.findItem(n8));
    }

    public MenuItem getItem(int n8) {
        return this.c(this.d.getItem(n8));
    }

    public boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public boolean isShortcutKey(int n8, KeyEvent keyEvent) {
        return this.d.isShortcutKey(n8, keyEvent);
    }

    public boolean performIdentifierAction(int n8, int n9) {
        return this.d.performIdentifierAction(n8, n9);
    }

    public boolean performShortcut(int n8, KeyEvent keyEvent, int n9) {
        return this.d.performShortcut(n8, keyEvent, n9);
    }

    public void removeGroup(int n8) {
        this.f(n8);
        this.d.removeGroup(n8);
    }

    public void removeItem(int n8) {
        this.g(n8);
        this.d.removeItem(n8);
    }

    public void setGroupCheckable(int n8, boolean bl, boolean bl2) {
        this.d.setGroupCheckable(n8, bl, bl2);
    }

    public void setGroupEnabled(int n8, boolean bl) {
        this.d.setGroupEnabled(n8, bl);
    }

    public void setGroupVisible(int n8, boolean bl) {
        this.d.setGroupVisible(n8, bl);
    }

    public void setQwertyMode(boolean bl) {
        this.d.setQwertyMode(bl);
    }

    public int size() {
        return this.d.size();
    }
}

