package ax.nb;

import java.io.IOException;
import okhttp3.HttpUrl;

/* renamed from: ax.nb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2645h extends IOException {
    public int c0;
    public int q;

    public C2645h(int i, int i2) {
        super(a(i, i2));
        this.q = i;
        this.c0 = i2;
    }

    public static String a(int i, int i2) {
        if (i == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET + "SUCCESS";
        }
        if (i == 1) {
            String str = HttpUrl.FRAGMENT_ENCODE_SET + "ERR_NAM_SRVC/";
            if (i2 == 1) {
                str = str + "FMT_ERR: Format Error";
            }
            return str + "Unknown error code: " + i2;
        }
        if (i != 2) {
            return HttpUrl.FRAGMENT_ENCODE_SET + "unknown error class: " + i;
        }
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET + "ERR_SSN_SRVC/";
        if (i2 == -1) {
            return str2 + "Connection refused";
        }
        if (i2 == 143) {
            return str2 + "Unspecified error";
        }
        switch (i2) {
            case 128:
                return str2 + "Not listening on called name";
            case 129:
                return str2 + "Not listening for calling name";
            case 130:
                return str2 + "Called name not present";
            case 131:
                return str2 + "Called name present, but insufficient resources";
            default:
                return str2 + "Unknown error code: " + i2;
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        return new String("errorClass=" + this.q + ",errorCode=" + this.c0 + ",errorString=" + a(this.q, this.c0));
    }
}
