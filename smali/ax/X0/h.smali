.class final Lax/X0/h;
.super Lax/J9/g;
.source "SourceFile"


# static fields
.field private static final d:[Ljava/lang/String;

.field private static final e:Ljava/lang/Object;

.field private static f:Lax/X0/h;


# instance fields
.field private final c:[S


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const-string v0, "GM2"

    .line 2
    .line 3
    const-string v1, "ringtone"

    .line 4
    .line 5
    const-string v2, "wavetable"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lax/X0/h;->d:[Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lax/X0/h;->e:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
    .line 21
.end method

.method private constructor <init>([S)V
    .registers 4

    .line 1
    const-string v0, "SonivoxVoiceDescription"

    .line 2
    .line 3
    invoke-static {}, Lax/X0/i;->c()[Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, v0, v1}, Lax/J9/g;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lax/X0/h;->c:[S

    .line 11
    .line 12
    return-void
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

.method public static d(Landroid/content/Context;)Lax/X0/h;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/X0/c;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/X0/h;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget-object v1, Lax/X0/h;->f:Lax/X0/h;

    .line 5
    .line 6
    if-nez v1, :cond_15

    .line 7
    .line 8
    new-instance v1, Lax/X0/h;

    .line 9
    .line 10
    invoke-static {p0}, Lax/X0/i;->h(Landroid/content/Context;)[S

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v1, p0}, Lax/X0/h;-><init>([S)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lax/X0/h;->f:Lax/X0/h;

    .line 18
    .line 19
    goto :goto_15

    .line 20
    :catchall_13
    move-exception p0

    .line 21
    goto :goto_19

    .line 22
    :cond_15
    :goto_15
    sget-object p0, Lax/X0/h;->f:Lax/X0/h;

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object p0

    .line 26
    :goto_19
    monitor-exit v0
    :try_end_1a
    .catchall {:try_start_3 .. :try_end_1a} :catchall_13

    .line 27
    throw p0
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


# virtual methods
.method public a()Lax/I9/y;
    .registers 3

    .line 1
    new-instance v0, Lax/X0/g;

    .line 2
    .line 3
    iget-object v1, p0, Lax/X0/h;->c:[S

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lax/X0/g;-><init>([S)V

    .line 6
    .line 7
    .line 8
    return-object v0
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
