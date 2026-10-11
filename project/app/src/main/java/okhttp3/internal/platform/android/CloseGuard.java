/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import ax.Gb.g;
import ax.Gb.l;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

public final class CloseGuard {
    public static final Companion Companion = new Companion(null);
    private final Method getMethod;
    private final Method openMethod;
    private final Method warnIfOpenMethod;

    public CloseGuard(Method method, Method method2, Method method3) {
        this.getMethod = method;
        this.openMethod = method2;
        this.warnIfOpenMethod = method3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object createAndOpen(String string) {
        l.f(string, "closer");
        Method method = this.getMethod;
        if (method == null) return null;
        try {
            Object object = method.invoke(null, null);
            method = this.openMethod;
            l.c(method);
            method.invoke(object, string);
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean warnIfOpen(Object object) {
        if (object == null) return false;
        try {
            Method method = this.warnIfOpenMethod;
            l.c(method);
            method.invoke(object, null);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final CloseGuard get() {
            GenericDeclaration genericDeclaration;
            GenericDeclaration genericDeclaration2;
            Method method = null;
            try {
                genericDeclaration2 = Class.forName("dalvik.system.CloseGuard");
                genericDeclaration = genericDeclaration2.getMethod("get", null);
                Method method2 = genericDeclaration2.getMethod("open", String.class);
                genericDeclaration2 = genericDeclaration2.getMethod("warnIfOpen", null);
                method = genericDeclaration;
                genericDeclaration = genericDeclaration2;
                genericDeclaration2 = method2;
            }
            catch (Exception exception) {
                genericDeclaration = null;
                genericDeclaration2 = null;
            }
            return new CloseGuard(method, (Method)genericDeclaration2, (Method)genericDeclaration);
        }
    }
}

