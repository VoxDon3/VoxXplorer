package ax.d4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public class k extends Fragment {
    private final C1939a a;
    private final m b;
    private final HashSet<k> c;
    private ax.J3.j d;
    private k e;
    private Fragment f;

    private class a implements m {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        this(new C1939a());
    }

    private void a(k kVar) {
        this.c.add(kVar);
    }

    @TargetApi(17)
    private Fragment c() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f;
    }

    private void f(Activity activity) {
        j();
        k g = ax.J3.c.c(activity).k().g(activity.getFragmentManager(), null);
        this.e = g;
        if (g != this) {
            g.a(this);
        }
    }

    private void g(k kVar) {
        this.c.remove(kVar);
    }

    private void j() {
        k kVar = this.e;
        if (kVar != null) {
            kVar.g(this);
            this.e = null;
        }
    }

    C1939a b() {
        return this.a;
    }

    public ax.J3.j d() {
        return this.d;
    }

    public m e() {
        return this.b;
    }

    void h(Fragment fragment) {
        this.f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        f(fragment.getActivity());
    }

    public void i(ax.J3.j jVar) {
        this.d = jVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            f(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        j();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        j();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + c() + "}";
    }

    @SuppressLint({"ValidFragment"})
    k(C1939a c1939a) {
        this.b = new a();
        this.c = new HashSet<>();
        this.a = c1939a;
    }
}
