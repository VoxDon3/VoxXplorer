/*
 * Decompiled with CFR 0.152.
 */
package ax.t;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ax.c0.b;

public class a
implements ax.V.b {
    private final int a;
    private final int b;
    private final int c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private int h = 4096;
    private char i;
    private int j = 4096;
    private Drawable k;
    private Context l;
    private MenuItem.OnMenuItemClickListener m;
    private CharSequence n;
    private CharSequence o;
    private ColorStateList p = null;
    private PorterDuff.Mode q = null;
    private boolean r = false;
    private boolean s = false;
    private int t = 16;

    public a(Context context, int n8, int n9, int n10, int n11, CharSequence charSequence) {
        this.l = context;
        this.a = n9;
        this.b = n8;
        this.c = n11;
        this.d = charSequence;
    }

    private void c() {
        Drawable drawable = this.k;
        if (drawable != null && (this.r || this.s)) {
            this.k = drawable = ax.U.a.r(drawable);
            this.k = drawable = drawable.mutate();
            if (this.r) {
                ax.U.a.o(drawable, this.p);
            }
            if (this.s) {
                ax.U.a.p(this.k, this.q);
            }
        }
    }

    @Override
    public ax.V.b a(b b8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public b b() {
        return null;
    }

    @Override
    public boolean collapseActionView() {
        return false;
    }

    public ax.V.b d(int n8) {
        throw new UnsupportedOperationException();
    }

    public ax.V.b e(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean expandActionView() {
        return false;
    }

    public ax.V.b f(int n8) {
        this.setShowAsAction(n8);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public View getActionView() {
        return null;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.j;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override
    public CharSequence getContentDescription() {
        return this.n;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.p;
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.q;
    }

    public Intent getIntent() {
        return this.f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public int getNumericModifiers() {
        return this.h;
    }

    public char getNumericShortcut() {
        return this.g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        return this.d;
    }

    @Override
    public CharSequence getTooltipText() {
        return this.o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.t & 0x10) != 0;
    }

    public boolean isVisible() {
        return (this.t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c8) {
        this.i = Character.toLowerCase(c8);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c8, int n8) {
        this.i = Character.toLowerCase(c8);
        this.j = KeyEvent.normalizeMetaState((int)n8);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        this.t = bl | this.t & 0xFFFFFFFE;
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        int n8 = this.t;
        int n9 = bl ? 2 : 0;
        this.t = n9 | n8 & 0xFFFFFFFD;
        return this;
    }

    @Override
    public ax.V.b setContentDescription(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        int n8 = this.t;
        int n9 = bl ? 16 : 0;
        this.t = n9 | n8 & 0xFFFFFFEF;
        return this;
    }

    public MenuItem setIcon(int n8) {
        this.k = ax.Q.b.e(this.l, n8);
        this.c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        this.c();
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.p = colorStateList;
        this.r = true;
        this.c();
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.q = mode;
        this.s = true;
        this.c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c8) {
        this.g = c8;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c8, int n8) {
        this.g = c8;
        this.h = KeyEvent.normalizeMetaState((int)n8);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c8, char c9) {
        this.g = c8;
        this.i = Character.toLowerCase(c9);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c8, char c9, int n8, int n9) {
        this.g = c8;
        this.h = KeyEvent.normalizeMetaState((int)n8);
        this.i = Character.toLowerCase(c9);
        this.j = KeyEvent.normalizeMetaState((int)n9);
        return this;
    }

    @Override
    public void setShowAsAction(int n8) {
    }

    public MenuItem setTitle(int n8) {
        this.d = this.l.getResources().getString(n8);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    @Override
    public ax.V.b setTooltipText(CharSequence charSequence) {
        this.o = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        int n8 = this.t;
        int n9 = 8;
        if (bl) {
            n9 = 0;
        }
        this.t = n8 & 8 | n9;
        return this;
    }
}

