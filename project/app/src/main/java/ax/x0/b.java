/*
 * Decompiled with CFR 0.152.
 */
package ax.x0;

import android.annotation.SuppressLint;
import android.text.Editable;
import ax.v0.d;

final class b
extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class<?> c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"PrivateApi"})
    private b() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Editable.Factory getInstance() {
        if (b != null) return b;
        Object object = a;
        synchronized (object) {
            try {
                if (b != null) return b;
                b b8 = new b();
                b = b8;
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> clazz = c;
        if (clazz != null) {
            return d.c(clazz, charSequence);
        }
        return super.newEditable(charSequence);
    }
}

