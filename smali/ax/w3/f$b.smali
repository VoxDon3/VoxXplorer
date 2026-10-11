.class public Lax/w3/f$b;
.super Lax/p/c;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/w3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field b:Z

.field c:Lax/b4/c;

.field d:I

.field e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lax/b4/c;)V
    .registers 4

    .line 1
    invoke-direct {p0, p2}, Lax/p/c;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lax/w3/f$b;->b:Z

    .line 6
    .line 7
    iput-object p2, p0, Lax/w3/f$b;->c:Lax/b4/c;

    .line 8
    .line 9
    invoke-static {p1}, Lax/u3/B;->t(Landroid/content/Context;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p2, p0, Lax/w3/f$b;->c:Lax/b4/c;

    .line 14
    .line 15
    invoke-virtual {p2}, Lax/b4/c;->getIntrinsicWidth()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/16 v0, 0xa0

    .line 20
    .line 21
    invoke-static {p2, v0, p1}, Lax/w3/f$b;->d(III)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iput p2, p0, Lax/w3/f$b;->e:I

    .line 26
    .line 27
    iget-object p2, p0, Lax/w3/f$b;->c:Lax/b4/c;

    .line 28
    .line 29
    invoke-virtual {p2}, Lax/b4/c;->getIntrinsicHeight()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p2, v0, p1}, Lax/w3/f$b;->d(III)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, Lax/w3/f$b;->d:I

    .line 38
    .line 39
    return-void
    .line 40
    .line 41
.end method

.method private static d(III)I
    .registers 3

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    if-eqz p2, :cond_d

    .line 4
    .line 5
    if-ne p1, p2, :cond_7

    .line 6
    .line 7
    goto :goto_d

    .line 8
    :cond_7
    mul-int p0, p0, p2

    .line 9
    .line 10
    shr-int/lit8 p2, p1, 0x1

    .line 11
    .line 12
    add-int/2addr p0, p2

    .line 13
    div-int/2addr p0, p1

    .line 14
    :cond_d
    :goto_d
    return p0
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


# virtual methods
.method public c()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/w3/f$b;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lax/w3/f$b;->c:Lax/b4/c;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/b4/c;->i()V

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
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/w3/f$b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    goto :goto_36

    .line 6
    :cond_5
    :try_start_5
    invoke-super {p0, p1}, Lax/p/c;->draw(Landroid/graphics/Canvas;)V
    :try_end_8
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_8} :catch_20
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_8} :catch_9

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_9
    move-exception p1

    .line 11
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "GifDrawable FrameLoader Too large"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 30
    .line 31
    .line 32
    goto :goto_36

    .line 33
    :catch_20
    move-exception p1

    .line 34
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "GifDrawable FrameLoader Null"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 53
    .line 54
    .line 55
    :goto_36
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public getIntrinsicHeight()I
    .registers 2

    .line 1
    iget v0, p0, Lax/w3/f$b;->d:I

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

.method public getIntrinsicWidth()I
    .registers 2

    .line 1
    iget v0, p0, Lax/w3/f$b;->e:I

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

.method public isRunning()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w3/f$b;->c:Lax/b4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/b4/c;->isRunning()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public start()V
    .registers 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/w3/f$b;->c:Lax/b4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/b4/c;->start()V
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_5} :catch_5

    .line 4
    .line 5
    .line 6
    :catch_5
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
.end method

.method public stop()V
    .registers 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lax/w3/f$b;->c:Lax/b4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/b4/c;->stop()V
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_5} :catch_5

    .line 4
    .line 5
    .line 6
    :catch_5
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
.end method
