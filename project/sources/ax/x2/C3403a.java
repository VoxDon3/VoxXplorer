package ax.x2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* renamed from: ax.x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3403a {
    private C3403a() {
    }

    public static <T extends InterfaceC3404b> T a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends InterfaceC3404b> T b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C3403a.class.getClassLoader());
            return (T) a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, String str, InterfaceC3404b interfaceC3404b) {
        if (interfaceC3404b == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", d(interfaceC3404b));
        bundle.putParcelable(str, bundle2);
    }

    public static Parcelable d(InterfaceC3404b interfaceC3404b) {
        return new ParcelImpl(interfaceC3404b);
    }
}
