/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import ax.L5.f;
import ax.M5.C;
import ax.M5.D;

public abstract class E
implements DialogInterface.OnClickListener {
    public static E b(Activity activity, Intent intent, int n8) {
        return new C(intent, activity, n8);
    }

    public static E c(f f8, Intent intent, int n8) {
        return new D(intent, f8, 2);
    }

    protected abstract void a();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(DialogInterface dialogInterface, int n8) {
        Throwable throwable2;
        block5: {
            try {
                try {
                    this.a();
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    String string = "Failed to start resolution intent.";
                    if (Build.FINGERPRINT.contains("generic")) {
                        string = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                    }
                    Log.e((String)"DialogRedirect", (String)string, (Throwable)activityNotFoundException);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            dialogInterface.dismiss();
            return;
        }
        dialogInterface.dismiss();
        throw throwable2;
    }
}

