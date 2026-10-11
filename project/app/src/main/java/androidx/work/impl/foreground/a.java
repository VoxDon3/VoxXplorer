/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import ax.B2.i;
import ax.C2.D;
import ax.G2.c;
import ax.G2.d;
import ax.G2.e;
import ax.K2.m;
import ax.K2.v;
import ax.K2.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class a
implements c,
ax.C2.e {
    static final String k = ax.B2.i.i("SystemFgDispatcher");
    private Context a;
    private D b;
    private final ax.N2.c c;
    final Object d;
    m e;
    final Map<m, ax.B2.e> f;
    final Map<m, v> g;
    final Set<v> h;
    final d i;
    private b j;

    a(Context object) {
        this.a = object;
        this.d = new Object();
        object = D.j((Context)object);
        this.b = object;
        this.c = ((D)object).p();
        this.e = null;
        this.f = new LinkedHashMap<m, ax.B2.e>();
        this.h = new HashSet<v>();
        this.g = new HashMap<m, v>();
        this.i = new e(this.b.n(), this);
        this.b.l().g(this);
    }

    public static Intent c(Context context, m m8, ax.B2.e e8) {
        context = new Intent(context, SystemForegroundService.class);
        context.setAction("ACTION_NOTIFY");
        context.putExtra("KEY_NOTIFICATION_ID", e8.c());
        context.putExtra("KEY_FOREGROUND_SERVICE_TYPE", e8.a());
        context.putExtra("KEY_NOTIFICATION", (Parcelable)e8.b());
        context.putExtra("KEY_WORKSPEC_ID", m8.b());
        context.putExtra("KEY_GENERATION", m8.a());
        return context;
    }

    public static Intent d(Context context, m m8, ax.B2.e e8) {
        context = new Intent(context, SystemForegroundService.class);
        context.setAction("ACTION_START_FOREGROUND");
        context.putExtra("KEY_WORKSPEC_ID", m8.b());
        context.putExtra("KEY_GENERATION", m8.a());
        context.putExtra("KEY_NOTIFICATION_ID", e8.c());
        context.putExtra("KEY_FOREGROUND_SERVICE_TYPE", e8.a());
        context.putExtra("KEY_NOTIFICATION", (Parcelable)e8.b());
        return context;
    }

    public static Intent g(Context context) {
        context = new Intent(context, SystemForegroundService.class);
        context.setAction("ACTION_STOP_FOREGROUND");
        return context;
    }

    private void h(Intent object) {
        i i8 = ax.B2.i.e();
        String string = k;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stopping foreground work for ");
        stringBuilder.append(object);
        i8.f(string, stringBuilder.toString());
        object = object.getStringExtra("KEY_WORKSPEC_ID");
        if (object != null && !TextUtils.isEmpty((CharSequence)object)) {
            this.b.e(UUID.fromString((String)object));
        }
    }

    private void i(Intent object) {
        int n8 = 0;
        int n9 = object.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int n10 = object.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        Object object2 = object.getStringExtra("KEY_WORKSPEC_ID");
        m m8 = new m((String)object2, object.getIntExtra("KEY_GENERATION", 0));
        object = (Notification)object.getParcelableExtra("KEY_NOTIFICATION");
        i i8 = ax.B2.i.e();
        String string = k;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Notifying with (id:");
        stringBuilder.append(n9);
        stringBuilder.append(", workSpecId: ");
        stringBuilder.append((String)object2);
        stringBuilder.append(", notificationType :");
        stringBuilder.append(n10);
        stringBuilder.append(")");
        i8.a(string, stringBuilder.toString());
        if (object != null && this.j != null) {
            object2 = new ax.B2.e(n9, (Notification)object, n10);
            this.f.put(m8, (ax.B2.e)object2);
            if (this.e == null) {
                this.e = m8;
                this.j.b(n9, n10, (Notification)object);
                return;
            }
            this.j.c(n9, (Notification)object);
            if (n10 != 0 && Build.VERSION.SDK_INT >= 29) {
                object = this.f.entrySet().iterator();
                while (object.hasNext()) {
                    n8 |= ((ax.B2.e)((Map.Entry)object.next()).getValue()).a();
                }
                object = this.f.get(this.e);
                if (object != null) {
                    this.j.b(((ax.B2.e)object).c(), n8, ((ax.B2.e)object).b());
                }
            }
        }
    }

    private void j(Intent object) {
        i i8 = ax.B2.i.e();
        String string = k;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Started foreground service ");
        stringBuilder.append(object);
        i8.f(string, stringBuilder.toString());
        object = object.getStringExtra("KEY_WORKSPEC_ID");
        this.c.c(new Runnable(){
            final a c0;
            final String q;
            {
                this.c0 = a8;
                this.q = string;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Object object = this.c0.b.l().h(this.q);
                if (object != null && ((v)object).f()) {
                    Object object2 = this.c0.d;
                    synchronized (object2) {
                        this.c0.g.put(y.a((v)object), (v)object);
                        this.c0.h.add((v)object);
                        object = this.c0;
                        ((a)object).i.b(((a)object).h);
                        return;
                    }
                }
            }
        });
    }

    @Override
    public void b(List<v> object) {
        if (!object.isEmpty()) {
            Iterator<v> iterator = object.iterator();
            while (iterator.hasNext()) {
                v v8 = iterator.next();
                object = v8.a;
                i i8 = ax.B2.i.e();
                String string = k;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Constraints unmet for WorkSpec ");
                stringBuilder.append((String)object);
                i8.a(string, stringBuilder.toString());
                this.b.w(y.a(v8));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void e(m m8, boolean bl) {
        Object object;
        Object object3 = this.d;
        // MONITORENTER : object3
        Object object2 = this.g.remove(m8);
        bl = object2 != null ? this.h.remove(object2) : false;
        if (bl) {
            this.i.b(this.h);
        }
        // MONITOREXIT : object3
        object2 = this.f.remove(m8);
        if (m8.equals(this.e) && this.f.size() > 0) {
            object = this.f.entrySet().iterator();
            object3 = object.next();
            while (object.hasNext()) {
                object3 = (Map.Entry)object.next();
            }
            this.e = object3.getKey();
            if (this.j != null) {
                object3 = (ax.B2.e)object3.getValue();
                this.j.b(((ax.B2.e)object3).c(), ((ax.B2.e)object3).a(), ((ax.B2.e)object3).b());
                this.j.d(((ax.B2.e)object3).c());
            }
        }
        b b8 = this.j;
        if (object2 == null) return;
        if (b8 == null) return;
        object3 = ax.B2.i.e();
        String string = k;
        object = new StringBuilder();
        ((StringBuilder)object).append("Removing Notification (id: ");
        ((StringBuilder)object).append(((ax.B2.e)object2).c());
        ((StringBuilder)object).append(", workSpecId: ");
        ((StringBuilder)object).append(m8);
        ((StringBuilder)object).append(", notificationType: ");
        ((StringBuilder)object).append(((ax.B2.e)object2).a());
        ((i)object3).a(string, ((StringBuilder)object).toString());
        b8.d(((ax.B2.e)object2).c());
    }

    @Override
    public void f(List<v> list) {
    }

    void k(Intent object) {
        ax.B2.i.e().f(k, "Stopping foreground service");
        object = this.j;
        if (object != null) {
            object.stop();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void l() {
        this.j = null;
        Object object = this.d;
        synchronized (object) {
            this.i.a();
        }
        this.b.l().l(this);
    }

    void m(Intent intent) {
        String string = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(string)) {
            this.j(intent);
            this.i(intent);
            return;
        }
        if ("ACTION_NOTIFY".equals(string)) {
            this.i(intent);
            return;
        }
        if ("ACTION_CANCEL_WORK".equals(string)) {
            this.h(intent);
            return;
        }
        if ("ACTION_STOP_FOREGROUND".equals(string)) {
            this.k(intent);
        }
    }

    void n(b b8) {
        if (this.j != null) {
            ax.B2.i.e().c(k, "A callback already exists.");
            return;
        }
        this.j = b8;
    }

    static interface b {
        public void b(int var1, int var2, Notification var3);

        public void c(int var1, Notification var2);

        public void d(int var1);

        public void stop();
    }
}

