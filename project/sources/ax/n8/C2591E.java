package ax.n8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ax.Qb.C0939i;
import ax.Qb.InterfaceC0959s0;
import ax.o8.C2732a;
import ax.o8.InterfaceC2733b;
import ax.sb.C3083o;
import ax.tb.C3139o;
import ax.vb.C3295a;
import ax.xb.C3479b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import okhttp3.HttpUrl;

/* renamed from: ax.n8.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2591E {
    public static final b f = new b(null);
    private final ax.wb.i a;
    private Messenger b;
    private boolean c;
    private final LinkedBlockingDeque<Message> d;
    private final d e;

    /* renamed from: ax.n8.E$a */
    public static final class a extends Handler {
        private final ax.wb.i a;

        @ax.yb.f(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: ax.n8.E$a$a, reason: collision with other inner class name */
        static final class C0386a extends ax.yb.l implements ax.Fb.p<ax.Qb.J, ax.wb.e<? super ax.sb.t>, Object> {
            int f0;
            final /* synthetic */ String g0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0386a(String str, ax.wb.e<? super C0386a> eVar) {
                super(2, eVar);
                this.g0 = str;
            }

            @Override // ax.yb.AbstractC3520a
            public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
                return new C0386a(this.g0, eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                Object c = C3479b.c();
                int i = this.f0;
                if (i == 0) {
                    C3083o.b(obj);
                    C2732a c2732a = C2732a.a;
                    this.f0 = 1;
                    obj = c2732a.c(this);
                    if (obj == c) {
                        return c;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3083o.b(obj);
                }
                Collection<InterfaceC2733b> values = ((Map) obj).values();
                String str = this.g0;
                for (InterfaceC2733b interfaceC2733b : values) {
                    interfaceC2733b.c(new InterfaceC2733b.C0407b(str));
                    Log.d("SessionLifecycleClient", "Notified " + interfaceC2733b.b() + " of new session " + str);
                }
                return ax.sb.t.a;
            }

            @Override // ax.Fb.p
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(ax.Qb.J j, ax.wb.e<? super ax.sb.t> eVar) {
                return ((C0386a) a(j, eVar)).p(ax.sb.t.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ax.wb.i iVar) {
            super(Looper.getMainLooper());
            ax.Gb.l.f(iVar, "backgroundDispatcher");
            this.a = iVar;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            C0939i.d(ax.Qb.K.a(this.a), null, null, new C0386a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            ax.Gb.l.f(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    /* renamed from: ax.n8.E$b */
    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        private b() {
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: ax.n8.E$c */
    static final class c extends ax.yb.l implements ax.Fb.p<ax.Qb.J, ax.wb.e<? super ax.sb.t>, Object> {
        int f0;
        final /* synthetic */ List<Message> h0;

        /* renamed from: ax.n8.E$c$a */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C3295a.a(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, ax.wb.e<? super c> eVar) {
            super(2, eVar);
            this.h0 = list;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<ax.sb.t> a(Object obj, ax.wb.e<?> eVar) {
            return C2591E.this.new c(this.h0, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            Object c = C3479b.c();
            int i = this.f0;
            if (i == 0) {
                C3083o.b(obj);
                C2732a c2732a = C2732a.a;
                this.f0 = 1;
                obj = c2732a.c(this);
                if (obj == c) {
                    return c;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3083o.b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC2733b) it.next()).a()) {
                            List R = C3139o.R(C3139o.B(C3139o.n(C2591E.this.l(this.h0, 2), C2591E.this.l(this.h0, 1))), new a());
                            C2591E c2591e = C2591E.this;
                            Iterator it2 = R.iterator();
                            while (it2.hasNext()) {
                                c2591e.p((Message) it2.next());
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
            return ax.sb.t.a;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(ax.Qb.J j, ax.wb.e<? super ax.sb.t> eVar) {
            return ((c) a(j, eVar)).p(ax.sb.t.a);
        }
    }

    /* renamed from: ax.n8.E$d */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + C2591E.this.d.size());
            C2591E.this.b = new Messenger(iBinder);
            C2591E.this.c = true;
            C2591E c2591e = C2591E.this;
            c2591e.o(c2591e.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            C2591E.this.b = null;
            C2591E.this.c = false;
        }
    }

    public C2591E(ax.wb.i iVar) {
        ax.Gb.l.f(iVar, "backgroundDispatcher");
        this.a = iVar;
        this.d = new LinkedBlockingDeque<>(20);
        this.e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List<Message> list, int i) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        if (!this.d.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.d.size());
    }

    private final void n(int i) {
        List<Message> j = j();
        Message obtain = Message.obtain(null, i, 0, 0);
        ax.Gb.l.e(obtain, "obtain(null, messageCode, 0, 0)");
        j.add(obtain);
        o(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0959s0 o(List<Message> list) {
        InterfaceC0959s0 d2;
        d2 = C0939i.d(ax.Qb.K.a(this.a), null, null, new c(list, null), 3, null);
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        if (this.b == null) {
            m(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.b;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
            m(message);
        }
    }

    public final void h() {
        n(2);
    }

    public final void i(InterfaceC2593G interfaceC2593G) {
        ax.Gb.l.f(interfaceC2593G, "sessionLifecycleServiceBinder");
        interfaceC2593G.a(new Messenger(new a(this.a)), this.e);
    }

    public final void k() {
        n(1);
    }
}
