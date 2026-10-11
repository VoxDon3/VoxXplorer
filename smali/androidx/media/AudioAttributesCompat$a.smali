.class public Landroidx/media/AudioAttributesCompat$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media/AudioAttributesCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final a:Landroidx/media/AudioAttributesImpl$a;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Landroidx/media/AudioAttributesCompat;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_f

    .line 7
    .line 8
    new-instance v0, Landroidx/media/AudioAttributesImplBase$a;

    .line 9
    .line 10
    invoke-direct {v0}, Landroidx/media/AudioAttributesImplBase$a;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/media/AudioAttributesCompat$a;->a:Landroidx/media/AudioAttributesImpl$a;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_f
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x1a

    .line 19
    .line 20
    if-lt v0, v1, :cond_1d

    .line 21
    .line 22
    new-instance v0, Landroidx/media/AudioAttributesImplApi26$a;

    .line 23
    .line 24
    invoke-direct {v0}, Landroidx/media/AudioAttributesImplApi26$a;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroidx/media/AudioAttributesCompat$a;->a:Landroidx/media/AudioAttributesImpl$a;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    new-instance v0, Landroidx/media/AudioAttributesImplApi21$a;

    .line 31
    .line 32
    invoke-direct {v0}, Landroidx/media/AudioAttributesImplApi21$a;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/media/AudioAttributesCompat$a;->a:Landroidx/media/AudioAttributesImpl$a;

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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method


# virtual methods
.method public a()Landroidx/media/AudioAttributesCompat;
    .registers 3

    .line 1
    new-instance v0, Landroidx/media/AudioAttributesCompat;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media/AudioAttributesCompat$a;->a:Landroidx/media/AudioAttributesImpl$a;

    .line 4
    .line 5
    invoke-interface {v1}, Landroidx/media/AudioAttributesImpl$a;->g()Landroidx/media/AudioAttributesImpl;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroidx/media/AudioAttributesCompat;-><init>(Landroidx/media/AudioAttributesImpl;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public b(I)Landroidx/media/AudioAttributesCompat$a;
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media/AudioAttributesCompat$a;->a:Landroidx/media/AudioAttributesImpl$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media/AudioAttributesImpl$a;->h(I)Landroidx/media/AudioAttributesImpl$a;

    .line 4
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

.method public c(I)Landroidx/media/AudioAttributesCompat$a;
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/media/AudioAttributesCompat$a;->a:Landroidx/media/AudioAttributesImpl$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/media/AudioAttributesImpl$a;->i(I)Landroidx/media/AudioAttributesImpl$a;

    .line 4
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
