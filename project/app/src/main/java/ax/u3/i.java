/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import ax.X2.Q;
import java.util.HashSet;
import java.util.Set;

public class i {
    private static Set<String> a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a() {
        int n8;
        int n9;
        block11: {
            int n10;
            int n11;
            MediaCodecInfo[] mediaCodecInfoArray;
            if (a != null) return;
            a = new HashSet<String>();
            try {
                if (!Q.U0()) {
                    n9 = MediaCodecList.getCodecCount();
                    n8 = 0;
                    break block11;
                }
                mediaCodecInfoArray = new MediaCodecList(0);
                if ((mediaCodecInfoArray = mediaCodecInfoArray.getCodecInfos()) == null) return;
                n11 = mediaCodecInfoArray.length;
                n10 = 0;
            }
            catch (RuntimeException runtimeException) {
                return;
            }
            while (n10 < n11) {
                MediaCodecInfo mediaCodecInfo = mediaCodecInfoArray[n10];
                if (!mediaCodecInfo.isEncoder()) {
                    String[] stringArray = mediaCodecInfo.getSupportedTypes();
                    for (int i8 = 0; i8 < stringArray.length; ++i8) {
                        a.add(stringArray[i8].toLowerCase());
                    }
                }
                ++n10;
            }
            return;
        }
        while (n8 < n9) {
            String[] stringArray = MediaCodecList.getCodecInfoAt((int)n8);
            if (!stringArray.isEncoder()) {
                stringArray = stringArray.getSupportedTypes();
                for (int i9 = 0; i9 < stringArray.length; ++i9) {
                    a.add(stringArray[i9].toLowerCase());
                }
            }
            ++n8;
        }
    }

    public static boolean b(String string) {
        i.a();
        if (string == null) {
            return false;
        }
        return a.contains(string.toLowerCase());
    }
}

