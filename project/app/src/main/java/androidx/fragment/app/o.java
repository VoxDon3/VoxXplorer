/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import ax.G0.t;
import ax.I0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class o
extends p {
    private static final q.b k = new q.b(){

        @Override
        public <T extends p> T a(Class<T> clazz) {
            return (T)new o(true);
        }

        public /* synthetic */ p b(Class clazz, a a8) {
            return t.b(this, clazz, a8);
        }
    };
    private final HashMap<String, Fragment> d = new HashMap();
    private final HashMap<String, o> e = new HashMap();
    private final HashMap<String, r> f = new HashMap();
    private final boolean g;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    o(boolean bl) {
        this.g = bl;
    }

    private void i(String string) {
        Object object = this.e.get(string);
        if (object != null) {
            ((o)object).d();
            this.e.remove(string);
        }
        if ((object = this.f.get(string)) != null) {
            ((r)object).a();
            this.f.remove(string);
        }
    }

    static o l(r r8) {
        return new q(r8, k).a(o.class);
    }

    @Override
    protected void d() {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onCleared called for ");
            stringBuilder.append(this);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.h = true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && o.class == object.getClass()) {
            object = (o)object;
            if (((Object)this.d).equals(((o)object).d) && ((Object)this.e).equals(((o)object).e) && ((Object)this.f).equals(((o)object).f)) {
                return true;
            }
        }
        return false;
    }

    void f(Fragment fragment) {
        if (this.j) {
            if (FragmentManager.J0(2)) {
                Log.v((String)"FragmentManager", (String)"Ignoring addRetainedFragment as the state is already saved");
                return;
            }
        } else if (!this.d.containsKey(fragment.f)) {
            this.d.put(fragment.f, fragment);
            if (FragmentManager.J0(2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Updating retained Fragments: Added ");
                stringBuilder.append(fragment);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
        }
    }

    void g(Fragment fragment) {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Clearing non-config state for ");
            stringBuilder.append(fragment);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.i(fragment.f);
    }

    void h(String string) {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Clearing non-config state for saved state of Fragment ");
            stringBuilder.append(string);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.i(string);
    }

    public int hashCode() {
        return (((Object)this.d).hashCode() * 31 + ((Object)this.e).hashCode()) * 31 + ((Object)this.f).hashCode();
    }

    Fragment j(String string) {
        return this.d.get(string);
    }

    o k(Fragment fragment) {
        o o8;
        o o9 = o8 = this.e.get(fragment.f);
        if (o8 == null) {
            o9 = new o(this.g);
            this.e.put(fragment.f, o9);
        }
        return o9;
    }

    Collection<Fragment> m() {
        return new ArrayList<Fragment>(this.d.values());
    }

    r n(Fragment fragment) {
        r r8;
        r r9 = r8 = this.f.get(fragment.f);
        if (r8 == null) {
            r9 = new r();
            this.f.put(fragment.f, r9);
        }
        return r9;
    }

    boolean o() {
        return this.h;
    }

    void p(Fragment fragment) {
        if (this.j) {
            if (FragmentManager.J0(2)) {
                Log.v((String)"FragmentManager", (String)"Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
        } else if (this.d.remove(fragment.f) != null && FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Updating retained Fragments: Removed ");
            stringBuilder.append(fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    void q(boolean bl) {
        this.j = bl;
    }

    boolean r(Fragment fragment) {
        if (!this.d.containsKey(fragment.f)) {
            return true;
        }
        if (this.g) {
            return this.h;
        }
        return this.i ^ true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("} Fragments (");
        Iterator<Object> iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") Child Non Config (");
        iterator = this.e.keySet().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") ViewModelStores (");
        iterator = this.f.keySet().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

