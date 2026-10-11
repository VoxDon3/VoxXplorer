package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class t {
    private final i a;
    private final ClassLoader b;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    ArrayList<Runnable> s;
    ArrayList<a> c = new ArrayList<>();
    boolean j = true;
    boolean r = false;

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

        a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            d.b bVar = d.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        a(int i, Fragment fragment, boolean z) {
            this.a = i;
            this.b = fragment;
            this.c = z;
            d.b bVar = d.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }
    }

    t(i iVar, ClassLoader classLoader) {
        this.a = iVar;
        this.b = classLoader;
    }

    public t b(int i, Fragment fragment) {
        o(i, fragment, null, 1);
        return this;
    }

    public t c(int i, Fragment fragment, String str) {
        o(i, fragment, str, 1);
        return this;
    }

    t d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.H = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public t e(Fragment fragment, String str) {
        o(0, fragment, str, 1);
        return this;
    }

    void f(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public t g(String str) {
        if (!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.k = str;
        return this;
    }

    public t h(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public t m(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public t n() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    void o(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.R;
        if (str2 != null) {
            ax.B0.c.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.z;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.z + " now " + str);
            }
            fragment.z = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.x;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.x + " now " + i);
            }
            fragment.x = i;
            fragment.y = i;
        }
        f(new a(i2, fragment));
    }

    public t p(Fragment fragment) {
        f(new a(4, fragment));
        return this;
    }

    public t q(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public t r(int i, Fragment fragment) {
        return s(i, fragment, null);
    }

    public t s(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        o(i, fragment, str, 2);
        return this;
    }

    public t t(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        return this;
    }

    public t u(boolean z) {
        this.r = z;
        return this;
    }

    public t v(Fragment fragment) {
        f(new a(5, fragment));
        return this;
    }
}
