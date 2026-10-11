/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.d;
import ax.B0.c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class t {
    private final i a;
    private final ClassLoader b;
    ArrayList<a> c = new ArrayList();
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j = true;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    boolean r = false;
    ArrayList<Runnable> s;

    t(i i8, ClassLoader classLoader) {
        this.a = i8;
        this.b = classLoader;
    }

    public t b(int n8, Fragment fragment) {
        this.o(n8, fragment, null, 1);
        return this;
    }

    public t c(int n8, Fragment fragment, String string) {
        this.o(n8, fragment, string, 1);
        return this;
    }

    t d(ViewGroup viewGroup, Fragment fragment, String string) {
        fragment.H = viewGroup;
        return this.c(viewGroup.getId(), fragment, string);
    }

    public t e(Fragment fragment, String string) {
        this.o(0, fragment, string, 1);
        return this;
    }

    void f(a a8) {
        this.c.add(a8);
        a8.d = this.d;
        a8.e = this.e;
        a8.f = this.f;
        a8.g = this.g;
    }

    public t g(String string) {
        if (this.j) {
            this.i = true;
            this.k = string;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public t h(Fragment fragment) {
        this.f(new a(7, fragment));
        return this;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public t m(Fragment fragment) {
        this.f(new a(6, fragment));
        return this;
    }

    public t n() {
        if (!this.i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    void o(int n8, Fragment object, String charSequence, int n9) {
        Object object2 = ((Fragment)object).R;
        if (object2 != null) {
            ax.B0.c.f((Fragment)object, (String)object2);
        }
        object2 = object.getClass();
        int n10 = ((Class)object2).getModifiers();
        if (!((Class)object2).isAnonymousClass() && Modifier.isPublic(n10) && (!((Class)object2).isMemberClass() || Modifier.isStatic(n10))) {
            if (charSequence != null) {
                object2 = ((Fragment)object).z;
                if (object2 != null && !((String)charSequence).equals(object2)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Can't change tag of fragment ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(": was ");
                    ((StringBuilder)object2).append(((Fragment)object).z);
                    ((StringBuilder)object2).append(" now ");
                    ((StringBuilder)object2).append((String)charSequence);
                    throw new IllegalStateException(((StringBuilder)object2).toString());
                }
                ((Fragment)object).z = charSequence;
            }
            if (n8 != 0) {
                if (n8 != -1) {
                    n10 = ((Fragment)object).x;
                    if (n10 != 0 && n10 != n8) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append("Can't change container ID of fragment ");
                        ((StringBuilder)charSequence).append(object);
                        ((StringBuilder)charSequence).append(": was ");
                        ((StringBuilder)charSequence).append(((Fragment)object).x);
                        ((StringBuilder)charSequence).append(" now ");
                        ((StringBuilder)charSequence).append(n8);
                        throw new IllegalStateException(((StringBuilder)charSequence).toString());
                    }
                    ((Fragment)object).x = n8;
                    ((Fragment)object).y = n8;
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Can't add fragment ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(" with tag ");
                    ((StringBuilder)object2).append((String)charSequence);
                    ((StringBuilder)object2).append(" to container view with no id");
                    throw new IllegalArgumentException(((StringBuilder)object2).toString());
                }
            }
            this.f(new a(n9, (Fragment)object));
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(((Class)object2).getCanonicalName());
        ((StringBuilder)object).append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public t p(Fragment fragment) {
        this.f(new a(4, fragment));
        return this;
    }

    public t q(Fragment fragment) {
        this.f(new a(3, fragment));
        return this;
    }

    public t r(int n8, Fragment fragment) {
        return this.s(n8, fragment, null);
    }

    public t s(int n8, Fragment fragment, String string) {
        if (n8 != 0) {
            this.o(n8, fragment, string, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public t t(int n8, int n9, int n10, int n11) {
        this.d = n8;
        this.e = n9;
        this.f = n10;
        this.g = n11;
        return this;
    }

    public t u(boolean bl) {
        this.r = bl;
        return this;
    }

    public t v(Fragment fragment) {
        this.f(new a(5, fragment));
        return this;
    }

    static final class a {
        int a;
        Fragment b;
        boolean c;
        int d;
        int e;
        int f;
        int g;
        d.b h;
        d.b i;

        a() {
        }

        a(int n8, Fragment object) {
            this.a = n8;
            this.b = object;
            this.c = false;
            object = d.b.f0;
            this.h = object;
            this.i = object;
        }

        a(int n8, Fragment object, boolean bl) {
            this.a = n8;
            this.b = object;
            this.c = bl;
            object = d.b.f0;
            this.h = object;
            this.i = object;
        }
    }
}

