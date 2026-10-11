/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ax.Fb.p;
import ax.Gb.g;
import ax.Gb.l;
import ax.Qb.J;
import ax.Qb.K;
import ax.Qb.s0;
import ax.n8.G;
import ax.o8.b;
import ax.sb.t;
import ax.tb.o;
import ax.wb.e;
import ax.wb.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

public final class E {
    public static final b f = new b(null);
    private final i a;
    private Messenger b;
    private boolean c;
    private final LinkedBlockingDeque<Message> d;
    private final d e;

    public E(i i8) {
        l.f(i8, "backgroundDispatcher");
        this.a = i8;
        this.d = new LinkedBlockingDeque(20);
        this.e = new ServiceConnection(this){
            final E q;
            {
                this.q = e8;
            }

            public void onServiceConnected(ComponentName object, IBinder iBinder) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Connected to SessionLifecycleService. Queue size ");
                ((StringBuilder)object).append(this.q.d.size());
                Log.d((String)"SessionLifecycleClient", (String)((StringBuilder)object).toString());
                this.q.b = new Messenger(iBinder);
                this.q.c = true;
                object = this.q;
                ((E)object).o(((E)object).j());
            }

            public void onServiceDisconnected(ComponentName componentName) {
                Log.d((String)"SessionLifecycleClient", (String)"Disconnected from SessionLifecycleService");
                this.q.b = null;
                this.q.c = false;
            }
        };
    }

    private final List<Message> j() {
        ArrayList<Message> arrayList = new ArrayList<Message>();
        this.d.drainTo(arrayList);
        return arrayList;
    }

    private final Message l(List<Message> list, int n8) {
        block4: {
            Iterator iterator;
            List<Object> list2;
            block3: {
                list2 = list;
                list = new ArrayList();
                for (Object object : list2) {
                    if (((Message)object).what != n8) continue;
                    list.add((Message)object);
                }
                iterator = list.iterator();
                if (iterator.hasNext()) break block3;
                list = null;
                break block4;
            }
            list = iterator.next();
            if (!iterator.hasNext()) break block4;
            long l8 = ((Message)list).getWhen();
            list2 = list;
            do {
                Object t8 = iterator.next();
                long l9 = ((Message)t8).getWhen();
                long l10 = l8;
                list = list2;
                if (l8 < l9) {
                    list = t8;
                    l10 = l9;
                }
                l8 = l10;
                list2 = list;
            } while (iterator.hasNext());
        }
        return (Message)list;
    }

    private final void m(Message message) {
        if (this.d.offer(message)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Queued message ");
            stringBuilder.append(message.what);
            stringBuilder.append(". Queue size ");
            stringBuilder.append(this.d.size());
            Log.d((String)"SessionLifecycleClient", (String)stringBuilder.toString());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to enqueue message ");
        stringBuilder.append(message.what);
        stringBuilder.append(". Dropping.");
        Log.d((String)"SessionLifecycleClient", (String)stringBuilder.toString());
    }

    private final void n(int n8) {
        List<Message> list = this.j();
        Message message = Message.obtain(null, (int)n8, (int)0, (int)0);
        l.e(message, "obtain(null, messageCode, 0, 0)");
        list.add(message);
        this.o(list);
    }

    private final s0 o(List<Message> list) {
        return ax.Qb.g.d(K.a(this.a), null, null, new p<J, e<? super t>, Object>(this, list, null){
            int f0;
            final E g0;
            final List<Message> h0;
            {
                this.g0 = e8;
                this.h0 = list;
                super(2, e9);
            }

            @Override
            public final e<t> a(Object object, e<?> e8) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object p(Object object) {
                Iterator iterator;
                Object object2 = ax.xb.b.c();
                int n8 = this.f0;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    ax.sb.o.b(object);
                } else {
                    ax.sb.o.b(object);
                    object = ax.o8.a.a;
                    this.f0 = 1;
                    iterator = ((ax.o8.a)object).c(this);
                    object = iterator;
                    if (iterator == object2) {
                        return object2;
                    }
                }
                object = (Map)object;
                if (object.isEmpty()) {
                    Log.d((String)"SessionLifecycleClient", (String)"Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                    return t.a;
                } else if (!((object = (Iterable)object.values()) instanceof Collection) || !((Collection)object).isEmpty()) {
                    object = object.iterator();
                    while (object.hasNext()) {
                        if (!((ax.o8.b)object.next()).a()) continue;
                        iterator = o.R(o.B((Iterable)o.n(this.g0.l(this.h0, 2), this.g0.l(this.h0, 1))), new Comparator(){

                            @Override
                            public final int compare(T t8, T t9) {
                                return ax.vb.a.a(((Message)t8).getWhen(), ((Message)t9).getWhen());
                            }
                        });
                        object = this.g0;
                        iterator = iterator.iterator();
                        while (iterator.hasNext()) {
                            ((E)object).p((Message)iterator.next());
                        }
                        return t.a;
                    }
                } else {
                    Log.d((String)"SessionLifecycleClient", (String)"Data Collection is disabled for all subscribers. Skipping this Event");
                }
                return t.a;
            }

            public final Object u(J j8, e<? super t> e8) {
                return (this.a(j8, e8)).p(t.a);
            }
        }, 3, null);
    }

    private final void p(Message message) {
        if (this.b != null) {
            block4: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Sending lifecycle ");
                stringBuilder.append(message.what);
                stringBuilder.append(" to service");
                Log.d((String)"SessionLifecycleClient", (String)stringBuilder.toString());
                stringBuilder = this.b;
                if (stringBuilder == null) break block4;
                try {
                    stringBuilder.send(message);
                    return;
                }
                catch (RemoteException remoteException) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Unable to deliver message: ");
                    stringBuilder2.append(message.what);
                    Log.w((String)"SessionLifecycleClient", (String)stringBuilder2.toString(), (Throwable)remoteException);
                    this.m(message);
                }
            }
            return;
        }
        this.m(message);
    }

    public final void h() {
        this.n(2);
    }

    public final void i(G g8) {
        l.f(g8, "sessionLifecycleServiceBinder");
        g8.a(new Messenger((Handler)new a(this.a)), this.e);
    }

    public final void k() {
        this.n(1);
    }

    public static final class a
    extends Handler {
        private final i a;

        public a(i i8) {
            l.f(i8, "backgroundDispatcher");
            super(Looper.getMainLooper());
            this.a = i8;
        }

        private final void a(String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Session update received: ");
            stringBuilder.append(string);
            Log.d((String)"SessionLifecycleClient", (String)stringBuilder.toString());
            ax.Qb.g.d(K.a(this.a), null, null, new p<J, e<? super t>, Object>(string, null){
                int f0;
                final String g0;
                {
                    this.g0 = string;
                    super(2, e8);
                }

                @Override
                public final e<t> a(Object object, e<?> e8) {
                    return new /* invalid duplicate definition of identical inner class */;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object p(Object object) {
                    Iterator iterator;
                    Object object2 = ax.xb.b.c();
                    int n8 = this.f0;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        ax.sb.o.b(object);
                    } else {
                        ax.sb.o.b(object);
                        object = ax.o8.a.a;
                        this.f0 = 1;
                        iterator = ((ax.o8.a)object).c(this);
                        object = iterator;
                        if (iterator == object2) {
                            return object2;
                        }
                    }
                    iterator = ((Map)object).values();
                    object = this.g0;
                    iterator = iterator.iterator();
                    while (iterator.hasNext()) {
                        ax.o8.b b8 = (ax.o8.b)iterator.next();
                        b8.c(new b.b((String)object));
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Notified ");
                        ((StringBuilder)object2).append((Object)b8.b());
                        ((StringBuilder)object2).append(" of new session ");
                        ((StringBuilder)object2).append((String)object);
                        Log.d((String)"SessionLifecycleClient", (String)((StringBuilder)object2).toString());
                    }
                    return t.a;
                }

                public final Object u(J j8, e<? super t> e8) {
                    return (this.a(j8, e8)).p(t.a);
                }
            }, 3, null);
        }

        public void handleMessage(Message object) {
            block2: {
                block4: {
                    block3: {
                        l.f(object, "msg");
                        if (object.what != 3) break block2;
                        if ((object = object.getData()) == null) break block3;
                        String string = object.getString("SessionUpdateExtra");
                        object = string;
                        if (string != null) break block4;
                    }
                    object = "";
                }
                this.a((String)object);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Received unexpected event from the SessionLifecycleService: ");
            stringBuilder.append(object);
            Log.w((String)"SessionLifecycleClient", (String)stringBuilder.toString());
            super.handleMessage(object);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }
}

