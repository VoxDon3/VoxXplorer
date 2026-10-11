/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import ax.P.l;
import ax.e.a;
import java.lang.constant.Constable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class p {
    private static final Object c = new Object();
    private static String d;
    private static Set<String> e;
    private static final Object f;
    private static d g;
    private final Context a;
    private final NotificationManager b;

    static {
        e = new HashSet<String>();
        f = new Object();
    }

    private p(Context context) {
        this.a = context;
        this.b = (NotificationManager)context.getSystemService("notification");
    }

    public static p d(Context context) {
        return new p(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set<String> e(Context object) {
        String string = Settings.Secure.getString((ContentResolver)object.getContentResolver(), (String)"enabled_notification_listeners");
        object = c;
        synchronized (object) {
            if (string == null) return e;
            try {
                if (string.equals(d)) return e;
                String[] stringArray = string.split(":", -1);
                HashSet<String> hashSet = new HashSet<String>(stringArray.length);
                int n8 = stringArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    ComponentName componentName = ComponentName.unflattenFromString((String)stringArray[i8]);
                    if (componentName == null) continue;
                    hashSet.add(componentName.getPackageName());
                }
                e = hashSet;
                d = string;
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void h(e e8) {
        Object object = f;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        d d8;
                        if (g != null) break block3;
                        g = d8 = new d(this.a.getApplicationContext());
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                g.h(e8);
                return;
            }
            throw throwable2;
        }
    }

    private static boolean i(Notification notification) {
        return (notification = l.a(notification)) != null && notification.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return ax.P.p$a.a(this.b);
        }
        AppOpsManager appOpsManager = (AppOpsManager)this.a.getSystemService("appops");
        Object object = this.a.getApplicationInfo();
        String string = this.a.getApplicationContext().getPackageName();
        int n8 = ((ApplicationInfo)object).uid;
        try {
            Constable constable = Class.forName(AppOpsManager.class.getName());
            object = Integer.TYPE;
            object = ((Class)constable).getMethod("checkOpNoThrow", new Class[]{object, object, String.class});
            constable = (Integer)((Class)constable).getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            ((Integer)constable).intValue();
            n8 = (Integer)((Method)object).invoke(appOpsManager, constable, n8, string);
            return n8 == 0;
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException exception) {
            return true;
        }
    }

    public void b(int n8) {
        this.c(null, n8);
    }

    public void c(String string, int n8) {
        this.b.cancel(string, n8);
    }

    public void f(int n8, Notification notification) {
        this.g(null, n8, notification);
    }

    public void g(String string, int n8, Notification notification) {
        if (p.i(notification)) {
            this.h(new b(this.a.getPackageName(), n8, string, notification));
            this.b.cancel(string, n8);
            return;
        }
        this.b.notify(string, n8, notification);
    }

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private static class b
    implements e {
        final String a;
        final int b;
        final String c;
        final Notification d;

        b(String string, int n8, String string2, Notification notification) {
            this.a = string;
            this.b = n8;
            this.c = string2;
            this.d = notification;
        }

        @Override
        public void a(ax.e.a a8) throws RemoteException {
            a8.R1(this.a, this.b, this.c, this.d);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotifyTask[");
            stringBuilder.append("packageName:");
            stringBuilder.append(this.a);
            stringBuilder.append(", id:");
            stringBuilder.append(this.b);
            stringBuilder.append(", tag:");
            stringBuilder.append(this.c);
            stringBuilder.append("]");
            return stringBuilder.toString();
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

    private static class d
    implements Handler.Callback,
    ServiceConnection {
        private final HandlerThread c0;
        private final Handler d0;
        private final Map<ComponentName, a> e0 = new HashMap<ComponentName, a>();
        private Set<String> f0 = new HashSet<String>();
        private final Context q;

        d(Context context) {
            this.q = context;
            context = new HandlerThread("NotificationManagerCompat");
            this.c0 = context;
            context.start();
            this.d0 = new Handler(context.getLooper(), (Handler.Callback)this);
        }

        private boolean a(a a8) {
            boolean bl;
            if (a8.b) {
                return true;
            }
            Object object = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(a8.a);
            a8.b = bl = this.q.bindService((Intent)object, (ServiceConnection)this, 33);
            if (bl) {
                a8.e = 0;
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unable to bind to listener ");
                ((StringBuilder)object).append(a8.a);
                Log.w((String)"NotifManCompat", (String)((StringBuilder)object).toString());
                this.q.unbindService((ServiceConnection)this);
            }
            return a8.b;
        }

        private void b(a a8) {
            if (a8.b) {
                this.q.unbindService((ServiceConnection)this);
                a8.b = false;
            }
            a8.c = null;
        }

        private void c(e e8) {
            this.j();
            for (a a8 : this.e0.values()) {
                a8.d.add(e8);
                this.g(a8);
            }
        }

        private void d(ComponentName object) {
            if ((object = this.e0.get(object)) != null) {
                this.g((a)object);
            }
        }

        private void e(ComponentName object, IBinder iBinder) {
            if ((object = this.e0.get(object)) != null) {
                object.c = a.a.r(iBinder);
                object.e = 0;
                this.g((a)object);
            }
        }

        private void f(ComponentName object) {
            if ((object = this.e0.get(object)) != null) {
                this.b((a)object);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void g(a a8) {
            Object object;
            StringBuilder stringBuilder;
            if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Processing component ");
                stringBuilder.append(a8.a);
                stringBuilder.append(", ");
                stringBuilder.append(a8.d.size());
                stringBuilder.append(" queued tasks");
                Log.d((String)"NotifManCompat", (String)stringBuilder.toString());
            }
            if (a8.d.isEmpty()) {
                return;
            }
            if (!this.a(a8) || a8.c == null) {
                this.i(a8);
                return;
            }
            while ((object = a8.d.peek()) != null) {
                block9: {
                    RemoteException remoteException2;
                    block8: {
                        block7: {
                            try {
                                if (!Log.isLoggable((String)"NotifManCompat", (int)3)) break block7;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Sending task ");
                                stringBuilder.append(object);
                                Log.d((String)"NotifManCompat", (String)stringBuilder.toString());
                            }
                            catch (RemoteException remoteException2) {
                                break block8;
                            }
                            catch (DeadObjectException deadObjectException) {
                                break block9;
                            }
                        }
                        object.a(a8.c);
                        a8.d.remove();
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("RemoteException communicating with ");
                    ((StringBuilder)object).append(a8.a);
                    Log.w((String)"NotifManCompat", (String)((StringBuilder)object).toString(), (Throwable)remoteException2);
                    break;
                }
                if (!Log.isLoggable((String)"NotifManCompat", (int)3)) break;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Remote service has died: ");
                stringBuilder2.append(a8.a);
                Log.d((String)"NotifManCompat", (String)stringBuilder2.toString());
                break;
            }
            if (a8.d.isEmpty()) return;
            this.i(a8);
        }

        private void i(a a8) {
            int n8;
            if (this.d0.hasMessages(3, (Object)a8.a)) {
                return;
            }
            int n9 = a8.e;
            a8.e = n8 = n9 + 1;
            if (n8 > 6) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Giving up on delivering ");
                stringBuilder.append(a8.d.size());
                stringBuilder.append(" tasks to ");
                stringBuilder.append(a8.a);
                stringBuilder.append(" after ");
                stringBuilder.append(a8.e);
                stringBuilder.append(" retries");
                Log.w((String)"NotifManCompat", (String)stringBuilder.toString());
                a8.d.clear();
                return;
            }
            n8 = (1 << n9) * 1000;
            if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Scheduling retry for ");
                stringBuilder.append(n8);
                stringBuilder.append(" ms");
                Log.d((String)"NotifManCompat", (String)stringBuilder.toString());
            }
            a8 = this.d0.obtainMessage(3, (Object)a8.a);
            this.d0.sendMessageDelayed((Message)a8, (long)n8);
        }

        private void j() {
            Set<String> object4 = p.e(this.q);
            if (!object4.equals(this.f0)) {
                Object object;
                this.f0 = object4;
                Object object2 = this.q.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ServiceInfo> hashSet = new HashSet<ServiceInfo>();
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    object = (ResolveInfo)object2.next();
                    if (!object4.contains(((ResolveInfo)object).serviceInfo.packageName)) continue;
                    ServiceInfo serviceInfo = ((ResolveInfo)object).serviceInfo;
                    serviceInfo = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (((ResolveInfo)object).serviceInfo.permission != null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Permission present on component ");
                        ((StringBuilder)object).append(serviceInfo);
                        ((StringBuilder)object).append(", not adding listener record.");
                        Log.w((String)"NotifManCompat", (String)((StringBuilder)object).toString());
                        continue;
                    }
                    hashSet.add(serviceInfo);
                }
                for (ComponentName componentName : hashSet) {
                    if (this.e0.containsKey(componentName)) continue;
                    if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Adding listener record for ");
                        ((StringBuilder)object).append(componentName);
                        Log.d((String)"NotifManCompat", (String)((StringBuilder)object).toString());
                    }
                    this.e0.put(componentName, new a(componentName));
                }
                object = this.e0.entrySet().iterator();
                while (object.hasNext()) {
                    object2 = (Map.Entry)object.next();
                    if (hashSet.contains(object2.getKey())) continue;
                    if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Removing listener record for ");
                        stringBuilder.append(object2.getKey());
                        Log.d((String)"NotifManCompat", (String)stringBuilder.toString());
                    }
                    this.b((a)object2.getValue());
                    object.remove();
                }
            }
        }

        public void h(e e8) {
            this.d0.obtainMessage(0, (Object)e8).sendToTarget();
        }

        public boolean handleMessage(Message object) {
            int n8 = object.what;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return false;
                        }
                        this.d((ComponentName)object.obj);
                        return true;
                    }
                    this.f((ComponentName)object.obj);
                    return true;
                }
                object = (c)object.obj;
                this.e(object.a, object.b);
                return true;
            }
            this.c((e)object.obj);
            return true;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Connected to service ");
                stringBuilder.append(componentName);
                Log.d((String)"NotifManCompat", (String)stringBuilder.toString());
            }
            this.d0.obtainMessage(1, (Object)new c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable((String)"NotifManCompat", (int)3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Disconnected from service ");
                stringBuilder.append(componentName);
                Log.d((String)"NotifManCompat", (String)stringBuilder.toString());
            }
            this.d0.obtainMessage(2, (Object)componentName).sendToTarget();
        }

        private static class a {
            final ComponentName a;
            boolean b = false;
            ax.e.a c;
            ArrayDeque<e> d = new ArrayDeque();
            int e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }
    }

    private static interface e {
        public void a(ax.e.a var1) throws RemoteException;
    }
}

