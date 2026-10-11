package ax.Xd;

import ax.Zd.i;
import ax.Zd.l;
import ax.Zd.m;
import ax.Zd.o;
import ax.Zd.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public final class f {
    static volatile int a;
    static volatile ax.ae.b e;
    static final o b = new o();
    static final i c = new i();
    static boolean d = q.d("slf4j.detectLoggerNameMismatch");
    private static final String[] f = {"2.0"};

    private f() {
    }

    private static final void b() {
        try {
            List<ax.ae.b> h = h();
            x(h);
            if (h == null || h.isEmpty()) {
                a = 4;
                l.h("No SLF4J providers were found.");
                l.h("Defaulting to no-operation (NOP) logger implementation");
                l.h("See https://www.slf4j.org/codes.html#noProviders for further details.");
                w(g());
            } else {
                e = h.get(0);
                e.a();
                a = 3;
                v(h);
            }
            s();
        } catch (Exception e2) {
            f(e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    private static void c(ax.Yd.d dVar, int i) {
        if (dVar.c().F()) {
            d(i);
        } else {
            if (dVar.c().G()) {
                return;
            }
            e();
        }
    }

    private static void d(int i) {
        l.h("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        l.h("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        l.h("See also https://www.slf4j.org/codes.html#replay");
    }

    private static void e() {
        l.h("The following set of substitute loggers may have been accessed");
        l.h("during the initialization phase. Logging calls during this");
        l.h("phase were not honored. However, subsequent logging calls to these");
        l.h("loggers will work as normally expected.");
        l.h("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    static void f(Throwable th) {
        a = 2;
        l.b("Failed to instantiate SLF4J LoggerFactory", th);
    }

    static Set<URL> g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = f.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            l.b("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    static List<ax.ae.b> h() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = f.class.getClassLoader();
        ax.ae.b p = p(classLoader);
        if (p != null) {
            arrayList.add(p);
            return arrayList;
        }
        Iterator<ax.ae.b> it = n(classLoader).iterator();
        while (it.hasNext()) {
            y(arrayList, it);
        }
        return arrayList;
    }

    private static void i() {
        o oVar = b;
        synchronized (oVar) {
            try {
                oVar.d().e();
                for (m mVar : oVar.d().d()) {
                    mVar.J(l(mVar.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static a j() {
        return m().b();
    }

    public static d k(Class<?> cls) {
        Class<?> a2;
        d l = l(cls.getName());
        if (d && (a2 = q.a()) != null && q(cls, a2)) {
            l.h(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", l.getName(), a2.getName()));
            l.h("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return l;
    }

    public static d l(String str) {
        return j().a(str);
    }

    static ax.ae.b m() {
        if (a == 0) {
            synchronized (f.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        r();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return e;
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static ServiceLoader<ax.ae.b> n(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(ax.ae.b.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: ax.Xd.e
            @Override // java.security.PrivilegedAction
            public final Object run() {
                ServiceLoader load;
                load = ServiceLoader.load(ax.ae.b.class, classLoader);
                return load;
            }
        });
    }

    private static boolean o(List<ax.ae.b> list) {
        return list.size() > 1;
    }

    static ax.ae.b p(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                l.d(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (ax.ae.b) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                l.b(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e2);
                return null;
            } catch (ClassNotFoundException e3) {
                e = e3;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e4) {
                e = e4;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e5) {
                e = e5;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e6) {
                e = e6;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e7) {
                e = e7;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    private static boolean q(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void r() {
        b();
        if (a == 3) {
            z();
        }
    }

    private static void s() {
        i();
        t();
        b.d().b();
    }

    private static void t() {
        LinkedBlockingQueue<ax.Yd.d> c2 = b.d().c();
        int size = c2.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (c2.drainTo(arrayList, 128) != 0) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                ax.Yd.d dVar = (ax.Yd.d) obj;
                u(dVar);
                int i3 = i + 1;
                if (i == 0) {
                    c(dVar, size);
                }
                i = i3;
            }
            arrayList.clear();
        }
    }

    private static void u(ax.Yd.d dVar) {
        if (dVar == null) {
            return;
        }
        m c2 = dVar.c();
        String name = c2.getName();
        if (c2.H()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (c2.G()) {
            return;
        }
        if (!c2.F()) {
            l.h(name);
        } else if (c2.r(dVar.b())) {
            c2.I(dVar);
        }
    }

    private static void v(List<ax.ae.b> list) {
        if (list.isEmpty() || !o(list)) {
            return;
        }
        l.d("Actual provider is of type [" + list.get(0) + "]");
    }

    private static void w(Set<URL> set) {
        if (set.isEmpty()) {
            return;
        }
        l.h("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator<URL> it = set.iterator();
        while (it.hasNext()) {
            l.h("Ignoring binding found at [" + it.next() + "]");
        }
        l.h("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void x(List<ax.ae.b> list) {
        if (o(list)) {
            l.h("Class path contains multiple SLF4J providers.");
            Iterator<ax.ae.b> it = list.iterator();
            while (it.hasNext()) {
                l.h("Found provider [" + it.next() + "]");
            }
            l.h("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void y(List<ax.ae.b> list, Iterator<ax.ae.b> it) {
        try {
            list.add(it.next());
        } catch (ServiceConfigurationError e2) {
            l.a("A service provider failed to instantiate:\n" + e2.getMessage());
        }
    }

    private static final void z() {
        try {
            String c2 = e.c();
            boolean z = false;
            for (String str : f) {
                if (c2.startsWith(str)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            l.h("The requested version " + c2 + " by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
            l.h("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (Throwable th) {
            l.b("Unexpected problem occurred during version sanity check", th);
        }
    }
}
