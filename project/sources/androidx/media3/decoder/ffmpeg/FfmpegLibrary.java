package androidx.media3.decoder.ffmpeg;

import ax.P0.C0916z;
import ax.S0.C0987u;

/* loaded from: classes.dex */
public final class FfmpegLibrary {
    private static String a;
    private static int b;

    static {
        C0916z.a("media3.decoder.ffmpeg");
        b = -1;
    }

    static String a(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return "eac3";
            case "video/hevc":
                return "hevc";
            case "audio/amr-wb":
                return "amrwb";
            case "audio/vnd.dts":
            case "audio/vnd.dts.hd":
                return "dca";
            case "audio/vorbis":
                return "vorbis";
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/mpeg":
                return "mp3";
            case "audio/mp4a-latm":
                return "aac";
            case "audio/ac3":
                return "ac3";
            case "video/avc":
                return "h264";
            case "audio/3gpp":
                return "amrnb";
            case "audio/alac":
                return "alac";
            case "audio/flac":
                return "flac";
            case "audio/opus":
                return "opus";
            case "audio/true-hd":
                return "truehd";
            case "audio/g711-alaw":
                return "pcm_alaw";
            case "audio/g711-mlaw":
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static int b() {
        if (!d()) {
            return -1;
        }
        if (b == -1) {
            b = ffmpegGetInputBufferPaddingSize();
        }
        return b;
    }

    public static String c() {
        if (!d()) {
            return null;
        }
        try {
            if (a == null) {
                a = ffmpegGetVersion();
            }
            return a;
        } catch (Error unused) {
            return null;
        }
    }

    public static boolean d() {
        return ax.P2.b.b() && ax.P2.b.i();
    }

    public static boolean e(String str) {
        String a2;
        if (!d() || (a2 = a(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(a2)) {
            return true;
        }
        C0987u.h("FfmpegLibrary", "No " + a2 + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
