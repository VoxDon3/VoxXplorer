package ax.w3;

import android.content.Context;
import android.text.TextUtils;
import com.voxdon.xplorer.R;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class h {
    private static final Logger a = Logger.getLogger("FileManager.VideoPlayerHelper");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if (r13.equals("video/x-vnd.on2.vp9") == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0137, code lost:
    
        if (r13.equals("audio/raw") == false) goto L69;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.w3.h.a(java.lang.String):java.lang.String");
    }

    public static String b(Context context, String str) {
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        return context.getString(R.string.error_no_decoder, str);
    }

    public static String c() {
        return ax.Q2.f.u() + "/ffmpeg.exo.zip";
    }
}
