/*
 * Decompiled with CFR 0.152.
 */
package ax.Nd;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;

public class i {
    private static final ThreadLocal a = new ThreadLocal();

    public static String a(String string) {
        Object object = (String)AccessController.doPrivileged(new PrivilegedAction(string){
            final String a;
            {
                this.a = string;
            }

            public Object run() {
                return Security.getProperty(this.a);
            }
        });
        if (object != null) {
            return object;
        }
        object = (Map)a.get();
        if (object != null && (object = (String)object.get(string)) != null) {
            return object;
        }
        return (String)AccessController.doPrivileged(new PrivilegedAction(string){
            final String a;
            {
                this.a = string;
            }

            public Object run() {
                return System.getProperty(this.a);
            }
        });
    }

    public static boolean b(String string) {
        try {
            boolean bl = i.c(i.a(string));
            return bl;
        }
        catch (AccessControlException accessControlException) {
            return false;
        }
    }

    private static boolean c(String string) {
        if (string != null && string.length() == 4) {
            return !(string.charAt(0) != 't' && string.charAt(0) != 'T' || string.charAt(1) != 'r' && string.charAt(1) != 'R' || string.charAt(2) != 'u' && string.charAt(2) != 'U' || string.charAt(3) != 'e' && string.charAt(3) != 'E');
            {
            }
        }
        return false;
    }
}

