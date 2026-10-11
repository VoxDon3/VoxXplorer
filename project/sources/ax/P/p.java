package ax.P;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import ax.e.InterfaceC1966a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p {
    private static String d;
    private static d g;
    private final Context a;
    private final NotificationManager b;
    private static final Object c = new Object();
    private static Set<String> e = new HashSet();
    private static final Object f = new Object();

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private static class b implements e {
        final String a;
        final int b;
        final String c;
        final Notification d;

        b(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        @Override // ax.P.p.e
        public void a(InterfaceC1966a interfaceC1966a) throws RemoteException {
            interfaceC1966a.R1(this.a, this.b, this.c, this.d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.a + ", id:" + this.b + ", tag:" + this.c + "]";
        }
    }

    private static class c {
        final ComponentName a;
        final IBinder b;

        c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    private static class d implements Handler.Callback, ServiceConnection {
        private final HandlerThread c0;
        private final Handler d0;
        private final Map<ComponentName, a> e0 = new HashMap();
        private Set<String> f0 = new HashSet();
        private final Context q;

        private static class a {
            final ComponentName a;
            InterfaceC1966a c;
            boolean b = false;
            ArrayDeque<e> d = new ArrayDeque<>();
            int e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        d(Context context) {
            this.q = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.c0 = handlerThread;
            handlerThread.start();
            this.d0 = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            boolean bindService = this.q.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
            aVar.b = bindService;
            if (bindService) {
                aVar.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.a);
                this.q.unbindService(this);
            }
            return aVar.b;
        }

        private void b(a aVar) {
            if (aVar.b) {
                this.q.unbindService(this);
                aVar.b = false;
            }
            aVar.c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.e0.values()) {
                aVar.d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.e0.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.e0.get(componentName);
            if (aVar != null) {
                aVar.c = InterfaceC1966a.AbstractBinderC0291a.r(iBinder);
                aVar.e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.e0.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.a + ", " + aVar.d.size() + " queued tasks");
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e peek = aVar.d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.c);
                    aVar.d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.a);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.a, e);
                }
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.d0.hasMessages(3, aVar.a)) {
                return;
            }
            int i = aVar.e;
            int i2 = i + 1;
            aVar.e = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                this.d0.sendMessageDelayed(this.d0.obtainMessage(3, aVar.a), i3);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.d.size() + " tasks to " + aVar.a + " after " + aVar.e + " retries");
            aVar.d.clear();
        }

        private void j() {
            Set<String> e = p.e(this.q);
            if (e.equals(this.f0)) {
                return;
            }
            this.f0 = e;
            List<ResolveInfo> queryIntentServices = this.q.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (e.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.e0.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.e0.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.e0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.d0.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c((e) message.obj);
                return true;
            }
            if (i == 1) {
                c cVar = (c) message.obj;
                e(cVar.a, cVar.b);
                return true;
            }
            if (i == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.d0.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.d0.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface e {
        void a(InterfaceC1966a interfaceC1966a) throws RemoteException;
    }

    private p(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static p d(Context context) {
        return new p(context);
    }

    public static Set<String> e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (c) {
            if (string != null) {
                try {
                    if (!string.equals(d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        e = hashSet;
                        d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = e;
        }
        return set;
    }

    private void h(e eVar) {
        synchronized (f) {
            try {
                if (g == null) {
                    g = new d(this.a.getApplicationContext());
                }
                g.h(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean i(Notification notification) {
        Bundle a2 = l.a(notification);
        return a2 != null && a2.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String packageName = this.a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i) {
        c(null, i);
    }

    public void c(String str, int i) {
        this.b.cancel(str, i);
    }

    public void f(int i, Notification notification) {
        g(null, i, notification);
    }

    public void g(String str, int i, Notification notification) {
        if (!i(notification)) {
            this.b.notify(str, i, notification);
        } else {
            h(new b(this.a.getPackageName(), i, str, notification));
            this.b.cancel(str, i);
        }
    }
}
