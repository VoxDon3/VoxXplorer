package ax.b5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class f extends ConcurrentHashMap<String, String> {
    public static final f c0 = new f();
    private final Object q;

    private f() {
        super(SubsamplingScaleImageView.ORIENTATION_180, 0.8f, 4);
        this.q = new Object();
    }

    public String a(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.q) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
