/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.G7.g;

class e {
    private final Float a;
    private final boolean b;

    private e(Float f8, boolean bl) {
        this.b = bl;
        this.a = f8;
    }

    public static e a(Context object) {
        boolean bl;
        block6: {
            boolean bl2 = false;
            boolean bl3 = false;
            Object var4_4 = null;
            bl = bl3;
            bl = bl3;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            bl = bl3;
            intentFilter = object.registerReceiver(null, intentFilter);
            bl = bl2;
            object = var4_4;
            if (intentFilter == null) break block6;
            bl = bl3;
            bl = bl3 = e.e((Intent)intentFilter);
            try {
                object = e.d((Intent)intentFilter);
                bl = bl3;
            }
            catch (IllegalStateException illegalStateException) {
                g.f().e("An error occurred getting battery state.", illegalStateException);
                object = var4_4;
            }
        }
        return new e((Float)object, bl);
    }

    private static Float d(Intent intent) {
        int n8 = intent.getIntExtra("level", -1);
        int n9 = intent.getIntExtra("scale", -1);
        if (n8 != -1 && n9 != -1) {
            return Float.valueOf((float)n8 / (float)n9);
        }
        return null;
    }

    private static boolean e(Intent intent) {
        int n8 = intent.getIntExtra("status", -1);
        if (n8 == -1) {
            return false;
        }
        return n8 == 2 || n8 == 5;
        {
        }
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f8;
        if (this.b && (f8 = this.a) != null) {
            if ((double)f8.floatValue() < 0.99) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}

