/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V2;
import ax.b6.Y2;
import ax.b6.e6;
import ax.b6.h3;

public final class d6
implements e6 {
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
        h3 h32 = new h3(V2.a("com.google.android.gms.measurement")).f().e();
        a = h32.b("measurement.ad_id_cache_time", 10000L);
        b = h32.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = h32.b("measurement.max_bundles_per_iteration", 100L);
        d = h32.b("measurement.config.cache_time", 86400000L);
        h32.c("measurement.log_tag", "FA");
        e = h32.c("measurement.config.url_authority", "app-measurement.com");
        f = h32.c("measurement.config.url_scheme", "https");
        g = h32.b("measurement.upload.debug_upload_interval", 1000L);
        h = h32.b("measurement.session.engagement_interval", 3600000L);
        i = h32.c("measurement.rb.attribution.event_params", "value|currency");
        h32.b("measurement.id.rb.attribution.app_allowlist", 0L);
        j = h32.c("measurement.sgtm.google_signal.url", "https://app-measurement.com/s");
        k = h32.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        l = h32.b("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        m = h32.b("measurement.upload.max_event_parameter_value_length", 100L);
        n = h32.b("measurement.store.max_stored_events_per_app", 100000L);
        o = h32.b("measurement.experiment.max_ids", 50L);
        p = h32.b("measurement.audience.filter_result_max_count", 200L);
        q = h32.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        r = h32.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        s = h32.b("measurement.alarm_manager.minimum_interval", 60000L);
        t = h32.b("measurement.upload.minimum_delay", 500L);
        u = h32.b("measurement.monitoring.sample_period_millis", 86400000L);
        v = h32.c("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        w = h32.b("measurement.upload.realtime_upload_interval", 10000L);
        x = h32.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        h32.b("measurement.config.cache_time.service", 3600000L);
        y = h32.b("measurement.service_client.idle_disconnect_millis", 5000L);
        h32.c("measurement.log_tag.service", "FA-SVC");
        z = h32.c("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda");
        A = h32.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        B = h32.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        C = h32.b("measurement.rb.attribution.max_queue_time", 1209600000L);
        D = h32.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        E = h32.c("measurement.rb.attribution.query_parameters_to_remove", "");
        F = h32.c("measurement.rb.attribution.uri_scheme", "https");
        G = h32.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        H = h32.b("measurement.redaction.app_instance_id.ttl", 0x6DDD00L);
        I = h32.b("measurement.upload.backoff_period", 43200000L);
        J = h32.b("measurement.upload.initial_upload_delay_time", 15000L);
        K = h32.b("measurement.upload.interval", 3600000L);
        L = h32.b("measurement.upload.max_bundle_size", 65536L);
        M = h32.b("measurement.upload.max_bundles", 100L);
        N = h32.b("measurement.upload.max_conversions_per_day", 500L);
        O = h32.b("measurement.upload.max_error_events_per_day", 1000L);
        P = h32.b("measurement.upload.max_events_per_bundle", 1000L);
        Q = h32.b("measurement.upload.max_events_per_day", 100000L);
        R = h32.b("measurement.upload.max_public_events_per_day", 50000L);
        S = h32.b("measurement.upload.max_queue_time", 2419200000L);
        T = h32.b("measurement.upload.max_realtime_events_per_day", 10L);
        U = h32.b("measurement.upload.max_batch_size", 65536L);
        V = h32.b("measurement.upload.retry_count", 6L);
        W = h32.b("measurement.upload.retry_time", 1800000L);
        X = h32.c("measurement.upload.url", "https://app-measurement.com/a");
        Y = h32.b("measurement.upload.window_interval", 3600000L);
        Z = h32.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override
    public final long A() {
        return r.f();
    }

    @Override
    public final long B() {
        return Y.f();
    }

    @Override
    public final long C() {
        return G.f();
    }

    @Override
    public final long D() {
        return O.f();
    }

    @Override
    public final String E() {
        return D.f();
    }

    @Override
    public final long F() {
        return s.f();
    }

    @Override
    public final String G() {
        return e.f();
    }

    @Override
    public final long H() {
        return H.f();
    }

    @Override
    public final long I() {
        return P.f();
    }

    @Override
    public final String J() {
        return E.f();
    }

    @Override
    public final long K() {
        return V.f();
    }

    @Override
    public final long L() {
        return M.f();
    }

    @Override
    public final String M() {
        return z.f();
    }

    @Override
    public final long N() {
        return A.f();
    }

    @Override
    public final long O() {
        return W.f();
    }

    @Override
    public final long P() {
        return q.f();
    }

    @Override
    public final long Q() {
        return C.f();
    }

    @Override
    public final long R() {
        return N.f();
    }

    @Override
    public final String S() {
        return B.f();
    }

    @Override
    public final long T() {
        return K.f();
    }

    @Override
    public final String U() {
        return j.f();
    }

    @Override
    public final long V() {
        return x.f();
    }

    @Override
    public final long W() {
        return U.f();
    }

    @Override
    public final long X() {
        return o.f();
    }

    @Override
    public final long Y() {
        return L.f();
    }

    @Override
    public final String Z() {
        return v.f();
    }

    @Override
    public final long a() {
        return a.f();
    }

    @Override
    public final long a0() {
        return y.f();
    }

    @Override
    public final long b() {
        return b.f();
    }

    @Override
    public final long c() {
        return c.f();
    }

    @Override
    public final long d() {
        return m.f();
    }

    @Override
    public final long e() {
        return d.f();
    }

    @Override
    public final long f() {
        return g.f();
    }

    @Override
    public final long g() {
        return h.f();
    }

    @Override
    public final long i() {
        return l.f();
    }

    @Override
    public final long j() {
        return k.f();
    }

    @Override
    public final long k() {
        return n.f();
    }

    @Override
    public final long l() {
        return p.f();
    }

    @Override
    public final long m() {
        return t.f();
    }

    @Override
    public final String n() {
        return f.f();
    }

    @Override
    public final long o() {
        return I.f();
    }

    @Override
    public final long p() {
        return T.f();
    }

    @Override
    public final long q() {
        return S.f();
    }

    @Override
    public final long r() {
        return Q.f();
    }

    @Override
    public final String s() {
        return F.f();
    }

    @Override
    public final String t() {
        return Z.f();
    }

    @Override
    public final long u() {
        return u.f();
    }

    @Override
    public final long v() {
        return J.f();
    }

    @Override
    public final String w() {
        return i.f();
    }

    @Override
    public final long x() {
        return w.f();
    }

    @Override
    public final long y() {
        return R.f();
    }

    @Override
    public final String z() {
        return X.f();
    }
}

