.class public Lax/x3/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/x3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lax/Q2/f;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/x3/f$a;->a:Lax/Q2/f;

    .line 5
    .line 6
    iput-object p3, p0, Lax/x3/f$a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Lax/Q2/f;->H0:Lax/Q2/f;

    .line 9
    .line 10
    if-ne p2, v0, :cond_23

    .line 11
    .line 12
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    if-ne p3, p2, :cond_19

    .line 15
    .line 16
    const p2, 0x7f13021f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lax/x3/f$a;->c:Ljava/lang/String;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    const p2, 0x7f130220

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lax/x3/f$a;->c:Ljava/lang/String;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    invoke-virtual {p2, p1}, Lax/Q2/f;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lax/x3/f$a;->c:Ljava/lang/String;

    .line 41
    .line 42
    return-void
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
