/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import ax.U.a;
import ax.V.b;
import ax.c0.b;
import ax.m.h;

public final class g
implements b {
    private View A;
    private ax.c0.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private int i = 4096;
    private char j;
    private int k = 4096;
    private Drawable l;
    private int m = 0;
    e n;
    private m o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private int z;

    g(e e8, int n8, int n9, int n10, int n11, CharSequence charSequence, int n12) {
        this.n = e8;
        this.a = n9;
        this.b = n8;
        this.c = n10;
        this.d = n11;
        this.e = charSequence;
        this.z = n12;
    }

    private static void d(StringBuilder stringBuilder, int n8, int n9, String string) {
        if ((n8 & n9) == n9) {
            stringBuilder.append(string);
        }
    }

    private Drawable e(Drawable drawable) {
        Drawable drawable2;
        block5: {
            block6: {
                drawable2 = drawable;
                if (drawable == null) break block5;
                drawable2 = drawable;
                if (!this.x) break block5;
                if (this.v) break block6;
                drawable2 = drawable;
                if (!this.w) break block5;
            }
            drawable2 = ax.U.a.r(drawable).mutate();
            if (this.v) {
                ax.U.a.o(drawable2, this.t);
            }
            if (this.w) {
                ax.U.a.p(drawable2, this.u);
            }
            this.x = false;
        }
        return drawable2;
    }

    boolean A() {
        return this.n.I() && this.g() != '\u0000';
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override
    public b a(ax.c0.b b8) {
        ax.c0.b b9 = this.B;
        if (b9 != null) {
            b9.h();
        }
        this.A = null;
        this.B = b8;
        this.n.L(true);
        b8 = this.B;
        if (b8 != null) {
            b8.j(new b.b(this){
                final g a;
                {
                    this.a = g8;
                }

                @Override
                public void onActionProviderVisibilityChanged(boolean bl) {
                    g g8 = this.a;
                    g8.n.K(g8);
                }
            });
        }
        return this;
    }

    @Override
    public ax.c0.b b() {
        return this.B;
    }

    public void c() {
        this.n.J(this);
    }

    @Override
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse((MenuItem)this)) {
            return false;
        }
        return this.n.f(this);
    }

    @Override
    public boolean expandActionView() {
        if (!this.j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand((MenuItem)this)) {
            return false;
        }
        return this.n.k(this);
    }

    public int f() {
        return this.d;
    }

    char g() {
        if (this.n.H()) {
            return this.j;
        }
        return this.h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public View getActionView() {
        Object object = this.A;
        if (object != null) {
            return object;
        }
        object = this.B;
        if (object != null) {
            object = ((ax.c0.b)object).d(this);
            this.A = object;
            return object;
        }
        return null;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override
    public CharSequence getContentDescription() {
        return this.r;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return this.e(drawable);
        }
        if (this.m != 0) {
            drawable = ax.o.a.b(this.n.u(), this.m);
            this.m = 0;
            this.l = drawable;
            return this.e(drawable);
        }
        return null;
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    public Intent getIntent() {
        return this.g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override
    public int getNumericModifiers() {
        return this.i;
    }

    public char getNumericShortcut() {
        return this.h;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.e;
    }

    @Override
    public CharSequence getTooltipText() {
        return this.s;
    }

    String h() {
        char c8 = this.g();
        if (c8 == '\u0000') {
            return "";
        }
        Resources resources = this.n.u().getResources();
        StringBuilder stringBuilder = new StringBuilder();
        if (ViewConfiguration.get((Context)this.n.u()).hasPermanentMenuKey()) {
            stringBuilder.append(resources.getString(ax.m.h.m));
        }
        int n8 = this.n.H() ? this.k : this.i;
        androidx.appcompat.view.menu.g.d(stringBuilder, n8, 65536, resources.getString(ax.m.h.i));
        androidx.appcompat.view.menu.g.d(stringBuilder, n8, 4096, resources.getString(ax.m.h.e));
        androidx.appcompat.view.menu.g.d(stringBuilder, n8, 2, resources.getString(ax.m.h.d));
        androidx.appcompat.view.menu.g.d(stringBuilder, n8, 1, resources.getString(ax.m.h.j));
        androidx.appcompat.view.menu.g.d(stringBuilder, n8, 4, resources.getString(ax.m.h.l));
        androidx.appcompat.view.menu.g.d(stringBuilder, n8, 8, resources.getString(ax.m.h.h));
        if (c8 != '\b') {
            if (c8 != '\n') {
                if (c8 != ' ') {
                    stringBuilder.append(c8);
                } else {
                    stringBuilder.append(resources.getString(ax.m.h.k));
                }
            } else {
                stringBuilder.append(resources.getString(ax.m.h.g));
            }
        } else {
            stringBuilder.append(resources.getString(ax.m.h.f));
        }
        return stringBuilder.toString();
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    CharSequence i(k.a a8) {
        if (a8 != null && a8.d()) {
            return this.getTitleCondensed();
        }
        return this.getTitle();
    }

    @Override
    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.y & 0x10) != 0;
    }

    public boolean isVisible() {
        ax.c0.b b8 = this.B;
        if (b8 != null && b8.g()) {
            return (this.y & 8) == 0 && this.B.b();
        }
        return (this.y & 8) == 0;
    }

    public boolean j() {
        if ((this.z & 8) != 0) {
            ax.c0.b b8;
            if (this.A == null && (b8 = this.B) != null) {
                this.A = b8.d(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        Object object = this.q;
        if (object != null && object.onMenuItemClick((MenuItem)this)) {
            return true;
        }
        object = this.n;
        if (((e)object).h((e)object, this)) {
            return true;
        }
        object = this.p;
        if (object != null) {
            object.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.u().startActivity(this.g);
                return true;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                Log.e((String)"MenuItemImpl", (String)"Can't find activity to handle intent; ignoring", (Throwable)activityNotFoundException);
            }
        }
        return (object = this.B) != null && ((ax.c0.b)object).e();
    }

    public boolean l() {
        return (this.y & 0x20) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public b p(int n8) {
        Context context = this.n.u();
        this.q(LayoutInflater.from((Context)context).inflate(n8, (ViewGroup)new LinearLayout(context), false));
        return this;
    }

    public b q(View view) {
        int n8;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (n8 = this.a) > 0) {
            view.setId(n8);
        }
        this.n.J(this);
        return this;
    }

    public void r(boolean bl) {
        this.D = bl;
        this.n.L(false);
    }

    void s(boolean bl) {
        int n8 = this.y;
        int n9 = bl ? 2 : 0;
        this.y = n9 |= n8 & 0xFFFFFFFD;
        if (n8 != n9) {
            this.n.L(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c8) {
        if (this.j == c8) {
            return this;
        }
        this.j = Character.toLowerCase(c8);
        this.n.L(false);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c8, int n8) {
        if (this.j == c8 && this.k == n8) {
            return this;
        }
        this.j = Character.toLowerCase(c8);
        this.k = KeyEvent.normalizeMetaState((int)n8);
        this.n.L(false);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        int n8;
        int n9 = this.y;
        this.y = n8 = bl | n9 & 0xFFFFFFFE;
        if (n9 != n8) {
            this.n.L(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        if ((this.y & 4) != 0) {
            this.n.U(this);
            return this;
        }
        this.s(bl);
        return this;
    }

    @Override
    public b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.L(false);
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        this.y = bl ? (this.y |= 0x10) : (this.y &= 0xFFFFFFEF);
        this.n.L(false);
        return this;
    }

    public MenuItem setIcon(int n8) {
        this.l = null;
        this.m = n8;
        this.x = true;
        this.n.L(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.L(false);
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.L(false);
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.L(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c8) {
        if (this.h == c8) {
            return this;
        }
        this.h = c8;
        this.n.L(false);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c8, int n8) {
        if (this.h == c8 && this.i == n8) {
            return this;
        }
        this.h = c8;
        this.i = KeyEvent.normalizeMetaState((int)n8);
        this.n.L(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c8, char c9) {
        this.h = c8;
        this.j = Character.toLowerCase(c9);
        this.n.L(false);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c8, char c9, int n8, int n9) {
        this.h = c8;
        this.i = KeyEvent.normalizeMetaState((int)n8);
        this.j = Character.toLowerCase(c9);
        this.k = KeyEvent.normalizeMetaState((int)n9);
        this.n.L(false);
        return this;
    }

    @Override
    public void setShowAsAction(int n8) {
        int n9 = n8 & 3;
        if (n9 != 0 && n9 != 1 && n9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = n8;
        this.n.J(this);
    }

    public MenuItem setTitle(int n8) {
        return this.setTitle(this.n.u().getString(n8));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.L(false);
        m m8 = this.o;
        if (m8 != null) {
            m8.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.L(false);
        return this;
    }

    @Override
    public b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.L(false);
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        if (this.y(bl)) {
            this.n.K(this);
        }
        return this;
    }

    public void t(boolean bl) {
        int n8 = this.y;
        int n9 = bl ? 4 : 0;
        this.y = n9 | n8 & 0xFFFFFFFB;
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean bl) {
        if (bl) {
            this.y |= 0x20;
            return;
        }
        this.y &= 0xFFFFFFDF;
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public b w(int n8) {
        this.setShowAsAction(n8);
        return this;
    }

    public void x(m m8) {
        this.o = m8;
        m8.setHeaderTitle(this.getTitle());
    }

    boolean y(boolean bl) {
        int n8 = this.y;
        int n9 = bl ? 0 : 8;
        this.y = n9 |= n8 & 0xFFFFFFF7;
        return n8 != n9;
    }

    public boolean z() {
        return this.n.A();
    }
}

