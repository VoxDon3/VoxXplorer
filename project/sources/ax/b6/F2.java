package ax.b6;

import android.content.ContentResolver;
import java.util.Map;

/* loaded from: classes3.dex */
public interface F2 {
    <T extends Map<String, String>> T a(ContentResolver contentResolver, String[] strArr, C2<T> c2) throws E2;

    String b(ContentResolver contentResolver, String str) throws E2;
}
