.class public Lax/o3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o3/n$i;,
        Lax/o3/n$j;,
        Lax/o3/n$h;
    }
.end annotation


# static fields
.field private static l:Ljava/util/logging/Logger;

.field private static m:I

.field private static n:Ljava/lang/String;

.field private static o:I


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/net/nsd/NsdManager;

.field private c:Landroid/net/nsd/NsdManager$RegistrationListener;

.field private d:Landroid/net/nsd/NsdManager$DiscoveryListener;

.field private e:Lax/o3/n$h;

.field private f:Lax/o3/n$j;

.field private g:Ljava/net/InetAddress;

.field private h:Ljava/lang/String;

.field private i:Landroid/os/Handler;

.field private j:Ljava/util/concurrent/Executor;

.field private k:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.TransferServiceDiscovery"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lax/o3/n$h;->q:Lax/o3/n$h;

    .line 5
    .line 6
    iput-object v0, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 7
    .line 8
    iput-object p1, p0, Lax/o3/n;->a:Landroid/content/Context;

    .line 9
    .line 10
    new-instance v0, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lax/o3/n;->i:Landroid/os/Handler;

    .line 20
    .line 21
    new-instance v0, Lax/o3/n$a;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lax/o3/n$a;-><init>(Lax/o3/n;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lax/o3/n;->j:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    :try_start_22
    const-string v0, "servicediscovery"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroid/net/nsd/NsdManager;

    .line 42
    .line 43
    iput-object p1, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;
    :try_end_2c
    .catch Ljava/lang/RuntimeException; {:try_start_22 .. :try_end_2c} :catch_2c

    .line 44
    .line 45
    :catch_2c
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private B(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V
    .registers 10

    .line 1
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-object v0, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_e

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    goto :goto_33

    .line 15
    :cond_e
    new-instance v0, Lax/o3/n$e;

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v4, p1

    .line 19
    move-object v3, p2

    .line 20
    move-object v5, p3

    .line 21
    invoke-direct/range {v0 .. v5}, Lax/o3/n$e;-><init>(Lax/o3/n;Ljava/lang/String;Landroid/net/nsd/NsdManager$DiscoveryListener;Landroid/net/nsd/NsdServiceInfo;Lax/o3/n$i;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, v1, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {p1, v2, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :try_start_1c
    iget-object p1, v1, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 30
    .line 31
    iget-object p2, v1, Lax/o3/n;->j:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    invoke-static {p1, v4, p2, v0}, Lax/o3/i;->a(Landroid/net/nsd/NsdManager;Landroid/net/nsd/NsdServiceInfo;Ljava/util/concurrent/Executor;Landroid/net/nsd/NsdManager$ServiceInfoCallback;)V
    :try_end_23
    .catch Ljava/lang/RuntimeException; {:try_start_1c .. :try_end_23} :catch_24
    .catch Ljava/lang/LinkageError; {:try_start_1c .. :try_end_23} :catch_24

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_24
    nop

    .line 38
    iget-object p1, v1, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v3}, Lax/o3/n;->w(Landroid/net/nsd/NsdManager$DiscoveryListener;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_33

    .line 48
    .line 49
    invoke-direct {p0, v4, v3, v5}, Lax/o3/n;->D(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V

    .line 50
    .line 51
    .line 52
    :cond_33
    :goto_33
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private C(Ljava/lang/String;Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-ne v0, p2, :cond_d

    .line 8
    .line 9
    iget-object p2, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_d
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private D(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 2
    .line 3
    new-instance v1, Lax/o3/n$f;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2, p3}, Lax/o3/n$f;-><init>(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, Landroid/net/nsd/NsdManager;->resolveService(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$ResolveListener;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private E(Landroid/net/nsd/NsdServiceInfo;Ljava/net/InetAddress;)V
    .registers 4

    .line 1
    invoke-static {}, Lax/X2/Q;->p1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-static {p1, p2}, Lax/o3/l;->a(Landroid/net/nsd/NsdServiceInfo;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_e
    invoke-virtual {p1, p2}, Landroid/net/nsd/NsdServiceInfo;->setHost(Ljava/net/InetAddress;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private G(Landroid/net/nsd/NsdManager$DiscoveryListener;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 2
    .line 3
    if-eqz v0, :cond_21

    .line 4
    .line 5
    if-nez p1, :cond_7

    .line 6
    .line 7
    goto :goto_21

    .line 8
    :cond_7
    :try_start_7
    invoke-virtual {v0, p1}, Landroid/net/nsd/NsdManager;->stopServiceDiscovery(Landroid/net/nsd/NsdManager$DiscoveryListener;)V
    :try_end_a
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_a} :catch_16
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_a} :catch_b

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_b
    sget-object v0, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 13
    .line 14
    const-string v1, "DISCOVERY NOT STOPPED 2"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Lax/o3/n;->t(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 20
    .line 21
    .line 22
    goto :goto_20

    .line 23
    :catch_16
    sget-object v0, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 24
    .line 25
    const-string v1, "DISCOVERY NOT STOPPED 1"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, Lax/o3/n;->t(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 31
    .line 32
    .line 33
    :goto_20
    return-void

    .line 34
    :cond_21
    :goto_21
    invoke-direct {p0, p1}, Lax/o3/n;->t(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private I()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_39

    .line 10
    :cond_9
    iget-object v0, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v1}, Lj$/util/concurrent/ConcurrentHashMap;->clear()V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lax/X2/Q;->p1()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1f

    .line 30
    .line 31
    goto :goto_39

    .line 32
    :cond_1f
    array-length v1, v0

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_21
    if-ge v2, v1, :cond_39

    .line 35
    .line 36
    aget-object v3, v0, v2

    .line 37
    .line 38
    :try_start_25
    iget-object v4, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 39
    .line 40
    invoke-static {v3}, Lax/o3/j;->a(Ljava/lang/Object;)Landroid/net/nsd/NsdManager$ServiceInfoCallback;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v4, v3}, Lax/o3/k;->a(Landroid/net/nsd/NsdManager;Landroid/net/nsd/NsdManager$ServiceInfoCallback;)V
    :try_end_2e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_25 .. :try_end_2e} :catch_2f
    .catch Ljava/lang/ClassCastException; {:try_start_25 .. :try_end_2e} :catch_2f
    .catch Ljava/lang/LinkageError; {:try_start_25 .. :try_end_2e} :catch_2f

    .line 45
    .line 46
    .line 47
    goto :goto_36

    .line 48
    :catch_2f
    sget-object v3, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 49
    .line 50
    const-string v4, "unregister service info callback failed"

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_36
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_21

    .line 58
    :cond_39
    :goto_39
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private K(Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o3/n;->k:Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_30

    .line 10
    :cond_9
    invoke-static {}, Lax/X2/Q;->p1()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_10

    .line 15
    .line 16
    goto :goto_30

    .line 17
    :cond_10
    :try_start_10
    iget-object v1, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 18
    .line 19
    invoke-static {v0}, Lax/o3/j;->a(Ljava/lang/Object;)Landroid/net/nsd/NsdManager$ServiceInfoCallback;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v1, v0}, Lax/o3/k;->a(Landroid/net/nsd/NsdManager;Landroid/net/nsd/NsdManager$ServiceInfoCallback;)V
    :try_end_19
    .catch Ljava/lang/IllegalArgumentException; {:try_start_10 .. :try_end_19} :catch_1a
    .catch Ljava/lang/ClassCastException; {:try_start_10 .. :try_end_19} :catch_1a
    .catch Ljava/lang/LinkageError; {:try_start_10 .. :try_end_19} :catch_1a

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_1a
    sget-object v0, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "unregister service info callback failed : "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_30
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static synthetic a(Lax/o3/n;)Landroid/os/Handler;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o3/n;->i:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic b()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic c(Lax/o3/n;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/o3/n;->B(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method static synthetic d(Lax/o3/n;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/o3/n;->D(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method static synthetic e(Lax/o3/n;Landroid/net/nsd/NsdServiceInfo;)Ljava/net/InetAddress;
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o3/n;->u(Landroid/net/nsd/NsdServiceInfo;)Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic f(Lax/o3/n;Ljava/lang/String;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o3/n;->K(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic g(Lax/o3/n;Ljava/lang/String;Ljava/lang/Object;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/o3/n;->C(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method static synthetic h(Lax/o3/n;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lax/o3/n;->z(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method static synthetic i(Lax/o3/n;)Ljava/lang/String;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o3/n;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic j(Lax/o3/n;Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o3/n;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic k(Lax/o3/n;Landroid/net/nsd/NsdManager$RegistrationListener;)Landroid/net/nsd/NsdManager$RegistrationListener;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o3/n;->c:Landroid/net/nsd/NsdManager$RegistrationListener;

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic l(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o3/n;->t(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic m(Lax/o3/n;)Landroid/net/nsd/NsdManager$DiscoveryListener;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic n(Lax/o3/n;)Lax/o3/n$h;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic o(Lax/o3/n;Lax/o3/n$h;)Lax/o3/n$h;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic p(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o3/n;->G(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic q(Lax/o3/n;Lax/o3/n$j;)Lax/o3/n$j;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/o3/n;->f:Lax/o3/n$j;

    .line 2
    .line 3
    return-object p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic r(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;)Z
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/o3/n;->w(Landroid/net/nsd/NsdManager$DiscoveryListener;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private t(Landroid/net/nsd/NsdManager$DiscoveryListener;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    iget-object v0, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 4
    .line 5
    if-eq v0, p1, :cond_7

    .line 6
    .line 7
    return-void

    .line 8
    :cond_7
    invoke-direct {p0}, Lax/o3/n;->I()V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 13
    .line 14
    sget-object v0, Lax/o3/n$h;->q:Lax/o3/n$h;

    .line 15
    .line 16
    iput-object v0, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 17
    .line 18
    iget-object v0, p0, Lax/o3/n;->f:Lax/o3/n$j;

    .line 19
    .line 20
    iput-object p1, p0, Lax/o3/n;->f:Lax/o3/n$j;

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lax/o3/n;->y(Lax/o3/n$j;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private u(Landroid/net/nsd/NsdServiceInfo;)Ljava/net/InetAddress;
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->p1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    invoke-static {p1}, Lax/o3/m;->a(Landroid/net/nsd/NsdServiceInfo;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_18

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/net/InetAddress;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_18
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1a
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getHost()Ljava/net/InetAddress;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private w(Landroid/net/nsd/NsdManager$DiscoveryListener;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 2
    .line 3
    if-ne v0, p1, :cond_c

    .line 4
    .line 5
    iget-object p1, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 6
    .line 7
    sget-object v0, Lax/o3/n$h;->d0:Lax/o3/n$h;

    .line 8
    .line 9
    if-ne p1, v0, :cond_c

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_c
    const/4 p1, 0x0

    .line 14
    return p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private y(Lax/o3/n$j;)V
    .registers 4

    .line 1
    if-eqz p1, :cond_c

    .line 2
    .line 3
    iget-object v0, p0, Lax/o3/n;->i:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v1, Lax/o3/n$d;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lax/o3/n$d;-><init>(Lax/o3/n;Lax/o3/n$j;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lax/u3/B;->Z(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    :cond_c
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private z(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;)V
    .registers 8

    .line 1
    invoke-direct {p0, p2}, Lax/o3/n;->w(Landroid/net/nsd/NsdManager$DiscoveryListener;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    goto/16 :goto_83

    .line 8
    .line 9
    :cond_8
    invoke-direct {p0, p1}, Lax/o3/n;->u(Landroid/net/nsd/NsdServiceInfo;)Ljava/net/InetAddress;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_29

    .line 14
    .line 15
    sget-object p2, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 16
    .line 17
    new-instance p3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v0, "onService resolved host is null :  "

    .line 23
    .line 24
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p2, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    iget-object v1, p0, Lax/o3/n;->g:Ljava/net/InetAddress;

    .line 43
    .line 44
    if-eqz v1, :cond_3b

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3b

    .line 51
    .line 52
    sget-object p1, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 53
    .line 54
    const-string p2, "Ignore this device (same ip)"

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    sget-object v1, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 61
    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v3, "onService resolved :  "

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v3, ","

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getAttributes()Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v1, v0, v2, p1}, Lax/o3/o;->b(Ljava/lang/String;Ljava/net/InetAddress;ILjava/util/Map;)Lax/o3/o;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_83

    .line 121
    .line 122
    iget-object v0, p0, Lax/o3/n;->i:Landroid/os/Handler;

    .line 123
    .line 124
    new-instance v1, Lax/o3/n$g;

    .line 125
    .line 126
    invoke-direct {v1, p0, p2, p3, p1}, Lax/o3/n$g;-><init>(Lax/o3/n;Landroid/net/nsd/NsdManager$DiscoveryListener;Lax/o3/n$i;Lax/o3/o;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 130
    .line 131
    .line 132
    :cond_83
    :goto_83
    return-void
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method


# virtual methods
.method public A(Ljava/lang/String;I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o3/n;->c:Landroid/net/nsd/NsdManager$RegistrationListener;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_64

    .line 6
    :cond_5
    iget-object v0, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 7
    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    goto :goto_64

    .line 11
    :cond_a
    :try_start_a
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/o3/n;->g:Ljava/net/InetAddress;

    .line 16
    .line 17
    new-instance v0, Landroid/net/nsd/NsdServiceInfo;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/net/nsd/NsdServiceInfo;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Lax/o3/n;->v(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-object v1, p0, Lax/o3/n;->a:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v1, p1}, Lax/o3/o;->a(Landroid/content/Context;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Landroid/net/nsd/NsdServiceInfo;->setServiceName(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v1, "_fmtransferftp._tcp."

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/net/nsd/NsdServiceInfo;->setServiceType(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lax/o3/n;->g:Ljava/net/InetAddress;

    .line 41
    .line 42
    invoke-direct {p0, v0, v1}, Lax/o3/n;->E(Landroid/net/nsd/NsdServiceInfo;Ljava/net/InetAddress;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Landroid/net/nsd/NsdServiceInfo;->setPort(I)V

    .line 46
    .line 47
    .line 48
    const-string p2, "PROTOCOL"

    .line 49
    .line 50
    const-string v1, "FTPS"

    .line 51
    .line 52
    invoke-virtual {v0, p2, v1}, Landroid/net/nsd/NsdServiceInfo;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance p2, Lax/o3/n$b;

    .line 56
    .line 57
    invoke-direct {p2, p0, p1}, Lax/o3/n$b;-><init>(Lax/o3/n;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lax/o3/n;->c:Landroid/net/nsd/NsdManager$RegistrationListener;

    .line 61
    .line 62
    iget-object p1, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-virtual {p1, v0, v1, p2}, Landroid/net/nsd/NsdManager;->registerService(Landroid/net/nsd/NsdServiceInfo;ILandroid/net/nsd/NsdManager$RegistrationListener;)V
    :try_end_43
    .catch Ljava/net/UnknownHostException; {:try_start_a .. :try_end_43} :catch_46
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_43} :catch_44

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catch_44
    move-exception p1

    .line 70
    goto :goto_48

    .line 71
    :catch_46
    move-exception p1

    .line 72
    goto :goto_61

    .line 73
    :goto_48
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const-string v0, "TransferServiceDiscovery.registerService"

    .line 85
    .line 86
    invoke-virtual {p2, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 95
    .line 96
    .line 97
    goto :goto_64

    .line 98
    :goto_61
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    :goto_64
    return-void
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public F(Lax/o3/n$i;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 2
    .line 3
    sget-object v1, Lax/o3/n$h;->q:Lax/o3/n$h;

    .line 4
    .line 5
    if-eq v0, v1, :cond_7

    .line 6
    .line 7
    goto :goto_2f

    .line 8
    :cond_7
    if-nez p1, :cond_a

    .line 9
    .line 10
    goto :goto_2f

    .line 11
    :cond_a
    iget-object v0, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 12
    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    goto :goto_2f

    .line 16
    :cond_f
    sget-object v0, Lax/o3/n$h;->c0:Lax/o3/n$h;

    .line 17
    .line 18
    iput-object v0, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 19
    .line 20
    new-instance v0, Lax/o3/n$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lax/o3/n$c;-><init>(Lax/o3/n;Lax/o3/n$i;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 26
    .line 27
    :try_start_1a
    iget-object p1, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 28
    .line 29
    const-string v1, "_fmtransferftp._tcp."

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {p1, v1, v2, v0}, Landroid/net/nsd/NsdManager;->discoverServices(Ljava/lang/String;ILandroid/net/nsd/NsdManager$DiscoveryListener;)V
    :try_end_22
    .catch Ljava/lang/RuntimeException; {:try_start_1a .. :try_end_22} :catch_23

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_23
    sget-object p1, Lax/o3/n;->l:Ljava/util/logging/Logger;

    .line 37
    .line 38
    const-string v0, "DISCOVERY START FAILED"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lax/o3/n;->t(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 46
    .line 47
    .line 48
    :goto_2f
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public H(Lax/o3/n$j;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/o3/n;->y(Lax/o3/n$j;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    iget-object v0, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 10
    .line 11
    sget-object v1, Lax/o3/n$h;->q:Lax/o3/n$h;

    .line 12
    .line 13
    if-eq v0, v1, :cond_2d

    .line 14
    .line 15
    iget-object v1, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 16
    .line 17
    if-nez v1, :cond_13

    .line 18
    .line 19
    goto :goto_2d

    .line 20
    :cond_13
    sget-object v1, Lax/o3/n$h;->e0:Lax/o3/n$h;

    .line 21
    .line 22
    if-ne v0, v1, :cond_1c

    .line 23
    .line 24
    if-eqz p1, :cond_2c

    .line 25
    .line 26
    iput-object p1, p0, Lax/o3/n;->f:Lax/o3/n$j;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    iput-object v1, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 30
    .line 31
    iput-object p1, p0, Lax/o3/n;->f:Lax/o3/n$j;

    .line 32
    .line 33
    invoke-direct {p0}, Lax/o3/n;->I()V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lax/o3/n$h;->d0:Lax/o3/n$h;

    .line 37
    .line 38
    if-ne v0, p1, :cond_2c

    .line 39
    .line 40
    iget-object p1, p0, Lax/o3/n;->d:Landroid/net/nsd/NsdManager$DiscoveryListener;

    .line 41
    .line 42
    invoke-direct {p0, p1}, Lax/o3/n;->G(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    return-void

    .line 46
    :cond_2d
    :goto_2d
    invoke-direct {p0, p1}, Lax/o3/n;->y(Lax/o3/n$j;)V

    .line 47
    .line 48
    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public J()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o3/n;->b:Landroid/net/nsd/NsdManager;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    goto :goto_c

    .line 6
    :cond_5
    iget-object v1, p0, Lax/o3/n;->c:Landroid/net/nsd/NsdManager$RegistrationListener;

    .line 7
    .line 8
    if-eqz v1, :cond_c

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/net/nsd/NsdManager;->unregisterService(Landroid/net/nsd/NsdManager$RegistrationListener;)V

    .line 11
    .line 12
    .line 13
    :cond_c
    :goto_c
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public s()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lax/o3/n;->f:Lax/o3/n$j;

    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public v(Ljava/lang/String;I)I
    .registers 5

    .line 1
    sget v0, Lax/o3/n;->m:I

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    sget v0, Lax/o3/n;->o:I

    .line 6
    .line 7
    if-ne p2, v0, :cond_10

    .line 8
    .line 9
    sget-object v0, Lax/o3/n;->n:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lax/u3/B;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_26

    .line 16
    .line 17
    :cond_10
    new-instance v0, Ljava/util/Random;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 20
    .line 21
    .line 22
    const v1, 0xdbba0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const v1, 0x186a0

    .line 30
    .line 31
    .line 32
    add-int/2addr v0, v1

    .line 33
    sput v0, Lax/o3/n;->m:I

    .line 34
    .line 35
    sput-object p1, Lax/o3/n;->n:Ljava/lang/String;

    .line 36
    .line 37
    sput p2, Lax/o3/n;->o:I

    .line 38
    .line 39
    :cond_26
    sget p1, Lax/o3/n;->m:I

    .line 40
    .line 41
    return p1
.end method

.method public x()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o3/n;->e:Lax/o3/n$h;

    .line 2
    .line 3
    sget-object v1, Lax/o3/n$h;->q:Lax/o3/n$h;

    .line 4
    .line 5
    if-eq v0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_8
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
