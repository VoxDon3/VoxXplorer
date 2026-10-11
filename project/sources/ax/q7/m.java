package ax.q7;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
final class m {
    private static final InterfaceC2885l a = a();

    private static final class b implements InterfaceC2885l {
        private b() {
        }
    }

    private static InterfaceC2885l a() {
        return new b();
    }

    static String b(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
