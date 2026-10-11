/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.content.Context;

class E {
    private String a;

    E() {
    }

    private static String b(Context object) {
        String string = object.getPackageManager().getInstallerPackageName(object.getPackageName());
        object = string;
        if (string == null) {
            object = "";
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    String a(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.a != null) break block3;
                        this.a = E.b(object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                if (!"".equals(this.a)) return this.a;
                return null;
            }
            throw throwable2;
        }
    }
}

