package ax.P0;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: ax.P0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908q {
    public static int a(String str) {
        int i;
        char c;
        if (str == null) {
            return -1;
        }
        String t = D.t(str);
        t.getClass();
        switch (t.hashCode()) {
            case -2123537834:
                i = 20;
                if (t.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                i = 20;
                if (t.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                i = 20;
                if (t.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                i = 20;
                if (t.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                i = 20;
                if (t.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487656890:
                i = 20;
                if (t.equals("image/avif")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1487464693:
                i = 20;
                if (t.equals("image/heic")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1487464690:
                i = 20;
                if (t.equals("image/heif")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                i = 20;
                if (t.equals("image/jpeg")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1487018032:
                i = 20;
                if (t.equals("image/webp")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                i = 20;
                if (t.equals("application/mp4")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                i = 20;
                if (t.equals("video/x-msvideo")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                i = 20;
                if (t.equals("text/vtt")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -879272239:
                i = 20;
                if (t.equals("image/bmp")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -879258763:
                i = 20;
                if (t.equals("image/png")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                i = 20;
                if (t.equals("audio/x-matroska")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                i = 20;
                if (t.equals("application/webm")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                i = 20;
                if (t.equals("video/x-flv")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                i = 20;
                if (t.equals("audio/ac3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                i = 20;
                if (t.equals("audio/ac4")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                i = 20;
                if (t.equals("audio/amr")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                i = 20;
                if (t.equals("audio/mp4")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                i = 20;
                if (t.equals("audio/ogg")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                i = 20;
                if (t.equals("audio/wav")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                i = 20;
                if (t.equals("video/mp4")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                i = 20;
                if (t.equals("audio/3gpp")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                i = 20;
                if (t.equals("audio/eac3")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                i = 20;
                if (t.equals("audio/flac")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                i = 20;
                if (t.equals("audio/midi")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                i = 20;
                if (t.equals("audio/mpeg")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                i = 20;
                if (t.equals("audio/webm")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                i = 20;
                if (t.equals("video/x-matroska")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                i = 20;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    public static int b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
