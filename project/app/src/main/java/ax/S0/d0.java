/*
 * Decompiled with CFR 0.152.
 */
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
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import ax.P0.D;
import ax.P0.E;
import ax.P0.H;
import ax.P0.v;
import ax.P0.y;
import ax.Q0.m;
import ax.S0.G;
import ax.S0.P;
import ax.S0.Q;
import ax.S0.S;
import ax.S0.T;
import ax.S0.U;
import ax.S0.V;
import ax.S0.W;
import ax.S0.X;
import ax.S0.Y;
import ax.S0.Z;
import ax.S0.a;
import ax.S0.a0;
import ax.S0.b0;
import ax.S0.c0;
import ax.S0.u;
import ax.S0.v;
import ax.n.n;
import ax.q7.c;
import ax.t7.d;
import ax.u7.i;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

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
        String string;
        String string2;
        String string3;
        int n8;
        a = n8 = Build.VERSION.SDK_INT;
        b = string3 = Build.DEVICE;
        c = string2 = Build.MANUFACTURER;
        d = string = Build.MODEL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(", ");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append(", ");
        stringBuilder.append(n8);
        e = stringBuilder.toString();
        f = new byte[0];
        g = new long[0];
        h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        j = Pattern.compile("%([A-Fa-f0-9]{2})");
        k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        o = d0.$d2j$hex$5153fa6e$decode_I("00000000b71dc1046e3b8209d926430ddc7604136b6bc517b24d861a0550471eb8ed08260ff0c922d6d68a2f61cb4b2b649b0c35d386cd310aa08e3cbdbd4f3870db114cc7c6d0481ee09345a9fd5241acad155f1bb0d45bc2969756758b5652c836196a7f2bd86ea60d9b6311105a6714401d79a35ddc7d7a7b9f70cd665e74e0b6239857abe29c8e8da191399060953cc0278b8bdde68f52fba582e5e66486585b2bbeef46eaba3660a9b7817d68b3842d2fad3330eea9ea16ada45d0b6ca0906d32d42770f3d0fe56b0dd494b71d94c1b36c7fb06f7c32220b4ce953d75ca28803af29f9dfbf646bbb8fbf1a679fff4f63ee143ebffe59acdbce82dd07dec77708634c06d4730194b043dae56c539ab0682271c1b4323c53d002e7220c12acf9d8e1278804f16a1a60c1b16bbcd1f13eb8a01a4f64b057dd00808cacdc90c07ab9778b0b6567c69901571de8dd475dbdd936b6cc0526fb5e6116202fbd066bf469f5e085b5e5ad17d1d576660dc5363309b4dd42d5a490d0b1944ba16d84097c6a5ac20db64a8f9fd27a54ee0e6a14bb0a1bffcad60bb258b23b69296e2b22f2bad8a98366c8e41102f83f60dee87f35da9994440689d9d662b902a7bea94e71db4e0500075e4892636e93e3bf7ed3b6bb0f38c7671f7555032fae24df3fe5ff0bcc6e8ed7dc231cb3ecf86d6ffcb8386b8d5349b79d1edbd3adc5aa0fbd8eee00c6959fdcd6d80db8e6037c64f643296087a858bc97e5cad8a73ebb04b77560d044fe110c54b383686468f2b47428a7b005c3d66c158e4408255535d43519e3b1d252926dc21f0009f2c471d5e28424d1936f550d8322c769b3f9b6b5a3b26d6150391cbd40748ed970afff0560efaa011104dbdd014949b93192386521d0e562ff1b94beef5606dadf8d7706cfcd2202be2653deae6bc1ba9eb0b0668efb6bb27d701a6e6d3d880a5de6f9d64da6acd23c4ddd0e2c004f6a1cdb3eb60c97e8d3ebdc990ffb910b6bcb4a7ab7db0a2fb3aae15e6fbaaccc0b8a77bdd79a3c660369b717df79fa85bb4921f4675961a163288ad0bf38c742db081c330718599908a5d2e8d4b59f7ab085440b6c95045e68e4ef2fb4f4a2bdd0c479cc0cd43217d827b9660437f4f460072f85bc176fd0b86684a16476c93300461242dc565e94b9b115e565a1587701918306dd81c353d9f0282205e065b061d0bec1bdc0f51a69337e6bb52333f9d113e8880d03a8dd097243acd5620e3eb152d54f6d4297926a9c5ce3b68c1171d2bcca000eac8a550add6124d6cd2cb6b2fdf7c76eedbc1cba1e376d660e7aff023ea18ede2ee1dbda5f0aaa064f4738627f9c49be6fd09fdb889bee0798d67c63a80d0dbfb84d58bbc9a62967d9ebbb03e930cadff97b110b0af060d71abdf2b32a66836f3a26d66b4bcda7b75b8035d36b5b440f7b1");
        p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        q = d0.$d2j$hex$5153fa6e$decode_I("00000000070000000e000000090000001c0000001b0000001200000015000000380000003f000000360000003100000024000000230000002a0000002d00000070000000770000007e000000790000006c0000006b0000006200000065000000480000004f000000460000004100000054000000530000005a0000005d000000e0000000e7000000ee000000e9000000fc000000fb000000f2000000f5000000d8000000df000000d6000000d1000000c4000000c3000000ca000000cd00000090000000970000009e000000990000008c0000008b0000008200000085000000a8000000af000000a6000000a1000000b4000000b3000000ba000000bd000000c7000000c0000000c9000000ce000000db000000dc000000d5000000d2000000ff000000f8000000f1000000f6000000e3000000e4000000ed000000ea000000b7000000b0000000b9000000be000000ab000000ac000000a5000000a20000008f00000088000000810000008600000093000000940000009d0000009a0000002700000020000000290000002e0000003b0000003c00000035000000320000001f00000018000000110000001600000003000000040000000d0000000a0000005700000050000000590000005e0000004b0000004c00000045000000420000006f00000068000000610000006600000073000000740000007d0000007a000000890000008e000000870000008000000095000000920000009b0000009c000000b1000000b6000000bf000000b8000000ad000000aa000000a3000000a4000000f9000000fe000000f7000000f0000000e5000000e2000000eb000000ec000000c1000000c6000000cf000000c8000000dd000000da000000d3000000d4000000690000006e000000670000006000000075000000720000007b0000007c00000051000000560000005f000000580000004d0000004a0000004300000044000000190000001e000000170000001000000005000000020000000b0000000c00000021000000260000002f000000280000003d0000003a00000033000000340000004e00000049000000400000004700000052000000550000005c0000005b0000007600000071000000780000007f0000006a0000006d00000064000000630000003e00000039000000300000003700000022000000250000002c0000002b0000000600000001000000080000000f0000001a0000001d0000001400000013000000ae000000a9000000a0000000a7000000b2000000b5000000bc000000bb0000009600000091000000980000009f0000008a0000008d0000008400000083000000de000000d9000000d0000000d7000000c2000000c5000000cc000000cb000000e6000000e1000000e8000000ef000000fa000000fd000000f4000000f3000000");
    }

    public static Handler A() {
        return d0.B(null);
    }

    public static boolean A0(H h8) {
        return d0.B0(h8, true);
    }

    public static long A1(long l8, long l9, long l10) {
        long l11 = l8 - l9;
        if (((l8 ^ l11) & (l9 ^ l8)) < 0L) {
            return l10;
        }
        return l11;
    }

    public static Handler B(Handler.Callback callback) {
        return d0.z(ax.S0.a.i(Looper.myLooper()), callback);
    }

    public static boolean B0(H h8, boolean bl) {
        if (d0.w1(h8, bl)) {
            return d0.z0(h8);
        }
        return d0.y0(h8);
    }

    public static String B1(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            stringBuilder.append(Character.forDigit(byArray[i8] >> 4 & 0xF, 16));
            stringBuilder.append(Character.forDigit(byArray[i8] & 0xF, 16));
        }
        return stringBuilder.toString();
    }

    public static Handler C() {
        return d0.D(null);
    }

    public static int C0(Uri object) {
        String string = object.getScheme();
        if (string != null && (ax.q7.c.a("rtsp", string) || ax.q7.c.a("rtspt", string))) {
            return 3;
        }
        string = object.getLastPathSegment();
        if (string == null) {
            return 4;
        }
        int n8 = string.lastIndexOf(46);
        if (n8 >= 0 && (n8 = d0.D0(string.substring(n8 + 1))) != 4) {
            return n8;
        }
        if (((Matcher)(object = k.matcher(ax.S0.a.e(object.getPath())))).matches()) {
            if ((object = ((Matcher)object).group(2)) != null) {
                if (((String)object).contains("format=mpd-time-csf")) {
                    return 0;
                }
                if (((String)object).contains("format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        return 4;
    }

    public static long C1(int n8, int n9) {
        long l8 = d0.D1(n8);
        return d0.D1(n9) | l8 << 32;
    }

    public static Handler D(Handler.Callback callback) {
        return d0.z(d0.X(), callback);
    }

    public static int D0(String string) {
        string = ax.q7.c.e(string);
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 3299913: {
                if (!string.equals("m3u8")) break;
                n8 = 3;
                break;
            }
            case 3242057: {
                if (!string.equals("isml")) break;
                n8 = 2;
                break;
            }
            case 108321: {
                if (!string.equals("mpd")) break;
                n8 = 1;
                break;
            }
            case 104579: {
                if (!string.equals("ism")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return 4;
            }
            case 3: {
                return 2;
            }
            case 1: {
                return 0;
            }
            case 0: 
            case 2: 
        }
        return 1;
    }

    public static long D1(int n8) {
        return (long)n8 & 0xFFFFFFFFL;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static HashMap<String, String> E() {
        String[] stringArray = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<String, String>(stringArray.length + m.length);
        int n8 = stringArray.length;
        int n9 = 0;
        int n10 = 0;
        while (true) {
            int n11 = n9;
            if (n10 >= n8) {
                while (n11 < (stringArray = m).length) {
                    hashMap.put(stringArray[n11], stringArray[n11 + 1]);
                    n11 += 2;
                }
                return hashMap;
            }
            String string = stringArray[n10];
            try {
                Object object = new Locale(string);
                object = ((Locale)object).getISO3Language();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    hashMap.put((String)object, string);
                }
            }
            catch (MissingResourceException missingResourceException) {}
            ++n10;
        }
    }

    public static int E0(Uri uri, String string) {
        if (string == null) {
            return d0.C0(uri);
        }
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1154777587: {
                if (!string.equals("application/x-rtsp")) break;
                n8 = 3;
                break;
            }
            case 64194685: {
                if (!string.equals("application/dash+xml")) break;
                n8 = 2;
                break;
            }
            case -156749520: {
                if (!string.equals("application/vnd.ms-sstr+xml")) break;
                n8 = 1;
                break;
            }
            case -979127466: {
                if (!string.equals("application/x-mpegURL")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 0: 
        }
        return 2;
    }

    public static long E1(long l8) {
        long l9 = l8;
        if (l8 != -9223372036854775807L) {
            l9 = l8 == Long.MIN_VALUE ? l8 : l8 / 1000L;
        }
        return l9;
    }

    public static long F(long l8, int n8) {
        return d0.r1(l8, n8, 1000000L, RoundingMode.UP);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean F0(G g8, G g9, Inflater inflater) {
        Throwable throwable222;
        Inflater inflater2;
        block10: {
            if (g8.a() == 0) {
                return false;
            }
            if (g9.b() < g8.a()) {
                g9.d(g8.a() * 2);
            }
            inflater2 = inflater;
            if (inflater == null) {
                inflater2 = new Inflater();
            }
            inflater2.setInput(g8.f(), g8.g(), g8.a());
            int n8 = 0;
            while (true) {
                int n9;
                try {
                    n9 = n8 + inflater2.inflate(g9.f(), n8, g9.b() - n8);
                    if (inflater2.finished()) {
                        g9.a0(n9);
                        inflater2.reset();
                        return true;
                    }
                    if (inflater2.needsDictionary() || inflater2.needsInput()) {
                        break;
                    }
                }
                catch (Throwable throwable222) {
                    break block10;
                }
                n8 = n9;
                if (n9 != g9.b()) continue;
                g9.d(g9.b() * 2);
                n8 = n9;
            }
            inflater2.reset();
            return false;
        }
        inflater2.reset();
        throw throwable222;
        catch (DataFormatException dataFormatException) {
            inflater2.reset();
            return false;
        }
    }

    public static String G(String string, Object ... objectArray) {
        return String.format(Locale.US, string, objectArray);
    }

    public static String G0(int n8) {
        return Integer.toString(n8, 36);
    }

    public static String H(byte[] byArray) {
        return new String(byArray, StandardCharsets.UTF_8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean H0(Activity object, Uri object2) {
        try {
            String string = object2.getPath();
            if (string == null) {
                return false;
            }
            Object object3 = new File(string);
            String string2 = ((File)object3).getCanonicalPath();
            object3 = object.getFilesDir().getCanonicalPath();
            Object var1_4 = null;
            object = (object = object.getExternalFilesDir(null)) == null ? var1_4 : ((File)object).getCanonicalPath();
            if (string2.startsWith((String)object3)) return true;
            if (object == null) return false;
            boolean bl = string2.startsWith((String)object);
            if (!bl) return false;
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static String I(byte[] byArray, int n8, int n9) {
        return new String(byArray, n8, n9, StandardCharsets.UTF_8);
    }

    public static boolean I0(Context context) {
        return Build.VERSION.SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int J(Context context) {
        return ax.Q0.m.c(context).generateAudioSessionId();
    }

    public static boolean J0(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case -879258763: {
                if (!string.equals("image/png")) break;
                n8 = 6;
                break;
            }
            case -879272239: {
                if (!string.equals("image/bmp")) break;
                n8 = 5;
                break;
            }
            case -1487018032: {
                if (!string.equals("image/webp")) break;
                n8 = 4;
                break;
            }
            case -1487394660: {
                if (!string.equals("image/jpeg")) break;
                n8 = 3;
                break;
            }
            case -1487464690: {
                if (!string.equals("image/heif")) break;
                n8 = 2;
                break;
            }
            case -1487464693: {
                if (!string.equals("image/heic")) break;
                n8 = 1;
                break;
            }
            case -1487656890: {
                if (!string.equals("image/avif")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return true;
            }
            case 1: 
            case 2: {
                return Build.VERSION.SDK_INT >= 26;
            }
            case 0: 
        }
        return Build.VERSION.SDK_INT >= 34;
    }

    public static int K(int n8) {
        if (n8 != 30) {
            switch (n8) {
                default: {
                    switch (n8) {
                        default: {
                            switch (n8) {
                                default: {
                                    return Integer.MAX_VALUE;
                                }
                                case 21: 
                                case 22: {
                                    return 31;
                                }
                                case 20: 
                            }
                            return 30;
                        }
                        case 14: {
                            return 25;
                        }
                        case 15: 
                        case 16: 
                        case 17: 
                        case 18: 
                    }
                }
                case 9: 
                case 10: 
                case 11: 
                case 12: {
                    return 28;
                }
                case 7: 
                case 8: {
                    return 23;
                }
                case 4: 
                case 5: 
                case 6: {
                    return 21;
                }
                case 2: 
                case 3: 
            }
            return 3;
        }
        return 34;
    }

    public static boolean K0(int n8) {
        return n8 == 21 || n8 == 0x50000000 || n8 == 22 || n8 == 0x60000000 || n8 == 4;
        {
        }
    }

    public static AudioFormat L(int n8, int n9, int n10) {
        return new AudioFormat.Builder().setSampleRate(n8).setChannelMask(n9).setEncoding(n10).build();
    }

    public static boolean L0(int n8) {
        return n8 == 3 || n8 == 2 || n8 == 0x10000000 || n8 == 21 || n8 == 0x50000000 || n8 == 22 || n8 == 0x60000000 || n8 == 4;
        {
        }
    }

    @SuppressLint(value={"InlinedApi"})
    public static int M(int n8) {
        if (n8 != 10) {
            if (n8 != 12) {
                if (n8 != 24) {
                    switch (n8) {
                        default: {
                            return 0;
                        }
                        case 8: {
                            return 6396;
                        }
                        case 7: {
                            return 1276;
                        }
                        case 6: {
                            return 252;
                        }
                        case 5: {
                            return 220;
                        }
                        case 4: {
                            return 204;
                        }
                        case 3: {
                            return 28;
                        }
                        case 2: {
                            return 12;
                        }
                        case 1: 
                    }
                    return 4;
                }
                if (Build.VERSION.SDK_INT >= 32) {
                    return 0x3FFFFFC;
                }
                return 0;
            }
            return 743676;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            return 737532;
        }
        return 6396;
    }

    public static boolean M0(Context object) {
        int n8 = Build.VERSION.SDK_INT;
        return n8 < 29 || object.getApplicationInfo().targetSdkVersion < 29 || n8 == 30 && (ax.q7.c.a((CharSequence)(object = Build.MODEL), "moto g(20)") || ax.q7.c.a((CharSequence)object, "rmx3231")) || n8 == 34 && ax.q7.c.a(Build.MODEL, "sm-x200");
        {
        }
    }

    public static String N(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            return "depth metadata";
                        }
                        throw new IllegalStateException("Unsupported auxiliary track type");
                    }
                    return "depth-inverse";
                }
                return "depth-linear";
            }
            return "original";
        }
        return "undefined";
    }

    public static boolean N0(int n8) {
        return n8 == 10 || n8 == 13;
        {
        }
    }

    public static H.b O(H object, H.b b8) {
        boolean bl = object.p();
        boolean bl2 = object.W();
        boolean bl3 = object.J();
        boolean bl4 = object.Y();
        boolean bl5 = object.u0();
        boolean bl6 = object.e0();
        boolean bl7 = object.h0().q();
        object = new H.b.a().b(b8).d(4, bl ^ true);
        boolean bl8 = false;
        boolean bl9 = bl2 && !bl;
        object = ((H.b.a)object).d(5, bl9);
        bl9 = bl3 && !bl;
        object = ((H.b.a)object).d(6, bl9);
        bl9 = !bl7 && (bl3 || !bl5 || bl2) && !bl;
        object = ((H.b.a)object).d(7, bl9);
        bl9 = bl4 && !bl;
        object = ((H.b.a)object).d(8, bl9);
        bl9 = !bl7 && (bl4 || bl5 && bl6) && !bl;
        object = ((H.b.a)object).d(9, bl9).d(10, bl ^ true);
        bl9 = bl2 && !bl;
        object = ((H.b.a)object).d(11, bl9);
        bl9 = bl8;
        if (bl2) {
            bl9 = bl8;
            if (!bl) {
                bl9 = true;
            }
        }
        return ((H.b.a)object).d(12, bl9).e();
    }

    public static boolean O0(Uri object) {
        return TextUtils.isEmpty((CharSequence)(object = object.getScheme())) || j.Objects.equals((Object)object, (Object)"file");
        {
        }
    }

    public static int P(ByteBuffer byteBuffer, int n8) {
        n8 = byteBuffer.getInt(n8);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return n8;
        }
        return Integer.reverseBytes(n8);
    }

    private static boolean P0(Uri object) {
        if (j.Objects.equals((Object)object.getScheme(), (Object)"content") && j.Objects.equals((Object)object.getAuthority(), (Object)"media")) {
            if ((object = object.getPathSegments()).isEmpty()) {
                return false;
            }
            return "external".equals(object = (String)object.get(0)) || "external_primary".equals(object);
            {
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int Q(int n8) {
        if (n8 == 2) return 2;
        if (n8 == 3) return 1;
        if (n8 == 4) return 4;
        if (n8 == 21) return 3;
        if (n8 == 22) return 4;
        if (n8 == 0x10000000) return 2;
        if (n8 == 0x50000000) return 3;
        if (n8 == 0x60000000) return 4;
        throw new IllegalArgumentException();
    }

    private static boolean Q0(Activity activity, Uri uri) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (d0.O0(uri)) {
            return d0.H0(activity, uri) ^ true;
        }
        return d0.P0(uri);
    }

    public static int R(String stringArray, int n8) {
        stringArray = d0.z1((String)stringArray);
        int n9 = stringArray.length;
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n11 = n10;
            if (n8 == D.m(stringArray[i8])) {
                n11 = n10 + 1;
            }
            n10 = n11;
        }
        return n10;
    }

    private static boolean R0(Uri uri) {
        return "http".equals(uri.getScheme()) && !S.a(P.a(), ax.S0.a.e(uri.getHost()));
    }

    public static String S(String charSequence, int n8) {
        String[] stringArray = d0.z1((String)charSequence);
        if (stringArray.length == 0) {
            return null;
        }
        charSequence = new StringBuilder();
        for (String string : stringArray) {
            if (n8 != D.m(string)) continue;
            if (((StringBuilder)charSequence).length() > 0) {
                ((StringBuilder)charSequence).append(",");
            }
            ((StringBuilder)charSequence).append(string);
        }
        if (((StringBuilder)charSequence).length() > 0) {
            return ((StringBuilder)charSequence).toString();
        }
        return null;
    }

    public static boolean S0(Context context) {
        return (context = (UiModeManager)context.getApplicationContext().getSystemService("uimode")) != null && context.getCurrentModeType() == 4;
    }

    public static String T(String string2, int n8) {
        String[] stringArray = d0.z1(string2);
        if (stringArray.length == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : stringArray) {
            if (n8 == D.m(string2)) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(string2);
        }
        if (stringBuilder.length() > 0) {
            return stringBuilder.toString();
        }
        return null;
    }

    public static boolean T0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String U(Context object) {
        if (object != null && (object = (TelephonyManager)object.getSystemService("phone")) != null && !TextUtils.isEmpty((CharSequence)(object = object.getNetworkCountryIso()))) {
            return ax.q7.c.f((String)object);
        }
        return ax.q7.c.f(Locale.getDefault().getCountry());
    }

    public static int U0(int[] nArray, int n8) {
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            if (nArray[i8] != n8) continue;
            return i8;
        }
        return -1;
    }

    public static Point V(Context context) {
        Object object = (DisplayManager)context.getSystemService("display");
        object = object != null ? object.getDisplay(0) : null;
        DisplayManager displayManager = object;
        if (object == null) {
            displayManager = ax.S0.a.e((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        }
        return d0.W(context, (Display)displayManager);
    }

    public static boolean V0(G g8, G g9, Inflater inflater) {
        return g8.a() > 0 && g8.n() == 120 && d0.F0(g8, g9, inflater);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Point W(Context context, Display display) {
        if (display.getDisplayId() == 0 && d0.S0(context)) {
            String string = Build.VERSION.SDK_INT < 28 ? d0.u0("sys.display-size") : d0.u0("vendor.display-size");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                Object object;
                try {
                    object = d0.x1(string.trim(), "x");
                    if (((String[])object).length == 2) {
                        int n8 = Integer.parseInt((String)object[0]);
                        int n9 = Integer.parseInt((String)object[1]);
                        if (n8 > 0 && n9 > 0) {
                            return new Point(n8, n9);
                        }
                    }
                }
                catch (NumberFormatException numberFormatException) {}
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid display size: ");
                ((StringBuilder)object).append(string);
                u.c("Util", ((StringBuilder)object).toString());
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        context = new Point();
        if (Build.VERSION.SDK_INT >= 23) {
            d0.Z(display, (Point)context);
            return context;
        }
        display.getRealSize((Point)context);
        return context;
    }

    private static String W0(String string) {
        String[] stringArray;
        for (int i8 = 0; i8 < (stringArray = n).length; i8 += 2) {
            if (!string.startsWith(stringArray[i8])) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(stringArray[i8 + 1]);
            stringBuilder.append(string.substring(stringArray[i8].length()));
            return stringBuilder.toString();
        }
        return string;
    }

    public static Looper X() {
        Looper looper = Looper.myLooper();
        if (looper != null) {
            return looper;
        }
        return Looper.getMainLooper();
    }

    @Deprecated
    public static boolean X0(Activity activity, Uri ... uriArray) {
        int n8 = uriArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!d0.Y0(activity, uriArray[i8])) continue;
            return true;
        }
        return false;
    }

    public static Locale Y() {
        if (Build.VERSION.SDK_INT >= 24) {
            return U.a(T.a());
        }
        return Locale.getDefault();
    }

    private static boolean Y0(Activity activity, Uri uri) {
        if (!d0.Q0(activity, uri)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return d0.m1(activity);
        }
        return d0.n1(activity);
    }

    private static void Z(Display display, Point point) {
        display = Z.a(display);
        point.x = a0.a((Display.Mode)display);
        point.y = Q.a((Display.Mode)display);
    }

    public static <T> void Z0(List<T> list, int n8, int n9, int n10) {
        ArrayDeque<T> arrayDeque = new ArrayDeque<T>();
        for (n9 = n9 - n8 - 1; n9 >= 0; --n9) {
            arrayDeque.addFirst(list.remove(n8 + n9));
        }
        list.addAll(Math.min(n10, list.size()), arrayDeque);
    }

    public static /* synthetic */ Thread a(String string, Runnable runnable2) {
        return new Thread(runnable2, string);
    }

    public static Drawable a0(Context context, Resources resources, int n8) {
        return resources.getDrawable(n8, context.getTheme());
    }

    public static long a1(long l8) {
        long l9 = l8;
        if (l8 != -9223372036854775807L) {
            l9 = l8 == Long.MIN_VALUE ? l8 : l8 * 1000L;
        }
        return l9;
    }

    public static /* synthetic */ Thread b(String string, Runnable runnable2) {
        return new Thread(runnable2, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b0(int n8) {
        if (n8 == 2 || n8 == 4) return 6005;
        if (n8 == 10) return 6004;
        if (n8 == 7) return 6005;
        if (n8 == 8) return 6003;
        switch (n8) {
            default: {
                switch (n8) {
                    default: {
                        return 6006;
                    }
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                }
                return 6002;
            }
            case 15: {
                return 6003;
            }
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                return 6004;
            }
            case 16: 
            case 18: 
        }
        return 6005;
    }

    public static ExecutorService b1(String string) {
        return Executors.newSingleThreadExecutor(new b0(string));
    }

    public static long c(long l8, long l9, long l10) {
        long l11 = l8 + l9;
        if (((l8 ^ l11) & (l9 ^ l11)) < 0L) {
            return l10;
        }
        return l11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int c0(String stringArray) {
        int n8;
        block5: {
            int n9;
            n8 = 0;
            if (stringArray == null) {
                return 0;
            }
            int n10 = (stringArray = d0.x1((String)stringArray, "_")).length;
            if (n10 < 2) {
                return 0;
            }
            String string = stringArray[n10 - 1];
            n10 = n10 >= 3 && "neg".equals(stringArray[n10 - 2]) ? 1 : 0;
            try {
                n8 = n9 = Integer.parseInt(ax.S0.a.e(string));
                if (n10 == 0) break block5;
            }
            catch (NumberFormatException numberFormatException) {
                return n8;
            }
            return -n9;
        }
        return n8;
    }

    public static ScheduledExecutorService c1(String string) {
        return Executors.newSingleThreadScheduledExecutor(new c0(string));
    }

    public static int d(long[] lArray, long l8, boolean bl, boolean bl2) {
        int n8;
        int n9 = n8 = Arrays.binarySearch(lArray, l8);
        if (n8 < 0) {
            n9 = ~n8;
        } else {
            while ((n8 = n9 + 1) < lArray.length && lArray[n8] == l8) {
                n9 = n8;
            }
            if (!bl) {
                n9 = n8;
            }
        }
        if (bl2) {
            return Math.min(lArray.length - 1, n9);
        }
        return n9;
    }

    public static String d0(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static String d1(String charSequence) {
        if (charSequence == null) {
            return null;
        }
        String string = ((String)charSequence).replace('_', '-');
        CharSequence charSequence2 = charSequence;
        if (!string.isEmpty()) {
            charSequence2 = string.equals("und") ? charSequence : string;
        }
        String string2 = ax.q7.c.e(charSequence2);
        String string3 = d0.y1(string2, "-")[0];
        if (l == null) {
            l = d0.E();
        }
        string = l.get(string3);
        charSequence2 = string3;
        charSequence = string2;
        if (string != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(string2.substring(string3.length()));
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence2 = string;
        }
        if (!("no".equals(charSequence2) || "i".equals(charSequence2) || "zh".equals(charSequence2))) {
            return charSequence;
        }
        return d0.W0((String)charSequence);
    }

    public static int e(v v8, long l8, boolean bl, boolean bl2) {
        int n8 = v8.d() - 1;
        int n9 = 0;
        while (n9 <= n8) {
            int n10 = n9 + n8 >>> 1;
            if (v8.c(n10) < l8) {
                n9 = n10 + 1;
                continue;
            }
            n8 = n10 - 1;
        }
        if (bl && (n9 = n8 + 1) < v8.d() && v8.c(n9) == l8) {
            return n9;
        }
        if (bl2 && n8 == -1) {
            return 0;
        }
        return n8;
    }

    public static int e0(ByteBuffer byteBuffer, int n8) {
        ByteOrder byteOrder;
        ByteOrder byteOrder2 = byteBuffer.order();
        int n9 = byteOrder2 == (byteOrder = ByteOrder.BIG_ENDIAN) ? n8 : n8 + 2;
        byte by = byteBuffer.get(n9);
        byte by2 = byteBuffer.get(n8 + 1);
        n9 = n8;
        if (byteBuffer.order() == byteOrder) {
            n9 = n8 + 2;
        }
        return (byteBuffer.get(n9) << 8 & 0xFF00 | (by << 24 & 0xFF000000 | by2 << 16 & 0xFF0000)) >> 8;
    }

    public static <T> T[] e1(T[] TArray, T t8) {
        T[] TArray2 = Arrays.copyOf(TArray, TArray.length + 1);
        TArray2[TArray.length] = t8;
        return d0.j(TArray2);
    }

    public static <T extends Comparable<? super T>> int f(List<? extends Comparable<? super T>> list, T t8, boolean bl, boolean bl2) {
        int n8;
        int n9 = n8 = Collections.binarySearch(list, t8);
        if (n8 < 0) {
            n9 = -(n8 + 2);
        } else {
            while ((n8 = n9 - 1) >= 0 && list.get(n8).compareTo(t8) == 0) {
                n9 = n8;
            }
            if (!bl) {
                n9 = n8;
            }
        }
        n8 = n9;
        if (bl2) {
            n8 = Math.max(0, n9);
        }
        return n8;
    }

    public static String f0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static <T> T[] f1(T[] TArray, T[] TArray2) {
        T[] TArray3 = Arrays.copyOf(TArray, TArray.length + TArray2.length);
        System.arraycopy(TArray2, 0, TArray3, TArray.length, TArray2.length);
        return TArray3;
    }

    public static int g(int[] nArray, int n8, boolean bl, boolean bl2) {
        int n9;
        int n10 = n9 = Arrays.binarySearch(nArray, n8);
        if (n9 < 0) {
            n8 = -(n9 + 2);
        } else {
            while ((n9 = n10 - 1) >= 0 && nArray[n9] == n8) {
                n10 = n9;
            }
            n8 = bl ? n10 : n9;
        }
        n10 = n8;
        if (bl2) {
            n10 = Math.max(0, n8);
        }
        return n10;
    }

    public static int g0(Context context) {
        if (d0.M0(context)) {
            return 1;
        }
        return 5;
    }

    public static <T> T[] g1(T[] TArray, int n8) {
        boolean bl = n8 <= TArray.length;
        ax.S0.a.a(bl);
        return Arrays.copyOf(TArray, n8);
    }

    public static int h(long[] lArray, long l8, boolean bl, boolean bl2) {
        int n8;
        int n9 = n8 = Arrays.binarySearch(lArray, l8);
        if (n8 < 0) {
            n9 = -(n8 + 2);
        } else {
            while ((n8 = n9 - 1) >= 0 && lArray[n8] == l8) {
                n9 = n8;
            }
            if (!bl) {
                n9 = n8;
            }
        }
        n8 = n9;
        if (bl2) {
            n8 = Math.max(0, n9);
        }
        return n8;
    }

    public static long h0(long l8, float f8) {
        if (f8 == 1.0f) {
            return l8;
        }
        return Math.round((double)l8 * (double)f8);
    }

    public static <T> T[] h1(T[] TArray, int n8, int n9) {
        boolean bl = false;
        boolean bl2 = n8 >= 0;
        ax.S0.a.a(bl2);
        bl2 = bl;
        if (n9 <= TArray.length) {
            bl2 = true;
        }
        ax.S0.a.a(bl2);
        return Arrays.copyOfRange(TArray, n8, n9);
    }

    public static <T> T i(T t8) {
        return t8;
    }

    public static long i0(long l8) {
        if (l8 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + l8;
    }

    public static long i1(String object) throws E {
        Object object2 = h.matcher((CharSequence)object);
        if (((Matcher)object2).matches()) {
            long l8;
            object = ((Matcher)object2).group(9);
            int n8 = 0;
            if (object != null && !((Matcher)object2).group(9).equalsIgnoreCase("Z")) {
                int n9;
                n8 = n9 = Integer.parseInt(((Matcher)object2).group(12)) * 60 + Integer.parseInt(((Matcher)object2).group(13));
                if ("-".equals(((Matcher)object2).group(11))) {
                    n8 = n9 * -1;
                }
            }
            object = new GregorianCalendar(java.util.DesugarTimeZone.getTimeZone((String)"GMT"));
            ((Calendar)object).clear();
            ((Calendar)object).set(Integer.parseInt(((Matcher)object2).group(1)), Integer.parseInt(((Matcher)object2).group(2)) - 1, Integer.parseInt(((Matcher)object2).group(3)), Integer.parseInt(((Matcher)object2).group(4)), Integer.parseInt(((Matcher)object2).group(5)), Integer.parseInt(((Matcher)object2).group(6)));
            if (!TextUtils.isEmpty((CharSequence)((Matcher)object2).group(8))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0.");
                stringBuilder.append(((Matcher)object2).group(8));
                ((Calendar)object).set(14, new BigDecimal(stringBuilder.toString()).movePointRight(3).intValue());
            }
            long l9 = l8 = ((Calendar)object).getTimeInMillis();
            if (n8 != 0) {
                l9 = l8 - (long)n8 * 60000L;
            }
            return l9;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid date/time format: ");
        ((StringBuilder)object2).append((String)object);
        throw E.a(((StringBuilder)object2).toString(), null);
    }

    public static <T> T[] j(T[] TArray) {
        return TArray;
    }

    public static int j0(int n8) {
        return d0.k0(n8, ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean j1(Handler handler, Runnable runnable2) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper == Looper.myLooper()) {
            runnable2.run();
            return true;
        }
        return handler.post(runnable2);
    }

    public static int k(int n8, int n9) {
        return (n8 + n9 - 1) / n9;
    }

    public static int k0(int n8, ByteOrder byteOrder) {
        if (n8 != 8) {
            if (n8 != 16) {
                if (n8 != 24) {
                    if (n8 != 32) {
                        return 0;
                    }
                    if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                        return 22;
                    }
                    return 0x60000000;
                }
                if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                    return 21;
                }
                return 0x50000000;
            }
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            }
            return 0x10000000;
        }
        return 3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void k1(ByteBuffer byteBuffer, int n8) {
        boolean bl = true;
        boolean bl2 = (0xFF000000 & n8) == 0 || (n8 & 0xFF800000) == -8388608;
        Object object = new StringBuilder();
        ((StringBuilder)object).append("Value out of range of 24-bit integer: ");
        ((StringBuilder)object).append(Integer.toHexString(n8));
        ax.S0.a.b(bl2, ((StringBuilder)object).toString());
        bl2 = byteBuffer.remaining() >= 3 ? bl : false;
        ax.S0.a.a(bl2);
        ByteOrder byteOrder = byteBuffer.order();
        object = ByteOrder.BIG_ENDIAN;
        int n9 = byteOrder == object ? (n8 & 0xFF0000) >> 16 : n8 & 0xFF;
        byte by = (byte)n9;
        byte by2 = (byte)((0xFF00 & n8) >> 8);
        n8 = byteBuffer.order() == object ? (n8 &= 0xFF) : (n8 & 0xFF0000) >> 16;
        byte by3 = (byte)n8;
        byteBuffer.put(by).put(by2).put(by3);
    }

    public static long l(long l8, long l9) {
        return (l8 + l9 - 1L) / l9;
    }

    public static ax.P0.v l0(int n8, int n9, int n10) {
        return new v.b().y0("audio/raw").T(n9).z0(n10).s0(n8).P();
    }

    public static <T> void l1(List<T> list, int n8, int n9) {
        if (n8 >= 0 && n9 <= list.size() && n8 <= n9) {
            if (n8 != n9) {
                list.subList(n8, n9).clear();
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static boolean m(y ... yArray) {
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        for (y y8 : yArray) {
            y.h h8 = y8.b;
            if (h8 == null) continue;
            if (d0.R0(h8.a)) {
                return false;
            }
            for (int i8 = 0; i8 < y8.b.f.size(); ++i8) {
                if (!d0.R0(((y.k)y8.b.f.get((int)i8)).a)) continue;
                return false;
            }
        }
        return true;
    }

    public static int m0(int n8, int n9) {
        return d0.Q(n8) * n9;
    }

    private static boolean m1(Activity activity) {
        if (V.a(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            W.a(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void n(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static long n0(long l8, float f8) {
        if (f8 == 1.0f) {
            return l8;
        }
        return Math.round((double)l8 / (double)f8);
    }

    private static boolean n1(Activity activity) {
        if (V.a(activity, "android.permission.READ_MEDIA_AUDIO") == 0 && V.a(activity, "android.permission.READ_MEDIA_VIDEO") == 0 && V.a(activity, "android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        W.a(activity, new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    public static float o(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f8, f10));
    }

    public static List<String> o0(int n8) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((n8 & 1) != 0) {
            arrayList.add("main");
        }
        if ((n8 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((n8 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((n8 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((n8 & 0x10) != 0) {
            arrayList.add("dub");
        }
        if ((n8 & 0x20) != 0) {
            arrayList.add("emergency");
        }
        if ((n8 & 0x40) != 0) {
            arrayList.add("caption");
        }
        if ((n8 & 0x80) != 0) {
            arrayList.add("subtitle");
        }
        if ((n8 & 0x100) != 0) {
            arrayList.add("sign");
        }
        if ((n8 & 0x200) != 0) {
            arrayList.add("describes-video");
        }
        if ((n8 & 0x400) != 0) {
            arrayList.add("describes-music");
        }
        if ((n8 & 0x800) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((n8 & 0x1000) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((n8 & 0x2000) != 0) {
            arrayList.add("easy-read");
        }
        if ((n8 & 0x4000) != 0) {
            arrayList.add("trick-play");
        }
        if ((n8 & 0x8000) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static long o1(long l8, int n8) {
        return d0.r1(l8, 1000000L, n8, RoundingMode.DOWN);
    }

    public static int p(int n8, int n9, int n10) {
        return Math.max(n9, Math.min(n8, n10));
    }

    public static List<String> p0(int n8) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((n8 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((n8 & 1) != 0) {
            arrayList.add("default");
        }
        if ((n8 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static long p1(long l8, long l9, long l10) {
        return d0.r1(l8, l9, l10, RoundingMode.DOWN);
    }

    public static long q(long l8, long l9, long l10) {
        return Math.max(l9, Math.min(l8, l10));
    }

    public static String q0(StringBuilder stringBuilder, Formatter formatter, long l8) {
        if (l8 == -9223372036854775807L) {
            l8 = 0L;
        }
        String string = l8 < 0L ? "-" : "";
        long l9 = (Math.abs(l8) + 500L) / 1000L;
        l8 = l9 % 60L;
        long l10 = l9 / 60L % 60L;
        stringBuilder.setLength(0);
        if ((l9 /= 3600L) > 0L) {
            return formatter.format("%s%d:%02d:%02d", string, l9, l10, l8).toString();
        }
        return formatter.format("%s%02d:%02d", string, l10, l8).toString();
    }

    public static void q1(long[] lArray, long l8, long l9) {
        d0.t1(lArray, l8, l9, RoundingMode.DOWN);
    }

    public static <T> boolean r(SparseArray<T> sparseArray, int n8) {
        return sparseArray.indexOfKey(n8) >= 0;
    }

    public static String[] r0() {
        String[] stringArray = d0.s0();
        for (int i8 = 0; i8 < stringArray.length; ++i8) {
            stringArray[i8] = d0.d1(stringArray[i8]);
        }
        return stringArray;
    }

    public static long r1(long l8, long l9, long l10, RoundingMode roundingMode) {
        if (l8 != 0L && l9 != 0L) {
            long l11 = l10 == l9 ? 0 : (l10 < l9 ? -1 : 1);
            if (l11 >= 0 && l10 % l9 == 0L) {
                return ax.t7.d.b(l8, ax.t7.d.b(l10, l9, RoundingMode.UNNECESSARY), roundingMode);
            }
            if (l11 < 0 && l9 % l10 == 0L) {
                return ax.t7.d.d(l8, ax.t7.d.b(l9, l10, RoundingMode.UNNECESSARY));
            }
            l11 = l10 == l8 ? 0 : (l10 < l8 ? -1 : 1);
            if (l11 >= 0 && l10 % l8 == 0L) {
                return ax.t7.d.b(l9, ax.t7.d.b(l10, l8, RoundingMode.UNNECESSARY), roundingMode);
            }
            if (l11 < 0 && l8 % l10 == 0L) {
                return ax.t7.d.d(l9, ax.t7.d.b(l8, l10, RoundingMode.UNNECESSARY));
            }
            return d0.s1(l8, l9, l10, roundingMode);
        }
        return 0L;
    }

    public static boolean s(Object[] objectArray, Object object) {
        int n8 = objectArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!j.Objects.equals((Object)objectArray[i8], (Object)object)) continue;
            return true;
        }
        return false;
    }

    private static String[] s0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            return d0.t0(configuration);
        }
        return new String[]{d0.f0(configuration.locale)};
    }

    private static long s1(long l8, long l9, long l10, RoundingMode roundingMode) {
        long l11 = ax.t7.d.d(l8, l9);
        if (l11 != Long.MAX_VALUE && l11 != Long.MIN_VALUE) {
            return ax.t7.d.b(l11, l10, roundingMode);
        }
        l11 = ax.t7.d.c(Math.abs(l9), Math.abs(l10));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        l9 = ax.t7.d.b(l9, l11, roundingMode2);
        l10 = ax.t7.d.b(l10, l11, roundingMode2);
        l11 = ax.t7.d.c(Math.abs(l8), Math.abs(l10));
        l8 = ax.t7.d.b(l8, l11, roundingMode2);
        l11 = ax.t7.d.b(l10, l11, roundingMode2);
        l10 = ax.t7.d.d(l8, l9);
        if (l10 != Long.MAX_VALUE && l10 != Long.MIN_VALUE) {
            return ax.t7.d.b(l10, l11, roundingMode);
        }
        double d8 = (double)l9 / (double)l11;
        if ((d8 = (double)l8 * d8) > 9.223372036854776E18) {
            return Long.MAX_VALUE;
        }
        if (d8 < -9.223372036854776E18) {
            return Long.MIN_VALUE;
        }
        return ax.t7.a.f(d8, roundingMode);
    }

    public static <T> boolean t(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Y.a(sparseArray, sparseArray2);
        }
        int n8 = sparseArray.size();
        if (n8 != sparseArray2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = sparseArray.keyAt(i8);
            if (j.Objects.equals((Object)sparseArray.valueAt(i8), (Object)sparseArray2.get(n9))) continue;
            return false;
        }
        return true;
    }

    private static String[] t0(Configuration configuration) {
        return d0.x1(ax.n.n.a(ax.n.i.a(configuration)), ",");
    }

    public static void t1(long[] lArray, long l8, long l9, RoundingMode roundingMode) {
        int n8;
        if (l8 == 0L) {
            Arrays.fill(lArray, 0L);
            return;
        }
        int n9 = 0;
        long l10 = l9 == l8 ? 0 : (l9 < l8 ? -1 : 1);
        if (l10 >= 0 && l9 % l8 == 0L) {
            l8 = ax.t7.d.b(l9, l8, RoundingMode.UNNECESSARY);
            for (n8 = n9; n8 < lArray.length; ++n8) {
                lArray[n8] = ax.t7.d.b(lArray[n8], l8, roundingMode);
            }
        } else if (l10 < 0 && l8 % l9 == 0L) {
            l8 = ax.t7.d.b(l8, l9, RoundingMode.UNNECESSARY);
            for (n8 = 0; n8 < lArray.length; ++n8) {
                lArray[n8] = ax.t7.d.d(lArray[n8], l8);
            }
        } else {
            for (n8 = 0; n8 < lArray.length; ++n8) {
                long l11 = lArray[n8];
                if (l11 == 0L) continue;
                lArray[n8] = l9 >= l11 && l9 % l11 == 0L ? ax.t7.d.b(l8, ax.t7.d.b(l9, l11, RoundingMode.UNNECESSARY), roundingMode) : (l9 < l11 && l11 % l9 == 0L ? ax.t7.d.d(l8, ax.t7.d.b(l11, l9, RoundingMode.UNNECESSARY)) : d0.s1(l11, l8, l9, roundingMode));
            }
        }
    }

    public static <T> int u(SparseArray<T> sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return X.a(sparseArray);
        }
        int n8 = 17;
        for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
            n8 = (n8 * 31 + sparseArray.keyAt(i8)) * 31 + j.Objects.hashCode((Object)sparseArray.valueAt(i8));
        }
        return n8;
    }

    private static String u0(String string) {
        try {
            Object object = Class.forName("android.os.SystemProperties");
            object = (String)((Class)object).getMethod("get", String.class).invoke(object, string);
            return object;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to read system property ");
            stringBuilder.append(string);
            u.d("Util", stringBuilder.toString(), exception);
            return null;
        }
    }

    public static boolean u1(H h8) {
        return h8 != null && h8.c0(1) && (!h8.c0(17) || !h8.h0().q());
    }

    public static int v(byte[] byArray, int n8, int n9, int n10) {
        while (n8 < n9) {
            int n11 = ax.u7.i.b(byArray[n8]);
            n10 = d0.w(n11 & 0xF, d0.w(n11 >> 4, n10));
            ++n8;
        }
        return n10;
    }

    public static String v0(int n8) {
        switch (n8) {
            default: {
                if (n8 >= 10000) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("custom (");
                    stringBuilder.append(n8);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
                return "?";
            }
            case 6: {
                return "camera motion";
            }
            case 5: {
                return "metadata";
            }
            case 4: {
                return "image";
            }
            case 3: {
                return "text";
            }
            case 2: {
                return "video";
            }
            case 1: {
                return "audio";
            }
            case 0: {
                return "default";
            }
            case -1: {
                return "unknown";
            }
            case -2: 
        }
        return "none";
    }

    public static boolean v1(H h8) {
        return d0.w1(h8, true);
    }

    private static int w(int n8, int n9) {
        return (p[(n8 ^ n9 >> 12 & 0xFF) & 0xFF] ^ n9 << 4 & 0xFFFF) & 0xFFFF;
    }

    public static String w0(Context object, String string) {
        CharSequence charSequence;
        try {
            charSequence = object.getPackageName();
            object = object.getPackageManager().getPackageInfo((String)charSequence, (int)0).versionName;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = "?";
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append("/");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" (Linux;Android ");
        ((StringBuilder)charSequence).append(Build.VERSION.RELEASE);
        ((StringBuilder)charSequence).append(") ");
        ((StringBuilder)charSequence).append("AndroidXMedia3/1.8.1");
        return ((StringBuilder)charSequence).toString();
    }

    public static boolean w1(H h8, boolean bl) {
        return h8 == null || !h8.v() || h8.i() == 1 || h8.i() == 4 || bl && h8.f0() != 0 && h8.f0() != 4;
        {
        }
    }

    public static int x(byte[] byArray, int n8, int n9, int n10) {
        while (n8 < n9) {
            n10 = o[(n10 >>> 24 ^ byArray[n8] & 0xFF) & 0xFF] ^ n10 << 8;
            ++n8;
        }
        return n10;
    }

    public static byte[] x0(String string) {
        return string.getBytes(StandardCharsets.UTF_8);
    }

    public static String[] x1(String string, String string2) {
        return string.split(string2, -1);
    }

    public static int y(byte[] byArray, int n8, int n9, int n10) {
        while (n8 < n9) {
            n10 = q[n10 ^ byArray[n8] & 0xFF];
            ++n8;
        }
        return n10;
    }

    public static boolean y0(H h8) {
        if (h8 != null && h8.c0(1)) {
            h8.f();
            return true;
        }
        return false;
    }

    public static String[] y1(String string, String string2) {
        return string.split(string2, 2);
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean z0(H h8) {
        boolean bl;
        block7: {
            block6: {
                int n8;
                boolean bl2;
                block5: {
                    bl2 = false;
                    if (h8 == null) {
                        return false;
                    }
                    n8 = h8.i();
                    if (n8 != 1 || !h8.c0(2)) break block5;
                    h8.k();
                    break block6;
                }
                bl = bl2;
                if (n8 != 4) break block7;
                bl = bl2;
                if (!h8.c0(4)) break block7;
                h8.H();
            }
            bl = true;
        }
        if (h8.c0(1)) {
            h8.m();
            return true;
        }
        return bl;
    }

    public static String[] z1(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return new String[0];
        }
        return d0.x1(string.trim(), "(\\s*,\\s*)");
    }

    private static long[] $d2j$hex$5153fa6e$decode_J(String src) {
        byte[] d8 = d0.$d2j$hex$5153fa6e$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$5153fa6e$decode_I(String src) {
        byte[] d8 = d0.$d2j$hex$5153fa6e$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$5153fa6e$decode_S(String src) {
        byte[] d8 = d0.$d2j$hex$5153fa6e$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$5153fa6e$decode_B(String src) {
        char[] d8 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i8 = 0; i8 < ret.length; ++i8) {
            int ll;
            int hh;
            char h8 = d8[2 * i8];
            char l8 = d8[2 * i8 + 1];
            if (h8 >= '0' && h8 <= '9') {
                hh = h8 - 48;
            } else if (h8 >= 'a' && h8 <= 'f') {
                hh = h8 - 97 + 10;
            } else if (h8 >= 'A' && h8 <= 'F') {
                hh = h8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l8 >= '0' && l8 <= '9') {
                ll = l8 - 48;
            } else if (l8 >= 'a' && l8 <= 'f') {
                ll = l8 - 97 + 10;
            } else if (l8 >= 'A' && l8 <= 'F') {
                ll = l8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i8] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

