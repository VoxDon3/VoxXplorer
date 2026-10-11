/*
 * Decompiled with CFR 0.152.
 */
package ax.y0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import ax.y0.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    static final byte[] D;
    private static final byte[] E;
    private static final byte[] F;
    private static final byte[] G;
    private static final byte[] H;
    private static final byte[] I;
    private static final byte[] J;
    private static final byte[] K;
    private static final byte[] L;
    static final byte[] M;
    private static final byte[] N;
    private static final byte[] O;
    private static final byte[] P;
    private static final byte[] Q;
    private static final byte[] R;
    private static final byte[] S;
    private static final byte[] T;
    private static final byte[] U;
    private static final byte[] V;
    private static final SimpleDateFormat W;
    private static final SimpleDateFormat X;
    private static final String[] Y;
    private static final int[] Z;
    private static final byte[] a0;
    private static final e[] b0;
    private static final e[] c0;
    private static final e[] d0;
    private static final e[] e0;
    private static final e[] f0;
    private static final e g0;
    private static final e[] h0;
    private static final e[] i0;
    private static final e[] j0;
    private static final e[] k0;
    static final e[][] l0;
    private static final e[] m0;
    private static final HashMap<Integer, e>[] n0;
    private static final HashMap<String, e>[] o0;
    private static final Set<String> p0;
    private static final HashMap<Integer, Integer> q0;
    private static final Charset r0;
    static final byte[] s0;
    private static final byte[] t0;
    private static final Pattern u0;
    private static final Pattern v0;
    private static final Pattern w0;
    private static final boolean x;
    private static final Pattern x0;
    private static final List<Integer> y;
    private static final List<Integer> z;
    private String a;
    private FileDescriptor b;
    private AssetManager.AssetInputStream c;
    private int d;
    private boolean e;
    private final HashMap<String, d>[] f;
    private boolean g;
    private Set<Integer> h;
    private ByteOrder i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private byte[] o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private d v;
    private boolean w;

    static {
        Integer n8 = 3;
        x = Log.isLoggable((String)"ExifInterface", (int)3);
        Integer n9 = 1;
        Integer n10 = 8;
        y = Arrays.asList(n9, 6, n8, n10);
        Integer n11 = 2;
        Integer n12 = 7;
        Integer n13 = 5;
        z = Arrays.asList(n11, n12, 4, n13);
        A = new int[]{8, 8, 8};
        B = new int[]{4};
        C = new int[]{8};
        D = new byte[]{-1, -40, -1};
        E = new byte[]{102, 116, 121, 112};
        F = new byte[]{109, 105, 102, 49};
        G = new byte[]{104, 101, 105, 99};
        H = new byte[]{97, 118, 105, 102};
        I = new byte[]{97, 118, 105, 115};
        J = new byte[]{79, 76, 89, 77, 80, 0};
        K = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        L = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        M = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        N = new byte[]{82, 73, 70, 70};
        O = new byte[]{87, 69, 66, 80};
        P = new byte[]{69, 88, 73, 70};
        Q = new byte[]{-99, 1, 42};
        R = "VP8X".getBytes(Charset.defaultCharset());
        S = "VP8L".getBytes(Charset.defaultCharset());
        T = "VP8 ".getBytes(Charset.defaultCharset());
        U = "ANIM".getBytes(Charset.defaultCharset());
        V = "ANMF".getBytes(Charset.defaultCharset());
        Y = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        Z = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        a0 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        e e8 = new e("NewSubfileType", 254, 4);
        e e9 = new e("SubfileType", 255, 4);
        e e10 = new e("ImageWidth", 256, 3, 4);
        e e11 = new e("ImageLength", 257, 3, 4);
        e e12 = new e("BitsPerSample", 258, 3);
        e e13 = new e("Compression", 259, 3);
        e e14 = new e("PhotometricInterpretation", 262, 3);
        e e15 = new e("ImageDescription", 270, 2);
        e e16 = new e("Make", 271, 2);
        e e17 = new e("Model", 272, 2);
        e e18 = new e("StripOffsets", 273, 3, 4);
        e e19 = new e("Orientation", 274, 3);
        e[] eArray = new e("SamplesPerPixel", 277, 3);
        e e20 = new e("RowsPerStrip", 278, 3, 4);
        e[] eArray2 = new e("StripByteCounts", 279, 3, 4);
        e e21 = new e("XResolution", 282, 5);
        e e22 = new e("YResolution", 283, 5);
        e e23 = new e("PlanarConfiguration", 284, 3);
        e e24 = new e("ResolutionUnit", 296, 3);
        e e25 = new e("TransferFunction", 301, 3);
        e e26 = new e("Software", 305, 2);
        e e27 = new e("DateTime", 306, 2);
        e[] eArray3 = new e("Artist", 315, 2);
        e[] eArray4 = new e("WhitePoint", 318, 5);
        e e28 = new e("PrimaryChromaticities", 319, 5);
        e e29 = new e("SubIFDPointer", 330, 4);
        e e30 = new e("JPEGInterchangeFormat", 513, 4);
        e e31 = new e("JPEGInterchangeFormatLength", 514, 4);
        e e32 = new e("YCbCrCoefficients", 529, 5);
        e[] eArray5 = new e("YCbCrSubSampling", 530, 3);
        e[][] eArrayArray = new e("YCbCrPositioning", 531, 3);
        Object object = new e("ReferenceBlackWhite", 532, 5);
        e e33 = new e("Copyright", 33432, 2);
        e e34 = new e("ExifIFDPointer", 34665, 4);
        e[] eArray6 = new e("GPSInfoIFDPointer", 34853, 4);
        e[] eArray7 = new e("SensorTopBorder", 4, 4);
        e e35 = new e("SensorLeftBorder", 5, 4);
        e e36 = new e("SensorBottomBorder", 6, 4);
        e e37 = new e("SensorRightBorder", 7, 4);
        e e38 = new e("ISO", 23, 3);
        e e39 = new e("JpgFromRaw", 46, 7);
        e e40 = new e("Xmp", 700, 1);
        Object object2 = new e[]{e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, eArray, e20, eArray2, e21, e22, e23, e24, e25, e26, e27, eArray3, eArray4, e28, e29, e30, e31, e32, eArray5, eArrayArray, object, e33, e34, eArray6, eArray7, e35, e36, e37, e38, e39, e40};
        b0 = object2;
        e12 = new e("ExposureTime", 33434, 5);
        e19 = new e("FNumber", 33437, 5);
        eArray3 = new e("ExposureProgram", 34850, 3);
        eArray7 = new e("SpectralSensitivity", 34852, 2);
        e e41 = new e("PhotographicSensitivity", 34855, 3);
        e e42 = new e("OECF", 34856, 7);
        e15 = new e("SensitivityType", 34864, 3);
        e e43 = new e("StandardOutputSensitivity", 34865, 4);
        e27 = new e("RecommendedExposureIndex", 34866, 4);
        e40 = new e("ISOSpeed", 34867, 4);
        e22 = new e("ISOSpeedLatitudeyyy", 34868, 4);
        e e44 = new e("ISOSpeedLatitudezzz", 34869, 4);
        eArray6 = new e("ExifVersion", 36864, 2);
        e18 = new e("DateTimeOriginal", 36867, 2);
        e e45 = new e("DateTimeDigitized", 36868, 2);
        e37 = new e("OffsetTime", 36880, 2);
        e14 = new e("OffsetTimeOriginal", 36881, 2);
        e e46 = new e("OffsetTimeDigitized", 36882, 2);
        e e47 = new e("ComponentsConfiguration", 37121, 7);
        e e48 = new e("CompressedBitsPerPixel", 37122, 5);
        e e49 = new e("ShutterSpeedValue", 37377, 10);
        e e50 = new e("ApertureValue", 37378, 5);
        e e51 = new e("BrightnessValue", 37379, 10);
        e e52 = new e("ExposureBiasValue", 37380, 10);
        e e53 = new e("MaxApertureValue", 37381, 5);
        e e54 = new e("SubjectDistance", 37382, 5);
        e35 = new e("MeteringMode", 37383, 3);
        e31 = new e("LightSource", 37384, 3);
        eArrayArray = new e("Flash", 37385, 3);
        e20 = new e("FocalLength", 37386, 5);
        e28 = new e("SubjectArea", 37396, 3);
        e24 = new e("MakerNote", 37500, 7);
        e13 = new e("UserComment", 37510, 7);
        e16 = new e("SubSecTime", 37520, 2);
        e e55 = new e("SubSecTimeOriginal", 37521, 2);
        e32 = new e("SubSecTimeDigitized", 37522, 2);
        e e56 = new e("FlashpixVersion", 40960, 7);
        e23 = new e("ColorSpace", 40961, 3);
        e e57 = new e("PixelXDimension", 40962, 3, 4);
        e17 = new e("PixelYDimension", 40963, 3, 4);
        e e58 = new e("RelatedSoundFile", 40964, 2);
        e33 = new e("InteroperabilityIFDPointer", 40965, 4);
        e e59 = new e("FlashEnergy", 41483, 5);
        e e60 = new e("SpatialFrequencyResponse", 41484, 7);
        e38 = new e("FocalPlaneXResolution", 41486, 5);
        eArray2 = new e("FocalPlaneYResolution", 41487, 5);
        e e61 = new e("FocalPlaneResolutionUnit", 41488, 3);
        e26 = new e("SubjectLocation", 41492, 3);
        e e62 = new e("ExposureIndex", 41493, 5);
        e8 = new e("SensingMethod", 41495, 3);
        e10 = new e("FileSource", 41728, 7);
        e e63 = new e("SceneType", 41729, 7);
        e e64 = new e("CFAPattern", 41730, 7);
        e36 = new e("CustomRendered", 41985, 3);
        e e65 = new e("ExposureMode", 41986, 3);
        eArray4 = new e("WhiteBalance", 41987, 3);
        eArray5 = new e("DigitalZoomRatio", 41988, 5);
        e e66 = new e("FocalLengthIn35mmFilm", 41989, 3);
        e e67 = new e("SceneCaptureType", 41990, 3);
        eArray = new e("GainControl", 41991, 3);
        e21 = new e("Contrast", 41992, 3);
        e11 = new e("Saturation", 41993, 3);
        e25 = new e("Sharpness", 41994, 3);
        e e68 = new e("DeviceSettingDescription", 41995, 7);
        e30 = new e("SubjectDistanceRange", 41996, 3);
        e e69 = new e("ImageUniqueID", 42016, 2);
        e29 = new e("CameraOwnerName", 42032, 2);
        e39 = new e("BodySerialNumber", 42033, 2);
        e34 = new e("LensSpecification", 42034, 5);
        e e70 = new e("LensMake", 42035, 2);
        e e71 = new e("LensModel", 42036, 2);
        e e72 = new e("Gamma", 42240, 5);
        e e73 = new e("DNGVersion", 50706, 1);
        e9 = new e("DefaultCropSize", 50720, 3, 4);
        object = new e[]{e12, e19, eArray3, eArray7, e41, e42, e15, e43, e27, e40, e22, e44, eArray6, e18, e45, e37, e14, e46, e47, e48, e49, e50, e51, e52, e53, e54, e35, e31, eArrayArray, e20, e28, e24, e13, e16, e55, e32, e56, e23, e57, e17, e58, e33, e59, e60, e38, eArray2, e61, e26, e62, e8, e10, e63, e64, e36, e65, eArray4, eArray5, e66, e67, eArray, e21, e11, e25, e68, e30, e69, e29, e39, e34, e70, e71, e72, e73, e9};
        c0 = object;
        eArray7 = new e("GPSVersionID", 0, 1);
        e31 = new e("GPSLatitudeRef", 1, 2);
        eArray3 = new e("GPSLatitude", 2, 5, 10);
        eArray5 = new e("GPSLongitudeRef", 3, 2);
        e15 = new e("GPSLongitude", 4, 5, 10);
        e37 = new e("GPSAltitudeRef", 5, 1);
        e10 = new e("GPSAltitude", 6, 5);
        e13 = new e("GPSTimeStamp", 7, 5);
        e40 = new e("GPSSatellites", 8, 2);
        e20 = new e("GPSStatus", 9, 2);
        e23 = new e("GPSMeasureMode", 10, 2);
        e24 = new e("GPSDOP", 11, 5);
        eArray6 = new e("GPSSpeedRef", 12, 2);
        e33 = new e("GPSSpeed", 13, 5);
        e9 = new e("GPSTrackRef", 14, 2);
        e27 = new e("GPSTrack", 15, 5);
        eArray = new e("GPSImgDirectionRef", 16, 2);
        e28 = new e("GPSImgDirection", 17, 5);
        e25 = new e("GPSMapDatum", 18, 2);
        e14 = new e("GPSDestLatitudeRef", 19, 2);
        e18 = new e("GPSDestLatitude", 20, 5);
        e29 = new e("GPSDestLongitudeRef", 21, 2);
        e34 = new e("GPSDestLongitude", 22, 5);
        e12 = new e("GPSDestBearingRef", 23, 2);
        eArray2 = new e("GPSDestBearing", 24, 5);
        e35 = new e("GPSDestDistanceRef", 25, 2);
        e8 = new e("GPSDestDistance", 26, 5);
        eArrayArray = new e("GPSProcessingMethod", 27, 7);
        e19 = new e("GPSAreaInformation", 28, 7);
        e22 = new e("GPSDateStamp", 29, 2);
        e11 = new e("GPSDifferential", 30, 3);
        e32 = new e("GPSHPositioningError", 31, 5);
        eArray4 = new e[]{eArray7, e31, eArray3, eArray5, e15, e37, e10, e13, e40, e20, e23, e24, eArray6, e33, e9, e27, eArray, e28, e25, e14, e18, e29, e34, e12, eArray2, e35, e8, eArrayArray, e19, e22, e11, e32};
        d0 = eArray4;
        eArray7 = new e("InteroperabilityIndex", 1, 2);
        eArray5 = new e[]{eArray7};
        e0 = eArray5;
        eArray = new e("NewSubfileType", 254, 4);
        e33 = new e("SubfileType", 255, 4);
        e14 = new e("ThumbnailImageWidth", 256, 3, 4);
        e24 = new e("ThumbnailImageLength", 257, 3, 4);
        e23 = new e("BitsPerSample", 258, 3);
        e20 = new e("Compression", 259, 3);
        e28 = new e("PhotometricInterpretation", 262, 3);
        e35 = new e("ImageDescription", 270, 2);
        eArray2 = new e("Make", 271, 2);
        e16 = new e("Model", 272, 2);
        e32 = new e("StripOffsets", 273, 3, 4);
        e12 = new e("ThumbnailOrientation", 274, 3);
        e40 = new e("SamplesPerPixel", 277, 3);
        e31 = new e("RowsPerStrip", 278, 3, 4);
        e18 = new e("StripByteCounts", 279, 3, 4);
        e22 = new e("XResolution", 282, 5);
        e9 = new e("YResolution", 283, 5);
        e19 = new e("PlanarConfiguration", 284, 3);
        e37 = new e("ResolutionUnit", 296, 3);
        e34 = new e("TransferFunction", 301, 3);
        e25 = new e("Software", 305, 2);
        e21 = new e("DateTime", 306, 2);
        eArray3 = new e("Artist", 315, 2);
        e26 = new e("WhitePoint", 318, 5);
        e17 = new e("PrimaryChromaticities", 319, 5);
        e10 = new e("SubIFDPointer", 330, 4);
        e30 = new e("JPEGInterchangeFormat", 513, 4);
        e15 = new e("JPEGInterchangeFormatLength", 514, 4);
        e11 = new e("YCbCrCoefficients", 529, 5);
        e39 = new e("YCbCrSubSampling", 530, 3);
        e29 = new e("YCbCrPositioning", 531, 3);
        eArray6 = new e("ReferenceBlackWhite", 532, 5);
        eArrayArray = new e("Copyright", 33432, 2);
        e8 = new e("ExifIFDPointer", 34665, 4);
        e13 = new e("GPSInfoIFDPointer", 34853, 4);
        e38 = new e("DNGVersion", 50706, 1);
        e27 = new e("DefaultCropSize", 50720, 3, 4);
        eArray7 = new e[]{eArray, e33, e14, e24, e23, e20, e28, e35, eArray2, e16, e32, e12, e40, e31, e18, e22, e9, e19, e37, e34, e25, e21, eArray3, e26, e17, e10, e30, e15, e11, e39, e29, eArray6, eArrayArray, e8, e13, e38, e27};
        f0 = eArray7;
        g0 = new e("StripOffsets", 273, 3);
        eArray6 = new e("ThumbnailImage", 256, 7);
        eArray = new e("CameraSettingsIFDPointer", 8224, 4);
        eArray2 = new e("ImageProcessingIFDPointer", 8256, 4);
        eArray3 = new e[]{eArray6, eArray, eArray2};
        h0 = eArray3;
        eArray2 = new e("PreviewImageStart", 257, 4);
        eArray6 = new e("PreviewImageLength", 258, 4);
        eArray = new e[]{eArray2, eArray6};
        i0 = eArray;
        eArray2 = new e("AspectFrame", 4371, 3);
        eArray6 = new e[]{eArray2};
        j0 = eArray6;
        eArrayArray = new e("ColorSpace", 55, 3);
        eArray2 = new e[]{eArrayArray};
        k0 = eArray2;
        eArrayArray = new e[][]{object2, object, eArray4, eArray5, eArray7, object2, eArray3, eArray, eArray6, eArray2};
        l0 = eArrayArray;
        m0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        n0 = new HashMap[eArrayArray.length];
        o0 = new HashMap[eArrayArray.length];
        p0 = java.util.DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        q0 = new HashMap();
        object2 = Charset.forName("US-ASCII");
        r0 = object2;
        s0 = "Exif\u0000\u0000".getBytes((Charset)object2);
        t0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes((Charset)object2);
        object = Locale.US;
        W = object2 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", (Locale)object);
        ((DateFormat)object2).setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
        X = object2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", (Locale)object);
        ((DateFormat)object2).setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
        for (int i8 = 0; i8 < ((Object)(object2 = l0)).length; ++i8) {
            ax.y0.a.n0[i8] = new HashMap();
            ax.y0.a.o0[i8] = new HashMap();
            object2 = object2[i8];
            int n14 = ((Object)object2).length;
            for (int i9 = 0; i9 < n14; ++i9) {
                object = object2[i9];
                n0[i8].put(((e)object).a, (e)object);
                o0[i8].put(((e)object).b, (e)object);
            }
        }
        object = q0;
        object2 = m0;
        ((HashMap)object).put(((e)object2[0]).a, n13);
        ((HashMap)object).put(((e)object2[1]).a, n9);
        ((HashMap)object).put(((e)object2[2]).a, n11);
        ((HashMap)object).put(((e)object2[3]).a, n8);
        ((HashMap)object).put(((e)object2[4]).a, n12);
        ((HashMap)object).put(((e)object2[5]).a, n10);
        u0 = Pattern.compile(".*[1-9].*");
        v0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        w0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        x0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(FileDescriptor fileDescriptor) throws IOException {
        RuntimeException var3_6;
        FileInputStream fileInputStream;
        boolean bl;
        block11: {
            e[][] eArray = l0;
            this.f = new HashMap[eArray.length];
            this.h = new HashSet<Integer>(eArray.length);
            this.i = ByteOrder.BIG_ENDIAN;
            if (fileDescriptor == null) {
                throw new NullPointerException("fileDescriptor cannot be null");
            }
            this.c = null;
            this.a = null;
            if (ax.y0.a.P(fileDescriptor)) {
                this.b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup((FileDescriptor)fileDescriptor);
                    bl = true;
                }
                catch (Exception exception) {
                    throw new IOException("Failed to duplicate file descriptor", exception);
                }
            } else {
                this.b = null;
                bl = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
            }
            catch (Throwable throwable) {
                fileInputStream = null;
                break block11;
            }
            try {
                this.V(fileInputStream);
            }
            catch (Throwable throwable) {
                break block11;
            }
            ax.y0.b.b(fileInputStream);
            if (bl) {
                ax.y0.b.a(fileDescriptor);
            }
            return;
        }
        ax.y0.b.b(fileInputStream);
        if (bl) {
            ax.y0.b.a(fileDescriptor);
        }
        throw var3_6;
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int n8) throws IOException {
        Object object = l0;
        this.f = new HashMap[((e[][])object).length];
        this.h = new HashSet<Integer>(((e[][])object).length);
        this.i = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            boolean bl = true;
            if (n8 != 1) {
                bl = false;
            }
            this.e = bl;
            if (bl) {
                this.c = null;
                this.b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream)inputStream;
                this.b = null;
            } else if (inputStream instanceof FileInputStream && ax.y0.a.P(((FileInputStream)(object = (FileInputStream)inputStream)).getFD())) {
                this.c = null;
                this.b = ((FileInputStream)object).getFD();
            } else {
                this.c = null;
                this.b = null;
            }
            this.V(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public a(String string) throws IOException {
        e[][] eArray = l0;
        this.f = new HashMap[eArray.length];
        this.h = new HashSet<Integer>(eArray.length);
        this.i = ByteOrder.BIG_ENDIAN;
        if (string != null) {
            this.I(string);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    private boolean A(g object) throws IOException {
        byte[] byArray = s0;
        byte[] byArray2 = new byte[byArray.length];
        ((b)object).readFully(byArray2);
        if (!Arrays.equals(byArray2, byArray)) {
            Log.w((String)"ExifInterface", (String)"Given data is not EXIF-only.");
            return false;
        }
        object = ((b)object).c();
        this.q = byArray.length;
        this.a0((byte[])object, 0);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void D(b object) throws IOException {
        Object object2;
        if (x) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("getWebpAttributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        ((b)object).e(ByteOrder.LITTLE_ENDIAN);
        ((b)object).f(N.length);
        int n8 = ((b)object).readInt() + 8;
        object2 = O;
        ((b)object).f(((Object)object2).length);
        int n9 = ((Object)object2).length + 8;
        while (true) {
            int n10;
            int n11;
            block8: {
                try {
                    object2 = new byte[4];
                    ((b)object).readFully((byte[])object2);
                    n11 = ((b)object).readInt();
                    n10 = n9 + 8;
                    if (!Arrays.equals(P, (byte[])object2)) break block8;
                    object2 = new byte[n11];
                    ((b)object).readFully((byte[])object2);
                    byte[] byArray = s0;
                    object = object2;
                    if (ax.y0.b.g((byte[])object2, byArray)) {
                        object = Arrays.copyOfRange((byte[])object2, byArray.length, n11);
                    }
                }
                catch (EOFException eOFException) {
                    throw new IOException("Encountered corrupt WebP file.", eOFException);
                }
                this.q = n10;
                this.a0((byte[])object, 0);
                object2 = new b((byte[])object);
                this.n0((b)object2);
                return;
            }
            n9 = n11;
            if (n11 % 2 == 1) {
                n9 = n11 + 1;
            }
            if ((n11 = n10 + n9) == n8) {
                return;
            }
            if (n11 > n8) break;
            ((b)object).f(n9);
            n9 = n11;
        }
        object = new IOException("Encountered WebP file with invalid chunk size");
        throw object;
    }

    private static int E(int n8) {
        if (n8 != 4) {
            if (n8 != 9 && n8 != 15 && n8 != 12 && n8 != 13) {
                return 1;
            }
            return 2;
        }
        return 3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Pair<Integer, Integer> F(String pair) {
        boolean bl = pair.contains(",");
        int n10 = 1;
        Integer n9 = 2;
        Integer n8 = -1;
        if (bl) {
            Pair pair2;
            String[] stringArray = pair.split(",", -1);
            pair = pair2 = ax.y0.a.F(stringArray[0]);
            if ((Integer)pair2.first == 2) {
                return pair2;
            }
            while (n10 < stringArray.length) {
                pair2 = ax.y0.a.F(stringArray[n10]);
                int n11 = !((Integer)pair2.first).equals(pair.first) && !((Integer)pair2.second).equals(pair.first) ? -1 : (Integer)pair.first;
                int n12 = (Integer)pair.second != -1 && (((Integer)pair2.first).equals(pair.second) || ((Integer)pair2.second).equals(pair.second)) ? (Integer)pair.second : -1;
                if (n11 == -1 && n12 == -1) {
                    return new Pair((Object)n9, (Object)n8);
                }
                if (n11 == -1) {
                    pair = new Pair((Object)n12, (Object)n8);
                } else if (n12 == -1) {
                    pair = new Pair((Object)n11, (Object)n8);
                }
                ++n10;
            }
            return pair;
        }
        if (pair.contains("/")) {
            if (((String[])(pair = pair.split("/", -1))).length != 2) return new Pair((Object)n9, (Object)n8);
            try {
                long l8 = (long)Double.parseDouble(pair[0]);
                long l9 = (long)Double.parseDouble((String)pair[1]);
                if (l8 < 0L) return new Pair((Object)10, (Object)n8);
                if (l9 < 0L) return new Pair((Object)10, (Object)n8);
                if (l8 > Integer.MAX_VALUE) return new Pair((Object)5, (Object)n8);
                if (l9 <= Integer.MAX_VALUE) return new Pair((Object)10, (Object)5);
                return new Pair((Object)5, (Object)n8);
            }
            catch (NumberFormatException numberFormatException) {
                return new Pair((Object)n9, (Object)n8);
            }
        }
        try {
            long l10 = Long.parseLong((String)pair);
            long l8 = l10 - 0L;
            n10 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (n10 >= 0 && l10 <= 65535L) {
                return new Pair((Object)3, (Object)4);
            }
            if (n10 >= 0) return new Pair((Object)4, (Object)n8);
            return new Pair((Object)9, (Object)n8);
        }
        catch (NumberFormatException numberFormatException) {
            try {
                Double.parseDouble((String)pair);
                return new Pair((Object)12, (Object)n8);
            }
            catch (NumberFormatException numberFormatException2) {
                return new Pair((Object)n9, (Object)n8);
            }
        }
    }

    private void G(b object, HashMap<String, d> object2) throws IOException {
        d d8 = ((HashMap)object2).get("JPEGInterchangeFormat");
        object2 = ((HashMap)object2).get("JPEGInterchangeFormatLength");
        if (d8 != null && object2 != null) {
            int n8 = d8.m(this.i);
            int n9 = ((d)object2).m(this.i);
            int n10 = n8;
            if (this.d == 7) {
                n10 = n8 + this.r;
            }
            if (n10 > 0 && n9 > 0) {
                this.j = true;
                if (this.a == null && this.c == null && this.b == null) {
                    object2 = new byte[n9];
                    ((b)object).f(n10);
                    ((b)object).readFully((byte[])object2);
                    this.o = (byte[])object2;
                }
                this.m = n10;
                this.n = n9;
            }
            if (x) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Setting thumbnail attributes with offset: ");
                ((StringBuilder)object).append(n10);
                ((StringBuilder)object).append(", length: ");
                ((StringBuilder)object).append(n9);
                Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void H(b b8, HashMap<String, d> object) throws IOException {
        Object object2 = (d)((HashMap)object).get("StripOffsets");
        object = (d)((HashMap)object).get("StripByteCounts");
        if (object2 == null || object == null) return;
        object2 = ax.y0.b.c(((d)object2).o(this.i));
        long[] lArray = ax.y0.b.c(((d)object).o(this.i));
        if (object2 != null && ((Object)object2).length != 0) {
            if (lArray != null && lArray.length != 0) {
                int n8;
                if (((Object)object2).length != lArray.length) {
                    Log.w((String)"ExifInterface", (String)"stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                int n9 = lArray.length;
                long l8 = 0L;
                for (n8 = 0; n8 < n9; ++n8) {
                    l8 += lArray[n8];
                }
                int n10 = (int)l8;
                object = new byte[n10];
                this.l = true;
                this.k = true;
                this.j = true;
                n9 = 0;
                n8 = 0;
                for (int i8 = 0; i8 < ((Object)object2).length; ++i8) {
                    int n11 = (int)object2[i8];
                    int n12 = (int)lArray[i8];
                    if (i8 < ((Object)object2).length - 1 && (long)(n11 + n12) != object2[i8 + 1]) {
                        this.l = false;
                    }
                    if ((n11 -= n9) < 0) {
                        Log.d((String)"ExifInterface", (String)"Invalid strip offset value");
                        return;
                    }
                    try {
                        b8.f(n11);
                    }
                    catch (EOFException eOFException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to skip ");
                        stringBuilder.append(n11);
                        stringBuilder.append(" bytes.");
                        Log.d((String)"ExifInterface", (String)stringBuilder.toString());
                        return;
                    }
                    byte[] byArray = new byte[n12];
                    try {
                        b8.readFully(byArray);
                        n9 = n9 + n11 + n12;
                    }
                    catch (EOFException eOFException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to read ");
                        stringBuilder.append(n12);
                        stringBuilder.append(" bytes.");
                        Log.d((String)"ExifInterface", (String)stringBuilder.toString());
                        return;
                    }
                    System.arraycopy(byArray, 0, object, n8, n12);
                    n8 += n12;
                }
                this.o = (byte[])object;
                if (!this.l) return;
                this.m = (int)object2[0];
                this.n = n10;
                return;
            }
            Log.w((String)"ExifInterface", (String)"stripByteCounts should not be null or have zero length.");
            return;
        }
        Log.w((String)"ExifInterface", (String)"stripOffsets should not be null or have zero length.");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void I(String string) throws IOException {
        RuntimeException var1_4;
        FileInputStream fileInputStream;
        block5: {
            FileInputStream fileInputStream2;
            if (string == null) {
                throw new NullPointerException("filename cannot be null");
            }
            fileInputStream = null;
            this.c = null;
            this.a = string;
            try {
                fileInputStream2 = new FileInputStream(string);
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                this.b = ax.y0.a.P(fileInputStream2.getFD()) ? fileInputStream2.getFD() : null;
            }
            catch (Throwable throwable) {
                fileInputStream = fileInputStream2;
                break block5;
            }
            this.V(fileInputStream2);
            ax.y0.b.b(fileInputStream2);
            return;
        }
        ax.y0.b.b(fileInputStream);
        throw var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int J(byte[] var1_1) throws IOException {
        block27: {
            block28: {
                block26: {
                    block25: {
                        var17_6 = null;
                        var18_7 = null;
                        var15_8 /* !! */  = var18_7;
                        var15_8 /* !! */  = var18_7;
                        var16_10 = new b(var1_1 /* !! */ );
                        var8_12 = var16_10.readInt();
                        var15_8 /* !! */  = new byte[4];
                        var16_10.readFully(var15_8 /* !! */ );
                        var14_13 = Arrays.equals(var15_8 /* !! */ , ax.y0.a.E);
                        if (var14_13) break block25;
                        var16_10.close();
                        return 0;
                    }
                    if (var8_12 == 1L) {
                        var12_14 = var16_10.readLong();
                        var10_15 = 16L;
                        var8_12 = var12_14;
                        ** if (var12_14 >= 16L) goto lbl24
lbl-1000:
                        // 1 sources

                        {
                            var16_10.close();
                            return 0;
                        }
lbl24:
                        // 1 sources

                    } else {
                        var10_15 = 8L;
                    }
                    var12_14 = var8_12;
                    if (var8_12 <= (long)var1_1 /* !! */ .length) break block26;
                    var2_16 = var1_1 /* !! */ .length;
                    var12_14 = var2_16;
                }
                if ((var10_15 = var12_14 - var10_15) < 8L) {
                    var16_10.close();
                    return 0;
                }
                try {
                    var1_1 /* !! */  = new byte[4];
                    var5_17 = false;
                    var2_16 = 0;
                    var3_18 = false;
                }
                catch (Throwable var1_2) {
                    var15_8 /* !! */  = var16_10;
                    break block27;
                }
                catch (Exception var15_9) {
                    var1_1 /* !! */  = var16_10;
                    var16_10 = var15_9;
                    break block28;
                }
                for (var8_12 = 0L; var8_12 < (var12_14 = var10_15 / 4L); ++var8_12) {
                    block31: {
                        block33: {
                            block32: {
                                block30: {
                                    block29: {
                                        try {
                                            var16_10.readFully(var1_1 /* !! */ );
                                            if (var8_12 != 1L) break block29;
                                            var7_21 = var3_18;
                                        }
                                        catch (EOFException var1_3) {
                                            var16_10.close();
                                            return 0;
                                        }
                                    }
                                    if (!Arrays.equals(var1_1 /* !! */ , ax.y0.a.F)) break block30;
                                    var4_19 = true;
                                    var6_20 = var2_16;
                                    break block31;
                                }
                                if (!Arrays.equals(var1_1 /* !! */ , ax.y0.a.G)) break block32;
                                var6_20 = 1;
                                var4_19 = var5_17;
                                break block31;
                            }
                            if (Arrays.equals(var1_1 /* !! */ , ax.y0.a.H)) break block33;
                            var14_13 = Arrays.equals(var1_1 /* !! */ , ax.y0.a.I);
                            var4_19 = var5_17;
                            var6_20 = var2_16;
                            if (!var14_13) break block31;
                        }
                        var3_18 = true;
                        var6_20 = var2_16;
                        var4_19 = var5_17;
                    }
                    var5_17 = var4_19;
                    var2_16 = var6_20;
                    var7_21 = var3_18;
                    if (var4_19) {
                        if (var6_20 != 0) {
                            var16_10.close();
                            return 12;
                        }
                        var5_17 = var4_19;
                        var2_16 = var6_20;
                        var7_21 = var3_18;
                        if (var3_18) {
                            var16_10.close();
                            return 15;
                        }
                    }
                    var3_18 = var7_21;
                }
                var16_10.close();
                return 0;
                catch (Throwable var1_4) {
                    break block27;
                }
                catch (Exception var16_11) {
                    var1_1 /* !! */  = var17_6;
                }
            }
            var15_8 /* !! */  = var1_1 /* !! */ ;
            {
                if (ax.y0.a.x) {
                    var15_8 /* !! */  = var1_1 /* !! */ ;
                    Log.d((String)"ExifInterface", (String)"Exception parsing HEIF file type box.", (Throwable)var16_10);
                }
                if (var1_1 /* !! */  == null) return 0;
            }
            var1_1 /* !! */ .close();
            return 0;
        }
        if (var15_8 /* !! */  == null) throw var1_5;
        var15_8 /* !! */ .close();
        throw var1_5;
    }

    private static boolean K(byte[] byArray) throws IOException {
        byte[] byArray2;
        for (int i8 = 0; i8 < (byArray2 = D).length; ++i8) {
            if (byArray[i8] == byArray2[i8]) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean L(byte[] object) throws IOException {
        InputStream inputStream;
        block9: {
            Object object2;
            block8: {
                boolean bl;
                block10: {
                    bl = false;
                    InputStream inputStream2 = null;
                    Object var5_7 = null;
                    try {
                        object2 = new b((byte[])object);
                    }
                    catch (Throwable throwable) {
                        object = var5_7;
                        break block8;
                    }
                    catch (Exception exception) {
                        inputStream = inputStream2;
                        break block9;
                    }
                    try {
                        this.i = object = this.Z((b)object2);
                        ((b)object2).e((ByteOrder)object);
                        short s8 = ((b)object2).readShort();
                        if (s8 != 20306 && s8 != 21330) break block10;
                        bl = true;
                    }
                    catch (Throwable throwable) {
                        object = object2;
                        object2 = throwable;
                        break block8;
                    }
                    catch (Exception exception) {
                        inputStream = object2;
                        break block9;
                    }
                }
                ((InputStream)object2).close();
                return bl;
            }
            if (object != null) {
                ((InputStream)object).close();
            }
            throw object2;
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return false;
    }

    private boolean M(byte[] byArray) throws IOException {
        byte[] byArray2;
        for (int i8 = 0; i8 < (byArray2 = L).length; ++i8) {
            if (byArray[i8] == byArray2[i8]) continue;
            return false;
        }
        return true;
    }

    private boolean N(byte[] byArray) throws IOException {
        byte[] byArray2 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < byArray2.length; ++i8) {
            if (byArray[i8] == byArray2[i8]) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean O(byte[] object) throws IOException {
        InputStream inputStream;
        block9: {
            Object object2;
            block8: {
                boolean bl;
                block10: {
                    bl = false;
                    InputStream inputStream2 = null;
                    Object var5_7 = null;
                    try {
                        object2 = new b((byte[])object);
                    }
                    catch (Throwable throwable) {
                        object = var5_7;
                        break block8;
                    }
                    catch (Exception exception) {
                        inputStream = inputStream2;
                        break block9;
                    }
                    try {
                        this.i = object = this.Z((b)object2);
                        ((b)object2).e((ByteOrder)object);
                        short s8 = ((b)object2).readShort();
                        if (s8 != 85) break block10;
                        bl = true;
                    }
                    catch (Throwable throwable) {
                        object = object2;
                        object2 = throwable;
                        break block8;
                    }
                    catch (Exception exception) {
                        inputStream = object2;
                        break block9;
                    }
                }
                ((InputStream)object2).close();
                return bl;
            }
            if (object != null) {
                ((InputStream)object).close();
            }
            throw object2;
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return false;
    }

    private static boolean P(FileDescriptor fileDescriptor) {
        try {
            Os.lseek((FileDescriptor)fileDescriptor, (long)0L, (int)OsConstants.SEEK_CUR);
            return true;
        }
        catch (Exception exception) {
            if (x) {
                Log.d((String)"ExifInterface", (String)"The file descriptor for the given input is not seekable");
            }
            return false;
        }
    }

    private boolean Q(HashMap<String, d> object) {
        Object object2 = ((HashMap)object).get("BitsPerSample");
        if (object2 != null) {
            int n8;
            object2 = A;
            int[] nArray = (int[])((d)object2).o(this.i);
            if (Arrays.equals((int[])object2, nArray)) {
                return true;
            }
            if (this.d == 3 && (object = ((HashMap)object).get("PhotometricInterpretation")) != null && ((n8 = ((d)object).m(this.i)) == 1 && Arrays.equals(nArray, C) || n8 == 6 && Arrays.equals(nArray, (int[])object2))) {
                return true;
            }
        }
        if (x) {
            Log.d((String)"ExifInterface", (String)"Unsupported data type value");
        }
        return false;
    }

    private static boolean R(int n8) {
        return n8 == 4 || n8 == 13 || n8 == 14;
        {
        }
    }

    public static boolean S(String string) {
        if (string != null) {
            string = string.toLowerCase(Locale.ROOT);
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2111234748: {
                    if (!string.equals("image/x-canon-cr2")) break;
                    n8 = 14;
                    break;
                }
                case 2099152524: {
                    if (!string.equals("image/x-nikon-nrw")) break;
                    n8 = 13;
                    break;
                }
                case 2099152104: {
                    if (!string.equals("image/x-nikon-nef")) break;
                    n8 = 12;
                    break;
                }
                case 1378106698: {
                    if (!string.equals("image/x-olympus-orf")) break;
                    n8 = 11;
                    break;
                }
                case -332763809: {
                    if (!string.equals("image/x-pentax-pef")) break;
                    n8 = 10;
                    break;
                }
                case -879258763: {
                    if (!string.equals("image/png")) break;
                    n8 = 9;
                    break;
                }
                case -985160897: {
                    if (!string.equals("image/x-panasonic-rw2")) break;
                    n8 = 8;
                    break;
                }
                case -1423313290: {
                    if (!string.equals("image/x-adobe-dng")) break;
                    n8 = 7;
                    break;
                }
                case -1487018032: {
                    if (!string.equals("image/webp")) break;
                    n8 = 6;
                    break;
                }
                case -1487394660: {
                    if (!string.equals("image/jpeg")) break;
                    n8 = 5;
                    break;
                }
                case -1487464690: {
                    if (!string.equals("image/heif")) break;
                    n8 = 4;
                    break;
                }
                case -1487464693: {
                    if (!string.equals("image/heic")) break;
                    n8 = 3;
                    break;
                }
                case -1594371159: {
                    if (!string.equals("image/x-sony-arw")) break;
                    n8 = 2;
                    break;
                }
                case -1635437028: {
                    if (!string.equals("image/x-samsung-srw")) break;
                    n8 = 1;
                    break;
                }
                case -1875291391: {
                    if (!string.equals("image/x-fuji-raf")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    return false;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
            }
            return true;
        }
        throw new NullPointerException("mimeType shouldn't be null");
    }

    private boolean T(HashMap<String, d> object) {
        d d8 = ((HashMap)object).get("ImageLength");
        object = ((HashMap)object).get("ImageWidth");
        if (d8 != null && object != null) {
            int n8 = d8.m(this.i);
            int n9 = ((d)object).m(this.i);
            if (n8 <= 512 && n9 <= 512) {
                return true;
            }
        }
        return false;
    }

    private boolean U(byte[] byArray) throws IOException {
        byte[] byArray2;
        int n8;
        for (n8 = 0; n8 < (byArray2 = N).length; ++n8) {
            if (byArray[n8] == byArray2[n8]) continue;
            return false;
        }
        for (n8 = 0; n8 < (byArray2 = O).length; ++n8) {
            if (byArray[N.length + n8 + 4] == byArray2[n8]) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void V(InputStream var1_1) {
        block21: {
            block23: {
                try {
                    for (var2_5 = 0; var2_5 < ax.y0.a.l0.length; ++var2_5) {
                        this.f[var2_5] = new HashMap<K, V>();
                    }
                }
                catch (Throwable var1_2) {
                    break block21;
                }
                catch (UnsupportedOperationException var1_3) {
                    ** GOTO lbl-1000
                }
                catch (IOException var1_4) {
                    ** GOTO lbl-1000
                }
                var4_6 = var1_1;
                {
                    if (!this.e) {
                        var4_6 = new BufferedInputStream(var1_1, 5000);
                        this.d = this.t((BufferedInputStream)var4_6);
                    }
                    if (!ax.y0.a.o0(this.d)) ** GOTO lbl42
                    var1_1 = new g(var4_6);
                    if (!this.e) ** GOTO lbl-1000
                    var3_7 = this.A((g)var1_1);
                    ** if (var3_7) goto lbl25
                }
lbl-1000:
                // 1 sources

                {
                    this.e();
                    if (!ax.y0.a.x) return;
                    this.Y();
                    return;
                }
lbl25:
                // 1 sources

                ** GOTO lbl38
lbl-1000:
                // 1 sources

                {
                    block22: {
                        block24: {
                            var2_5 = this.d;
                            if (var2_5 == 12 || var2_5 == 15) break block24;
                            if (var2_5 == 7) {
                                this.u((g)var1_1);
                                break block22;
                            } else if (var2_5 == 10) {
                                this.z((g)var1_1);
                                break block22;
                            } else {
                                this.x((g)var1_1);
                            }
                            break block22;
                        }
                        this.q((g)var1_1, var2_5);
                    }
                    var1_1.g(this.q);
                    this.n0((b)var1_1);
                    break block23;
lbl42:
                    // 1 sources

                    var1_1 = new b(var4_6);
                    var2_5 = this.d;
                    if (var2_5 == 4) {
                        this.r((b)var1_1, 0, 0);
                        break block23;
                    }
                    if (var2_5 == 13) {
                        this.v((b)var1_1);
                        break block23;
                    }
                    if (var2_5 == 9) {
                        this.w((b)var1_1);
                        break block23;
                    }
                    if (var2_5 != 14) break block23;
                    this.D((b)var1_1);
                }
            }
            this.e();
            if (!ax.y0.a.x) return;
            this.Y();
            return;
lbl-1000:
            // 2 sources

            {
                var3_8 = ax.y0.a.x;
                if (var3_8) {
                    Log.w((String)"ExifInterface", (String)"Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", (Throwable)var1_1);
                }
                this.e();
                if (!var3_8) return;
                this.Y();
            }
            return;
        }
        this.e();
        if (!ax.y0.a.x) throw var1_2;
        this.Y();
        throw var1_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Long W(String object, String string, String string2) {
        long l8;
        long l9;
        block8: {
            int n8;
            int n9;
            int n10;
            if (object == null) return null;
            if (!u0.matcher((CharSequence)object).matches()) {
                return null;
            }
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = W.parse((String)object, parsePosition);
                Object object2 = date;
                if (date == null) {
                    object2 = object = X.parse((String)object, parsePosition);
                    if (object == null) {
                        return null;
                    }
                }
                l8 = l9 = ((Date)object2).getTime();
                if (string2 == null) break block8;
                n10 = 1;
                object = string2.substring(0, 1);
                n9 = Integer.parseInt(string2.substring(1, 3));
                n8 = Integer.parseInt(string2.substring(4, 6));
                boolean bl = "+".equals(object);
                if (!bl) {
                    l8 = l9;
                    if (!"-".equals(object)) break block8;
                }
                l8 = l9;
                if (!":".equals(string2.substring(3, 4))) break block8;
                l8 = l9;
                if (n9 > 14) break block8;
                if (!"-".equals(object)) {
                    n10 = -1;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
            l8 = l9 + (long)((n9 * 60 + n8) * 60000 * n10);
        }
        l9 = l8;
        if (string == null) return l9;
        {
            l9 = l8 + ax.y0.b.f(string);
        }
        return l9;
    }

    private void X(b object) throws IOException {
        ByteOrder byteOrder;
        this.i = byteOrder = this.Z((b)object);
        ((b)object).e(byteOrder);
        int n8 = ((b)object).readUnsignedShort();
        int n9 = this.d;
        if (n9 != 7 && n9 != 10 && n8 != 42) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid start code: ");
            ((StringBuilder)object).append(Integer.toHexString(n8));
            throw new IOException(((StringBuilder)object).toString());
        }
        n8 = ((b)object).readInt();
        if (n8 >= 8) {
            if ((n8 -= 8) > 0) {
                ((b)object).f(n8);
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid first Ifd offset: ");
        ((StringBuilder)object).append(n8);
        throw new IOException(((StringBuilder)object).toString());
    }

    private void Y() {
        for (int i8 = 0; i8 < this.f.length; ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The size of tag group[");
            stringBuilder.append(i8);
            stringBuilder.append("]: ");
            stringBuilder.append(this.f[i8].size());
            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
            for (Map.Entry entry : this.f[i8].entrySet()) {
                d d8 = (d)entry.getValue();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("tagName: ");
                stringBuilder2.append((String)entry.getKey());
                stringBuilder2.append(", tagType: ");
                stringBuilder2.append(d8.toString());
                stringBuilder2.append(", tagValue: '");
                stringBuilder2.append(d8.n(this.i));
                stringBuilder2.append("'");
                Log.d((String)"ExifInterface", (String)stringBuilder2.toString());
            }
        }
    }

    private ByteOrder Z(b object) throws IOException {
        short s8 = ((b)object).readShort();
        if (s8 != 18761) {
            if (s8 == 19789) {
                if (x) {
                    Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid byte order: ");
            ((StringBuilder)object).append(Integer.toHexString(s8));
            throw new IOException(((StringBuilder)object).toString());
        }
        if (x) {
            Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void a0(byte[] object, int n8) throws IOException {
        object = new g((byte[])object);
        this.X((b)object);
        this.b0((g)object, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b0(g object, int n8) throws IOException {
        long l8;
        boolean bl;
        Object object2;
        this.h.add(((b)object).b());
        short s8 = ((b)object).readShort();
        if (x) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("numberOfDirectoryEntry: ");
            ((StringBuilder)object2).append(s8);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        if (s8 <= 0) {
            return;
        }
        for (short s9 = 0; s9 < s8; s9 = (short)(s9 + 1)) {
            int n9;
            Object object3;
            long l9;
            int n10;
            int n11;
            int n12;
            block36: {
                block44: {
                    block43: {
                        block41: {
                            block42: {
                                block37: {
                                    block38: {
                                        block39: {
                                            block40: {
                                                Object object4;
                                                block34: {
                                                    block35: {
                                                        block30: {
                                                            block31: {
                                                                block33: {
                                                                    block32: {
                                                                        block29: {
                                                                            n12 = ((b)object).readUnsignedShort();
                                                                            n11 = ((b)object).readUnsignedShort();
                                                                            n10 = ((b)object).readInt();
                                                                            l9 = (long)((b)object).b() + 4L;
                                                                            object3 = n0[n8].get(n12);
                                                                            bl = x;
                                                                            if (bl) {
                                                                                object2 = object3 != null ? ((e)object3).b : null;
                                                                                Log.d((String)"ExifInterface", (String)String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", n8, n12, object2, n11, n10));
                                                                            }
                                                                            if (object3 != null) break block29;
                                                                            if (bl) {
                                                                                object2 = new StringBuilder();
                                                                                ((StringBuilder)object2).append("Skip the tag entry since tag number is not defined: ");
                                                                                ((StringBuilder)object2).append(n12);
                                                                                Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                                                                            }
                                                                            break block30;
                                                                        }
                                                                        if (n11 <= 0 || n11 >= ((Object)(object2 = (Object)Z)).length) break block31;
                                                                        if (((e)object3).a(n11)) break block32;
                                                                        if (bl) {
                                                                            object2 = new StringBuilder();
                                                                            ((StringBuilder)object2).append("Skip the tag entry since data format (");
                                                                            ((StringBuilder)object2).append(Y[n11]);
                                                                            ((StringBuilder)object2).append(") is unexpected for tag: ");
                                                                            ((StringBuilder)object2).append(((e)object3).b);
                                                                            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    n9 = n11;
                                                                    if (n11 == 7) {
                                                                        n9 = ((e)object3).c;
                                                                    }
                                                                    l8 = n10;
                                                                    if ((l8 = (long)object2[n9] * l8) < 0L || l8 > Integer.MAX_VALUE) break block33;
                                                                    n11 = 1;
                                                                    break block34;
                                                                }
                                                                if (bl) {
                                                                    object2 = new StringBuilder();
                                                                    ((StringBuilder)object2).append("Skip the tag entry since the number of components is invalid: ");
                                                                    ((StringBuilder)object2).append(n10);
                                                                    Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                                                                }
                                                                break block35;
                                                            }
                                                            if (bl) {
                                                                object2 = new StringBuilder();
                                                                ((StringBuilder)object2).append("Skip the tag entry since data format is invalid: ");
                                                                ((StringBuilder)object2).append(n11);
                                                                Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                                                            }
                                                        }
                                                        l8 = 0L;
                                                        n9 = n11;
                                                    }
                                                    n11 = 0;
                                                }
                                                if (n11 == 0) {
                                                    ((g)object).g(l9);
                                                    continue;
                                                }
                                                if (l8 > 4L) {
                                                    n11 = ((b)object).readInt();
                                                    if (bl) {
                                                        object2 = new StringBuilder();
                                                        ((StringBuilder)object2).append("seek to data offset: ");
                                                        ((StringBuilder)object2).append(n11);
                                                        Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                                                    }
                                                    if (this.d == 7) {
                                                        if ("MakerNote".equals(((e)object3).b)) {
                                                            this.r = n11;
                                                        } else if (n8 == 6 && "ThumbnailImage".equals(((e)object3).b)) {
                                                            this.s = n11;
                                                            this.t = n10;
                                                            object4 = ax.y0.a$d.j(6, this.i);
                                                            object2 = ax.y0.a$d.f(this.s, this.i);
                                                            d d8 = ax.y0.a$d.f(this.t, this.i);
                                                            this.f[4].put("Compression", (d)object4);
                                                            this.f[4].put("JPEGInterchangeFormat", (d)object2);
                                                            this.f[4].put("JPEGInterchangeFormatLength", d8);
                                                        }
                                                    }
                                                    ((g)object).g(n11);
                                                }
                                                object2 = q0.get(n12);
                                                if (bl) {
                                                    object4 = new StringBuilder();
                                                    ((StringBuilder)object4).append("nextIfdType: ");
                                                    ((StringBuilder)object4).append(object2);
                                                    ((StringBuilder)object4).append(" byteCount: ");
                                                    ((StringBuilder)object4).append(l8);
                                                    Log.d((String)"ExifInterface", (String)((StringBuilder)object4).toString());
                                                }
                                                if (object2 == null) break block36;
                                                if (n9 == 3) break block37;
                                                if (n9 == 4) break block38;
                                                if (n9 == 8) break block39;
                                                if (n9 == 9 || n9 == 13) break block40;
                                                l8 = -1L;
                                                break block41;
                                            }
                                            n9 = ((b)object).readInt();
                                            break block42;
                                        }
                                        n9 = ((b)object).readShort();
                                        break block42;
                                    }
                                    l8 = ((b)object).d();
                                    break block41;
                                }
                                n9 = ((b)object).readUnsignedShort();
                            }
                            l8 = n9;
                        }
                        if (bl) {
                            Log.d((String)"ExifInterface", (String)String.format("Offset: %d, tagName: %s", l8, ((e)object3).b));
                        }
                        if (l8 <= 0L || ((b)object).a() != -1 && l8 >= (long)((b)object).a()) break block43;
                        if (!this.h.contains((int)l8)) {
                            ((g)object).g(l8);
                            this.b0((g)object, (Integer)object2);
                            break block44;
                        } else if (bl) {
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("Skip jump into the IFD since it has already been read: IfdType ");
                            ((StringBuilder)object3).append(object2);
                            ((StringBuilder)object3).append(" (at ");
                            ((StringBuilder)object3).append(l8);
                            ((StringBuilder)object3).append(")");
                            Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                        }
                        break block44;
                    }
                    if (bl) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Skip jump into the IFD since its offset is invalid: ");
                        ((StringBuilder)object2).append(l8);
                        object2 = object3 = ((StringBuilder)object2).toString();
                        if (((b)object).a() != -1) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append((String)object3);
                            ((StringBuilder)object2).append(" (total length: ");
                            ((StringBuilder)object2).append(((b)object).a());
                            ((StringBuilder)object2).append(")");
                            object2 = ((StringBuilder)object2).toString();
                        }
                        Log.d((String)"ExifInterface", (String)object2);
                    }
                }
                ((g)object).g(l9);
                continue;
            }
            n11 = ((b)object).b();
            n12 = this.q;
            object2 = new byte[(int)l8];
            ((b)object).readFully((byte[])object2);
            object2 = new d(n9, n10, n11 + n12, (byte[])object2);
            this.f[n8].put(((e)object3).b, (d)object2);
            if ("DNGVersion".equals(((e)object3).b)) {
                this.d = 3;
            }
            if (("Make".equals(((e)object3).b) || "Model".equals(((e)object3).b)) && ((d)object2).n(this.i).contains("PENTAX") || "Compression".equals(((e)object3).b) && ((d)object2).m(this.i) == 65535) {
                this.d = 8;
            }
            if ((long)((b)object).b() == l9) continue;
            ((g)object).g(l9);
        }
        n8 = ((b)object).readInt();
        bl = x;
        if (bl) {
            Log.d((String)"ExifInterface", (String)String.format("nextIfdOffset: %d", n8));
        }
        if ((l8 = (long)n8) <= 0L) {
            if (!bl) return;
            object = new StringBuilder();
            ((StringBuilder)object).append("Stop reading file since a wrong offset may cause an infinite loop: ");
            ((StringBuilder)object).append(n8);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
            return;
        }
        if (this.h.contains(n8)) {
            if (!bl) return;
            object = new StringBuilder();
            ((StringBuilder)object).append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
            ((StringBuilder)object).append(n8);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
            return;
        }
        ((g)object).g(l8);
        if (this.f[4].isEmpty()) {
            this.b0((g)object, 4);
            return;
        }
        if (!this.f[5].isEmpty()) return;
        this.b0((g)object, 5);
    }

    private void c0(String string) {
        for (int i8 = 0; i8 < l0.length; ++i8) {
            this.f[i8].remove(string);
        }
    }

    static /* synthetic */ byte[] d() {
        return a0;
    }

    private void d0(int n8, String string, String string2) {
        if (!this.f[n8].isEmpty() && this.f[n8].get(string) != null) {
            HashMap<String, d> hashMap = this.f[n8];
            hashMap.put(string2, hashMap.get(string));
            this.f[n8].remove(string);
        }
    }

    private void e() {
        String string = this.i("DateTimeOriginal");
        if (string != null && this.i("DateTime") == null) {
            this.f[0].put("DateTime", ax.y0.a$d.e(string));
        }
        if (this.i("ImageWidth") == null) {
            this.f[0].put("ImageWidth", ax.y0.a$d.f(0L, this.i));
        }
        if (this.i("ImageLength") == null) {
            this.f[0].put("ImageLength", ax.y0.a$d.f(0L, this.i));
        }
        if (this.i("Orientation") == null) {
            this.f[0].put("Orientation", ax.y0.a$d.f(0L, this.i));
        }
        if (this.i("LightSource") == null) {
            this.f[1].put("LightSource", ax.y0.a$d.f(0L, this.i));
        }
    }

    private void e0(int n8, String string, String string2) {
        if (!this.f[n8].isEmpty() && this.f[n8].get(string) != null) {
            HashMap<String, d> hashMap = this.f[n8];
            hashMap.put(string2, hashMap.get(string));
        }
    }

    private static double f(String object, String string) {
        double d8;
        block4: {
            object = object.split(",", -1);
            String[] stringArray = object[0].split("/", -1);
            double d9 = Double.parseDouble(stringArray[0].trim()) / Double.parseDouble(stringArray[1].trim());
            stringArray = object[1].split("/", -1);
            d8 = Double.parseDouble(stringArray[0].trim()) / Double.parseDouble(stringArray[1].trim());
            object = object[2].split("/", -1);
            double d10 = Double.parseDouble(object[0].trim()) / Double.parseDouble(object[1].trim());
            d8 = d9 + d8 / 60.0 + d10 / 3600.0;
            try {
                if (string.equals("S") || string.equals("W")) break block4;
                if (!string.equals("N") && !string.equals("E")) {
                    object = new IllegalArgumentException();
                    throw object;
                }
                return d8;
            }
            catch (ArrayIndexOutOfBoundsException | NumberFormatException runtimeException) {
                throw new IllegalArgumentException(runtimeException);
            }
        }
        return -d8;
    }

    private void g(b b8, c c8, byte[] byArray, byte[] byArray2) throws IOException {
        byte[] byArray3;
        do {
            byArray3 = new byte[4];
            b8.readFully(byArray3);
            this.h(b8, c8, byArray3);
        } while (!Arrays.equals(byArray3, byArray) && (byArray2 == null || !Arrays.equals(byArray3, byArray2)));
    }

    private void g0(g g8, int n8) throws IOException {
        Object object = this.f[n8].get("ImageLength");
        d d8 = this.f[n8].get("ImageWidth");
        if (object == null || d8 == null) {
            object = this.f[n8].get("JPEGInterchangeFormat");
            d8 = this.f[n8].get("JPEGInterchangeFormatLength");
            if (object != null && d8 != null) {
                int n9 = ((d)object).m(this.i);
                int n10 = ((d)object).m(this.i);
                g8.g(n9);
                object = new byte[n10];
                g8.readFully((byte[])object);
                this.r(new b((byte[])object), n9, n8);
            }
        }
    }

    private void h(b b8, c c8, byte[] byArray) throws IOException {
        int n8 = b8.readInt();
        c8.write(byArray);
        c8.c(n8);
        int n9 = n8;
        if (n8 % 2 == 1) {
            n9 = n8 + 1;
        }
        ax.y0.b.e(b8, c8, n9);
    }

    private void j0(InputStream object, OutputStream outputStream) throws IOException {
        Object object2;
        if (x) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("saveJpegAttributes starting with (inputStream: ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(", outputStream: ");
            ((StringBuilder)object2).append(outputStream);
            ((StringBuilder)object2).append(")");
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        object2 = new b((InputStream)object);
        outputStream = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (((b)object2).readByte() == -1) {
            ((c)outputStream).b(-1);
            if (((b)object2).readByte() == -40) {
                ((c)outputStream).b(-40);
                ((c)outputStream).b(-1);
                ((c)outputStream).b(-31);
                this.q = this.t0((c)outputStream);
                if (this.v != null) {
                    outputStream.write(-1);
                    ((c)outputStream).b(-31);
                    object = t0;
                    ((c)outputStream).f(((Object)object).length + 2 + this.v.d.length);
                    ((c)outputStream).write((byte[])object);
                    ((c)outputStream).write(this.v.d);
                    this.w = true;
                }
                byte[] byArray = new byte[4096];
                while (((b)object2).readByte() == -1) {
                    byte by = ((b)object2).readByte();
                    if (by != -39 && by != -38) {
                        int n8;
                        int n9;
                        if (by != -31) {
                            ((c)outputStream).b(-1);
                            ((c)outputStream).b(by);
                            n9 = ((b)object2).readUnsignedShort();
                            ((c)outputStream).f(n9);
                            if ((n9 -= 2) >= 0) {
                                while (n9 > 0 && (n8 = ((b)object2).read(byArray, 0, Math.min(n9, 4096))) >= 0) {
                                    ((c)outputStream).write(byArray, 0, n8);
                                    n9 -= n8;
                                }
                                continue;
                            }
                            throw new IOException("Invalid length");
                        }
                        n9 = ((b)object2).readUnsignedShort();
                        n8 = n9 - 2;
                        if (n8 >= 0) {
                            byte[] byArray2 = t0;
                            object = n8 >= byArray2.length ? (Object)new byte[byArray2.length] : (n8 >= ((Object)(object = (Object)s0)).length ? (Object)new byte[((Object)object).length] : null);
                            if (object != null) {
                                ((b)object2).readFully((byte[])object);
                                if (ax.y0.b.g((byte[])object, s0) || ax.y0.b.g((byte[])object, byArray2)) {
                                    ((b)object2).f(n8 - ((Object)object).length);
                                    continue;
                                }
                            }
                            ((c)outputStream).b(-1);
                            ((c)outputStream).b(by);
                            ((c)outputStream).f(n9);
                            n9 = n8;
                            if (object != null) {
                                n9 = n8 - ((Object)object).length;
                                ((c)outputStream).write((byte[])object);
                            }
                            while (n9 > 0 && (n8 = ((b)object2).read(byArray, 0, Math.min(n9, 4096))) >= 0) {
                                ((c)outputStream).write(byArray, 0, n8);
                                n9 -= n8;
                            }
                            continue;
                        }
                        throw new IOException("Invalid length");
                    }
                    ((c)outputStream).b(-1);
                    ((c)outputStream).b(by);
                    ax.y0.b.d((InputStream)object2, outputStream);
                    return;
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /*
     * Unable to fully structure code
     */
    private void k0(InputStream var1_1, OutputStream var2_2) throws IOException {
        if (ax.y0.a.x) {
            var8_3 = new StringBuilder();
            var8_3.append("savePngAttributes starting with (inputStream: ");
            var8_3.append(var1_1);
            var8_3.append(", outputStream: ");
            var8_3.append(var2_2);
            var8_3.append(")");
            Log.d((String)"ExifInterface", (String)var8_3.toString());
        }
        var1_1 = new b(var1_1);
        var2_2 = new c(var2_2, ByteOrder.BIG_ENDIAN);
        ax.y0.b.e(var1_1, var2_2, ax.y0.a.L.length);
        var8_3 = this.v;
        var3_4 = 1;
        var4_5 = 1;
        if (var8_3 == null && !this.w) ** GOTO lbl45
        var5_6 = true;
        var3_4 = var4_5;
        block0: while (true) {
            block12: {
                if (var3_4 == 0 && !var5_6) {
                    ax.y0.b.d(var1_1, var2_2);
                    return;
                }
                var6_7 = var1_1.readInt();
                var4_5 = var1_1.readInt();
                if (var4_5 != 1229472850) break block12;
                var2_2.c(var6_7);
                var2_2.c(var4_5);
                ax.y0.b.e(var1_1, var2_2, var6_7 + 4);
                var4_5 = var3_4;
                if (this.q == 0) {
                    this.u0((c)var2_2);
                    var4_5 = 0;
                }
                var3_4 = var4_5;
                if (this.v == null) continue;
                var3_4 = var4_5;
                if (this.w) continue;
                this.v0((c)var2_2);
                var3_4 = var4_5;
lbl45:
                // 3 sources

                while (true) {
                    var5_6 = false;
                    continue block0;
                    break;
                }
            }
            if (var4_5 == 1700284774 && var3_4 != 0) {
                this.u0((c)var2_2);
                var1_1.f(var6_7 + 4);
                var3_4 = 0;
                continue;
            }
            if (var4_5 == 1767135348 && var6_7 >= ((Object)(var8_3 = (Object)ax.y0.a.M)).length) {
                var7_8 = ((Object)var8_3).length;
                var9_9 = new byte[var7_8];
                var1_1.readFully(var9_9);
                var7_8 = var6_7 - var7_8 + 4;
                if (Arrays.equals(var9_9, (byte[])var8_3)) {
                    if (this.v != null) {
                        this.v0((c)var2_2);
                    }
                    var1_1.f(var7_8);
                    ** continue;
                }
                var2_2.c(var6_7);
                var2_2.c(var4_5);
                var2_2.write(var9_9);
                ax.y0.b.e(var1_1, var2_2, var7_8);
                continue;
            }
            var2_2.c(var6_7);
            var2_2.c(var4_5);
            ax.y0.b.e(var1_1, var2_2, var6_7 + 4);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l0(InputStream var1_1, OutputStream var2_2) throws IOException {
        block33: {
            block34: {
                block29: {
                    if (ax.y0.a.x) {
                        var13_4 = new StringBuilder();
                        var13_4.append("saveWebpAttributes starting with (inputStream: ");
                        var13_4.append(var1_1);
                        var13_4.append(", outputStream: ");
                        var13_4.append(var2_2);
                        var13_4.append(")");
                        Log.d((String)"ExifInterface", (String)var13_4.toString());
                    }
                    var17_9 = ByteOrder.LITTLE_ENDIAN;
                    var15_10 = new b((InputStream)var1_1, (ByteOrder)var17_9);
                    var16_11 = new c((OutputStream)var2_2, (ByteOrder)var17_9);
                    var19_12 = ax.y0.a.N;
                    ax.y0.b.e(var15_10, var16_11, var19_12.length);
                    var11_13 = var15_10.readInt();
                    var18_14 = ax.y0.a.O;
                    var15_10.f(var18_14.length);
                    var14_15 = null;
                    var1_1 = var13_4 = null;
                    var1_1 = var13_4;
                    var2_2 = new ByteArrayOutputStream();
                    var1_1 = new c((OutputStream)var2_2, (ByteOrder)var17_9);
                    var4_17 = this.q;
                    if (var4_17 != 0) {
                        ax.y0.b.e(var15_10, (OutputStream)var1_1, var4_17 - (var19_12.length + 4 + var18_14.length) - 8);
                        var15_10.f(4);
                        var4_17 = var5_18 = var15_10.readInt();
                        if (var5_18 % 2 != 0) {
                            var4_17 = var5_18 + 1;
                        }
                        var15_10.f(var4_17);
                        var4_17 = this.t0((c)var1_1);
                        break block29;
                    }
                    var13_4 = new byte[4];
                    var15_10.readFully((byte[])var13_4);
                    var14_15 = ax.y0.a.R;
                    var12_19 = Arrays.equals((byte[])var13_4, (byte[])var14_15);
                    var6_20 = 0;
                    var7_21 = 1;
                    if (var12_19 == 0) ** GOTO lbl66
                    var5_18 = var15_10.readInt();
                    var4_17 = var5_18 % 2 == 1 ? var5_18 + 1 : var5_18;
                    var13_4 = new byte[var4_17];
                    var15_10.readFully((byte[])var13_4);
                    var3_22 = (byte)(var13_4[0] | 8);
                    var13_4[0] = var3_22;
                    var4_17 = var6_20;
                    if ((var3_22 >> 1 & 1) == 1) {
                        var4_17 = 1;
                    }
                    var1_1.write((byte[])var14_15);
                    var1_1.c(var5_18);
                    var1_1.write((byte[])var13_4);
                    if (var4_17 == 0) ** GOTO lbl-1000
                    this.g(var15_10, (c)var1_1, ax.y0.a.U, null);
lbl-1000:
                    // 1 sources

                    {
                        block32: {
                            block31: {
                                block30: {
                                    this.g(var15_10, (c)var1_1, ax.y0.a.T, ax.y0.a.S);
                                    var4_17 = this.t0((c)var1_1);
                                    break block29;
lbl66:
                                    // 1 sources

                                    var18_14 = ax.y0.a.T;
                                    if (!Arrays.equals((byte[])var13_4, var18_14) && !Arrays.equals((byte[])var13_4, ax.y0.a.S)) {
                                        var4_17 = -1;
                                        break block29;
                                    }
                                    var9_23 = var15_10.readInt();
                                    var4_17 = var9_23 % 2 == 1 ? var9_23 + 1 : var9_23;
                                    var17_9 = new byte[3];
                                    if (!Arrays.equals((byte[])var13_4, var18_14)) ** GOTO lbl90
                                    var15_10.readFully((byte[])var17_9);
                                    var19_12 = new byte[3];
                                    var15_10.readFully(var19_12);
                                    if (!Arrays.equals(ax.y0.a.Q, var19_12)) break block30;
                                    var5_18 = var15_10.readInt();
                                    var10_24 = var5_18 >> 16 & 16383;
                                    var6_20 = var4_17 - 10;
                                    var8_26 = var5_18 & 16383;
                                    var7_21 = 0;
                                    var4_17 = var10_24;
                                    ** GOTO lbl109
                                }
                                var1_1 = new IOException("Error checking VP8 signature");
                                throw var1_1;
lbl90:
                                // 1 sources

                                if (!Arrays.equals((byte[])var13_4, ax.y0.a.S)) ** GOTO lbl103
                                if (var15_10.readByte() != 47) break block31;
                                var5_18 = var15_10.readInt();
                                if ((var5_18 & 0x10000000) == 0) {
                                    var7_21 = 0;
                                }
                                var6_20 = var4_17 - 5;
                                var8_26 = (var5_18 & 16383) + 1;
                                var4_17 = ((var5_18 & 0xFFFC000) >>> 14) + 1;
                                ** GOTO lbl109
                            }
                            var1_1 = new IOException("Error checking VP8L signature");
                            throw var1_1;
lbl103:
                            // 1 sources

                            var10_25 = 0;
                            var5_18 = 0;
                            var7_21 = 0;
                            var8_26 = 0;
                            var6_20 = var4_17;
                            var4_17 = var10_25;
lbl109:
                            // 3 sources

                            var1_1.write((byte[])var14_15);
                            var1_1.c(10);
                            var14_15 = new byte[10];
                            if (var7_21 == 0) break block32;
                            var14_15[0] = (byte)(var14_15[0] | 16);
                        }
                        var14_15[0] = (byte)(var14_15[0] | 8);
                        var7_21 = var8_26 - 1;
                        var14_15[4] = (byte)var7_21;
                        var14_15[5] = (byte)(var7_21 >> 8);
                        var14_15[6] = (byte)(var7_21 >> 16);
                        var14_15[7] = (byte)(--var4_17);
                        var14_15[8] = (byte)(var4_17 >> 8);
                        var14_15[9] = (byte)(var4_17 >> 16);
                        try {
                            var1_1.write((byte[])var14_15);
                            var1_1.write((byte[])var13_4);
                            var1_1.c(var9_23);
                            if (Arrays.equals((byte[])var13_4, var18_14)) {
                                var1_1.write((byte[])var17_9);
                                var1_1.write(ax.y0.a.Q);
                                var1_1.c(var5_18);
                            } else if (Arrays.equals((byte[])var13_4, ax.y0.a.S)) {
                                var1_1.write(47);
                                var1_1.c(var5_18);
                            }
                            ax.y0.b.e(var15_10, (OutputStream)var1_1, var6_20);
                            var4_17 = this.t0((c)var1_1);
                            break block29;
                        }
                        catch (Throwable var13_5) {
                            var1_1 = var2_2;
                            var2_2 = var13_5;
                            break block33;
                        }
                        catch (Exception var13_6) {
                            break block34;
                        }
                        while (true) {
                            var13_4 = new byte[4];
                            try {
                                var15_10.readFully((byte[])var13_4);
                                var12_19 = Arrays.equals((byte[])var13_4, ax.y0.a.V);
                                var4_17 = var12_19 ^ 1;
                            }
                            catch (EOFException var14_16) {
                                var4_17 = 1;
                            }
                            if (var4_17 != 0) {
                                var4_17 = this.t0((c)var1_1);
                                break;
                            }
                            this.h(var15_10, (c)var1_1, (byte[])var13_4);
                        }
                    }
                }
                ax.y0.b.e(var15_10, (OutputStream)var1_1, var11_13 + 8 - var15_10.b());
                var5_18 = var2_2.size();
                var1_1 = ax.y0.a.O;
                var16_11.c(var5_18 + ((Object)var1_1).length);
                var16_11.write((byte[])var1_1);
                if (var4_17 != -1) {
                    this.q = var16_11.q.size() + var4_17;
                }
                var2_2.writeTo(var16_11);
                ax.y0.b.d(var15_10, var16_11);
                ax.y0.b.b((Closeable)var2_2);
                return;
                catch (Throwable var2_3) {
                    break block33;
                }
                catch (Exception var13_7) {
                    var2_2 = var14_15;
                }
            }
            var1_1 = var2_2;
            {
                var1_1 = var2_2;
                var14_15 = new IOException("Failed to save WebP file", (Throwable)var13_8);
                var1_1 = var2_2;
                throw var14_15;
            }
        }
        ax.y0.b.b((Closeable)var1_1);
        throw var2_2;
    }

    private void n0(b b8) throws IOException {
        HashMap<String, d> hashMap;
        block1: {
            block4: {
                block2: {
                    block3: {
                        int n8;
                        hashMap = this.f[4];
                        d d8 = hashMap.get("Compression");
                        if (d8 == null) break block1;
                        this.p = n8 = d8.m(this.i);
                        if (n8 == 1) break block2;
                        if (n8 == 6) break block3;
                        if (n8 == 7) break block2;
                        break block4;
                    }
                    this.G(b8, hashMap);
                    return;
                }
                if (this.Q(hashMap)) {
                    this.H(b8, hashMap);
                }
            }
            return;
        }
        this.p = 6;
        this.G(b8, hashMap);
    }

    private static boolean o0(int n8) {
        return n8 != 4 && n8 != 9 && n8 != 13 && n8 != 14;
        {
        }
    }

    private d p(String object) {
        if (object != null) {
            String string = object;
            if ("ISOSpeedRatings".equals(object)) {
                if (x) {
                    Log.d((String)"ExifInterface", (String)"getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                string = "PhotographicSensitivity";
            }
            if ("Xmp".equals(string) && ax.y0.a.E(this.d) == 2 && (object = this.v) != null) {
                return object;
            }
            for (int i8 = 0; i8 < l0.length; ++i8) {
                object = this.f[i8].get(string);
                if (object == null) continue;
                return object;
            }
            if ("Xmp".equals(string) && (object = this.v) != null) {
                return object;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    private void p0(int n8, int n9) throws IOException {
        if (!this.f[n8].isEmpty() && !this.f[n9].isEmpty()) {
            HashMap<String, d>[] hashMapArray = this.f[n8].get("ImageLength");
            Object object = this.f[n8].get("ImageWidth");
            d d8 = this.f[n9].get("ImageLength");
            d d9 = this.f[n9].get("ImageWidth");
            if (hashMapArray != null && object != null) {
                if (d8 != null && d9 != null) {
                    int n10 = hashMapArray.m(this.i);
                    int n11 = ((d)object).m(this.i);
                    int n12 = d8.m(this.i);
                    int n13 = d9.m(this.i);
                    if (n10 < n12 && n11 < n13) {
                        hashMapArray = this.f;
                        object = hashMapArray[n8];
                        hashMapArray[n8] = hashMapArray[n9];
                        hashMapArray[n9] = object;
                        if (n8 == 0) {
                            this.g = true;
                            return;
                        }
                    }
                } else if (x) {
                    Log.d((String)"ExifInterface", (String)"Second image does not contain valid size information");
                    return;
                }
            } else if (x) {
                Log.d((String)"ExifInterface", (String)"First image does not contain valid size information");
                return;
            }
        } else if (x) {
            Log.d((String)"ExifInterface", (String)"Cannot perform swap since only one image data exists");
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void q(g object, int n8) throws IOException {
        Throwable throwable222;
        MediaMetadataRetriever mediaMetadataRetriever;
        block21: {
            block20: {
                String string;
                int n9 = Build.VERSION.SDK_INT;
                if (n9 < 28) throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
                if (n8 == 15) {
                    if (n9 < 31) throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
                }
                mediaMetadataRetriever = new MediaMetadataRetriever();
                AutoCloseable autoCloseable = new AutoCloseable(this, (g)object){
                    final g c0;
                    final a d0;
                    long q;
                    {
                        this.d0 = a8;
                        this.c0 = g8;
                    }

                    @Override
                    public void close() throws IOException {
                    }

                    public long getSize() throws IOException {
                        return -1L;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public int readAt(long l8, byte[] byArray, int n8, int n9) throws IOException {
                        if (n9 == 0) {
                            return 0;
                        }
                        if (l8 < 0L) {
                            return -1;
                        }
                        try {
                            long l9 = this.q;
                            if (l9 != l8) {
                                if (l9 >= 0L && l8 >= l9 + (long)this.c0.available()) {
                                    return -1;
                                }
                                this.c0.g(l8);
                                this.q = l8;
                            }
                            int n10 = n9;
                            if (n9 > this.c0.available()) {
                                n10 = this.c0.available();
                            }
                            if ((n8 = this.c0.read(byArray, n8, n10)) >= 0) {
                                this.q += (long)n8;
                                return n8;
                            }
                        }
                        catch (IOException iOException) {}
                        this.q = -1L;
                        return -1;
                    }
                };
                b.a.a(mediaMetadataRetriever, (MediaDataSource)autoCloseable);
                String string2 = mediaMetadataRetriever.extractMetadata(33);
                Object object2 = mediaMetadataRetriever.extractMetadata(34);
                String string3 = mediaMetadataRetriever.extractMetadata(26);
                autoCloseable = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(string3)) {
                    autoCloseable = mediaMetadataRetriever.extractMetadata(29);
                    string = mediaMetadataRetriever.extractMetadata(30);
                    string3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(autoCloseable)) {
                    autoCloseable = mediaMetadataRetriever.extractMetadata(18);
                    string = mediaMetadataRetriever.extractMetadata(19);
                    string3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    autoCloseable = null;
                    string3 = null;
                    string = null;
                }
                if (autoCloseable != null) {
                    this.f[0].put("ImageWidth", ax.y0.a$d.j(Integer.parseInt((String)((Object)autoCloseable)), this.i));
                }
                if (string != null) {
                    this.f[0].put("ImageLength", ax.y0.a$d.j(Integer.parseInt(string), this.i));
                }
                if (string3 != null) {
                    n8 = Integer.parseInt(string3);
                    n8 = n8 != 90 ? (n8 != 180 ? (n8 != 270 ? 1 : 8) : 3) : 6;
                    this.f[0].put("Orientation", ax.y0.a$d.j(n8, this.i));
                }
                if (string2 != null && object2 != null) {
                    n8 = Integer.parseInt(string2);
                    n9 = Integer.parseInt((String)object2);
                    if (n9 <= 6) {
                        object = new IOException("Invalid exif length");
                        throw object;
                    }
                    ((g)object).g(n8);
                    object2 = new byte[6];
                    ((b)object).readFully((byte[])object2);
                    if (!Arrays.equals((byte[])object2, s0)) {
                        object = new IOException("Invalid identifier");
                        throw object;
                    }
                    object2 = new byte[n9 - 6];
                    ((b)object).readFully((byte[])object2);
                    this.q = n8 + 6;
                    this.a0((byte[])object2, 0);
                }
                object2 = mediaMetadataRetriever.extractMetadata(41);
                string2 = mediaMetadataRetriever.extractMetadata(42);
                if (object2 != null && string2 != null) {
                    n9 = Integer.parseInt((String)object2);
                    n8 = Integer.parseInt(string2);
                    long l8 = n9;
                    ((g)object).g(l8);
                    object2 = new byte[n8];
                    ((b)object).readFully((byte[])object2);
                    this.v = object = new d(1, n8, l8, (byte[])object2);
                    this.w = true;
                }
                if (!x) break block20;
                object = new StringBuilder();
                ((StringBuilder)object).append("Heif meta: ");
                ((StringBuilder)object).append((String)((Object)autoCloseable));
                ((StringBuilder)object).append("x");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(", rotation ");
                ((StringBuilder)object).append(string3);
                Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
            }
            try {
                mediaMetadataRetriever.release();
                return;
            }
            catch (IOException iOException) {
                return;
            }
            catch (Throwable throwable222) {
                break block21;
            }
            catch (RuntimeException runtimeException) {}
            object = new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", runtimeException);
            throw object;
        }
        try {
            mediaMetadataRetriever.release();
        }
        catch (IOException iOException) {
            throw throwable222;
        }
        throw throwable222;
    }

    private static void q0(CRC32 cRC32, int n8) {
        cRC32.update(n8 >>> 24);
        cRC32.update(n8 >>> 16);
        cRC32.update(n8 >>> 8);
        cRC32.update(n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void r(b object, int n8, int n9) throws IOException {
        Object object2;
        if (x) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("getJpegAttributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        ((b)object).e(ByteOrder.BIG_ENDIAN);
        int n10 = ((b)object).readByte();
        if (n10 != -1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid marker: ");
            ((StringBuilder)object).append(Integer.toHexString(n10 & 0xFF));
            throw new IOException(((StringBuilder)object).toString());
        }
        if (((b)object).readByte() != -40) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid marker: ");
            ((StringBuilder)object).append(Integer.toHexString(n10 & 0xFF));
            throw new IOException(((StringBuilder)object).toString());
        }
        n10 = 2;
        while (true) {
            int n11;
            block27: {
                int n12;
                block28: {
                    block25: {
                        block26: {
                            if ((n11 = ((b)object).readByte()) != -1) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Invalid marker:");
                                ((StringBuilder)object).append(Integer.toHexString(n11 & 0xFF));
                                throw new IOException(((StringBuilder)object).toString());
                            }
                            byte by = ((b)object).readByte();
                            boolean bl = x;
                            if (bl) {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("Found JPEG segment indicator: ");
                                ((StringBuilder)object2).append(Integer.toHexString(by & 0xFF));
                                Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                            }
                            if (by == -39 || by == -38) break;
                            int n13 = ((b)object).readUnsignedShort();
                            n12 = n13 - 2;
                            n11 = n10 + 4;
                            if (bl) {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("JPEG segment: ");
                                ((StringBuilder)object2).append(Integer.toHexString(by & 0xFF));
                                ((StringBuilder)object2).append(" (length: ");
                                ((StringBuilder)object2).append(n13);
                                ((StringBuilder)object2).append(")");
                                Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                            }
                            if (n12 < 0) {
                                throw new IOException("Invalid length");
                            }
                            if (by == -31) break block25;
                            if (by == -2) break block26;
                            block0 : switch (by) {
                                default: {
                                    switch (by) {
                                        default: {
                                            switch (by) {
                                                default: {
                                                    switch (by) {
                                                        default: {
                                                            n10 = n12;
                                                            break block0;
                                                        }
                                                        case -51: 
                                                        case -50: 
                                                        case -49: 
                                                    }
                                                }
                                                case -55: 
                                                case -54: 
                                                case -53: 
                                            }
                                            break;
                                        }
                                        case -59: 
                                        case -58: 
                                        case -57: 
                                    }
                                }
                                case -64: 
                                case -63: 
                                case -62: 
                                case -61: {
                                    ((b)object).f(1);
                                    HashMap<String, d> hashMap = this.f[n9];
                                    object2 = n9 != 4 ? "ImageLength" : "ThumbnailImageLength";
                                    hashMap.put((String)object2, ax.y0.a$d.f(((b)object).readUnsignedShort(), this.i));
                                    HashMap<String, d> hashMap2 = this.f[n9];
                                    object2 = n9 != 4 ? "ImageWidth" : "ThumbnailImageWidth";
                                    hashMap2.put((String)object2, ax.y0.a$d.f(((b)object).readUnsignedShort(), this.i));
                                    n10 = n13 - 7;
                                    break;
                                }
                            }
                            break block27;
                        }
                        object2 = new byte[n12];
                        ((b)object).readFully((byte[])object2);
                        n10 = n11;
                        if (this.i("UserComment") == null) {
                            this.f[1].put("UserComment", ax.y0.a$d.e(new String((byte[])object2, r0)));
                            n10 = n11;
                        }
                        break block28;
                    }
                    object2 = new byte[n12];
                    ((b)object).readFully((byte[])object2);
                    byte[] byArray = s0;
                    if (ax.y0.b.g((byte[])object2, byArray)) {
                        object2 = Arrays.copyOfRange((byte[])object2, byArray.length, n12);
                        this.q = n8 + n11 + byArray.length;
                        this.a0((byte[])object2, n9);
                        this.n0(new b((byte[])object2));
                    } else {
                        byte[] byArray2 = t0;
                        if (ax.y0.b.g((byte[])object2, byArray2)) {
                            n10 = byArray2.length;
                            object2 = Arrays.copyOfRange((byte[])object2, byArray2.length, n12);
                            this.v = new d(1, ((Object)object2).length, n11 + n10, (byte[])object2);
                            this.w = true;
                        }
                    }
                    n10 = n11 + n12;
                }
                n12 = 0;
                n11 = n10;
                n10 = n12;
            }
            if (n10 < 0) {
                throw new IOException("Invalid length");
            }
            ((b)object).f(n10);
            n10 = n11 + n10;
        }
        ((b)object).e(this.i);
    }

    private void r0(g object, int n8) throws IOException {
        d d8;
        d d9;
        d d10;
        Object object2;
        block5: {
            block9: {
                block8: {
                    d d11;
                    block6: {
                        block7: {
                            d11 = this.f[n8].get("DefaultCropSize");
                            object2 = this.f[n8].get("SensorTopBorder");
                            d10 = this.f[n8].get("SensorLeftBorder");
                            d9 = this.f[n8].get("SensorBottomBorder");
                            d8 = this.f[n8].get("SensorRightBorder");
                            if (d11 == null) break block5;
                            if (d11.a != 5) break block6;
                            object = (f[])d11.o(this.i);
                            if (object == null || ((f[])object).length != 2) break block7;
                            object2 = ax.y0.a$d.h(object[0], this.i);
                            object = ax.y0.a$d.h((f)object[1], this.i);
                            break block8;
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Invalid crop size values. cropSize=");
                        ((StringBuilder)object2).append(Arrays.toString(object));
                        Log.w((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                        return;
                    }
                    object = (int[])d11.o(this.i);
                    if (object == null || ((f[])object).length != 2) break block9;
                    object2 = ax.y0.a$d.j((int)object[0], this.i);
                    object = ax.y0.a$d.j((int)object[1], this.i);
                }
                this.f[n8].put("ImageWidth", (d)object2);
                this.f[n8].put("ImageLength", (d)object);
                return;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Invalid crop size values. cropSize=");
            ((StringBuilder)object2).append(Arrays.toString((int[])object));
            Log.w((String)"ExifInterface", (String)((StringBuilder)object2).toString());
            return;
        }
        if (object2 != null && d10 != null && d9 != null && d8 != null) {
            int n9 = ((d)object2).m(this.i);
            int n10 = d9.m(this.i);
            int n11 = d8.m(this.i);
            int n12 = d10.m(this.i);
            if (n10 > n9 && n11 > n12) {
                object = ax.y0.a$d.j(n10 - n9, this.i);
                object2 = ax.y0.a$d.j(n11 - n12, this.i);
                this.f[n8].put("ImageLength", (d)object);
                this.f[n8].put("ImageWidth", (d)object2);
            }
            return;
        }
        this.g0((g)object, n8);
    }

    private void s0() throws IOException {
        this.p0(0, 5);
        this.p0(0, 4);
        this.p0(5, 4);
        HashMap<String, d>[] hashMapArray = this.f[1].get("PixelXDimension");
        d d8 = this.f[1].get("PixelYDimension");
        if (hashMapArray != null && d8 != null) {
            this.f[0].put("ImageWidth", (d)hashMapArray);
            this.f[0].put("ImageLength", d8);
        }
        if (this.f[4].isEmpty() && this.T(this.f[5])) {
            hashMapArray = this.f;
            hashMapArray[4] = hashMapArray[5];
            hashMapArray[5] = new HashMap();
        }
        if (!this.T(this.f[4])) {
            Log.d((String)"ExifInterface", (String)"No image meets the size requirements of a thumbnail image.");
        }
        this.d0(0, "ThumbnailOrientation", "Orientation");
        this.d0(0, "ThumbnailImageLength", "ImageLength");
        this.d0(0, "ThumbnailImageWidth", "ImageWidth");
        this.d0(5, "ThumbnailOrientation", "Orientation");
        this.d0(5, "ThumbnailImageLength", "ImageLength");
        this.d0(5, "ThumbnailImageWidth", "ImageWidth");
        if (this.g) {
            this.e0(4, "Orientation", "ThumbnailOrientation");
        } else {
            this.d0(4, "Orientation", "ThumbnailOrientation");
        }
        this.d0(4, "ImageLength", "ThumbnailImageLength");
        this.d0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int t(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] byArray = new byte[5000];
        ((InputStream)bufferedInputStream).read(byArray);
        bufferedInputStream.reset();
        if (ax.y0.a.K(byArray)) {
            return 4;
        }
        if (this.N(byArray)) {
            return 9;
        }
        int n8 = this.J(byArray);
        if (n8 != 0) {
            return n8;
        }
        if (this.L(byArray)) {
            return 7;
        }
        if (this.O(byArray)) {
            return 10;
        }
        if (this.M(byArray)) {
            return 13;
        }
        if (this.U(byArray)) {
            return 14;
        }
        return 0;
    }

    private int t0(c object) throws IOException {
        int n8;
        block43: {
            int n9;
            int n10;
            int[] nArray;
            Object object3;
            block42: {
                block41: {
                    object3 = l0;
                    nArray = new int[((e[][])object3).length];
                    object3 = new int[((e[][])object3).length];
                    e[] object22 = m0;
                    n10 = object22.length;
                    for (n8 = 0; n8 < n10; ++n8) {
                        this.c0(object22[n8].b);
                    }
                    if (this.j) {
                        if (this.k) {
                            this.c0("StripOffsets");
                            this.c0("StripByteCounts");
                        } else {
                            this.c0("JPEGInterchangeFormat");
                            this.c0("JPEGInterchangeFormatLength");
                        }
                    }
                    for (n8 = 0; n8 < l0.length; ++n8) {
                        Iterator<Map.Entry<String, d>> iterator = this.f[n8].entrySet().iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().getValue() != null) continue;
                            iterator.remove();
                        }
                    }
                    if (!this.f[1].isEmpty()) {
                        this.f[0].put(ax.y0.a.m0[1].b, ax.y0.a$d.f(0L, this.i));
                    }
                    if (!this.f[2].isEmpty()) {
                        this.f[0].put(ax.y0.a.m0[2].b, ax.y0.a$d.f(0L, this.i));
                    }
                    if (!this.f[3].isEmpty()) {
                        this.f[1].put(ax.y0.a.m0[3].b, ax.y0.a$d.f(0L, this.i));
                    }
                    if (this.j) {
                        if (this.k) {
                            this.f[4].put("StripOffsets", ax.y0.a$d.j(0, this.i));
                            this.f[4].put("StripByteCounts", ax.y0.a$d.j(this.n, this.i));
                        } else {
                            this.f[4].put("JPEGInterchangeFormat", ax.y0.a$d.f(0L, this.i));
                            this.f[4].put("JPEGInterchangeFormatLength", ax.y0.a$d.f(this.n, this.i));
                        }
                    }
                    for (n8 = 0; n8 < l0.length; ++n8) {
                        Iterator<Map.Entry<String, d>> iterator = this.f[n8].entrySet().iterator();
                        n10 = 0;
                        while (iterator.hasNext()) {
                            n9 = iterator.next().getValue().p();
                            if (n9 <= 4) continue;
                            n10 += n9;
                        }
                        object3[n8] = object3[n8] + n10;
                    }
                    n8 = 8;
                    for (n10 = 0; n10 < l0.length; ++n10) {
                        n9 = n8;
                        if (!this.f[n10].isEmpty()) {
                            nArray[n10] = n8;
                            n9 = n8 + (this.f[n10].size() * 12 + 6 + object3[n10]);
                        }
                        n8 = n9;
                    }
                    n10 = n8;
                    if (this.j) {
                        if (this.k) {
                            this.f[4].put("StripOffsets", ax.y0.a$d.j(n8, this.i));
                        } else {
                            this.f[4].put("JPEGInterchangeFormat", ax.y0.a$d.f(n8, this.i));
                        }
                        this.m = n8;
                        n10 = n8 + this.n;
                    }
                    n8 = n10;
                    if (this.d == 4) {
                        n8 = n10 + 8;
                    }
                    if (x) {
                        for (n10 = 0; n10 < l0.length; ++n10) {
                            Log.d((String)"ExifInterface", (String)String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", n10, nArray[n10], this.f[n10].size(), (int)object3[n10], n8));
                        }
                    }
                    if (!this.f[1].isEmpty()) {
                        this.f[0].put(ax.y0.a.m0[1].b, ax.y0.a$d.f(nArray[1], this.i));
                    }
                    if (!this.f[2].isEmpty()) {
                        this.f[0].put(ax.y0.a.m0[2].b, ax.y0.a$d.f(nArray[2], this.i));
                    }
                    if (!this.f[3].isEmpty()) {
                        this.f[1].put(ax.y0.a.m0[3].b, ax.y0.a$d.f(nArray[3], this.i));
                    }
                    if ((n10 = this.d) == 4) break block41;
                    if (n10 != 13) {
                        if (n10 == 14) {
                            ((c)object).write(P);
                            ((c)object).c(n8);
                        }
                    } else {
                        ((c)object).c(n8);
                        ((c)object).c(1700284774);
                    }
                    break block42;
                }
                if (n8 > 65535) break block43;
                ((c)object).f(n8);
                ((c)object).write(s0);
            }
            int n11 = ((c)object).q.size();
            short s8 = this.i == ByteOrder.BIG_ENDIAN ? (short)19789 : 18761;
            ((c)object).d(s8);
            ((c)object).a(this.i);
            ((c)object).f(42);
            ((c)object).e(8L);
            for (n10 = 0; n10 < l0.length; ++n10) {
                if (this.f[n10].isEmpty()) continue;
                ((c)object).f(this.f[n10].size());
                n9 = nArray[n10] + 2 + this.f[n10].size() * 12 + 4;
                for (Map.Entry entry : this.f[n10].entrySet()) {
                    int n12;
                    int n13 = ax.y0.a.o0[n10].get(entry.getKey()).a;
                    d d8 = (d)entry.getValue();
                    ((c)object).f(n13);
                    ((c)object).f(d8.a);
                    ((c)object).c(d8.b);
                    if (n12 > 4) {
                        ((c)object).e(n9);
                        n9 += n12;
                        continue;
                    }
                    ((c)object).write(d8.d);
                    if (n12 >= 4) continue;
                    for (n12 = d8.p(); n12 < 4; ++n12) {
                        ((c)object).b(0);
                    }
                }
                if (n10 == 0 && !this.f[4].isEmpty()) {
                    ((c)object).e(nArray[4]);
                } else {
                    ((c)object).e(0L);
                }
                Iterator<Map.Entry<String, d>> iterator = this.f[n10].entrySet().iterator();
                while (iterator.hasNext()) {
                    object3 = iterator.next().getValue().d;
                    if (((e[][])object3).length <= 4) continue;
                    ((c)object).write((byte[])object3, 0, ((e[][])object3).length);
                }
            }
            if (this.j) {
                ((c)object).write(this.C());
            }
            if (this.d == 14 && n8 % 2 == 1) {
                ((c)object).b(0);
            }
            ((c)object).a(ByteOrder.BIG_ENDIAN);
            return n11;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Size of exif data (");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private void u(g object) throws IOException {
        this.x((g)object);
        object = this.f[1].get("MakerNote");
        if (object != null) {
            g g8 = new g(((d)object).d);
            g8.e(this.i);
            byte[] byArray = J;
            byte[] byArray2 = new byte[byArray.length];
            g8.readFully(byArray2);
            g8.g(0L);
            object = K;
            Object object2 = new byte[((Object)object).length];
            g8.readFully((byte[])object2);
            if (Arrays.equals(byArray2, byArray)) {
                g8.g(8L);
            } else if (Arrays.equals((byte[])object2, (byte[])object)) {
                g8.g(12L);
            }
            this.b0(g8, 6);
            object2 = this.f[7].get("PreviewImageStart");
            object = this.f[7].get("PreviewImageLength");
            if (object2 != null && object != null) {
                this.f[5].put("JPEGInterchangeFormat", (d)object2);
                this.f[5].put("JPEGInterchangeFormatLength", (d)object);
            }
            if ((object = this.f[8].get("AspectFrame")) != null) {
                if ((object = (Object)((int[])((d)object).o(this.i))) != null && ((Object)object).length == 4) {
                    Object object3;
                    Object object4;
                    Object object5 = object[2];
                    Object object6 = object[0];
                    if (object5 > object6 && (object4 = object[3]) > (object3 = object[1])) {
                        reference var3_13;
                        reference var2_16;
                        reference var4_9 = object5 - object6 + true;
                        reference var5_7 = object4 - object3 + true;
                        reference var3_11 = var4_9;
                        reference var2_15 = var5_7;
                        if (var4_9 < var5_7) {
                            reference var3_12 = var4_9 + var5_7;
                            var2_16 = var3_12 - var5_7;
                            var3_13 = var3_12 - var2_16;
                        }
                        object2 = ax.y0.a$d.j((int)var3_13, this.i);
                        object = ax.y0.a$d.j((int)var2_16, this.i);
                        this.f[0].put("ImageWidth", (d)object2);
                        this.f[0].put("ImageLength", (d)object);
                        return;
                    }
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Invalid aspect frame values. frame=");
                    ((StringBuilder)object2).append(Arrays.toString((int[])object));
                    Log.w((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                }
            }
        }
    }

    private void u0(c c8) throws IOException {
        Object object = new ByteArrayOutputStream();
        int n8 = this.t0(new c((OutputStream)object, ByteOrder.BIG_ENDIAN));
        this.q = c8.q.size() + n8;
        byte[] byArray = ((ByteArrayOutputStream)object).toByteArray();
        c8.write(byArray);
        object = new CRC32();
        ((CRC32)object).update(byArray, 4, byArray.length - 4);
        c8.c((int)((CRC32)object).getValue());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void v(b object) throws IOException {
        Object object2;
        if (x) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("getPngAttributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        ((b)object).e(ByteOrder.BIG_ENDIAN);
        int n8 = ((b)object).b();
        ((b)object).f(L.length);
        int n9 = 0;
        boolean bl = false;
        while (true) {
            boolean bl2;
            int n10;
            Object object3;
            int n11;
            int n12;
            int n13;
            block18: {
                block17: {
                    if (n9 != 0 && bl) break block17;
                    try {
                        n13 = ((b)object).readInt();
                        n12 = ((b)object).readInt();
                        n11 = ((b)object).b();
                        if (((b)object).b() - n8 == 16 && n12 != 1229472850) {
                            object = new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                            throw object;
                        }
                    }
                    catch (EOFException eOFException) {
                        throw new IOException("Encountered corrupt PNG file.", eOFException);
                    }
                    if (n12 != 1229278788) break block18;
                }
                this.w = bl;
                return;
            }
            if (n12 == 1700284774 && n9 == 0) {
                this.q = ((b)object).b() - n8;
                object3 = new byte[n13];
                ((b)object).readFully((byte[])object3);
                n9 = ((b)object).readInt();
                object2 = new CRC32();
                ax.y0.a.q0((CRC32)object2, n12);
                object2.update((byte[])object3);
                if ((int)((CRC32)object2).getValue() != n9) {
                    object3 = new IOException;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                    ((StringBuilder)object).append(n9);
                    ((StringBuilder)object).append(", calculated CRC value: ");
                    ((StringBuilder)object).append(((CRC32)object2).getValue());
                    object3(((StringBuilder)object).toString());
                    throw object3;
                }
                this.a0((byte[])object3, 0);
                this.s0();
                object2 = new b((byte[])object3);
                this.n0((b)object2);
                n10 = 1;
                bl2 = bl;
            } else {
                n10 = n9;
                bl2 = bl;
                if (n12 == 1767135348) {
                    n10 = n9;
                    bl2 = bl;
                    if (!bl) {
                        object3 = M;
                        n10 = n9;
                        bl2 = bl;
                        if (n13 >= ((byte[])object3).length) {
                            n12 = ((byte[])object3).length;
                            object2 = new byte[n12];
                            ((b)object).readFully((byte[])object2);
                            n10 = n9;
                            bl2 = bl;
                            if (Arrays.equals((byte[])object2, object3)) {
                                n10 = ((b)object).b();
                                n12 = n13 - n12;
                                object3 = new byte[n12];
                                ((b)object).readFully((byte[])object3);
                                this.v = object2 = new d(1, n12, n10 - n8, (byte[])object3);
                                bl2 = true;
                                n10 = n9;
                            }
                        }
                    }
                }
            }
            ((b)object).f(n11 + n13 + 4 - ((b)object).b());
            n9 = n10;
            bl = bl2;
        }
    }

    private void v0(c c8) throws IOException {
        c8.c(this.v.d.length + 22);
        CRC32 cRC32 = new CRC32();
        c8.c(1767135348);
        ax.y0.a.q0(cRC32, 1767135348);
        byte[] byArray = M;
        c8.write(byArray);
        cRC32.update(byArray);
        c8.write(this.v.d);
        cRC32.update(this.v.d);
        c8.c((int)cRC32.getValue());
        this.w = true;
    }

    private void w(b object) throws IOException {
        Object object2;
        boolean bl = x;
        if (bl) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("getRafAttributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        ((b)object).f(84);
        byte[] byArray = new byte[4];
        object2 = new byte[4];
        byte[] byArray2 = new byte[4];
        ((b)object).readFully(byArray);
        ((b)object).readFully((byte[])object2);
        ((b)object).readFully(byArray2);
        int n8 = ByteBuffer.wrap(byArray).getInt();
        int n9 = ByteBuffer.wrap((byte[])object2).getInt();
        int n10 = ByteBuffer.wrap(byArray2).getInt();
        object2 = new byte[n9];
        ((b)object).f(n8 - ((b)object).b());
        ((b)object).readFully((byte[])object2);
        this.r(new b((byte[])object2), n8, 5);
        ((b)object).f(n10 - ((b)object).b());
        ((b)object).e(ByteOrder.BIG_ENDIAN);
        n9 = ((b)object).readInt();
        if (bl) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("numberOfDirectoryEntry: ");
            ((StringBuilder)object2).append(n9);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        for (n8 = 0; n8 < n9; ++n8) {
            n10 = ((b)object).readUnsignedShort();
            int n11 = ((b)object).readUnsignedShort();
            if (n10 == ax.y0.a.g0.a) {
                n8 = ((b)object).readShort();
                n9 = ((b)object).readShort();
                object = ax.y0.a$d.j(n8, this.i);
                object2 = ax.y0.a$d.j(n9, this.i);
                this.f[0].put("ImageLength", (d)object);
                this.f[0].put("ImageWidth", (d)object2);
                if (!x) break;
                object = new StringBuilder();
                ((StringBuilder)object).append("Updated to length: ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(", width: ");
                ((StringBuilder)object).append(n9);
                Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
                return;
            }
            ((b)object).f(n11);
        }
    }

    private void x(g object) throws IOException {
        this.X((b)object);
        this.b0((g)object, 0);
        this.r0((g)object, 0);
        this.r0((g)object, 5);
        this.r0((g)object, 4);
        this.s0();
        if (this.d == 8 && (object = this.f[1].get("MakerNote")) != null) {
            object = new g(((d)object).d);
            ((b)object).e(this.i);
            ((b)object).f(6);
            this.b0((g)object, 9);
            object = this.f[9].get("ColorSpace");
            if (object != null) {
                this.f[1].put("ColorSpace", (d)object);
            }
        }
    }

    private void z(g object) throws IOException {
        Object object2;
        if (x) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("getRw2Attributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        this.x((g)object);
        object = this.f[0].get("JpgFromRaw");
        if (object != null) {
            this.r(new b(((d)object).d), (int)((d)object).c, 5);
        }
        object2 = this.f[0].get("ISO");
        object = this.f[1].get("PhotographicSensitivity");
        if (object2 != null && object == null) {
            this.f[1].put("PhotographicSensitivity", (d)object2);
        }
    }

    public byte[] B() {
        int n8 = this.p;
        if (n8 != 6 && n8 != 7) {
            return null;
        }
        return this.C();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] C() {
        block22: {
            block23: {
                var1_1 = this.j;
                var4_2 = null;
                if (!var1_1) {
                    return null;
                }
                var2_8 /* !! */  = this.o;
                if (var2_8 /* !! */  != null) {
                    return var2_8 /* !! */ ;
                }
                var2_8 /* !! */  = (byte[])this.c;
                if (var2_8 /* !! */  == null) ** GOTO lbl24
                try {
                    block24: {
                        if (!var2_8 /* !! */ .markSupported()) break block24;
                        var2_8 /* !! */ .reset();
                        ** GOTO lbl27
                    }
                    Log.d((String)"ExifInterface", (String)"Cannot read thumbnail from inputstream without mark/reset support");
                }
                catch (Throwable var3_12) {
                    block25: {
                        block21: {
                            var5_14 = null;
                            var6_15 = var2_8 /* !! */ ;
                            var2_8 /* !! */  = var3_12;
                            break block25;
lbl24:
                            // 1 sources

                            try {
                                block26: {
                                    if (this.a == null) break block26;
                                    var2_8 /* !! */  = new FileInputStream(this.a);
lbl27:
                                    // 2 sources

                                    var3_11 = null;
                                    break block21;
                                }
                                var2_8 /* !! */  = Os.dup((FileDescriptor)this.b);
                            }
                            catch (Throwable var2_9) {
                                var5_14 = null;
                                var3_11 = var4_2;
                                break block22;
                            }
                            Os.lseek((FileDescriptor)var2_8 /* !! */ , (long)0L, (int)OsConstants.SEEK_SET);
                            var4_2 = var3_11 = new FileInputStream((FileDescriptor)var2_8 /* !! */ );
                            var3_11 = var2_8 /* !! */ ;
                            var2_8 /* !! */  = var4_2;
                        }
                        var6_15 = var2_8 /* !! */ ;
                        var5_14 = var3_11;
                        var6_15 = var2_8 /* !! */ ;
                        var5_14 = var3_11;
                        var4_2 = new b((InputStream)var2_8 /* !! */ );
                        var6_15 = var2_8 /* !! */ ;
                        var5_14 = var3_11;
                        var4_2.f(this.m + this.q);
                        var6_15 = var2_8 /* !! */ ;
                        var5_14 = var3_11;
                        var7_16 = new byte[this.n];
                        var6_15 = var2_8 /* !! */ ;
                        var5_14 = var3_11;
                        var4_2.readFully(var7_16);
                        var6_15 = var2_8 /* !! */ ;
                        var5_14 = var3_11;
                        this.o = var7_16;
                        ax.y0.b.b((Closeable)var2_8 /* !! */ );
                        if (var3_11 != null) {
                            ax.y0.b.a((FileDescriptor)var3_11);
                        }
                        return var7_16;
                        catch (Throwable var3_13) {
                            var5_14 = var2_8 /* !! */ ;
                            var2_8 /* !! */  = var3_13;
                            var3_11 = var4_2;
                            break block22;
                        }
                        catch (Exception var4_6) {
                            var5_14 = null;
                            var3_11 = var2_8 /* !! */ ;
                            var2_8 /* !! */  = var5_14;
                            break block23;
                        }
                    }
lbl76:
                    // 2 sources

                    while (true) {
                        var3_11 = var6_15;
                        break block22;
                        break;
                    }
                }
                catch (Exception var4_3) {
                    var3_11 = null;
                    break block23;
                }
                ax.y0.b.b((Closeable)var2_8 /* !! */ );
                return null;
                catch (Exception var4_4) {
                    var2_8 /* !! */  = null;
                    var3_11 = null;
                    break block23;
                }
                catch (Throwable var2_10) {
                    ** continue;
                }
                catch (Exception var4_5) {}
            }
            var6_15 = var2_8 /* !! */ ;
            var5_14 = var3_11;
            {
                Log.d((String)"ExifInterface", (String)"Encountered exception while getting thumbnail", (Throwable)var4_7);
            }
            ax.y0.b.b((Closeable)var2_8 /* !! */ );
            if (var3_11 != null) {
                ax.y0.b.a((FileDescriptor)var3_11);
            }
            return null;
        }
        ax.y0.b.b(var3_11);
        if (var5_14 != null) {
            ax.y0.b.a(var5_14);
        }
        throw var2_8 /* !! */ ;
    }

    public void f0() {
        this.m0("Orientation", Integer.toString(1));
    }

    public void h0(int n8) {
        if (n8 % 90 == 0) {
            int n9 = this.l("Orientation", 1);
            List<Integer> list = y;
            boolean bl = list.contains(n9);
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            if (bl) {
                n10 = (list.indexOf(n9) + n8 / 90) % 4;
                n8 = n12;
                if (n10 < 0) {
                    n8 = 4;
                }
                n12 = list.get(n10 + n8);
            } else {
                list = z;
                n12 = n11;
                if (list.contains(n9)) {
                    n12 = (list.indexOf(n9) + n8 / 90) % 4;
                    n8 = n10;
                    if (n12 < 0) {
                        n8 = 4;
                    }
                    n12 = list.get(n12 + n8);
                }
            }
            this.m0("Orientation", Integer.toString(n12));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    public String i(String object) {
        if (object != null) {
            Object object2 = this.p((String)object);
            if (object2 == null) {
                return null;
            }
            if (((String)object).equals("GPSTimeStamp")) {
                int n8 = ((d)object2).a;
                if (n8 != 5 && n8 != 10) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("GPS Timestamp format is not rational. format=");
                    ((StringBuilder)object).append(((d)object2).a);
                    Log.w((String)"ExifInterface", (String)((StringBuilder)object).toString());
                    return null;
                }
                object = (f[])((d)object2).o(this.i);
                if (object != null && ((Object)object).length == 3) {
                    object2 = object[0];
                    int n9 = (int)((float)((f)object2).a / (float)((f)object2).b);
                    object2 = object[1];
                    n8 = (int)((float)((f)object2).a / (float)((f)object2).b);
                    object = object[2];
                    return String.format("%02d:%02d:%02d", n9, n8, (int)((float)((f)object).a / (float)((f)object).b));
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Invalid GPS Timestamp array. array=");
                ((StringBuilder)object2).append(Arrays.toString((Object[])object));
                Log.w((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                return null;
            }
            if (p0.contains(object)) {
                try {
                    object = Double.toString(((d)object2).l(this.i));
                    return object;
                }
                catch (NumberFormatException numberFormatException) {
                    return null;
                }
            }
            return ((d)object2).n(this.i);
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /*
     * Exception decompiling
     */
    public void i0() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [3, 2 : 161->186)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public byte[] j(String object) {
        if (object != null) {
            if ((object = this.p((String)object)) != null) {
                return ((d)object).d;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public double k(String object, double d8) {
        if (object == null) throw new NullPointerException("tag shouldn't be null");
        if ((object = this.p((String)object)) == null) {
            return d8;
        }
        try {
            return ((d)object).l(this.i);
        }
        catch (NumberFormatException numberFormatException) {
            return d8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int l(String object, int n8) {
        if (object == null) throw new NullPointerException("tag shouldn't be null");
        if ((object = this.p((String)object)) == null) {
            return n8;
        }
        try {
            return ((d)object).m(this.i);
        }
        catch (NumberFormatException numberFormatException) {
            return n8;
        }
    }

    public Long m() {
        return ax.y0.a.W(this.i("DateTime"), this.i("SubSecTime"), this.i("OffsetTime"));
    }

    public void m0(String object, String object2) {
        block42: {
            int n8;
            int n9;
            String[] stringArray;
            Object object3;
            block43: {
                block45: {
                    block44: {
                        object3 = object;
                        object = object2;
                        if (object3 == null) break block42;
                        stringArray = object3;
                        if ("ISOSpeedRatings".equals(object3)) {
                            if (x) {
                                Log.d((String)"ExifInterface", (String)"setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                            }
                            stringArray = "PhotographicSensitivity";
                        }
                        object3 = "/";
                        object2 = object;
                        if (object == null) break block43;
                        if (p0.contains(stringArray) && !((String)object).contains("/")) {
                            try {
                                object2 = ax.y0.a$f.b(Double.parseDouble((String)object)).toString();
                            }
                            catch (NumberFormatException numberFormatException) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid value for ");
                                stringBuilder.append((String)stringArray);
                                stringBuilder.append(" : ");
                                stringBuilder.append((String)object);
                                Log.w((String)"ExifInterface", (String)stringBuilder.toString());
                                return;
                            }
                        }
                        if (!stringArray.equals("GPSTimeStamp")) break block44;
                        object2 = v0.matcher((CharSequence)object);
                        if (!((Matcher)object2).find()) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Invalid value for ");
                            ((StringBuilder)object2).append((String)stringArray);
                            ((StringBuilder)object2).append(" : ");
                            ((StringBuilder)object2).append((String)object);
                            Log.w((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                            return;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append(Integer.parseInt(((Matcher)object2).group(1)));
                        ((StringBuilder)object).append("/1,");
                        ((StringBuilder)object).append(Integer.parseInt(((Matcher)object2).group(2)));
                        ((StringBuilder)object).append("/1,");
                        ((StringBuilder)object).append(Integer.parseInt(((Matcher)object2).group(3)));
                        ((StringBuilder)object).append("/1");
                        object2 = ((StringBuilder)object).toString();
                        break block43;
                    }
                    if ("DateTime".equals(stringArray) || "DateTimeOriginal".equals(stringArray)) break block45;
                    object2 = object;
                    if (!"DateTimeDigitized".equals(stringArray)) break block43;
                }
                boolean bl = w0.matcher((CharSequence)object).find();
                boolean bl2 = x0.matcher((CharSequence)object).find();
                if (((String)object).length() == 19 && (bl || bl2)) {
                    object2 = object;
                    if (bl2) {
                        object2 = ((String)object).replaceAll("-", ":");
                    }
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Invalid value for ");
                    ((StringBuilder)object2).append((String)stringArray);
                    ((StringBuilder)object2).append(" : ");
                    ((StringBuilder)object2).append((String)object);
                    Log.w((String)"ExifInterface", (String)((StringBuilder)object2).toString());
                    return;
                }
            }
            if ("Xmp".equals(stringArray)) {
                n9 = !this.f[0].containsKey("Xmp") && !this.f[5].containsKey("Xmp") ? 0 : 1;
                n8 = ax.y0.a.E(this.d);
                if (n8 == 2 && (this.v != null || n9 == 0) || n8 == 3 && n9 == 0) {
                    object = object2 != null ? ax.y0.a$d.a((String)object2) : null;
                    this.v = object;
                    return;
                }
            }
            object = object3;
            block12: for (n8 = 0; n8 < l0.length; ++n8) {
                Object object4;
                Object object5;
                e e8;
                if (n8 == 4 && !this.j || (e8 = o0[n8].get(stringArray)) == null) continue;
                if (object2 == null) {
                    this.f[n8].remove(stringArray);
                    continue;
                }
                Pair<Integer, Integer> pair = ax.y0.a.F((String)object2);
                if (e8.c != (Integer)pair.first && e8.c != (Integer)pair.second) {
                    n9 = e8.d;
                    if (n9 != -1 && (n9 == (Integer)pair.first || e8.d == (Integer)pair.second)) {
                        n9 = e8.d;
                    } else {
                        n9 = e8.c;
                        if (n9 != 1 && n9 != 7 && n9 != 2) {
                            if (!x) continue;
                            object5 = new StringBuilder();
                            ((StringBuilder)object5).append("Given tag (");
                            ((StringBuilder)object5).append((String)stringArray);
                            ((StringBuilder)object5).append(") value didn't match with one of expected formats: ");
                            String[] stringArray2 = Y;
                            ((StringBuilder)object5).append(stringArray2[e8.c]);
                            n9 = e8.d;
                            object4 = "";
                            if (n9 == -1) {
                                object3 = "";
                            } else {
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append(", ");
                                ((StringBuilder)object3).append(stringArray2[e8.d]);
                                object3 = ((StringBuilder)object3).toString();
                            }
                            ((StringBuilder)object5).append((String)object3);
                            ((StringBuilder)object5).append(" (guess: ");
                            ((StringBuilder)object5).append(stringArray2[(Integer)pair.first]);
                            if ((Integer)pair.second == -1) {
                                object3 = object4;
                            } else {
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append(", ");
                                ((StringBuilder)object3).append(stringArray2[(Integer)pair.second]);
                                object3 = ((StringBuilder)object3).toString();
                            }
                            ((StringBuilder)object5).append((String)object3);
                            ((StringBuilder)object5).append(")");
                            Log.d((String)"ExifInterface", (String)((StringBuilder)object5).toString());
                            continue;
                        }
                    }
                } else {
                    n9 = e8.c;
                }
                switch (n9) {
                    default: {
                        if (!x) continue block12;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Data format isn't one of expected formats: ");
                        ((StringBuilder)object3).append(n9);
                        Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                        continue block12;
                    }
                    case 12: {
                        object4 = ((String)object2).split(",", -1);
                        object3 = new double[((String[])object4).length];
                        for (n9 = 0; n9 < ((Object[])object4).length; ++n9) {
                            object3[n9] = Double.parseDouble((String)object4[n9]);
                        }
                        this.f[n8].put((String)stringArray, ax.y0.a$d.b((double[])object3, this.i));
                        continue block12;
                    }
                    case 10: {
                        object3 = ((String)object2).split(",", -1);
                        object4 = new f[((String[])object3).length];
                        for (n9 = 0; n9 < ((Object)object3).length; ++n9) {
                            object5 = ((String)object3[n9]).split((String)object, -1);
                            object4[n9] = new f((long)Double.parseDouble((String)object5[0]), (long)Double.parseDouble((String)object5[1]));
                        }
                        this.f[n8].put((String)stringArray, ax.y0.a$d.d((f[])object4, this.i));
                        continue block12;
                    }
                    case 9: {
                        object4 = ((String)object2).split(",", -1);
                        object3 = new int[((String[])object4).length];
                        for (n9 = 0; n9 < ((Object[])object4).length; ++n9) {
                            object3[n9] = Integer.parseInt((String)object4[n9]);
                        }
                        this.f[n8].put((String)stringArray, ax.y0.a$d.c((int[])object3, this.i));
                        continue block12;
                    }
                    case 5: {
                        object4 = ((String)object2).split(",", -1);
                        object3 = new f[((String[])object4).length];
                        for (n9 = 0; n9 < ((Object[])object4).length; ++n9) {
                            object5 = ((String)object4[n9]).split((String)object, -1);
                            object3[n9] = new f((long)Double.parseDouble((String)object5[0]), (long)Double.parseDouble((String)object5[1]));
                        }
                        this.f[n8].put((String)stringArray, ax.y0.a$d.i((f[])object3, this.i));
                        continue block12;
                    }
                    case 4: {
                        object3 = ((String)object2).split(",", -1);
                        object4 = new long[((String[])object3).length];
                        for (n9 = 0; n9 < ((Object)object3).length; ++n9) {
                            object4[n9] = Long.parseLong((String)object3[n9]);
                        }
                        this.f[n8].put((String)stringArray, ax.y0.a$d.g((long[])object4, this.i));
                        continue block12;
                    }
                    case 3: {
                        object3 = ((String)object2).split(",", -1);
                        object4 = new int[((String[])object3).length];
                        for (n9 = 0; n9 < ((Object)object3).length; ++n9) {
                            object4[n9] = Integer.parseInt((String)object3[n9]);
                        }
                        this.f[n8].put((String)stringArray, ax.y0.a$d.k((int[])object4, this.i));
                        continue block12;
                    }
                    case 2: 
                    case 7: {
                        this.f[n8].put((String)stringArray, ax.y0.a$d.e((String)object2));
                        continue block12;
                    }
                    case 1: {
                        this.f[n8].put((String)stringArray, ax.y0.a$d.a((String)object2));
                    }
                }
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public Long n() {
        return ax.y0.a.W(this.i("DateTimeDigitized"), this.i("SubSecTimeDigitized"), this.i("OffsetTimeDigitized"));
    }

    public Long o() {
        return ax.y0.a.W(this.i("DateTimeOriginal"), this.i("SubSecTimeOriginal"), this.i("OffsetTimeOriginal"));
    }

    public double[] s() {
        String string = this.i("GPSLatitude");
        String string2 = this.i("GPSLatitudeRef");
        String string3 = this.i("GPSLongitude");
        String string4 = this.i("GPSLongitudeRef");
        if (string != null && string2 != null && string3 != null && string4 != null) {
            double d8;
            double d9;
            try {
                d9 = ax.y0.a.f(string, string2);
                d8 = ax.y0.a.f(string3, string4);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Latitude/longitude values are not parsable. ");
                stringBuilder.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", string, string2, string3, string4));
                Log.w((String)"ExifInterface", (String)stringBuilder.toString());
            }
            return new double[]{d9, d8};
        }
        return null;
    }

    public int y() {
        switch (this.l("Orientation", 1)) {
            default: {
                return 0;
            }
            case 6: 
            case 7: {
                return 90;
            }
            case 5: 
            case 8: {
                return 270;
            }
            case 3: 
            case 4: 
        }
        return 180;
    }

    private static class b
    extends InputStream
    implements DataInput,
    j.InputStreamRetargetInterface {
        protected int c0;
        private ByteOrder d0;
        private byte[] e0;
        private int f0;
        protected final DataInputStream q;

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream;
            this.q = dataInputStream = new DataInputStream(inputStream);
            ((InputStream)dataInputStream).mark(0);
            this.c0 = 0;
            this.d0 = byteOrder;
            int n8 = inputStream instanceof b ? ((b)inputStream).a() : -1;
            this.f0 = n8;
        }

        b(byte[] byArray) throws IOException {
            this(new ByteArrayInputStream(byArray), ByteOrder.BIG_ENDIAN);
            this.f0 = byArray.length;
        }

        public int a() {
            return this.f0;
        }

        @Override
        public int available() throws IOException {
            return ((InputStream)this.q).available();
        }

        public int b() {
            return this.c0;
        }

        public byte[] c() throws IOException {
            byte[] byArray;
            byte[] byArray2 = new byte[1024];
            int n8 = 0;
            while (true) {
                int n9;
                byArray = byArray2;
                if (n8 == byArray2.length) {
                    byArray = Arrays.copyOf(byArray2, byArray2.length * 2);
                }
                if ((n9 = this.q.read(byArray, n8, byArray.length - n8)) == -1) break;
                n8 += n9;
                this.c0 += n9;
                byArray2 = byArray;
            }
            return Arrays.copyOf(byArray, n8);
        }

        public long d() throws IOException {
            return (long)this.readInt() & 0xFFFFFFFFL;
        }

        public void e(ByteOrder byteOrder) {
            this.d0 = byteOrder;
        }

        public void f(int n8) throws IOException {
            int n9;
            int n10;
            for (n9 = 0; n9 < n8; n9 += n10) {
                int n11;
                Object object = this.q;
                int n12 = n8 - n9;
                n10 = n11 = (int)((InputStream)object).skip(n12);
                if (n11 > 0) continue;
                if (this.e0 == null) {
                    this.e0 = new byte[8192];
                }
                n10 = Math.min(8192, n12);
                if ((n10 = this.q.read(this.e0, 0, n10)) != -1) continue;
                object = new StringBuilder();
                ((StringBuilder)object).append("Reached EOF while skipping ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(" bytes.");
                throw new EOFException(((StringBuilder)object).toString());
            }
            this.c0 += n9;
        }

        @Override
        public void mark(int n8) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override
        public int read() throws IOException {
            ++this.c0;
            return ((InputStream)this.q).read();
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            n8 = this.q.read(byArray, n8, n9);
            this.c0 += n8;
            return n8;
        }

        @Override
        public boolean readBoolean() throws IOException {
            ++this.c0;
            return this.q.readBoolean();
        }

        @Override
        public byte readByte() throws IOException {
            ++this.c0;
            int n8 = ((InputStream)this.q).read();
            if (n8 >= 0) {
                return (byte)n8;
            }
            throw new EOFException();
        }

        @Override
        public char readChar() throws IOException {
            this.c0 += 2;
            return this.q.readChar();
        }

        @Override
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(this.readLong());
        }

        @Override
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(this.readInt());
        }

        @Override
        public void readFully(byte[] byArray) throws IOException {
            this.c0 += byArray.length;
            this.q.readFully(byArray);
        }

        @Override
        public void readFully(byte[] byArray, int n8, int n9) throws IOException {
            this.c0 += n9;
            this.q.readFully(byArray, n8, n9);
        }

        @Override
        public int readInt() throws IOException {
            int n8;
            int n9;
            int n10;
            this.c0 += 4;
            int n11 = ((InputStream)this.q).read();
            if ((n11 | (n10 = ((InputStream)this.q).read()) | (n9 = ((InputStream)this.q).read()) | (n8 = ((InputStream)this.q).read())) >= 0) {
                Object object = this.d0;
                if (object == ByteOrder.LITTLE_ENDIAN) {
                    return (n8 << 24) + (n9 << 16) + (n10 << 8) + n11;
                }
                if (object == ByteOrder.BIG_ENDIAN) {
                    return (n11 << 24) + (n10 << 16) + (n9 << 8) + n8;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid byte order: ");
                ((StringBuilder)object).append(this.d0);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new EOFException();
        }

        @Override
        public String readLine() throws IOException {
            Log.d((String)"ExifInterface", (String)"Currently unsupported");
            return null;
        }

        @Override
        public long readLong() throws IOException {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            this.c0 += 8;
            int n15 = ((InputStream)this.q).read();
            if ((n15 | (n14 = ((InputStream)this.q).read()) | (n13 = ((InputStream)this.q).read()) | (n12 = ((InputStream)this.q).read()) | (n11 = ((InputStream)this.q).read()) | (n10 = ((InputStream)this.q).read()) | (n9 = ((InputStream)this.q).read()) | (n8 = ((InputStream)this.q).read())) >= 0) {
                Object object = this.d0;
                if (object == ByteOrder.LITTLE_ENDIAN) {
                    return ((long)n8 << 56) + ((long)n9 << 48) + ((long)n10 << 40) + ((long)n11 << 32) + ((long)n12 << 24) + ((long)n13 << 16) + ((long)n14 << 8) + (long)n15;
                }
                if (object == ByteOrder.BIG_ENDIAN) {
                    return ((long)n15 << 56) + ((long)n14 << 48) + ((long)n13 << 40) + ((long)n12 << 32) + ((long)n11 << 24) + ((long)n10 << 16) + ((long)n9 << 8) + (long)n8;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid byte order: ");
                ((StringBuilder)object).append(this.d0);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new EOFException();
        }

        @Override
        public short readShort() throws IOException {
            int n8;
            this.c0 += 2;
            int n9 = ((InputStream)this.q).read();
            if ((n9 | (n8 = ((InputStream)this.q).read())) >= 0) {
                Object object = this.d0;
                if (object == ByteOrder.LITTLE_ENDIAN) {
                    return (short)((n8 << 8) + n9);
                }
                if (object == ByteOrder.BIG_ENDIAN) {
                    return (short)((n9 << 8) + n8);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid byte order: ");
                ((StringBuilder)object).append(this.d0);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new EOFException();
        }

        @Override
        public String readUTF() throws IOException {
            this.c0 += 2;
            return this.q.readUTF();
        }

        @Override
        public int readUnsignedByte() throws IOException {
            ++this.c0;
            return this.q.readUnsignedByte();
        }

        @Override
        public int readUnsignedShort() throws IOException {
            int n8;
            this.c0 += 2;
            int n9 = ((InputStream)this.q).read();
            if ((n9 | (n8 = ((InputStream)this.q).read())) >= 0) {
                Object object = this.d0;
                if (object == ByteOrder.LITTLE_ENDIAN) {
                    return (n8 << 8) + n9;
                }
                if (object == ByteOrder.BIG_ENDIAN) {
                    return (n9 << 8) + n8;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid byte order: ");
                ((StringBuilder)object).append(this.d0);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new EOFException();
        }

        @Override
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override
        public int skipBytes(int n8) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }

    private static class c
    extends FilterOutputStream {
        private ByteOrder c0;
        final DataOutputStream q;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.q = new DataOutputStream(outputStream);
            this.c0 = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.c0 = byteOrder;
        }

        public void b(int n8) throws IOException {
            this.q.write(n8);
        }

        public void c(int n8) throws IOException {
            ByteOrder byteOrder = this.c0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.q.write(n8 & 0xFF);
                this.q.write(n8 >>> 8 & 0xFF);
                this.q.write(n8 >>> 16 & 0xFF);
                this.q.write(n8 >>> 24 & 0xFF);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.q.write(n8 >>> 24 & 0xFF);
                this.q.write(n8 >>> 16 & 0xFF);
                this.q.write(n8 >>> 8 & 0xFF);
                this.q.write(n8 & 0xFF);
            }
        }

        public void d(short s8) throws IOException {
            ByteOrder byteOrder = this.c0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.q.write(s8 & 0xFF);
                this.q.write(s8 >>> 8 & 0xFF);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.q.write(s8 >>> 8 & 0xFF);
                this.q.write(s8 & 0xFF);
            }
        }

        public void e(long l8) throws IOException {
            if (l8 <= 0xFFFFFFFFL) {
                this.c((int)l8);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }

        public void f(int n8) throws IOException {
            if (n8 <= 65535) {
                this.d((short)n8);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }

        @Override
        public void write(byte[] byArray) throws IOException {
            ((OutputStream)this.q).write(byArray);
        }

        @Override
        public void write(byte[] byArray, int n8, int n9) throws IOException {
            this.q.write(byArray, n8, n9);
        }
    }

    private static class d {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        d(int n8, int n9, long l8, byte[] byArray) {
            this.a = n8;
            this.b = n9;
            this.c = l8;
            this.d = byArray;
        }

        d(int n8, int n9, byte[] byArray) {
            this(n8, n9, -1L, byArray);
        }

        public static d a(String object) {
            if (((String)object).length() == 1 && ((String)object).charAt(0) >= '0' && ((String)object).charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte)(((String)object).charAt(0) - 48)});
            }
            object = ((String)object).getBytes(r0);
            return new d(1, ((Object)object).length, (byte[])object);
        }

        public static d b(double[] dArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[Z[12] * dArray.length]);
            byteBuffer.order(byteOrder);
            int n8 = dArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                byteBuffer.putDouble(dArray[i8]);
            }
            return new d(12, dArray.length, byteBuffer.array());
        }

        public static d c(int[] nArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[Z[9] * nArray.length]);
            byteBuffer.order(byteOrder);
            int n8 = nArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                byteBuffer.putInt(nArray[i8]);
            }
            return new d(9, nArray.length, byteBuffer.array());
        }

        public static d d(f[] fArray, ByteOrder object) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[Z[10] * fArray.length]);
            byteBuffer.order((ByteOrder)object);
            int n8 = fArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                object = fArray[i8];
                byteBuffer.putInt((int)((f)object).a);
                byteBuffer.putInt((int)((f)object).b);
            }
            return new d(10, fArray.length, byteBuffer.array());
        }

        public static d e(String object) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append('\u0000');
            object = stringBuilder.toString().getBytes(r0);
            return new d(2, ((Object)object).length, (byte[])object);
        }

        public static d f(long l8, ByteOrder byteOrder) {
            return ax.y0.a$d.g(new long[]{l8}, byteOrder);
        }

        public static d g(long[] lArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[Z[4] * lArray.length]);
            byteBuffer.order(byteOrder);
            int n8 = lArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                byteBuffer.putInt((int)lArray[i8]);
            }
            return new d(4, lArray.length, byteBuffer.array());
        }

        public static d h(f f8, ByteOrder byteOrder) {
            return ax.y0.a$d.i(new f[]{f8}, byteOrder);
        }

        public static d i(f[] fArray, ByteOrder object) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[Z[5] * fArray.length]);
            byteBuffer.order((ByteOrder)object);
            int n8 = fArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                object = fArray[i8];
                byteBuffer.putInt((int)((f)object).a);
                byteBuffer.putInt((int)((f)object).b);
            }
            return new d(5, fArray.length, byteBuffer.array());
        }

        public static d j(int n8, ByteOrder byteOrder) {
            return ax.y0.a$d.k(new int[]{n8}, byteOrder);
        }

        public static d k(int[] nArray, ByteOrder byteOrder) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[Z[3] * nArray.length]);
            byteBuffer.order(byteOrder);
            int n8 = nArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                byteBuffer.putShort((short)nArray[i8]);
            }
            return new d(3, nArray.length, byteBuffer.array());
        }

        public double l(ByteOrder fArray) {
            if ((fArray = this.o((ByteOrder)fArray)) != null) {
                if (fArray instanceof String) {
                    return Double.parseDouble((String)fArray);
                }
                if (fArray instanceof long[]) {
                    if ((fArray = (f[])((long[])fArray)).length == 1) {
                        return (double)fArray[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (fArray instanceof int[]) {
                    if ((fArray = (f[])((int[])fArray)).length == 1) {
                        return (double)fArray[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (fArray instanceof double[]) {
                    if ((fArray = (f[])((double[])fArray)).length == 1) {
                        return (double)fArray[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (fArray instanceof f[]) {
                    if ((fArray = (f[])fArray).length == 1) {
                        return fArray[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int m(ByteOrder object) {
            if ((object = this.o((ByteOrder)object)) != null) {
                if (object instanceof String) {
                    return Integer.parseInt((String)object);
                }
                if (object instanceof long[]) {
                    if (((Object)(object = (Object)((long[])object))).length == 1) {
                        return (int)object[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (object instanceof int[]) {
                    if (((Object)(object = (Object)((int[])object))).length == 1) {
                        return (int)object[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String n(ByteOrder object) {
            Object object2 = this.o((ByteOrder)object);
            if (object2 == null) {
                return null;
            }
            if (object2 instanceof String) {
                return (String)object2;
            }
            object = new StringBuilder();
            boolean bl = object2 instanceof long[];
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            if (bl) {
                object2 = (long[])object2;
                n8 = n11;
                while (n8 < ((Object)object2).length) {
                    ((StringBuilder)object).append((long)object2[n8]);
                    n8 = n9 = n8 + 1;
                    if (n9 == ((f[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n8 = n9;
                }
                return ((StringBuilder)object).toString();
            }
            if (object2 instanceof int[]) {
                object2 = (int[])object2;
                while (n8 < ((Object)object2).length) {
                    ((StringBuilder)object).append((int)object2[n8]);
                    n8 = n9 = n8 + 1;
                    if (n9 == ((f[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n8 = n9;
                }
                return ((StringBuilder)object).toString();
            }
            if (object2 instanceof double[]) {
                object2 = (double[])object2;
                n8 = n9;
                while (n8 < ((f[])object2).length) {
                    ((StringBuilder)object).append((double)object2[n8]);
                    n8 = n9 = n8 + 1;
                    if (n9 == ((f[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n8 = n9;
                }
                return ((StringBuilder)object).toString();
            }
            if (object2 instanceof f[]) {
                object2 = object2;
                n8 = n10;
                while (n8 < ((f[])object2).length) {
                    ((StringBuilder)object).append(object2[n8].a);
                    ((StringBuilder)object).append('/');
                    ((StringBuilder)object).append(object2[n8].b);
                    n8 = n9 = n8 + 1;
                    if (n9 == ((f[])object2).length) continue;
                    ((StringBuilder)object).append(",");
                    n8 = n9;
                }
                return ((StringBuilder)object).toString();
            }
            return null;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        Object o(ByteOrder var1_1) {
            block74: {
                block75: {
                    block76: {
                        var7_5 = 0;
                        var4_6 = 0;
                        var10_7 = 0;
                        var5_8 = 0;
                        var6_9 = 0;
                        var8_10 = 0;
                        var9_11 = 0;
                        var3_12 = 0;
                        var2_13 /* !! */  = 0;
                        var14_14 = null;
                        var12_18 = var13_15 = new b(this.d);
                        ** try [egrp 1[TRYBLOCK] [3, 2 : 46->62)] { 
lbl14:
                        // 1 sources

                        break block76;
lbl15:
                        // 1 sources

                        catch (Throwable var13_16) {
                            var1_1 = var12_18;
                            var12_18 = var13_16;
                            break block74;
                        }
lbl19:
                        // 1 sources

                        catch (IOException var12_19) {
                            var1_1 = var13_15;
                            var13_15 = var12_19;
                            break block75;
                        }
                        catch (Throwable var12_31) {
                            var1_1 = var14_14;
                            break block74;
                        }
                        catch (IOException var13_17) {
                            var1_1 = null;
                            break block75;
                        }
                    }
                    var13_15.e((ByteOrder)var1_1);
                    var12_18 = var13_15;
                    var11_32 = this.a;
                    switch (var11_32) {
                        default: {
                            try {
                                var13_15.close();
                                return null;
                            }
                            catch (IOException var1_2) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_2);
                                return null;
                            }
                        }
                        case 12: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new double[this.b];
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = (f)var13_15.readDouble();
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_20) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_20);
                                return var1_1;
                            }
                        }
                        case 11: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new double[this.b];
                                var2_13 /* !! */  = var7_5;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = (f)((double)var13_15.readFloat());
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_21) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_21);
                                return var1_1;
                            }
                        }
                        case 10: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new f[this.b];
                                var2_13 /* !! */  = var4_6;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = new f(var13_15.readInt(), var13_15.readInt());
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_22) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_22);
                                return var1_1;
                            }
                        }
                        case 9: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new int[this.b];
                                var2_13 /* !! */  = var10_7;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = (f)var13_15.readInt();
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_23) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_23);
                                return var1_1;
                            }
                        }
                        case 8: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new int[this.b];
                                var2_13 /* !! */  = var5_8;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = (f)var13_15.readShort();
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_24) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_24);
                                return var1_1;
                            }
                        }
                        case 5: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new f[this.b];
                                var2_13 /* !! */  = var6_9;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = new f(var13_15.d(), var13_15.d());
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_25) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_25);
                                return var1_1;
                            }
                        }
                        case 4: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new long[this.b];
                                var2_13 /* !! */  = var8_10;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = (f)var13_15.d();
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_26) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_26);
                                return var1_1;
                            }
                        }
                        case 3: {
                            var12_18 = var13_15;
                            {
                                var1_1 = new int[this.b];
                                var2_13 /* !! */  = var9_11;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var1_1[var2_13 /* !! */ ] = (f)var13_15.readUnsignedShort();
                                    ++var2_13 /* !! */ ;
                                }
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_27) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_27);
                                return var1_1;
                            }
                        }
                        case 2: 
                        case 7: {
                            var12_18 = var13_15;
                            var2_13 /* !! */  = var3_12;
                            {
                                if (this.b < ax.y0.a.d().length) ** GOTO lbl201
                                var2_13 /* !! */  = 0;
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= ax.y0.a.d().length) break;
                                    var12_18 = var13_15;
                                    if (this.d[var2_13 /* !! */ ] == ax.y0.a.d()[var2_13 /* !! */ ]) ** GOTO lbl197
                                    var2_13 /* !! */  = var3_12;
                                    ** GOTO lbl201
lbl197:
                                    // 1 sources

                                    ++var2_13 /* !! */ ;
                                }
                                var12_18 = var13_15;
                            }
                            {
                                var2_13 /* !! */  = ax.y0.a.d().length;
lbl201:
                                // 3 sources

                                var12_18 = var13_15;
                                var12_18 = var13_15;
                                var1_1 = new StringBuilder();
                                while (true) {
                                    var12_18 = var13_15;
                                    if (var2_13 /* !! */  >= this.b) break;
                                    var12_18 = var13_15;
                                    var3_12 = this.d[var2_13 /* !! */ ];
                                    if (var3_12 == 0) break;
                                    if (var3_12 >= 32) {
                                        var12_18 = var13_15;
                                        var1_1.append((char)var3_12);
                                    } else {
                                        var12_18 = var13_15;
                                        var1_1.append('?');
                                    }
                                    ++var2_13 /* !! */ ;
                                }
                                var12_18 = var13_15;
                            }
                            {
                                var1_1 = var1_1.toString();
                            }
                            try {
                                var13_15.close();
                                return var1_1;
                            }
                            catch (IOException var12_28) {
                                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_28);
                                return var1_1;
                            }
                        }
                        case 1: 
                        case 6: 
                    }
                    var12_18 = var13_15;
                    {
                        var1_1 = this.d;
                        var12_18 = var13_15;
                    }
                    if (((f[])var1_1).length == 1 && (var2_13 /* !! */  = (int)var1_1[0]) >= 0 && var2_13 /* !! */  <= 1) {
                        var12_18 = var13_15;
                        {
                            var1_1 = new String(new char[]{(char)(var2_13 /* !! */  + 48)});
                        }
                        try {
                            var13_15.close();
                            return var1_1;
                        }
                        catch (IOException var12_29) {
                            Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_29);
                            return var1_1;
                        }
                    }
                    var12_18 = var13_15;
                    {
                        var1_1 = new String((byte[])var1_1, ax.y0.a.b());
                    }
                    try {
                        var13_15.close();
                        return var1_1;
                    }
                    catch (IOException var12_30) {
                        Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var12_30);
                        return var1_1;
                    }
                }
                var12_18 = var1_1;
                {
                    Log.w((String)"ExifInterface", (String)"IOException occurred during reading a value", (Throwable)var13_15);
                    if (var1_1 == null) return null;
                }
                try {
                    var1_1.close();
                    return null;
                }
                catch (IOException var1_3) {
                    Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_3);
                }
                return null;
            }
            if (var1_1 == null) throw var12_18;
            try {
                var1_1.close();
                throw var12_18;
            }
            catch (IOException var1_4) {
                Log.e((String)"ExifInterface", (String)"IOException occurred while closing InputStream", (Throwable)var1_4);
            }
            throw var12_18;
        }

        public int p() {
            return Z[this.a] * this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(Y[this.a]);
            stringBuilder.append(", data length:");
            stringBuilder.append(this.d.length);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        e(String string, int n8, int n9) {
            this.b = string;
            this.a = n8;
            this.c = n9;
            this.d = -1;
        }

        e(String string, int n8, int n9, int n10) {
            this.b = string;
            this.a = n8;
            this.c = n9;
            this.d = n10;
        }

        boolean a(int n8) {
            int n9;
            int n10 = this.c;
            if (n10 != 7 && n8 != 7 && n10 != n8 && (n9 = this.d) != n8) {
                if ((n10 == 4 || n9 == 4) && n8 == 3) {
                    return true;
                }
                if ((n10 == 9 || n9 == 9) && n8 == 8) {
                    return true;
                }
                return (n10 == 12 || n9 == 12) && n8 == 11;
            }
            return true;
        }
    }

    static class f {
        public final long a;
        public final long b;

        private f(long l8, long l9) {
            if (l9 == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = l8;
            this.b = l9;
        }

        public static f b(double d8) {
            long l8 = 1L;
            if (!(d8 >= 9.223372036854776E18) && !(d8 <= -9.223372036854776E18)) {
                double d9 = Math.abs(d8);
                long l9 = 0L;
                double d10 = d9;
                long l10 = 1L;
                long l11 = 0L;
                double d11 = d9;
                while (true) {
                    double d12 = d10 % 1.0;
                    long l12 = (long)(d10 - d12);
                    long l13 = l12 * l8 + l11;
                    l12 = l12 * l9 + l10;
                    d10 = 1.0 / d12;
                    if (!(Math.abs(d11 - (double)l13 / (double)l12) > 1.0E-8 * d9)) {
                        l9 = l13;
                        if (d8 < 0.0) {
                            l9 = -l13;
                        }
                        return new f(l9, l12);
                    }
                    l11 = l8;
                    l8 = l13;
                    l10 = l9;
                    l9 = l12;
                }
            }
            long l14 = d8 > 0.0 ? Long.MAX_VALUE : Long.MIN_VALUE;
            return new f(l14, 1L);
        }

        public double a() {
            return (double)this.a / (double)this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("/");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    private static class g
    extends b {
        g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                ((InputStream)this.q).mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }

        g(byte[] byArray) throws IOException {
            super(byArray);
            ((InputStream)this.q).mark(Integer.MAX_VALUE);
        }

        public void g(long l8) throws IOException {
            int n8 = this.c0;
            if ((long)n8 > l8) {
                this.c0 = 0;
                ((InputStream)this.q).reset();
            } else {
                l8 -= (long)n8;
            }
            this.f((int)l8);
        }
    }
}

