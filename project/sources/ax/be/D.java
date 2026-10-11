package ax.be;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class D extends P {
    private final int c0;
    private final int q;

    public D(int i, int i2) {
        super(HttpUrl.FRAGMENT_ENCODE_SET + i + " KiB of memory would be needed; limit was " + i2 + " KiB");
        this.q = i;
        this.c0 = i2;
    }

    public int a() {
        return this.c0;
    }

    public int b() {
        return this.q;
    }
}
