package ax.K5;

import com.google.android.gms.common.api.Status;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class b extends Exception {

    @Deprecated
    protected final Status q;

    public b(Status status) {
        super(status.y() + ": " + (status.z() != null ? status.z() : HttpUrl.FRAGMENT_ENCODE_SET));
        this.q = status;
    }

    public Status a() {
        return this.q;
    }
}
