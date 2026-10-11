package ax.u3;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import ax.X2.Q;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ax.u3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3191i {
    private static Set<String> a;

    private static void a() {
        if (a == null) {
            a = new HashSet();
            try {
                if (!Q.U0()) {
                    int codecCount = MediaCodecList.getCodecCount();
                    for (int i = 0; i < codecCount; i++) {
                        MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                        if (!codecInfoAt.isEncoder()) {
                            for (String str : codecInfoAt.getSupportedTypes()) {
                                a.add(str.toLowerCase());
                            }
                        }
                    }
                    return;
                }
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                if (codecInfos != null) {
                    for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                        if (!mediaCodecInfo.isEncoder()) {
                            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                                a.add(str2.toLowerCase());
                            }
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public static boolean b(String str) {
        a();
        return str != null && a.contains(str.toLowerCase());
    }
}
