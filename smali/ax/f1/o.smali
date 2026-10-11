.class public final Lax/f1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/f1/x$b;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>()V
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/f1/o;->e:I

    .line 3
    iput-boolean v0, p0, Lax/f1/o;->f:Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lax/f1/o;->b:Landroid/content/Context;

    .line 5
    iput-object v0, p0, Lax/f1/o;->c:Lax/q7/u;

    .line 6
    iput-object v0, p0, Lax/f1/o;->d:Lax/q7/u;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0, v0}, Lax/f1/o;-><init>(Landroid/content/Context;Lax/q7/u;Lax/q7/u;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lax/q7/u;Lax/q7/u;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;",
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;)V"
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lax/f1/o;->b:Landroid/content/Context;

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lax/f1/o;->e:I

    .line 11
    iput-boolean p1, p0, Lax/f1/o;->f:Z

    .line 12
    iput-object p2, p0, Lax/f1/o;->c:Lax/q7/u;

    .line 13
    iput-object p3, p0, Lax/f1/o;->d:Lax/q7/u;

    return-void
.end method

.method private b()Z
    .registers 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_8

    .line 7
    .line 8
    return v2

    .line 9
    :cond_8
    iget-object v1, p0, Lax/f1/o;->b:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v1, :cond_1d

    .line 12
    .line 13
    const/16 v3, 0x1c

    .line 14
    .line 15
    if-lt v0, v3, :cond_1d

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "com.amazon.hardware.tv_screen"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1d

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1d
    const/4 v0, 0x0

    .line 31
    return v0
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


# virtual methods
.method public a(Lax/f1/x$a;)Lax/f1/x;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    if-lt v0, v1, :cond_53

    .line 6
    .line 7
    iget v0, p0, Lax/f1/o;->e:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_13

    .line 11
    .line 12
    if-nez v0, :cond_53

    .line 13
    .line 14
    invoke-direct {p0}, Lax/f1/o;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_53

    .line 19
    .line 20
    :cond_13
    iget-object v0, p1, Lax/f1/x$a;->c:Lax/P0/v;

    .line 21
    .line 22
    iget-object v0, v0, Lax/P0/v;->o:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0}, Lax/P0/D;->k(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, "Creating an asynchronous MediaCodec adapter for track type "

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lax/S0/d0;->v0(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "DMCodecAdapterFactory"

    .line 50
    .line 51
    invoke-static {v2, v1}, Lax/S0/u;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lax/f1/o;->c:Lax/q7/u;

    .line 55
    .line 56
    if-eqz v1, :cond_43

    .line 57
    .line 58
    iget-object v2, p0, Lax/f1/o;->d:Lax/q7/u;

    .line 59
    .line 60
    if-eqz v2, :cond_43

    .line 61
    .line 62
    new-instance v0, Lax/f1/e$b;

    .line 63
    .line 64
    invoke-direct {v0, v1, v2}, Lax/f1/e$b;-><init>(Lax/q7/u;Lax/q7/u;)V

    .line 65
    .line 66
    .line 67
    goto :goto_49

    .line 68
    :cond_43
    new-instance v1, Lax/f1/e$b;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lax/f1/e$b;-><init>(I)V

    .line 71
    .line 72
    .line 73
    move-object v0, v1

    .line 74
    :goto_49
    iget-boolean v1, p0, Lax/f1/o;->f:Z

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lax/f1/e$b;->e(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1}, Lax/f1/e$b;->d(Lax/f1/x$a;)Lax/f1/e;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_53
    new-instance v0, Lax/f1/c0$b;

    .line 85
    .line 86
    invoke-direct {v0}, Lax/f1/c0$b;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lax/f1/c0$b;->a(Lax/f1/x$a;)Lax/f1/x;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    return-object p1
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
