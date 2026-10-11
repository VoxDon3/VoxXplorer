package j$.util.stream;

import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class D3 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new j$.sun.security.action.a(3))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
