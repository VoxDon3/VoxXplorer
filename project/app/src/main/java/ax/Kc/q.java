/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

public class q {
    private static final boolean a = q.a(q.class.getClassLoader().getClass());

    private static boolean a(Class<?> clazz) {
        while (true) {
            if (clazz == null) break;
            if (clazz.getName().equals("org.osgi.framework.BundleReference")) {
                return true;
            }
            Class<?>[] classArray = clazz.getInterfaces();
            int n8 = classArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!q.a(classArray[i8])) continue;
                return true;
            }
            clazz = clazz.getSuperclass();
        }
        return false;
    }

    public static boolean b() {
        return a;
    }
}

