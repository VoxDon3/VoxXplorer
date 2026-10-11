package ax.Dc;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public enum V {
    STORED(0),
    UNSHRINKING(1),
    EXPANDING_LEVEL_1(2),
    EXPANDING_LEVEL_2(3),
    EXPANDING_LEVEL_3(4),
    EXPANDING_LEVEL_4(5),
    IMPLODING(6),
    TOKENIZATION(7),
    DEFLATED(8),
    ENHANCED_DEFLATED(9),
    PKWARE_IMPLODING(10),
    BZIP2(12),
    LZMA(14),
    XZ(95),
    JPEG(96),
    WAVPACK(97),
    PPMD(98),
    AES_ENCRYPTED(99),
    UNKNOWN;

    private static final Map<Integer, V> v0;
    private final int q;

    static {
        HashMap hashMap = new HashMap();
        for (V v : values()) {
            hashMap.put(Integer.valueOf(v.d()), v);
        }
        v0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    V() {
        this(-1);
    }

    public static V h(int i) {
        return v0.get(Integer.valueOf(i));
    }

    public int d() {
        return this.q;
    }

    V(int i) {
        this.q = i;
    }
}
