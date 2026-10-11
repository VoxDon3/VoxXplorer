/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class u {
    private static final Object a = new Object();
    private static int b = 0;
    private static boolean c = true;
    private static a d = ax.S0.u$a.a;

    public static String a(String string, Throwable object) {
        String string2 = u.e((Throwable)object);
        object = string;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("\n  ");
            ((StringBuilder)object).append(string2.replace("\n", "\n  "));
            ((StringBuilder)object).append('\n');
            object = ((StringBuilder)object).toString();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String string, String string2) {
        Object object = a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (b != 0) break block3;
                        d.c(string, string2, null);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(String string, String string2) {
        Object object = a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (b > 3) break block3;
                        d.a(string, string2, null);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(String string, String string2, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            Throwable throwable22;
            block4: {
                block3: {
                    try {
                        if (b > 3) break block3;
                        d.a(string, string2, throwable);
                    }
                    catch (Throwable throwable22) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable22;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e(Throwable object) {
        if (object == null) {
            return null;
        }
        Object object2 = a;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                try {
                    if (u.g((Throwable)object)) {
                        return "UnknownHostException (no network)";
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (c) return Log.getStackTraceString((Throwable)object).trim().replace("\t", "    ");
                return ((Throwable)object).getMessage();
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(String string, String string2) {
        Object object = a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (b > 1) break block3;
                        d.d(string, string2, null);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private static boolean g(Throwable throwable) {
        while (throwable != null) {
            if (throwable instanceof UnknownHostException) {
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(String string, String string2) {
        Object object = a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (b > 2) break block3;
                        d.b(string, string2, null);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void i(String string, String string2, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            Throwable throwable22;
            block4: {
                block3: {
                    try {
                        if (b > 2) break block3;
                        d.b(string, string2, throwable);
                    }
                    catch (Throwable throwable22) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable22;
        }
    }

    public static interface a {
        public static final a a = new a(){

            @Override
            public void a(String string, String string2, Throwable throwable) {
                Log.e((String)string, (String)u.a(string2, throwable));
            }

            @Override
            public void b(String string, String string2, Throwable throwable) {
                Log.w((String)string, (String)u.a(string2, throwable));
            }

            @Override
            public void c(String string, String string2, Throwable throwable) {
                Log.d((String)string, (String)u.a(string2, throwable));
            }

            @Override
            public void d(String string, String string2, Throwable throwable) {
                Log.i((String)string, (String)u.a(string2, throwable));
            }
        };

        public void a(String var1, String var2, Throwable var3);

        public void b(String var1, String var2, Throwable var3);

        public void c(String var1, String var2, Throwable var3);

        public void d(String var1, String var2, Throwable var3);
    }
}

