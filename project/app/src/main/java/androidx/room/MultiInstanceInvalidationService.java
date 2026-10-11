/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ax.Gb.l;
import ax.k2.j;
import ax.k2.k;
import ax.sb.t;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MultiInstanceInvalidationService
extends Service {
    private int a;
    private final Map<Integer, String> b = new LinkedHashMap<Integer, String>();
    private final RemoteCallbackList<j> c = new RemoteCallbackList<j>(this){
        final MultiInstanceInvalidationService a;
        {
            this.a = multiInstanceInvalidationService;
        }

        public void a(j j8, Object object) {
            l.f(j8, "callback");
            l.f(object, "cookie");
            this.a.b().remove((Integer)object);
        }
    };
    private final k.a d = new k.a(this){
        final MultiInstanceInvalidationService e;
        {
            this.e = multiInstanceInvalidationService;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public int E(j j8, String string) {
            l.f(j8, "callback");
            int n8 = 0;
            if (string == null) {
                return 0;
            }
            RemoteCallbackList<j> remoteCallbackList = this.e.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
            synchronized (remoteCallbackList) {
                Throwable throwable2;
                block5: {
                    try {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                        int n9 = multiInstanceInvalidationService.c();
                        if (multiInstanceInvalidationService.a().register((IInterface)j8, (Object)n9)) {
                            multiInstanceInvalidationService.b().put(n9, string);
                            return n9;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                    multiInstanceInvalidationService.c();
                    return n8;
                }
                throw throwable2;
            }
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void N1(int n8, String[] stringArray) {
            l.f(stringArray, "tables");
            RemoteCallbackList<j> remoteCallbackList = this.e.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
            synchronized (remoteCallbackList) {
                int n9;
                String string;
                try {
                    string = multiInstanceInvalidationService.b().get(n8);
                    if (string == null) {
                        Log.w((String)"ROOM", (String)"Remote invalidation client ID not registered");
                        return;
                    }
                    n9 = multiInstanceInvalidationService.a().beginBroadcast();
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (int i8 = 0; i8 < n9; ++i8) {
                    Throwable throwable2;
                    block10: {
                        try {
                            boolean bl;
                            Object object = multiInstanceInvalidationService.a().getBroadcastCookie(i8);
                            l.d(object, "null cannot be cast to non-null type kotlin.Int");
                            object = (Integer)object;
                            int n10 = (Integer)object;
                            object = multiInstanceInvalidationService.b().get(object);
                            if (n8 == n10 || !(bl = l.a(string, object))) continue;
                            ((j)multiInstanceInvalidationService.a().getBroadcastItem(i8)).b0(stringArray);
                            continue;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        catch (RemoteException remoteException) {
                            Log.w((String)"ROOM", (String)"Error invoking a remote callback", (Throwable)remoteException);
                        }
                        continue;
                    }
                    multiInstanceInvalidationService.a().finishBroadcast();
                    throw throwable2;
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                stringArray = t.a;
                return;
            }
        }

        @Override
        public void b1(j object, int n8) {
            l.f(object, "callback");
            RemoteCallbackList<j> remoteCallbackList = this.e.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
            synchronized (remoteCallbackList) {
                multiInstanceInvalidationService.a().unregister((IInterface)object);
                object = multiInstanceInvalidationService.b().remove(n8);
                return;
            }
        }
    };

    public final RemoteCallbackList<j> a() {
        return this.c;
    }

    public final Map<Integer, String> b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final void d(int n8) {
        this.a = n8;
    }

    public IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        return this.d;
    }
}

