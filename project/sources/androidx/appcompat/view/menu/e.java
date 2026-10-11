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
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ax.c0.AbstractC1755b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class e implements ax.V.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};
    private final Context a;
    private final Resources b;
    private boolean c;
    private boolean d;
    private a e;
    private ContextMenu.ContextMenuInfo m;
    CharSequence n;
    Drawable o;
    View p;
    private g x;
    private boolean z;
    private int l = 0;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<g> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<j>> w = new CopyOnWriteArrayList<>();
    private boolean y = false;
    private ArrayList<g> f = new ArrayList<>();
    private ArrayList<g> g = new ArrayList<>();
    private boolean h = true;
    private ArrayList<g> i = new ArrayList<>();
    private ArrayList<g> j = new ArrayList<>();
    private boolean k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.a = context;
        this.b = context.getResources();
        d0(true);
    }

    private static int B(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = A;
            if (i2 < iArr.length) {
                return (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int i, boolean z) {
        if (i < 0 || i >= this.f.size()) {
            return;
        }
        this.f.remove(i);
        if (z) {
            L(true);
        }
    }

    private void X(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i > 0) {
                this.n = C.getText(i);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i2 > 0) {
                this.o = ax.Q.b.e(u(), i2);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        L(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (ax.c0.C1768h0.l(android.view.ViewConfiguration.get(r2.a), r2.a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.a
            boolean r3 = ax.c0.C1768h0.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.d0(boolean):void");
    }

    private g g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new g(this, i, i2, i3, i4, charSequence, i5);
    }

    private void i(boolean z) {
        if (this.w.isEmpty()) {
            return;
        }
        f0();
        Iterator<WeakReference<j>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.w.remove(next);
            } else {
                jVar.d(z);
            }
        }
        e0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.w.isEmpty()) {
            return false;
        }
        boolean k = jVar != null ? jVar.k(mVar) : false;
        Iterator<WeakReference<j>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.w.remove(next);
            } else if (!k) {
                k = jVar2.k(mVar);
            }
        }
        return k;
    }

    private static int n(ArrayList<g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i) {
                return size + 1;
            }
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
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.f.get(i);
            if (gVar.isVisible()) {
                this.g.add(gVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean F() {
        return !this.q;
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

    void J(g gVar) {
        this.k = true;
        L(true);
    }

    void K(g gVar) {
        this.h = true;
        L(true);
    }

    public void L(boolean z) {
        if (this.q) {
            this.r = true;
            if (z) {
                this.s = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        i(z);
    }

    public boolean M(MenuItem menuItem, int i) {
        return N(menuItem, null, i);
    }

    public boolean N(MenuItem menuItem, j jVar, int i) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k = gVar.k();
        AbstractC1755b b2 = gVar.b();
        boolean z = b2 != null && b2.a();
        if (gVar.j()) {
            boolean expandActionView = gVar.expandActionView() | k;
            if (expandActionView) {
                e(true);
            }
            return expandActionView;
        }
        if (!gVar.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                e(true);
            }
            return k;
        }
        if ((i & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(u(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z) {
            b2.f(mVar);
        }
        boolean j = j(mVar, jVar) | k;
        if (!j) {
            e(true);
        }
        return j;
    }

    public void P(j jVar) {
        Iterator<WeakReference<j>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.w.remove(next);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.e = aVar;
    }

    public e T(int i) {
        this.l = i;
        return this;
    }

    void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f.size();
        f0();
        for (int i = 0; i < size; i++) {
            g gVar = this.f.get(i);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        e0();
    }

    protected e V(int i) {
        X(0, null, i, null, null);
        return this;
    }

    protected e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    protected e Y(int i) {
        X(i, null, 0, null, null);
        return this;
    }

    protected e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int B = B(i3);
        g g = g(i, i2, i3, B, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            g.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f;
        arrayList.add(n(arrayList, B), g);
        L(true);
        return g;
    }

    protected e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.a);
    }

    public void b0(boolean z) {
        this.t = z;
    }

    public void c(j jVar, Context context) {
        this.w.add(new WeakReference<>(jVar));
        jVar.i(context, this);
        this.k = true;
    }

    public void c0(boolean z) {
        this.z = z;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.x;
        if (gVar != null) {
            f(gVar);
        }
        this.f.clear();
        L(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public final void e(boolean z) {
        if (this.u) {
            return;
        }
        this.u = true;
        Iterator<WeakReference<j>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.w.remove(next);
            } else {
                jVar.a(this, z);
            }
        }
        this.u = false;
    }

    public void e0() {
        this.q = false;
        if (this.r) {
            this.r = false;
            L(this.s);
        }
    }

    public boolean f(g gVar) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == gVar) {
            f0();
            Iterator<WeakReference<j>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.w.remove(next);
                } else {
                    z = jVar.f(this, gVar);
                    if (z) {
                        break;
                    }
                }
            }
            e0();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    public void f0() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.r = false;
        this.s = false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getItemId() == i) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f.get(i);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return p(i, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z = false;
        if (this.w.isEmpty()) {
            return false;
        }
        f0();
        Iterator<WeakReference<j>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.w.remove(next);
            } else {
                z = jVar.g(this, gVar);
                if (z) {
                    break;
                }
            }
        }
        e0();
        if (z) {
            this.x = gVar;
        }
        return z;
    }

    public int l(int i) {
        return m(i, 0);
    }

    public int m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    g p(int i, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.v;
        arrayList.clear();
        q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean H = H();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = arrayList.get(i2);
            char alphabeticShortcut = H ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (H && alphabeticShortcut == '\b' && i == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return M(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        g p = p(i, keyEvent);
        boolean M = p != null ? M(p, i2) : false;
        if ((i2 & 2) != 0) {
            e(true);
        }
        return M;
    }

    void q(List<g> list, int i, KeyEvent keyEvent) {
        boolean H = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.f.get(i2);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i, keyEvent);
                }
                char alphabeticShortcut = H ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((H ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (H && alphabeticShortcut == '\b' && i == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.k) {
            Iterator<WeakReference<j>> it = this.w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.w.remove(next);
                } else {
                    z |= jVar.e();
                }
            }
            if (z) {
                this.i.clear();
                this.j.clear();
                int size = E.size();
                for (int i = 0; i < size; i++) {
                    g gVar = E.get(i);
                    if (gVar.l()) {
                        this.i.add(gVar);
                    } else {
                        this.j.add(gVar);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(E());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int l = l(i);
        if (l >= 0) {
            int size = this.f.size() - l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f.get(l).getGroupId() != i) {
                    break;
                }
                O(l, false);
                i2 = i3;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        O(o(i), true);
    }

    public ArrayList<g> s() {
        r();
        return this.i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.t(z2);
                gVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getGroupId() == i) {
                gVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f.get(i2);
            if (gVar.getGroupId() == i && gVar.y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        L(false);
    }

    @Override // android.view.Menu
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
        r();
        return this.j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        g gVar = (g) a(i, i2, i3, charSequence);
        m mVar = new m(this.a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
