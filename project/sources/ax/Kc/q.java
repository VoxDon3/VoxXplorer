package ax.Kc;

/* loaded from: classes3.dex */
public class q {
    private static final boolean a = a(q.class.getClassLoader().getClass());

    private static boolean a(Class<?> cls) {
        while (true) {
            if (cls == null) {
                return false;
            }
            if (cls.getName().equals("org.osgi.framework.BundleReference")) {
                return true;
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (a(cls2)) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static boolean b() {
        return a;
    }
}
