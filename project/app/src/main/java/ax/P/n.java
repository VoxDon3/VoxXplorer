/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import ax.P.k;
import ax.P.l;
import ax.P.o;
import ax.P.s;
import ax.P.u;
import java.util.ArrayList;
import java.util.List;

class n
implements k {
    private final Context a;
    private final Notification.Builder b;
    private final l.d c;
    private RemoteViews d;
    private RemoteViews e;
    private final List<Bundle> f = new ArrayList<Bundle>();
    private final Bundle g = new Bundle();
    private int h;
    private RemoteViews i;

    n(l.d d8) {
        this.c = d8;
        Object object = d8.a;
        this.a = object;
        int n8 = Build.VERSION.SDK_INT;
        this.b = n8 >= 26 ? ax.P.n$e.a((Context)object, d8.K) : new Notification.Builder(d8.a);
        Notification notification = d8.S;
        Object object2 = this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, d8.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int n9 = notification.flags;
        int n10 = 0;
        boolean bl = (n9 & 2) != 0;
        object2 = object2.setOngoing(bl);
        bl = (notification.flags & 8) != 0;
        object2 = object2.setOnlyAlertOnce(bl);
        bl = (notification.flags & 0x10) != 0;
        Object object3 = object2.setAutoCancel(bl).setDefaults(notification.defaults).setContentTitle(d8.e).setContentText(d8.f).setContentInfo(d8.k).setContentIntent(d8.g).setDeleteIntent(notification.deleteIntent);
        object2 = d8.h;
        bl = (notification.flags & 0x80) != 0;
        object3.setFullScreenIntent((PendingIntent)object2, bl).setNumber(d8.l).setProgress(d8.t, d8.u, d8.v);
        if (n8 < 23) {
            object2 = this.b;
            object = d8.j;
            object = object == null ? null : ((IconCompat)object).n();
            object2.setLargeIcon((Bitmap)object);
        } else {
            object2 = this.b;
            object3 = d8.j;
            object = object3 == null ? null : ((IconCompat)object3).y((Context)object);
            ax.P.n$c.b((Notification.Builder)object2, (Icon)object);
        }
        this.b.setSubText(d8.q).setUsesChronometer(d8.o).setPriority(d8.m);
        object = d8.p;
        if (object instanceof l.e) {
            object = ((l.e)object).h();
            n8 = ((ArrayList)object).size();
            for (n9 = 0; n9 < n8; ++n9) {
                object2 = ((ArrayList)object).get(n9);
                this.b((l.a)object2);
            }
        } else {
            object2 = d8.b;
            n8 = ((ArrayList)object2).size();
            for (n9 = 0; n9 < n8; ++n9) {
                object = ((ArrayList)object2).get(n9);
                this.b((l.a)object);
            }
        }
        if ((object = d8.D) != null) {
            this.g.putAll((Bundle)object);
        }
        n9 = Build.VERSION.SDK_INT;
        this.d = d8.H;
        this.e = d8.I;
        this.b.setShowWhen(d8.n);
        ax.P.n$a.i(this.b, d8.z);
        ax.P.n$a.g(this.b, d8.w);
        ax.P.n$a.j(this.b, d8.y);
        ax.P.n$a.h(this.b, d8.x);
        this.h = d8.P;
        ax.P.n$b.b(this.b, d8.C);
        ax.P.n$b.c(this.b, d8.E);
        ax.P.n$b.f(this.b, d8.F);
        ax.P.n$b.d(this.b, d8.G);
        ax.P.n$b.e(this.b, notification.sound, notification.audioAttributes);
        object = n9 < 28 ? n.e(n.f(d8.c), d8.V) : d8.V;
        if (object != null && !object.isEmpty()) {
            object2 = object.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                ax.P.n$b.a(this.b, (String)object);
            }
        }
        this.i = d8.J;
        if (d8.d.size() > 0) {
            object = object2 = d8.d().getBundle("android.car.EXTENSIONS");
            if (object2 == null) {
                object = new Bundle();
            }
            object2 = new Bundle((Bundle)object);
            object3 = new Bundle();
            for (n9 = 0; n9 < d8.d.size(); ++n9) {
                object3.putBundle(Integer.toString(n9), o.a(d8.d.get(n9)));
            }
            object.putBundle("invisible_actions", (Bundle)object3);
            object2.putBundle("invisible_actions", (Bundle)object3);
            d8.d().putBundle("android.car.EXTENSIONS", (Bundle)object);
            this.g.putBundle("android.car.EXTENSIONS", (Bundle)object2);
        }
        if ((n9 = Build.VERSION.SDK_INT) >= 23 && (object = d8.U) != null) {
            ax.P.n$c.c(this.b, object);
        }
        if (n9 >= 24) {
            this.b.setExtras(d8.D);
            ax.P.n$d.e(this.b, d8.s);
            object = d8.H;
            if (object != null) {
                ax.P.n$d.c(this.b, (RemoteViews)object);
            }
            if ((object = d8.I) != null) {
                ax.P.n$d.b(this.b, (RemoteViews)object);
            }
            if ((object = d8.J) != null) {
                ax.P.n$d.d(this.b, (RemoteViews)object);
            }
        }
        if (n9 >= 26) {
            ax.P.n$e.b(this.b, d8.L);
            ax.P.n$e.e(this.b, d8.r);
            ax.P.n$e.f(this.b, d8.M);
            ax.P.n$e.g(this.b, d8.O);
            ax.P.n$e.d(this.b, d8.P);
            if (d8.B) {
                ax.P.n$e.c(this.b, d8.A);
            }
            if (!TextUtils.isEmpty((CharSequence)d8.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (n9 >= 28) {
            object = d8.c;
            n8 = ((ArrayList)object).size();
            for (n9 = n10; n9 < n8; ++n9) {
                object2 = ((ArrayList)object).get(n9);
                object2 = (s)object2;
                ax.P.n$f.a(this.b, ((s)object2).h());
            }
        }
        if ((n9 = Build.VERSION.SDK_INT) >= 29) {
            ax.P.n$g.a(this.b, d8.R);
            ax.P.n$g.b(this.b, l.c.a(null));
            object = d8.N;
            if (object != null) {
                ax.P.n$g.d(this.b, ((ax.Q.d)object).c());
            }
        }
        if (n9 >= 31 && (n10 = d8.Q) != 0) {
            ax.P.n$h.b(this.b, n10);
        }
        if (d8.T) {
            this.h = this.c.x ? 2 : 1;
            this.b.setVibrate(null);
            this.b.setSound(null);
            notification.defaults = n10 = notification.defaults & 0xFFFFFFFC;
            this.b.setDefaults(n10);
            if (n9 >= 26) {
                if (TextUtils.isEmpty((CharSequence)this.c.w)) {
                    ax.P.n$a.g(this.b, "silent");
                }
                ax.P.n$e.d(this.b, this.h);
            }
        }
    }

    private void b(l.a a8) {
        Bundle bundle;
        int n8 = Build.VERSION.SDK_INT;
        IconCompat iconCompat = a8.d();
        int n9 = 0;
        if (n8 >= 23) {
            iconCompat = iconCompat != null ? iconCompat.x() : null;
            iconCompat = ax.P.n$c.a((Icon)iconCompat, a8.h(), a8.a());
        } else {
            n8 = iconCompat != null ? iconCompat.o() : 0;
            iconCompat = ax.P.n$a.e(n8, a8.h(), a8.a());
        }
        if (a8.e() != null) {
            bundle = u.b(a8.e());
            int n10 = ((RemoteInput[])bundle).length;
            for (n8 = n9; n8 < n10; ++n8) {
                ax.P.n$a.c((Notification.Action.Builder)iconCompat, (RemoteInput)bundle[n8]);
            }
        }
        bundle = a8.c() != null ? new Bundle(a8.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", a8.b());
        n8 = Build.VERSION.SDK_INT;
        if (n8 >= 24) {
            ax.P.n$d.a((Notification.Action.Builder)iconCompat, a8.b());
        }
        bundle.putInt("android.support.action.semanticAction", a8.f());
        if (n8 >= 28) {
            ax.P.n$f.b((Notification.Action.Builder)iconCompat, a8.f());
        }
        if (n8 >= 29) {
            ax.P.n$g.c((Notification.Action.Builder)iconCompat, a8.j());
        }
        if (n8 >= 31) {
            ax.P.n$h.a((Notification.Action.Builder)iconCompat, a8.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", a8.g());
        ax.P.n$a.b((Notification.Action.Builder)iconCompat, bundle);
        ax.P.n$a.a(this.b, ax.P.n$a.d((Notification.Action.Builder)iconCompat));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ax.B.b<String> b8 = new ax.B.b<String>(list.size() + list2.size());
        b8.addAll(list);
        b8.addAll(list2);
        return new ArrayList<String>(b8);
    }

    private static List<String> f(List<s> object) {
        if (object == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(((s)object.next()).g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= 0xFFFFFFFC;
    }

    @Override
    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        l.f f8 = this.c.p;
        if (f8 != null) {
            f8.b(this);
        }
        RemoteViews remoteViews = f8 != null ? f8.e(this) : null;
        Notification notification = this.d();
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        } else {
            remoteViews = this.c.H;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
        }
        if (f8 != null && (remoteViews = f8.d(this)) != null) {
            notification.bigContentView = remoteViews;
        }
        if (f8 != null && (remoteViews = this.c.p.f(this)) != null) {
            notification.headsUpContentView = remoteViews;
        }
        if (f8 != null && (remoteViews = l.a(notification)) != null) {
            f8.a((Bundle)remoteViews);
        }
        return notification;
    }

    protected Notification d() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 26) {
            return this.b.build();
        }
        if (n8 >= 24) {
            Notification notification = this.b.build();
            if (this.h != 0) {
                if (ax.P.n$a.f(notification) != null && (notification.flags & 0x200) != 0 && this.h == 2) {
                    this.g(notification);
                }
                if (ax.P.n$a.f(notification) != null && (notification.flags & 0x200) == 0 && this.h == 1) {
                    this.g(notification);
                }
            }
            return notification;
        }
        this.b.setExtras(this.g);
        Notification notification = this.b.build();
        RemoteViews remoteViews = this.d;
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        }
        if ((remoteViews = this.e) != null) {
            notification.bigContentView = remoteViews;
        }
        if ((remoteViews = this.i) != null) {
            notification.headsUpContentView = remoteViews;
        }
        if (this.h != 0) {
            if (ax.P.n$a.f(notification) != null && (notification.flags & 0x200) != 0 && this.h == 2) {
                this.g(notification);
            }
            if (ax.P.n$a.f(notification) != null && (notification.flags & 0x200) == 0 && this.h == 1) {
                this.g(notification);
            }
        }
        return notification;
    }

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

        static Notification.Action.Builder e(int n8, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(n8, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String string) {
            return builder.setGroup(string);
        }

        static Notification.Builder h(Notification.Builder builder, boolean bl) {
            return builder.setGroupSummary(bl);
        }

        static Notification.Builder i(Notification.Builder builder, boolean bl) {
            return builder.setLocalOnly(bl);
        }

        static Notification.Builder j(Notification.Builder builder, String string) {
            return builder.setSortKey(string);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String string) {
            return builder.addPerson(string);
        }

        static Notification.Builder b(Notification.Builder builder, String string) {
            return builder.setCategory(string);
        }

        static Notification.Builder c(Notification.Builder builder, int n8) {
            return builder.setColor(n8);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object object) {
            return builder.setSound(uri, (AudioAttributes)object);
        }

        static Notification.Builder f(Notification.Builder builder, int n8) {
            return builder.setVisibility(n8);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object object) {
            return builder.setSmallIcon((Icon)object);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean bl) {
            return builder.setAllowGeneratedReplies(bl);
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

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArray) {
            return builder.setRemoteInputHistory(charSequenceArray);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String string) {
            return new Notification.Builder(context, string);
        }

        static Notification.Builder b(Notification.Builder builder, int n8) {
            return builder.setBadgeIconType(n8);
        }

        static Notification.Builder c(Notification.Builder builder, boolean bl) {
            return builder.setColorized(bl);
        }

        static Notification.Builder d(Notification.Builder builder, int n8) {
            return builder.setGroupAlertBehavior(n8);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String string) {
            return builder.setShortcutId(string);
        }

        static Notification.Builder g(Notification.Builder builder, long l8) {
            return builder.setTimeoutAfter(l8);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int n8) {
            return builder.setSemanticAction(n8);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean bl) {
            return builder.setAllowSystemGeneratedContextualActions(bl);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean bl) {
            return builder.setContextual(bl);
        }

        static Notification.Builder d(Notification.Builder builder, Object object) {
            return builder.setLocusId((LocusId)object);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean bl) {
            return builder.setAuthenticationRequired(bl);
        }

        static Notification.Builder b(Notification.Builder builder, int n8) {
            return builder.setForegroundServiceBehavior(n8);
        }
    }
}

