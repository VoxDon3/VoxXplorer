package ax.Q4;

import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class d {
    public MediaMetadataCompat a;
    public final String b;
    public boolean c;

    public d(String str, MediaMetadataCompat mediaMetadataCompat) {
        this.a = mediaMetadataCompat;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != d.class) {
            return false;
        }
        return TextUtils.equals(this.b, ((d) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
