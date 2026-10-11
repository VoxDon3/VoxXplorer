package ax.s3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ax.c3.K;
import ax.u3.C3180B;
import ax.u3.z;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {
    static HashMap<ax.Q2.f, c> a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.Q2.f.values().length];
            a = iArr;
            try {
                iArr[ax.Q2.f.o0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ax.Q2.f.p0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ax.Q2.f.x0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ax.Q2.f.u0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ax.Q2.f.v0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: ax.s3.b$b, reason: collision with other inner class name */
    enum EnumC0447b {
        SHAPE,
        IMAGE,
        CX_SHAPE,
        NONE
    }

    static class c {
        int a;
        int b;
        int c;
        int d;
        EnumC0447b e;
        EnumC0447b f;

        c(int i, int i2, int i3, EnumC0447b enumC0447b, int i4, EnumC0447b enumC0447b2) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = enumC0447b;
            this.f = enumC0447b2;
            EnumC0447b enumC0447b3 = EnumC0447b.CX_SHAPE;
            if (enumC0447b == enumC0447b3) {
                this.e = EnumC0447b.SHAPE;
            }
            if (enumC0447b2 == enumC0447b3) {
                this.f = EnumC0447b.SHAPE;
            }
        }
    }

    static {
        a();
    }

    private static void a() {
        a = new HashMap<>();
        ax.Q2.f fVar = ax.Q2.f.l0;
        EnumC0447b enumC0447b = EnumC0447b.CX_SHAPE;
        m(fVar, new c(R.string.location_home, R.color.shape_home, R.drawable.icon_home, enumC0447b, R.drawable.icon_home, enumC0447b));
        ax.Q2.f fVar2 = ax.Q2.f.m0;
        EnumC0447b enumC0447b2 = EnumC0447b.NONE;
        m(fVar2, new c(0, 0, 0, enumC0447b2, 0, enumC0447b2));
        ax.Q2.f fVar3 = ax.Q2.f.n0;
        EnumC0447b enumC0447b3 = EnumC0447b.SHAPE;
        m(fVar3, new c(R.string.location_local, 0, R.drawable.v_home_shape_none, enumC0447b3, R.drawable.v_shape_none, enumC0447b3));
        m(ax.Q2.f.o0, new c(R.string.location_mainstorage, R.color.shape_main_storage, R.drawable.icon_main_storage, enumC0447b, R.drawable.icon_main_storage_s, enumC0447b));
        m(ax.Q2.f.p0, new c(R.string.location_sdcard, R.color.shape_sdcard, R.drawable.icon_sd, enumC0447b, R.drawable.icon_sd_s, enumC0447b));
        m(ax.Q2.f.t0, new c(R.string.location_system, R.color.shape_system, R.drawable.icon_folder_system, enumC0447b, R.drawable.v_shape_system, enumC0447b));
        m(ax.Q2.f.q0, new c(R.string.location_download, R.color.shape_download, R.drawable.icon_folder_download, enumC0447b, R.drawable.icon_folder_download_s, enumC0447b));
        m(ax.Q2.f.r0, new c(R.string.folder_camera, R.color.shape_camera, R.drawable.icon_folder_camera, enumC0447b, R.drawable.icon_folder_camera_s, enumC0447b));
        m(ax.Q2.f.s0, new c(R.string.location_dualapps, R.color.shape_dual_storage, R.drawable.icon_dual_storage, enumC0447b, R.drawable.icon_dual_storage_s, enumC0447b));
        m(ax.Q2.f.u0, new c(R.string.location_usbstorage, R.color.shape_usb, R.drawable.icon_usb_storage, enumC0447b, R.drawable.icon_usb_storage_s, enumC0447b));
        m(ax.Q2.f.v0, new c(R.string.location_usbstorage, R.color.shape_usb, R.drawable.icon_usb_storage, enumC0447b, R.drawable.icon_usb_storage_s, enumC0447b));
        m(ax.Q2.f.x0, new c(R.string.location_sdcard, R.color.shape_sdcard, R.drawable.icon_sd, enumC0447b, R.drawable.icon_sd_s, enumC0447b));
        m(ax.Q2.f.b1, new c(R.string.location_usbstorage, R.color.shape_usb_raw, R.drawable.icon_usb_storage_raw, enumC0447b, R.drawable.icon_usb_storage_raw_s, enumC0447b));
        m(ax.Q2.f.c1, new c(R.string.location_usbstorage, R.color.shape_usb, R.drawable.icon_usb_storage, enumC0447b, R.drawable.icon_usb_storage_s, enumC0447b));
        m(ax.Q2.f.d1, new c(R.string.location_sdcard, R.color.shape_sdcard, R.drawable.icon_sd, enumC0447b, R.drawable.icon_sd_s, enumC0447b));
        m(ax.Q2.f.e1, new c(R.string.location_optical, R.color.shape_optical, R.drawable.icon_optical_storage, enumC0447b, R.drawable.icon_optical_storage_s, enumC0447b));
        m(ax.Q2.f.w0, new c(R.string.location_chrome, R.color.shape_chromeos, R.drawable.icon_chromeos_storage, enumC0447b, R.drawable.icon_chromeos_storage_s, enumC0447b));
        m(ax.Q2.f.f1, new c(R.string.location_chrome, R.color.shape_chromeos, R.drawable.icon_chromeos_storage, enumC0447b, R.drawable.icon_chromeos_storage_s, enumC0447b));
        m(ax.Q2.f.g1, new c(R.string.location_unclassified_storage, R.color.shape_unknown_storage, R.drawable.icon_unknown_storage, enumC0447b, R.drawable.icon_unknown_storage_s, enumC0447b));
        m(ax.Q2.f.h1, new c(R.string.location_usbstorage, R.color.shape_usb_mtp, R.drawable.icon_usb_storage, enumC0447b, R.drawable.icon_usb_storage_s, enumC0447b));
        m(ax.Q2.f.y0, new c(R.string.location_library, 0, R.drawable.v_home_shape_none, enumC0447b3, R.drawable.v_shape_none, enumC0447b3));
        m(ax.Q2.f.z0, new c(R.string.location_images, R.color.shape_image, R.drawable.v_home_shape_image, enumC0447b3, R.drawable.v_shape_image, enumC0447b3));
        m(ax.Q2.f.B0, new c(R.string.location_video, R.color.shape_video, R.drawable.v_home_shape_video, enumC0447b3, R.drawable.v_shape_video, enumC0447b3));
        m(ax.Q2.f.A0, new c(R.string.location_audio, R.color.shape_music, R.drawable.v_home_shape_music, enumC0447b3, R.drawable.v_shape_music, enumC0447b3));
        m(ax.Q2.f.C0, new c(R.string.location_document, R.color.shape_document, R.drawable.v_home_shape_document, enumC0447b3, R.drawable.v_shape_document, enumC0447b3));
        m(ax.Q2.f.D0, new c(R.string.location_archive, R.color.shape_archive, R.drawable.v_home_shape_archive, enumC0447b3, R.drawable.v_shape_archive, enumC0447b3));
        m(ax.Q2.f.E0, new c(R.string.location_favorite, R.color.shape_favorite, R.drawable.v_home_shape_favorite, enumC0447b3, R.drawable.v_shape_favorite, enumC0447b3));
        m(ax.Q2.f.F0, new c(R.string.location_new_files, R.color.shape_new_files, R.drawable.v_home_shape_new_files, enumC0447b3, R.drawable.v_shape_new_files, enumC0447b3));
        m(ax.Q2.f.G0, new c(R.string.location_remote, R.color.shape_remote, R.drawable.v_home_shape_remote, enumC0447b3, R.drawable.v_shape_remote, enumC0447b3));
        m(ax.Q2.f.H0, new c(R.string.location_ftp, R.color.shape_network, R.drawable.icon_folder_ftp, enumC0447b, R.drawable.icon_folder_ftp_s, enumC0447b));
        m(ax.Q2.f.I0, new c(R.string.location_sftp, R.color.shape_network, R.drawable.icon_folder_sftp, enumC0447b, R.drawable.icon_folder_sftp_s, enumC0447b));
        m(ax.Q2.f.J0, new c(R.string.location_smb, R.color.shape_network, R.drawable.icon_folder_lan, enumC0447b, R.drawable.icon_folder_lan_s, enumC0447b));
        m(ax.Q2.f.K0, new c(R.string.location_webdav, R.color.shape_network, R.drawable.icon_folder_webdav, enumC0447b, R.drawable.icon_folder_webdav_s, enumC0447b));
        m(ax.Q2.f.L0, new c(R.string.location_lan, R.color.shape_network, R.drawable.icon_folder_lan, enumC0447b, R.drawable.icon_folder_lan_s, enumC0447b));
        m(ax.Q2.f.M0, new c(R.string.location_cloud, R.color.shape_cloud, R.drawable.v_home_shape_cloud, enumC0447b3, R.drawable.v_shape_cloud, enumC0447b3));
        ax.Q2.f fVar4 = ax.Q2.f.N0;
        EnumC0447b enumC0447b4 = EnumC0447b.IMAGE;
        m(fVar4, new c(R.string.location_dropbox, 0, R.drawable.cloud_icon_dropbox_l, enumC0447b4, R.drawable.cloud_icon_dropbox, enumC0447b3));
        m(ax.Q2.f.O0, new c(R.string.location_googledrive, 0, R.drawable.cloud_icon_googledrive_l, enumC0447b4, R.drawable.cloud_icon_googledrive, enumC0447b3));
        m(ax.Q2.f.P0, new c(R.string.location_onedrive, 0, R.drawable.cloud_icon_onedrive_l, enumC0447b4, R.drawable.cloud_icon_onedrive, enumC0447b3));
        m(ax.Q2.f.Q0, new c(R.string.location_yandex, 0, R.drawable.cloud_icon_yandex_l, enumC0447b4, R.drawable.cloud_icon_yandex, enumC0447b3));
        m(ax.Q2.f.R0, new c(R.string.location_pcloud, 0, R.drawable.icon_pcloud_l, enumC0447b3, R.drawable.icon_pcloud_s, enumC0447b3));
        m(ax.Q2.f.T0, new c(R.string.location_nextcloud, 0, R.drawable.icon_nextcloud_l, enumC0447b3, R.drawable.icon_nextcloud_s, enumC0447b3));
        m(ax.Q2.f.U0, new c(R.string.location_owncloud, 0, R.drawable.icon_owncloud_l, enumC0447b3, R.drawable.icon_owncloud_s, enumC0447b3));
        m(ax.Q2.f.S0, new c(R.string.location_box, 0, R.drawable.cloud_icon_box_l, enumC0447b4, R.drawable.cloud_icon_box, enumC0447b3));
        m(ax.Q2.f.V0, new c(R.string.location_app, R.color.shape_app, R.drawable.v_home_shape_app, enumC0447b3, R.drawable.v_shape_app, enumC0447b3));
        m(ax.Q2.f.q1, new c(R.string.location_app, R.color.shape_app, R.drawable.v_home_shape_app, enumC0447b3, R.drawable.v_shape_app, enumC0447b3));
        m(ax.Q2.f.r1, new c(R.string.location_unused_apps, R.color.shape_app, R.drawable.v_home_shape_app, enumC0447b3, R.drawable.v_shape_app, enumC0447b3));
        m(ax.Q2.f.W0, new c(R.string.location_server, R.color.shape_server, R.drawable.v_home_shape_server, enumC0447b3, R.drawable.v_shape_server, enumC0447b3));
        m(ax.Q2.f.X0, new c(R.string.location_archive_viewer, R.color.shape_archive, R.drawable.icon_file_archive, enumC0447b, R.drawable.icon_file_archive_s, enumC0447b4));
        m(ax.Q2.f.Y0, new c(R.string.location_network, R.color.shape_add, R.drawable.v_home_shape_add, enumC0447b3, R.drawable.ic_add, enumC0447b3));
        m(ax.Q2.f.Z0, new c(R.string.upgrade_to_premium, R.color.shape_none, R.drawable.ic_colored_crown, enumC0447b3, R.drawable.ic_colored_crown, enumC0447b3));
        m(ax.Q2.f.a1, new c(R.string.debug, 0, R.drawable.icon_debug, enumC0447b4, R.drawable.icon_debug, enumC0447b4));
        m(ax.Q2.f.i1, new c(R.string.location_analysis, R.color.shape_analysis, R.drawable.icon_analysis, enumC0447b, R.drawable.icon_analysis_s, enumC0447b));
        m(ax.Q2.f.j1, new c(R.string.large_files, R.color.shape_analysis, R.drawable.icon_analysis, enumC0447b, 0, enumC0447b2));
        m(ax.Q2.f.k1, new c(R.string.large_folders, R.color.shape_analysis, R.drawable.icon_analysis, enumC0447b, 0, enumC0447b2));
        m(ax.Q2.f.l1, new c(R.string.app_caches, R.color.shape_analysis, R.drawable.icon_analysis, enumC0447b, 0, enumC0447b2));
        m(ax.Q2.f.m1, new c(R.string.duplicate_files, R.color.shape_analysis, R.drawable.icon_analysis, enumC0447b, 0, enumC0447b2));
        m(ax.Q2.f.n1, new c(R.string.duplicate_downloads, R.color.shape_analysis, R.drawable.icon_analysis, enumC0447b, 0, enumC0447b2));
        m(ax.Q2.f.o1, new c(R.string.recycle_bin, R.color.shape_recyclebin, R.drawable.icon_recycle_bin, enumC0447b, 0, enumC0447b2));
        m(ax.Q2.f.p1, new c(R.string.recycle_bin, R.color.shape_recyclebin, R.drawable.icon_recycle_bin, enumC0447b, R.drawable.icon_recycle_bin_s, enumC0447b));
        m(ax.Q2.f.s1, new c(R.string.search_hint, R.color.shape_none, R.drawable.ic_ab_search, enumC0447b, R.drawable.ic_ab_search, enumC0447b));
        m(ax.Q2.f.t1, new c(0, 0, 0, enumC0447b2, 0, enumC0447b2));
    }

    private static int b(boolean z, boolean z2) {
        return z ? z2 ? R.drawable.icon_folder_full : R.drawable.icon_folder_full_s : z2 ? R.drawable.icon_folder_empty : R.drawable.icon_folder_empty_s;
    }

    private static Drawable c(Context context, boolean z, boolean z2, int i) {
        return z.k(context, b(z, z2), i, 0, R.color.shape_invert);
    }

    public static Drawable d(Context context, ax.Q2.f fVar) {
        int k = k(fVar, Boolean.TRUE);
        c cVar = a.get(fVar);
        Drawable mutate = ax.U.a.r(C3045a.c(context, k)).mutate();
        if (cVar.f == EnumC0447b.SHAPE) {
            ax.U.a.n(mutate, ax.Q.b.c(context, R.color.desktop2_carousel_foreground_color));
        }
        int e = C3180B.e(context, 24);
        mutate.setBounds(0, 0, e, e);
        return mutate;
    }

    public static Drawable e(Context context, ax.Q2.f fVar, Object obj) {
        c cVar = a.get(fVar);
        if (cVar == null || cVar.c == 0) {
            return null;
        }
        int h = h(fVar, obj);
        return (fVar == ax.Q2.f.W0 || fVar == ax.Q2.f.Y0) ? z.k(context, R.drawable.bg_desktop2_item, h, cVar.b, R.color.shape_invert) : z.k(context, R.drawable.bg_desktop2_no_invert, h, 0, 0);
    }

    public static Drawable f(Context context, ax.Q2.f fVar, Object obj) {
        c cVar = a.get(fVar);
        if (cVar == null || cVar.c == 0) {
            return null;
        }
        int h = h(fVar, obj);
        return cVar.e == EnumC0447b.SHAPE ? z.k(context, R.drawable.bg_desktop2_item, h, cVar.b, R.color.shape_invert) : z.k(context, R.drawable.bg_desktop2_no_invert, h, 0, 0);
    }

    public static Drawable g(Context context, AbstractC3595n abstractC3595n, boolean z, boolean z2) {
        if (abstractC3595n != null && (abstractC3595n.P() == ax.Q2.f.t0 || abstractC3595n.P() == ax.Q2.f.o0)) {
            C3605y c3605y = (C3605y) abstractC3595n;
            K B0 = c3605y.B0();
            String E = c3605y.E();
            if (abstractC3595n.P() != B0.d() && E.equals(B0.e())) {
                int i = a.a[B0.d().ordinal()];
                if (i == 1) {
                    return c(context, z, z2, R.drawable.v_folder_shape_storage);
                }
                if (i == 2) {
                    return c(context, z, z2, R.drawable.v_folder_shape_sdcard);
                }
                if (i == 3) {
                    return c(context, z, z2, R.drawable.v_folder_shape_sdcard);
                }
                if (i == 4 || i == 5) {
                    return c(context, z, z2, R.drawable.v_folder_shape_usb);
                }
            }
        }
        return C3045a.c(context, b(z, z2));
    }

    public static int h(ax.Q2.f fVar, Object obj) {
        return fVar == ax.Q2.f.o0 ? fVar.q0() ? R.drawable.icon_sd : R.drawable.icon_main_storage : fVar == ax.Q2.f.p0 ? fVar.q0() ? !ax.Z2.j.F().t0() ? R.drawable.icon_sd_no : R.drawable.icon_sd : !ax.Z2.j.F().t0() ? R.drawable.icon_main_storage_no : R.drawable.icon_main_storage : fVar == ax.Q2.f.p1 ? ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) ? R.drawable.icon_recycle_bin_full : R.drawable.icon_recycle_bin : a.get(fVar).c;
    }

    public static Drawable i(Context context, ax.Q2.f fVar) {
        if (fVar == ax.Q2.f.z0) {
            return C3045a.c(context, R.drawable.media_thumb_image);
        }
        if (fVar == ax.Q2.f.B0) {
            return C3045a.c(context, R.drawable.media_thumb_video);
        }
        if (fVar == ax.Q2.f.A0) {
            return C3045a.c(context, R.drawable.media_thumb_music);
        }
        return null;
    }

    public static Drawable j(Context context, ax.Q2.f fVar, boolean z) {
        int k = k(fVar, Boolean.TRUE);
        c cVar = a.get(fVar);
        Drawable c2 = C3045a.c(context, k);
        if (c2 == null) {
            ax.Ha.c.h().f().b("FAILED TO LOAD LOCATION ICON").g("location:" + fVar.I()).h();
            c2 = C3045a.c(context, R.drawable.icon_folder_full_s);
        }
        Drawable mutate = ax.U.a.r(c2).mutate();
        if (cVar.f == EnumC0447b.SHAPE) {
            ax.U.a.n(mutate, z ? ax.Q.b.c(context, R.color.pathbar_text_selected) : ax.Q.b.c(context, R.color.pathbar_text_normal));
        }
        int e = C3180B.e(context, 24);
        mutate.setBounds(0, 0, e, e);
        return mutate;
    }

    public static int k(ax.Q2.f fVar, Object obj) {
        return fVar == ax.Q2.f.o0 ? fVar.q0() ? R.drawable.icon_sd_s : R.drawable.icon_main_storage_s : fVar == ax.Q2.f.p0 ? fVar.q0() ? !ax.Z2.j.F().t0() ? R.drawable.icon_sd_no_s : R.drawable.icon_sd_s : !ax.Z2.j.F().t0() ? R.drawable.icon_main_storage_no_s : R.drawable.icon_main_storage_s : fVar == ax.Q2.f.p1 ? ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) ? R.drawable.icon_recycle_bin_full_s : R.drawable.icon_recycle_bin_s : a.get(fVar).d;
    }

    public static int l(ax.Q2.f fVar) {
        return fVar == ax.Q2.f.p0 ? fVar.q0() ? R.string.location_sdcard : R.string.location_internal_storage : a.get(fVar).a;
    }

    private static void m(ax.Q2.f fVar, c cVar) {
        a.put(fVar, cVar);
    }
}
