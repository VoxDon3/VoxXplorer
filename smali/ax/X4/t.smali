.class public Lax/X4/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lax/X4/q;

.field private static final b:Lax/X4/r;

.field private static final c:Lax/X4/s;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/X4/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/X4/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/X4/t;->a:Lax/X4/q;

    .line 7
    .line 8
    new-instance v0, Lax/X4/r;

    .line 9
    .line 10
    invoke-direct {v0}, Lax/X4/r;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lax/X4/t;->b:Lax/X4/r;

    .line 14
    .line 15
    new-instance v0, Lax/X4/s;

    .line 16
    .line 17
    invoke-direct {v0}, Lax/X4/s;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lax/X4/t;->c:Lax/X4/s;

    .line 21
    .line 22
    return-void
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
.end method

.method public static a(Ljava/lang/CharSequence;)Ljava/math/BigInteger;
    .registers 5

    .line 1
    sget-object v0, Lax/X4/t;->c:Lax/X4/s;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-virtual {v0, p0, v3, v1, v2}, Lax/X4/s;->c(Ljava/lang/CharSequence;III)Ljava/math/BigInteger;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
