/*
 * Decompiled with CFR 0.152.
 */
package ax.V;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

public interface b
extends MenuItem {
    public b a(ax.c0.b var1);

    public ax.c0.b b();

    public boolean collapseActionView();

    public boolean expandActionView();

    public View getActionView();

    public int getAlphabeticModifiers();

    public CharSequence getContentDescription();

    public ColorStateList getIconTintList();

    public PorterDuff.Mode getIconTintMode();

    public int getNumericModifiers();

    public CharSequence getTooltipText();

    public boolean isActionViewExpanded();

    public MenuItem setActionView(int var1);

    public MenuItem setActionView(View var1);

    public MenuItem setAlphabeticShortcut(char var1, int var2);

    public b setContentDescription(CharSequence var1);

    public MenuItem setIconTintList(ColorStateList var1);

    public MenuItem setIconTintMode(PorterDuff.Mode var1);

    public MenuItem setNumericShortcut(char var1, int var2);

    public MenuItem setShortcut(char var1, char var2, int var3, int var4);

    public void setShowAsAction(int var1);

    public MenuItem setShowAsActionFlags(int var1);

    public b setTooltipText(CharSequence var1);
}

