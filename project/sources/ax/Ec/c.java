package ax.Ec;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {
    private final Map<String, String> a = new HashMap();
    private final Map<String, String> b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final String g;

    public c(Map<String, String> map, String str) {
        this.b = DesugarCollections.unmodifiableMap(map);
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        int i4 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int length = entry.getKey().length();
            i = length > i ? length : i;
            i3 = length < i3 ? length : i3;
            String value = entry.getValue();
            int length2 = value.length();
            if (length2 > 0) {
                if (!this.a.containsKey(value)) {
                    this.a.put(value, entry.getKey());
                }
                i2 = length2 > i2 ? length2 : i2;
                if (length2 < i4) {
                    i4 = length2;
                }
            }
        }
        this.c = i;
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.g = str;
    }

    public String a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        for (int i = this.d; i <= this.c && i < length; i++) {
            int i2 = length - i;
            String str2 = this.b.get(lowerCase.substring(i2));
            if (str2 != null) {
                return str.substring(0, i2) + str2;
            }
        }
        return str;
    }
}
