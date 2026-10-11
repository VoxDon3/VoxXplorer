package ax.S4;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.fragment.app.f;
import ax.m.j;

/* loaded from: classes.dex */
public class c {

    public enum a {
        NONE,
        PLAYING,
        PAUSED
    }

    public static String a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (!g(strArr[i])) {
                    throw new IllegalArgumentException("Invalid category: " + strArr[0]);
                }
                sb.append(strArr[i]);
                if (i < strArr.length - 1) {
                    sb.append('/');
                }
            }
        }
        if (str != null) {
            sb.append('|');
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(String str) {
        int indexOf = str.indexOf(j.K0);
        if (indexOf >= 0) {
            return str.substring(indexOf + 1);
        }
        return null;
    }

    public static String[] c(String str) {
        int indexOf = str.indexOf(j.K0);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.split(String.valueOf('/'));
    }

    public static a d(Context context, String str) {
        return f(context, str) ? e(context) : a.NONE;
    }

    public static a e(Context context) {
        PlaybackStateCompat e = MediaControllerCompat.c((Activity) context).e();
        return e == null ? a.NONE : e.j() == 3 ? a.PLAYING : e.j() == 2 ? a.PAUSED : a.NONE;
    }

    public static boolean f(Context context, String str) {
        MediaMetadataCompat d;
        MediaControllerCompat c = MediaControllerCompat.c((f) context);
        if (c != null && (d = c.d()) != null) {
            try {
                String f = d.e().f();
                if (f != null) {
                    if (TextUtils.equals(f, str)) {
                        return true;
                    }
                }
            } catch (RuntimeException e) {
                ax.Ha.c.e(context).a().f().b("MusicPlayer MetaData getError").l(e).h();
            }
        }
        return false;
    }

    private static boolean g(String str) {
        if (str != null) {
            return str.indexOf(47) < 0 && str.indexOf(j.K0) < 0;
        }
        return true;
    }
}
