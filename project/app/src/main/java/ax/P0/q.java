/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.net.Uri;
import ax.P0.D;
import java.util.List;
import java.util.Map;

public final class q {
    public static int a(String string) {
        int n8;
        block58: {
            block59: {
                if (string == null) {
                    return -1;
                }
                string = D.t(string);
                string.getClass();
                switch (string.hashCode()) {
                    default: {
                        n8 = -1;
                        break block58;
                    }
                    case 2039520277: {
                        if (!string.equals("video/x-matroska")) break;
                        n8 = 31;
                        break block58;
                    }
                    case 1505118770: {
                        if (!string.equals("audio/webm")) break;
                        n8 = 30;
                        break block58;
                    }
                    case 1504831518: {
                        if (!string.equals("audio/mpeg")) break;
                        n8 = 29;
                        break block58;
                    }
                    case 1504824762: {
                        if (!string.equals("audio/midi")) break;
                        n8 = 28;
                        break block58;
                    }
                    case 1504619009: {
                        if (!string.equals("audio/flac")) break;
                        n8 = 27;
                        break block58;
                    }
                    case 1504578661: {
                        if (!string.equals("audio/eac3")) break;
                        n8 = 26;
                        break block58;
                    }
                    case 1503095341: {
                        if (!string.equals("audio/3gpp")) break;
                        n8 = 25;
                        break block58;
                    }
                    case 1331848029: {
                        if (!string.equals("video/mp4")) break;
                        n8 = 24;
                        break block58;
                    }
                    case 187099443: {
                        if (!string.equals("audio/wav")) break;
                        n8 = 23;
                        break block58;
                    }
                    case 187091926: {
                        if (!string.equals("audio/ogg")) break;
                        n8 = 22;
                        break block58;
                    }
                    case 187090232: {
                        if (!string.equals("audio/mp4")) break;
                        n8 = 21;
                        break block58;
                    }
                    case 187078669: {
                        if (!string.equals("audio/amr")) break;
                        n8 = 20;
                        break block58;
                    }
                    case 187078297: {
                        if (!string.equals("audio/ac4")) break;
                        n8 = 19;
                        break block58;
                    }
                    case 187078296: {
                        if (!string.equals("audio/ac3")) break;
                        n8 = 18;
                        break block58;
                    }
                    case 13915911: {
                        if (!string.equals("video/x-flv")) break;
                        n8 = 17;
                        break block58;
                    }
                    case -43467528: {
                        if (!string.equals("application/webm")) break;
                        n8 = 16;
                        break block58;
                    }
                    case -387023398: {
                        if (!string.equals("audio/x-matroska")) break;
                        n8 = 15;
                        break block58;
                    }
                    case -879258763: {
                        if (!string.equals("image/png")) break;
                        n8 = 14;
                        break block58;
                    }
                    case -879272239: {
                        if (!string.equals("image/bmp")) break;
                        n8 = 13;
                        break block58;
                    }
                    case -1004728940: {
                        if (!string.equals("text/vtt")) break;
                        n8 = 12;
                        break block58;
                    }
                    case -1079884372: {
                        if (!string.equals("video/x-msvideo")) break;
                        n8 = 11;
                        break block58;
                    }
                    case -1248337486: {
                        if (!string.equals("application/mp4")) break;
                        n8 = 10;
                        break block58;
                    }
                    case -1487018032: {
                        if (!string.equals("image/webp")) break;
                        n8 = 9;
                        break block58;
                    }
                    case -1487394660: {
                        if (!string.equals("image/jpeg")) break;
                        n8 = 8;
                        break block58;
                    }
                    case -1487464690: {
                        if (!string.equals("image/heif")) break;
                        n8 = 7;
                        break block58;
                    }
                    case -1487464693: {
                        if (!string.equals("image/heic")) break;
                        n8 = 6;
                        break block58;
                    }
                    case -1487656890: {
                        if (!string.equals("image/avif")) break;
                        n8 = 5;
                        break block58;
                    }
                    case -1606874997: {
                        if (!string.equals("audio/amr-wb")) break;
                        n8 = 4;
                        break block58;
                    }
                    case -1662095187: {
                        if (!string.equals("video/webm")) break;
                        n8 = 3;
                        break block58;
                    }
                    case -1662384007: {
                        if (!string.equals("video/mp2t")) break;
                        n8 = 2;
                        break block58;
                    }
                    case -1662384011: {
                        if (!string.equals("video/mp2p")) break;
                        n8 = 1;
                        break block58;
                    }
                    case -2123537834: {
                        if (string.equals("audio/eac3-joc")) break block59;
                    }
                }
                n8 = -1;
                break block58;
            }
            n8 = 0;
        }
        switch (n8) {
            default: {
                return -1;
            }
            case 29: {
                return 7;
            }
            case 28: {
                return 15;
            }
            case 27: {
                return 4;
            }
            case 23: {
                return 12;
            }
            case 22: {
                return 9;
            }
            case 19: {
                return 1;
            }
            case 17: {
                return 5;
            }
            case 14: {
                return 17;
            }
            case 13: {
                return 19;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 16;
            }
            case 10: 
            case 21: 
            case 24: {
                return 8;
            }
            case 9: {
                return 18;
            }
            case 8: {
                return 14;
            }
            case 6: 
            case 7: {
                return 20;
            }
            case 5: {
                return 21;
            }
            case 4: 
            case 20: 
            case 25: {
                return 3;
            }
            case 3: 
            case 15: 
            case 16: 
            case 30: 
            case 31: {
                return 6;
            }
            case 2: {
                return 11;
            }
            case 1: {
                return 10;
            }
            case 0: 
            case 18: 
            case 26: 
        }
        return 0;
    }

    public static int b(Map<String, List<String>> object) {
        object = (object = object.get("Content-Type")) != null && !object.isEmpty() ? (String)object.get(0) : null;
        return q.a((String)object);
    }

    public static int c(Uri object) {
        if ((object = object.getLastPathSegment()) == null) {
            return -1;
        }
        if (!((String)object).endsWith(".ac3") && !((String)object).endsWith(".ec3")) {
            if (((String)object).endsWith(".ac4")) {
                return 1;
            }
            if (!((String)object).endsWith(".adts") && !((String)object).endsWith(".aac")) {
                if (((String)object).endsWith(".amr")) {
                    return 3;
                }
                if (((String)object).endsWith(".flac")) {
                    return 4;
                }
                if (((String)object).endsWith(".flv")) {
                    return 5;
                }
                if (!(((String)object).endsWith(".mid") || ((String)object).endsWith(".midi") || ((String)object).endsWith(".smf"))) {
                    if (!((String)object).startsWith(".mk", ((String)object).length() - 4) && !((String)object).endsWith(".webm")) {
                        if (((String)object).endsWith(".mp3")) {
                            return 7;
                        }
                        if (!(((String)object).endsWith(".mp4") || ((String)object).startsWith(".m4", ((String)object).length() - 4) || ((String)object).startsWith(".mp4", ((String)object).length() - 5) || ((String)object).startsWith(".cmf", ((String)object).length() - 5))) {
                            if (!((String)object).startsWith(".og", ((String)object).length() - 4) && !((String)object).endsWith(".opus")) {
                                if (!(((String)object).endsWith(".ps") || ((String)object).endsWith(".mpeg") || ((String)object).endsWith(".mpg") || ((String)object).endsWith(".m2p"))) {
                                    if (!((String)object).endsWith(".ts") && !((String)object).startsWith(".ts", ((String)object).length() - 4)) {
                                        if (!((String)object).endsWith(".wav") && !((String)object).endsWith(".wave")) {
                                            if (!((String)object).endsWith(".vtt") && !((String)object).endsWith(".webvtt")) {
                                                if (!((String)object).endsWith(".jpg") && !((String)object).endsWith(".jpeg")) {
                                                    if (((String)object).endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (((String)object).endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (((String)object).endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!((String)object).endsWith(".bmp") && !((String)object).endsWith(".dib")) {
                                                        if (!((String)object).endsWith(".heic") && !((String)object).endsWith(".heif")) {
                                                            if (((String)object).endsWith(".avif")) {
                                                                return 21;
                                                            }
                                                            return -1;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}

