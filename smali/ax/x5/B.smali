.class public final synthetic Lax/x5/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x5/M$b;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Lax/x5/M;->v(Landroid/database/Cursor;)[B

    move-result-object p1

    return-object p1
.end method
