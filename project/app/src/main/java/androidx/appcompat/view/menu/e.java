/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import ax.c0.h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class e
implements ax.V.a {
    private static final int[] A = new int[]{1, 4, 5, 3, 2, 0};
    private final Context a;
    private final Resources b;
    private boolean c;
    private boolean d;
    private a e;
    private ArrayList<g> f;
    private ArrayList<g> g;
    private boolean h;
    private ArrayList<g> i;
    private ArrayList<g> j;
    private boolean k;
    private int l = 0;
    private ContextMenu.ContextMenuInfo m;
    CharSequence n;
    Drawable o;
    View p;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<g> v = new ArrayList();
    private CopyOnWriteArrayList<WeakReference<j>> w = new CopyOnWriteArrayList();
    private g x;
    private boolean y = false;
    private boolean z;

    public e(Context context) {
        this.a = context;
        this.b = context.getResources();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        this.d0(true);
    }

    private static int B(int n8) {
        int[] nArray;
        int n9 = (0xFFFF0000 & n8) >> 16;
        if (n9 >= 0 && n9 < (nArray = A).length) {
            return n8 & 0xFFFF | nArray[n9] << 16;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int n8, boolean bl) {
        if (n8 >= 0 && n8 < this.f.size()) {
            this.f.remove(n8);
            if (bl) {
                this.L(true);
            }
        }
    }

    private void X(int n8, CharSequence charSequence, int n9, Drawable drawable, View view) {
        Resources resources = this.C();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (n8 > 0) {
                this.n = resources.getText(n8);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (n9 > 0) {
                this.o = ax.Q.b.e(this.u(), n9);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        this.L(false);
    }

    private void d0(boolean bl) {
        block3: {
            block2: {
                if (!bl) break block2;
                int n8 = this.b.getConfiguration().keyboard;
                bl = true;
                if (n8 != 1 && h0.l(ViewConfiguration.get((Context)this.a), this.a)) break block3;
            }
            bl = false;
        }
        this.d = bl;
    }

    private g g(int n8, int n9, int n10, int n11, CharSequence charSequence, int n12) {
        return new g(this, n8, n9, n10, n11, charSequence, n12);
    }

    private void i(boolean bl) {
        if (this.w.isEmpty()) {
            return;
        }
        this.f0();
        for (WeakReference<j> weakReference : this.w) {
            j j8 = (j)weakReference.get();
            if (j8 == null) {
                this.w.remove(weakReference);
                continue;
            }
            j8.d(bl);
        }
        this.e0();
    }

    private boolean j(m m8, j object) {
        boolean bl = this.w.isEmpty();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (object != null) {
            bl2 = object.k(m8);
        }
        for (WeakReference<j> weakReference : this.w) {
            j j8 = (j)weakReference.get();
            if (j8 == null) {
                this.w.remove(weakReference);
                continue;
            }
            if (bl2) continue;
            bl2 = j8.k(m8);
        }
        return bl2;
    }

    private static int n(ArrayList<g> arrayList, int n8) {
        for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
            if (arrayList.get(i8).f() > n8) continue;
            return i8 + 1;
        }
        return 0;
    }

    boolean A() {
        return this.t;
    }

    Resources C() {
        return this.b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int n8 = this.f.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            g g8 = this.f.get(i8);
            if (!g8.isVisible()) continue;
            this.g.add(g8);
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean F() {
        return this.q ^ true;
    }

    public boolean G() {
        return this.y;
    }

    boolean H() {
        return this.c;
    }

    public boolean I() {
        return this.d;
    }

    void J(g g8) {
        this.k = true;
        this.L(true);
    }

    void K(g g8) {
        this.h = true;
        this.L(true);
    }

    public void L(boolean bl) {
        if (!this.q) {
            if (bl) {
                this.h = true;
                this.k = true;
            }
            this.i(bl);
            return;
        }
        this.r = true;
        if (bl) {
            this.s = true;
        }
    }

    public boolean M(MenuItem menuItem, int n8) {
        return this.N(menuItem, null, n8);
    }

    public boolean N(MenuItem object, j j8, int n8) {
        Object object2 = (g)object;
        if (object2 != null && ((g)object2).isEnabled()) {
            boolean bl = ((g)object2).k();
            object = ((g)object2).b();
            boolean bl2 = object != null && ((ax.c0.b)object).a();
            if (((g)object2).j()) {
                bl = ((g)object2).expandActionView() | bl;
                if (bl) {
                    this.e(true);
                }
                return bl;
            }
            if (!((g)object2).hasSubMenu() && !bl2) {
                if ((n8 & 1) == 0) {
                    this.e(true);
                }
                return bl;
            }
            if ((n8 & 4) == 0) {
                this.e(false);
            }
            if (!((g)object2).hasSubMenu()) {
                ((g)object2).x(new m(this.u(), this, (g)object2));
            }
            object2 = (m)((g)object2).getSubMenu();
            if (bl2) {
                ((ax.c0.b)object).f((SubMenu)object2);
            }
            if (!(bl = this.j((m)object2, j8) | bl)) {
                this.e(true);
            }
            return bl;
        }
        return false;
    }

    public void P(j j8) {
        for (WeakReference<j> weakReference : this.w) {
            j j9 = (j)weakReference.get();
            if (j9 != null && j9 != j8) continue;
            this.w.remove(weakReference);
        }
    }

    public void Q(Bundle bundle) {
        if (bundle != null) {
            int n8;
            SparseArray sparseArray = bundle.getSparseParcelableArray(this.t());
            int n9 = this.size();
            for (n8 = 0; n8 < n9; ++n8) {
                MenuItem menuItem = this.getItem(n8);
                View view = menuItem.getActionView();
                if (view != null && view.getId() != -1) {
                    view.restoreHierarchyState(sparseArray);
                }
                if (!menuItem.hasSubMenu()) continue;
                ((m)menuItem.getSubMenu()).Q(bundle);
            }
            n8 = bundle.getInt("android:menu:expandedactionview");
            if (n8 > 0 && (bundle = this.findItem(n8)) != null) {
                bundle.expandActionView();
            }
        }
    }

    public void R(Bundle bundle) {
        int n8 = this.size();
        SparseArray sparseArray = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            MenuItem menuItem = this.getItem(i8);
            View view = menuItem.getActionView();
            SparseArray sparseArray2 = sparseArray;
            if (view != null) {
                sparseArray2 = sparseArray;
                if (view.getId() != -1) {
                    SparseArray sparseArray3 = sparseArray;
                    if (sparseArray == null) {
                        sparseArray3 = new SparseArray();
                    }
                    view.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (menuItem.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (menuItem.hasSubMenu()) {
                ((m)menuItem.getSubMenu()).R(bundle);
            }
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.t(), sparseArray);
        }
    }

    public void S(a a8) {
        this.e = a8;
    }

    public e T(int n8) {
        this.l = n8;
        return this;
    }

    void U(MenuItem menuItem) {
        int n8 = menuItem.getGroupId();
        int n9 = this.f.size();
        this.f0();
        for (int i8 = 0; i8 < n9; ++i8) {
            g g8 = this.f.get(i8);
            if (g8.getGroupId() != n8 || !g8.m() || !g8.isCheckable()) continue;
            boolean bl = g8 == menuItem;
            g8.s(bl);
        }
        this.e0();
    }

    protected e V(int n8) {
        this.X(0, null, n8, null, null);
        return this;
    }

    protected e W(Drawable drawable) {
        this.X(0, null, 0, drawable, null);
        return this;
    }

    protected e Y(int n8) {
        this.X(n8, null, 0, null, null);
        return this;
    }

    protected e Z(CharSequence charSequence) {
        this.X(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuItem a(int n8, int n9, int n10, CharSequence object) {
        int n11 = androidx.appcompat.view.menu.e.B(n10);
        object = this.g(n8, n9, n10, n11, (CharSequence)object, this.l);
        Object object2 = this.m;
        if (object2 != null) {
            ((g)object).v((ContextMenu.ContextMenuInfo)object2);
        }
        object2 = this.f;
        ((ArrayList)object2).add(androidx.appcompat.view.menu.e.n((ArrayList<g>)object2, n11), object);
        this.L(true);
        return object;
    }

    protected e a0(View view) {
        this.X(0, null, 0, null, view);
        return this;
    }

    public MenuItem add(int n8) {
        return this.a(0, 0, 0, this.b.getString(n8));
    }

    public MenuItem add(int n8, int n9, int n10, int n11) {
        return this.a(n8, n9, n10, this.b.getString(n11));
    }

    public MenuItem add(int n8, int n9, int n10, CharSequence charSequence) {
        return this.a(n8, n9, n10, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return this.a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int n8, int n9, int n10, ComponentName componentName, Intent[] intentArray, Intent intent, int n11, MenuItem[] menuItemArray) {
        PackageManager packageManager = this.a.getPackageManager();
        int n12 = 0;
        List list = packageManager.queryIntentActivityOptions(componentName, intentArray, intent, 0);
        int n13 = list != null ? list.size() : 0;
        int n14 = n12;
        if ((n11 & 1) == 0) {
            this.removeGroup(n8);
            n14 = n12;
        }
        while (n14 < n13) {
            ResolveInfo resolveInfo = (ResolveInfo)list.get(n14);
            n11 = resolveInfo.specificIndex;
            componentName = n11 < 0 ? intent : intentArray[n11];
            componentName = new Intent((Intent)componentName);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            componentName.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            componentName = this.add(n8, n9, n10, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent((Intent)componentName);
            if (menuItemArray != null && (n11 = resolveInfo.specificIndex) >= 0) {
                menuItemArray[n11] = componentName;
            }
            ++n14;
        }
        return n13;
    }

    public SubMenu addSubMenu(int n8) {
        return this.addSubMenu(0, 0, 0, this.b.getString(n8));
    }

    public SubMenu addSubMenu(int n8, int n9, int n10, int n11) {
        return this.addSubMenu(n8, n9, n10, this.b.getString(n11));
    }

    public SubMenu addSubMenu(int n8, int n9, int n10, CharSequence object) {
        object = (g)this.a(n8, n9, n10, (CharSequence)object);
        m m8 = new m(this.a, this, (g)object);
        ((g)object).x(m8);
        return m8;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j j8) {
        this.c(j8, this.a);
    }

    public void b0(boolean bl) {
        this.t = bl;
    }

    public void c(j j8, Context context) {
        this.w.add(new WeakReference<j>(j8));
        j8.i(context, this);
        this.k = true;
    }

    public void c0(boolean bl) {
        this.z = bl;
    }

    public void clear() {
        g g8 = this.x;
        if (g8 != null) {
            this.f(g8);
        }
        this.f.clear();
        this.L(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        this.L(false);
    }

    public void close() {
        this.e(true);
    }

    public void d() {
        a a8 = this.e;
        if (a8 != null) {
            a8.b(this);
        }
    }

    public final void e(boolean bl) {
        if (this.u) {
            return;
        }
        this.u = true;
        for (WeakReference<j> weakReference : this.w) {
            j j8 = (j)weakReference.get();
            if (j8 == null) {
                this.w.remove(weakReference);
                continue;
            }
            j8.a(this, bl);
        }
        this.u = false;
    }

    public void e0() {
        this.q = false;
        if (this.r) {
            this.r = false;
            this.L(this.s);
        }
    }

    public boolean f(g g8) {
        boolean bl = this.w.isEmpty();
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            if (this.x != g8) {
                bl4 = bl2;
            } else {
                this.f0();
                Iterator<WeakReference<j>> iterator = this.w.iterator();
                bl4 = bl3;
                while (true) {
                    bl2 = bl4;
                    if (!iterator.hasNext()) break;
                    WeakReference<j> weakReference = iterator.next();
                    j j8 = (j)weakReference.get();
                    if (j8 == null) {
                        this.w.remove(weakReference);
                        continue;
                    }
                    bl4 = bl2 = j8.f(this, g8);
                    if (bl2) break;
                }
                this.e0();
                bl4 = bl2;
                if (bl2) {
                    this.x = null;
                    bl4 = bl2;
                }
            }
        }
        return bl4;
    }

    public void f0() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public MenuItem findItem(int n8) {
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            g g8 = this.f.get(i8);
            if (g8.getItemId() == n8) {
                return g8;
            }
            if (!g8.hasSubMenu() || (g8 = g8.getSubMenu().findItem(n8)) == null) continue;
            return g8;
        }
        return null;
    }

    public MenuItem getItem(int n8) {
        return this.f.get(n8);
    }

    boolean h(e e8, MenuItem menuItem) {
        a a8 = this.e;
        return a8 != null && a8.a(e8, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!this.f.get(i8).isVisible()) continue;
            return true;
        }
        return false;
    }

    public boolean isShortcutKey(int n8, KeyEvent keyEvent) {
        return this.p(n8, keyEvent) != null;
    }

    public boolean k(g g8) {
        boolean bl = this.w.isEmpty();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        this.f0();
        Iterator<WeakReference<j>> iterator = this.w.iterator();
        while (true) {
            bl = bl2;
            if (!iterator.hasNext()) break;
            WeakReference<j> weakReference = iterator.next();
            j j8 = (j)weakReference.get();
            if (j8 == null) {
                this.w.remove(weakReference);
                continue;
            }
            bl2 = bl = j8.g(this, g8);
            if (bl) break;
        }
        this.e0();
        if (bl) {
            this.x = g8;
        }
        return bl;
    }

    public int l(int n8) {
        return this.m(n8, 0);
    }

    public int m(int n8, int n9) {
        int n10 = this.size();
        int n11 = n9;
        if (n9 < 0) {
            n11 = 0;
        }
        while (n11 < n10) {
            if (this.f.get(n11).getGroupId() == n8) {
                return n11;
            }
            ++n11;
        }
        return -1;
    }

    public int o(int n8) {
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            if (this.f.get(i8).getItemId() != n8) continue;
            return i8;
        }
        return -1;
    }

    g p(int n8, KeyEvent object) {
        ArrayList<g> arrayList = this.v;
        arrayList.clear();
        this.q(arrayList, n8, (KeyEvent)object);
        if (arrayList.isEmpty()) {
            return null;
        }
        int n9 = object.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        object.getKeyData(keyData);
        int n10 = arrayList.size();
        if (n10 == 1) {
            return arrayList.get(0);
        }
        boolean bl = this.H();
        for (int i8 = 0; i8 < n10; ++i8) {
            char[] cArray;
            object = arrayList.get(i8);
            char c8 = bl ? ((g)object).getAlphabeticShortcut() : ((g)object).getNumericShortcut();
            if (!(c8 == (cArray = keyData.meta)[0] && (n9 & 2) == 0 || c8 == cArray[2] && (n9 & 2) != 0) && (!bl || c8 != '\b' || n8 != 67)) continue;
            return object;
        }
        return null;
    }

    public boolean performIdentifierAction(int n8, int n9) {
        return this.M(this.findItem(n8), n9);
    }

    public boolean performShortcut(int n8, KeyEvent object, int n9) {
        boolean bl = (object = this.p(n8, (KeyEvent)object)) != null ? this.M((MenuItem)object, n9) : false;
        if ((n9 & 2) != 0) {
            this.e(true);
        }
        return bl;
    }

    void q(List<g> list, int n8, KeyEvent keyEvent) {
        boolean bl = this.H();
        int n9 = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || n8 == 67) {
            int n10 = this.f.size();
            for (int i8 = 0; i8 < n10; ++i8) {
                char[] cArray;
                g g8 = this.f.get(i8);
                if (g8.hasSubMenu()) {
                    ((e)g8.getSubMenu()).q(list, n8, keyEvent);
                }
                char c8 = bl ? g8.getAlphabeticShortcut() : g8.getNumericShortcut();
                int n11 = bl ? g8.getAlphabeticModifiers() : g8.getNumericModifiers();
                if ((n9 & 0x1100F) != (n11 & 0x1100F) || c8 == '\u0000' || c8 != (cArray = keyData.meta)[0] && c8 != cArray[2] && (!bl || c8 != '\b' || n8 != 67) || !g8.isEnabled()) continue;
                list.add(g8);
            }
        }
    }

    public void r() {
        ArrayList<g> arrayList = this.E();
        if (!this.k) {
            return;
        }
        Object object = this.w.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            WeakReference<j> weakReference = object.next();
            j j8 = (j)weakReference.get();
            if (j8 == null) {
                this.w.remove(weakReference);
                continue;
            }
            n8 |= j8.e();
        }
        if (n8 != 0) {
            this.i.clear();
            this.j.clear();
            int n9 = arrayList.size();
            for (n8 = 0; n8 < n9; ++n8) {
                object = arrayList.get(n8);
                if (((g)object).l()) {
                    this.i.add((g)object);
                    continue;
                }
                this.j.add((g)object);
            }
        } else {
            this.i.clear();
            this.j.clear();
            this.j.addAll(this.E());
        }
        this.k = false;
    }

    public void removeGroup(int n8) {
        int n9 = this.l(n8);
        if (n9 >= 0) {
            int n10 = this.f.size();
            for (int i8 = 0; i8 < n10 - n9 && this.f.get(n9).getGroupId() == n8; ++i8) {
                this.O(n9, false);
            }
            this.L(true);
        }
    }

    public void removeItem(int n8) {
        this.O(this.o(n8), true);
    }

    public ArrayList<g> s() {
        this.r();
        return this.i;
    }

    public void setGroupCheckable(int n8, boolean bl, boolean bl2) {
        int n9 = this.f.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            g g8 = this.f.get(i8);
            if (g8.getGroupId() != n8) continue;
            g8.t(bl2);
            g8.setCheckable(bl);
        }
    }

    public void setGroupDividerEnabled(boolean bl) {
        this.y = bl;
    }

    public void setGroupEnabled(int n8, boolean bl) {
        int n9 = this.f.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            g g8 = this.f.get(i8);
            if (g8.getGroupId() != n8) continue;
            g8.setEnabled(bl);
        }
    }

    public void setGroupVisible(int n8, boolean bl) {
        int n9 = this.f.size();
        boolean bl2 = false;
        for (int i8 = 0; i8 < n9; ++i8) {
            g g8 = this.f.get(i8);
            boolean bl3 = bl2;
            if (g8.getGroupId() == n8) {
                bl3 = bl2;
                if (g8.y(bl)) {
                    bl3 = true;
                }
            }
            bl2 = bl3;
        }
        if (bl2) {
            this.L(true);
        }
    }

    public void setQwertyMode(boolean bl) {
        this.c = bl;
        this.L(false);
    }

    public int size() {
        return this.f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.a;
    }

    public g v() {
        return this.x;
    }

    public Drawable w() {
        return this.o;
    }

    public CharSequence x() {
        return this.n;
    }

    public View y() {
        return this.p;
    }

    public ArrayList<g> z() {
        this.r();
        return this.j;
    }

    public static interface a {
        public boolean a(e var1, MenuItem var2);

        public void b(e var1);
    }

    public static interface b {
        public boolean a(g var1);
    }
}

