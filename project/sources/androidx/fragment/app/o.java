package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class o extends androidx.lifecycle.p {
    private static final q.b k = new a();
    private final boolean g;
    private final HashMap<String, Fragment> d = new HashMap<>();
    private final HashMap<String, o> e = new HashMap<>();
    private final HashMap<String, androidx.lifecycle.r> f = new HashMap<>();
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    class a implements q.b {
        a() {
        }

        @Override // androidx.lifecycle.q.b
        public <T extends androidx.lifecycle.p> T a(Class<T> cls) {
            return new o(true);
        }

        @Override // androidx.lifecycle.q.b
        public /* synthetic */ androidx.lifecycle.p b(Class cls, ax.I0.a aVar) {
            return ax.G0.t.b(this, cls, aVar);
        }
    }

    o(boolean z) {
        this.g = z;
    }

    private void i(String str) {
        o oVar = this.e.get(str);
        if (oVar != null) {
            oVar.d();
            this.e.remove(str);
        }
        androidx.lifecycle.r rVar = this.f.get(str);
        if (rVar != null) {
            rVar.a();
            this.f.remove(str);
        }
    }

    static o l(androidx.lifecycle.r rVar) {
        return (o) new androidx.lifecycle.q(rVar, k).a(o.class);
    }

    @Override // androidx.lifecycle.p
    protected void d() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.d.equals(oVar.d) && this.e.equals(oVar.e) && this.f.equals(oVar.f)) {
                return true;
            }
        }
        return false;
    }

    void f(Fragment fragment) {
        if (this.j) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.containsKey(fragment.f)) {
                return;
            }
            this.d.put(fragment.f, fragment);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void g(Fragment fragment) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.f);
    }

    void h(String str) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    Fragment j(String str) {
        return this.d.get(str);
    }

    o k(Fragment fragment) {
        o oVar = this.e.get(fragment.f);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(this.g);
        this.e.put(fragment.f, oVar2);
        return oVar2;
    }

    Collection<Fragment> m() {
        return new ArrayList(this.d.values());
    }

    androidx.lifecycle.r n(Fragment fragment) {
        androidx.lifecycle.r rVar = this.f.get(fragment.f);
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.r rVar2 = new androidx.lifecycle.r();
        this.f.put(fragment.f, rVar2);
        return rVar2;
    }

    boolean o() {
        return this.h;
    }

    void p(Fragment fragment) {
        if (this.j) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(fragment.f) == null || !FragmentManager.J0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void q(boolean z) {
        this.j = z;
    }

    boolean r(Fragment fragment) {
        if (this.d.containsKey(fragment.f)) {
            return this.g ? this.h : !this.i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
