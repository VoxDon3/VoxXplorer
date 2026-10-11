package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    final long c0;
    final long d0;
    final float e0;
    final long f0;
    final int g0;
    final CharSequence h0;
    final long i0;
    List<CustomAction> j0;
    final long k0;
    final Bundle l0;
    private PlaybackState m0;
    final int q;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        static void t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        static void u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            Bundle extras;
            extras = playbackState.getExtras();
            return extras;
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.q = i;
        this.c0 = j;
        this.d0 = j2;
        this.e0 = f;
        this.f0 = j3;
        this.g0 = i2;
        this.h0 = charSequence;
        this.i0 = j4;
        this.j0 = new ArrayList(list);
        this.k0 = j5;
        this.l0 = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = b.j(playbackState);
        if (j != null) {
            ArrayList arrayList2 = new ArrayList(j.size());
            Iterator<PlaybackState.CustomAction> it = j.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
        playbackStateCompat.m0 = playbackState;
        return playbackStateCompat;
    }

    public long b() {
        return this.f0;
    }

    public CharSequence c() {
        return this.h0;
    }

    public Bundle d() {
        return this.l0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.i0;
    }

    public float f() {
        return this.e0;
    }

    public Object g() {
        if (this.m0 == null) {
            PlaybackState.Builder d2 = b.d();
            b.x(d2, this.q, this.c0, this.e0, this.i0);
            b.u(d2, this.d0);
            b.s(d2, this.f0);
            b.v(d2, this.h0);
            Iterator<CustomAction> it = this.j0.iterator();
            while (it.hasNext()) {
                b.a(d2, (PlaybackState.CustomAction) it.next().b());
            }
            b.t(d2, this.k0);
            if (Build.VERSION.SDK_INT >= 22) {
                c.b(d2, this.l0);
            }
            this.m0 = b.c(d2);
        }
        return this.m0;
    }

    public long i() {
        return this.c0;
    }

    public int j() {
        return this.q;
    }

    public String toString() {
        return "PlaybackState {state=" + this.q + ", position=" + this.c0 + ", buffered position=" + this.d0 + ", speed=" + this.e0 + ", updated=" + this.i0 + ", actions=" + this.f0 + ", error code=" + this.g0 + ", error message=" + this.h0 + ", custom actions=" + this.j0 + ", active item id=" + this.k0 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.q);
        parcel.writeLong(this.c0);
        parcel.writeFloat(this.e0);
        parcel.writeLong(this.i0);
        parcel.writeLong(this.d0);
        parcel.writeLong(this.f0);
        TextUtils.writeToParcel(this.h0, parcel, i);
        parcel.writeTypedList(this.j0);
        parcel.writeLong(this.k0);
        parcel.writeBundle(this.l0);
        parcel.writeInt(this.g0);
    }

    public static final class d {
        private final List<CustomAction> a;
        private int b;
        private long c;
        private long d;
        private float e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;

        public d() {
            this.a = new ArrayList();
            this.j = -1L;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public d b(long j) {
            this.f = j;
            return this;
        }

        public d c(long j) {
            this.j = j;
            return this;
        }

        @Deprecated
        public d d(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public d e(Bundle bundle) {
            this.k = bundle;
            return this;
        }

        public d f(int i, long j, float f, long j2) {
            this.b = i;
            this.c = j;
            this.i = j2;
            this.e = f;
            return this;
        }

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.j = -1L;
            this.b = playbackStateCompat.q;
            this.c = playbackStateCompat.c0;
            this.e = playbackStateCompat.e0;
            this.i = playbackStateCompat.i0;
            this.d = playbackStateCompat.d0;
            this.f = playbackStateCompat.f0;
            this.g = playbackStateCompat.g0;
            this.h = playbackStateCompat.h0;
            List<CustomAction> list = playbackStateCompat.j0;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.k0;
            this.k = playbackStateCompat.l0;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        private final CharSequence c0;
        private final int d0;
        private final Bundle e0;
        private PlaybackState.CustomAction f0;
        private final String q;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.q = str;
            this.c0 = charSequence;
            this.d0 = i;
            this.e0 = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l = b.l(customAction);
            MediaSessionCompat.a(l);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l);
            customAction2.f0 = customAction;
            return customAction2;
        }

        public Object b() {
            PlaybackState.CustomAction customAction = this.f0;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e = b.e(this.q, this.c0, this.d0);
            b.w(e, this.e0);
            return b.b(e);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.c0) + ", mIcon=" + this.d0 + ", mExtras=" + this.e0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.q);
            TextUtils.writeToParcel(this.c0, parcel, i);
            parcel.writeInt(this.d0);
            parcel.writeBundle(this.e0);
        }

        CustomAction(Parcel parcel) {
            this.q = parcel.readString();
            this.c0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d0 = parcel.readInt();
            this.e0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.q = parcel.readInt();
        this.c0 = parcel.readLong();
        this.e0 = parcel.readFloat();
        this.i0 = parcel.readLong();
        this.d0 = parcel.readLong();
        this.f0 = parcel.readLong();
        this.h0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j0 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.k0 = parcel.readLong();
        this.l0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.g0 = parcel.readInt();
    }
}
