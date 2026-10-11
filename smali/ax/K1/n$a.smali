.class final Lax/K1/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/K1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:Lax/K1/t;

.field public final b:Lax/K1/w;

.field public final c:Lax/q1/U;

.field public final d:Lax/q1/V;

.field public e:I


# direct methods
.method public constructor <init>(Lax/K1/t;Lax/K1/w;Lax/q1/U;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/K1/n$a;->a:Lax/K1/t;

    .line 5
    .line 6
    iput-object p2, p0, Lax/K1/n$a;->b:Lax/K1/w;

    .line 7
    .line 8
    iput-object p3, p0, Lax/K1/n$a;->c:Lax/q1/U;

    .line 9
    .line 10
    iget-object p1, p1, Lax/K1/t;->g:Lax/P0/v;

    .line 11
    .line 12
    iget-object p1, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 13
    .line 14
    const-string p2, "audio/true-hd"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1b

    .line 21
    .line 22
    new-instance p1, Lax/q1/V;

    .line 23
    .line 24
    invoke-direct {p1}, Lax/q1/V;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    const/4 p1, 0x0

    .line 29
    :goto_1c
    iput-object p1, p0, Lax/K1/n$a;->d:Lax/q1/V;

    .line 30
    .line 31
    return-void
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
