/*
 * Decompiled with CFR 0.152.
 */
package ax.Xd;

import ax.Xd.a;
import ax.Xd.d;
import ax.Xd.e;
import ax.Zd.i;
import ax.Zd.l;
import ax.Zd.m;
import ax.Zd.o;
import ax.Zd.q;
import ax.ae.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
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

public final class f {
    static volatile int a;
    static final o b;
    static final i c;
    static boolean d;
    static volatile b e;
    private static final String[] f;

    static {
        b = new o();
        c = new i();
        d = q.d("slf4j.detectLoggerNameMismatch");
        f = new String[]{"2.0"};
    }

    private f() {
    }

    public static /* synthetic */ ServiceLoader a(ClassLoader classLoader) {
        return ServiceLoader.load(b.class, classLoader);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void b() {
        try {
            List<b> list = ax.Xd.f.h();
            ax.Xd.f.x(list);
            if (list != null && !list.isEmpty()) {
                e = list.get(0);
                e.a();
                a = 3;
                ax.Xd.f.v(list);
            } else {
                a = 4;
                l.h("No SLF4J providers were found.");
                l.h("Defaulting to no-operation (NOP) logger implementation");
                l.h("See https://www.slf4j.org/codes.html#noProviders for further details.");
                ax.Xd.f.w(ax.Xd.f.g());
            }
            ax.Xd.f.s();
            return;
        }
        catch (Exception exception) {
            ax.Xd.f.f(exception);
            throw new IllegalStateException("Unexpected initialization failure", exception);
        }
    }

    private static void c(ax.Yd.d d8, int n8) {
        if (d8.c().F()) {
            ax.Xd.f.d(n8);
            return;
        }
        if (d8.c().G()) {
            return;
        }
        ax.Xd.f.e();
    }

    private static void d(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A number (");
        stringBuilder.append(n8);
        stringBuilder.append(") of logging calls during the initialization phase have been intercepted and are");
        l.h(stringBuilder.toString());
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

    static void f(Throwable throwable) {
        a = 2;
        l.b("Failed to instantiate SLF4J LoggerFactory", throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Set<URL> g() {
        IOException iOException2;
        LinkedHashSet<URL> linkedHashSet;
        block3: {
            Enumeration<URL> enumeration;
            linkedHashSet = new LinkedHashSet<URL>();
            try {
                enumeration = f.class.getClassLoader();
                enumeration = enumeration == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : ((ClassLoader)((Object)enumeration)).getResources("org/slf4j/impl/StaticLoggerBinder.class");
            }
            catch (IOException iOException2) {
                break block3;
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
            return linkedHashSet;
        }
        l.b("Error getting resources from path", iOException2);
        return linkedHashSet;
    }

    static List<b> h() {
        ArrayList<b> arrayList = new ArrayList<b>();
        ClassLoader classLoader = f.class.getClassLoader();
        Object object = ax.Xd.f.p(classLoader);
        if (object != null) {
            arrayList.add((b)object);
            return arrayList;
        }
        object = ax.Xd.f.n(classLoader).iterator();
        while (object.hasNext()) {
            ax.Xd.f.y(arrayList, (Iterator<b>)object);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void i() {
        o o8 = b;
        synchronized (o8) {
            try {
                o8.d().e();
                Iterator<m> iterator = o8.d().d().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    m m8 = iterator.next();
                    m8.J(ax.Xd.f.l(m8.getName()));
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static a j() {
        return ax.Xd.f.m().b();
    }

    public static d k(Class<?> clazz) {
        Class<?> clazz2;
        d d8 = ax.Xd.f.l(clazz.getName());
        if (d && (clazz2 = q.a()) != null && ax.Xd.f.q(clazz, clazz2)) {
            l.h(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", d8.getName(), clazz2.getName()));
            l.h("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return d8;
    }

    public static d l(String string) {
        return ax.Xd.f.j().a(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static b m() {
        int n8;
        block10: {
            if (a == 0) {
                synchronized (f.class) {
                    Throwable throwable2;
                    block9: {
                        block8: {
                            try {
                                if (a != 0) break block8;
                                a = 1;
                                ax.Xd.f.r();
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        break block10;
                    }
                    throw throwable2;
                }
            }
        }
        if ((n8 = a) == 1) {
            return b;
        }
        if (n8 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (n8 == 3) {
            return e;
        }
        if (n8 == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static ServiceLoader<b> n(ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return ServiceLoader.load(b.class, classLoader);
        }
        return (ServiceLoader)AccessController.doPrivileged(new e(classLoader));
    }

    private static boolean o(List<b> list) {
        return list.size() > 1;
    }

    /*
     * WARNING - void declaration
     */
    static b p(ClassLoader object) {
        String string = System.getProperty("slf4j.provider");
        if (string != null && !string.isEmpty()) {
            Throwable var0_7;
            block8: {
                try {
                    l.d(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", string, "slf4j.provider"));
                    object = (b)((ClassLoader)object).loadClass(string).getConstructor(null).newInstance(null);
                    return object;
                }
                catch (ClassCastException classCastException) {
                }
                catch (InvocationTargetException invocationTargetException) {
                    break block8;
                }
                catch (IllegalAccessException illegalAccessException) {
                    break block8;
                }
                catch (InstantiationException instantiationException) {
                    break block8;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    break block8;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    break block8;
                }
                l.b(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", string), classCastException);
                return null;
            }
            l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", string), (Throwable)var0_7);
        }
        return null;
    }

    private static boolean q(Class<?> clazz, Class<?> clazz2) {
        return clazz2.isAssignableFrom(clazz) ^ true;
    }

    private static final void r() {
        ax.Xd.f.b();
        if (a == 3) {
            ax.Xd.f.z();
        }
    }

    private static void s() {
        ax.Xd.f.i();
        ax.Xd.f.t();
        b.d().b();
    }

    private static void t() {
        LinkedBlockingQueue<ax.Yd.d> linkedBlockingQueue = b.d().c();
        int n8 = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int n9 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            int n10 = arrayList.size();
            int n11 = 0;
            while (n11 < n10) {
                Object object = arrayList.get(n11);
                ++n11;
                object = (ax.Yd.d)object;
                ax.Xd.f.u(object);
                if (n9 == 0) {
                    ax.Xd.f.c(object, n8);
                }
                ++n9;
            }
            arrayList.clear();
        }
        return;
    }

    private static void u(ax.Yd.d d8) {
        block5: {
            String string;
            block6: {
                block4: {
                    if (d8 == null) break block4;
                    m m8 = d8.c();
                    string = m8.getName();
                    if (m8.H()) break block5;
                    if (m8.G()) break block4;
                    if (!m8.F()) break block6;
                    if (m8.r(d8.b())) {
                        m8.I(d8);
                    }
                }
                return;
            }
            l.h(string);
            return;
        }
        throw new IllegalStateException("Delegate logger cannot be null at this state.");
    }

    private static void v(List<b> list) {
        if (!list.isEmpty() && ax.Xd.f.o(list)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Actual provider is of type [");
            stringBuilder.append(list.get(0));
            stringBuilder.append("]");
            l.d(stringBuilder.toString());
        }
    }

    private static void w(Set<URL> object) {
        if (object.isEmpty()) {
            return;
        }
        l.h("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator<URL> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring binding found at [");
            stringBuilder.append(object);
            stringBuilder.append("]");
            l.h(stringBuilder.toString());
        }
        l.h("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void x(List<b> object) {
        if (ax.Xd.f.o(object)) {
            l.h("Class path contains multiple SLF4J providers.");
            object = object.iterator();
            while (object.hasNext()) {
                b b8 = (b)object.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found provider [");
                stringBuilder.append(b8);
                stringBuilder.append("]");
                l.h(stringBuilder.toString());
            }
            l.h("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void y(List<b> object, Iterator<b> iterator) {
        try {
            object.add((b)iterator.next());
            return;
        }
        catch (ServiceConfigurationError serviceConfigurationError) {
            object = new StringBuilder();
            ((StringBuilder)object).append("A service provider failed to instantiate:\n");
            ((StringBuilder)object).append(serviceConfigurationError.getMessage());
            l.a(((StringBuilder)object).toString());
            return;
        }
    }

    private static final void z() {
        block5: {
            String string = e.c();
            Object object = f;
            int n8 = ((String[])object).length;
            boolean bl = false;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!string.startsWith(object[i8])) continue;
                bl = true;
                continue;
            }
            if (bl) break block5;
            try {
                object = new StringBuilder();
                ((StringBuilder)object).append("The requested version ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" by your slf4j provider is not compatible with ");
                ((StringBuilder)object).append(Arrays.asList(f).toString());
                l.h(((StringBuilder)object).toString());
                l.h("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                return;
            }
            catch (Throwable throwable) {
                l.b("Unexpected problem occurred during version sanity check", throwable);
            }
        }
    }
}

