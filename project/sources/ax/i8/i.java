package ax.i8;

/* loaded from: classes3.dex */
public class i extends ax.x7.l {
    private final a q;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int q;

        a(int i) {
            this.q = i;
        }
    }

    public i(String str) {
        super(str);
        this.q = a.UNKNOWN;
    }

    public i(String str, Throwable th) {
        super(str, th);
        this.q = a.UNKNOWN;
    }

    public i(String str, a aVar) {
        super(str);
        this.q = aVar;
    }

    public i(String str, Throwable th, a aVar) {
        super(str, th);
        this.q = aVar;
    }
}
