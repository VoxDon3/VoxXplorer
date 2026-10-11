/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.app.Application;
import ax.Gb.l;

final class a {
    public static final a a = new a();

    private a() {
    }

    public final String a() {
        String string = Application.getProcessName();
        l.e(string, "getProcessName()");
        return string;
    }
}

