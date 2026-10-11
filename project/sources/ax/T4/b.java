package ax.T4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes.dex */
public final class b {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;

    static {
        a aVar = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        a = aVar;
        b = new a(aVar, "MIME-NO-LINEFEEDS", SubsamplingScaleImageView.TILE_SIZE_AUTO);
        c = new a(aVar, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        d = new a("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    public static a a() {
        return b;
    }
}
