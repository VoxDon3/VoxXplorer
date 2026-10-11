package ax.c3;

import android.text.TextUtils;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.c3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1810C {
    private static final Map<String, String[]> a = new HashMap();
    private static final Map<String, Integer> b = new HashMap();
    private static final Set<String> c = new HashSet();

    /* renamed from: ax.c3.C$a */
    public static class a {
        public String[] a;
        public int b;

        a(int i, String[] strArr) {
            this.b = i;
            this.a = strArr;
        }
    }

    static {
        a();
    }

    private static void a() {
        Set<String> set = c;
        set.add("/Android".toLowerCase());
        set.add("/backups".toLowerCase());
        set.add("/backup".toLowerCase());
        set.add("/Ringtones".toLowerCase());
        set.add("/Podcasts".toLowerCase());
        set.add("/Alarms".toLowerCase());
        set.add("/Notifications".toLowerCase());
        set.add("/dianxin".toLowerCase());
        set.add("/LOST.DIR".toLowerCase());
        set.add("/com.facebook.katana".toLowerCase());
        set.add("/com.facebook.orca".toLowerCase());
        set.add("/MIUI".toLowerCase());
        Map<String, Integer> map = b;
        String lowerCase = "/Download".toLowerCase();
        Integer valueOf = Integer.valueOf(R.drawable.v_shape_download);
        map.put(lowerCase, valueOf);
        map.put("/Downloads".toLowerCase(), valueOf);
        String lowerCase2 = "/DCIM".toLowerCase();
        Integer valueOf2 = Integer.valueOf(R.drawable.v_shape_camera);
        map.put(lowerCase2, valueOf2);
        map.put("/DCIM/Camera".toLowerCase(), valueOf2);
        map.put("/DCIM/100ANDRO".toLowerCase(), valueOf2);
        map.put("/DCIM/100MEDIA".toLowerCase(), valueOf2);
        String lowerCase3 = "/DCIM/Screenshots".toLowerCase();
        Integer valueOf3 = Integer.valueOf(R.drawable.v_shape_screenshot);
        map.put(lowerCase3, valueOf3);
        map.put("/Pictures/Screenshots".toLowerCase(), valueOf3);
        map.put("/backups/apps".toLowerCase(), Integer.valueOf(R.drawable.v_shape_app));
        String lowerCase4 = "/Photos".toLowerCase();
        Integer valueOf4 = Integer.valueOf(R.drawable.v_shape_image);
        map.put(lowerCase4, valueOf4);
        map.put("/Pictures".toLowerCase(), valueOf4);
        map.put("/Images".toLowerCase(), valueOf4);
        String lowerCase5 = "/My music".toLowerCase();
        Integer valueOf5 = Integer.valueOf(R.drawable.v_shape_music);
        map.put(lowerCase5, valueOf5);
        map.put("/Music".toLowerCase(), valueOf5);
        map.put("/Musik".toLowerCase(), valueOf5);
        map.put("/Musica".toLowerCase(), valueOf5);
        map.put("/Musicas".toLowerCase(), valueOf5);
        map.put("/Música".toLowerCase(), valueOf5);
        map.put("/bluetooth", Integer.valueOf(R.drawable.v_shape_bluetooth));
        String lowerCase6 = "/Movie".toLowerCase();
        Integer valueOf6 = Integer.valueOf(R.drawable.v_shape_video);
        map.put(lowerCase6, valueOf6);
        map.put("/Movies".toLowerCase(), valueOf6);
        map.put("/Video".toLowerCase(), valueOf6);
        map.put("/Videos".toLowerCase(), valueOf6);
        String lowerCase7 = "/My Documents".toLowerCase();
        Integer valueOf7 = Integer.valueOf(R.drawable.v_shape_document);
        map.put(lowerCase7, valueOf7);
        map.put("/Document".toLowerCase(), valueOf7);
        map.put("/Documents".toLowerCase(), valueOf7);
        map.put("/Documentos".toLowerCase(), valueOf7);
        map.put("/mp3".toLowerCase(), valueOf5);
        map.put("/audio".toLowerCase(), valueOf5);
        String lowerCase8 = "/Voice Recorder".toLowerCase();
        Integer valueOf8 = Integer.valueOf(R.drawable.v_shape_sound);
        map.put(lowerCase8, valueOf8);
        map.put("/VoiceRecorder".toLowerCase(), valueOf8);
        Map<String, String[]> map2 = a;
        map2.put("/WhatsApp".toLowerCase(), new String[]{"com.whatsapp"});
        map2.put("/WhatsApp Business".toLowerCase(), new String[]{"com.whatsapp.w4b"});
        map2.put("/UCDownloads".toLowerCase(), new String[]{"com.UCMobile.intl", "com.uc.browser.en"});
        map2.put("/SHAREit".toLowerCase(), new String[]{"com.lenovo.anyshare.gps"});
        map2.put("/VidMate".toLowerCase(), new String[]{"com.nemo.vidmate"});
        map2.put("/snaptube".toLowerCase(), new String[]{"com.snaptube.premium"});
        map2.put("/Telegram".toLowerCase(), new String[]{"org.telegram.messenger"});
        map2.put("/Xender".toLowerCase(), new String[]{"cn.xender"});
        map2.put("/MEGA".toLowerCase(), new String[]{"mega.privacy.android.app"});
        map2.put("/Videoder".toLowerCase(), new String[]{"com.rahul.videoderbeta"});
        map2.put("/viber".toLowerCase(), new String[]{"com.viber.voip"});
        map2.put("/Tumblr".toLowerCase(), new String[]{"com.tumblr"});
        map2.put("/VK".toLowerCase(), new String[]{"com.vkontakte.android"});
        map2.put("/Clipbox".toLowerCase(), new String[]{"jp.co.granks.clipbox"});
        map2.put("/Clipboxes".toLowerCase(), new String[]{"jp.co.granks.clipboxes"});
        map2.put("/zapya".toLowerCase(), new String[]{"com.dewmobile.kuaiya.play"});
        map2.put("/4SHARED.COM".toLowerCase(), new String[]{"com.forshared"});
        map2.put("/PicsArt".toLowerCase(), new String[]{"com.picsart.studio"});
        map2.put("/CamScanner".toLowerCase(), new String[]{"com.intsig.camscanner", "com.intsig.camscannerhd"});
        map2.put("/Snapchat".toLowerCase(), new String[]{"com.snapchat.android"});
        map2.put("/KakaoTalkDownload".toLowerCase(), new String[]{"com.kakao.talk"});
        map2.put("/KineMaster".toLowerCase(), new String[]{"com.nexstreaming.app.kinemasterfree"});
        map2.put("/Snapseed".toLowerCase(), new String[]{"com.niksoftware.snapseed"});
        map2.put("/NaverMusic".toLowerCase(), new String[]{"com.nhn.android.music"});
        map2.put("/Naver".toLowerCase(), new String[]{"com.nhn.android.search"});
        map2.put("/epsxe".toLowerCase(), new String[]{"com.epsxe.ePSXe"});
        map2.put("/DSaudio".toLowerCase(), new String[]{"com.synology.DSaudio"});
        map2.put("/DSvideo".toLowerCase(), new String[]{"com.synology.dsvideo"});
        map2.put("/BUSSID".toLowerCase(), new String[]{"com.maleo.bussimulatorid"});
        map2.put("/ADM".toLowerCase(), new String[]{"com.dv.adm", "com.dv.adm.pay", "com.dv.adm.old"});
        map2.put("/DCIM/Video Editor".toLowerCase(), new String[]{"com.sec.android.app.vepreload"});
        map2.put("/DCIM/Facebook".toLowerCase(), new String[]{"com.facebook.katana"});
        map2.put("/DCIM/100PINT".toLowerCase(), new String[]{"com.pinterest"});
        map2.put("/Pictures/Twitter".toLowerCase(), new String[]{"com.twitter.android"});
        map2.put("/Pictures/LINE".toLowerCase(), new String[]{"jp.naver.line.android", "com.linecorp.linelite"});
        map2.put("/Pictures/LINE_MOVIE".toLowerCase(), new String[]{"jp.naver.line.android", "com.linecorp.linelite"});
        map2.put("/Pictures/KakaoTalk".toLowerCase(), new String[]{"com.kakao.talk"});
        map2.put("/Pictures/Messenger".toLowerCase(), new String[]{"com.facebook.orca"});
        map2.put("/Pictures/Hangouts".toLowerCase(), new String[]{"com.google.android.talk"});
        map2.put("/Pictures/Instagram".toLowerCase(), new String[]{"com.instagram.android"});
        map2.put("/Pictures/Office Lens".toLowerCase(), new String[]{"com.microsoft.office.officelens"});
        map2.put("/Pictures/PicsArt".toLowerCase(), new String[]{"com.picsart.studio"});
        map2.put("/Movies/Messenger".toLowerCase(), new String[]{"com.facebook.orca"});
    }

    public static a b(AbstractC3595n abstractC3595n) {
        String B;
        if (!(abstractC3595n instanceof C3605y)) {
            return null;
        }
        String E = abstractC3595n.E();
        String x = (abstractC3595n.R() == K.h && d0.H("/sdcard", E)) ? d0.x("/sdcard", E) : d0.v(((C3605y) abstractC3595n).B0(), E, Boolean.valueOf(abstractC3595n.isDirectory()));
        if (x == null) {
            return null;
        }
        int r = C1809B.r(x);
        String lowerCase = x.toLowerCase();
        if (r == 0 || r == 1) {
            Integer num = b.get(lowerCase);
            if (num != null) {
                return new a(num.intValue(), null);
            }
            String[] strArr = a.get(lowerCase);
            if (strArr != null) {
                return new a(0, strArr);
            }
        } else if (r == 2 && d(lowerCase) && (B = abstractC3595n.B()) != null) {
            return new a(0, new String[]{B});
        }
        return null;
    }

    public static a c(AbstractC3595n abstractC3595n) {
        if (!(abstractC3595n instanceof C3605y)) {
            return null;
        }
        try {
            String v = d0.v(((C3605y) abstractC3595n).B0(), abstractC3595n.E(), Boolean.valueOf(abstractC3595n.isDirectory()));
            if (v == null) {
                return null;
            }
            int r = C1809B.r(v);
            if (r > 2) {
                r = 2;
            }
            while (r >= 0) {
                String q = d0.q(v, r);
                String lowerCase = q.toLowerCase();
                if (r == 2 && d(lowerCase)) {
                    String h = d0.h(q);
                    if (!TextUtils.isEmpty(h)) {
                        return new a(0, new String[]{h});
                    }
                } else {
                    Integer num = b.get(lowerCase);
                    if (num != null) {
                        return new a(num.intValue(), null);
                    }
                    String[] strArr = a.get(lowerCase);
                    if (strArr != null) {
                        return new a(0, strArr);
                    }
                }
                r--;
            }
            return null;
        } catch (Exception e) {
            ax.Ha.c.h().f().b("folder map icon").l(e).h();
            return null;
        }
    }

    private static boolean d(String str) {
        if (str.startsWith("/android/")) {
            return str.startsWith("/android/data/") || str.startsWith("/android/media/") || str.startsWith("/android/obb/") || str.startsWith("/android/sandbox/");
        }
        return false;
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        String str2 = "/" + str.toLowerCase();
        return b.containsKey(str2) || a.containsKey(str2) || c.contains(str2);
    }
}
