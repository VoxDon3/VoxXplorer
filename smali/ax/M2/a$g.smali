.class final Lax/M2/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/M2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final c0:Lax/v7/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/v7/e<",
            "+TV;>;"
        }
    .end annotation
.end field

.field final q:Lax/M2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/M2/a<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/M2/a;Lax/v7/e;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M2/a<",
            "TV;>;",
            "Lax/v7/e<",
            "+TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/M2/a$g;->q:Lax/M2/a;

    .line 5
    .line 6
    iput-object p2, p0, Lax/M2/a$g;->c0:Lax/v7/e;

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
.method public run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/M2/a$g;->q:Lax/M2/a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/M2/a;->q:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq v0, p0, :cond_7

    .line 6
    .line 7
    goto :goto_1c

    .line 8
    :cond_7
    iget-object v0, p0, Lax/M2/a$g;->c0:Lax/v7/e;

    .line 9
    .line 10
    invoke-static {v0}, Lax/M2/a;->j(Lax/v7/e;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lax/M2/a;->g0:Lax/M2/a$b;

    .line 15
    .line 16
    iget-object v2, p0, Lax/M2/a$g;->q:Lax/M2/a;

    .line 17
    .line 18
    invoke-virtual {v1, v2, p0, v0}, Lax/M2/a$b;->b(Lax/M2/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1c

    .line 23
    .line 24
    iget-object v0, p0, Lax/M2/a$g;->q:Lax/M2/a;

    .line 25
    .line 26
    invoke-static {v0}, Lax/M2/a;->f(Lax/M2/a;)V

    .line 27
    .line 28
    .line 29
    :cond_1c
    :goto_1c
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
