package ax.C3;

import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a {
    public static int a(InputStream inputStream, long j) {
        int i;
        if (inputStream == null) {
            return 0;
        }
        c cVar = new c(inputStream, 16, false);
        if (b(cVar, j, 1) && (cVar.c(0) != -1 || cVar.c(1) != -40)) {
            return 0;
        }
        int i2 = 0;
        while (b(cVar, j, i2 + 3)) {
            int i3 = i2 + 1;
            if ((cVar.c(i2) & 255) == 255) {
                int c = cVar.c(i3) & 255;
                if (c != 255) {
                    i3 = i2 + 2;
                    if (c != 216 && c != 1) {
                        if (c != 217 && c != 218) {
                            int c2 = c(cVar, i3, 2, false);
                            if (c2 >= 2) {
                                i3 += c2;
                                if (b(cVar, j, i3 - 1)) {
                                    if (c == 225 && c2 >= 8 && c(cVar, i2 + 4, 4, false) == 1165519206 && c(cVar, i2 + 8, 2, false) == 0) {
                                        i = c2 - 8;
                                        cVar.a(i2 + 6);
                                        i2 += 10;
                                        break;
                                    }
                                    cVar.a(i3 - 4);
                                }
                            }
                            Log.e("CameraExif", "Invalid length");
                            return 0;
                        }
                        cVar.a(i2 - 2);
                    }
                }
                i2 = i3;
            }
            i2 = i3;
        }
        i = 0;
        if (i > 8) {
            int c3 = c(cVar, i2, 4, false);
            if (c3 != 1229531648 && c3 != 1296891946) {
                Log.e("CameraExif", "Invalid byte order");
                return 0;
            }
            boolean z = c3 == 1229531648;
            int c4 = c(cVar, i2 + 4, 4, z) + 2;
            if (c4 >= 10 && c4 <= i) {
                int i4 = i2 + c4;
                int i5 = i - c4;
                cVar.a(i4 - 4);
                int c5 = c(cVar, i4 - 2, 2, z);
                while (true) {
                    int i6 = c5 - 1;
                    if (c5 <= 0 || i5 < 12) {
                        break;
                    }
                    if (c(cVar, i4, 2, z) == 274) {
                        int c6 = c(cVar, i4 + 8, 2, z);
                        if (c6 == 1) {
                            return 0;
                        }
                        if (c6 == 3) {
                            return SubsamplingScaleImageView.ORIENTATION_180;
                        }
                        if (c6 == 6) {
                            return 90;
                        }
                        if (c6 == 8) {
                            return SubsamplingScaleImageView.ORIENTATION_270;
                        }
                        Log.i("CameraExif", "Unsupported orientation");
                        return 0;
                    }
                    i5 -= 12;
                    cVar.a(i4 + 8);
                    i4 += 12;
                    c5 = i6;
                }
            } else {
                Log.e("CameraExif", "Invalid offset");
            }
        }
        return 0;
    }

    private static boolean b(c cVar, long j, int i) {
        return j >= 0 ? ((long) i) < j : cVar.d(i);
    }

    private static int c(c cVar, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (cVar.c(i) & 255) | (i4 << 8);
            i += i3;
            i2 = i5;
        }
    }
}
