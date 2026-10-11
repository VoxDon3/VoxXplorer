/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;

public final class P
extends ContextWrapper {
    private Activity a;

    public P(Application application) {
        super((Context)application);
    }

    public final void a(Activity activity) {
        this.a = activity;
    }

    public final Object getSystemService(String string) {
        Activity activity = this.a;
        if (activity != null) {
            return activity.getSystemService(string);
        }
        return super.getSystemService(string);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(0x10000000);
        super.startActivity(intent);
    }
}

