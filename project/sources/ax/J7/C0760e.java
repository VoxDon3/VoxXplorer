package ax.J7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ax.J7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0760e {
    private final Float a;
    private final boolean b;

    private C0760e(Float f, boolean z) {
        this.b = z;
        this.a = f;
    }

    public static C0760e a(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = e(registerReceiver);
                f = d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            ax.G7.g.f().e("An error occurred getting battery state.", e);
        }
        return new C0760e(f, z);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f;
        if (!this.b || (f = this.a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
