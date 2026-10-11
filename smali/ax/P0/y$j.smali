.class public final Lax/P0/y$j;
.super Lax/P0/y$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method private constructor <init>(Lax/P0/y$k$a;)V
    .registers 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lax/P0/y$k;-><init>(Lax/P0/y$k$a;Lax/P0/y$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$k$a;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$j;-><init>(Lax/P0/y$k$a;)V

    return-void
.end method
