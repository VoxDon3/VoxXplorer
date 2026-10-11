.class public abstract Lax/V4/c;
.super Lax/T4/k;
.source "SourceFile"


# instance fields
.field protected transient c0:Lax/T4/j;


# direct methods
.method protected constructor <init>(Lax/T4/j;Ljava/lang/String;)V
    .registers 4

    if-nez p1, :cond_4

    const/4 v0, 0x0

    goto :goto_8

    .line 1
    :cond_4
    invoke-virtual {p1}, Lax/T4/j;->f()Lax/T4/h;

    move-result-object v0

    :goto_8
    invoke-direct {p0, p2, v0}, Lax/T4/k;-><init>(Ljava/lang/String;Lax/T4/h;)V

    .line 2
    iput-object p1, p0, Lax/V4/c;->c0:Lax/T4/j;

    return-void
.end method

.method protected constructor <init>(Lax/T4/j;Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 5

    if-nez p1, :cond_4

    const/4 v0, 0x0

    goto :goto_8

    .line 3
    :cond_4
    invoke-virtual {p1}, Lax/T4/j;->f()Lax/T4/h;

    move-result-object v0

    :goto_8
    invoke-direct {p0, p2, v0, p3}, Lax/T4/k;-><init>(Ljava/lang/String;Lax/T4/h;Ljava/lang/Throwable;)V

    .line 4
    iput-object p1, p0, Lax/V4/c;->c0:Lax/T4/j;

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .registers 2

    .line 1
    invoke-super {p0}, Lax/T4/k;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
