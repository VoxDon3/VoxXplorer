/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class A {
    @Deprecated
    public static View a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static MenuItem b(MenuItem menuItem, ax.c0.b b8) {
        if (menuItem instanceof ax.V.b) {
            return ((ax.V.b)menuItem).a(b8);
        }
        Log.w((String)"MenuItemCompat", (String)"setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void c(MenuItem menuItem, char c8, int n8) {
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b)menuItem).setAlphabeticShortcut(c8, n8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c8, n8);
        }
    }

    public static void d(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b)menuItem).setContentDescription(charSequence);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void e(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b)menuItem).setIconTintList(colorStateList);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void f(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b)menuItem).setIconTintMode(mode);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void g(MenuItem menuItem, char c8, int n8) {
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b)menuItem).setNumericShortcut(c8, n8);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c8, n8);
        }
    }

    @Deprecated
    public static MenuItem h(MenuItem menuItem, c c8) {
        return menuItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener(c8){
            final c a;
            {
                this.a = c8;
            }

            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                return this.a.onMenuItemActionCollapse(menuItem);
            }

            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return this.a.onMenuItemActionExpand(menuItem);
            }
        });
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b)menuItem).setTooltipText(charSequence);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }

    static class b {
        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static MenuItem g(MenuItem menuItem, char c8, int n8) {
            return menuItem.setAlphabeticShortcut(c8, n8);
        }

        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem k(MenuItem menuItem, char c8, int n8) {
            return menuItem.setNumericShortcut(c8, n8);
        }

        static MenuItem l(MenuItem menuItem, char c8, char c9, int n8, int n9) {
            return menuItem.setShortcut(c8, c9, n8, n9);
        }

        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    public static interface c {
        public boolean onMenuItemActionCollapse(MenuItem var1);

        public boolean onMenuItemActionExpand(MenuItem var1);
    }
}

