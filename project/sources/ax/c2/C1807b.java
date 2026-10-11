package ax.c2;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: ax.c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1807b {
    public static final C1807b a = new C1807b();

    /* renamed from: ax.c2.b$a */
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    private C1807b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a.a();
        }
        return 0;
    }
}
