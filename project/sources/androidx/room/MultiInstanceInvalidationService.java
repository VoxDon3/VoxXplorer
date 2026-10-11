package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ax.Gb.l;
import ax.k2.InterfaceC2379j;
import ax.k2.InterfaceC2380k;
import ax.sb.t;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int a;
    private final Map<Integer, String> b = new LinkedHashMap();
    private final RemoteCallbackList<InterfaceC2379j> c = new b();
    private final InterfaceC2380k.a d = new a();

    public static final class a extends InterfaceC2380k.a {
        a() {
        }

        @Override // ax.k2.InterfaceC2380k
        public int E(InterfaceC2379j interfaceC2379j, String str) {
            l.f(interfaceC2379j, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<InterfaceC2379j> a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(interfaceC2379j, Integer.valueOf(c))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c), str);
                        i = c;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // ax.k2.InterfaceC2380k
        public void N1(int i, String[] strArr) {
            l.f(strArr, "tables");
            RemoteCallbackList<InterfaceC2379j> a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                String str = multiInstanceInvalidationService.b().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i2);
                        l.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.b().get(num);
                        if (i != intValue && l.a(str, str2)) {
                            try {
                                multiInstanceInvalidationService.a().getBroadcastItem(i2).b0(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                t tVar = t.a;
            }
        }

        @Override // ax.k2.InterfaceC2380k
        public void b1(InterfaceC2379j interfaceC2379j, int i) {
            l.f(interfaceC2379j, "callback");
            RemoteCallbackList<InterfaceC2379j> a = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a) {
                multiInstanceInvalidationService.a().unregister(interfaceC2379j);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(i));
            }
        }
    }

    public static final class b extends RemoteCallbackList<InterfaceC2379j> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC2379j interfaceC2379j, Object obj) {
            l.f(interfaceC2379j, "callback");
            l.f(obj, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList<InterfaceC2379j> a() {
        return this.c;
    }

    public final Map<Integer, String> b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final void d(int i) {
        this.a = i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.d;
    }
}
