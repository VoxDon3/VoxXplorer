/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.text.TextUtils;
import ax.Ha.c;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.y;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C {
    private static final Map<String, String[]> a = new HashMap<String, String[]>();
    private static final Map<String, Integer> b = new HashMap<String, Integer>();
    private static final Set<String> c = new HashSet<String>();

    static {
        C.a();
    }

    private static void a() {
        Map<String, String[]> map = c;
        map.add((String)"/Android".toLowerCase());
        map.add((String)"/backups".toLowerCase());
        map.add((String)"/backup".toLowerCase());
        map.add((String)"/Ringtones".toLowerCase());
        map.add((String)"/Podcasts".toLowerCase());
        map.add((String)"/Alarms".toLowerCase());
        map.add((String)"/Notifications".toLowerCase());
        map.add((String)"/dianxin".toLowerCase());
        map.add((String)"/LOST.DIR".toLowerCase());
        map.add((String)"/com.facebook.katana".toLowerCase());
        map.add((String)"/com.facebook.orca".toLowerCase());
        map.add((String)"/MIUI".toLowerCase());
        map = b;
        Object object = "/Download".toLowerCase();
        Object object2 = 2131231522;
        map.put((String)object, (String[])object2);
        map.put("/Downloads".toLowerCase(), (String[])object2);
        object2 = "/DCIM".toLowerCase();
        object = 2131231518;
        map.put((String)object2, (String[])object);
        map.put("/DCIM/Camera".toLowerCase(), (String[])object);
        map.put("/DCIM/100ANDRO".toLowerCase(), (String[])object);
        map.put("/DCIM/100MEDIA".toLowerCase(), (String[])object);
        object2 = "/DCIM/Screenshots".toLowerCase();
        object = 2131231539;
        map.put((String)object2, (String[])object);
        map.put("/Pictures/Screenshots".toLowerCase(), (String[])object);
        map.put("/backups/apps".toLowerCase(), (String[])2131231515);
        object = "/Photos".toLowerCase();
        object2 = 2131231531;
        map.put((String)object, (String[])object2);
        map.put("/Pictures".toLowerCase(), (String[])object2);
        map.put("/Images".toLowerCase(), (String[])object2);
        object2 = "/My music".toLowerCase();
        object = 2131231534;
        map.put((String)object2, (String[])object);
        map.put("/Music".toLowerCase(), (String[])object);
        map.put("/Musik".toLowerCase(), (String[])object);
        map.put("/Musica".toLowerCase(), (String[])object);
        map.put("/Musicas".toLowerCase(), (String[])object);
        map.put("/M\u00fasica".toLowerCase(), (String[])object);
        map.put("/bluetooth", (String[])2131231517);
        String string = "/Movie".toLowerCase();
        object2 = 2131231545;
        map.put(string, (String[])object2);
        map.put("/Movies".toLowerCase(), (String[])object2);
        map.put("/Video".toLowerCase(), (String[])object2);
        map.put("/Videos".toLowerCase(), (String[])object2);
        string = "/My Documents".toLowerCase();
        object2 = 2131231521;
        map.put(string, (String[])object2);
        map.put("/Document".toLowerCase(), (String[])object2);
        map.put("/Documents".toLowerCase(), (String[])object2);
        map.put("/Documentos".toLowerCase(), (String[])object2);
        map.put("/mp3".toLowerCase(), (String[])object);
        map.put("/audio".toLowerCase(), (String[])object);
        object2 = "/Voice Recorder".toLowerCase();
        object = 2131231542;
        map.put((String)object2, (String[])object);
        map.put("/VoiceRecorder".toLowerCase(), (String[])object);
        map = a;
        map.put("/WhatsApp".toLowerCase(), new String[]{"com.whatsapp"});
        map.put("/WhatsApp Business".toLowerCase(), new String[]{"com.whatsapp.w4b"});
        map.put("/UCDownloads".toLowerCase(), new String[]{"com.UCMobile.intl", "com.uc.browser.en"});
        map.put("/SHAREit".toLowerCase(), new String[]{"com.lenovo.anyshare.gps"});
        map.put("/VidMate".toLowerCase(), new String[]{"com.nemo.vidmate"});
        map.put("/snaptube".toLowerCase(), new String[]{"com.snaptube.premium"});
        map.put("/Telegram".toLowerCase(), new String[]{"org.telegram.messenger"});
        map.put("/Xender".toLowerCase(), new String[]{"cn.xender"});
        map.put("/MEGA".toLowerCase(), new String[]{"mega.privacy.android.app"});
        map.put("/Videoder".toLowerCase(), new String[]{"com.rahul.videoderbeta"});
        map.put("/viber".toLowerCase(), new String[]{"com.viber.voip"});
        map.put("/Tumblr".toLowerCase(), new String[]{"com.tumblr"});
        map.put("/VK".toLowerCase(), new String[]{"com.vkontakte.android"});
        map.put("/Clipbox".toLowerCase(), new String[]{"jp.co.granks.clipbox"});
        map.put("/Clipboxes".toLowerCase(), new String[]{"jp.co.granks.clipboxes"});
        map.put("/zapya".toLowerCase(), new String[]{"com.dewmobile.kuaiya.play"});
        map.put("/4SHARED.COM".toLowerCase(), new String[]{"com.forshared"});
        map.put("/PicsArt".toLowerCase(), new String[]{"com.picsart.studio"});
        map.put("/CamScanner".toLowerCase(), new String[]{"com.intsig.camscanner", "com.intsig.camscannerhd"});
        map.put("/Snapchat".toLowerCase(), new String[]{"com.snapchat.android"});
        map.put("/KakaoTalkDownload".toLowerCase(), new String[]{"com.kakao.talk"});
        map.put("/KineMaster".toLowerCase(), new String[]{"com.nexstreaming.app.kinemasterfree"});
        map.put("/Snapseed".toLowerCase(), new String[]{"com.niksoftware.snapseed"});
        map.put("/NaverMusic".toLowerCase(), new String[]{"com.nhn.android.music"});
        map.put("/Naver".toLowerCase(), new String[]{"com.nhn.android.search"});
        map.put("/epsxe".toLowerCase(), new String[]{"com.epsxe.ePSXe"});
        map.put("/DSaudio".toLowerCase(), new String[]{"com.synology.DSaudio"});
        map.put("/DSvideo".toLowerCase(), new String[]{"com.synology.dsvideo"});
        map.put("/BUSSID".toLowerCase(), new String[]{"com.maleo.bussimulatorid"});
        map.put("/ADM".toLowerCase(), new String[]{"com.dv.adm", "com.dv.adm.pay", "com.dv.adm.old"});
        map.put("/DCIM/Video Editor".toLowerCase(), new String[]{"com.sec.android.app.vepreload"});
        map.put("/DCIM/Facebook".toLowerCase(), new String[]{"com.facebook.katana"});
        map.put("/DCIM/100PINT".toLowerCase(), new String[]{"com.pinterest"});
        map.put("/Pictures/Twitter".toLowerCase(), new String[]{"com.twitter.android"});
        map.put("/Pictures/LINE".toLowerCase(), new String[]{"jp.naver.line.android", "com.linecorp.linelite"});
        map.put("/Pictures/LINE_MOVIE".toLowerCase(), new String[]{"jp.naver.line.android", "com.linecorp.linelite"});
        map.put("/Pictures/KakaoTalk".toLowerCase(), new String[]{"com.kakao.talk"});
        map.put("/Pictures/Messenger".toLowerCase(), new String[]{"com.facebook.orca"});
        map.put("/Pictures/Hangouts".toLowerCase(), new String[]{"com.google.android.talk"});
        map.put("/Pictures/Instagram".toLowerCase(), new String[]{"com.instagram.android"});
        map.put("/Pictures/Office Lens".toLowerCase(), new String[]{"com.microsoft.office.officelens"});
        map.put("/Pictures/PicsArt".toLowerCase(), new String[]{"com.picsart.studio"});
        map.put("/Movies/Messenger".toLowerCase(), new String[]{"com.facebook.orca"});
    }

    public static a b(n object) {
        if (!(object instanceof y)) {
            return null;
        }
        String string = object.E();
        string = object.R() == K.h && d0.H("/sdcard", string) ? d0.x("/sdcard", string) : d0.v(((y)object).B0(), string, object.isDirectory());
        if (string == null) {
            return null;
        }
        int n8 = B.r(string);
        string = string.toLowerCase();
        if (n8 != 0 && n8 != 1) {
            if (n8 == 2 && C.d(string) && (object = object.B()) != null) {
                return new a(0, new String[]{object});
            }
        } else {
            object = b.get(string);
            if (object != null) {
                return new a(object.intValue(), null);
            }
            object = a.get(string);
            if (object != null) {
                return new a(0, (String[])object);
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a c(n object) {
        int n8;
        block12: {
            if (!(object instanceof y)) {
                return null;
            }
            try {
                int n9;
                object = d0.v(((y)object).B0(), ((n)object).E(), object.isDirectory());
                if (object == null) {
                    return null;
                }
                n8 = n9 = B.r((String)object);
                if (n9 > 2) {
                    n8 = 2;
                }
                break block12;
            }
            catch (Exception exception) {}
            ax.Ha.c.h().f().b("folder map icon").l(exception).h();
            return null;
        }
        while (n8 >= 0) {
            Object object2 = d0.q((String)object, n8);
            Object object3 = ((String)object2).toLowerCase();
            if (n8 == 2 && C.d((String)object3)) {
                object3 = d0.h((String)object2);
                if (!TextUtils.isEmpty((CharSequence)object3)) {
                    return new a(0, new String[]{object3});
                }
            } else {
                object2 = b.get(object3);
                if (object2 != null) {
                    return new a((Integer)object2, null);
                }
                if ((object3 = a.get(object3)) != null) {
                    return new a(0, (String[])object3);
                }
            }
            --n8;
        }
        return null;
    }

    private static boolean d(String string) {
        if (!string.startsWith("/android/")) {
            return false;
        }
        return string.startsWith("/android/data/") || string.startsWith("/android/media/") || string.startsWith("/android/obb/") || string.startsWith("/android/sandbox/");
        {
        }
    }

    public static boolean e(String string) {
        if (string == null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");
        stringBuilder.append(string.toLowerCase());
        string = stringBuilder.toString();
        if (b.containsKey(string)) {
            return true;
        }
        if (a.containsKey(string)) {
            return true;
        }
        return c.contains(string);
    }

    public static class a {
        public String[] a;
        public int b;

        a(int n8, String[] stringArray) {
            this.b = n8;
            this.a = stringArray;
        }
    }
}

