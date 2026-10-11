.class public final Lax/f1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/f1/t$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroid/media/MediaCodec;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lax/f1/t$b;

.field private c:Landroid/media/LoudnessCodecController;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    sget-object v0, Lax/f1/t$b;->a:Lax/f1/t$b;

    invoke-direct {p0, v0}, Lax/f1/t;-><init>(Lax/f1/t$b;)V

    return-void
.end method

.method public constructor <init>(Lax/f1/t$b;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lax/f1/t;->a:Ljava/util/HashSet;

    .line 4
    iput-object p1, p0, Lax/f1/t;->b:Lax/f1/t$b;

    return-void
.end method

.method static synthetic a(Lax/f1/t;)Lax/f1/t$b;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/f1/t;->b:Lax/f1/t$b;

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


# virtual methods
.method public b(Landroid/media/MediaCodec;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/t;->c:Landroid/media/LoudnessCodecController;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    invoke-static {v0, p1}, Lax/f1/p;->a(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    return-void

    .line 12
    :cond_b
    iget-object v0, p0, Lax/f1/t;->a:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Lax/S0/a;->g(Z)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
.end method

.method public c()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/t;->a:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/f1/t;->c:Landroid/media/LoudnessCodecController;

    .line 7
    .line 8
    if-eqz v0, :cond_c

    .line 9
    .line 10
    invoke-static {v0}, Lax/f1/r;->a(Landroid/media/LoudnessCodecController;)V

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
.end method

.method public d(Landroid/media/MediaCodec;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/t;->a:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Lax/f1/t;->c:Landroid/media/LoudnessCodecController;

    .line 10
    .line 11
    if-eqz v0, :cond_f

    .line 12
    .line 13
    invoke-static {v0, p1}, Lax/f1/q;->a(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public e(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/f1/t;->c:Landroid/media/LoudnessCodecController;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    invoke-static {v0}, Lax/f1/r;->a(Landroid/media/LoudnessCodecController;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lax/f1/t;->c:Landroid/media/LoudnessCodecController;

    .line 10
    .line 11
    :cond_a
    invoke-static {}, Lax/v7/f;->a()Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lax/f1/t$a;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lax/f1/t$a;-><init>(Lax/f1/t;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lax/f1/s;->a(ILjava/util/concurrent/Executor;Landroid/media/LoudnessCodecController$OnLoudnessCodecUpdateListener;)Landroid/media/LoudnessCodecController;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lax/f1/t;->c:Landroid/media/LoudnessCodecController;

    .line 25
    .line 26
    iget-object v0, p0, Lax/f1/t;->a:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1f
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_35

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroid/media/MediaCodec;

    .line 43
    .line 44
    invoke-static {p1, v1}, Lax/f1/p;->a(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1f

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 51
    .line 52
    .line 53
    goto :goto_1f

    .line 54
    :cond_35
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
