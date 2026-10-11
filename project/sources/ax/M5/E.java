package ax.M5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import ax.L5.InterfaceC0794f;

/* loaded from: classes3.dex */
public abstract class E implements DialogInterface.OnClickListener {
    public static E b(Activity activity, Intent intent, int i) {
        return new C(intent, activity, i);
    }

    public static E c(InterfaceC0794f interfaceC0794f, Intent intent, int i) {
        return new D(intent, interfaceC0794f, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
