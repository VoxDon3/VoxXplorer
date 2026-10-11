/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.Log;
import ax.J3.c;
import ax.J3.j;
import ax.d4.m;
import java.util.HashSet;

public class k
extends Fragment {
    private final ax.d4.a a;
    private final m b = new a(this);
    private final HashSet<k> c = new HashSet();
    private j d;
    private k e;
    private Fragment f;

    public k() {
        this(new ax.d4.a());
    }

    @SuppressLint(value={"ValidFragment"})
    k(ax.d4.a a8) {
        this.a = a8;
    }

    private void a(k k8) {
        this.c.add(k8);
    }

    @TargetApi(value=17)
    private Fragment c() {
        Fragment fragment = this.getParentFragment();
        if (fragment != null) {
            return fragment;
        }
        return this.f;
    }

    private void f(Activity object) {
        this.j();
        object = ax.J3.c.c((Context)object).k().g(object.getFragmentManager(), null);
        this.e = object;
        if (object != this) {
            super.a(this);
        }
    }

    private void g(k k8) {
        this.c.remove((Object)k8);
    }

    private void j() {
        k k8 = this.e;
        if (k8 != null) {
            k8.g(this);
            this.e = null;
        }
    }

    ax.d4.a b() {
        return this.a;
    }

    public j d() {
        return this.d;
    }

    public m e() {
        return this.b;
    }

    void h(Fragment fragment) {
        this.f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            this.f(fragment.getActivity());
        }
    }

    public void i(j j8) {
        this.d = j8;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f(activity);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            if (Log.isLoggable((String)"RMFragment", (int)5)) {
                Log.w((String)"RMFragment", (String)"Unable to register fragment with root", (Throwable)illegalStateException);
            }
            return;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        this.j();
    }

    public void onDetach() {
        super.onDetach();
        this.j();
    }

    public void onStart() {
        super.onStart();
        this.a.d();
    }

    public void onStop() {
        super.onStop();
        this.a.e();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        stringBuilder.append(this.c());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private class a
    implements m {
        final k a;

        a(k k8) {
            this.a = k8;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }
}

