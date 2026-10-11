/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.n8.G;
import ax.sb.t;
import ax.x7.f;
import com.google.firebase.sessions.SessionLifecycleService;

public final class H
implements G {
    private static final a b = new a(null);
    private final f a;

    public H(f f8) {
        l.f(f8, "firebaseApp");
        this.a = f8;
    }

    private final Object b(Context object, ServiceConnection serviceConnection) {
        try {
            object.unbindService(serviceConnection);
            object = t.a;
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Log.w((String)"LifecycleServiceBinder", (String)"Session lifecycle service binding failed.", (Throwable)illegalArgumentException);
        }
    }

    @Override
    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean bl;
        l.f(messenger, "callback");
        l.f(serviceConnection, "serviceConnection");
        Context context = this.a.k().getApplicationContext();
        Intent intent = new Intent(context, SessionLifecycleService.class);
        Log.d((String)"LifecycleServiceBinder", (String)"Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", (Parcelable)messenger);
        try {
            bl = context.bindService(intent, serviceConnection, 65);
        }
        catch (SecurityException securityException) {
            Log.w((String)"LifecycleServiceBinder", (String)"Failed to bind session lifecycle service to application.", (Throwable)securityException);
            bl = false;
        }
        if (!bl) {
            l.e(context, "appContext");
            this.b(context, serviceConnection);
            Log.i((String)"LifecycleServiceBinder", (String)"Session lifecycle service binding failed.");
        }
    }

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

