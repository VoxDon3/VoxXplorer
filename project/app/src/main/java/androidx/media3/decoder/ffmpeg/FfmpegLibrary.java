/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder.ffmpeg;

import ax.P0.z;
import ax.P2.b;
import ax.S0.u;

public final class FfmpegLibrary {
    private static String a;
    private static int b;

    static {
        z.a("media3.decoder.ffmpeg");
        b = -1;
    }

    static String a(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1903589369: {
                if (!string.equals("audio/g711-mlaw")) break;
                n8 = 19;
                break;
            }
            case 1903231877: {
                if (!string.equals("audio/g711-alaw")) break;
                n8 = 18;
                break;
            }
            case 1556697186: {
                if (!string.equals("audio/true-hd")) break;
                n8 = 17;
                break;
            }
            case 1505942594: {
                if (!string.equals("audio/vnd.dts.hd")) break;
                n8 = 16;
                break;
            }
            case 1504891608: {
                if (!string.equals("audio/opus")) break;
                n8 = 15;
                break;
            }
            case 1504831518: {
                if (!string.equals("audio/mpeg")) break;
                n8 = 14;
                break;
            }
            case 1504619009: {
                if (!string.equals("audio/flac")) break;
                n8 = 13;
                break;
            }
            case 1504578661: {
                if (!string.equals("audio/eac3")) break;
                n8 = 12;
                break;
            }
            case 1504470054: {
                if (!string.equals("audio/alac")) break;
                n8 = 11;
                break;
            }
            case 1503095341: {
                if (!string.equals("audio/3gpp")) break;
                n8 = 10;
                break;
            }
            case 1331836730: {
                if (!string.equals("video/avc")) break;
                n8 = 9;
                break;
            }
            case 187078296: {
                if (!string.equals("audio/ac3")) break;
                n8 = 8;
                break;
            }
            case -53558318: {
                if (!string.equals("audio/mp4a-latm")) break;
                n8 = 7;
                break;
            }
            case -432837259: {
                if (!string.equals("audio/mpeg-L2")) break;
                n8 = 6;
                break;
            }
            case -432837260: {
                if (!string.equals("audio/mpeg-L1")) break;
                n8 = 5;
                break;
            }
            case -1003765268: {
                if (!string.equals("audio/vorbis")) break;
                n8 = 4;
                break;
            }
            case -1095064472: {
                if (!string.equals("audio/vnd.dts")) break;
                n8 = 3;
                break;
            }
            case -1606874997: {
                if (!string.equals("audio/amr-wb")) break;
                n8 = 2;
                break;
            }
            case -1662541442: {
                if (!string.equals("video/hevc")) break;
                n8 = 1;
                break;
            }
            case -2123537834: {
                if (!string.equals("audio/eac3-joc")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 19: {
                return "pcm_mulaw";
            }
            case 18: {
                return "pcm_alaw";
            }
            case 17: {
                return "truehd";
            }
            case 15: {
                return "opus";
            }
            case 13: {
                return "flac";
            }
            case 11: {
                return "alac";
            }
            case 10: {
                return "amrnb";
            }
            case 9: {
                return "h264";
            }
            case 8: {
                return "ac3";
            }
            case 7: {
                return "aac";
            }
            case 5: 
            case 6: 
            case 14: {
                return "mp3";
            }
            case 4: {
                return "vorbis";
            }
            case 3: 
            case 16: {
                return "dca";
            }
            case 2: {
                return "amrwb";
            }
            case 1: {
                return "hevc";
            }
            case 0: 
            case 12: 
        }
        return "eac3";
    }

    public static int b() {
        if (!FfmpegLibrary.d()) {
            return -1;
        }
        if (b == -1) {
            b = FfmpegLibrary.ffmpegGetInputBufferPaddingSize();
        }
        return b;
    }

    public static String c() {
        if (!FfmpegLibrary.d()) {
            return null;
        }
        try {
            if (a == null) {
                a = FfmpegLibrary.ffmpegGetVersion();
            }
            return a;
        }
        catch (Error error) {
            return null;
        }
    }

    public static boolean d() {
        return ax.P2.b.b() && ax.P2.b.i();
    }

    public static boolean e(String charSequence) {
        if (!FfmpegLibrary.d()) {
            return false;
        }
        String string = FfmpegLibrary.a((String)charSequence);
        if (string == null) {
            return false;
        }
        if (!FfmpegLibrary.ffmpegHasDecoder(string)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("No ");
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(" decoder available. Check the FFmpeg build configuration.");
            u.h("FfmpegLibrary", ((StringBuilder)charSequence).toString());
            return false;
        }
        return true;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String var0);
}

