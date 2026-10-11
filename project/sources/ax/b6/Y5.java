package ax.b6;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public enum Y5 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(B3.c0),
    ENUM(null),
    MESSAGE(null);

    Y5(Object obj) {
    }
}
