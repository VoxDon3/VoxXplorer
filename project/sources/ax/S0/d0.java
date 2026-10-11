package ax.S0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.H;
import ax.q7.C2876c;
import ax.t7.C3104a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class d0 {

    @Deprecated
    public static final int a;

    @Deprecated
    public static final String b;

    @Deprecated
    public static final String c;

    @Deprecated
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final long[] g;
    private static final Pattern h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static HashMap<String, String> l;
    private static final String[] m;
    private static final String[] n;
    private static final int[] o;
    private static final int[] p;
    private static final int[] q;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
        f = new byte[0];
        g = new long[0];
        h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        j = Pattern.compile("%([A-Fa-f0-9]{2})");
        k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, SubsamplingScaleImageView.ORIENTATION_180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, ax.m.j.L0, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, ax.L.c.d3, 103, 96, 117, 114, 123, ax.m.j.K0, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Handler A() {
        return B(null);
    }

    public static boolean A0(ax.P0.H h2) {
        return B0(h2, true);
    }

    public static long A1(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    public static Handler B(Handler.Callback callback) {
        return z((Looper) C0968a.i(Looper.myLooper()), callback);
    }

    public static boolean B0(ax.P0.H h2, boolean z) {
        return w1(h2, z) ? z0(h2) : y0(h2);
    }

    public static String B1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i2] & 15, 16));
        }
        return sb.toString();
    }

    public static Handler C() {
        return D(null);
    }

    public static int C0(Uri uri) {
        int D0;
        String scheme = uri.getScheme();
        if (scheme != null && (C2876c.a("rtsp", scheme) || C2876c.a("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (D0 = D0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return D0;
        }
        Matcher matcher = k.matcher((CharSequence) C0968a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long C1(int i2, int i3) {
        return D1(i3) | (D1(i2) << 32);
    }

    public static Handler D(Handler.Callback callback) {
        return z(X(), callback);
    }

    public static int D0(String str) {
        String e2 = C2876c.e(str);
        e2.getClass();
        switch (e2) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static long D1(int i2) {
        return i2 & 4294967295L;
    }

    private static HashMap<String, String> E() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + m.length);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = m;
            if (i2 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int E0(Uri uri, String str) {
        if (str == null) {
            return C0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static long E1(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static long F(long j2, int i2) {
        return r1(j2, i2, 1000000L, RoundingMode.UP);
    }

    public static boolean F0(G g2, G g3, Inflater inflater) {
        if (g2.a() == 0) {
            return false;
        }
        if (g3.b() < g2.a()) {
            g3.d(g2.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(g2.f(), g2.g(), g2.a());
        int i2 = 0;
        while (true) {
            try {
                i2 += inflater.inflate(g3.f(), i2, g3.b() - i2);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i2 == g3.b()) {
                        g3.d(g3.b() * 2);
                    }
                } else {
                    g3.a0(i2);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static String G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String G0(int i2) {
        return Integer.toString(i2, 36);
    }

    public static String H(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static boolean H0(Activity activity, Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String str = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir.getCanonicalPath();
            }
            if (canonicalPath.startsWith(canonicalPath2)) {
                return true;
            }
            if (str != null) {
                if (canonicalPath.startsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public static String I(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static boolean I0(Context context) {
        return Build.VERSION.SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int J(Context context) {
        return ax.Q0.m.c(context).generateAudioSessionId();
    }

    public static boolean J0(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return Build.VERSION.SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
                return Build.VERSION.SDK_INT >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static int K(int i2) {
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i2) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return SubsamplingScaleImageView.TILE_SIZE_AUTO;
                        }
                }
        }
    }

    public static boolean K0(int i2) {
        return i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static AudioFormat L(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static boolean L0(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    @SuppressLint({"InlinedApi"})
    public static int M(int i2) {
        if (i2 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i2 == 12) {
            return 743676;
        }
        if (i2 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static boolean M0(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (C2876c.a(str, "moto g(20)") || C2876c.a(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && C2876c.a(Build.MODEL, "sm-x200");
    }

    public static String N(int i2) {
        if (i2 == 0) {
            return "undefined";
        }
        if (i2 == 1) {
            return "original";
        }
        if (i2 == 2) {
            return "depth-linear";
        }
        if (i2 == 3) {
            return "depth-inverse";
        }
        if (i2 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static boolean N0(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static H.b O(ax.P0.H h2, H.b bVar) {
        boolean p2 = h2.p();
        boolean W = h2.W();
        boolean J = h2.J();
        boolean Y = h2.Y();
        boolean u0 = h2.u0();
        boolean e0 = h2.e0();
        boolean q2 = h2.h0().q();
        boolean z = false;
        H.b.a d2 = new H.b.a().b(bVar).d(4, !p2).d(5, W && !p2).d(6, J && !p2).d(7, !q2 && (J || !u0 || W) && !p2).d(8, Y && !p2).d(9, !q2 && (Y || (u0 && e0)) && !p2).d(10, !p2).d(11, W && !p2);
        if (W && !p2) {
            z = true;
        }
        return d2.d(12, z).e();
    }

    public static boolean O0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, "file");
    }

    public static int P(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    private static boolean P0(Uri uri) {
        if (!Objects.equals(uri.getScheme(), "content") || !Objects.equals(uri.getAuthority(), "media")) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        return "external".equals(str) || "external_primary".equals(str);
    }

    public static int Q(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    private static boolean Q0(Activity activity, Uri uri) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return O0(uri) ? !H0(activity, uri) : P0(uri);
    }

    public static int R(String str, int i2) {
        int i3 = 0;
        for (String str2 : z1(str)) {
            if (i2 == ax.P0.D.m(str2)) {
                i3++;
            }
        }
        return i3;
    }

    private static boolean R0(Uri uri) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        if (!"http".equals(uri.getScheme())) {
            return false;
        }
        networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted((String) C0968a.e(uri.getHost()));
        return !isCleartextTrafficPermitted;
    }

    public static String S(String str, int i2) {
        String[] z1 = z1(str);
        if (z1.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : z1) {
            if (i2 == ax.P0.D.m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static boolean S0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String T(String str, int i2) {
        String[] z1 = z1(str);
        if (z1.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : z1) {
            if (i2 != ax.P0.D.m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static boolean T0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String U(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C2876c.f(networkCountryIso);
            }
        }
        return C2876c.f(Locale.getDefault().getCountry());
    }

    public static int U0(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static Point V(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) C0968a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return W(context, display);
    }

    public static boolean V0(G g2, G g3, Inflater inflater) {
        return g2.a() > 0 && g2.n() == 120 && F0(g2, g3, inflater);
    }

    public static Point W(Context context, Display display) {
        if (display.getDisplayId() == 0 && S0(context)) {
            String u0 = Build.VERSION.SDK_INT < 28 ? u0("sys.display-size") : u0("vendor.display-size");
            if (!TextUtils.isEmpty(u0)) {
                try {
                    String[] x1 = x1(u0.trim(), "x");
                    if (x1.length == 2) {
                        int parseInt = Integer.parseInt(x1[0]);
                        int parseInt2 = Integer.parseInt(x1[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                C0987u.c("Util", "Invalid display size: " + u0);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 23) {
            Z(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    private static String W0(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = n;
            if (i2 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i2])) {
                return strArr[i2 + 1] + str.substring(strArr[i2].length());
            }
            i2 += 2;
        }
    }

    public static Looper X() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    @Deprecated
    public static boolean X0(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (Y0(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static Locale Y() {
        Locale.Category category;
        Locale locale;
        if (Build.VERSION.SDK_INT < 24) {
            return Locale.getDefault();
        }
        category = Locale.Category.DISPLAY;
        locale = Locale.getDefault(category);
        return locale;
    }

    private static boolean Y0(Activity activity, Uri uri) {
        if (Q0(activity, uri)) {
            return Build.VERSION.SDK_INT < 33 ? m1(activity) : n1(activity);
        }
        return false;
    }

    private static void Z(Display display, Point point) {
        Display.Mode mode;
        int physicalWidth;
        int physicalHeight;
        mode = display.getMode();
        physicalWidth = mode.getPhysicalWidth();
        point.x = physicalWidth;
        physicalHeight = mode.getPhysicalHeight();
        point.y = physicalHeight;
    }

    public static <T> void Z0(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Drawable a0(Context context, Resources resources, int i2) {
        return resources.getDrawable(i2, context.getTheme());
    }

    public static long a1(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static /* synthetic */ Thread b(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int b0(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static ExecutorService b1(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ax.S0.b0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d0.b(str, runnable);
            }
        });
    }

    public static long c(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    public static int c0(String str) {
        String[] x1;
        int length;
        int i2 = 0;
        if (str == null || (length = (x1 = x1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = x1[length - 1];
        boolean z = length >= 3 && "neg".equals(x1[length - 2]);
        try {
            i2 = Integer.parseInt((String) C0968a.e(str2));
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static ScheduledExecutorService c1(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: ax.S0.c0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d0.a(str, runnable);
            }
        });
    }

    public static int d(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i3 = ~binarySearch;
        } else {
            while (true) {
                i2 = binarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.min(jArr.length - 1, i3) : i3;
    }

    public static String d0(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String d1(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e2 = C2876c.e(str);
        String str2 = y1(e2, "-")[0];
        if (l == null) {
            l = E();
        }
        String str3 = l.get(str2);
        if (str3 != null) {
            e2 = str3 + e2.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? W0(e2) : e2;
    }

    public static int e(C0988v c0988v, long j2, boolean z, boolean z2) {
        int i2;
        int d2 = c0988v.d() - 1;
        int i3 = 0;
        while (i3 <= d2) {
            int i4 = (i3 + d2) >>> 1;
            if (c0988v.c(i4) < j2) {
                i3 = i4 + 1;
            } else {
                d2 = i4 - 1;
            }
        }
        if (z && (i2 = d2 + 1) < c0988v.d() && c0988v.c(i2) == j2) {
            return i2;
        }
        if (z2 && d2 == -1) {
            return 0;
        }
        return d2;
    }

    public static int e0(ByteBuffer byteBuffer, int i2) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte b2 = byteBuffer.get(order == byteOrder ? i2 : i2 + 2);
        byte b3 = byteBuffer.get(i2 + 1);
        if (byteBuffer.order() == byteOrder) {
            i2 += 2;
        }
        return (((byteBuffer.get(i2) << 8) & 65280) | (((b2 << 24) & (-16777216)) | ((b3 << 16) & 16711680))) >> 8;
    }

    public static <T> T[] e1(T[] tArr, T t) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t;
        return (T[]) j(copyOf);
    }

    public static <T extends Comparable<? super T>> int f(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static String f0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static <T> T[] f1(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static int g(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            i4 = z ? binarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int g0(Context context) {
        return M0(context) ? 1 : 5;
    }

    public static <T> T[] g1(T[] tArr, int i2) {
        C0968a.a(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static int h(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j2) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static long h0(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static <T> T[] h1(T[] tArr, int i2, int i3) {
        C0968a.a(i2 >= 0);
        C0968a.a(i3 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static long i0(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static long i1(String str) throws ax.P0.E {
        Matcher matcher = h.matcher(str);
        if (!matcher.matches()) {
            throw ax.P0.E.a("Invalid date/time format: " + str, null);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }

    public static int j0(int i2) {
        return k0(i2, ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean j1(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static int k(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int k0(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static void k1(ByteBuffer byteBuffer, int i2) {
        C0968a.b(((-16777216) & i2) == 0 || (i2 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: " + Integer.toHexString(i2));
        C0968a.a(byteBuffer.remaining() >= 3);
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.put((byte) (order == byteOrder ? (i2 & 16711680) >> 16 : i2 & 255)).put((byte) ((65280 & i2) >> 8)).put((byte) (byteBuffer.order() == byteOrder ? i2 & 255 : (i2 & 16711680) >> 16));
    }

    public static long l(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static C0912v l0(int i2, int i3, int i4) {
        return new C0912v.b().y0("audio/raw").T(i3).z0(i4).s0(i2).P();
    }

    public static <T> void l1(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static boolean m(C0915y... c0915yArr) {
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        for (C0915y c0915y : c0915yArr) {
            C0915y.h hVar = c0915y.b;
            if (hVar != null) {
                if (R0(hVar.a)) {
                    return false;
                }
                for (int i2 = 0; i2 < c0915y.b.f.size(); i2++) {
                    if (R0(c0915y.b.f.get(i2).a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int m0(int i2, int i3) {
        return Q(i2) * i3;
    }

    private static boolean m1(Activity activity) {
        int checkSelfPermission;
        checkSelfPermission = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
        if (checkSelfPermission == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long n0(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    private static boolean n1(Activity activity) {
        int checkSelfPermission;
        int checkSelfPermission2;
        int checkSelfPermission3;
        checkSelfPermission = activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
        if (checkSelfPermission == 0) {
            checkSelfPermission2 = activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO");
            if (checkSelfPermission2 == 0) {
                checkSelfPermission3 = activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES");
                if (checkSelfPermission3 == 0) {
                    return false;
                }
            }
        }
        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    public static float o(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static List<String> o0(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i2 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i2 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i2 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i2 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i2 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i2 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i2 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i2 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i2 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i2 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i2 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i2 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            arrayList.add("trick-play");
        }
        if ((i2 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static long o1(long j2, int i2) {
        return r1(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static int p(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static List<String> p0(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i2 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static long p1(long j2, long j3, long j4) {
        return r1(j2, j3, j4, RoundingMode.DOWN);
    }

    public static long q(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static String q0(StringBuilder sb, Formatter formatter, long j2) {
        long j3 = j2 == -9223372036854775807L ? 0L : j2;
        String str = j3 < 0 ? "-" : HttpUrl.FRAGMENT_ENCODE_SET;
        long abs = (Math.abs(j3) + 500) / 1000;
        long j4 = abs % 60;
        long j5 = (abs / 60) % 60;
        long j6 = abs / 3600;
        sb.setLength(0);
        return j6 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4)).toString();
    }

    public static void q1(long[] jArr, long j2, long j3) {
        t1(jArr, j2, j3, RoundingMode.DOWN);
    }

    public static <T> boolean r(SparseArray<T> sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static String[] r0() {
        String[] s0 = s0();
        for (int i2 = 0; i2 < s0.length; i2++) {
            s0[i2] = d1(s0[i2]);
        }
        return s0;
    }

    public static long r1(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? s1(j2, j3, j4, roundingMode) : ax.t7.d.d(j3, ax.t7.d.b(j2, j4, RoundingMode.UNNECESSARY)) : ax.t7.d.b(j3, ax.t7.d.b(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : ax.t7.d.d(j2, ax.t7.d.b(j3, j4, RoundingMode.UNNECESSARY)) : ax.t7.d.b(j2, ax.t7.d.b(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    private static String[] s0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return Build.VERSION.SDK_INT >= 24 ? t0(configuration) : new String[]{f0(configuration.locale)};
    }

    private static long s1(long j2, long j3, long j4, RoundingMode roundingMode) {
        long d2 = ax.t7.d.d(j2, j3);
        if (d2 != Long.MAX_VALUE && d2 != Long.MIN_VALUE) {
            return ax.t7.d.b(d2, j4, roundingMode);
        }
        long c2 = ax.t7.d.c(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b2 = ax.t7.d.b(j3, c2, roundingMode2);
        long b3 = ax.t7.d.b(j4, c2, roundingMode2);
        long c3 = ax.t7.d.c(Math.abs(j2), Math.abs(b3));
        long b4 = ax.t7.d.b(j2, c3, roundingMode2);
        long b5 = ax.t7.d.b(b3, c3, roundingMode2);
        long d3 = ax.t7.d.d(b4, b2);
        if (d3 != Long.MAX_VALUE && d3 != Long.MIN_VALUE) {
            return ax.t7.d.b(d3, b5, roundingMode);
        }
        double d4 = b4 * (b2 / b5);
        if (d4 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d4 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return C3104a.f(d4, roundingMode);
    }

    public static <T> boolean t(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        boolean contentEquals;
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
            return contentEquals;
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                return false;
            }
        }
        return true;
    }

    private static String[] t0(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return x1(languageTags, ",");
    }

    public static void t1(long[] jArr, long j2, long j3, RoundingMode roundingMode) {
        RoundingMode roundingMode2 = roundingMode;
        if (j2 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long b2 = ax.t7.d.b(j3, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = ax.t7.d.b(jArr[i2], b2, roundingMode2);
                i2++;
            }
            return;
        }
        if (j3 < j2 && j2 % j3 == 0) {
            long b3 = ax.t7.d.b(j2, j3, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = ax.t7.d.d(jArr[i2], b3);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j3 >= j4 && j3 % j4 == 0) {
                    jArr[i3] = ax.t7.d.b(j2, ax.t7.d.b(j3, j4, RoundingMode.UNNECESSARY), roundingMode2);
                } else if (j3 >= j4 || j4 % j3 != 0) {
                    jArr[i3] = s1(j4, j2, j3, roundingMode2);
                } else {
                    jArr[i3] = ax.t7.d.d(j2, ax.t7.d.b(j4, j3, RoundingMode.UNNECESSARY));
                }
            }
            i3++;
            roundingMode2 = roundingMode;
        }
    }

    public static <T> int u(SparseArray<T> sparseArray) {
        int contentHashCode;
        if (Build.VERSION.SDK_INT >= 31) {
            contentHashCode = sparseArray.contentHashCode();
            return contentHashCode;
        }
        int i2 = 17;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            i2 = (((i2 * 31) + sparseArray.keyAt(i3)) * 31) + Objects.hashCode(sparseArray.valueAt(i3));
        }
        return i2;
    }

    private static String u0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            C0987u.d("Util", "Failed to read system property " + str, e2);
            return null;
        }
    }

    public static boolean u1(ax.P0.H h2) {
        if (h2 == null || !h2.c0(1)) {
            return false;
        }
        return (h2.c0(17) && h2.h0().q()) ? false : true;
    }

    public static int v(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            int b2 = ax.u7.i.b(bArr[i2]);
            i4 = w(b2 & 15, w(b2 >> 4, i4));
            i2++;
        }
        return i4;
    }

    public static String v0(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i2 < 10000) {
                    return "?";
                }
                return "custom (" + i2 + ")";
        }
    }

    public static boolean v1(ax.P0.H h2) {
        return w1(h2, true);
    }

    private static int w(int i2, int i3) {
        int i4 = (i2 ^ ((i3 >> 12) & 255)) & 255;
        return (p[i4] ^ ((i3 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public static String w0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.8.1";
    }

    public static boolean w1(ax.P0.H h2, boolean z) {
        return h2 == null || !h2.v() || h2.i() == 1 || h2.i() == 4 || !(!z || h2.f0() == 0 || h2.f0() == 4);
    }

    public static int x(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = o[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static byte[] x0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static String[] x1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int y(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = q[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static boolean y0(ax.P0.H h2) {
        if (h2 == null || !h2.c0(1)) {
            return false;
        }
        h2.f();
        return true;
    }

    public static String[] y1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean z0(ax.P0.H r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.i()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.c0(r3)
            if (r3 == 0) goto L17
            r4.k()
        L15:
            r0 = 1
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.c0(r3)
            if (r1 == 0) goto L24
            r4.H()
            goto L15
        L24:
            boolean r1 = r4.c0(r2)
            if (r1 == 0) goto L2e
            r4.m()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.S0.d0.z0(ax.P0.H):boolean");
    }

    public static String[] z1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : x1(str.trim(), "(\\s*,\\s*)");
    }

    public static <T> T i(T t) {
        return t;
    }

    public static <T> T[] j(T[] tArr) {
        return tArr;
    }
}
