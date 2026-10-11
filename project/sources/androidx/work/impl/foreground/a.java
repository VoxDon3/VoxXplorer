package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import ax.B2.e;
import ax.B2.i;
import ax.C2.D;
import ax.C2.InterfaceC0656e;
import ax.G2.c;
import ax.G2.d;
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

/* loaded from: classes.dex */
public class a implements c, InterfaceC0656e {
    static final String k = i.i("SystemFgDispatcher");
    private Context a;
    private D b;
    private final ax.N2.c c;
    final Object d = new Object();
    m e;
    final Map<m, e> f;
    final Map<m, v> g;
    final Set<v> h;
    final d i;
    private b j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0049a implements Runnable {
        final /* synthetic */ String q;

        RunnableC0049a(String str) {
            this.q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v h = a.this.b.l().h(this.q);
            if (h == null || !h.f()) {
                return;
            }
            synchronized (a.this.d) {
                a.this.g.put(y.a(h), h);
                a.this.h.add(h);
                a aVar = a.this;
                aVar.i.b(aVar.h);
            }
        }
    }

    interface b {
        void b(int i, int i2, Notification notification);

        void c(int i, Notification notification);

        void d(int i);

        void stop();
    }

    a(Context context) {
        this.a = context;
        D j = D.j(context);
        this.b = j;
        this.c = j.p();
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashSet();
        this.g = new HashMap();
        this.i = new ax.G2.e(this.b.n(), this);
        this.b.l().g(this);
    }

    public static Intent c(Context context, m mVar, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent d(Context context, m mVar, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        i.e().f(k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.b.e(UUID.fromString(stringExtra));
    }

    private void i(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        m mVar = new m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        i.e().a(k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.j == null) {
            return;
        }
        this.f.put(mVar, new e(intExtra, notification, intExtra2));
        if (this.e == null) {
            this.e = mVar;
            this.j.b(intExtra, intExtra2, notification);
            return;
        }
        this.j.c(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<m, e>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            i |= it.next().getValue().a();
        }
        e eVar = this.f.get(this.e);
        if (eVar != null) {
            this.j.b(eVar.c(), i, eVar.b());
        }
    }

    private void j(Intent intent) {
        i.e().f(k, "Started foreground service " + intent);
        this.c.c(new RunnableC0049a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // ax.G2.c
    public void b(List<v> list) {
        if (list.isEmpty()) {
            return;
        }
        for (v vVar : list) {
            String str = vVar.a;
            i.e().a(k, "Constraints unmet for WorkSpec " + str);
            this.b.w(y.a(vVar));
        }
    }

    @Override // ax.C2.InterfaceC0656e
    public void e(m mVar, boolean z) {
        Map.Entry<m, e> entry;
        synchronized (this.d) {
            try {
                v remove = this.g.remove(mVar);
                if (remove != null ? this.h.remove(remove) : false) {
                    this.i.b(this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e remove2 = this.f.remove(mVar);
        if (mVar.equals(this.e) && this.f.size() > 0) {
            Iterator<Map.Entry<m, e>> it = this.f.entrySet().iterator();
            Map.Entry<m, e> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.e = entry.getKey();
            if (this.j != null) {
                e value = entry.getValue();
                this.j.b(value.c(), value.a(), value.b());
                this.j.d(value.c());
            }
        }
        b bVar = this.j;
        if (remove2 == null || bVar == null) {
            return;
        }
        i.e().a(k, "Removing Notification (id: " + remove2.c() + ", workSpecId: " + mVar + ", notificationType: " + remove2.a());
        bVar.d(remove2.c());
    }

    @Override // ax.G2.c
    public void f(List<v> list) {
    }

    void k(Intent intent) {
        i.e().f(k, "Stopping foreground service");
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void l() {
        this.j = null;
        synchronized (this.d) {
            this.i.a();
        }
        this.b.l().l(this);
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    void n(b bVar) {
        if (this.j != null) {
            i.e().c(k, "A callback already exists.");
        } else {
            this.j = bVar;
        }
    }
}
