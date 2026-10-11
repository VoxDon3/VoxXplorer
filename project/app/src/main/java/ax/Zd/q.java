/*
 * Decompiled with CFR 0.152.
 */
package ax.Zd;

public final class q {
    private static b a;
    private static boolean b = false;

    private q() {
    }

    public static Class<?> a() {
        int n8;
        Object object = q.b();
        if (object == null) {
            return null;
        }
        Class<?>[] classArray = ((b)object).getClassContext();
        object = q.class.getName();
        for (n8 = 0; n8 < classArray.length && !((String)object).equals(classArray[n8].getName()); ++n8) {
        }
        if (n8 < classArray.length && (n8 += 2) < classArray.length) {
            return classArray[n8];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    private static b b() {
        b b8 = a;
        if (b8 != null) {
            return b8;
        }
        if (b) {
            return null;
        }
        a = b8 = q.c();
        b = true;
        return b8;
    }

    private static b c() {
        try {
            b b8 = new b();
            return b8;
        }
        catch (SecurityException securityException) {
            return null;
        }
    }

    public static boolean d(String string) {
        if ((string = q.e(string)) == null) {
            return false;
        }
        return string.equalsIgnoreCase("true");
    }

    public static String e(String string) {
        if (string != null) {
            try {
                string = System.getProperty(string);
                return string;
            }
            catch (SecurityException securityException) {
                return null;
            }
        }
        throw new IllegalArgumentException("null input");
    }

    private static final class b
    extends SecurityManager {
        private b() {
        }

        @Override
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }
}

