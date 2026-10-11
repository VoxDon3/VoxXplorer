/*
 * Decompiled with CFR 0.152.
 */
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
import ax.n8.F;
import ax.p8.f;
import com.google.firebase.sessions.c;
import java.io.Serializable;
import java.util.ArrayList;

public final class SessionLifecycleService
extends Service {
    public static final a d = new a(null);
    private final HandlerThread a = new HandlerThread("FirebaseSessions_HandlerThread");
    private b b;
    private Messenger c;

    private final Messenger a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (Messenger)F.a(intent, "ClientCallbackMessenger", Messenger.class);
        }
        return (Messenger)intent.getParcelableExtra("ClientCallbackMessenger");
    }

    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d((String)"SessionLifecycleService", (String)"Service bound with null intent. Ignoring.");
            return null;
        }
        Object object = new StringBuilder();
        object.append("Service bound to new client on process ");
        object.append(intent.getAction());
        Log.d((String)"SessionLifecycleService", (String)object.toString());
        object = this.a(intent);
        if (object != null) {
            intent = Message.obtain(null, (int)4, (int)0, (int)0);
            intent.replyTo = object;
            object = this.b;
            if (object != null) {
                object.sendMessage((Message)intent);
            }
        }
        if ((intent = this.c) != null) {
            return intent.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.a.start();
        Looper looper = this.a.getLooper();
        l.e(looper, "handlerThread.looper");
        this.b = new b(looper);
        this.c = new Messenger((Handler)this.b);
    }

    public void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    extends Handler {
        private boolean a;
        private long b;
        private final ArrayList<Messenger> c;

        public b(Looper looper) {
            l.f(looper, "looper");
            super(looper);
            this.c = new ArrayList();
        }

        private final void a() {
            Serializable serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Broadcasting new session: ");
            c.b b8 = com.google.firebase.sessions.c.f;
            ((StringBuilder)serializable).append(b8.a().c());
            Log.d((String)"SessionLifecycleService", (String)((StringBuilder)serializable).toString());
            com.google.firebase.sessions.b.a.a().a(b8.a().c());
            serializable = new ArrayList<Messenger>(this.c);
            int n8 = ((ArrayList)serializable).size();
            for (int i8 = 0; i8 < n8; ++i8) {
                b8 = ((ArrayList)serializable).get(i8);
                b8 = (Messenger)b8;
                l.e(b8, "it");
                this.f((Messenger)b8);
            }
        }

        private final void b(Message message) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Activity backgrounding at ");
            stringBuilder.append(message.getWhen());
            Log.d((String)"SessionLifecycleService", (String)stringBuilder.toString());
            this.b = message.getWhen();
        }

        private final void c(Message message) {
            this.c.add(message.replyTo);
            Object object = message.replyTo;
            l.e(object, "msg.replyTo");
            this.f((Messenger)object);
            object = new StringBuilder();
            ((StringBuilder)object).append("Client ");
            ((StringBuilder)object).append(message.replyTo);
            ((StringBuilder)object).append(" bound at ");
            ((StringBuilder)object).append(message.getWhen());
            ((StringBuilder)object).append(". Clients: ");
            ((StringBuilder)object).append(this.c.size());
            Log.d((String)"SessionLifecycleService", (String)((StringBuilder)object).toString());
        }

        private final void d(Message message) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Activity foregrounding at ");
            stringBuilder.append(message.getWhen());
            stringBuilder.append('.');
            Log.d((String)"SessionLifecycleService", (String)stringBuilder.toString());
            if (!this.a) {
                Log.d((String)"SessionLifecycleService", (String)"Cold start detected.");
                this.a = true;
                this.g();
            } else if (this.e(message.getWhen())) {
                Log.d((String)"SessionLifecycleService", (String)"Session too long in background. Creating new session.");
                this.g();
            }
            this.b = message.getWhen();
        }

        private final boolean e(long l8) {
            return l8 - this.b > ax.Pb.a.u(f.c.c().c());
        }

        private final void f(Messenger messenger) {
            if (this.a) {
                this.h(messenger, com.google.firebase.sessions.c.f.a().c().b());
                return;
            }
            String string = com.google.firebase.sessions.a.a.a().a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("App has not yet foregrounded. Using previously stored session: ");
            stringBuilder.append(string);
            Log.d((String)"SessionLifecycleService", (String)stringBuilder.toString());
            if (string != null) {
                this.h(messenger, string);
            }
        }

        private final void g() {
            c.b b8 = com.google.firebase.sessions.c.f;
            b8.a().a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Generated new session ");
            stringBuilder.append(b8.a().c().b());
            Log.d((String)"SessionLifecycleService", (String)stringBuilder.toString());
            this.a();
            com.google.firebase.sessions.a.a.a().b(b8.a().c().b());
        }

        private final void h(Messenger messenger, String string) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", string);
                string = Message.obtain(null, (int)3, (int)0, (int)0);
                string.setData(bundle);
                messenger.send((Message)string);
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to push new session to ");
                stringBuilder.append(messenger);
                stringBuilder.append('.');
                Log.w((String)"SessionLifecycleService", (String)stringBuilder.toString(), (Throwable)exception);
            }
            catch (DeadObjectException deadObjectException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Removing dead client from list: ");
                stringBuilder.append(messenger);
                Log.d((String)"SessionLifecycleService", (String)stringBuilder.toString());
                this.c.remove(messenger);
            }
        }

        public void handleMessage(Message message) {
            l.f(message, "msg");
            if (this.b > message.getWhen()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring old message from ");
                stringBuilder.append(message.getWhen());
                stringBuilder.append(" which is older than ");
                stringBuilder.append(this.b);
                stringBuilder.append('.');
                Log.d((String)"SessionLifecycleService", (String)stringBuilder.toString());
                return;
            }
            int n8 = message.what;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 4) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Received unexpected event from the SessionLifecycleClient: ");
                        stringBuilder.append(message);
                        Log.w((String)"SessionLifecycleService", (String)stringBuilder.toString());
                        super.handleMessage(message);
                        return;
                    }
                    this.c(message);
                    return;
                }
                this.b(message);
                return;
            }
            this.d(message);
        }
    }
}

