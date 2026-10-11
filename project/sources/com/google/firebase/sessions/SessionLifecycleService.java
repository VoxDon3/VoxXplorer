package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.p8.f;
import com.google.firebase.sessions.c;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SessionLifecycleService extends Service {
    public static final a d = new a(null);
    private final HandlerThread a = new HandlerThread("FirebaseSessions_HandlerThread");
    private b b;
    private Messenger c;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Handler {
        private boolean a;
        private long b;
        private final ArrayList<Messenger> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            l.f(looper, "looper");
            this.c = new ArrayList<>();
        }

        private final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            c.b bVar = c.f;
            sb.append(bVar.a().c());
            Log.d("SessionLifecycleService", sb.toString());
            com.google.firebase.sessions.b.a.a().a(bVar.a().c());
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Messenger messenger = (Messenger) obj;
                l.e(messenger, "it");
                f(messenger);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.b = message.getWhen();
        }

        private final void c(Message message) {
            this.c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            l.e(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.b = message.getWhen();
        }

        private final boolean e(long j) {
            return j - this.b > ax.Pb.a.u(f.c.c().c());
        }

        private final void f(Messenger messenger) {
            if (this.a) {
                h(messenger, c.f.a().c().b());
                return;
            }
            String a = com.google.firebase.sessions.a.a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + a);
            if (a != null) {
                h(messenger, a);
            }
        }

        private final void g() {
            c.b bVar = c.f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.a().c().b());
            a();
            com.google.firebase.sessions.a.a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.c.remove(messenger);
            } catch (Exception e) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            l.f(message, "msg");
            if (this.b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.b + '.');
                return;
            }
            int i = message.what;
            if (i == 1) {
                d(message);
                return;
            }
            if (i == 2) {
                b(message);
                return;
            }
            if (i == 4) {
                c(message);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
            super.handleMessage(message);
        }
    }

    private final Messenger a(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT < 33) {
            return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
        }
        parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
        return (Messenger) parcelableExtra;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a2 = a(intent);
        if (a2 != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a2;
            b bVar = this.b;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.c;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a.start();
        Looper looper = this.a.getLooper();
        l.e(looper, "handlerThread.looper");
        this.b = new b(looper);
        this.c = new Messenger(this.b);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }
}
