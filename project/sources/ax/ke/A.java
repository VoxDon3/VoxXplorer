package ax.ke;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ax.ke.InterfaceC2431c;
import ax.ke.InterfaceC2437i;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes3.dex */
class A {
    private static final A c = e();
    private final boolean a;
    private final Constructor<MethodHandles.Lookup> b;

    static final class a extends A {

        /* renamed from: ax.ke.A$a$a, reason: collision with other inner class name */
        static final class ExecutorC0353a implements Executor {
            private final Handler q = new Handler(Looper.getMainLooper());

            ExecutorC0353a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.q.post(runnable);
            }
        }

        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // ax.ke.A
        public Executor b() {
            return new ExecutorC0353a();
        }

        @Override // ax.ke.A
        Object g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    A(boolean z) {
        this.a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = t.a().getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.b = constructor;
    }

    private static A e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new A(true);
    }

    static A f() {
        return c;
    }

    List<? extends InterfaceC2431c.a> a(Executor executor) {
        j jVar = new j(executor);
        return this.a ? Arrays.asList(C2436h.a, jVar) : Collections.singletonList(jVar);
    }

    Executor b() {
        return null;
    }

    List<? extends InterfaceC2437i.a> c() {
        return this.a ? Collections.singletonList(r.a) : Collections.EMPTY_LIST;
    }

    int d() {
        return this.a ? 1 : 0;
    }

    @IgnoreJRERequirement
    Object g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = this.b;
        unreflectSpecial = (constructor != null ? u.a(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    @IgnoreJRERequirement
    boolean h(Method method) {
        boolean isDefault;
        if (!this.a) {
            return false;
        }
        isDefault = method.isDefault();
        return isDefault;
    }
}
