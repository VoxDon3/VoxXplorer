/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.app.Activity;
import android.util.Log;
import ax.U9.d;

abstract class x
extends Enum<x> {
    public static final /* enum */ x c0;
    public static final /* enum */ x d0;
    public static final /* enum */ x e0;
    private static final x[] f0;
    public static final /* enum */ x q;

    static {
        q = new x(){

            @Override
            public d j() {
                return d.q;
            }
        };
        c0 = new x(){

            @Override
            public d j() {
                return d.q;
            }
        };
        d0 = new x(){

            @Override
            public d j() {
                return d.c0;
            }
        };
        e0 = new x(){

            @Override
            public d j() {
                return d.c0;
            }
        };
        f0 = x.d();
    }

    private static /* synthetic */ x[] d() {
        return new x[]{q, c0, d0, e0};
    }

    public static x h(Activity activity) {
        int n8 = activity.getResources().getConfiguration().screenLayout & 0xF;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        Log.d((String)"Live SDK ScreenSize", (String)"Unable to determine ScreenSize. A Normal ScreenSize will be returned.");
                        return c0;
                    }
                    return e0;
                }
                return d0;
            }
            return c0;
        }
        return q;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }

    public static x[] values() {
        return (x[])f0.clone();
    }

    public abstract d j();
}

