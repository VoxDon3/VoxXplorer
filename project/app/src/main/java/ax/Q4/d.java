/*
 * Decompiled with CFR 0.152.
 */
package ax.Q4;

import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;

public class d {
    public MediaMetadataCompat a;
    public final String b;
    public boolean c;

    public d(String string, MediaMetadataCompat mediaMetadataCompat) {
        this.a = mediaMetadataCompat;
        this.b = string;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && object.getClass() == d.class) {
            object = (d)object;
            return TextUtils.equals((CharSequence)this.b, (CharSequence)((d)object).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}

