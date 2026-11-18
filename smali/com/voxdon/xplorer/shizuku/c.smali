.class public Lcom/voxdon/xplorer/shizuku/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static m:Lcom/voxdon/xplorer/shizuku/c;


# instance fields
.field private a:Lcom/voxdon/xplorer/shizuku/a;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/Boolean;

.field private d:Z

.field private e:I

.field private f:Z

.field private g:Lax/Q2/i$a;

.field private final h:Lax/ne/i$f;

.field private final i:Lax/ne/i$d;

.field private final j:Lax/ne/i$c;

.field private final k:Lax/ne/i$e;

.field private final l:Landroid/content/ServiceConnection;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/voxdon/xplorer/shizuku/c;->d:Z

    .line 6
    .line 7
    iput v0, p0, Lcom/voxdon/xplorer/shizuku/c;->e:I

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/voxdon/xplorer/shizuku/c;->f:Z

    .line 10
    .line 11
    new-instance v1, Lax/ne/i$f;

    .line 12
    .line 13
    new-instance v2, Landroid/content/ComponentName;

    .line 14
    .line 15
    const-class v3, Lcom/voxdon/xplorer/shizuku/ShizukuUserService;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "com.voxdon.xplorer"

    .line 22
    .line 23
    invoke-direct {v2, v4, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v2}, Lax/ne/i$f;-><init>(Landroid/content/ComponentName;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lax/ne/i$f;->c(Z)Lax/ne/i$f;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "service"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lax/ne/i$f;->g(Ljava/lang/String;)Lax/ne/i$f;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v0}, Lax/ne/i$f;->d(Z)Lax/ne/i$f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/16 v1, 0x116

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lax/ne/i$f;->h(I)Lax/ne/i$f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->h:Lax/ne/i$f;

    .line 50
    .line 51
    new-instance v0, Lax/p3/b;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lax/p3/b;-><init>(Lcom/voxdon/xplorer/shizuku/c;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->i:Lax/ne/i$d;

    .line 57
    .line 58
    new-instance v0, Lax/p3/c;

    .line 59
    .line 60
    invoke-direct {v0}, Lax/p3/c;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->j:Lax/ne/i$c;

    .line 64
    .line 65
    new-instance v0, Lcom/voxdon/xplorer/shizuku/c$b;

    .line 66
    .line 67
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/shizuku/c$b;-><init>(Lcom/voxdon/xplorer/shizuku/c;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->k:Lax/ne/i$e;

    .line 71
    .line 72
    new-instance v0, Lcom/voxdon/xplorer/shizuku/c$c;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/shizuku/c$c;-><init>(Lcom/voxdon/xplorer/shizuku/c;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->l:Landroid/content/ServiceConnection;

    .line 78
    .line 79
    iput-object p1, p0, Lcom/voxdon/xplorer/shizuku/c;->b:Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {}, Lax/Q2/b;->h()Lax/Q2/b;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Lcom/voxdon/xplorer/shizuku/c$a;

    .line 86
    .line 87
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/shizuku/c$a;-><init>(Lcom/voxdon/xplorer/shizuku/c;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Lax/Q2/b;->e(Lax/g3/g;)V

    .line 91
    .line 92
    .line 93
    return-void
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
.end method

.method private D()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method private J(Lcom/voxdon/xplorer/shizuku/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    return-void
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

.method private K()V
    .registers 4

    .line 1
    :try_start_0
    invoke-static {}, Lax/ne/i;->C()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-ge v0, v1, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->h:Lax/ne/i$f;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/voxdon/xplorer/shizuku/c;->l:Landroid/content/ServiceConnection;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v0, v1, v2}, Lax/ne/i;->Q(Lax/ne/i$f;Landroid/content/ServiceConnection;Z)V
    :try_end_11
    .catchall {:try_start_0 .. :try_end_11} :catchall_12

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_12
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    return-void
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
.end method

.method public static synthetic a(Lcom/voxdon/xplorer/shizuku/c;)V
    .registers 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lax/ne/i;->D()Z

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lcom/voxdon/xplorer/shizuku/c;->e:I

    .line 8
    .line 9
    if-lez v0, :cond_13

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/voxdon/xplorer/shizuku/c;->D()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_13

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/voxdon/xplorer/shizuku/c;->k()V

    .line 18
    .line 19
    .line 20
    :cond_13
    return-void
    .line 21
    .line 22
.end method

.method public static synthetic b()V
    .registers 0

    .line 1
    return-void
.end method

.method static synthetic c(Lcom/voxdon/xplorer/shizuku/c;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/shizuku/c;->c:Ljava/lang/Boolean;

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

.method static synthetic d(Lcom/voxdon/xplorer/shizuku/c;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/shizuku/c;->k()V

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

.method static synthetic e(Lcom/voxdon/xplorer/shizuku/c;)Lax/Q2/i$a;
    .registers 1

    .line 1
    iget-object p0, p0, Lcom/voxdon/xplorer/shizuku/c;->g:Lax/Q2/i$a;

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

.method static synthetic f(Lcom/voxdon/xplorer/shizuku/c;Lax/Q2/i$a;)Lax/Q2/i$a;
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/shizuku/c;->g:Lax/Q2/i$a;

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

.method static synthetic g(Lcom/voxdon/xplorer/shizuku/c;Z)Z
    .registers 2

    .line 1
    iput-boolean p1, p0, Lcom/voxdon/xplorer/shizuku/c;->f:Z

    .line 2
    .line 3
    return p1
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

.method static synthetic h(Lcom/voxdon/xplorer/shizuku/c;Lcom/voxdon/xplorer/shizuku/a;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/shizuku/c;->J(Lcom/voxdon/xplorer/shizuku/a;)V

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

.method static synthetic i(Lcom/voxdon/xplorer/shizuku/c;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/shizuku/c;->n()V

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

.method private k()V
    .registers 3

    .line 1
    :try_start_0
    invoke-static {}, Lax/ne/i;->y()I
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_3} :catch_18

    .line 2
    .line 3
    .line 4
    :try_start_3
    invoke-static {}, Lax/ne/i;->C()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    if-ge v0, v1, :cond_c

    .line 11
    .line 12
    goto :goto_18

    .line 13
    :cond_c
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->h:Lax/ne/i$f;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/voxdon/xplorer/shizuku/c;->l:Landroid/content/ServiceConnection;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lax/ne/i;->x(Lax/ne/i$f;Landroid/content/ServiceConnection;)V
    :try_end_13
    .catchall {:try_start_3 .. :try_end_13} :catchall_14

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_14
    move-exception v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    :catch_18
    :goto_18
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method private n()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

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

.method public static t()Lcom/voxdon/xplorer/shizuku/c;
    .registers 2

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/shizuku/c;->m:Lcom/voxdon/xplorer/shizuku/c;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Exception;

    .line 6
    .line 7
    const-string v1, "Shizuku not initialized"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lax/Q2/d;->b(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    :cond_e
    sget-object v0, Lcom/voxdon/xplorer/shizuku/c;->m:Lcom/voxdon/xplorer/shizuku/c;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static z(Landroid/content/Context;)V
    .registers 2

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/shizuku/c;->m:Lcom/voxdon/xplorer/shizuku/c;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lcom/voxdon/xplorer/shizuku/c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/voxdon/xplorer/shizuku/c;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/voxdon/xplorer/shizuku/c;->m:Lcom/voxdon/xplorer/shizuku/c;

    .line 11
    .line 12
    :cond_b
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


# virtual methods
.method public A()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/shizuku/c;->f:Z

    .line 2
    .line 3
    return v0
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

.method public B()Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-static {}, Lax/ne/i;->B()I

    .line 3
    .line 4
    .line 5
    move-result v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_5} :catch_9

    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_9

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :catch_9
    :cond_9
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

.method public C()Z
    .registers 3

    .line 1
    invoke-static {}, Lax/X2/Q;->F1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->c:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-nez v0, :cond_1a

    .line 12
    .line 13
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->b:Landroid/content/Context;

    .line 14
    .line 15
    const-string v1, "moe.shizuku.privileged.api"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lax/u3/B;->L(Landroid/content/Context;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->c:Ljava/lang/Boolean;

    .line 26
    .line 27
    :cond_1a
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->c:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
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

.method public E(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Ljava/lang/String;)Ljava/util/List;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/x;",
            "Lax/c3/K;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/y;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-object v1, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 3
    .line 4
    invoke-interface {v1, p3}, Lcom/voxdon/xplorer/shizuku/a;->d1(Ljava/lang/String;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    if-nez p3, :cond_a

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    :goto_13
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2a

    .line 25
    .line 26
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lax/p3/a;

    .line 31
    .line 32
    new-instance v3, Lcom/voxdon/xplorer/file/y;

    .line 33
    .line 34
    invoke-direct {v3, p1, p2, v2}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Lax/p3/a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_27} :catch_28

    .line 38
    .line 39
    .line 40
    goto :goto_13

    .line 41
    :catch_28
    move-exception p1

    .line 42
    goto :goto_2b

    .line 43
    :cond_2a
    return-object v1

    .line 44
    :goto_2b
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    return-object v0
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

.method public F(Landroidx/fragment/app/Fragment;)V
    .registers 4

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_2a

    .line 8
    :cond_7
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :try_start_f
    const-string v1, "moe.shizuku.privileged.api"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_2a

    .line 23
    .line 24
    invoke-static {p1, v0}, Lax/c3/u;->p0(Landroidx/fragment/app/Fragment;Landroid/content/Intent;)V
    :try_end_1a
    .catch Landroid/content/ActivityNotFoundException; {:try_start_f .. :try_end_1a} :catch_21
    .catch Ljava/lang/SecurityException; {:try_start_f .. :try_end_1a} :catch_1f
    .catch Ljava/lang/NullPointerException; {:try_start_f .. :try_end_1a} :catch_1d
    .catch Landroid/util/AndroidRuntimeException; {:try_start_f .. :try_end_1a} :catch_1b

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_1b
    move-exception p1

    .line 29
    goto :goto_23

    .line 30
    :catch_1d
    move-exception p1

    .line 31
    goto :goto_23

    .line 32
    :catch_1f
    move-exception p1

    .line 33
    goto :goto_23

    .line 34
    :catch_21
    move-exception p1

    .line 35
    goto :goto_27

    .line 36
    :goto_23
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    goto :goto_2a

    .line 40
    :goto_27
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    .line 42
    .line 43
    :cond_2a
    :goto_2a
    return-void
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

.method public G()V
    .registers 2

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/shizuku/c;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/voxdon/xplorer/shizuku/c;->e:I

    .line 6
    .line 7
    if-gtz v0, :cond_1a

    .line 8
    .line 9
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->i:Lax/ne/i$d;

    .line 10
    .line 11
    invoke-static {v0}, Lax/ne/i;->H(Lax/ne/i$d;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->j:Lax/ne/i$c;

    .line 15
    .line 16
    invoke-static {v0}, Lax/ne/i;->G(Lax/ne/i$c;)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->k:Lax/ne/i$e;

    .line 20
    .line 21
    invoke-static {v0}, Lax/ne/i;->I(Lax/ne/i$e;)Z

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/voxdon/xplorer/shizuku/c;->K()V

    .line 25
    .line 26
    .line 27
    :cond_1a
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

.method public H(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/voxdon/xplorer/shizuku/a;->X0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    const/4 p1, 0x0

    .line 9
    return p1
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

.method public I(Ljava/lang/String;J)Z
    .registers 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/voxdon/xplorer/shizuku/a;->l0(Ljava/lang/String;J)Z

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    const/4 p1, 0x0

    .line 9
    return p1
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

.method public j()V
    .registers 2

    .line 1
    iget v0, p0, Lcom/voxdon/xplorer/shizuku/c;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_16

    .line 4
    .line 5
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->i:Lax/ne/i$d;

    .line 6
    .line 7
    invoke-static {v0}, Lax/ne/i;->r(Lax/ne/i$d;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->j:Lax/ne/i$c;

    .line 11
    .line 12
    invoke-static {v0}, Lax/ne/i;->o(Lax/ne/i$c;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->k:Lax/ne/i$e;

    .line 16
    .line 17
    invoke-static {v0}, Lax/ne/i;->t(Lax/ne/i$e;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/voxdon/xplorer/shizuku/c;->k()V

    .line 21
    .line 22
    .line 23
    :cond_16
    iget v0, p0, Lcom/voxdon/xplorer/shizuku/c;->e:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    iput v0, p0, Lcom/voxdon/xplorer/shizuku/c;->e:I

    .line 28
    .line 29
    return-void
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

.method public l()Z
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/shizuku/c;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/shizuku/c;->B()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    invoke-direct {p0}, Lcom/voxdon/xplorer/shizuku/c;->D()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
    .line 21
.end method

.method public m(Lax/Q2/i$a;)Z
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/shizuku/c;->f:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/voxdon/xplorer/shizuku/c;->B()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v0

    .line 11
    :cond_a
    invoke-static {}, Lax/ne/i;->D()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_11

    .line 16
    .line 17
    return v0

    .line 18
    :cond_11
    :try_start_11
    invoke-static {}, Lax/ne/i;->y()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x1

    .line 23
    if-nez v1, :cond_19

    .line 24
    .line 25
    return v2

    .line 26
    :cond_19
    invoke-static {}, Lax/ne/i;->P()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_20

    .line 31
    .line 32
    return v0

    .line 33
    :cond_20
    iput-object p1, p0, Lcom/voxdon/xplorer/shizuku/c;->g:Lax/Q2/i$a;

    .line 34
    .line 35
    const p1, 0xfde9

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lax/ne/i;->J(I)V

    .line 39
    .line 40
    .line 41
    iput-boolean v2, p0, Lcom/voxdon/xplorer/shizuku/c;->f:Z
    :try_end_2a
    .catchall {:try_start_11 .. :try_end_2a} :catchall_2a

    .line 42
    .line 43
    :catchall_2a
    return v0
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

.method public o(Ljava/lang/String;)Z
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/shizuku/a;->W1(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    const/4 p1, 0x0

    .line 9
    return p1
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

.method public p(Ljava/lang/String;)Z
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/shizuku/a;->x1(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    const/4 p1, 0x0

    .line 9
    return p1
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

.method public q(Ljava/lang/String;)Z
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/shizuku/a;->h(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    const/4 p1, 0x0

    .line 9
    return p1
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

.method public r(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p3}, Lcom/voxdon/xplorer/shizuku/a;->z(Ljava/lang/String;)Lax/p3/a;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    new-instance v0, Lcom/voxdon/xplorer/file/y;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, p3}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Lax/c3/K;Lax/p3/a;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_b} :catch_c

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :catch_c
    const/4 p1, 0x0

    .line 14
    return-object p1
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

.method public s(Ljava/lang/String;J)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/shizuku/a;->z0(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    cmp-long p1, p2, v1

    .line 15
    .line 16
    if-lez p1, :cond_28

    .line 17
    .line 18
    invoke-virtual {v0, p2, p3}, Ljava/io/InputStream;->skip(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    cmp-long p1, v1, p2

    .line 23
    .line 24
    if-nez p1, :cond_1a

    .line 25
    .line 26
    goto :goto_28

    .line 27
    :cond_1a
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    const-string p2, "AutoCloseInputStream skip failed"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
    :try_end_22
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_22} :catch_26
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_22} :catch_24
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_22} :catch_22

    .line 35
    :catch_22
    move-exception p1

    .line 36
    goto :goto_29

    .line 37
    :catch_24
    move-exception p1

    .line 38
    goto :goto_2f

    .line 39
    :catch_26
    move-exception p1

    .line 40
    goto :goto_30

    .line 41
    :cond_28
    :goto_28
    return-object v0

    .line 42
    :goto_29
    new-instance p2, Ljava/io/IOException;

    .line 43
    .line 44
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw p2

    .line 48
    :goto_2f
    throw p1

    .line 49
    :goto_30
    invoke-static {p1}, Lcom/voxdon/xplorer/shizuku/b;->e(Ljava/lang/IllegalStateException;)Lcom/voxdon/xplorer/shizuku/b$c;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-eqz p2, :cond_4c

    .line 54
    .line 55
    iget p1, p2, Lcom/voxdon/xplorer/shizuku/b$c;->a:I

    .line 56
    .line 57
    sget p3, Lcom/voxdon/xplorer/shizuku/b;->d:I

    .line 58
    .line 59
    if-ne p1, p3, :cond_44

    .line 60
    .line 61
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 62
    .line 63
    iget-object p2, p2, Lcom/voxdon/xplorer/shizuku/b$c;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_44
    new-instance p1, Ljava/io/IOException;

    .line 70
    .line 71
    iget-object p2, p2, Lcom/voxdon/xplorer/shizuku/b$c;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_4c
    new-instance p2, Ljava/io/IOException;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw p2
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

.method public u(Ljava/lang/String;Z)I
    .registers 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/voxdon/xplorer/shizuku/a;->K1(Ljava/lang/String;Z)I

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return p1

    .line 8
    :catch_7
    const/4 p1, -0x2

    .line 9
    return p1
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

.method public v(Ljava/lang/String;Z)Ljava/io/OutputStream;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/voxdon/xplorer/shizuku/a;->G1(Ljava/lang/String;Z)Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    .line 8
    .line 9
    invoke-direct {p2, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V
    :try_end_b
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_b} :catch_e
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_b} :catch_c

    .line 10
    .line 11
    .line 12
    return-object p2

    .line 13
    :catch_c
    move-exception p1

    .line 14
    goto :goto_10

    .line 15
    :catch_e
    move-exception p1

    .line 16
    goto :goto_16

    .line 17
    :goto_10
    new-instance p2, Ljava/io/IOException;

    .line 18
    .line 19
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    throw p2

    .line 23
    :goto_16
    invoke-static {p1}, Lcom/voxdon/xplorer/shizuku/b;->e(Ljava/lang/IllegalStateException;)Lcom/voxdon/xplorer/shizuku/b$c;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_24

    .line 28
    .line 29
    new-instance p1, Ljava/io/IOException;

    .line 30
    .line 31
    iget-object p2, p2, Lcom/voxdon/xplorer/shizuku/b$c;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_24
    new-instance p2, Ljava/io/IOException;

    .line 38
    .line 39
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw p2
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
.end method

.method public w(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/shizuku/a;->z0(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_6} :catch_9
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return-object p1

    .line 8
    :catch_7
    move-exception p1

    .line 9
    goto :goto_b

    .line 10
    :catch_9
    move-exception p1

    .line 11
    goto :goto_11

    .line 12
    :goto_b
    new-instance v0, Ljava/io/IOException;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :goto_11
    invoke-static {p1}, Lcom/voxdon/xplorer/shizuku/b;->e(Ljava/lang/IllegalStateException;)Lcom/voxdon/xplorer/shizuku/b$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_2d

    .line 23
    .line 24
    iget p1, v0, Lcom/voxdon/xplorer/shizuku/b$c;->a:I

    .line 25
    .line 26
    sget v1, Lcom/voxdon/xplorer/shizuku/b;->d:I

    .line 27
    .line 28
    if-ne p1, v1, :cond_25

    .line 29
    .line 30
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/voxdon/xplorer/shizuku/b$c;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_25
    new-instance p1, Ljava/io/IOException;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/voxdon/xplorer/shizuku/b$c;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2d
    new-instance v0, Ljava/io/IOException;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw v0
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

.method public x(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/shizuku/a;->w0(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_6} :catch_9
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_7

    .line 7
    return-object p1

    .line 8
    :catch_7
    move-exception p1

    .line 9
    goto :goto_b

    .line 10
    :catch_9
    move-exception p1

    .line 11
    goto :goto_11

    .line 12
    :goto_b
    new-instance v0, Ljava/io/IOException;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :goto_11
    invoke-static {p1}, Lcom/voxdon/xplorer/shizuku/b;->e(Ljava/lang/IllegalStateException;)Lcom/voxdon/xplorer/shizuku/b$c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1f

    .line 23
    .line 24
    new-instance p1, Ljava/io/IOException;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/voxdon/xplorer/shizuku/b$c;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1f
    new-instance v0, Ljava/io/IOException;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v0
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

.method public y(Ljava/lang/String;)Lax/X2/L;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/shizuku/c;->a:Lcom/voxdon/xplorer/shizuku/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/voxdon/xplorer/shizuku/a;->L0(Ljava/lang/String;)Lax/p3/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lax/X2/L;

    .line 8
    .line 9
    invoke-direct {v0}, Lax/X2/L;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, p1, Lax/p3/a;->d0:Z

    .line 13
    .line 14
    iput-boolean v1, v0, Lax/X2/L;->e:Z

    .line 15
    .line 16
    iget-boolean v1, p1, Lax/p3/a;->e0:Z

    .line 17
    .line 18
    iput-boolean v1, v0, Lax/X2/L;->b:Z

    .line 19
    .line 20
    iget-wide v1, p1, Lax/p3/a;->i0:J

    .line 21
    .line 22
    iput-wide v1, v0, Lax/X2/L;->a:J

    .line 23
    .line 24
    iget-wide v1, p1, Lax/p3/a;->j0:J

    .line 25
    .line 26
    iput-wide v1, v0, Lax/X2/L;->c:J
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_1b} :catch_1c

    .line 27
    .line 28
    return-object v0

    .line 29
    :catch_1c
    move-exception p1

    .line 30
    new-instance v0, Ljava/io/IOException;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw v0
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
