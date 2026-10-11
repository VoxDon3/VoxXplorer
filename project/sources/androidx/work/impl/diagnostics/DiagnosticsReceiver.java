package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import ax.B2.i;
import ax.B2.k;
import ax.B2.s;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = i.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        i.e().a(a, "Requesting diagnostics");
        try {
            s.c(context).a(k.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            i.e().d(a, "WorkManager is not initialized", e);
        }
    }
}
