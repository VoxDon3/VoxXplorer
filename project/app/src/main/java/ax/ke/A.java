/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ax.ke.c;
import ax.ke.h;
import ax.ke.i;
import ax.ke.j;
import ax.ke.r;
import ax.ke.t;
import ax.ke.u;
import ax.ke.v;
import ax.ke.w;
import ax.ke.x;
import ax.ke.y;
import ax.ke.z;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

class A {
    private static final A c = A.e();
    private final boolean a;
    private final Constructor<MethodHandles.Lookup> b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    A(boolean bl) {
        this.a = bl;
        Constructor constructor = null;
        Constructor constructor2 = null;
        if (bl) {
            constructor2 = constructor;
            try {
                constructor2 = constructor = t.a().getDeclaredConstructor(Class.class, Integer.TYPE);
                ((AccessibleObject)constructor).setAccessible(true);
                constructor2 = constructor;
            }
            catch (NoClassDefFoundError | NoSuchMethodException throwable) {}
        }
        this.b = constructor2;
    }

    private static A e() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new a();
        }
        return new A(true);
    }

    static A f() {
        return c;
    }

    List<? extends c.a> a(Executor object) {
        object = new j((Executor)object);
        if (this.a) {
            return Arrays.asList(h.a, object);
        }
        return Collections.singletonList(object);
    }

    Executor b() {
        return null;
    }

    List<? extends i.a> c() {
        if (this.a) {
            return Collections.singletonList(r.a);
        }
        return Collections.EMPTY_LIST;
    }

    int d() {
        return this.a ? 1 : 0;
    }

    @IgnoreJRERequirement
    Object g(Method method, Class<?> clazz, Object object, Object ... objectArray) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.b;
        constructor = constructor != null ? u.a(constructor.newInstance(clazz, -1)) : v.a();
        return y.a(x.a(w.a((MethodHandles.Lookup)((Object)constructor), method, clazz), object), objectArray);
    }

    @IgnoreJRERequirement
    boolean h(Method method) {
        return this.a && z.a(method);
    }

    static final class ax.ke.A$a
    extends A {
        ax.ke.A$a() {
            boolean bl = Build.VERSION.SDK_INT >= 24;
            super(bl);
        }

        @Override
        public Executor b() {
            return new a();
        }

        @Override
        Object g(Method method, Class<?> clazz, Object object, Object ... objectArray) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.g(method, clazz, object, objectArray);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        static final class a
        implements Executor {
            private final Handler q = new Handler(Looper.getMainLooper());

            a() {
            }

            @Override
            public void execute(Runnable runnable2) {
                this.q.post(runnable2);
            }
        }
    }
}

