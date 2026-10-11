/*
 * Decompiled with CFR 0.152.
 */
package ax.t;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import ax.c0.b;
import java.lang.reflect.Method;

public class c
extends ax.t.b
implements MenuItem {
    private final ax.V.b d;
    private Method e;

    public c(Context context, ax.V.b b8) {
        super(context);
        if (b8 != null) {
            this.d = b8;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        ax.c0.b b8 = this.d.b();
        if (b8 instanceof a) {
            return ((a)b8).e;
        }
        return null;
    }

    public View getActionView() {
        View view;
        View view2 = view = this.d.getActionView();
        if (view instanceof b) {
            view2 = ((b)view).a();
        }
        return view2;
    }

    public int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public int getGroupId() {
        return this.d.getGroupId();
    }

    public Drawable getIcon() {
        return this.d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.d.getIntent();
    }

    public int getItemId() {
        return this.d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public int getOrder() {
        return this.d.getOrder();
    }

    public SubMenu getSubMenu() {
        return this.d(this.d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(boolean bl) {
        Exception exception2;
        block3: {
            block2: {
                try {
                    if (this.e != null) break block2;
                    this.e = this.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            this.e.invoke(this.d, bl);
            return;
        }
        Log.w((String)"MenuItemWrapper", (String)"Error while calling setExclusiveCheckable", (Throwable)exception2);
    }

    public boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.d.isCheckable();
    }

    public boolean isChecked() {
        return this.d.isChecked();
    }

    public boolean isEnabled() {
        return this.d.isEnabled();
    }

    public boolean isVisible() {
        return this.d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider object) {
        a a8 = new a(this, this.a, (ActionProvider)object);
        ax.V.b b8 = this.d;
        object = object != null ? a8 : null;
        b8.a((ax.c0.b)object);
        return this;
    }

    public MenuItem setActionView(int n8) {
        this.d.setActionView(n8);
        View view = this.d.getActionView();
        if (view instanceof CollapsibleActionView) {
            this.d.setActionView((View)new b(view));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        Object object = view;
        if (view instanceof CollapsibleActionView) {
            object = new b(view);
        }
        this.d.setActionView((View)object);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c8) {
        this.d.setAlphabeticShortcut(c8);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c8, int n8) {
        this.d.setAlphabeticShortcut(c8, n8);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        this.d.setCheckable(bl);
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        this.d.setChecked(bl);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        this.d.setEnabled(bl);
        return this;
    }

    public MenuItem setIcon(int n8) {
        this.d.setIcon(n8);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c8) {
        this.d.setNumericShortcut(c8);
        return this;
    }

    public MenuItem setNumericShortcut(char c8, int n8) {
        this.d.setNumericShortcut(c8, n8);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ax.V.b b8 = this.d;
        onActionExpandListener = onActionExpandListener != null ? new c(this, onActionExpandListener) : null;
        b8.setOnActionExpandListener(onActionExpandListener);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ax.V.b b8 = this.d;
        onMenuItemClickListener = onMenuItemClickListener != null ? new d(this, onMenuItemClickListener) : null;
        b8.setOnMenuItemClickListener(onMenuItemClickListener);
        return this;
    }

    public MenuItem setShortcut(char c8, char c9) {
        this.d.setShortcut(c8, c9);
        return this;
    }

    public MenuItem setShortcut(char c8, char c9, int n8, int n9) {
        this.d.setShortcut(c8, c9, n8, n9);
        return this;
    }

    public void setShowAsAction(int n8) {
        this.d.setShowAsAction(n8);
    }

    public MenuItem setShowAsActionFlags(int n8) {
        this.d.setShowAsActionFlags(n8);
        return this;
    }

    public MenuItem setTitle(int n8) {
        this.d.setTitle(n8);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        return this.d.setVisible(bl);
    }

    private class a
    extends ax.c0.b
    implements ActionProvider.VisibilityListener {
        private b.b d;
        private final ActionProvider e;
        final c f;

        a(c c8, Context context, ActionProvider actionProvider) {
            this.f = c8;
            super(context);
            this.e = actionProvider;
        }

        @Override
        public boolean a() {
            return this.e.hasSubMenu();
        }

        @Override
        public boolean b() {
            return this.e.isVisible();
        }

        @Override
        public View c() {
            return this.e.onCreateActionView();
        }

        @Override
        public View d(MenuItem menuItem) {
            return this.e.onCreateActionView(menuItem);
        }

        @Override
        public boolean e() {
            return this.e.onPerformDefaultAction();
        }

        @Override
        public void f(SubMenu subMenu) {
            this.e.onPrepareSubMenu(this.f.d(subMenu));
        }

        @Override
        public boolean g() {
            return this.e.overridesItemVisibility();
        }

        @Override
        public void j(b.b object) {
            this.d = object;
            ActionProvider actionProvider = this.e;
            object = object != null ? this : null;
            actionProvider.setVisibilityListener((ActionProvider.VisibilityListener)object);
        }

        public void onActionProviderVisibilityChanged(boolean bl) {
            b.b b8 = this.d;
            if (b8 != null) {
                b8.onActionProviderVisibilityChanged(bl);
            }
        }
    }

    static class b
    extends FrameLayout
    implements ax.s.b {
        final CollapsibleActionView a;

        b(View view) {
            super(view.getContext());
            this.a = (CollapsibleActionView)view;
            this.addView(view);
        }

        View a() {
            return (View)this.a;
        }

        @Override
        public void c() {
            this.a.onActionViewExpanded();
        }

        @Override
        public void f() {
            this.a.onActionViewCollapsed();
        }
    }

    private class c
    implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;
        final c b;

        c(c c8, MenuItem.OnActionExpandListener onActionExpandListener) {
            this.b = c8;
            this.a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(this.b.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(this.b.c(menuItem));
        }
    }

    private class d
    implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener a;
        final c b;

        d(c c8, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.b = c8;
            this.a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(this.b.c(menuItem));
        }
    }
}

