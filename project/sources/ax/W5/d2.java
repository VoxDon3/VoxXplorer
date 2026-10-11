package ax.W5;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public enum d2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(AbstractC1069t0.c0),
    ENUM(null),
    MESSAGE(null);

    private final Object q;

    d2(Object obj) {
        this.q = obj;
    }
}
