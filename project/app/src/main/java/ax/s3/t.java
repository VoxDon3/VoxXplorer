/*
 * Decompiled with CFR 0.152.
 */
package ax.s3;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import ax.s3.c;
import ax.s3.d;
import ax.s3.e;
import ax.s3.f;
import ax.s3.g;
import ax.s3.h;
import ax.s3.i;
import ax.s3.j;
import ax.s3.k;
import ax.s3.l;
import ax.s3.m;
import ax.s3.n;
import ax.s3.o;
import ax.s3.p;
import ax.s3.q;
import ax.s3.r;
import ax.s3.s;
import java.util.Iterator;
import java.util.List;

public class t {
    private static boolean a(NotificationChannel notificationChannel, a a8) {
        if (!j.Objects.equals((Object)a8.c, (Object)h.a(notificationChannel))) {
            return true;
        }
        if (!j.Objects.equals((Object)a8.b, (Object)i.a(notificationChannel))) {
            return true;
        }
        return a8.d != j.a(notificationChannel);
    }

    private static void b(NotificationManager notificationManager, a a8) {
        o.a();
        NotificationChannel notificationChannel = n.a(a8.a, a8.b, a8.d);
        Object object = a8.c;
        if (object != null) {
            p.a(notificationChannel, (String)object);
        }
        q.a(notificationChannel, a8.e);
        int n8 = a8.f;
        if (n8 != 0) {
            r.a(notificationChannel, n8);
        }
        s.a(notificationChannel, a8.g);
        object = a8.h;
        if (object != null) {
            d.a(notificationChannel, (long[])object);
        }
        if (a8.i) {
            e.a(notificationChannel, null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        }
        f.a(notificationChannel, a8.j);
        g.a(notificationManager, notificationChannel);
    }

    private static NotificationChannel c(List<NotificationChannel> notificationChannel, String string) {
        if (notificationChannel == null) {
            return null;
        }
        Iterator<NotificationChannel> iterator = notificationChannel.iterator();
        while (iterator.hasNext()) {
            notificationChannel = k.a(iterator.next());
            if (!string.equals(l.a(notificationChannel))) continue;
            return notificationChannel;
        }
        return null;
    }

    private static boolean d(a[] aArray, String string) {
        if (aArray == null) {
            return false;
        }
        int n8 = aArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!string.equals(aArray[i8].a)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(Context object, a[] aArray) {
        String string;
        NotificationManager notificationManager;
        block11: {
            Exception exception2;
            block10: {
                List list;
                block9: {
                    notificationManager = (NotificationManager)object.getSystemService("notification");
                    if (notificationManager == null) {
                        return;
                    }
                    object = null;
                    try {
                        list = c.a(notificationManager);
                        if (list == null) break block9;
                        Iterator iterator = list.iterator();
                        while (iterator.hasNext()) {
                            string = l.a(k.a(iterator.next()));
                            if (t.d(aArray, string) || string == null || "miscellaneous".equals(string)) continue;
                            m.a(notificationManager, string);
                        }
                    }
                    catch (Exception exception2) {
                        break block10;
                    }
                    catch (NullPointerException nullPointerException) {
                        break block11;
                    }
                }
                object = list;
                break block11;
            }
            ax.Ha.c.h().f().d("Delete Channel Error").l(exception2).h();
        }
        int n8 = aArray.length;
        int n9 = 0;
        while (n9 < n8) {
            a a8 = aArray[n9];
            string = t.c((List<NotificationChannel>)object, a8.a);
            if (string != null) {
                if (t.a((NotificationChannel)string, a8)) {
                    t.b(notificationManager, a8);
                }
            } else {
                t.b(notificationManager, a8);
            }
            ++n9;
        }
    }

    public static class a {
        public String a;
        public String b;
        public String c;
        public int d;
        public boolean e;
        public int f;
        public boolean g;
        public long[] h;
        public boolean i;
        public boolean j;
    }
}

