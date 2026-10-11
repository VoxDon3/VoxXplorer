.class public Lax/r3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/r3/d$f;,
        Lax/r3/d$e;
    }
.end annotation


# static fields
.field private static final d:Ljava/util/logging/Logger;

.field private static e:F

.field private static f:Lax/ba/e;

.field private static g:Lax/ba/c;

.field private static h:Z

.field private static i:Landroid/os/Handler;

.field private static j:Landroid/content/BroadcastReceiver;

.field private static final k:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/voxdon/xplorer/file/o;

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    const-class v0, Lax/r3/d;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/r3/d;->d:Ljava/util/logging/Logger;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lax/r3/d;->i:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lax/r3/d;->k:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/file/o;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 11
    .line 12
    new-instance p1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 18
    .line 19
    iget-object p1, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {p1}, Lax/r3/d;->h(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method private static A(Landroid/content/Context;)V
    .registers 2

    .line 1
    sget-object v0, Lax/r3/d;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-static {}, Lax/r3/d;->j()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lax/r3/d;->p(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_f
    move-exception p0

    .line 17
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_f

    .line 18
    throw p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static declared-synchronized B(Landroid/content/Context;Ljava/lang/String;)V
    .registers 4

    .line 1
    const-class v0, Lax/r3/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lax/ba/d;->i()Lax/V9/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {p1, v1}, Lax/ka/a;->a(Ljava/lang/String;Lax/V9/a;)Z

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lax/ba/d;->k()Lax/Z9/a;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p1, p0}, Lax/ka/e;->c(Ljava/lang/String;Lax/Z9/a;)V
    :try_end_19
    .catchall {:try_start_3 .. :try_end_19} :catchall_1b

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_1b
    move-exception p0

    .line 29
    :try_start_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_1c .. :try_end_1d} :catchall_1b

    .line 30
    throw p0
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

.method public static declared-synchronized C(Landroid/content/Context;Ljava/lang/String;)V
    .registers 4

    .line 1
    const-class v0, Lax/r3/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lax/ba/d;->i()Lax/V9/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/r3/a;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lax/r3/a;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lax/ba/d;->k()Lax/Z9/a;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lax/r3/f;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lax/r3/f;->f(Ljava/lang/String;)V
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_1f

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_1f
    move-exception p0

    .line 33
    :try_start_20
    monitor-exit v0
    :try_end_21
    .catchall {:try_start_20 .. :try_end_21} :catchall_1f

    .line 34
    throw p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private E(Landroid/widget/ImageView;Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method static synthetic a(Landroid/content/Context;)V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/r3/d;->A(Landroid/content/Context;)V

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
.end method

.method static synthetic b(Lax/r3/d;)Landroid/content/Context;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/r3/d;->a:Landroid/content/Context;

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

.method static synthetic c(Lax/r3/d;Landroid/widget/ImageView;Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/r3/d;->E(Landroid/widget/ImageView;Lcom/voxdon/xplorer/file/n;)V

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

.method static synthetic d(Landroid/graphics/Bitmap;)Z
    .registers 1

    .line 1
    invoke-static {p0}, Lax/r3/d;->q(Landroid/graphics/Bitmap;)Z

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
.end method

.method static synthetic e()Ljava/util/logging/Logger;
    .registers 1

    .line 1
    sget-object v0, Lax/r3/d;->d:Ljava/util/logging/Logger;

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

.method private static h(Landroid/content/Context;)V
    .registers 3

    .line 1
    sget v0, Lax/r3/d;->e:F

    .line 2
    .line 3
    invoke-static {p0}, Lax/u3/B;->s(Landroid/content/Context;)F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    cmpl-float v0, v0, v1

    .line 8
    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    invoke-static {p0}, Lax/r3/d;->A(Landroid/content/Context;)V

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
.end method

.method public static declared-synchronized i(Landroid/content/Context;Lax/c3/K;)V
    .registers 4

    .line 1
    const-class v0, Lax/r3/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lax/ba/d;->i()Lax/V9/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/r3/a;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lax/r3/a;->g(Lax/c3/K;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lax/ba/d;->k()Lax/Z9/a;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lax/r3/f;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lax/r3/f;->e(Lax/c3/K;)V
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_1f

    .line 28
    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :catchall_1f
    move-exception p0

    .line 33
    :try_start_20
    monitor-exit v0
    :try_end_21
    .catchall {:try_start_20 .. :try_end_21} :catchall_1f

    .line 34
    throw p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static j()V
    .registers 1

    .line 1
    sget-object v0, Lax/r3/d;->f:Lax/ba/e;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    invoke-static {}, Lax/ba/d;->j()Lax/ba/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lax/ba/d;->e()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    sput-object v0, Lax/r3/d;->f:Lax/ba/e;

    .line 14
    .line 15
    sput-object v0, Lax/r3/d;->g:Lax/ba/c;

    .line 16
    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private k(Ljava/lang/String;Landroid/widget/ImageView;Lax/ia/a;)V
    .registers 7

    .line 1
    new-instance v0, Lax/ha/b;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lax/ha/b;-><init>(Landroid/widget/ImageView;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    monitor-enter p2

    .line 9
    :try_start_8
    iget-object v1, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/ha/d;->a()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    monitor-exit p2
    :try_end_16
    .catchall {:try_start_8 .. :try_end_16} :catchall_2d

    .line 23
    iget-object p2, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {p2}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2, v0}, Lax/ba/d;->b(Lax/ha/a;)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {p2}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {}, Lax/r3/d;->n()Lax/ba/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p2, p1, v0, v1, p3}, Lax/ba/d;->g(Ljava/lang/String;Lax/ha/a;Lax/ba/c;Lax/ia/a;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_2d
    move-exception p1

    .line 47
    :try_start_2e
    monitor-exit p2
    :try_end_2f
    .catchall {:try_start_2e .. :try_end_2f} :catchall_2d

    .line 48
    throw p1
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

.method public static declared-synchronized l(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .registers 3

    .line 1
    const-class v0, Lax/r3/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lax/ba/d;->i()Lax/V9/a;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lax/r3/a;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lax/r3/a;->f(Ljava/lang/String;)Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_13

    .line 18
    monitor-exit v0

    .line 19
    return-object p0

    .line 20
    :catchall_13
    move-exception p0

    .line 21
    :try_start_14
    monitor-exit v0
    :try_end_15
    .catchall {:try_start_14 .. :try_end_15} :catchall_13

    .line 22
    throw p0
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

.method private static m(Landroid/content/Context;)Lax/ba/d;
    .registers 2

    .line 1
    sget-object v0, Lax/r3/d;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lax/r3/d;->p(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lax/ba/d;->j()Lax/ba/d;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :catchall_10
    move-exception p0

    .line 18
    monitor-exit v0
    :try_end_12
    .catchall {:try_start_3 .. :try_end_12} :catchall_10

    .line 19
    throw p0
    .line 20
    .line 21
    .line 22
.end method

.method private static n()Lax/ba/c;
    .registers 1

    .line 1
    sget-object v0, Lax/r3/d;->g:Lax/ba/c;

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

.method public static o(Landroid/content/Context;Lax/U2/f;)Landroid/graphics/Bitmap;
    .registers 2

    .line 1
    invoke-static {p1}, Lax/U2/d;->K(Lax/U2/f;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lax/ba/d;->k()Lax/Z9/a;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lax/r3/f;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lax/r3/f;->d(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
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

.method private static p(Landroid/content/Context;)V
    .registers 11

    .line 1
    sget-object v0, Lax/r3/d;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    sget-object v1, Lax/r3/d;->j:Landroid/content/BroadcastReceiver;

    .line 5
    .line 6
    if-nez v1, :cond_1d

    .line 7
    .line 8
    new-instance v1, Lax/r3/d$a;

    .line 9
    .line 10
    invoke-direct {v1}, Lax/r3/d$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lax/r3/d;->j:Landroid/content/BroadcastReceiver;

    .line 14
    .line 15
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "local.intent.action.MOUNT_CHANGED"

    .line 20
    .line 21
    sget-object v3, Lax/r3/d;->j:Landroid/content/BroadcastReceiver;

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1d

    .line 27
    :catchall_1a
    move-exception p0

    .line 28
    goto/16 :goto_137

    .line 29
    .line 30
    :cond_1d
    :goto_1d
    sget-object v1, Lax/r3/d;->f:Lax/ba/e;

    .line 31
    .line 32
    if-nez v1, :cond_135

    .line 33
    .line 34
    invoke-static {p0}, Lax/u3/B;->s(Landroid/content/Context;)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    sput v1, Lax/r3/d;->e:F

    .line 39
    .line 40
    const/high16 v2, 0x43000000    # 128.0f

    .line 41
    .line 42
    mul-float v2, v2, v1

    .line 43
    .line 44
    float-to-int v2, v2

    .line 45
    const/high16 v3, 0x42800000    # 64.0f

    .line 46
    .line 47
    mul-float v1, v1, v3

    .line 48
    .line 49
    float-to-int v1, v1

    .line 50
    invoke-static {p0}, Lax/Q2/e;->C(Landroid/content/Context;)Ljava/io/File;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const/4 v4, 0x1

    .line 55
    const/4 v5, 0x0

    .line 56
    if-nez v3, :cond_40

    .line 57
    .line 58
    sput-boolean v5, Lax/r3/d;->h:Z

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    goto :goto_46

    .line 65
    :cond_40
    sput-boolean v4, Lax/r3/d;->h:Z

    .line 66
    .line 67
    invoke-static {p0}, Lax/Q2/e;->C(Landroid/content/Context;)Ljava/io/File;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :goto_46
    new-instance v6, Ljava/io/File;

    .line 72
    .line 73
    new-instance v7, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v8, "thumbnail"

    .line 79
    .line 80
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v8, "x"

    .line 87
    .line 88
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-direct {v6, v3, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 102
    .line 103
    .line 104
    new-instance v7, Ljava/io/File;

    .line 105
    .line 106
    new-instance v8, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v9, "thumbnail"

    .line 112
    .line 113
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v9, "x"

    .line 120
    .line 121
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v7, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    const/4 v3, 0x0

    .line 139
    if-nez v1, :cond_8d

    .line 140
    .line 141
    move-object v7, v3

    .line 142
    :cond_8d
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    .line 147
    .line 148
    .line 149
    move-result-wide v8

    .line 150
    long-to-float v1, v8

    .line 151
    const v8, 0x3dcccccd    # 0.1f

    .line 152
    .line 153
    .line 154
    mul-float v1, v1, v8

    .line 155
    .line 156
    float-to-int v1, v1

    .line 157
    new-instance v8, Lax/ba/e$b;

    .line 158
    .line 159
    invoke-direct {v8, p0}, Lax/ba/e$b;-><init>(Landroid/content/Context;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8, v2, v2}, Lax/ba/e$b;->B(II)Lax/ba/e$b;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v8, v2, v2, v3}, Lax/ba/e$b;->w(IILax/ja/a;)Lax/ba/e$b;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {}, Lax/u3/v;->d()Ljava/util/concurrent/Executor;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v2, v3}, Lax/ba/e$b;->C(Ljava/util/concurrent/Executor;)Lax/ba/e$b;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-static {}, Lax/u3/v;->c()Ljava/util/concurrent/Executor;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v2, v3}, Lax/ba/e$b;->D(Ljava/util/concurrent/Executor;)Lax/ba/e$b;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    new-instance v3, Lax/r3/f;

    .line 187
    .line 188
    invoke-direct {v3, v1}, Lax/r3/f;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v3}, Lax/ba/e$b;->A(Lax/Z9/a;)Lax/ba/e$b;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    new-instance v2, Lax/r3/a;

    .line 196
    .line 197
    invoke-direct {v2, v6, v7}, Lax/r3/a;-><init>(Ljava/io/File;Ljava/io/File;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v2}, Lax/ba/e$b;->v(Lax/V9/a;)Lax/ba/e$b;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    new-instance v2, Lax/r3/b;

    .line 205
    .line 206
    invoke-direct {v2, p0}, Lax/r3/b;-><init>(Landroid/content/Context;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v2}, Lax/ba/e$b;->y(Lax/ga/b;)Lax/ba/e$b;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    new-instance v1, Lax/r3/e;

    .line 214
    .line 215
    invoke-direct {v1, v5}, Lax/r3/e;-><init>(Z)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v1}, Lax/ba/e$b;->x(Lax/ea/b;)Lax/ba/e$b;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-static {}, Lax/ba/c;->t()Lax/ba/c;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {p0, v1}, Lax/ba/e$b;->u(Lax/ba/c;)Lax/ba/e$b;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0}, Lax/ba/e$b;->t()Lax/ba/e;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    sput-object p0, Lax/r3/d;->f:Lax/ba/e;

    .line 235
    .line 236
    invoke-static {}, Lax/ba/d;->j()Lax/ba/d;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    sget-object v1, Lax/r3/d;->f:Lax/ba/e;

    .line 241
    .line 242
    invoke-virtual {p0, v1}, Lax/ba/d;->l(Lax/ba/e;)V

    .line 243
    .line 244
    .line 245
    invoke-static {}, Lax/X2/J;->z()Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-eqz p0, :cond_fd

    .line 250
    .line 251
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 252
    .line 253
    goto :goto_ff

    .line 254
    :cond_fd
    sget-object p0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 255
    .line 256
    :goto_ff
    new-instance v1, Lax/ba/c$b;

    .line 257
    .line 258
    invoke-direct {v1}, Lax/ba/c$b;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v5}, Lax/ba/c$b;->C(Z)Lax/ba/c$b;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1, v4}, Lax/ba/c$b;->v(Z)Lax/ba/c$b;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    sget-boolean v2, Lax/r3/d;->h:Z

    .line 270
    .line 271
    invoke-virtual {v1, v2}, Lax/ba/c$b;->w(Z)Lax/ba/c$b;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v1, v4}, Lax/ba/c$b;->y(Z)Lax/ba/c$b;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    sget-object v2, Lax/ca/d;->d0:Lax/ca/d;

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Lax/ba/c$b;->B(Lax/ca/d;)Lax/ba/c$b;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v1, p0}, Lax/ba/c$b;->t(Landroid/graphics/Bitmap$Config;)Lax/ba/c$b;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    new-instance v1, Lax/r3/d$f;

    .line 290
    .line 291
    invoke-direct {v1}, Lax/r3/d$f;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0, v1}, Lax/ba/c$b;->z(Lax/fa/a;)Lax/ba/c$b;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    sget-object v1, Lax/r3/d;->i:Landroid/os/Handler;

    .line 299
    .line 300
    invoke-virtual {p0, v1}, Lax/ba/c$b;->A(Landroid/os/Handler;)Lax/ba/c$b;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-virtual {p0}, Lax/ba/c$b;->u()Lax/ba/c;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    sput-object p0, Lax/r3/d;->g:Lax/ba/c;

    .line 309
    .line 310
    :cond_135
    monitor-exit v0

    .line 311
    return-void

    .line 312
    :goto_137
    monitor-exit v0
    :try_end_138
    .catchall {:try_start_3 .. :try_end_138} :catchall_1a

    .line 313
    throw p0
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
.end method

.method private static q(Landroid/graphics/Bitmap;)Z
    .registers 3

    .line 1
    if-eqz p0, :cond_10

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_10

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p0, v1, :cond_10

    .line 15
    .line 16
    return v1

    .line 17
    :cond_10
    const/4 p0, 0x0

    .line 18
    return p0
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private r(Ljava/lang/String;Lax/ia/a;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_3 .. :try_end_11} :catchall_1f

    .line 18
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Lax/r3/d;->n()Lax/ba/c;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, p1, v1, p2}, Lax/ba/d;->n(Ljava/lang/String;Lax/ba/c;Lax/ia/a;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_1f
    move-exception p1

    .line 33
    :try_start_20
    monitor-exit v0
    :try_end_21
    .catchall {:try_start_20 .. :try_end_21} :catchall_1f

    .line 34
    throw p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public D(Ljava/lang/String;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/r3/d;->C(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public f()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    new-instance v1, Lax/r3/d$e;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v2, v3}, Lax/r3/d$e;-><init>(ILax/r3/d$a;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_13
    iget-object v3, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_47

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/util/Map$Entry;

    .line 41
    .line 42
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v5}, Lax/r3/d$e;->b(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lax/ba/d;->b(Lax/ha/a;)V

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Lcom/voxdon/xplorer/file/o;->f(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1d

    .line 70
    :catchall_45
    move-exception v0

    .line 71
    goto :goto_4e

    .line 72
    :cond_47
    iget-object v0, p0, Lax/r3/d;->c:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 75
    .line 76
    .line 77
    monitor-exit v2

    .line 78
    return-void

    .line 79
    :goto_4e
    monitor-exit v2
    :try_end_4f
    .catchall {:try_start_13 .. :try_end_4f} :catchall_45

    .line 80
    throw v0
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
.end method

.method public g(Landroid/widget/ImageView;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-virtual {v0, p1}, Lax/ba/d;->a(Landroid/widget/ImageView;)V

    .line 11
    .line 12
    .line 13
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

.method public s(Lax/U2/f;Landroid/widget/ImageView;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Lax/ba/d;->a(Landroid/widget/ImageView;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lax/U2/d;->K(Lax/U2/f;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_15

    .line 20
    .line 21
    goto :goto_2d

    .line 22
    :cond_15
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {v0}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lax/ba/d;->k()Lax/Z9/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lax/r3/f;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lax/r3/f;->d(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_32

    .line 39
    .line 40
    invoke-static {v0}, Lax/r3/d;->q(Landroid/graphics/Bitmap;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2e

    .line 45
    .line 46
    :goto_2d
    return-void

    .line 47
    :cond_2e
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_32
    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, v0}, Lax/r3/d;->k(Ljava/lang/String;Landroid/widget/ImageView;Lax/ia/a;)V

    .line 53
    .line 54
    .line 55
    return-void
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
.end method

.method public t(Lcom/voxdon/xplorer/file/n;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    invoke-virtual {p0, p1}, Lax/r3/d;->w(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
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

.method public u(Lcom/voxdon/xplorer/file/n;Landroid/widget/ImageView;Ljava/lang/Runnable;)V
    .registers 6

    .line 1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->p0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_30

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 16
    .line 17
    if-ne v0, v1, :cond_30

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lax/c3/A;->O(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_30

    .line 28
    .line 29
    invoke-static {p1}, Lcom/voxdon/xplorer/file/m;->S(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {v1, v0}, Lax/r3/d;->l(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_29

    .line 40
    .line 41
    goto :goto_36

    .line 42
    :cond_29
    iget-object v0, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_36

    .line 49
    :cond_30
    iget-object v0, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_36
    if-nez v0, :cond_39

    .line 56
    .line 57
    return-void

    .line 58
    :cond_39
    new-instance v1, Lax/r3/d$d;

    .line 59
    .line 60
    invoke-direct {v1, p0, p2, p1, p3}, Lax/r3/d$d;-><init>(Lax/r3/d;Landroid/widget/ImageView;Lcom/voxdon/xplorer/file/n;Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v0, p2, v1}, Lax/r3/d;->k(Ljava/lang/String;Landroid/widget/ImageView;Lax/ia/a;)V

    .line 64
    .line 65
    .line 66
    return-void
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

.method public v(Lcom/voxdon/xplorer/file/n;Landroidx/appcompat/app/a;I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    new-instance v0, Lax/r3/d$c;

    .line 11
    .line 12
    invoke-direct {v0, p0, p3, p2}, Lax/r3/d$c;-><init>(Lax/r3/d;ILandroidx/appcompat/app/a;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Lax/r3/d;->r(Ljava/lang/String;Lax/ia/a;)V

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

.method public w(Ljava/lang/String;)V
    .registers 3

    .line 1
    new-instance v0, Lax/r3/d$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/r3/d$b;-><init>(Lax/r3/d;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lax/r3/d;->r(Ljava/lang/String;Lax/ia/a;)V

    .line 7
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
    .line 22
.end method

.method public x(Lcom/voxdon/xplorer/file/n;Landroid/widget/ImageView;Ljava/lang/Runnable;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_14

    .line 10
    :cond_9
    iget-object v1, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v1, v0}, Lax/r3/d;->l(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_14

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lax/r3/d;->u(Lcom/voxdon/xplorer/file/n;Landroid/widget/ImageView;Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    :goto_14
    return-void
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

.method public y(Lax/U2/f;Landroid/widget/ImageView;)Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/r3/d;->o(Landroid/content/Context;Lax/U2/f;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_15

    .line 9
    .line 10
    invoke-static {p1}, Lax/r3/d;->q(Landroid/graphics/Bitmap;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_10

    .line 15
    .line 16
    return v0

    .line 17
    :cond_10
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_15
    return v0
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

.method public z(Lcom/voxdon/xplorer/file/n;Landroid/widget/ImageView;Ljava/lang/Runnable;)Z
    .registers 7

    .line 1
    iget-object v0, p0, Lax/r3/d;->b:Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    return v1

    .line 11
    :cond_a
    iget-object v2, p0, Lax/r3/d;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v2}, Lax/r3/d;->m(Landroid/content/Context;)Lax/ba/d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lax/ba/d;->k()Lax/Z9/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lax/r3/f;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Lax/r3/f;->d(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_30

    .line 28
    .line 29
    invoke-static {v0}, Lax/r3/d;->q(Landroid/graphics/Bitmap;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_23

    .line 34
    .line 35
    return v1

    .line 36
    :cond_23
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p2, p1}, Lax/r3/d;->E(Landroid/widget/ImageView;Lcom/voxdon/xplorer/file/n;)V

    .line 40
    .line 41
    .line 42
    if-eqz p3, :cond_2e

    .line 43
    .line 44
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 45
    .line 46
    .line 47
    :cond_2e
    const/4 p1, 0x1

    .line 48
    return p1

    .line 49
    :cond_30
    return v1
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
