package ax.b6;

import okhttp3.HttpUrl;

/* renamed from: ax.b6.d6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1538d6 implements InterfaceC1547e6 {
    private static final Y2<Long> A;
    private static final Y2<String> B;
    private static final Y2<Long> C;
    private static final Y2<String> D;
    private static final Y2<String> E;
    private static final Y2<String> F;
    private static final Y2<Long> G;
    private static final Y2<Long> H;
    private static final Y2<Long> I;
    private static final Y2<Long> J;
    private static final Y2<Long> K;
    private static final Y2<Long> L;
    private static final Y2<Long> M;
    private static final Y2<Long> N;
    private static final Y2<Long> O;
    private static final Y2<Long> P;
    private static final Y2<Long> Q;
    private static final Y2<Long> R;
    private static final Y2<Long> S;
    private static final Y2<Long> T;
    private static final Y2<Long> U;
    private static final Y2<Long> V;
    private static final Y2<Long> W;
    private static final Y2<String> X;
    private static final Y2<Long> Y;
    private static final Y2<String> Z;
    private static final Y2<Long> a;
    private static final Y2<Long> b;
    private static final Y2<Long> c;
    private static final Y2<Long> d;
    private static final Y2<String> e;
    private static final Y2<String> f;
    private static final Y2<Long> g;
    private static final Y2<Long> h;
    private static final Y2<String> i;
    private static final Y2<String> j;
    private static final Y2<Long> k;
    private static final Y2<Long> l;
    private static final Y2<Long> m;
    private static final Y2<Long> n;
    private static final Y2<Long> o;
    private static final Y2<Long> p;
    private static final Y2<Long> q;
    private static final Y2<Long> r;
    private static final Y2<Long> s;
    private static final Y2<Long> t;
    private static final Y2<Long> u;
    private static final Y2<String> v;
    private static final Y2<Long> w;
    private static final Y2<Long> x;
    private static final Y2<Long> y;
    private static final Y2<String> z;

    static {
        C1571h3 e2 = new C1571h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = e2.b("measurement.ad_id_cache_time", 10000L);
        b = e2.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = e2.b("measurement.max_bundles_per_iteration", 100L);
        d = e2.b("measurement.config.cache_time", 86400000L);
        e2.c("measurement.log_tag", "FA");
        e = e2.c("measurement.config.url_authority", "app-measurement.com");
        f = e2.c("measurement.config.url_scheme", "https");
        g = e2.b("measurement.upload.debug_upload_interval", 1000L);
        h = e2.b("measurement.session.engagement_interval", 3600000L);
        i = e2.c("measurement.rb.attribution.event_params", "value|currency");
        e2.b("measurement.id.rb.attribution.app_allowlist", 0L);
        j = e2.c("measurement.sgtm.google_signal.url", "https://app-measurement.com/s");
        k = e2.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        l = e2.b("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        m = e2.b("measurement.upload.max_event_parameter_value_length", 100L);
        n = e2.b("measurement.store.max_stored_events_per_app", 100000L);
        o = e2.b("measurement.experiment.max_ids", 50L);
        p = e2.b("measurement.audience.filter_result_max_count", 200L);
        q = e2.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        r = e2.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        s = e2.b("measurement.alarm_manager.minimum_interval", 60000L);
        t = e2.b("measurement.upload.minimum_delay", 500L);
        u = e2.b("measurement.monitoring.sample_period_millis", 86400000L);
        v = e2.c("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        w = e2.b("measurement.upload.realtime_upload_interval", 10000L);
        x = e2.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        e2.b("measurement.config.cache_time.service", 3600000L);
        y = e2.b("measurement.service_client.idle_disconnect_millis", 5000L);
        e2.c("measurement.log_tag.service", "FA-SVC");
        z = e2.c("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda");
        A = e2.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        B = e2.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        C = e2.b("measurement.rb.attribution.max_queue_time", 1209600000L);
        D = e2.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        E = e2.c("measurement.rb.attribution.query_parameters_to_remove", HttpUrl.FRAGMENT_ENCODE_SET);
        F = e2.c("measurement.rb.attribution.uri_scheme", "https");
        G = e2.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        H = e2.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        I = e2.b("measurement.upload.backoff_period", 43200000L);
        J = e2.b("measurement.upload.initial_upload_delay_time", 15000L);
        K = e2.b("measurement.upload.interval", 3600000L);
        L = e2.b("measurement.upload.max_bundle_size", 65536L);
        M = e2.b("measurement.upload.max_bundles", 100L);
        N = e2.b("measurement.upload.max_conversions_per_day", 500L);
        O = e2.b("measurement.upload.max_error_events_per_day", 1000L);
        P = e2.b("measurement.upload.max_events_per_bundle", 1000L);
        Q = e2.b("measurement.upload.max_events_per_day", 100000L);
        R = e2.b("measurement.upload.max_public_events_per_day", 50000L);
        S = e2.b("measurement.upload.max_queue_time", 2419200000L);
        T = e2.b("measurement.upload.max_realtime_events_per_day", 10L);
        U = e2.b("measurement.upload.max_batch_size", 65536L);
        V = e2.b("measurement.upload.retry_count", 6L);
        W = e2.b("measurement.upload.retry_time", 1800000L);
        X = e2.c("measurement.upload.url", "https://app-measurement.com/a");
        Y = e2.b("measurement.upload.window_interval", 3600000L);
        Z = e2.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long A() {
        return r.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long B() {
        return Y.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long C() {
        return G.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long D() {
        return O.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String E() {
        return D.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long F() {
        return s.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String G() {
        return e.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long H() {
        return H.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long I() {
        return P.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String J() {
        return E.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long K() {
        return V.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long L() {
        return M.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String M() {
        return z.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long N() {
        return A.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long O() {
        return W.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long P() {
        return q.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long Q() {
        return C.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long R() {
        return N.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String S() {
        return B.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long T() {
        return K.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String U() {
        return j.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long V() {
        return x.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long W() {
        return U.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long X() {
        return o.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long Y() {
        return L.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String Z() {
        return v.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long a() {
        return a.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long a0() {
        return y.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long b() {
        return b.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long c() {
        return c.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long d() {
        return m.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long e() {
        return d.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long f() {
        return g.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long g() {
        return h.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long i() {
        return l.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long j() {
        return k.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long k() {
        return n.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long l() {
        return p.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long m() {
        return t.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String n() {
        return f.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long o() {
        return I.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long p() {
        return T.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long q() {
        return S.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long r() {
        return Q.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String s() {
        return F.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String t() {
        return Z.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long u() {
        return u.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long v() {
        return J.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String w() {
        return i.f();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long x() {
        return w.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final long y() {
        return R.f().longValue();
    }

    @Override // ax.b6.InterfaceC1547e6
    public final String z() {
        return X.f();
    }
}
