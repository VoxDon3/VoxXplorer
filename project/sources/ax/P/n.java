package ax.P;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import ax.P.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class n implements k {
    private final Context a;
    private final Notification.Builder b;
    private final l.d c;
    private RemoteViews d;
    private RemoteViews e;
    private final List<Bundle> f = new ArrayList();
    private final Bundle g = new Bundle();
    private int h;
    private RemoteViews i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    n(l.d dVar) {
        int i;
        Object obj;
        this.c = dVar;
        Context context = dVar.a;
        this.a = context;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.b = e.a(context, dVar.K);
        } else {
            this.b = new Notification.Builder(dVar.a);
        }
        Notification notification = dVar.S;
        int i3 = 0;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.e).setContentText(dVar.f).setContentInfo(dVar.k).setContentIntent(dVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.h, (notification.flags & 128) != 0).setNumber(dVar.l).setProgress(dVar.t, dVar.u, dVar.v);
        if (i2 < 23) {
            Notification.Builder builder = this.b;
            IconCompat iconCompat = dVar.j;
            builder.setLargeIcon(iconCompat == null ? null : iconCompat.n());
        } else {
            Notification.Builder builder2 = this.b;
            IconCompat iconCompat2 = dVar.j;
            c.b(builder2, iconCompat2 == null ? null : iconCompat2.y(context));
        }
        this.b.setSubText(dVar.q).setUsesChronometer(dVar.o).setPriority(dVar.m);
        l.f fVar = dVar.p;
        if (fVar instanceof l.e) {
            ArrayList<l.a> h2 = ((l.e) fVar).h();
            int size = h2.size();
            int i4 = 0;
            while (i4 < size) {
                l.a aVar = h2.get(i4);
                i4++;
                b(aVar);
            }
        } else {
            ArrayList<l.a> arrayList = dVar.b;
            int size2 = arrayList.size();
            int i5 = 0;
            while (i5 < size2) {
                l.a aVar2 = arrayList.get(i5);
                i5++;
                b(aVar2);
            }
        }
        Bundle bundle = dVar.D;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i6 = Build.VERSION.SDK_INT;
        this.d = dVar.H;
        this.e = dVar.I;
        this.b.setShowWhen(dVar.n);
        a.i(this.b, dVar.z);
        a.g(this.b, dVar.w);
        a.j(this.b, dVar.y);
        a.h(this.b, dVar.x);
        this.h = dVar.P;
        b.b(this.b, dVar.C);
        b.c(this.b, dVar.E);
        b.f(this.b, dVar.F);
        b.d(this.b, dVar.G);
        b.e(this.b, notification.sound, notification.audioAttributes);
        List e2 = i6 < 28 ? e(f(dVar.c), dVar.V) : dVar.V;
        if (e2 != null && !e2.isEmpty()) {
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                b.a(this.b, (String) it.next());
            }
        }
        this.i = dVar.J;
        if (dVar.d.size() > 0) {
            Bundle bundle2 = dVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i7 = 0; i7 < dVar.d.size(); i7++) {
                bundle4.putBundle(Integer.toString(i7), o.a(dVar.d.get(i7)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 23 && (obj = dVar.U) != null) {
            c.c(this.b, obj);
        }
        if (i8 >= 24) {
            this.b.setExtras(dVar.D);
            d.e(this.b, dVar.s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                d.c(this.b, remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                d.b(this.b, remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                d.d(this.b, remoteViews3);
            }
        }
        if (i8 >= 26) {
            e.b(this.b, dVar.L);
            e.e(this.b, dVar.r);
            e.f(this.b, dVar.M);
            e.g(this.b, dVar.O);
            e.d(this.b, dVar.P);
            if (dVar.B) {
                e.c(this.b, dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            ArrayList<s> arrayList2 = dVar.c;
            int size3 = arrayList2.size();
            while (i3 < size3) {
                s sVar = arrayList2.get(i3);
                i3++;
                f.a(this.b, sVar.h());
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            g.a(this.b, dVar.R);
            g.b(this.b, l.c.a(null));
            ax.Q.d dVar2 = dVar.N;
            if (dVar2 != null) {
                g.d(this.b, dVar2.c());
            }
        }
        if (i9 >= 31 && (i = dVar.Q) != 0) {
            h.b(this.b, i);
        }
        if (dVar.T) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i10 = notification.defaults & (-4);
            notification.defaults = i10;
            this.b.setDefaults(i10);
            if (i9 >= 26) {
                if (TextUtils.isEmpty(this.c.w)) {
                    a.g(this.b, "silent");
                }
                e.d(this.b, this.h);
            }
        }
    }

    private void b(l.a aVar) {
        int i = Build.VERSION.SDK_INT;
        IconCompat d2 = aVar.d();
        Notification.Action.Builder a2 = i >= 23 ? c.a(d2 != null ? d2.x() : null, aVar.h(), aVar.a()) : a.e(d2 != null ? d2.o() : 0, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : u.b(aVar.e())) {
                a.c(a2, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            d.a(a2, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i2 >= 28) {
            f.b(a2, aVar.f());
        }
        if (i2 >= 29) {
            g.c(a2, aVar.j());
        }
        if (i2 >= 31) {
            h.a(a2, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a2, bundle);
        a.a(this.b, a.d(a2));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ax.B.b bVar = new ax.B.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<s> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<s> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // ax.P.k
    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        Bundle a2;
        RemoteViews f2;
        RemoteViews d2;
        l.f fVar = this.c.p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e2 = fVar != null ? fVar.e(this) : null;
        Notification d3 = d();
        if (e2 != null) {
            d3.contentView = e2;
        } else {
            RemoteViews remoteViews = this.c.H;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        if (fVar != null && (d2 = fVar.d(this)) != null) {
            d3.bigContentView = d2;
        }
        if (fVar != null && (f2 = this.c.p.f(this)) != null) {
            d3.headsUpContentView = f2;
        }
        if (fVar != null && (a2 = l.a(d3)) != null) {
            fVar.a(a2);
        }
        return d3;
    }

    protected Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.b.build();
        }
        if (i >= 24) {
            Notification build = this.b.build();
            if (this.h != 0) {
                if (a.f(build) != null && (build.flags & 512) != 0 && this.h == 2) {
                    g(build);
                }
                if (a.f(build) != null && (build.flags & 512) == 0 && this.h == 1) {
                    g(build);
                }
            }
            return build;
        }
        this.b.setExtras(this.g);
        Notification build2 = this.b.build();
        RemoteViews remoteViews = this.d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.h != 0) {
            if (a.f(build2) != null && (build2.flags & 512) != 0 && this.h == 2) {
                g(build2);
            }
            if (a.f(build2) != null && (build2.flags & 512) == 0 && this.h == 1) {
                g(build2);
            }
        }
        return build2;
    }
}
