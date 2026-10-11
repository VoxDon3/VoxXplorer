.class public final Lax/f1/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/f1/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/f1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final b:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lax/q7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method public constructor <init>(I)V
    .registers 4

    .line 1
    new-instance v0, Lax/f1/f;

    invoke-direct {v0, p1}, Lax/f1/f;-><init>(I)V

    new-instance v1, Lax/f1/g;

    invoke-direct {v1, p1}, Lax/f1/g;-><init>(I)V

    invoke-direct {p0, v0, v1}, Lax/f1/e$b;-><init>(Lax/q7/u;Lax/q7/u;)V

    return-void
.end method

.method public constructor <init>(Lax/q7/u;Lax/q7/u;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;",
            "Lax/q7/u<",
            "Landroid/os/HandlerThread;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/f1/e$b;->b:Lax/q7/u;

    .line 4
    iput-object p2, p0, Lax/f1/e$b;->c:Lax/q7/u;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lax/f1/e$b;->d:Z

    return-void
.end method

.method public static synthetic b(I)Landroid/os/HandlerThread;
    .registers 2

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    invoke-static {p0}, Lax/f1/e;->t(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method public static synthetic c(I)Landroid/os/HandlerThread;
    .registers 2

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    invoke-static {p0}, Lax/f1/e;->u(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method private static f(Lax/P0/v;)Z
    .registers 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_8

    .line 7
    .line 8
    return v2

    .line 9
    :cond_8
    const/16 v1, 0x23

    .line 10
    .line 11
    if-ge v0, v1, :cond_16

    .line 12
    .line 13
    iget-object p0, p0, Lax/P0/v;->o:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p0}, Lax/P0/D;->s(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_15

    .line 20
    .line 21
    goto :goto_16

    .line 22
    :cond_15
    return v2

    .line 23
    :cond_16
    :goto_16
    const/4 p0, 0x1

    .line 24
    return p0
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
.end method


# virtual methods
.method public bridge synthetic a(Lax/f1/x$a;)Lax/f1/x;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lax/f1/e$b;->d(Lax/f1/x$a;)Lax/f1/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public d(Lax/f1/x$a;)Lax/f1/e;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lax/f1/x$a;->a:Lax/f1/D;

    .line 2
    .line 3
    iget-object v0, v0, Lax/f1/D;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v3, "createCodec:"

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lax/S0/N;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 27
    .line 28
    .line 29
    move-result-object v4
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_1d} :catch_76

    .line 30
    :try_start_1d
    iget-boolean v0, p0, Lax/f1/e$b;->d:Z

    .line 31
    .line 32
    if-eqz v0, :cond_34

    .line 33
    .line 34
    iget-object v0, p1, Lax/f1/x$a;->c:Lax/P0/v;

    .line 35
    .line 36
    invoke-static {v0}, Lax/f1/e$b;->f(Lax/P0/v;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_34

    .line 41
    .line 42
    new-instance v0, Lax/f1/d0;

    .line 43
    .line 44
    invoke-direct {v0, v4}, Lax/f1/d0;-><init>(Landroid/media/MediaCodec;)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x4

    .line 48
    :goto_2f
    move-object v6, v0

    .line 49
    goto :goto_43

    .line 50
    :catch_31
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    goto :goto_79

    .line 53
    :cond_34
    new-instance v0, Lax/f1/j;

    .line 54
    .line 55
    iget-object v2, p0, Lax/f1/e$b;->c:Lax/q7/u;

    .line 56
    .line 57
    invoke-interface {v2}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Landroid/os/HandlerThread;

    .line 62
    .line 63
    invoke-direct {v0, v4, v2}, Lax/f1/j;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    goto :goto_2f

    .line 68
    :goto_43
    new-instance v3, Lax/f1/e;

    .line 69
    .line 70
    iget-object v0, p0, Lax/f1/e$b;->b:Lax/q7/u;

    .line 71
    .line 72
    invoke-interface {v0}, Lax/q7/u;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v5, v0

    .line 77
    check-cast v5, Landroid/os/HandlerThread;

    .line 78
    .line 79
    iget-object v7, p1, Lax/f1/x$a;->f:Lax/f1/t;

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    invoke-direct/range {v3 .. v8}, Lax/f1/e;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Lax/f1/z;Lax/f1/t;Lax/f1/e$a;)V
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_54} :catch_31

    .line 83
    .line 84
    .line 85
    :try_start_54
    invoke-static {}, Lax/S0/N;->b()V

    .line 86
    .line 87
    .line 88
    iget-object v0, p1, Lax/f1/x$a;->d:Landroid/view/Surface;

    .line 89
    .line 90
    if-nez v0, :cond_6e

    .line 91
    .line 92
    iget-object v1, p1, Lax/f1/x$a;->a:Lax/f1/D;

    .line 93
    .line 94
    iget-boolean v1, v1, Lax/f1/D;->k:Z

    .line 95
    .line 96
    if-eqz v1, :cond_6e

    .line 97
    .line 98
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 99
    .line 100
    const/16 v5, 0x23

    .line 101
    .line 102
    if-lt v1, v5, :cond_6e

    .line 103
    .line 104
    or-int/lit8 v2, v2, 0x8

    .line 105
    .line 106
    goto :goto_6e

    .line 107
    :catch_6a
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    move-object v1, v3

    .line 110
    goto :goto_79

    .line 111
    :cond_6e
    :goto_6e
    iget-object v1, p1, Lax/f1/x$a;->b:Landroid/media/MediaFormat;

    .line 112
    .line 113
    iget-object p1, p1, Lax/f1/x$a;->e:Landroid/media/MediaCrypto;

    .line 114
    .line 115
    invoke-static {v3, v1, v0, p1, v2}, Lax/f1/e;->s(Lax/f1/e;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_75
    .catch Ljava/lang/Exception; {:try_start_54 .. :try_end_75} :catch_6a

    .line 116
    .line 117
    .line 118
    return-object v3

    .line 119
    :catch_76
    move-exception v0

    .line 120
    move-object p1, v0

    .line 121
    move-object v4, v1

    .line 122
    :goto_79
    if-nez v1, :cond_81

    .line 123
    .line 124
    if-eqz v4, :cond_84

    .line 125
    .line 126
    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V

    .line 127
    .line 128
    .line 129
    goto :goto_84

    .line 130
    :cond_81
    invoke-virtual {v1}, Lax/f1/e;->d()V

    .line 131
    .line 132
    .line 133
    :cond_84
    :goto_84
    throw p1
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

.method public e(Z)V
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/f1/e$b;->d:Z

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
