/*
 * Decompiled with CFR 0.152.
 */
package ax.w3;

import android.content.Context;
import android.text.TextUtils;
import ax.Q2.f;
import java.util.logging.Logger;

public class h {
    private static final Logger a = Logger.getLogger("FileManager.VideoPlayerHelper");

    /*
     * Enabled aggressive block sorting
     */
    public static String a(String string) {
        int n8;
        int n9 = 8;
        if (string == null) {
            return "";
        }
        if (string.startsWith("video")) {
            n8 = -1;
            switch (string.hashCode()) {
                case 1599127257: {
                    if (!string.equals("video/x-vnd.on2.vp9")) break;
                    n8 = 1;
                    break;
                }
                case 1599127256: {
                    if (!string.equals("video/x-vnd.on2.vp8")) break;
                    n8 = 2;
                    break;
                }
                case 1331852436: {
                    if (!string.equals("video/raw")) break;
                    n8 = 3;
                    break;
                }
                case 1331836730: {
                    if (!string.equals("video/avc")) break;
                    n8 = 4;
                    break;
                }
                case 1187890754: {
                    if (!string.equals("video/mp4v-es")) break;
                    n8 = 5;
                    break;
                }
                case 5751993: {
                    if (!string.equals("video/mpeg2")) break;
                    n8 = 6;
                    break;
                }
                case -1662541442: {
                    if (!string.equals("video/hevc")) break;
                    n8 = 7;
                    break;
                }
                case -1662735862: {
                    if (!string.equals("video/av01")) break;
                    n8 = 8;
                    break;
                }
                case -1664118616: {
                    if (!string.equals("video/3gpp")) break;
                    n8 = 9;
                    break;
                }
            }
            switch (n8) {
                default: {
                    n9 = -1;
                    break;
                }
                case 2: {
                    n9 = 7;
                    break;
                }
                case 3: {
                    n9 = 6;
                    break;
                }
                case 4: {
                    n9 = 5;
                    break;
                }
                case 5: {
                    n9 = 4;
                    break;
                }
                case 6: {
                    n9 = 3;
                    break;
                }
                case 7: {
                    n9 = 2;
                    break;
                }
                case 8: {
                    n9 = 1;
                    break;
                }
                case 9: {
                    n9 = 0;
                    break;
                }
                case 1: 
            }
            switch (n9) {
                default: {
                    Logger logger = a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unknown video codec : ");
                    stringBuilder.append(string);
                    logger.fine(stringBuilder.toString());
                    return "";
                }
                case 8: {
                    return "VP9";
                }
                case 7: {
                    return "VP8";
                }
                case 6: {
                    return "RAW";
                }
                case 5: {
                    return "H.264 AVC";
                }
                case 4: {
                    return "MPEG-4";
                }
                case 3: {
                    return "MPEG-2";
                }
                case 2: {
                    return "H.265 HEVC";
                }
                case 1: {
                    return "AV1";
                }
                case 0: 
            }
            return "H.263";
        }
        if (!string.startsWith("audio")) {
            return "";
        }
        tmp = -1;
        switch (string.hashCode()) {
            case 1903589369: {
                if (!string.equals("audio/g711-mlaw")) break;
                tmp = 1;
                break;
            }
            case 1903231877: {
                if (!string.equals("audio/g711-alaw")) break;
                tmp = 2;
                break;
            }
            case 1504891608: {
                if (!string.equals("audio/opus")) break;
                tmp = 3;
                break;
            }
            case 1504831518: {
                if (!string.equals("audio/mpeg")) break;
                tmp = 4;
                break;
            }
            case 1504619009: {
                if (!string.equals("audio/flac")) break;
                tmp = 5;
                break;
            }
            case 1504578661: {
                if (!string.equals("audio/eac3")) break;
                tmp = 6;
                break;
            }
            case 1504470054: {
                if (!string.equals("audio/alac")) break;
                tmp = 7;
                break;
            }
            case 1503095341: {
                if (!string.equals("audio/3gpp")) break;
                tmp = 8;
                break;
            }
            case 187094639: {
                if (!string.equals("audio/raw")) break;
                tmp = 9;
                break;
            }
            case 187084616: {
                if (!string.equals("audio/gsm")) break;
                tmp = 10;
                break;
            }
            case 187078297: {
                if (!string.equals("audio/ac4")) break;
                tmp = 11;
                break;
            }
            case 187078296: {
                if (!string.equals("audio/ac3")) break;
                tmp = 12;
                break;
            }
            case -53558318: {
                if (!string.equals("audio/mp4a-latm")) break;
                tmp = 13;
                break;
            }
            case -591556130: {
                if (!string.equals("audio/qcelp")) break;
                tmp = 14;
                break;
            }
            case -1003765268: {
                if (!string.equals("audio/vorbis")) break;
                tmp = 15;
                break;
            }
            case -1606874997: {
                if (!string.equals("audio/amr-wb")) break;
                tmp = 16;
                break;
            }
            case -2123537834: {
                if (!string.equals("audio/eac3-joc")) break;
                tmp = 17;
                break;
            }
        }
        switch (tmp) {
            default: {
                n9 = -1;
                break;
            }
            case 1: {
                n9 = 16;
                break;
            }
            case 2: {
                n9 = 15;
                break;
            }
            case 3: {
                n9 = 14;
                break;
            }
            case 4: {
                n9 = 13;
                break;
            }
            case 5: {
                n9 = 12;
                break;
            }
            case 6: {
                n9 = 11;
                break;
            }
            case 7: {
                n9 = 10;
                break;
            }
            case 8: {
                n9 = 9;
                break;
            }
            case 10: {
                n9 = 7;
                break;
            }
            case 11: {
                n9 = 6;
                break;
            }
            case 12: {
                n9 = 5;
                break;
            }
            case 13: {
                n9 = 4;
                break;
            }
            case 14: {
                n9 = 3;
                break;
            }
            case 15: {
                n9 = 2;
                break;
            }
            case 16: {
                n9 = 1;
                break;
            }
            case 17: {
                n9 = 0;
                break;
            }
            case 9: 
        }
        switch (n9) {
            default: {
                Logger logger = a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown audio codec : ");
                stringBuilder.append(string);
                logger.fine(stringBuilder.toString());
                return "";
            }
            case 16: {
                return "G.711 \u03bc-Law";
            }
            case 15: {
                return "G.711 A-Law";
            }
            case 14: {
                return "Opus";
            }
            case 13: {
                return "MPEG";
            }
            case 12: {
                return "FLAC";
            }
            case 11: {
                return "EAC3";
            }
            case 10: {
                return "ALAC";
            }
            case 9: {
                return "AMR NB";
            }
            case 8: {
                return "RAW";
            }
            case 7: {
                return "MS GSM";
            }
            case 6: {
                return "AC4";
            }
            case 5: {
                return "AC3";
            }
            case 4: {
                return "AAC";
            }
            case 3: {
                return "QCELP";
            }
            case 2: {
                return "Vorbis";
            }
            case 1: {
                return "AMR WB";
            }
            case 0: 
        }
        return "EAC3 JOC";
    }

    public static String b(Context context, String string) {
        String string2 = h.a(string);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            string = string2;
        }
        return context.getString(2131951950, new Object[]{string});
    }

    public static String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.u());
        stringBuilder.append("/");
        stringBuilder.append("ffmpeg.exo.zip");
        return stringBuilder.toString();
    }
}

