package ax.Zd;

/* loaded from: classes3.dex */
public final class q {
    private static b a = null;
    private static boolean b = false;

    private static final class b extends SecurityManager {
        private b() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private q() {
    }

    public static Class<?> a() {
        int i;
        b b2 = b();
        if (b2 == null) {
            return null;
        }
        Class<?>[] classContext = b2.getClassContext();
        String name = q.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    private static b b() {
        b bVar = a;
        if (bVar != null) {
            return bVar;
        }
        if (b) {
            return null;
        }
        b c = c();
        a = c;
        b = true;
        return c;
    }

    private static b c() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean d(String str) {
        String e = e(str);
        if (e == null) {
            return false;
        }
        return e.equalsIgnoreCase("true");
    }

    public static String e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
