package ax.y0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import ax.y0.C3496b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: ax.y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3495a {
    private static final SimpleDateFormat W;
    private static final SimpleDateFormat X;
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
    private static final Pattern x0;
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
    private static final boolean x = Log.isLoggable("ExifInterface", 3);
    private static final List<Integer> y = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> z = Arrays.asList(2, 7, 4, 5);
    public static final int[] A = {8, 8, 8};
    public static final int[] B = {4};
    public static final int[] C = {8};
    static final byte[] D = {-1, -40, -1};
    private static final byte[] E = {102, 116, 121, 112};
    private static final byte[] F = {109, 105, 102, 49};
    private static final byte[] G = {104, 101, 105, 99};
    private static final byte[] H = {97, 118, 105, 102};
    private static final byte[] I = {97, 118, 105, 115};
    private static final byte[] J = {79, 76, 89, 77, 80, 0};
    private static final byte[] K = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] L = {-119, 80, 78, 71, 13, 10, 26, 10};
    static final byte[] M = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    private static final byte[] N = {82, 73, 70, 70};
    private static final byte[] O = {87, 69, 66, 80};
    private static final byte[] P = {69, 88, 73, 70};
    private static final byte[] Q = {-99, 1, 42};
    private static final byte[] R = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] S = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] T = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] U = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] V = "ANMF".getBytes(Charset.defaultCharset());
    private static final String[] Y = {HttpUrl.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] Z = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] a0 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: ax.y0.a$c */
    private static class c extends FilterOutputStream {
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

        public void b(int i) throws IOException {
            this.q.write(i);
        }

        public void c(int i) throws IOException {
            ByteOrder byteOrder = this.c0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.q.write(i & 255);
                this.q.write((i >>> 8) & 255);
                this.q.write((i >>> 16) & 255);
                this.q.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.q.write((i >>> 24) & 255);
                this.q.write((i >>> 16) & 255);
                this.q.write((i >>> 8) & 255);
                this.q.write(i & 255);
            }
        }

        public void d(short s) throws IOException {
            ByteOrder byteOrder = this.c0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.q.write(s & 255);
                this.q.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.q.write((s >>> 8) & 255);
                this.q.write(s & 255);
            }
        }

        public void e(long j) throws IOException {
            if (j > 4294967295L) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            c((int) j);
        }

        public void f(int i) throws IOException {
            if (i > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            d((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.q.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.q.write(bArr, i, i2);
        }
    }

    /* renamed from: ax.y0.a$d */
    private static class d {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C3495a.r0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C3495a.Z[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C3495a.Z[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C3495a.Z[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C3495a.r0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j, ByteOrder byteOrder) {
            return g(new long[]{j}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C3495a.Z[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C3495a.Z[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i, ByteOrder byteOrder) {
            return k(new int[]{i}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C3495a.Z[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o = o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (o instanceof String) {
                return Double.parseDouble((String) o);
            }
            if (o instanceof long[]) {
                if (((long[]) o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o instanceof int[]) {
                if (((int[]) o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o instanceof double[]) {
                double[] dArr = (double[]) o;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) o;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) {
            Object o = o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (o instanceof String) {
                return Integer.parseInt((String) o);
            }
            if (o instanceof long[]) {
                long[] jArr = (long[]) o;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) o;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) {
            Object o = o(byteOrder);
            if (o == null) {
                return null;
            }
            if (o instanceof String) {
                return (String) o;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (o instanceof long[]) {
                long[] jArr = (long[]) o;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (o instanceof double[]) {
                double[] dArr = (double[]) o;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(o instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) o;
            while (i < fVarArr.length) {
                sb.append(fVarArr[i].a);
                sb.append('/');
                sb.append(fVarArr[i].b);
                i++;
                if (i != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0032: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:51), block:B:179:0x0031 */
        /* JADX WARN: Removed duplicated region for block: B:181:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:188:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object o(java.nio.ByteOrder r14) {
            /*
                Method dump skipped, instructions count: 460
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return C3495a.Z[this.a] * this.b;
        }

        public String toString() {
            return "(" + C3495a.Y[this.a] + ", data length:" + this.d.length + ")";
        }

        d(int i, int i2, long j, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    /* renamed from: ax.y0.a$f */
    static class f {
        public final long a;
        public final long b;

        /* synthetic */ f(long j, long j2, C0500a c0500a) {
            this(j, j2);
        }

        public static f b(double d) {
            long j;
            long j2;
            long j3 = 1;
            if (d >= 9.223372036854776E18d || d <= -9.223372036854776E18d) {
                return new f(d > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
            }
            double abs = Math.abs(d);
            double d2 = 1.0E-8d * abs;
            long j4 = 0;
            double d3 = abs;
            long j5 = 1;
            long j6 = 0;
            while (true) {
                double d4 = d3 % 1.0d;
                long j7 = (long) (d3 - d4);
                j = (j7 * j3) + j6;
                j2 = (j7 * j4) + j5;
                double d5 = 1.0d / d4;
                double d6 = abs;
                if (Math.abs(d6 - (j / j2)) <= d2) {
                    break;
                }
                j6 = j3;
                j3 = j;
                j5 = j4;
                j4 = j2;
                d3 = d5;
                abs = d6;
            }
            if (d < 0.0d) {
                j = -j;
            }
            return new f(j, j2);
        }

        public double a() {
            return this.a / this.b;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }

        private f(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        b0 = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        c0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        d0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f0 = eVarArr5;
        g0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        h0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        i0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        j0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        k0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        l0 = eVarArr10;
        m0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        n0 = new HashMap[eVarArr10.length];
        o0 = new HashMap[eVarArr10.length];
        p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        q0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        r0 = forName;
        s0 = "Exif\u0000\u0000".getBytes(forName);
        t0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        W = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        X = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            e[][] eVarArr11 = l0;
            if (i >= eVarArr11.length) {
                HashMap<Integer, Integer> hashMap = q0;
                e[] eVarArr12 = m0;
                hashMap.put(Integer.valueOf(eVarArr12[0].a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].a), 8);
                u0 = Pattern.compile(".*[1-9].*");
                v0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                w0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                x0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            n0[i] = new HashMap<>();
            o0[i] = new HashMap<>();
            for (e eVar : eVarArr11[i]) {
                n0[i].put(Integer.valueOf(eVar.a), eVar);
                o0[i].put(eVar.b, eVar);
            }
            i++;
        }
    }

    public C3495a(String str) throws IOException {
        e[][] eVarArr = l0;
        this.f = new HashMap[eVarArr.length];
        this.h = new HashSet(eVarArr.length);
        this.i = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        I(str);
    }

    private boolean A(g gVar) throws IOException {
        byte[] bArr = s0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] c2 = gVar.c();
        this.q = bArr.length;
        a0(c2, 0);
        return true;
    }

    private void D(b bVar) throws IOException {
        if (x) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.f(N.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = O;
        bVar.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i = length + 8;
                if (Arrays.equals(P, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = s0;
                    if (C3496b.g(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.q = i;
                    a0(bArr3, 0);
                    n0(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.f(readInt2);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private static int E(int i) {
        if (i != 4) {
            return (i == 9 || i == 15 || i == 12 || i == 13) ? 2 : 1;
        }
        return 3;
    }

    private static Pair<Integer, Integer> F(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> F2 = F(split[0]);
            if (((Integer) F2.first).intValue() == 2) {
                return F2;
            }
            for (int i = 1; i < split.length; i++) {
                Pair<Integer, Integer> F3 = F(split[i]);
                int intValue = (((Integer) F3.first).equals(F2.first) || ((Integer) F3.second).equals(F2.first)) ? ((Integer) F2.first).intValue() : -1;
                int intValue2 = (((Integer) F2.second).intValue() == -1 || !(((Integer) F3.first).equals(F2.second) || ((Integer) F3.second).equals(F2.second))) ? -1 : ((Integer) F2.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    F2 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    F2 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return F2;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > WebSocketProtocol.PAYLOAD_SHORT_MAX) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void G(b bVar, HashMap<String, d> hashMap) throws IOException {
        d dVar = hashMap.get("JPEGInterchangeFormat");
        d dVar2 = hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m = dVar.m(this.i);
        int m2 = dVar2.m(this.i);
        if (this.d == 7) {
            m += this.r;
        }
        if (m > 0 && m2 > 0) {
            this.j = true;
            if (this.a == null && this.c == null && this.b == null) {
                byte[] bArr = new byte[m2];
                bVar.f(m);
                bVar.readFully(bArr);
                this.o = bArr;
            }
            this.m = m;
            this.n = m2;
        }
        if (x) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m + ", length: " + m2);
        }
    }

    private void H(b bVar, HashMap<String, d> hashMap) throws IOException {
        int i;
        d dVar = hashMap.get("StripOffsets");
        d dVar2 = hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] c2 = C3496b.c(dVar.o(this.i));
        long[] c3 = C3496b.c(dVar2.o(this.i));
        if (c2 == null || c2.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (c3 == null || c3.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (c2.length != c3.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j = 0;
        for (long j2 : c3) {
            j += j2;
        }
        int i2 = (int) j;
        byte[] bArr = new byte[i2];
        int i3 = 1;
        this.l = true;
        this.k = true;
        this.j = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < c2.length) {
            int i7 = (int) c2[i4];
            byte[] bArr2 = bArr;
            int i8 = (int) c3[i4];
            if (i4 < c2.length - i3) {
                i = i4;
                if (i7 + i8 != c2[i + 1]) {
                    this.l = false;
                }
            } else {
                i = i4;
            }
            int i9 = i7 - i5;
            if (i9 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.f(i9);
                int i10 = i5 + i9;
                byte[] bArr3 = new byte[i8];
                try {
                    bVar.readFully(bArr3);
                    i5 = i10 + i8;
                    System.arraycopy(bArr3, 0, bArr2, i6, i8);
                    i6 += i8;
                    i4 = i + 1;
                    bArr = bArr2;
                    i3 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                return;
            }
        }
        this.o = bArr;
        if (this.l) {
            this.m = (int) c2[0];
            this.n = i2;
        }
    }

    private void I(String str) throws IOException {
        FileInputStream fileInputStream;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (P(fileInputStream.getFD())) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            V(fileInputStream);
            C3496b.b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C3496b.b(fileInputStream2);
            throw th;
        }
    }

    private int J(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (Exception e3) {
            e = e3;
            bVar2 = bVar;
            if (x) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, E)) {
            bVar.close();
            return 0;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j = 16;
            if (readInt < 16) {
                bVar.close();
                return 0;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            bVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            try {
                bVar.readFully(bArr3);
                if (j3 != 1) {
                    if (Arrays.equals(bArr3, F)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, G)) {
                        z3 = true;
                    } else if (Arrays.equals(bArr3, H) || Arrays.equals(bArr3, I)) {
                        z4 = true;
                    }
                    if (!z2) {
                        continue;
                    } else {
                        if (z3) {
                            bVar.close();
                            return 12;
                        }
                        if (z4) {
                            bVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return 0;
            }
        }
        bVar.close();
        return 0;
    }

    private static boolean K(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = D;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean L(byte[] bArr) throws IOException {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Z2 = Z(bVar2);
                this.i = Z2;
                bVar2.e(Z2);
                short readShort = bVar2.readShort();
                boolean z2 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean M(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean N(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean O(byte[] bArr) throws IOException {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder Z2 = Z(bVar2);
                this.i = Z2;
                bVar2.e(Z2);
                boolean z2 = bVar2.readShort() == 85;
                bVar2.close();
                return z2;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean P(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!x) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean Q(HashMap<String, d> hashMap) {
        d dVar;
        int m;
        d dVar2 = hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.i);
            int[] iArr2 = A;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.d == 3 && (dVar = hashMap.get("PhotometricInterpretation")) != null && (((m = dVar.m(this.i)) == 1 && Arrays.equals(iArr, C)) || (m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!x) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean R(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    public static boolean S(String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "image/x-fuji-raf":
            case "image/x-samsung-srw":
            case "image/x-sony-arw":
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/x-adobe-dng":
            case "image/x-panasonic-rw2":
            case "image/png":
            case "image/x-pentax-pef":
            case "image/x-olympus-orf":
            case "image/x-nikon-nef":
            case "image/x-nikon-nrw":
            case "image/x-canon-cr2":
                return true;
            default:
                return false;
        }
    }

    private boolean T(HashMap<String, d> hashMap) {
        d dVar = hashMap.get("ImageLength");
        d dVar2 = hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.i) <= 512 && dVar2.m(this.i) <= 512;
    }

    private boolean U(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = N;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = O;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[N.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00af A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #2 {all -> 0x0013, blocks: (B:3:0x0002, B:5:0x0007, B:7:0x001c, B:9:0x0020, B:10:0x002e, B:12:0x0036, B:14:0x003f, B:22:0x0071, B:28:0x0050, B:35:0x005e, B:38:0x0066, B:39:0x006a, B:40:0x006e, B:41:0x007b, B:43:0x0085, B:46:0x008d, B:49:0x0095, B:52:0x009d, B:61:0x00ab, B:63:0x00af), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void V(java.io.InputStream r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            ax.y0.a$e[][] r2 = ax.y0.C3495a.l0     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r2 = r2.length     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 >= r2) goto L1c
            java.util.HashMap<java.lang.String, ax.y0.a$d>[] r2 = r4.f     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r3.<init>()     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2[r1] = r3     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r1 = r1 + 1
            goto L2
        L13:
            r5 = move-exception
            goto Lbf
        L16:
            r5 = move-exception
            goto Lab
        L19:
            r5 = move-exception
            goto Lab
        L1c:
            boolean r1 = r4.e     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 != 0) goto L2e
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r5 = r4.t(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r4.d = r5     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r5 = r1
        L2e:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            boolean r1 = o0(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r1 == 0) goto L7b
            ax.y0.a$g r0 = new ax.y0.a$g     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            boolean r5 = r4.e     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r5 == 0) goto L50
            boolean r5 = r4.A(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            if (r5 != 0) goto L71
            r4.e()
            boolean r5 = ax.y0.C3495a.x
            if (r5 == 0) goto Lbe
            r4.Y()
            return
        L50:
            int r5 = r4.d     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r1 = 12
            if (r5 == r1) goto L6e
            r1 = 15
            if (r5 != r1) goto L5b
            goto L6e
        L5b:
            r1 = 7
            if (r5 != r1) goto L62
            r4.u(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L62:
            r1 = 10
            if (r5 != r1) goto L6a
            r4.z(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L6a:
            r4.x(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto L71
        L6e:
            r4.q(r0, r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
        L71:
            int r5 = r4.q     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r0.g(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r4.n0(r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L7b:
            ax.y0.a$b r1 = new ax.y0.a$b     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            int r5 = r4.d     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            r2 = 4
            if (r5 != r2) goto L89
            r4.r(r1, r0, r0)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L89:
            r0 = 13
            if (r5 != r0) goto L91
            r4.v(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L91:
            r0 = 9
            if (r5 != r0) goto L99
            r4.w(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
            goto La0
        L99:
            r0 = 14
            if (r5 != r0) goto La0
            r4.D(r1)     // Catch: java.lang.Throwable -> L13 java.lang.UnsupportedOperationException -> L16 java.io.IOException -> L19
        La0:
            r4.e()
            boolean r5 = ax.y0.C3495a.x
            if (r5 == 0) goto Lbe
            r4.Y()
            return
        Lab:
            boolean r0 = ax.y0.C3495a.x     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Lb6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L13
        Lb6:
            r4.e()
            if (r0 == 0) goto Lbe
            r4.Y()
        Lbe:
            return
        Lbf:
            r4.e()
            boolean r0 = ax.y0.C3495a.x
            if (r0 == 0) goto Lc9
            r4.Y()
        Lc9:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.V(java.io.InputStream):void");
    }

    private static Long W(String str, String str2, String str3) {
        if (str != null && u0.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date parse = W.parse(str, parsePosition);
                if (parse == null && (parse = X.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    int i = 1;
                    String substring = str3.substring(0, 1);
                    int parseInt = Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(substring) || "-".equals(substring)) && ":".equals(str3.substring(3, 4)) && parseInt <= 14) {
                        int i2 = ((parseInt * 60) + parseInt2) * 60000;
                        if (!"-".equals(substring)) {
                            i = -1;
                        }
                        time += i2 * i;
                    }
                }
                if (str2 != null) {
                    time += C3496b.f(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void X(b bVar) throws IOException {
        ByteOrder Z2 = Z(bVar);
        this.i = Z2;
        bVar.e(Z2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            bVar.f(i2);
        }
    }

    private void Y() {
        for (int i = 0; i < this.f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f[i].size());
            for (Map.Entry<String, d> entry : this.f[i].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.n(this.i) + "'");
            }
        }
    }

    private ByteOrder Z(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (x) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (x) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void a0(byte[] bArr, int i) throws IOException {
        g gVar = new g(bArr);
        X(gVar);
        b0(gVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b0(ax.y0.C3495a.g r33, int r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.b0(ax.y0.a$g, int):void");
    }

    private void c0(String str) {
        for (int i = 0; i < l0.length; i++) {
            this.f[i].remove(str);
        }
    }

    private void d0(int i, String str, String str2) {
        if (this.f[i].isEmpty() || this.f[i].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.f[i];
        hashMap.put(str2, hashMap.get(str));
        this.f[i].remove(str);
    }

    private void e() {
        String i = i("DateTimeOriginal");
        if (i != null && i("DateTime") == null) {
            this.f[0].put("DateTime", d.e(i));
        }
        if (i("ImageWidth") == null) {
            this.f[0].put("ImageWidth", d.f(0L, this.i));
        }
        if (i("ImageLength") == null) {
            this.f[0].put("ImageLength", d.f(0L, this.i));
        }
        if (i("Orientation") == null) {
            this.f[0].put("Orientation", d.f(0L, this.i));
        }
        if (i("LightSource") == null) {
            this.f[1].put("LightSource", d.f(0L, this.i));
        }
    }

    private void e0(int i, String str, String str2) {
        if (this.f[i].isEmpty() || this.f[i].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = this.f[i];
        hashMap.put(str2, hashMap.get(str));
    }

    private static double f(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private void g(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            h(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void g0(g gVar, int i) throws IOException {
        d dVar = this.f[i].get("ImageLength");
        d dVar2 = this.f[i].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f[i].get("JPEGInterchangeFormat");
            d dVar4 = this.f[i].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m = dVar3.m(this.i);
            int m2 = dVar3.m(this.i);
            gVar.g(m);
            byte[] bArr = new byte[m2];
            gVar.readFully(bArr);
            r(new b(bArr), m, i);
        }
    }

    private void h(b bVar, c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C3496b.e(bVar, cVar, readInt);
    }

    private void j0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr;
        if (x) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        cVar.b(-1);
        cVar.b(-31);
        this.q = t0(cVar);
        if (this.v != null) {
            cVar.write(-1);
            cVar.b(-31);
            byte[] bArr2 = t0;
            cVar.f(bArr2.length + 2 + this.v.d.length);
            cVar.write(bArr2);
            cVar.write(this.v.d);
            this.w = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.b(-1);
                cVar.b(readByte);
                C3496b.d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.b(-1);
                cVar.b(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.f(readUnsignedShort);
                int i = readUnsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int read = bVar.read(bArr3, 0, Math.min(i, 4096));
                    if (read >= 0) {
                        cVar.write(bArr3, 0, read);
                        i -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i2 = readUnsignedShort2 - 2;
                if (i2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr4 = t0;
                if (i2 >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = s0;
                    bArr = i2 >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (C3496b.g(bArr, s0) || C3496b.g(bArr, bArr4)) {
                        bVar.f(i2 - bArr.length);
                    }
                }
                cVar.b(-1);
                cVar.b(readByte);
                cVar.f(readUnsignedShort2);
                if (bArr != null) {
                    i2 -= bArr.length;
                    cVar.write(bArr);
                }
                while (i2 > 0) {
                    int read2 = bVar.read(bArr3, 0, Math.min(i2, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr3, 0, read2);
                        i2 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0078 -> B:9:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(java.io.InputStream r9, java.io.OutputStream r10) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = ax.y0.C3495a.x
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L27:
            ax.y0.a$b r0 = new ax.y0.a$b
            r0.<init>(r9)
            ax.y0.a$c r9 = new ax.y0.a$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = ax.y0.C3495a.L
            int r10 = r10.length
            ax.y0.C3496b.e(r0, r9, r10)
            ax.y0.a$d r10 = r8.v
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L43
            boolean r10 = r8.w
            if (r10 == 0) goto L78
        L43:
            r10 = 1
        L44:
            if (r1 != 0) goto L4d
            if (r10 == 0) goto L49
            goto L4d
        L49:
            ax.y0.C3496b.d(r0, r9)
            return
        L4d:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L7a
            r9.c(r3)
            r9.c(r4)
            int r3 = r3 + 4
            ax.y0.C3496b.e(r0, r9, r3)
            int r3 = r8.q
            if (r3 != 0) goto L6d
            r8.u0(r9)
            r1 = 0
        L6d:
            ax.y0.a$d r3 = r8.v
            if (r3 == 0) goto L44
            boolean r3 = r8.w
            if (r3 != 0) goto L44
            r8.v0(r9)
        L78:
            r10 = 0
            goto L44
        L7a:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L8b
            if (r1 == 0) goto L8b
            r8.u0(r9)
            int r3 = r3 + 4
            r0.f(r3)
            r1 = 0
            goto L44
        L8b:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lbd
            byte[] r5 = ax.y0.C3495a.M
            int r6 = r5.length
            if (r3 < r6) goto Lbd
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lb0
            ax.y0.a$d r10 = r8.v
            if (r10 == 0) goto Lac
            r8.v0(r9)
        Lac:
            r0.f(r6)
            goto L78
        Lb0:
            r9.c(r3)
            r9.c(r4)
            r9.write(r7)
            ax.y0.C3496b.e(r0, r9, r6)
            goto L44
        Lbd:
            r9.c(r3)
            r9.c(r4)
            int r3 = r3 + 4
            ax.y0.C3496b.e(r0, r9, r3)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.k0(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0210 A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #5 {Exception -> 0x0082, all -> 0x007e, blocks: (B:9:0x004f, B:11:0x005b, B:13:0x006f, B:14:0x0071, B:17:0x01f5, B:19:0x0210, B:20:0x0219, B:24:0x0086, B:26:0x0095, B:28:0x009d, B:29:0x00a1, B:32:0x00b1, B:34:0x00bc, B:35:0x00c1, B:37:0x00c3, B:42:0x00d2, B:40:0x00d7, B:45:0x00db, B:47:0x00e7, B:49:0x00ef, B:53:0x00fd, B:55:0x0105, B:57:0x010c, B:59:0x011b, B:61:0x012b, B:62:0x0184, B:64:0x0190, B:65:0x0197, B:67:0x01d1, B:69:0x01ee, B:70:0x01df, B:72:0x01e7, B:73:0x013e, B:74:0x0145, B:75:0x0146, B:77:0x0150, B:79:0x0156, B:82:0x016e, B:84:0x0176, B:85:0x017d), top: B:8:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l0(java.io.InputStream r22, java.io.OutputStream r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.l0(java.io.InputStream, java.io.OutputStream):void");
    }

    private void n0(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.f[4];
        d dVar = hashMap.get("Compression");
        if (dVar == null) {
            this.p = 6;
            G(bVar, hashMap);
            return;
        }
        int m = dVar.m(this.i);
        this.p = m;
        if (m != 1) {
            if (m == 6) {
                G(bVar, hashMap);
                return;
            } else if (m != 7) {
                return;
            }
        }
        if (Q(hashMap)) {
            H(bVar, hashMap);
        }
    }

    private static boolean o0(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    private d p(String str) {
        d dVar;
        d dVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (x) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && E(this.d) == 2 && (dVar2 = this.v) != null) {
            return dVar2;
        }
        for (int i = 0; i < l0.length; i++) {
            d dVar3 = this.f[i].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!"Xmp".equals(str) || (dVar = this.v) == null) {
            return null;
        }
        return dVar;
    }

    private void p0(int i, int i2) throws IOException {
        if (this.f[i].isEmpty() || this.f[i2].isEmpty()) {
            if (x) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f[i].get("ImageLength");
        d dVar2 = this.f[i].get("ImageWidth");
        d dVar3 = this.f[i2].get("ImageLength");
        d dVar4 = this.f[i2].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (x) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (x) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m = dVar.m(this.i);
        int m2 = dVar2.m(this.i);
        int m3 = dVar3.m(this.i);
        int m4 = dVar4.m(this.i);
        if (m >= m3 || m2 >= m4) {
            return;
        }
        HashMap<String, d>[] hashMapArr = this.f;
        HashMap<String, d> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
        if (i == 0) {
            this.g = true;
        }
    }

    private void q(g gVar, int i) throws IOException {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C3496b.a.a(mediaMetadataRetriever, new C0500a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f[0].put("ImageWidth", d.j(Integer.parseInt(str), this.i));
                }
                if (str3 != null) {
                    this.f[0].put("ImageLength", d.j(Integer.parseInt(str3), this.i));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    this.f[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.i));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.g(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, s0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    gVar.readFully(bArr2);
                    this.q = i3;
                    a0(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    gVar.g(j);
                    byte[] bArr3 = new byte[parseInt5];
                    gVar.readFully(bArr3);
                    this.v = new d(1, parseInt5, j, bArr3);
                    this.w = true;
                }
                if (x) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } finally {
            }
        } catch (RuntimeException e2) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e2);
        }
    }

    private static void q0(CRC32 crc32, int i) {
        crc32.update(i >>> 24);
        crc32.update(i >>> 16);
        crc32.update(i >>> 8);
        crc32.update(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r21.e(r20.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159 A[LOOP:0: B:9:0x0037->B:32:0x0159, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r(ax.y0.C3495a.b r21, int r22, int r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.r(ax.y0.a$b, int, int):void");
    }

    private void r0(g gVar, int i) throws IOException {
        d j;
        d j2;
        d dVar = this.f[i].get("DefaultCropSize");
        d dVar2 = this.f[i].get("SensorTopBorder");
        d dVar3 = this.f[i].get("SensorLeftBorder");
        d dVar4 = this.f[i].get("SensorBottomBorder");
        d dVar5 = this.f[i].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                g0(gVar, i);
                return;
            }
            int m = dVar2.m(this.i);
            int m2 = dVar4.m(this.i);
            int m3 = dVar5.m(this.i);
            int m4 = dVar3.m(this.i);
            if (m2 <= m || m3 <= m4) {
                return;
            }
            d j3 = d.j(m2 - m, this.i);
            d j4 = d.j(m3 - m4, this.i);
            this.f[i].put("ImageLength", j3);
            this.f[i].put("ImageWidth", j4);
            return;
        }
        if (dVar.a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.i);
            if (fVarArr == null || fVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                return;
            }
            j = d.h(fVarArr[0], this.i);
            j2 = d.h(fVarArr[1], this.i);
        } else {
            int[] iArr = (int[]) dVar.o(this.i);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            j = d.j(iArr[0], this.i);
            j2 = d.j(iArr[1], this.i);
        }
        this.f[i].put("ImageWidth", j);
        this.f[i].put("ImageLength", j2);
    }

    private void s0() throws IOException {
        p0(0, 5);
        p0(0, 4);
        p0(5, 4);
        d dVar = this.f[1].get("PixelXDimension");
        d dVar2 = this.f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f[0].put("ImageWidth", dVar);
            this.f[0].put("ImageLength", dVar2);
        }
        if (this.f[4].isEmpty() && T(this.f[5])) {
            HashMap<String, d>[] hashMapArr = this.f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!T(this.f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        d0(0, "ThumbnailOrientation", "Orientation");
        d0(0, "ThumbnailImageLength", "ImageLength");
        d0(0, "ThumbnailImageWidth", "ImageWidth");
        d0(5, "ThumbnailOrientation", "Orientation");
        d0(5, "ThumbnailImageLength", "ImageLength");
        d0(5, "ThumbnailImageWidth", "ImageWidth");
        if (this.g) {
            e0(4, "Orientation", "ThumbnailOrientation");
        } else {
            d0(4, "Orientation", "ThumbnailOrientation");
        }
        d0(4, "ImageLength", "ThumbnailImageLength");
        d0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private int t(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (K(bArr)) {
            return 4;
        }
        if (N(bArr)) {
            return 9;
        }
        int J2 = J(bArr);
        if (J2 != 0) {
            return J2;
        }
        if (L(bArr)) {
            return 7;
        }
        if (O(bArr)) {
            return 10;
        }
        if (M(bArr)) {
            return 13;
        }
        return U(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int t0(ax.y0.C3495a.c r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.t0(ax.y0.a$c):int");
    }

    private void u(g gVar) throws IOException {
        int i;
        int i2;
        x(gVar);
        d dVar = this.f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.d);
            gVar2.e(this.i);
            byte[] bArr = J;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.g(0L);
            byte[] bArr3 = K;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.g(12L);
            }
            b0(gVar2, 6);
            d dVar2 = this.f[7].get("PreviewImageStart");
            d dVar3 = this.f[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                this.f[5].put("JPEGInterchangeFormat", dVar2);
                this.f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.i);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                d j = d.j(i5, this.i);
                d j2 = d.j(i6, this.i);
                this.f[0].put("ImageWidth", j);
                this.f[0].put("ImageLength", j2);
            }
        }
    }

    private void u0(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.q = cVar.q.size() + t0(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.c((int) crc32.getValue());
    }

    private void v(b bVar) throws IOException {
        if (x) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        int b2 = bVar.b();
        bVar.f(L.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                break;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int b3 = bVar.b() + readInt + 4;
                if (bVar.b() - b2 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.q = bVar.b() - b2;
                    byte[] bArr = new byte[readInt];
                    bVar.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    q0(crc32, readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    a0(bArr, 0);
                    s0();
                    n0(new b(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = M;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int b4 = bVar.b() - b2;
                            int i = readInt - length;
                            byte[] bArr4 = new byte[i];
                            bVar.readFully(bArr4);
                            this.v = new d(1, i, b4, bArr4);
                            z3 = true;
                        }
                    }
                }
                bVar.f(b3 - bVar.b());
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
        this.w = z3;
    }

    private void v0(c cVar) throws IOException {
        cVar.c(this.v.d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.c(1767135348);
        q0(crc32, 1767135348);
        byte[] bArr = M;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.v.d);
        crc32.update(this.v.d);
        cVar.c((int) crc32.getValue());
        this.w = true;
    }

    private void w(b bVar) throws IOException {
        boolean z2 = x;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.f(i - bVar.b());
        bVar.readFully(bArr4);
        r(new b(bArr4), i, 5);
        bVar.f(i3 - bVar.b());
        bVar.e(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == g0.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j = d.j(readShort, this.i);
                d j2 = d.j(readShort2, this.i);
                this.f[0].put("ImageLength", j);
                this.f[0].put("ImageWidth", j2);
                if (x) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.f(readUnsignedShort2);
        }
    }

    private void x(g gVar) throws IOException {
        d dVar;
        X(gVar);
        b0(gVar, 0);
        r0(gVar, 0);
        r0(gVar, 5);
        r0(gVar, 4);
        s0();
        if (this.d != 8 || (dVar = this.f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.d);
        gVar2.e(this.i);
        gVar2.f(6);
        b0(gVar2, 9);
        d dVar2 = this.f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f[1].put("ColorSpace", dVar2);
        }
    }

    private void z(g gVar) throws IOException {
        if (x) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        x(gVar);
        d dVar = this.f[0].get("JpgFromRaw");
        if (dVar != null) {
            r(new b(dVar.d), (int) dVar.c, 5);
        }
        d dVar2 = this.f[0].get("ISO");
        d dVar3 = this.f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f[1].put("PhotographicSensitivity", dVar2);
    }

    public byte[] B() {
        int i = this.p;
        if (i == 6 || i == 7) {
            return C();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] C() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.j
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.o
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L2f
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            if (r3 == 0) goto L26
            r1.reset()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
        L1a:
            r3 = r2
            goto L58
        L1c:
            r0 = move-exception
            r3 = r2
        L1e:
            r2 = r1
            goto L90
        L21:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L82
        L26:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L21
            ax.y0.C3496b.b(r1)
            return r2
        L2f:
            java.lang.String r1 = r8.a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            if (r1 == 0) goto L43
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.lang.String r3 = r8.a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            goto L1a
        L3b:
            r0 = move-exception
            r3 = r2
            goto L90
        L3e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L82
        L43:
            java.io.FileDescriptor r1 = r8.b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            r7 = r3
            r3 = r1
            r1 = r7
        L58:
            ax.y0.a$b r4 = new ax.y0.a$b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.m     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r6 = r8.q     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r5 + r6
            r4.f(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            int r5 = r8.n     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r8.o = r5     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            ax.y0.C3496b.b(r1)
            if (r3 == 0) goto L76
            ax.y0.C3496b.a(r3)
        L76:
            return r5
        L77:
            r0 = move-exception
            goto L1e
        L79:
            r4 = move-exception
            goto L82
        L7b:
            r0 = move-exception
            r3 = r1
            goto L90
        L7e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L82:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L77
            ax.y0.C3496b.b(r1)
            if (r3 == 0) goto L8f
            ax.y0.C3496b.a(r3)
        L8f:
            return r2
        L90:
            ax.y0.C3496b.b(r2)
            if (r3 == 0) goto L98
            ax.y0.C3496b.a(r3)
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.C():byte[]");
    }

    public void f0() {
        m0("Orientation", Integer.toString(1));
    }

    public void h0(int i) {
        if (i % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int l = l("Orientation", 1);
        List<Integer> list = y;
        if (list.contains(Integer.valueOf(l))) {
            int indexOf = (list.indexOf(Integer.valueOf(l)) + (i / 90)) % 4;
            r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = z;
            if (list2.contains(Integer.valueOf(l))) {
                int indexOf2 = (list2.indexOf(Integer.valueOf(l)) + (i / 90)) % 4;
                r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        m0("Orientation", Integer.toString(r4));
    }

    public String i(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d p = p(str);
        if (p == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!p0.contains(str)) {
                return p.n(this.i);
            }
            try {
                return Double.toString(p.l(this.i));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i = p.a;
        if (i != 5 && i != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + p.a);
            return null;
        }
        f[] fVarArr = (f[]) p.o(this.i);
        if (fVarArr == null || fVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
            return null;
        }
        f fVar = fVarArr[0];
        Integer valueOf = Integer.valueOf((int) (fVar.a / fVar.b));
        f fVar2 = fVarArr[1];
        Integer valueOf2 = Integer.valueOf((int) (fVar2.a / fVar2.b));
        f fVar3 = fVarArr[2];
        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.a / fVar3.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x00ff), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[Catch: all -> 0x00fa, Exception -> 0x00fd, TryCatch #17 {Exception -> 0x00fd, all -> 0x00fa, blocks: (B:58:0x00ed, B:60:0x00f1, B:62:0x010e, B:66:0x00ff), top: B:57:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.y0.C3495a.i0():void");
    }

    public byte[] j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d p = p(str);
        if (p != null) {
            return p.d;
        }
        return null;
    }

    public double k(String str, double d2) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d p = p(str);
        if (p != null) {
            try {
                return p.l(this.i);
            } catch (NumberFormatException unused) {
            }
        }
        return d2;
    }

    public int l(String str, int i) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d p = p(str);
        if (p != null) {
            try {
                return p.m(this.i);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public Long m() {
        return W(i("DateTime"), i("SubSecTime"), i("OffsetTime"));
    }

    public void m0(String str, String str2) {
        e eVar;
        int i;
        String str3;
        String str4 = str;
        String str5 = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str4)) {
            if (x) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i2 = 2;
        String str6 = "/";
        int i3 = 1;
        if (str5 != null) {
            if (p0.contains(str4) && !str5.contains("/")) {
                try {
                    str5 = f.b(Double.parseDouble(str5)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            } else if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = v0.matcher(str5);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) {
                boolean find = w0.matcher(str5).find();
                boolean find2 = x0.matcher(str5).find();
                if (str5.length() != 19 || (!find && !find2)) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                if (find2) {
                    str5 = str5.replaceAll("-", ":");
                }
            }
        }
        char c2 = 0;
        if ("Xmp".equals(str4)) {
            boolean z2 = this.f[0].containsKey("Xmp") || this.f[5].containsKey("Xmp");
            int E2 = E(this.d);
            if ((E2 == 2 && (this.v != null || !z2)) || (E2 == 3 && !z2)) {
                this.v = str5 != null ? d.a(str5) : null;
                return;
            }
        }
        int i4 = 0;
        while (i4 < l0.length) {
            if ((i4 != 4 || this.j) && (eVar = o0[i4].get(str4)) != null) {
                if (str5 == null) {
                    this.f[i4].remove(str4);
                } else {
                    Pair<Integer, Integer> F2 = F(str5);
                    if (eVar.c == ((Integer) F2.first).intValue() || eVar.c == ((Integer) F2.second).intValue()) {
                        i = eVar.c;
                    } else {
                        int i5 = eVar.d;
                        if (i5 == -1 || !(i5 == ((Integer) F2.first).intValue() || eVar.d == ((Integer) F2.second).intValue())) {
                            int i6 = eVar.c;
                            if (i6 == i3 || i6 == 7 || i6 == i2) {
                                i = i6;
                            } else if (x) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Given tag (");
                                sb.append(str4);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = Y;
                                sb.append(strArr[eVar.c]);
                                int i7 = eVar.d;
                                String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                                sb.append(i7 == -1 ? HttpUrl.FRAGMENT_ENCODE_SET : ", " + strArr[eVar.d]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) F2.first).intValue()]);
                                if (((Integer) F2.second).intValue() != -1) {
                                    str7 = ", " + strArr[((Integer) F2.second).intValue()];
                                }
                                sb.append(str7);
                                sb.append(")");
                                Log.d("ExifInterface", sb.toString());
                            }
                        } else {
                            i = eVar.d;
                        }
                    }
                    switch (i) {
                        case 1:
                            str3 = str6;
                            this.f[i4].put(str4, d.a(str5));
                            break;
                        case 2:
                        case 7:
                            str3 = str6;
                            this.f[i4].put(str4, d.e(str5));
                            break;
                        case 3:
                            str3 = str6;
                            String[] split = str5.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i8 = 0; i8 < split.length; i8++) {
                                iArr[i8] = Integer.parseInt(split[i8]);
                            }
                            this.f[i4].put(str4, d.k(iArr, this.i));
                            break;
                        case 4:
                            str3 = str6;
                            String[] split2 = str5.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i9 = 0; i9 < split2.length; i9++) {
                                jArr[i9] = Long.parseLong(split2[i9]);
                            }
                            this.f[i4].put(str4, d.g(jArr, this.i));
                            break;
                        case 5:
                            String[] split3 = str5.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i10 = 0;
                            while (i10 < split3.length) {
                                String[] split4 = split3[i10].split(str6, -1);
                                fVarArr[i10] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]), null);
                                i10++;
                                str6 = str6;
                            }
                            str3 = str6;
                            this.f[i4].put(str4, d.i(fVarArr, this.i));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (x) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i);
                                break;
                            }
                            break;
                        case 9:
                            String[] split5 = str5.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i11 = 0; i11 < split5.length; i11++) {
                                iArr2[i11] = Integer.parseInt(split5[i11]);
                            }
                            this.f[i4].put(str4, d.c(iArr2, this.i));
                            str3 = str6;
                            break;
                        case 10:
                            String[] split6 = str5.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i12 = 0;
                            while (i12 < split6.length) {
                                String[] split7 = split6[i12].split(str6, -1);
                                int i13 = i12;
                                fVarArr2[i13] = new f((long) Double.parseDouble(split7[c2]), (long) Double.parseDouble(split7[1]), null);
                                i12 = i13 + 1;
                                split6 = split6;
                                c2 = 0;
                            }
                            this.f[i4].put(str4, d.d(fVarArr2, this.i));
                            str3 = str6;
                            break;
                        case 12:
                            String[] split8 = str5.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i14 = 0; i14 < split8.length; i14++) {
                                dArr[i14] = Double.parseDouble(split8[i14]);
                            }
                            this.f[i4].put(str4, d.b(dArr, this.i));
                            break;
                    }
                    i4++;
                    str6 = str3;
                    i2 = 2;
                    i3 = 1;
                    c2 = 0;
                }
            }
            str3 = str6;
            i4++;
            str6 = str3;
            i2 = 2;
            i3 = 1;
            c2 = 0;
        }
    }

    public Long n() {
        return W(i("DateTimeDigitized"), i("SubSecTimeDigitized"), i("OffsetTimeDigitized"));
    }

    public Long o() {
        return W(i("DateTimeOriginal"), i("SubSecTimeOriginal"), i("OffsetTimeOriginal"));
    }

    public double[] s() {
        String i = i("GPSLatitude");
        String i2 = i("GPSLatitudeRef");
        String i3 = i("GPSLongitude");
        String i4 = i("GPSLongitudeRef");
        if (i == null || i2 == null || i3 == null || i4 == null) {
            return null;
        }
        try {
            return new double[]{f(i, i2), f(i3, i4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", i, i2, i3, i4));
            return null;
        }
    }

    public int y() {
        switch (l("Orientation", 1)) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: ax.y0.a$b */
    private static class b extends InputStream implements DataInput, InputStreamRetargetInterface {
        protected int c0;
        private ByteOrder d0;
        private byte[] e0;
        private int f0;
        protected final DataInputStream q;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f0 = bArr.length;
        }

        public int a() {
            return this.f0;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.q.available();
        }

        public int b() {
            return this.c0;
        }

        public byte[] c() throws IOException {
            byte[] bArr = new byte[1024];
            int i = 0;
            while (true) {
                if (i == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
                int read = this.q.read(bArr, i, bArr.length - i);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i);
                }
                i += read;
                this.c0 += read;
            }
        }

        public long d() throws IOException {
            return readInt() & 4294967295L;
        }

        public void e(ByteOrder byteOrder) {
            this.d0 = byteOrder;
        }

        public void f(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.q.skip(i3);
                if (skip <= 0) {
                    if (this.e0 == null) {
                        this.e0 = new byte[8192];
                    }
                    skip = this.q.read(this.e0, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.c0 += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.c0++;
            return this.q.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.c0++;
            return this.q.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.c0++;
            int read = this.q.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.c0 += 2;
            return this.q.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.c0 += i2;
            this.q.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.c0 += 4;
            int read = this.q.read();
            int read2 = this.q.read();
            int read3 = this.q.read();
            int read4 = this.q.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.d0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.d0);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.c0 += 8;
            int read = this.q.read();
            int read2 = this.q.read();
            int read3 = this.q.read();
            int read4 = this.q.read();
            int read5 = this.q.read();
            int read6 = this.q.read();
            int read7 = this.q.read();
            int read8 = this.q.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.d0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.d0);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.c0 += 2;
            int read = this.q.read();
            int read2 = this.q.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.d0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.d0);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.c0 += 2;
            return this.q.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.c0++;
            return this.q.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.c0 += 2;
            int read = this.q.read();
            int read2 = this.q.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.d0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.d0);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.q.read(bArr, i, i2);
            this.c0 += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.c0 += bArr.length;
            this.q.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.q = dataInputStream;
            dataInputStream.mark(0);
            this.c0 = 0;
            this.d0 = byteOrder;
            this.f0 = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    /* renamed from: ax.y0.a$g */
    private static class g extends b {
        g(byte[] bArr) throws IOException {
            super(bArr);
            this.q.mark(SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }

        public void g(long j) throws IOException {
            int i = this.c0;
            if (i > j) {
                this.c0 = 0;
                this.q.reset();
            } else {
                j -= i;
            }
            f((int) j);
        }

        g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.q.mark(SubsamplingScaleImageView.TILE_SIZE_AUTO);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* renamed from: ax.y0.a$e */
    private static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        e(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        boolean a(int i) {
            int i2;
            int i3 = this.c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        e(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public C3495a(FileDescriptor fileDescriptor) throws IOException {
        boolean z2;
        FileInputStream fileInputStream;
        Throwable th;
        e[][] eVarArr = l0;
        this.f = new HashMap[eVarArr.length];
        this.h = new HashSet(eVarArr.length);
        this.i = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.c = null;
            this.a = null;
            if (P(fileDescriptor)) {
                this.b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z2 = true;
                } catch (Exception e2) {
                    throw new IOException("Failed to duplicate file descriptor", e2);
                }
            } else {
                this.b = null;
                z2 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    V(fileInputStream);
                    C3496b.b(fileInputStream);
                    if (z2) {
                        C3496b.a(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C3496b.b(fileInputStream);
                    if (z2) {
                        C3496b.a(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    /* renamed from: ax.y0.a$a, reason: collision with other inner class name */
    class C0500a extends MediaDataSource implements AutoCloseable {
        final /* synthetic */ g c0;
        long q;

        C0500a(g gVar) {
            this.c0 = gVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.q;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.c0.available()) {
                        return -1;
                    }
                    this.c0.g(j);
                    this.q = j;
                }
                if (i2 > this.c0.available()) {
                    i2 = this.c0.available();
                }
                int read = this.c0.read(bArr, i, i2);
                if (read >= 0) {
                    this.q += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.q = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public C3495a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public C3495a(InputStream inputStream, int i) throws IOException {
        e[][] eVarArr = l0;
        this.f = new HashMap[eVarArr.length];
        this.h = new HashSet(eVarArr.length);
        this.i = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.a = null;
            boolean z2 = i == 1;
            this.e = z2;
            if (z2) {
                this.c = null;
                this.b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.c = (AssetManager.AssetInputStream) inputStream;
                this.b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (P(fileInputStream.getFD())) {
                        this.c = null;
                        this.b = fileInputStream.getFD();
                    }
                }
                this.c = null;
                this.b = null;
            }
            V(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
