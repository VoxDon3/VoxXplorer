package ax.s3;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class t {

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

    private static boolean a(NotificationChannel notificationChannel, a aVar) {
        String description;
        CharSequence name;
        int importance;
        String str = aVar.c;
        description = notificationChannel.getDescription();
        if (!Objects.equals(str, description)) {
            return true;
        }
        String str2 = aVar.b;
        name = notificationChannel.getName();
        if (!Objects.equals(str2, name)) {
            return true;
        }
        int i = aVar.d;
        importance = notificationChannel.getImportance();
        return i != importance;
    }

    private static void b(NotificationManager notificationManager, a aVar) {
        o.a();
        NotificationChannel a2 = n.a(aVar.a, aVar.b, aVar.d);
        String str = aVar.c;
        if (str != null) {
            a2.setDescription(str);
        }
        a2.enableLights(aVar.e);
        int i = aVar.f;
        if (i != 0) {
            a2.setLightColor(i);
        }
        a2.enableVibration(aVar.g);
        long[] jArr = aVar.h;
        if (jArr != null) {
            a2.setVibrationPattern(jArr);
        }
        if (aVar.i) {
            a2.setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        }
        a2.setShowBadge(aVar.j);
        notificationManager.createNotificationChannel(a2);
    }

    private static NotificationChannel c(List<NotificationChannel> list, String str) {
        String id;
        if (list == null) {
            return null;
        }
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel a2 = k.a(it.next());
            id = a2.getId();
            if (str.equals(id)) {
                return a2;
            }
        }
        return null;
    }

    private static boolean d(a[] aVarArr, String str) {
        if (aVarArr == null) {
            return false;
        }
        for (a aVar : aVarArr) {
            if (str.equals(aVar.a)) {
                return true;
            }
        }
        return false;
    }

    public static void e(Context context, a[] aVarArr) {
        List notificationChannels;
        String id;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        List list = null;
        try {
            notificationChannels = notificationManager.getNotificationChannels();
            if (notificationChannels != null) {
                Iterator it = notificationChannels.iterator();
                while (it.hasNext()) {
                    id = k.a(it.next()).getId();
                    if (!d(aVarArr, id) && id != null && !"miscellaneous".equals(id)) {
                        notificationManager.deleteNotificationChannel(id);
                    }
                }
            }
            list = notificationChannels;
        } catch (NullPointerException unused) {
        } catch (Exception e) {
            ax.Ha.c.h().f().d("Delete Channel Error").l(e).h();
        }
        for (a aVar : aVarArr) {
            NotificationChannel c = c(list, aVar.a);
            if (c == null) {
                b(notificationManager, aVar);
            } else if (a(c, aVar)) {
                b(notificationManager, aVar);
            }
        }
    }
}
