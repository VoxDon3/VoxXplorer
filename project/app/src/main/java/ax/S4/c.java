/*
 * Decompiled with CFR 0.152.
 */
package ax.S4;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.fragment.app.f;

public class c {
    public static String a(String charSequence, String ... stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        if (stringArray != null) {
            for (int i8 = 0; i8 < stringArray.length; ++i8) {
                if (c.g(stringArray[i8])) {
                    stringBuilder.append(stringArray[i8]);
                    if (i8 >= stringArray.length - 1) continue;
                    stringBuilder.append('/');
                    continue;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Invalid category: ");
                ((StringBuilder)charSequence).append(stringArray[0]);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
        }
        if (charSequence != null) {
            stringBuilder.append('|');
            stringBuilder.append((String)charSequence);
        }
        return stringBuilder.toString();
    }

    public static String b(String string) {
        int n8 = string.indexOf(124);
        if (n8 >= 0) {
            return string.substring(n8 + 1);
        }
        return null;
    }

    public static String[] c(String string) {
        int n8 = string.indexOf(124);
        String string2 = string;
        if (n8 >= 0) {
            string2 = string.substring(0, n8);
        }
        return string2.split(String.valueOf('/'));
    }

    public static a d(Context context, String string) {
        if (c.f(context, string)) {
            return c.e(context);
        }
        return a.q;
    }

    public static a e(Context object) {
        if ((object = MediaControllerCompat.c((Activity)object).e()) == null) {
            return a.q;
        }
        if (((PlaybackStateCompat)object).j() == 3) {
            return a.c0;
        }
        if (((PlaybackStateCompat)object).j() == 2) {
            return a.d0;
        }
        return a.q;
    }

    public static boolean f(Context context, String string) {
        block5: {
            Object object = MediaControllerCompat.c((f)context);
            if (object != null && (object = ((MediaControllerCompat)object).d()) != null) {
                object = ((MediaMetadataCompat)object).e().f();
                if (object == null) break block5;
                try {
                    boolean bl = TextUtils.equals((CharSequence)object, (CharSequence)string);
                    if (bl) {
                        return true;
                    }
                }
                catch (RuntimeException runtimeException) {
                    ax.Ha.c.e(context).a().f().b("MusicPlayer MetaData getError").l(runtimeException).h();
                }
            }
        }
        return false;
    }

    private static boolean g(String string) {
        return string == null || string.indexOf(47) < 0 && string.indexOf(124) < 0;
        {
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

