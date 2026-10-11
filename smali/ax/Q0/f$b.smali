.class public final Lax/Q0/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Q0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private c:Landroid/os/Handler;

.field private d:Lax/P0/c;

.field private e:Z


# direct methods
.method public constructor <init>(I)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lax/P0/c;->h:Lax/P0/c;

    iput-object v0, p0, Lax/Q0/f$b;->d:Lax/P0/c;

    .line 4
    iput p1, p0, Lax/Q0/f$b;->a:I

    return-void
.end method

.method private constructor <init>(Lax/Q0/f;)V
    .registers 3

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Lax/Q0/f;->e()I

    move-result v0

    iput v0, p0, Lax/Q0/f$b;->a:I

    .line 7
    invoke-virtual {p1}, Lax/Q0/f;->f()Landroid/media/AudioManager$OnAudioFocusChangeListener;

    move-result-object v0

    iput-object v0, p0, Lax/Q0/f$b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 8
    invoke-virtual {p1}, Lax/Q0/f;->d()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lax/Q0/f$b;->c:Landroid/os/Handler;

    .line 9
    invoke-virtual {p1}, Lax/Q0/f;->b()Lax/P0/c;

    move-result-object v0

    iput-object v0, p0, Lax/Q0/f$b;->d:Lax/P0/c;

    .line 10
    invoke-virtual {p1}, Lax/Q0/f;->g()Z

    move-result p1

    iput-boolean p1, p0, Lax/Q0/f$b;->e:Z

    return-void
.end method

.method synthetic constructor <init>(Lax/Q0/f;Lax/Q0/f$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/Q0/f$b;-><init>(Lax/Q0/f;)V

    return-void
.end method


# virtual methods
.method public a()Lax/Q0/f;
    .registers 7

    .line 1
    iget-object v2, p0, Lax/Q0/f$b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 2
    .line 3
    if-eqz v2, :cond_18

    .line 4
    .line 5
    new-instance v0, Lax/Q0/f;

    .line 6
    .line 7
    iget v1, p0, Lax/Q0/f$b;->a:I

    .line 8
    .line 9
    iget-object v3, p0, Lax/Q0/f$b;->c:Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {v3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v4, p0, Lax/Q0/f$b;->d:Lax/P0/c;

    .line 18
    .line 19
    iget-boolean v5, p0, Lax/Q0/f$b;->e:Z

    .line 20
    .line 21
    invoke-direct/range {v0 .. v5}, Lax/Q0/f;-><init>(ILandroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;Lax/P0/c;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "Can\'t build an AudioFocusRequestCompat instance without a listener"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
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

.method public b(Lax/P0/c;)Lax/Q0/f$b;
    .registers 2

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/Q0/f$b;->d:Lax/P0/c;

    .line 5
    .line 6
    return-object p0
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

.method public c(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;)Lax/Q0/f$b;
    .registers 3

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lax/Q0/f$b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 8
    .line 9
    iput-object p2, p0, Lax/Q0/f$b;->c:Landroid/os/Handler;

    .line 10
    .line 11
    return-object p0
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

.method public d(Z)Lax/Q0/f$b;
    .registers 2

    .line 1
    iput-boolean p1, p0, Lax/Q0/f$b;->e:Z

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
