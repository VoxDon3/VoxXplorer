.class public Lax/R3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/R3/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/R3/d$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lax/R3/d$a;


# direct methods
.method public constructor <init>(Lax/R3/d$a;I)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lax/R3/d;->a:I

    .line 5
    .line 6
    iput-object p1, p0, Lax/R3/d;->b:Lax/R3/d$a;

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


# virtual methods
.method public g()Lax/R3/a;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/R3/d;->b:Lax/R3/d$a;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/R3/d$a;->a()Ljava/io/File;

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
    return-object v1

    .line 11
    :cond_a
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1d

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1c

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1d

    .line 28
    .line 29
    :cond_1c
    return-object v1

    .line 30
    :cond_1d
    iget v1, p0, Lax/R3/d;->a:I

    .line 31
    .line 32
    invoke-static {v0, v1}, Lax/R3/e;->c(Ljava/io/File;I)Lax/R3/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
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
