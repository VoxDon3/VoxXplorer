package ax.n8;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import ax.x7.C3471f;
import com.google.firebase.sessions.SessionLifecycleService;

/* renamed from: ax.n8.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2594H implements InterfaceC2593G {
    private static final a b = new a(null);
    private final C3471f a;

    /* renamed from: ax.n8.H$a */
    private static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C2594H(C3471f c3471f) {
        ax.Gb.l.f(c3471f, "firebaseApp");
        this.a = c3471f;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return ax.sb.t.a;
        } catch (IllegalArgumentException e) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e));
        }
    }

    @Override // ax.n8.InterfaceC2593G
    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean z;
        ax.Gb.l.f(messenger, "callback");
        ax.Gb.l.f(serviceConnection, "serviceConnection");
        Context applicationContext = this.a.k().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        try {
            z = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e);
            z = false;
        }
        if (z) {
            return;
        }
        ax.Gb.l.e(applicationContext, "appContext");
        b(applicationContext, serviceConnection);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
