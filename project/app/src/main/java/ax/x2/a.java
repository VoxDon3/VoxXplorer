/*
 * Decompiled with CFR 0.152.
 */
package ax.x2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import ax.x2.b;

public class a {
    private a() {
    }

    public static <T extends b> T a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl)parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends b> T b(Bundle object, String string) {
        block3: {
            try {
                object = (Bundle)object.getParcelable(string);
                if (object != null) break block3;
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
            return null;
        }
        object.setClassLoader(a.class.getClassLoader());
        object = a.a(object.getParcelable("a"));
        return (T)object;
    }

    public static void c(Bundle bundle, String string, b b8) {
        if (b8 == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", a.d(b8));
        bundle.putParcelable(string, (Parcelable)bundle2);
    }

    public static Parcelable d(b b8) {
        return new ParcelImpl(b8);
    }
}

